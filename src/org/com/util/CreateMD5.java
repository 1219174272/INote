package org.com.util;

import java.security.MessageDigest;

public class CreateMD5 {

private static final String []pwdChars={"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
	
	public static String CreateMD5(String pwd){
		String pwdMd5="";
		try {
			MessageDigest md5=MessageDigest.getInstance("MD5");
			byte[] pwdlist=md5.digest(pwd.getBytes("utf-8"));
			for(byte p : pwdlist){
				pwdMd5+=pwdChars[p>>4&0xf]+pwdChars[p&0xf];
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return pwdMd5;
	}
}
