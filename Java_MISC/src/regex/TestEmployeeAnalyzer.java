package regex;

import java.util.ArrayList;
import java.util.List;

public class TestEmployeeAnalyzer {
    public static void main(String[] args) {
        // --- Test Case 1: Multiple top performers, general scenario ---
        System.out.println("--- Test Case 1: General Scenario with ties ---");
        List<Employee> employees1 = new ArrayList<>();
        employees1.add(new Employee(1, "Alice", 90));
        employees1.add(new Employee(2, "Bob", 85));
        employees1.add(new Employee(3, "Charlie", 95));
        employees1.add(new Employee(4, "David", 95)); // Tie for the max score
        employees1.add(new Employee(5, "Eve", 80));
        employees1.add(new Employee(6, "Frank", 90));

        List<Employee> topPerformers1 = EmployeeAnalyzer.findTopPerformers(employees1);
        System.out.println("Expected output: [Employee{..., name='Charlie', score=95}, Employee{..., name='David', score=95}]");
        System.out.println("Actual output:");
        topPerformers1.forEach(System.out::println);


        // --- Test Case 2: Single employee list ---
        System.out.println("\n--- Test Case 2: Single Employee ---");
        List<Employee> employees2 = new ArrayList<>();
        employees2.add(new Employee(10, "Zoe", 100));

        List<Employee> topPerformers2 = EmployeeAnalyzer.findTopPerformers(employees2);
        System.out.println("Expected output: [Employee{..., name='Zoe', score=100}]");
        System.out.println("Actual output:");
        topPerformers2.forEach(System.out::println);
    }
}
