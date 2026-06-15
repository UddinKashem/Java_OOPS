package regex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// The provided Employee class
class Employee {
    int id;
    String name;
    int performanceScore;

    public Employee(int id, String name, int performanceScore) {
        this.id = id;
        this.name = name;
        this.performanceScore = performanceScore;
    }

    // Optional: Override toString for better print statements in test cases
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', score=" + performanceScore + '}';
    }
}

public class EmployeeAnalyzer {

    /**
     * Finds employees with the highest performance score and returns them sorted alphabetically by name.
     *
     * @param employees The list of all employees.
     * @return A list of top-performing employees, sorted by name.
     */
    public static List<Employee> findTopPerformers(List<Employee> employees) {
        if (employees == null || employees.isEmpty()) {
            return new ArrayList<>();
        }

        // 1. Find the highest performance score using a stream and mapToInt
        int maxScore = employees.stream()
                .mapToInt(employee -> employee.performanceScore)
                .max()
                .orElse(Integer.MIN_VALUE); // Should not occur if list is not empty

        // 2. Filter employees who have that score and sort them alphabetically by name
        return employees.stream()
                .filter(employee -> employee.performanceScore == maxScore)
                .sorted(Comparator.comparing(employee -> employee.name))
                .collect(Collectors.toList());
    }
}

