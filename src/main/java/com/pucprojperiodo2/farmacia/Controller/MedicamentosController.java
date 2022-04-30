package com.pucprojperiodo2.farmacia.Controller;

import com.pucprojperiodo2.farmacia.Model.MedicamentosModel;
import com.pucprojperiodo2.farmacia.Repository.MedicamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(value = "/api/medicamentos")
public class MedicamentosController {
    @Autowired
    private MedicamentosRepository repository;

    @PostMapping(value ="/salvar")
    public String salvar(@RequestBody MedicamentosModel medicamentosModel){
        repository.save(medicamentosModel);
        return "medicamentos";
    }


    @GetMapping(value ="/buscar")
    public ResponseEntity<Object> buscar(String chave){
        Optional<MedicamentosModel> getBusca = repository.findById(chave);
        if (getBusca.isEmpty()) {return ResponseEntity.notFound().build();}

        return ResponseEntity.ok(getBusca.get());
    }


}
