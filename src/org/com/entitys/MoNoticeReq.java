package org.com.entitys;

/**
 * ���ж���(�ص�)
 */
public class MoNoticeReq {
	
	//����������ߵ����ж��Ŷ˿ڣ����ƶ�����˲���Ϊ�գ�������ϵ������Ա��ȡ
	private String MOPort;
	//�����ֻ����롣
    private String phone;
    //���ж������ݡ�
    private String content;
    //���ж���ʱ��
    private String MOTime;
    //ʱ���(��ǰϵͳʱ�䣨24Сʱ�ƣ�����ʽ"yyyyMMddHHmmss"��ʱ�����Чʱ��Ϊ5����)
    private String timestamp;
    //ǩ��(MD5(ACCOUNT SID + AUTH TOKEN + timestamp)����32λ��Сд��)
    private String sig;
    
	public String getMOPort() {
		return MOPort;
	}
	public void setMOPort(String mOPort) {
		MOPort = mOPort;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getMOTime() {
		return MOTime;
	}
	public void setMOTime(String mOTime) {
		MOTime = mOTime;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getSig() {
		return sig;
	}
	public void setSig(String sig) {
		this.sig = sig;
	}

}
