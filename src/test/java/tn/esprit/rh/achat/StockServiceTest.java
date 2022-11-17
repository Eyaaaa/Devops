package tn.esprit.rh.achat;
import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.rh.achat.entities.Stock;
import tn.esprit.rh.achat.repositories.StockRepository;
import tn.esprit.rh.achat.services.IStockService;
import tn.esprit.rh.achat.services.StockServiceImpl;

import static org.mockito.Mockito.times;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnitRunner;


@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class StockServiceTest {
	
	@Mock
	private StockRepository sr;
	
	private Stock stock1 = new Stock("stock1",500, 10);
	private Stock stock2 = new Stock("stock2",750, 10);
	
	@InjectMocks
	StockServiceImpl stockService;
	
	@Test
	public void testAddStock() {
	    when(sr.save(stock1)).thenReturn(stock1);
	    assertNotNull(stock1);
	    assertEquals(stock1, stockService.addStock(stock1)); 
	    System.out.println("the add function works!");
	}
	@Test 
    public void testupdateStock() {
    	when(sr.save(stock1)).thenReturn(stock1);
    	assertNotNull(stock1);
    	assertEquals(stock1, stockService.updateStock(stock1));
    	System.out.println("Update works !");
    }
	
	
	/*@Test
    public void testDeleteStock(){
        stockService.deleteStock(stock1);
        Mockito.verify(produitRepository, times(1)).deleteById(66L);
        System.out.println("4");
    }*/
}

