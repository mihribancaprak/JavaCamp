package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	
    void add(Product product);
    void update(Product product);
    void delete(Product product);   
    Product get(int id); //Verilen id ile bir product bulup onu getirir.
    List<Product> getAll();
    
    
}
