package com.example.assignment1_calculator;
import java.util.List;
import java.util.ArrayList;


public class History {
    List<String> calculationResults;

    public List<String> getCalculationResults() {
        return calculationResults;
    }

    public History(){
        calculationResults = new ArrayList<>();
    }

    public void addHistory(String results){
        calculationResults.add(results);
    }


    public void clearHistory(){
        calculationResults.clear();
    }
}

// Calculations.java
//import java.util.ArrayList;
//        import java.util.List;
//
//public class Calculations {
//    private List<String> calculationResults;
//
//    public Calculations() {
//        calculationResults = new ArrayList<>();
//    }
//
//    public void addCalculationResult(String result) {
//        calculationResults.add(result);
//    }
//
//    public List<String> getCalculationResults() {
//        return calculationResults;
//    }
//
//    public void clearCalculationResults() {
//        calculationResults.clear();
//    }
//}
