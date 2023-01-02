package com.axelor.data.adapter.demo;

import java.util.Map;
import java.util.regex.Pattern;

import com.axelor.data.adapter.Adapter;

public class BooleanAdapteer extends Adapter {

	private Pattern pattern;

	@Override
	public Object adapt(Object value, Map<String, Object> context) {
//		System.err.println(context.entrySet());
//		String number = "7";
//		Integer numberInt = Integer.valueOf(number);

//		if(value==null || "".equals(value)) return Boolean.FALSE;

		if (pattern == null) {
//			String falePattern = this.get("falsePattern", "(0|false|no|n)");
			String myPattern = "(0|false|no|f|n)";
			System.out.println(myPattern);
			pattern = Pattern.compile(myPattern, Pattern.CASE_INSENSITIVE);
		}

		return pattern.matcher((String) value).matches();
	}

}
