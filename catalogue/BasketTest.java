package catalogue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import middle.StockException;
import middle.StockReadWriter;

class BasketTest {
 @BeforeEach
 void setUp() {
	
 }


	@Test
	void testGetOrderNum() {
		Product pr = new Product("0007", "Test", 60.00, 56);
		Basket basket = new Basket();
		basket.setOrderNum(3);
		Assert.assertEquals(3, basket.getOrderNum());
	}

	@Test
	void testAddProduct() {
		Product pr = new Product("0007", "Test", 60.00, 56);
		Basket basket = new Basket();
		Assert.assertTrue(basket.add(pr));
	}
	
	
	@Test
	void testGetDetails() {
		Product pr = new Product("0007", "Test", 60.00, 1);
		Basket basket = new Basket();
		basket.add(pr);
		Assert.assertEquals("0006   Test           (  1) £  60.00\n----------------------------\nTotal                       £  60.00",basket.getDetails());
	}

}
