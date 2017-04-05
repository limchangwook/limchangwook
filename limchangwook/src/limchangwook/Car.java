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
		setPrice(price*0.8);
		setPrice(price*Math.pow(0.99,month));
		return getPrice();
	}
	public String toString(){
		return String.format("car name: %s\ninitial price: %.2f",name,price);
}

}
