package com.example.jpa_example.Controller;


import com.example.jpa_example.Entities.AvaliacaoFisica;
import com.example.jpa_example.Form.AvaliacaoFisicaForm;
import com.example.jpa_example.Service.AvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ( value = "/avaliacaoFisica" )
public class AvalicaoFisicaController {

        @Autowired
        private AvaliacaoFisicaService avaliacaoFisicaService;


        public AvalicaoFisicaController(AvaliacaoFisicaService avaliacaoFisicaService) {
            this.avaliacaoFisicaService = avaliacaoFisicaService;
        }
        @PostMapping( "/save")
        public AvaliacaoFisica save(@RequestBody AvaliacaoFisicaForm avaliacaoFisica) {
            return avaliacaoFisicaService.save(avaliacaoFisica);
        }

        @GetMapping( "/{id}")
        public AvaliacaoFisica findById(@PathVariable Long id) {
            return avaliacaoFisicaService.findById(id);
        }

        @DeleteMapping
        public void deleteById(@PathVariable Long id) {
            avaliacaoFisicaService.deleteById(id);
        }
}
