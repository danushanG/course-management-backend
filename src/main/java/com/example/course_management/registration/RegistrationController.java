package com.example.course_management.registration;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/registrations")
@CrossOrigin(origins = "http://localhost:3000")
public class RegistrationController {
    private final RegistrationRepository repo;

    public RegistrationController(RegistrationRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Registration> all() {
        return repo.findAll();
    }

    @PostMapping
    public Registration create(@RequestBody Registration registration) {
        return repo.save(registration);
    }

    // PUT update
    @PutMapping("/{id}")
    public Registration update(@PathVariable Long id, @RequestBody Registration r) {
        r.setId(id);
        return repo.save(r);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
