package pojo;

public class Ball {
	
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	private Integer size;
	private Integer weight;
	private String color;
	/**
	 * @param size
	 * @param weight
	 * @param color
	 */
	public Ball(Integer size, Integer weight, String color) {
	
		this.size = size;
		this.weight = weight;
		this.color = color;
	}
	
}
