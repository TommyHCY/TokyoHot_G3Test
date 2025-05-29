package com.pixeltribe;

import java.util.Objects;

	public class MemberVO {
	private Integer memId;
	private String memName;
	public Integer getMemId() {
		return memId;
	}
	public void setMemId(Integer memId) {
		this.memId = memId;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(memId, memName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		return Objects.equals(memId, other.memId) && Objects.equals(memName, other.memName);
	}
	
	
	public MemberVO() {
		super();
		}
	public static void main(String[] args) {
		System.out.println("玉祥好帥");
	}

}
