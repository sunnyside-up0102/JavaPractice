package Page263_Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention (RetentionPolicy.RUNTIME)
public @interface UserAnnot {
	String value();
	int number() default 5;
}

//6���� �߰�����
//Annotation�� ������å
//1. RetentionPolicy.RUNTIME
//����Ʈ�ڵ�(.class)�� �����ְ� ���� �߿��� Annotation ���� ��� ����.
//2.	RetentionPolicy.SOURCE
//�����Ϸ����Ը� �����ϰ�, ����Ʈ�ڵ忡���� �����.
//3.	RetentionPolicy.CLASS
//����Ʈ �ڵ忡 ���������� Annotation ���� ��� �Ұ�