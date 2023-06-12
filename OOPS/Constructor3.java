package com.akash.OOPS;

public class Constructor3 {
    public static void main(String[] args) {
        Product pro=new Product("A25-44","pepsi",300,4);
        Customer cus=new Customer("P6-116","Scott","Wisconsin",36777284);
        System.out.println("Product details: ");
        System.out.print(pro.getItemno()+" ");
        System.out.print(pro.getName()+" ");
        System.out.print(pro.getPrice()+" ");
        System.out.println(pro.getQuty());
        System.out.println();
        System.out.println("Customer details: ");
        System.out.print(cus.getCustid()+" ");
        System.out.print(cus.getName()+" ");
        System.out.print(cus.getAddress()+" ");
        System.out.print(cus.getPhno());
    }
}

class Product{
    private String itemno;
    private String name;
    private int price;
    private double quty;

    Product(String itemno,String name,int p, double qt){
        this.itemno=itemno;
        this.name=name;
        setPrice(p);
        setQuty(qt);
    }
    public void setPrice(int p){
        price=p;
    }
    public int getPrice(){
        return price;
    }
    public void setQuty(double qt){
        quty =qt;
    }
    public double getQuty(){
        return quty;
    }
    public String getItemno(){
        return itemno;
    }
    public String getName(){
        return name;
    }
}

class Customer{
    private String custid;
    private String name;
    private String address;
    private int phno;

    Customer(String custid,String name,String add,int ph){
        this.custid=custid;
        this.name=name;
        setAddress(add);
        setPhno(ph);
    }
    public void setAddress(String add){
        address=add;
    }
    public void setPhno(int ph){
        phno=ph;
    }
    public String getCustid(){
        return custid;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getPhno(){
        return phno;
    }

}
