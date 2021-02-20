package com.rj.bd.xm;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;

public class Json {
	public static void main(String[] args) {
		String jsons = "{'com':'zhongtong','data':"
				+ "[{'ftime':'2012-10-15 08:03:55','context':'【河南市】 快件已在 【通州】 签收'},"
				+ "{'ftime':'2020-09-14 23:05:34','context':'【河北省】 快件已在 【保定市】 签收'}]}";
		JSONObject json = new JSONObject(jsons);
		String a = json.getStr("com");
		JSONArray array = json.getJSONArray("data");
		for (int i = 0; i < array.size(); i++) {
			JSONObject data = array.getJSONObject(new Integer(i));
			String b = data.get("context").toString();
			System.out.println(b);
		}
	}
}