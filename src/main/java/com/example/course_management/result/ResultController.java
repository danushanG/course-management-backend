package com.example.course_management.result;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/results")
@CrossOrigin(origins = "http://localhost:3000")
public class ResultController {
    private final ResultRepository repo;

    public ResultController(ResultRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Result> all() {
        return repo.findAll();
    }

    @PostMapping
    public Result create(@RequestBody Result result) {
        return repo.save(result);
    }

    // PUT update
    @PutMapping("/{id}")
    public Result update(@PathVariable Long id, @RequestBody Result r) {
        r.setId(id);
        return repo.save(r);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
