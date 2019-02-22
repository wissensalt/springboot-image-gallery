package com.wissensalt.rnd.springbootimagegallery.controller;

import com.wissensalt.rnd.springbootimagegallery.dao.IImageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created on 2/22/19.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Controller
public class IndexController {

    @Autowired
    private IImageDAO imageDAO;

    @GetMapping("/")
    public String display(Model p_Model) {
        p_Model.addAttribute("imageData", imageDAO.findAll());
        return "index";
    }
}
