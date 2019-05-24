package progTechBead1;

public class Homokjaro implements Leny {
	String name;
	int KezdetiViz;
	int distance;
	boolean isAlive;
	final int maxViz=8;
	
	public Homokjaro(String name, int KezdetiViz) {
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

	@Override
	public void napos() {
		this.KezdetiViz = this.KezdetiViz-1;
		updateStatus(this.KezdetiViz);
		this.KezdetiViz = updateViz(this.KezdetiViz);
		this.distance = this.distance +3;
		System.out.println(name +" megtett: "+this.distance+" tavolsagot");
		
	}

	@Override
	public void esos() {
		KezdetiViz = KezdetiViz + 3;
		updateStatus(KezdetiViz);
		KezdetiViz = updateViz(KezdetiViz);
		distance = distance +0;
		System.out.println(name +" megtett: "+distance+" tavolsagot");
	}

	@Override
	public void felhos() {
		KezdetiViz = KezdetiViz +0;
		updateStatus(KezdetiViz);
		KezdetiViz = updateViz(KezdetiViz);
		distance = distance +1;
		System.out.println(name +" megtett: "+distance+" tavolsagot");
	}

}
