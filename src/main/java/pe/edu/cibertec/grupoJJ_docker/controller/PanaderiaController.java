package pe.edu.cibertec.grupoJJ_docker.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/panaderia")
public class PanaderiaController {

    @GetMapping("/mensaje")
    public String mensaje(){
        log.info("API REST panaderia");
        return  "Bienvenidos a La Panaderia de Juan";
    }
}
