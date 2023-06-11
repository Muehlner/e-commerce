package br.com.cursomicroservicos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("FUNCIONANDO");
    }

}
