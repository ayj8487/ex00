package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	//현재 인터페이스가 존재하고 Mapper XML의 namespace 속성값이 같으면 mybatis가 병합처리
	
	// 메서드 선언은 Mapper인터페이스,  SQL 처리는 Mapper XML 
	
	@Select("SELECT sysdate FROM dual")
	public String getTime(); 

	// @Select 와 같이 MyBatis의 어노테이션이 존재하지않고, sql 쿼리도 존재하지않음
	public String getTime2(); //인터페이스로 작성된 mapper와 xml로 작성된 mapper 비교
	
	

}
