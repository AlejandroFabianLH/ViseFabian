package net.codejava.ViseProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends GenericServiceImpl<Product, Long> implements ProductServiceAPI{

    @Autowired
	private ProductDaoAPI productDaoAPI;
	
	@Override
	public CrudRepository<Product, Long> getDao() {
		return productDaoAPI;
	}
    
}
