// Noob Implementation
class ProductFactory{
  public Product createProduct(String id){

    switch(id){
      case "id1":
      return new Product1();
      break;
      case "id2":
      return new Product2();
      break;
    }

    return null;
  }
}

// Better Implementation
abstract class Product
{
	public abstract Product createProduct();
	...
}

class OneProduct extends Product
{
	...
	static
	{
		ProductFactory.instance().registerProduct("ID1", new OneProduct());
	}
	public OneProduct createProduct()
	{
		return new OneProduct();
	}
	...
}

class ProductFactory
{
  private HashMap m_RegisteredProducts = new HashMap();
	public void registerProduct(String productID, Product p)    {
		m_RegisteredProducts.put(productID, p);
	}

	public Product createProduct(String productID){
		((Product)m_RegisteredProducts.get(productID)).createProduct();
	}
}
