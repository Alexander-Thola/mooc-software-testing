package tudelft.discount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class DiscountApplierTest {

    private ProductDao dao;
    private DiscountApplier applier;

    @BeforeEach
    public void setup() {
        dao = Mockito.mock(ProductDao.class);
        applier = new DiscountApplier(dao);
    }

    @Test
    public void testDiscountForHomeProduct() {
        Product homeProduct = new Product("Silla", 100.0, "HOME");
        when(dao.all()).thenReturn(Arrays.asList(homeProduct));

        applier.setNewPrices();

        assertEquals(90.0, homeProduct.getPrice(), 0.0001);
    }

    @Test
    public void testDiscountForBusinessProduct() {
        Product businessProduct = new Product("Laptop", 200.0, "BUSINESS");
        when(dao.all()).thenReturn(Arrays.asList(businessProduct));

        applier.setNewPrices();

        assertEquals(220.0, businessProduct.getPrice(), 0.0001);
    }

    @Test
    public void testMultipleProducts() {
        Product home = new Product("Mesa", 150.0, "HOME");
        Product business = new Product("Router", 100.0, "BUSINESS");
        when(dao.all()).thenReturn(Arrays.asList(home, business));

        applier.setNewPrices();

        assertEquals(135.0, home.getPrice(), 0.0001);
        assertEquals(110.0, business.getPrice(), 0.0001);
    }
}
