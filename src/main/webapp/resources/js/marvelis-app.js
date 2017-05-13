angular.module("marvelisApp", ['ngMaterial', 'datatables', 'frontendServices', 'spring-security-csrf-token-interceptor'])
  .service("worldsService", [MyDataService])
  // .controller("demoController", ["worldsService", DemoController])
  .controller('MarvelController', function($scope, $templateRequest, $sce, $compile, $http, UserService) {
    // Make sure that no bad URLs are fetched. You can omit this if your template URL is
    // not dynamic.
    var templateUrl = $sce.getTrustedResourceUrl('templates/tabs.html');

    $templateRequest(templateUrl).then(function(template) {
      // template is the HTML template as a string

      // Let's put it into an HTML element and parse any directives and expressions
      // in the code. (Note: This is just an example, modifying the DOM from within
      // a controller is considered bad style.)
      $compile($("#tabsContent").html(template).contents())($scope);

      this.character = {
        id: ''
      };

      // TODO validation of keys...
      $scope.save = function() {
        $http.get('/api/marvel/settings/' + $scope.key.public + '/' + $scope.key.private).then(function(response) {
          alert(response);
        });
      };

      $scope.search = function(characterId) {
        $http.get('/api/marvel/characters/' + characterId).then(function(response) {
          var str = JSON.stringify(response.data, undefined, 4);
          $scope.data = $sce.trustAsHtml(syntaxHighlight(str));
        });
      };

    }, function() {
      // An error has occurred
    });

    $scope.logout = function() {
      UserService.logout();
    }

  })
  .controller('CharactersController', function($scope, $http, DTOptionsBuilder, DTColumnBuilder) {
    var vm = this;
    vm.message = '';
    vm.someClickHandler = someClickHandler;
    // FIXME still try to use csrf later...
    vm.dtOptions = DTOptionsBuilder.newOptions()
      .withOption('ajax', {
        url: '/api/marvel/characters',
        type: 'post',
        data: function(data) {
          return JSON.stringify(data);
        },
        dataType: "json",
        contentType: 'application/json;charset=UTF-8'
      })
      .withDataProp(function(json) {
        json.recordsTotal = json.response.total;
        json.recordsFiltered = json.response.total;
        return json.response.characters;
      })
      .withOption('processing', true)
      .withOption('serverSide', true)
      .withOption('saveState', true)
      .withPaginationType('full_numbers')
      .withOption('rowCallback', rowCallback)
      .withOption('order', [2, 'asc'])
      .withDisplayLength(10);
    vm.dtColumns = [
      DTColumnBuilder.newColumn(null).withClass('details-control').withOption('defaultContent', ''),
      DTColumnBuilder.newColumn('id').withTitle('ID'),
      DTColumnBuilder.newColumn('name').withTitle('Name'),
      DTColumnBuilder.newColumn('description').withTitle('Description').withOption('sWidth', '50%'),
      DTColumnBuilder.newColumn('modified').withTitle('Modified')
    ];

    vm.dtInstance = {};
    vm.dtInstanceCallback = dtInstanceCallback;

    function dtInstanceCallback(dtInstance) {
      vm.dtInstance = dtInstance;
    }

    // Add event listener for opening and closing details
    $('#dataTableChar').on('click', 'td.details-control', function() {
      var tr = $(this).closest('tr');
      var row = vm.dtInstance.DataTable.row(tr);

      if (row.child.isShown()) {
        // This row is already open - close it
        row.child.hide();
        tr.removeClass('shown');
      } else {
        // Open this row
        fillRow(row);
        // row.child(format(row.data())).show();
        tr.addClass('shown');
      }
      // modification after creation

    });

    function fillRow(row) {
      function createTable(data) {
        var table = $('<table class="table"></table>');
        $.each(data, function(i, list) {

          /* filling table */
          var $tr = $('<tr id="' + i + '">');
          $tr.append($('<td>').text(i));

          if (typeof list == 'string' || typeof list == 'number') {
            $tr.append($('<td>').text(list));
          } else {
            $tr.append($('<td>').append(createTable(list)));
          }
          table.append($tr);
        });
        return table;
      }

      $http.get('/api/marvel/characters/' + row.data().id).then(function(data) {
        row.child(createTable(data.data.response)).show();
      });
    }

    function someClickHandler(info) {
      vm.message = info.id + ' - ' + info.name;
    }

    function rowCallback(nRow, aData, iDisplayIndex, iDisplayIndexFull) {
      $('td', nRow).unbind('click');
      $('td', nRow).bind('click', function() {
        $scope.$apply(function() {
          vm.someClickHandler(aData);
        });
      });
      return nRow;
    }
  })
  .controller('ComicsController', function($scope, $http, DTOptionsBuilder, DTColumnBuilder, ComicsService) {
    var vm = this;
    vm.message = '';
    vm.someClickHandler = someClickHandler;
    // FIXME still try to use csrf later...
    vm.dtOptions = DTOptionsBuilder.newOptions()
      .withOption('ajax', {
        url: '/api/marvel/comics',
        type: 'post',
        data: function(data) {
          return JSON.stringify(data);
        },
        dataType: "json",
        contentType: 'application/json;charset=UTF-8'
      })
      .withDataProp(function(json) {
        json.recordsTotal = json.response.total;
        json.recordsFiltered = json.response.total;
        return json.response.comics;
      })
      .withOption('processing', true)
      .withOption('serverSide', true)
      .withOption('saveState', true)
      .withPaginationType('full_numbers')
      .withOption('rowCallback', rowCallback)
      .withOption('order', [2, 'asc'])
      .withDisplayLength(10);
    vm.dtColumns = [
      DTColumnBuilder.newColumn(null).withClass('details-control').withOption('defaultContent', ''),
      DTColumnBuilder.newColumn('id').withTitle('ID'),
      DTColumnBuilder.newColumn('title').withTitle('Title'),
      DTColumnBuilder.newColumn('description').withTitle('Description').withOption('sWidth', '50%'),
      DTColumnBuilder.newColumn('modified').withTitle('Modified'),
      DTColumnBuilder.newColumn('format').withTitle('Format')
    ];

    vm.dtInstance = {};
    vm.dtInstanceCallback = dtInstanceCallback;

    function dtInstanceCallback(dtInstance) {
      vm.dtInstance = dtInstance;
    }

    $('#dataTableComic').on('click', 'td.details-control', function() {
      var tr = $(this).closest('tr');
      var row = vm.dtInstance.DataTable.row(tr);

      if (row.child.isShown()) {
        // This row is already open - close it
        row.child.hide();
        tr.removeClass('shown');
      } else {
        // Open this row
        fillRow(row);
        // row.child(format(row.data())).show();
        tr.addClass('shown');
      }
      // modification after creation
      var imagesTable = $('#images').children()[1].firstChild;


    });

    function fillRow(row) {
      function createTable(data) {
        var table = $('<table class="table"></table>');
        $.each(data, function(i, list) {

          /* filling table */
          var $tr = $('<tr id="' + i + '">');
          $tr.append($('<td>').text(i));

          if (typeof list == 'string' || typeof list == 'number') {
            $tr.append($('<td>').text(list));
          } else {
            $tr.append($('<td>').append(createTable(list)));
          }
          table.append($tr);
        });
        return table;
      }

      $http.get('/api/marvel/comics/' + row.data().id).then(function(data) {
        row.child(createTable(data.data.response)).show();
      });
    }

    function someClickHandler(info) {
      vm.message = info.id + ' - ' + info.name;
    }

    function rowCallback(nRow, aData, iDisplayIndex, iDisplayIndexFull) {
      $('td', nRow).unbind('click');
      $('td', nRow).bind('click', function() {
        $scope.$apply(function() {
          vm.someClickHandler(aData);
        });
      });
      return nRow;
    }
  })
  .controller('SeriesController', function($scope, $http, DTOptionsBuilder, DTColumnBuilder, ComicsService) {
    var vm = this;
    vm.message = '';
    vm.someClickHandler = someClickHandler;
    // FIXME still try to use csrf later...
    vm.dtOptions = DTOptionsBuilder.newOptions()
      .withOption('ajax', {
        url: '/api/marvel/series',
        type: 'post',
        data: function(data) {
          return JSON.stringify(data);
        },
        dataType: "json",
        contentType: 'application/json;charset=UTF-8'
      })
      .withDataProp(function(json) {
        json.recordsTotal = json.response.total;
        json.recordsFiltered = json.response.total;
        return json.response.series;
      })
      .withOption('processing', true)
      .withOption('serverSide', true)
      .withOption('saveState', true)
      .withPaginationType('full_numbers')
      .withOption('rowCallback', rowCallback)
      .withOption('order', [2, 'asc'])
      .withDisplayLength(10);
    vm.dtColumns = [
      DTColumnBuilder.newColumn(null).withClass('details-control').withOption('defaultContent', ''),
      DTColumnBuilder.newColumn('id').withTitle('ID'),
      DTColumnBuilder.newColumn('title').withTitle('Title'),
      DTColumnBuilder.newColumn('description').withTitle('Description').withOption('sWidth', '50%'),
      DTColumnBuilder.newColumn('modified').withTitle('Modified'),
      // DTColumnBuilder.newColumn('type').withTitle('Type')
    ];

    vm.dtInstance = {};
    vm.dtInstanceCallback = dtInstanceCallback;

    function dtInstanceCallback(dtInstance) {
      vm.dtInstance = dtInstance;
    }

    $('#dataTableComic').on('click', 'td.details-control', function() {
      var tr = $(this).closest('tr');
      var row = vm.dtInstance.DataTable.row(tr);

      if (row.child.isShown()) {
        // This row is already open - close it
        row.child.hide();
        tr.removeClass('shown');
      } else {
        // Open this row
        fillRow(row);
        // row.child(format(row.data())).show();
        tr.addClass('shown');
      }
      // modification after creation
      var imagesTable = $('#images').children()[1].firstChild;


    });

    function fillRow(row) {
      function createTable(data) {
        var table = $('<table class="table"></table>');
        $.each(data, function(i, list) {

          /* filling table */
          var $tr = $('<tr id="' + i + '">');
          $tr.append($('<td>').text(i));

          if (typeof list == 'string' || typeof list == 'number') {
            $tr.append($('<td>').text(list));
          } else {
            $tr.append($('<td>').append(createTable(list)));
          }
          table.append($tr);
        });
        return table;
      }

      $http.get('/api/marvel/series/' + row.data().id).then(function(data) {
        row.child(createTable(data.data.response)).show();
      });
    }

    function someClickHandler(info) {
      vm.message = info.id + ' - ' + info.name;
    }

    function rowCallback(nRow, aData, iDisplayIndex, iDisplayIndexFull) {
      $('td', nRow).unbind('click');
      $('td', nRow).bind('click', function() {
        $scope.$apply(function() {
          vm.someClickHandler(aData);
        });
      });
      return nRow;
    }
  })
  .config(function($mdThemingProvider) {
    $mdThemingProvider.theme('default')
      .primaryPalette('brown')
      .accentPalette('red');
    // .dark();
    console.log('configuring application');
  })
  .run(["$rootScope", "$window", startup]);

  $(document).ready(function() {
      // Setup - add a text input to each footer cell
      $('#dataTableComic tfoot th').each( function () {
          var title = $(this).text();
          var value = $(this);
          if (title === "Type") {
            var option = $('<select id="selectType"></select>');
            value.html(option);
            $.getJSON('../api/marvel/series/type', function(data) {
              Object.keys(data).forEach(function(key) {
                option.append('<option value=' + data[key] + '>' + data[key] + '</option>');
              });
            });
          } else if (title === "Details") {
            // Do nothing
          } else {
            $(this).html( '<input type="text" class="inputForSearch" id="search_'+title+'" />' );
          }
      } );

      // DataTable
      var table = $('#dataTableComic').DataTable();

      // Apply the search
      table.columns().every( function () {
          var that = this;

          $( 'input', this.footer() ).on( 'keyup change', function () {
              if ( that.search() !== this.value ) {
                  that
                      .search( this.value )
                      .draw();
              }
          } );
          $( '#selectType', this.footer() ).on( 'change', function () {
              if ( that.search() !== this.value ) {
                  that
                      .search( this.value )
                      .draw();
              }
          } );
      } );
  } );
