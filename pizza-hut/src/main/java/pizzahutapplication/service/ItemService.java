package pizzahutapplication.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pizzahutapplication.model.Item;
import pizzahutapplication.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemrepository;
	
	public List<Item> getAllItems(){
		
		List<Item> items = new ArrayList();
		itemrepository.findAll()
		.forEach(items::add);
		return items;
	}
	
	public Optional<Item> getItem(int id) {
		return itemrepository.findById(id);
	}
	
	public void addItem(Item item) {
		 itemrepository.save(item);
	}
	
	public void updateItem(int id,Item item) {
		itemrepository.save(item);
		
	}
	
	public void deleteItem(int id) {
		itemrepository.deleteById(id);
		
	}

}
