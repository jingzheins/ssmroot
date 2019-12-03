package com.ssmroot.pojo;

import java.util.Date;
import java.io.Serializable;


/**
 * <p>
 * 
 * </p>
 *
 * @author qlq
 * @since 2019-12-03
 */
public class Knowledge implements Serializable {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private String problem;
	private String answer;
	private String sort;
	private Integer superid;
	private Date createtime;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public Integer getSuperid() {
		return superid;
	}

	public void setSuperid(Integer superid) {
		this.superid = superid;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}
