package org.com.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.com.entitys.MoNoticeReq;
import org.com.entitys.MoNoticeResp;
import org.com.entitys.RespCode;

import com.google.gson.Gson;

/**
 * ���ж��Žӿ�
 */
public class MoNoticeServlet extends HttpServlet {
	
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
		MoNoticeReq moNoticeReq = gson.fromJson(reqBody.toString(), MoNoticeReq.class);

		// TODO �ж�ǩ���Ƿ���ȷ

		// TODO ҵ���������߸����Լ�������ʵ��

		// ��Ӧ
		MoNoticeResp moNoticeResp = new MoNoticeResp();
		moNoticeResp.setRespCode(RespCode.SUCCESS);
		String respStr = gson.toJson(moNoticeResp);
		System.out.println("���ص�����:" + respStr);

		response.getWriter().write(respStr);
	}

}
