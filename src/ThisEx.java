	class ThisTest{
		ThisTest(int memVar){
			this.memVar = memVar;
		}
		private int memVar;
		public int getMemVarr() {
			return this.memVar;
		}
}
public class ThisEx {

	public static void main(String[] args) {
		ThisTest ttest = new ThisTest(100);
		System.out.println(ttest.getMemVarr());

	}

}
