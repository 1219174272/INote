package org.com.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.com.entitys.NoteUser;

/**
 * ��ȡ��֤�빤����
 */
public class NoteUtil {
	
	/**
	 * post����
	 * 
	 * @param url ���ܺͲ���
	 * @param body post������
	 */
	public static String post(String url, String body)
	{
		
		//System.lineSeparator()  ==  \n
		
		System.out.println("url:" + url);
		System.out.println("body:" + body);

		String result = "";
		try
		{
			OutputStreamWriter out = null;
			BufferedReader in = null;
			URL realUrl = new URL(url);
			URLConnection conn = realUrl.openConnection();

			// �������Ӳ���
			conn.setDoOutput(true);
			conn.setDoInput(true);
			//�������ӵĳ�ʱʱ��(�������������)ms
			//conn.setConnectTimeout(5000);
			//�������ݵĳ�ʱʱ��(���粻����)ms
			//conn.setReadTimeout(20000);
			
			conn.setConnectTimeout(5000);
			//20min
			conn.setReadTimeout(100*12000);

			// �ύ����
			out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
			out.write(body);
			out.flush();

			// ��ȡ��������
			in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			String line = "";
			boolean firstLine = true; // ����һ�в��ӻ��з�
			while ((line = in.readLine()) != null)
			{
				if (firstLine)
				{
					firstLine = false;
				} else
				{
					result += "\n";
				}
				result += line;
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * ����ͨ�ò���timestamp��sig��respDataType
	 */
	public static String createCommonParam()
	{
		// ʱ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String timestamp = sdf.format(new Date());

		// ǩ��(��ҪMD5����)
		String sig = DigestUtils.md5Hex(NoteUser.ACCOUNT_SID + NoteUser.AUTH_TOKEN + timestamp);

		return "&timestamp=" + timestamp + "&sig=" + sig + "&respDataType=" + NoteUser.RESP_DATA_TYPE;
	}

	/**
	 * �ص����Թ��߷���
	 * 
	 * @param url
	 * @param reqStr
	 * @return
	 */
	public static String postHuiDiao(String url, String body)
	{
		String result = "";
		try
		{
			OutputStreamWriter out = null;
			BufferedReader in = null;
			URL realUrl = new URL(url);
			URLConnection conn = realUrl.openConnection();

			// �������Ӳ���
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(20000);

			// �ύ����
			out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
			out.write(body);
			out.flush();

			// ��ȡ��������
			in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			String line = "";
			boolean firstLine = true; // ����һ�в��ӻ��з�
			while ((line = in.readLine()) != null)
			{
				if (firstLine)
				{
					firstLine = false;
				} else
				{
					result += "\n";
				}
				result += line;
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
}
