package com.springboot.app.controller;


import com.springboot.app.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/coordinador")
public class CoordinadorController {

    private static final String PATH_TEMPLATE = "coordinador/";

    @Autowired
    IProfesorService profesorService;

    @GetMapping("/")
    public String index() {
        return PATH_TEMPLATE + "index_coor";
    }

    @GetMapping("/materia")
    public String materias() {
        return PATH_TEMPLATE + "materias_coor";
    }

    @GetMapping("/profesor")
    public String profesores() {
        return PATH_TEMPLATE + "profesores_coor";
    }


}
