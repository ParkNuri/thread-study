package basic;

class DigitThread extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class AlphaThread extends Thread {
	public void run() {
		for (char a = 'A'; a <= 'Z'; a++) {
			System.out.print(a);
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class TreadExam01 {

	public static void main(String[] args) {
		DigitThread d = new DigitThread();
		AlphaThread a = new AlphaThread();
		d.start();
		a.start();

	}
}
