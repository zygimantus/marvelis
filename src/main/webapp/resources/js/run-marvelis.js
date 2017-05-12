///////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Defines the javascript files that need to be loaded and their dependencies.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////

require.config({
    paths: {
        angular: '../bower_components/angular/angular',
        ngAnimate: '../bower_components/angular-animate/angular-animate',
        ngAria: '../bower_components/angular-aria/angular-aria',
        ngMessages: '../bower_components/angular-messages/angular-messages',
        ngMaterial: '../bower_components/angular-material/angular-material',
        datatables: 'angular-datatables.min',
        csrfInterceptor: '../bower_components/spring-security-csrf-token-interceptor/dist/spring-security-csrf-token-interceptor.min',
        lodash: "../bower_components/lodash/dist/lodash",
        // jQuery: "./datetimepicker/jquery", // needed only by the date time picker
        // datetimepicker: './datetimepicker/jquery.datetimepicker',
        // editableTableWidgets: '../public/js/editable-table-widgets',
        frontendServices: 'frontend-services',
        marvelisApp: "marvelis-app"
    },
    shim: {
    //     jQuery: {
    //         exports: "jQuery"
    //     },
        angular: {
            exports: "angular"
        },
        lodash: {
            exports: '_'
        },
        ngAnimate: {
            deps: ['angular']
        },
        ngAria: {
            deps: ['angular']
        },
        datatables: {
            deps: ['angular']
        },
        csrfInterceptor: {
            deps: ['angular']
        },
    //     datetimepicker: {
    //         deps: ['jQuery']
    //     },
        ngMessages: {
            deps: ['angular']
        },
        ngMaterial: {
             deps: ['angular', 'ngAnimate', 'ngAria']
        },
    //     editableTableWidgets: {
    //         deps: ['angular', 'lodash', 'datetimepicker', 'jQuery']
    //     },
        frontendServices: {
            deps: ['angular', 'csrfInterceptor']
        },
        marvelisApp: {
            deps: [ 'angular', 'ngMessages', 'ngMaterial', 'frontendServices', 'datatables']
        }
    }
});

require(['marvelisApp'], function () {

    angular.bootstrap(document.getElementById('marvelisApp'), ['marvelisApp']);

});
