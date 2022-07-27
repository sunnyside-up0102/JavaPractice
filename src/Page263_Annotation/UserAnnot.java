package Page263_Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention (RetentionPolicy.RUNTIME)
public @interface UserAnnot {
	String value();
	int number() default 5;
}

//6라인 추가설명
//Annotation의 유지정책
//1. RetentionPolicy.RUNTIME
//바이트코드(.class)에 남아있고 실행 중에도 Annotation 정보 사용 가능.
//2.	RetentionPolicy.SOURCE
//컴파일러에게만 지시하고, 바이트코드에서는 사라짐.
//3.	RetentionPolicy.CLASS
//바이트 코드에 남아있지만 Annotation 정보 사용 불가