package org.com.entitys;

import java.util.Random;

/**
 * �����߸�����Ϣ(����)
 */
public class  NoteUser {
	
	/**
	 * API��������������-->REST_URL
	 */
	public static final String BASE_URL = "https://api.miaodiyun.com/20150822";

	/**
	 * �û��˺�ID-->ACCOUNT_SID
	 */
	public static final String ACCOUNT_SID = "9541628ebf0e4f45b17a71c86dc0d120";

	/**
	 * �û�-->AUTH_TOKEN
	 */
	public static final String AUTH_TOKEN = "c4301c1252494be5a243c245243a54df";

	/**
	 * ��Ӧ��������-->JSON/XML
	 */
	public static final String RESP_DATA_TYPE = "json";
	
	//�����
	private static final String randNum = String.valueOf(new Random().nextInt(99999)+100000);

	public static String getRandnum() {
		return randNum;
	}
	
}
