package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component // 해당 클래스가 스프링에서 관리해야하는 대상임을 표시
@Data // setter와 toSting 자동생성
public class Restaurant {

	//레스토랑 클래스는 셰프 클래스를 주입받도록 설계
	
	@Setter(onMethod_ = @Autowired)
	private Chef chef;
	//Restaurant 객체는 Chef 객체를 필요로한다
	
}
