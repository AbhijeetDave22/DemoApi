package com.example.demoapi.controller;
import com.example.demoapi.dto.ClassInfoResponse;
import com.example.demoapi.pojos.ClassName;
import com.example.demoapi.service.ClassNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/classes")
public class MyClassController {

    @Autowired
    private ClassNameService classNameService;

    @PostMapping
    public ResponseEntity<ClassName> addClassName(@RequestBody ClassName className) {
        ClassName savedClassName = classNameService.saveClassName(className);
        return new ResponseEntity<>(savedClassName, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ClassInfoResponse>> getAllClassInfo() {
        List<ClassInfoResponse> classInfoResponses = classNameService.getClassInfoResponse();
        return new ResponseEntity<>(classInfoResponses, HttpStatus.OK);
    }
}


