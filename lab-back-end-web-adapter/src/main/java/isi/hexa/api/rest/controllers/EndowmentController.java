package isi.hexa.api.rest.controllers;

import com.isi.hexa.core.models.Endowment;
import com.isi.hexa.core.models.User;
import com.isi.hexa.core.port.in.endowment.DeleteEndowmentUseCase;
import com.isi.hexa.core.port.in.endowment.LoadAllEndowmentsUseCase;
import com.isi.hexa.core.port.in.endowment.RegisterEndowmentUseCase;
import com.isi.hexa.core.port.in.user.LoadAllUsersUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/endowment")

public class EndowmentController {

    private LoadAllEndowmentsUseCase loadAllEndowmentsUseCase;
    private RegisterEndowmentUseCase registerEndowmentUseCase;

    private DeleteEndowmentUseCase deleteEndowmentUseCase;

    @Autowired
    public EndowmentController(DeleteEndowmentUseCase deleteEndowmentUseCase,LoadAllEndowmentsUseCase loadAllEndowmentsUseCase , RegisterEndowmentUseCase registerEndowmentUseCase) {
        this.loadAllEndowmentsUseCase = loadAllEndowmentsUseCase;
        this.registerEndowmentUseCase = registerEndowmentUseCase;
        this.deleteEndowmentUseCase = deleteEndowmentUseCase;
    }

    @GetMapping("/")
    public List<Endowment> getAllUsers(){
        return loadAllEndowmentsUseCase.getAllEndowments();
    }


    @PostMapping("/addendowment")
    public Endowment addendowment(@RequestBody Endowment en){
        return registerEndowmentUseCase.save(en);
    }

    @DeleteMapping("/{id}")
    public void deleteEndowment(@PathVariable(name = "id") Long id) {
        deleteEndowmentUseCase.deleteById(id);
    }



}
