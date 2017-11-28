package model;

public class Interval {
	private int intensity;
	private double time;

	public Interval(int intensity, double time) {
		this.setIntensity(intensity);
		this.setTime(time);
	}

	public int getIntensity() {
		return intensity;
	}

	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

}
