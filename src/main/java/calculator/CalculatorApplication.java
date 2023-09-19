package calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class CalculatorApplication {

    public static void main(String[] args) {

        SpringApplication.run(CalculatorApplication.class, args);
    }

    @PostMapping("/calc")
    public ResponseEntity<?> Calc(@RequestBody Data request) {
        String task = request.getNum1() + request.getAction() + request.getNum2();
        Map<String, Object> response = new HashMap<>();
        response.put("answer", request.getResult());
        response.put("task", task);
        return ResponseEntity.ok(response);
    }

}
