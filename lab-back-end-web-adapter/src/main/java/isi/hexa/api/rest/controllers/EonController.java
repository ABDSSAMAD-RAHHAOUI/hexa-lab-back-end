package isi.hexa.api.rest.controllers;

import com.isi.hexa.core.models.Endowment;
import com.isi.hexa.core.models.Eon;
import com.isi.hexa.core.port.in.endowment.LoadAllEndowmentsUseCase;
import com.isi.hexa.core.port.in.eon.DeleteEonUseCase;
import com.isi.hexa.core.port.in.eon.LoadAllEonsUseCase;
import com.isi.hexa.core.port.in.eon.RegisterEonUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/eon")

public class EonController {

    private LoadAllEonsUseCase loadAllEonsUseCase;
    private DeleteEonUseCase deleteEonUseCase;
    private RegisterEonUseCase registerEonUseCase;

    @Autowired
    public EonController(LoadAllEonsUseCase loadAllEonsUseCase, DeleteEonUseCase deleteEonUseCase, RegisterEonUseCase registerEonUseCase) {
        this.loadAllEonsUseCase = loadAllEonsUseCase;
        this.deleteEonUseCase = deleteEonUseCase;
        this.registerEonUseCase = registerEonUseCase;
    }

    @GetMapping("/")
    public List<Eon> getAllEon(){
        return loadAllEonsUseCase.getAllEons();
    }

    @PostMapping("/addeon")
    public Eon addEon(@RequestBody Eon eon){
        return registerEonUseCase.save(eon);
    }

    @DeleteMapping("/{id}")
    public void deleteEon(@PathVariable(name = "id") Long id) {
        deleteEonUseCase.deleteById(id);
    }






}
