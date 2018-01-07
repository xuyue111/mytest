package cn.itcast.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.springmvc.pojo.Item;
import cn.itcast.springmvc.pojo.QueryVo;
import cn.itcast.springmvc.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;

	@RequestMapping(value = "/item/index.action")
	public ModelAndView getItemList() {
		List<Item> list = itemService.findItemList();
		ModelAndView mav = new ModelAndView();
		mav.addObject("itemList", list);
		mav.setViewName("itemList");
		return mav;
	}

	// 商品管理之去修改页面
	/*
	 * @RequestMapping(value = "/itemEdit.action") public ModelAndView
	 * itemEdit(Integer id, Boolean isFlag, HttpServletRequest request,
	 * HttpServletResponse response, HttpSession session) { // 通过id去查询对象 Item
	 * item = itemService.findItemById(id); ModelAndView mav = new
	 * ModelAndView(); mav.addObject("item", item); mav.setViewName("editItem");
	 * return mav;
	 * 
	 * }
	 */

	// 提交修改
	@RequestMapping(value = "/updateitem.action")
	public String updateItem(Item item) {
		itemService.updateItem(item);
		
		
		return "redict:/item/index.action";
	}

	/*@RequestMapping("/itemEdit")
	public String itemEdit1(HttpServletRequest request, Model model) {
		String strId = request.getParameter("id");
		Integer id = null;
		if (strId != null && !"".equals(strId)) {
			id = new Integer(strId);
		} else {
			return null;
		}
		Item items = itemService.findItemById(id);

		ModelAndView mav = new ModelAndView();
		mav.addObject("item", items);
		// jsp传送数据
		mav.setViewName("editItem");
		model.addAttribute("item", items);
		return "editItem";

	}*/

	@RequestMapping("/itemEdit")
	public String itemEdit(Integer id, Model model) {

		Item items = itemService.findItemById(id);
		model.addAttribute("item", items);
		return "editItem";
	}

	/*@RequestMapping("/item/xy.action")
	public String useraddsubmit(Model model, QueryVo vo) {
		System.out.println(vo.getItem().getName());
		System.out.println(vo.getItem().getPrice());
		return null;

	}*/

}
