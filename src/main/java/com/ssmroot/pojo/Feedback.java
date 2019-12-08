package com.ssmroot.pojo;

import java.util.Date;
import java.io.Serializable;


/**
 * <p>
 * 
 * </p>
 *
 * @author qlq
 * @since 2019-12-08
 */
public class Feedback implements Serializable {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private String uname;
    /**
     * 联系方式
     */
	private String contactInformation;
    /**
     * 应答语句
     */
	private Integer kid;
    /**
     * 用户意见
     */
	private String umsg;
    /**
     * 1是反馈 2是评分
     */
	private String type;
	private Date createtime;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}

	public Integer getKid() {
		return kid;
	}

	public void setKid(Integer kid) {
		this.kid = kid;
	}

	public String getUmsg() {
		return umsg;
	}

	public void setUmsg(String umsg) {
		this.umsg = umsg;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}
