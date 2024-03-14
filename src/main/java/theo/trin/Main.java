package theo.trin;

import theo.trin.entities.Financing;
import theo.trin.tests.FinancingFactory.FinancingFactory;

public class Main {
    public static void main(String[] args) {
        Financing financing = FinancingFactory.CreateSucessfullFinancing();


        System.out.println(financing.quota());

    }
}