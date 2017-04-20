package javaCatch;

public class Pokemon{
	private int id;
	private String name;
	private int rate;
	private double weight;
	private int hpMax;
	private int speed;
	private boolean ultraBeast;
	private String type1;
	private String type2;
	private double hpCurrent;
	static double bonusBall;
	private double grass;
	static double oPower;
	private double bonusStatus;
	
	public Pokemon(int id, String name, int rate, double weight, int hpMax, int speed, boolean ultraBeast, String type1, String type2){
		this.id = id;
		this.name = name;
		this.rate = rate;
		this.weight = weight;
		this.hpMax = hpMax;
		this.speed = speed;
		this.ultraBeast = ultraBeast;
		this.type1 = type1;
		this.type2 = type2;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getRate() {
		return rate;
	}
	public double getWeight() {
		return weight;
	}
	public int getHpMax() {
		return hpMax;
	}
	public int getSpeed() {
		return speed;
	}
	public boolean isUltraBeast() {
		return ultraBeast;
	}
	public String getType1() {
		return type1;
	}
	public String getType2() {
		return type2;
	}
	public void setHpCurrent(double hpCurrent){
		this.hpCurrent = hpCurrent;
	}
	public void setPokeBall(){
		bonusBall = 1;
		
	}
	public void setGreatBall(){
		bonusBall = 1.5;
	}
	public void setUltraBall(){
		bonusBall = 2;
	}
	public void setMasterBall(){
		System.out.println("Your chances of catching the pokemon are 100% and the pokeball will shake 3 times.");
	}
	
	public void setNestBall(){
		bonusBall = 1;
		
	}
	public void setDiveBall(){
		bonusBall = 1;
		
	}
	public void setNetBall(){
		String water = null;
		String bug = null;
		if(type1 == water || type1 == bug || type2 == bug || type2 == water){
			bonusBall = 3;
		}
		bonusBall = 3;
	}
	public void setRepeatBall(){
		bonusBall = 1;
		
	}
	public void setTimerBall(){
		bonusBall = 1;
		
	}
	public void setQuickBall(){
		if(speed >= 100)
			bonusBall = 4;
		else {
			bonusBall = 1;
		}
		
	}
	public void setDuskBall(){
		bonusBall = 1;
		
	}
	public void setSafariBall(){
		bonusBall = 1.5;
	}
	public void setLevelBall(){
		bonusBall = 1;
		
	}
	public void setLureBall(){
		bonusBall = 1;
		
	}
	public void setMoonBall(){
		bonusBall = 1;
		
	}
	public void setFriendBall(){
		bonusBall = 1;
	}
	/*public double heavyBall(){
		if(Pokemon.weight < 451.5){
			return (bonusBall = (double) 0.5);
		}if(Pokemon.weight >= 451.5 || Pokemon.weight <= 677.3){
			return (bonusBall = (double) 1.25);
		}if(Pokemon.weight >= 677.3 || Pokemon.weight <= 903.0){
			return (bonusBall = (double) 2.25);
		}if(Pokemon.weight > 903.0){
			return (bonusBall = (double) 3);
		}
		else{
			return (bonusBall = (double) 1);
		}
		
	} */
	
	public void setHeavyBall(){
		if(weight < 451.5){
			bonusBall = 0.5;
		}else if(weight >= 451.5 && weight <= 677.3){
			bonusBall = 1.25;
		}else if(weight >= 677.3 && weight <= 903.0){
			bonusBall = 2.25;
		}else if(weight > 903.0){
			bonusBall = 3;
		}
	}
	public void setFastBall(){
		if(speed >= 100)
			bonusBall = 4;
		else {
			bonusBall =  1;
		}
		
	}
	public void setSportBall(){
		bonusBall = 1.5;
	}
	public void setPremierBall(){
		bonusBall = 1;
	}
	public void setLuxuryBall(){
		bonusBall = 1;
	}
	public void setHealBall(){
		bonusBall = 1;
	}
	public void setCherishBall(){
		bonusBall = 1;
	}
	public void setUltraBeastBall(){
		if (ultraBeast == true){
			bonusBall = 5;
		} else if (ultraBeast == false){
			bonusBall = 0.1;
		}
		
	}
	
	public void setPoisoned(){
		bonusStatus = 1.5;
		
	}
	public void setFrozen(){
		bonusStatus = 2.5;
		
	}
	public void setAsleep(){
		bonusStatus = 2.5;
		
	}
	public void setBurned(){
		bonusStatus = 1.5;
		
	}
	public void setParalyzed(){
		bonusStatus = 1.5;
		
	}
	public void setNoCondition(){
		bonusStatus = 1;
		
	}
	
	public void setOPower1(){
		oPower = 1.5;
	}
	public void setOPower2(){
		oPower = 2;
}
	public void setOPower3(){
		oPower = 2.5;
}
	public void setOPowerNone(){
		oPower = 1;
}

	
	public void setFirst(){
		grass = (4096.0 / 4096.0);
	}
	public void setSecond(){
		grass = (3686.0 / 4096.0);
	}
	public void setThird(){
		grass = (3277.0 / 4096.0);
	}
	public void setFourth(){
		grass = (2867.0 / 4096.0);
	}
	public void setFifth(){
		grass = (2048.0 / 4096.0);
	}
	public void setSixth(){
		grass = (1229.0 / 4096.0);
	}
	
	
	public void setHp100(){
		hpCurrent = (hpMax * 1);
	}
	public void setHp75(){
		hpCurrent = (hpMax * 0.75);
	}
	public void setHp50(){
		hpCurrent = (hpMax * 0.5);
	}
	public void setHp25(){
		hpCurrent = (hpMax * 0.25);
	}
	public void setHp10(){
		hpCurrent = (hpMax * 0.10);
	}
	
	
	
		
		public double getA(){
			return ((3 * hpMax - 2 * hpCurrent) * grass * rate * bonusBall) / (3 * hpMax) * bonusStatus * oPower;
		}
		public double getB(){
			return Math.floor((65536 / Math.pow((255 / getA()),0.1875)) / 10000);
		}
		

}
