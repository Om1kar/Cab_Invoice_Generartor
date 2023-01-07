import com.bridgelabz.CabInvoiceGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabInvoiceGeneratorTest {
    @Test
    public void givenDistanceAndTimeShouldReturnTotalFare() {
        double totalFare = CabInvoiceGenerator.calculateFare(0.4, 1.0);
        Assertions.assertEquals(5, totalFare);
    }
}