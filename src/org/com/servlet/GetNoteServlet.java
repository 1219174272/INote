package org.com.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.com.entitys.NoteUser;

public class GetNoteServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String phone = request.getParameter("phone");
		String mess = request.getParameter("mess");
		//System.out.println(phone + "--" + mess);

		/*
		 * if(NoteUser.getRandnum().equals(mess)){ request.setAttribute("msg",
		 * "��֤�ɹ�"); }else{ request.setAttribute("msg", "��֤�����");
		 * request.getRequestDispatcher("").forward(request, response); }
		 */
		// ��ֹ����������ͼƬ
		response.setDateHeader("Expires", -1);
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Pragma", "no-cache");
		// ֪ͨ�ͻ�����ͼƬ��ʽ�򿪷��͹�ȥ������
		response.setHeader("Content-Type", "image/jpeg");
		// ���ڴ��д���һ��ͼƬ
		BufferedImage image = new BufferedImage(80, 30,
				BufferedImage.TYPE_INT_RGB);
		// ��ͼƬ��д����
		Graphics g = image.getGraphics();
		// ���ñ���ɫ
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 80, 30);
		// ����д�����ݵ���ɫ������
		g.setColor(Color.RED);
		g.setFont(new Font(null, Font.BOLD, 20));
		// ��ͼƬ��д����
		String num = makeNum();
		// �����ɵ������浽sess
		request.getSession().setAttribute("checkcode", num);
		g.drawString(num, 0, 20);
		// ��д�õ����ݵ�ͼƬ����������
		ImageIO.write(image, "jpg", response.getOutputStream());

	}

	/**
	 * ���������
	 */
	public String makeNum() {
		Random r = new Random();
		String num = r.nextInt(99999) + "";
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < 5 - num.length(); i++) {
			buffer.append("0");
		}
		num = buffer.toString() + num;
		return num;
	}

}
