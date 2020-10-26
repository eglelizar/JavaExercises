package InnerAndAbstract;

public class DeskPhone implements ITelephone {
	private int myNumber;
	private boolean isRinging;
	

	@Override
	public void powerOn() {
		System.out.println("No action taken, desk phone does not have a power button");
		
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing " + phoneNumber + " on desktphone" );
		
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return false;
	}

}
