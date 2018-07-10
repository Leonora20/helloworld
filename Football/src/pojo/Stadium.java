package pojo;

public class Stadium {
	
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Integer getBreadth() {
		return breadth;
	}
	public void setBreadth(Integer breadth) {
		this.breadth = breadth;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private Integer length;
	private Integer breadth;
	private Integer height;
	private Integer capacity;
	private String name;
	/**
	 * @param length
	 * @param breadth
	 * @param height
	 * @param capacity
	 * @param name
	 */
	public Stadium(Integer length, Integer breadth, Integer height, Integer capacity, String name) {
	
		
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		this.capacity = capacity;
		this.name = name;
	}
	
}
