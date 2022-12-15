package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.sample.Restaurant;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) // 현재 테스트코드가 스프링을 실행하는 역할 이라는 어노테이션
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
// 지정된 클래스나 문자열을 이용해 필요한 객체들을 스프링 내의 객체로 등록 (스프링 빈 등록)
@Log4j // Lombok의 로그기록 어노테이션

public class SampleTests {
	// Junit 은 반드시 4.10 이상버전을 사용
	
	@Setter(onMethod_ = {@Autowired}) //Autowired 는 해당 인스턴스 변수가 스프링으로부터 자동으로 주입해 달라는 표시
	private Restaurant restaurant;
	
	@Test // Junit 에서 테스트 대상을 지정하는 어노테이션
	public void testExist() {
		assertNotNull(restaurant); // restaurant 변수가 null 이 아니라면 테스트가 성공한다는 메서드
		
		log.info(restaurant);
		log.info("-------------------------");
		log.info(restaurant.getChef());
	}
	
	
}
