package limchangwook;

public  class Car implements Valuable  {
	String name;
	private double price;
	
	public Car (String name, double price){
		this.name=name;
		this.price=price;
	}
	
	public double getPrice () {
		return price;
	}
	protected void setPrice(double price){
		this.price= price;
	}
	@Override
	public double EstimateValue(int month) {
		return (getPrice()*0.8)*Math.pow(0.99,month);
	}
	@Override
	public double EstimateValue() {
		return (getPrice()*0.8)*Math.pow(0.99,1);
	}
	public String toString(){
		return String.format("car name: %s\ninitial price: %.2f",name,price);
}

}
