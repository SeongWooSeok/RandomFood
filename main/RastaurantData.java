package main;

public class RastaurantData {
	private String name; // 음식점 이름
	private String address; // 음식점 주소
	
	RastaurantData(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "RastaurantData [name=" + name + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
