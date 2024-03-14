package theo.trin.tests.FinancingFactory;

import theo.trin.entities.Financing;

public class FinancingFactory {
    public static Financing CreateSucessfullFinancing(){
        return new Financing(100000.0, 5000.0, 80);
    }

    public static Financing CreateUnsucessfullFinancing(){
        return new Financing(100000.0, 5000.0, 12);
    }

}
