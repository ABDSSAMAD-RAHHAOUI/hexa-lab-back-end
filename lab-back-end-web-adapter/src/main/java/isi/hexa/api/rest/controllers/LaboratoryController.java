package isi.hexa.api.rest.controllers;

import com.isi.hexa.core.models.Establishment;
import com.isi.hexa.core.models.Laboratory;
import com.isi.hexa.core.models.User;
import com.isi.hexa.core.port.in.establishment.DeleteEstablishmentUseCase;
import com.isi.hexa.core.port.in.establishment.RegisterEstablishmentUseCase;
import com.isi.hexa.core.port.in.laboratory.DeleteLaboratoryUseCase;
import com.isi.hexa.core.port.in.laboratory.LoadAllLaboratorysUseCase;
import com.isi.hexa.core.port.in.laboratory.RegisterLaboratoryUseCase;
import com.isi.hexa.core.port.in.user.LoadAllUsersUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/laboratory")

public class LaboratoryController {

    private LoadAllLaboratorysUseCase loadAllLaboratorysUseCase;
    private RegisterLaboratoryUseCase registerLaboratoryUseCase;

    private DeleteLaboratoryUseCase deleteLaboratoryUseCase;

    @Autowired
    public LaboratoryController(LoadAllLaboratorysUseCase loadAllLaboratorysUseCase,RegisterLaboratoryUseCase registerLaboratoryUseCase,DeleteLaboratoryUseCase deleteLaboratoryUseCase) {
        this.loadAllLaboratorysUseCase = loadAllLaboratorysUseCase;
        this.registerLaboratoryUseCase = registerLaboratoryUseCase;
        this.deleteLaboratoryUseCase = deleteLaboratoryUseCase;
    }

    @GetMapping("/")
    public List<Laboratory> getAllLaboratorys(){
        return loadAllLaboratorysUseCase.getAllLaboratorys();
    }



    @PostMapping("/add")
    public Laboratory addLaboratory(@RequestBody Laboratory laboratory){
        return registerLaboratoryUseCase.save(laboratory);
    }


    @DeleteMapping("{id}")
    public void deleteLaboratory(@PathVariable(name = "id") Long id) {
        deleteLaboratoryUseCase.deleteById(id);
    }







}
