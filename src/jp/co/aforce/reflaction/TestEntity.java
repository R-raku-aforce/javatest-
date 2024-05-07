package jp.co.aforce.reflaction;

//statement
public class TestEntity {
	
	//（method）  constructor
	public TestEntity(String id,String name) {
		
		//no operaction
		super();
		
		//reset
		this.id = id;
		this.name = name;
	}
	
	//encapsulation
	private String id;
	private String name;
	
	//getter
	public String getId() {
		return id;
	}
	
	//setter
	public void setId(String id) {
		this.id = id;
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
}
