package org.com.entitys;

/**
 * 上行短信(回调)
 */
public class MoNoticeReq {
	
	//分配给开发者的上行短信端口（非移动号码此参数为空）。请联系工作人员获取
	private String MOPort;
	//上行手机号码。
    private String phone;
    //上行短信内容。
    private String content;
    //上行短信时间
    private String MOTime;
    //时间戳(当前系统时间（24小时制），格式"yyyyMMddHHmmss"。时间戳有效时间为5分钟)
    private String timestamp;
    //签名(MD5(ACCOUNT SID + AUTH TOKEN + timestamp)。共32位（小写）)
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
