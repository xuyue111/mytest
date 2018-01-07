package cn.itcast.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.springmvc.mapper.ItemMapper;
import cn.itcast.springmvc.pojo.Item;
@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private ItemMapper itemMapper;

	@Override
	public List<Item> findItemList() {
		return itemMapper.findItemList();
	}

	@Override
	public Item findItemById(Integer id) {
		Item item = itemMapper.findItemById(id);
		
		return item;
	}

	@Override
	public void updateItem(Item item) {
		 itemMapper.updateItem(item);
	}


}
