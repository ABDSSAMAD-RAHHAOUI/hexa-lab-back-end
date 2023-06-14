package isi.hexa.api.rest.controllers;

import com.isi.hexa.core.models.Endowment;
import com.isi.hexa.core.models.Establishment;
import com.isi.hexa.core.models.User;
import com.isi.hexa.core.port.in.establishment.DeleteEstablishmentUseCase;
import com.isi.hexa.core.port.in.establishment.LoadAllEstablishmentsUseCase;
import com.isi.hexa.core.port.in.establishment.RegisterEstablishmentUseCase;
import com.isi.hexa.core.port.in.user.LoadAllUsersUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/establishments")
public class EstablishmentController {

    private LoadAllEstablishmentsUseCase loadAllEstablishmentsUseCase;
    private RegisterEstablishmentUseCase registerEstablishmentUseCase;

    private DeleteEstablishmentUseCase deleteEstablishmentUseCase;

    @Autowired
    public EstablishmentController(LoadAllEstablishmentsUseCase loadAllEstablishmentsUseCase, RegisterEstablishmentUseCase registerEstablishmentUseCase,DeleteEstablishmentUseCase deleteEstablishmentUseCase) {
        this.loadAllEstablishmentsUseCase = loadAllEstablishmentsUseCase;
        this.registerEstablishmentUseCase = registerEstablishmentUseCase;
        this.deleteEstablishmentUseCase = deleteEstablishmentUseCase;
    }

    @GetMapping("/")
    public List<Establishment> getAllEstablishments(){
        return loadAllEstablishmentsUseCase.getAllEstablishments();
    }


    @PostMapping("/add")
    @PreAuthorize("hasRole('ADMIN')")
    public Establishment addEstablishment(@RequestBody Establishment establishment){
        return registerEstablishmentUseCase.save(establishment);
    }


    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteEstablishment(@PathVariable(name = "id") Long id) {
        deleteEstablishmentUseCase.deleteById(id);
    }





}
