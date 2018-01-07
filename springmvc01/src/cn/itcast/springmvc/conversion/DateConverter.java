package cn.itcast.springmvc.conversion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
/**
 * 日期转换类
 * S: 页面传递过来的入参的类型
 * T：转换后的类型
 * @author lx
 *
 */
public class DateConverter implements Converter<String, Date>{

	
	//  2015-02-06 13-23-02
	@Override
	public Date convert(String source) {
		// TODO Auto-generated method stub
		try {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return df.parse(source);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
