package isi.hexa.api.rest.controllers;

import com.isi.hexa.core.models.Establishment;
import com.isi.hexa.core.models.Laboratory;
import com.isi.hexa.core.models.User;
import com.isi.hexa.core.port.in.laboratory.LoadAllLaboratorysUseCase;
import com.isi.hexa.core.port.in.user.LoadAllUsersUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")

public class LaboratoryController {

    private LoadAllLaboratorysUseCase loadAllLaboratorysUseCase;

    @Autowired
    public LaboratoryController(LoadAllLaboratorysUseCase loadAllLaboratorysUseCase) {
        this.loadAllLaboratorysUseCase = loadAllLaboratorysUseCase;
    }

    @GetMapping("/laboratory")
    public List<Laboratory> getAllUsers(){
        return loadAllLaboratorysUseCase.getAllLaboratorys();
    }







}
