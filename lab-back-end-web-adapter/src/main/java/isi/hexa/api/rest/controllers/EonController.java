package isi.hexa.api.rest.controllers;

import com.isi.hexa.core.models.Endowment;
import com.isi.hexa.core.models.Eon;
import com.isi.hexa.core.port.in.endowment.LoadAllEndowmentsUseCase;
import com.isi.hexa.core.port.in.eon.LoadAllEonsUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")

public class EonController {

    private LoadAllEonsUseCase loadAllEonsUseCase;

    @Autowired
    public EonController(LoadAllEonsUseCase loadAllEndowmentsUseCase) {
        this.loadAllEonsUseCase = loadAllEonsUseCase;
    }

    @GetMapping("/eon")
    public List<Eon> getAllUsers(){
        return loadAllEonsUseCase.getAllEons();
    }






}
