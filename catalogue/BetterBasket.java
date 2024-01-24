package catalogue;

import java.io.Serializable;
import java.util.Collections;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Your Name 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  @Override 
  public boolean add(Product product) {
	  String productNum = product.getProductNum();
	  // if product is in list then change quantity
	  //else just add it normally
	  return super.add(product);
  }
  
  
  // You need to add code here
}
