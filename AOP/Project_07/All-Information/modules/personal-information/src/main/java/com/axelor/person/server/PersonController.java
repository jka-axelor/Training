package com.axelor.person.server;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.axelor.db.JpaSupport;
import com.axelor.i18n.I18n;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;

public class PersonController extends JpaSupport {

	public void say(ActionRequest request, ActionResponse response) {

		Map<String, Object> data = new HashMap<>();
		data.put("total", 1000);
		data.put("percent", 10);
		data.put("tag", I18n.get("Monthly"));
		data.put("tagCss", "label-success");
		response.setData(Arrays.asList(data));
	}
}
