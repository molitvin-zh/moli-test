package ua.knu.moli.web.controller;

import ua.knu.moli.persistence.entity.StudentEntity;
import ua.knu.moli.persistence.repository.StudentRepository;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("a/rest/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentRepository repository;

    @GetMapping("/{id}")
    public ResponseEntity<StudentEntity> getById(@PathVariable("id") Integer id) {
        return ResponseEntity.of(repository.findById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<StudentEntity>> getAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity<StudentEntity> save(@RequestBody @Valid StudentEntity requestDto) {
        return ResponseEntity.ok(repository.save(requestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
    }
}
