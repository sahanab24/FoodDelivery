#Testing for git
package pizzahutapplication.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pizzahutapplication.model.Item;
import pizzahutapplication.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemservice;
	
	@RequestMapping("/items")
	public List<Item> getAllItems(){
		return itemservice.getAllItems();
	}
	
	@RequestMapping("/items/{id}")
	public Optional<Item> getItem(@PathVariable int id) {
		return itemservice.getItem(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/items")
	public void addTopic(@RequestBody Item item) {
		itemservice.addItem(item);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/items/{id}")
	public void addTopic(@RequestBody Item item,@PathVariable int id) {
		itemservice.updateItem(id, item);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/items/{id}")
	public void addTopic(@PathVariable int id) {
		itemservice.deleteItem(id);
	}
	
	

}
