package com.example.demoapi.service;


import com.example.demoapi.dto.ClassInfoResponse;
import com.example.demoapi.pojos.ClassName;
import com.example.demoapi.repository.ClassNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClassNameService {

    @Autowired
    private ClassNameRepository classNameRepository;

    public ClassName saveClassName(ClassName className) {
        return classNameRepository.save(className);
    }

    public List<ClassInfoResponse> getClassInfoResponse() {
        List<ClassName> classNames = classNameRepository.findAll();
        return classNames.stream()
                .collect(Collectors.groupingBy(ClassName::getClasses, Collectors.toList()))
                .entrySet().stream()
                .map(entry -> new ClassInfoResponse(entry.getKey(), entry.getValue().stream().map(ClassName::getNames).collect(Collectors.toList()), entry.getValue().size()))
                .collect(Collectors.toList());
    }
}
