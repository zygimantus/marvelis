package com.zygimantus.marvelis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Zygimantus
 */
@Controller
public class IndexController extends AController<ModelAndView> {

    @Override
    protected void init() {
    }

    @Override
    @RequestMapping(value = {"", "index"})
    protected ModelAndView page() {
        ModelAndView model = new ModelAndView("index");

        return model;
    }

    @ExceptionHandler(Exception.class)
    public final ModelAndView handleAllException(Exception ex) {

        return new ModelAndView("redirect:index");
    }

}
