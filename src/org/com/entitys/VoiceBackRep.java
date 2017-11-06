package org.com.entitys;

/**
 * 语音验证码状态通知接口(回调)
 */
public class VoiceBackRep {
	
	//呼叫的唯一标识。对应语音验证码接口返回的callId。
	private String callId;
	//被叫电话号码。支持手机、固话，被叫为固话时需要添加区号，如：075512345678。
	private String called;
	//通话状态。0：正常通话；1：被叫未接听；2：被叫拒接；3：外呼失败。
	private String state;
	//通话时长。单位：秒
	private String callTime;
	//验证码内容，为数字0~9，长度4-8位。语音验证码接口中的verifyCode。
	private String DTMFaction;
	//请求发送的时间。为从格林威治时间1970年01月01日00时00分00秒起至现在的总秒数，要求精准到毫秒，如: 1295430113。
	private String timestamp;
	//要求精准到毫秒，如: 1295430113。
	private String sig;
	
	public String getCallId() {
		return callId;
	}
	public void setCallId(String callId) {
		this.callId = callId;
	}
	public String getCalled() {
		return called;
	}
	public void setCalled(String called) {
		this.called = called;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCallTime() {
		return callTime;
	}
	public void setCallTime(String callTime) {
		this.callTime = callTime;
	}
	public String getDTMFaction() {
		return DTMFaction;
	}
	public void setDTMFaction(String dTMFaction) {
		DTMFaction = dTMFaction;
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
