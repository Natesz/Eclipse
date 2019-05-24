package progTechBead1;

public class Szivacs implements Leny{

	String name;
	int KezdetiViz;
	int distance;
	boolean isAlive;
	final int maxViz = 20;
	
	
	
	public int getKezdetiViz() {
		return KezdetiViz;
	}


	public void setKezdetiViz(int kezdetiViz) {
		KezdetiViz = kezdetiViz;
	}


	public int getDistance() {
		return distance;
	}


	public void setDistance(int distance) {
		this.distance = distance;
	}


	public boolean isAlive() {
		return isAlive;
	}


	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}


	public Szivacs(String name, int KezdetiViz) {
		this.name = name;
		this.KezdetiViz = KezdetiViz;
		this.isAlive = true;
		
	}
	

	public void updateStatus(int currentViz) {
		if(currentViz<0) {
			isAlive = false;
			
		}
		
	}
	
	public int updateViz(int currentViz) {
		if(currentViz>maxViz) {
			return maxViz;
		}else {
			return currentViz;
		}
	}


	
	@Override
	public void napos() {
		this.KezdetiViz = this.KezdetiViz-4;
		updateStatus(this.KezdetiViz);
		this.KezdetiViz = updateViz(this.KezdetiViz);
		System.out.println(name +" megtett: "+this.distance+" tavolsagot");
	}

	@Override
	public void esos() {
		KezdetiViz = KezdetiViz + 6;
		updateStatus(KezdetiViz);
		KezdetiViz = updateViz(KezdetiViz);
		distance = distance +3;
		System.out.println(name +" megtett: "+distance+" tavolsagot");
	}

	@Override
	public void felhos() {
		KezdetiViz = KezdetiViz -1;
		updateStatus(KezdetiViz);
		KezdetiViz = updateViz(KezdetiViz);
		distance = distance +1;
		System.out.println(name +" megtett: "+distance+" tavolsagot");
	}

}
