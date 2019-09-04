package com.entity;

public class ProductInfo implements Cloneable{
	int id,num,status;
	String code,name,brand,pic,intro,bigpic;
	double price;
	
	ProductType type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getBigpic() {
		return bigpic;
	}
	public void setBigpic(String bigpic) {
		this.bigpic = bigpic;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ProductType getType() {
		return type;
	}
	public void setType(ProductType type) {
		this.type = type;
	}
	public ProductInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ProductInfo pi=(ProductInfo)super.clone();
		pi.setId(id);
		pi.setBigpic(bigpic);
		pi.setBrand(brand);
		pi.setCode(code);
		pi.setIntro(intro);
		pi.setName(name);
		pi.setNum(num);
		pi.setPic(bigpic);
		pi.setPrice(price);
		pi.setStatus(status);
		pi.setType((ProductType)type.clone());
		return pi;
	}	
	
}
