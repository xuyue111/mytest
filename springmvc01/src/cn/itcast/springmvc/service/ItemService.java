package cn.itcast.springmvc.service;

import java.util.List;

import cn.itcast.springmvc.pojo.Item;

public interface ItemService {
	public List<Item> findItemList();

	public Item findItemById(Integer id);

	public void updateItem(Item item);
	
	
	 

}
