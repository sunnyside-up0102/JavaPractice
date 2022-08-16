import javax.swing.*;
public class ThreadTest {

	public static void main(String[] args) {
		ThreadCnt thread = new ThreadCnt();
		thread.setDaemon(true);
		thread.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력ㄱ");
		thread.Action(false);
		System.out.println("입력 값은 " + input);
	}
}

class ThreadCnt extends Thread {
	private boolean threadFlag;
	
	ThreadCnt() {
		this.threadFlag = true;
	}
	public void Action(boolean threadFlag) {
		this.threadFlag = threadFlag;
	}
	@Override
	public void run() {
		for (int i = 0;!Thread.currentThread().isInterrupted() && i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		JOptionPane.getRootFrame().dispose();
		JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"입력기한 10초 지남");
	}
	
}
