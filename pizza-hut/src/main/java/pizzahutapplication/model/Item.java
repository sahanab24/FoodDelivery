package pizzahutapplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String itemname;
	private int itempice;
	private String itemcategory;

	public Item() {
		super();
	}
	public Item(int id, String itemname, int itempice, String itemcategory) {
		super();
		this.id = id;
		this.itemname = itemname;
		this.itempice = itempice;
		this.itemcategory = itemcategory;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getItempice() {
		return itempice;
	}
	public void setItempice(int itempice) {
		this.itempice = itempice;
	}
	public String getItemcategory() {
		return itemcategory;
	}
	public void setItemcategory(String itemcategory) {
		this.itemcategory = itemcategory;
	}
	

}
