package com.sideproject.defaultboard.routecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardRouteController {

    @GetMapping(value = "/editor")
    public ModelAndView editorView(ModelAndView mav) {
        mav.setViewName("editor.html");
        return mav;
    }

    @GetMapping(value = "/")
    public ModelAndView rootView(ModelAndView mav) {
        mav.setViewName("index.html");
        return mav;
    }
}
