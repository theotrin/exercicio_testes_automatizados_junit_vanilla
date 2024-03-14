package theo.trin.tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import theo.trin.entities.Financing;
import theo.trin.tests.FinancingFactory.FinancingFactory;

public class FinancingTests {

    @Test
    public void createShouldCreateWhenDataOk(){
        Assertions.assertNotSame(FinancingFactory.CreateSucessfullFinancing(),IllegalArgumentException.class );
    }

    @Test
    public void financingThrowErrorWhenCreated(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FinancingFactory.CreateUnsucessfullFinancing();
        });
    }

    @Test
    public void setTotalAmountShouldModifyTotalAmountWhenCalled() {
        Financing financing = FinancingFactory.CreateSucessfullFinancing();
        financing.setTotalAmount(20000.0);
        Double exceptedValue = 20000.0;

        Assertions.assertEquals(exceptedValue, financing.getTotalAmount());
    }

    @Test
    public void setTotalAmountThrowExceptionWhenTotalAmountBeModify() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = FinancingFactory.CreateSucessfullFinancing();
            financing.setTotalAmount(1000000.0);
        });
    }

    @Test
    public void setIncomeShouldModifyIncome() {
        Financing financing = FinancingFactory.CreateSucessfullFinancing();
        financing.setIncome(10000.0);
        Double exceptedValue = 10000.0;

        Assertions.assertEquals(exceptedValue, financing.getIncome());
    }

    @Test
    public void setIncomeThrowErrorWhenSetIncomeBeCalled() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = FinancingFactory.CreateSucessfullFinancing();
            financing.setIncome(500.0);
        });
    }

    @Test
    public void setMountShouldUpdateMounts() {
        Financing financing = FinancingFactory.CreateSucessfullFinancing();
        financing.setMonths(90);
        Integer expectedValue = 90;

        Assertions.assertEquals(expectedValue, financing.getMonths());
    }
    @Test
    public void setMountThrowErrorWhenSetMountsBeCalled() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = FinancingFactory.CreateSucessfullFinancing();
            financing.setMonths(10);
        });
    }

    @Test
    public void entryShouldCorrectlyCalculated() {
            Financing financing = FinancingFactory.CreateSucessfullFinancing();
            Double expectedValue = 20000.0;

            Assertions.assertEquals(expectedValue, financing.entry());
    }

    @Test
    public void quotaShouldCorrectlyCalculated() {
        Financing financing = FinancingFactory.CreateSucessfullFinancing();
        Double expectedValue = 1000.0;

        Assertions.assertEquals(expectedValue, financing.quota());

    }

}
