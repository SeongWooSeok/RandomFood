package main;

public class data {
	private String category; // 한식,중식,일식,양식
	private String spicy; //맵기
	private String type; // 종류
	
	data (String category,String spicy,String type){
		this.category = category;
		this.spicy = spicy;
		this.type = type;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSpicy() {
		return spicy;
	}
	public void setSpicy(String spicy) {
		this.spicy = spicy;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
