import com.bridgelabz.CabInvoiceGenerator;
import com.bridgelabz.Invoice;
import com.bridgelabz.Ride;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabInvoiceGeneratorTest {
    @Test
    public void givenDistanceAndTimeShouldReturnTotalFare() {
        double totalFare = CabInvoiceGenerator.calculateFare(0.4, 1.0);
        Assertions.assertEquals(5, totalFare);
    }
    @Test
    public void givenMultipleRidesShould_ReturnAggregateFare(){
        Ride[] rides ={new Ride(0.4,1.0),new Ride(0.8,2.0),new Ride(0.4,1.0)};
        double totalFare = CabInvoiceGenerator.getTotalFare(rides);
        Assertions.assertEquals(20,totalFare);
    }
    @Test
    public void givenMultipleRidesShould_ReturnInvoice() {
        Ride[] rides ={new Ride(0.4,1.0),new Ride(0.8,2.0),new Ride(0.4,1.0)};
        double actualInvoice = CabInvoiceGenerator.getTotalFare(rides);
        Invoice expectedInvoice = new Invoice(3,20.0,6.6);
        Assertions.assertEquals(expectedInvoice,actualInvoice);
    }
}