package org.com.entitys;

import java.util.Random;

/**
 * 开发者个人信息(发送)
 */
public class  NoteUser {
	
	/**
	 * API开发者中心请求-->REST_URL
	 */
	public static final String BASE_URL = "https://api.miaodiyun.com/20150822";

	/**
	 * 用户账号ID-->ACCOUNT_SID
	 */
	public static final String ACCOUNT_SID = "9541628ebf0e4f45b17a71c86dc0d120";

	/**
	 * 用户-->AUTH_TOKEN
	 */
	public static final String AUTH_TOKEN = "c4301c1252494be5a243c245243a54df";

	/**
	 * 响应数据类型-->JSON/XML
	 */
	public static final String RESP_DATA_TYPE = "json";
	
	//随机数
	private static final String randNum = String.valueOf(new Random().nextInt(99999)+100000);

	public static String getRandnum() {
		return randNum;
	}
	
}
