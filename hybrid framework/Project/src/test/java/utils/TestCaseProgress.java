package utils;
 
import javax.swing.JFrame;
import javax.swing.JProgressBar;
 
@SuppressWarnings("serial")
public class TestCaseProgress extends JFrame{
	
	JProgressBar jProgressBar;
	int i=1;
	private int testcaseNo;
 
	public void setTestcaseNo(int testcaseNo) {
		this.testcaseNo = testcaseNo;
	}
	public int getTestcaseNo() {
		return testcaseNo;
	}
	
	public TestCaseProgress(int testCaseCount) {
        jProgressBar = new JProgressBar(0, testCaseCount);
		jProgressBar.setBounds(40, 40, 160, 30);
		jProgressBar.setValue(0);
		jProgressBar.setStringPainted(true);
		add(jProgressBar);
		setSize(800, 90);
		setLocationRelativeTo(null);
	}
       public void checkProgress() {
           iterate();
	}
	private void iterate() {
		while(i<=getTestcaseNo()) {
			jProgressBar.setValue(i);
			i += 1;
			try {
				Thread.sleep(200);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}