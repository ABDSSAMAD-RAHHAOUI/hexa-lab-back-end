package isi.hexa.api.rest.controllers;

import com.isi.hexa.core.models.User;
import com.isi.hexa.core.port.in.user.LoadAllUsersUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")

public class UserController {

    private LoadAllUsersUseCase loadAllUsersService;

    @Autowired
    public UserController(LoadAllUsersUseCase loadAllUsersService) {
        this.loadAllUsersService = loadAllUsersService;
    }

    @GetMapping("/get")
    public List<User> getAllUsers(){
        System.out.println(loadAllUsersService.getAllUsers());
        return loadAllUsersService.getAllUsers();
    }
    @GetMapping("/hello")
    public ResponseEntity<String> admin(){

        return ResponseEntity.ok("hello from secured endpoint");
    }





}
