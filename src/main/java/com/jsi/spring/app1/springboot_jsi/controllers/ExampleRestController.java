package com.jsi.spring.app1.springboot_jsi.controllers;

import com.jsi.spring.app1.springboot_jsi.models.Empleados;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ExampleRestController {

    Empleados empleado1 = new Empleados("Ana", "Villamizar", "Santo domingo", "Secretaria", 20, 12345, 1);

    @RequestMapping(path = "/detalles_info2", method = RequestMethod.GET)

    public Map<String, Object> detalles_info2() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Empleado 1", empleado1);
        return respuesta;
    }
}
