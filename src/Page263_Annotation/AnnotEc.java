package Page263_Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class AnnotEc {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		Method methoc[] = UserClass.class.getDeclaredMethods();
		
		for(int i =0;i<methoc.length;i++) {
			String methodName = methoc[i].getName();
			UserAnnot annot = methoc[i].getAnnotation(UserAnnot.class);
			
			System.out.print(methodName + "ÀÇ Annotation");
			System.out.print("value :" + annot.value());
			System.out.println("number " + annot.number());
			
			methoc[i].invoke(new UserClass(),null);
		}

	}

}
