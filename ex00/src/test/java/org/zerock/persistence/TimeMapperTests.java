package org.zerock.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TimeMapperTests {

	// 스프링 내부의 TimeMapper 타입으로 만들어진 스프링객체(빈)이 존재하는지 테스트
	
	@Setter(onMethod_ = @Autowired )
	private TimeMapper timeMapper;
	
	@Test
	public void testGetTime() {
		log.info(timeMapper.getClass().getName()); //실제 동작하는 클래스의 이름, 스프링AOP로 인해 내부적으로 적당한클래스 생성
		log.info(timeMapper.getTime());
	}
	
	
}
