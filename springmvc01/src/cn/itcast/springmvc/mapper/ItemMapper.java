package cn.itcast.springmvc.mapper;

import java.util.List;

import cn.itcast.springmvc.pojo.Item;

public interface ItemMapper {
	//查询所有
	public List<Item> findItemList();
	//通过id查询
	public Item findItemById(Integer id);
	
	public void updateItem(Item item);

}
