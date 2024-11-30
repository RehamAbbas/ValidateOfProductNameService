package com.example.ValidateService.Controller;
import com.example.ValidateService.Model.Request;
import com.example.ValidateService.Model.Response;
import com.example.ValidateService.Service.ValidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/validate")
public class ValidateController {

    private final ValidateService validateService;

    @Autowired
    public ValidateController(ValidateService validateService) {
        this.validateService = validateService;
    }

    @PostMapping("/name")
    public Response validateName(@RequestBody Request request) {
        return validateService.validateName(request);
    }



}
