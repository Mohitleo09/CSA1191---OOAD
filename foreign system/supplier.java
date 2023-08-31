

/**
 * Class customer
 */
public class customer {

  //
  // Fields
  //

  private void order_product;
  private void quality;
  
  //
  // Constructors
  //
  public customer () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of order_product
   * @param newVar the new value of order_product
   */
  private void setOrder_product (void newVar) {
    order_product = newVar;
  }

  /**
   * Get the value of order_product
   * @return the value of order_product
   */
  private void getOrder_product () {
    return order_product;
  }

  /**
   * Set the value of quality
   * @param newVar the new value of quality
   */
  private void setQuality (void newVar) {
    quality = newVar;
  }

  /**
   * Get the value of quality
   * @return the value of quality
   */
  private void getQuality () {
    return quality;
  }

  //
  // Other methods
  //

  /**
   */
  public void payment()
  {
  }


  /**
   */
  public void transport()
  {
  }


  /**
   */
  public void deliver()
  {
  }


}



/**
 * Class supplier
 */
public class supplier {

  //
  // Fields
  //

  private void product_supply;
  
  //
  // Constructors
  //
  public supplier () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of product_supply
   * @param newVar the new value of product_supply
   */
  private void setProduct_supply (void newVar) {
    product_supply = newVar;
  }

  /**
   * Get the value of product_supply
   * @return the value of product_supply
   */
  private void getProduct_supply () {
    return product_supply;
  }

  //
  // Other methods
  //

  /**
   */
  public void available_product()
  {
  }


  /**
   */
  public void money_transfer()
  {
  }


}
