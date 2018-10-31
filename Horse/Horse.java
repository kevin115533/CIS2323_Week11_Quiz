package Horse;

public class Horse{
	private String name;
	private String color;
	private int birthYear;
	
	public void setName(String x){
		name = x;
	}
	
	public void setColor(String x){
		color = x;
	}
	
	public void setYear(int x){
		birthYear = x;
	}
	
	public String getName(){
		return name;
	}
	
	public String getColor(){
		return color;
	}
	
	public int getYear(){
		return birthYear;
	}

}