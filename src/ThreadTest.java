import javax.swing.*;
public class ThreadTest {

	public static void main(String[] args) {
		ThreadCnt thread = new ThreadCnt();
		thread.setDaemon(true);
		thread.start();
		
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է¤�");
		thread.Action(false);
		System.out.println("�Է� ���� " + input);
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
		JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"�Է±��� 10�� ����");
	}
	
}
