package pizzahutapplication.repository;

import org.springframework.data.repository.CrudRepository;

import pizzahutapplication.model.Item;

public interface  ItemRepository  extends CrudRepository<Item, Integer>{
	
	

}
