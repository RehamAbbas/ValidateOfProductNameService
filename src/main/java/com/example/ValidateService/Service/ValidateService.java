package com.example.ValidateService.Service;

import com.example.ValidateService.Model.Request;
import com.example.ValidateService.Model.Response;
import com.example.ValidateService.Repository.ValidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ValidateService {

    private final ValidateRepository validateRepository;

    @Value("${server.port}")
    private int serverPort; // Inject server port here

    @Autowired
    public ValidateService(ValidateRepository validateRepository) {
        this.validateRepository = validateRepository;
    }

    public Response validateName(Request request) {
        String name = request.getName();

        boolean isNameUnique = !validateRepository.existsByName(name);

        Response response = new Response();
        response.setPort(serverPort); // Set the port here
        if (isNameUnique) {
            response.setStatus(200);
            response.setMessage("Name is unique.........😍");
        } else {
            response.setStatus(400);
            response.setMessage("Name is already taken...🤔");
        }

        return response;
    }
}
