package site.metacoding.ds;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // RUNTIME (런타임 시 동작), SOURCE (컴파일 시 동작)
@Target({ElementType.METHOD}) //메서드 위에서만 작동하는 어노테이션으로 설정 [메서드,클래스,필드(변수)]
public @interface RequestMapping {
	String value(); //value 메서드 고정, 키 값  ( value로 고정, 무조건 ) 
}
