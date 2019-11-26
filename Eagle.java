public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
    
    @Override
	public void takeOff () {
    	if (!this.flying && this.altitude == 0) {
    		this.flying = true;
    		System.out.printf("%s takes off into the air.\n", this.getName());
    	}
    }
    
    @Override
	public int ascend (int meters) {
    	if (this.flying) {
    		this.altitude = Math.max(this.altitude + meters, Integer.MIN_VALUE );
    		System.out.printf("%s flies up, altitude : %d\n", this.getName(), this.altitude);
    	}
    	return this.altitude;
    }
    
    @Override
	public int descend (int meters) {
    	if (this.flying) {
    		this.altitude = Math.min(this.altitude - meters, Integer.MAX_VALUE);
    		System.out.printf("%s flies down, altitude : %d\n", this.getName(), this.altitude);
    	}
    	return this.altitude;
    }
    
    @Override
	public void land () {
    	if (this.flying && this.altitude == 0){
    		System.out.printf("%s is going to land on the ground.\n", this.getName());
    	} else {
    		System.out.printf("%s is too high, can't land.\n", this.getName());
    	}
    }
    
}
