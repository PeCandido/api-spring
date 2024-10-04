package pedro.matheus.avaliacao3_api.controller;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pedro.matheus.avaliacao3_api.conserto.Conserto;
import pedro.matheus.avaliacao3_api.conserto.ConsertoRepository;
import pedro.matheus.avaliacao3_api.conserto.DadosConserto;

@RestController
@RequestMapping("/consertos")
public class ConsertoController {

    @Autowired
    private ConsertoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosConserto conserto) {
        repository.save(new Conserto(conserto));
    }
}
