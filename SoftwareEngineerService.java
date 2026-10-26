package com.SoftwareApplication.SA;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SoftwareEngineerService {

    private final List<SoftwareEngineer> engineers = List.of(
            new SoftwareEngineer(1, "Sreekar", "Java, Spring Boot"),
            new SoftwareEngineer(2, "Rahul", "Python, Machine Learning"),
            new SoftwareEngineer(3, "Priya", "JavaScript, React")
    );

    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return engineers;
    }

    public SoftwareEngineer getSoftwareEngineerById(Integer id) {
        return engineers.stream()
                .filter(engineer -> engineer.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
