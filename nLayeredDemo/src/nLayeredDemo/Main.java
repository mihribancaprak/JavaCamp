package nLayeredDemo;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductServices;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
         
		//ToDo : Spring IOC ile ??z?lecek
		ProductServices productServices = new ProductManager(new HibernateProductDao(),new JLoggerManagerAdapter()); 
		Product product = new Product(1,2,"Elma",12,50);
		productServices.add(product);
			
	}

}
