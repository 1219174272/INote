package org.com.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.com.entitys.ReceNoticeReq;
import org.com.entitys.ReceNoticeResp;
import org.com.entitys.RespCode;

import com.google.gson.Gson;

/**
 * ���Ż�ִ����
 */
public class ReceNoticeServlet extends HttpServlet {
	
	private static final long serialVersionUID = -2119868200097964820L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// ��ȡ�������
		BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
		String str = null;
		StringBuffer reqBody = new StringBuffer();
		while ((str = reader.readLine()) != null)
		{
			reqBody.append(str);
		}
		System.out.println("�յ�����" + reqBody);

		// ������ע���Ӧ��bean
		Gson gson = new Gson();
		ReceNoticeReq receNoticeReq = gson.fromJson(reqBody.toString(), ReceNoticeReq.class);

		// TODO ҵ���������߸����Լ�������ʵ��

		// ��Ӧ
		ReceNoticeResp receNoticeResp = new ReceNoticeResp();
		receNoticeResp.setRespCode(RespCode.SUCCESS);
		String respStr = gson.toJson(receNoticeResp);
		System.out.println("���ص�����:" + respStr);

		response.getWriter().write(respStr);
	}

}
