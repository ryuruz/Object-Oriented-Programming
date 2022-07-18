class TV{
	private int size;
	public TV(int size) {this.size = size;}
	protected int getSize() {return size;}
}

class ColorTV extends TV{
	public int color;
	
	public ColorTV(int inch, int color){
		super(inch);
		this.color = color;
	}
	
	public void printProperty() {
		System.out.println(getSize()+"인치 "+color+"컬러");
	}
	
	public static void main(String[] args) {
		ColorTV mytv = new ColorTV(32,1024);
		mytv.printProperty();
			
	}
}
