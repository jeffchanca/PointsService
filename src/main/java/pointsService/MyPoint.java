package pointsService;

public class MyPoint {

	private int totalPoints;
	private int usedPoints;
	
	public int getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
	public int getUsedPoints() {
		return usedPoints;
	}
	public void setUsedPoints(int usedPoints) {
		this.usedPoints = usedPoints;
	}
	
	public int getRemainingPoints() {
		return this.totalPoints - this.usedPoints;
	}
}

