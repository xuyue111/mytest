package cn.itcast.springmvc.pojo;

import java.util.List;

public class QueryVo {
	private Item item;
	private List<Integer>ids;
	private Integer[]idsArray;
	public Item getItem() {
		return item;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	public Integer[] getIdsArray() {
		return idsArray;
	}

	public void setIdsArray(Integer[] idsArray) {
		this.idsArray = idsArray;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
