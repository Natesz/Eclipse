package progTechBead1;

public class Lepegeto implements Leny {
	String name;
	int KezdetiViz;
	final int maxViz = 12;
	boolean isAlive;
	int distance;
	
	public Lepegeto(String name, int KezdetiViz) {
		this.name = name;
		this.KezdetiViz = KezdetiViz;
		this.isAlive = true;
		 
	}
	

	public void updateStatus(int currentViz) {
		if(currentViz<0) {
			isAlive = false;
			
		}
		
	}
	
	
	public int getKezdetiViz() {
		return KezdetiViz;
	}


	public void setKezdetiViz(int kezdetiViz) {
		KezdetiViz = kezdetiViz;
	}


	public boolean isAlive() {
		return isAlive;
	}


	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}


	public int getDistance() {
		return distance;
	}


	public void setDistance(int distance) {
		this.distance = distance;
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
		this.KezdetiViz = this.KezdetiViz-2;
		this.distance = this.distance +1;
		updateStatus(this.KezdetiViz);
		this.KezdetiViz = updateViz(KezdetiViz);
		System.out.println(name +" megtett: "+distance+" tavolsagot");
		
	}

	@Override
	public void esos() {
		KezdetiViz = KezdetiViz + 3;
		updateStatus(KezdetiViz);
		KezdetiViz = updateViz(KezdetiViz);
		distance = distance +1;
		System.out.println(name +" megtett: "+distance+" tavolsagot");
	}

	@Override
	public void felhos() {
		KezdetiViz = KezdetiViz -1;
		updateStatus(KezdetiViz);
		KezdetiViz = updateViz(KezdetiViz);
		distance = distance +2;
		System.out.println(name +" megtett: "+distance+" tavolsagot");
	}
}
