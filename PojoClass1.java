package com.programming.class_10;

import java.util.ArrayList;

import java.util.List;

 

class Product{

    private String P_name;
    private int P_id;
    private double P_price;
    private double P_quantity;

    

    

    public Product(String P_name, int P_id, int P_price, int P_quantity) {

        this.P_name=P_name;

        this.P_id=P_id;

        this.P_price=P_price;

        this.P_quantity=P_quantity;

    }

 

    public String getP_name() {

        return P_name;

    }

 

    public void setP_name(String p_name) {

        P_name = p_name;

    }

 

    public int getP_id() {

        return P_id;

    }

 

    public void setP_id(int p_id) {

        P_id = p_id;

    }

    

public double getP_price() {

        return P_price;

    }

 

    public void setP_price(int p_price) {

        P_price = p_price;

    }

 

    public double getP_quantity() {

        return P_quantity;

    }

 

    public void setP_quantity(int p_quantity) {

        P_quantity = p_quantity;

    }

}

interface ProductDAO1{

    //public list<Product> getAll

    public List<Product> getAllProducts();

    public Product getProductbyId(int P_id);

    public  List<Product> getProductbyPrice(int prod_price);

    public Product getProductbyQuantity(int P_quantity);

    

    //Check using OPtional class whether product is present as null or not

    

}

class ProductDAOimp implements ProductDAO1{

    List<Product> products;

    public ProductDAOimp() {

        products=new ArrayList<>();

        Product p1=new Product("Amul",125,48,2);

        Product p2=new Product("Nestle",145,68,7);

        Product p3=new Product("Hersheys",128,486,28);

        products.add(p1);products.add(p2);products.add(p3);        

    }
    
    public Optional<Product> getProductAsNullOrNot(String productName){

        List<Product> products = new ArrayList<>();

        for (Product product : products) {

            if (product.getProductName().equalsIgnoreCase(productName)) {

                return Optional.of(product); // Product found, return it wrapped in Optional

            }

        }

        return Optional.ofNullable(null);

//        Product product = products.get(productName);

//        Optional<Product> opt = Optional.ofNullable(product);

//        return opt;

 

    }

    @Override

    public List<Product> getAllProducts() {

        // TODO Auto-generated method stub

        return products;

    }

    @Override

    public Product getProductbyId(int P_id) {

        // TODO Auto-generated method stub

        return products.get(P_id);

    }

    @Override

    public List<Product> getProductbyPrice(int prod_price){

        // TODO Auto-generated method stub

        return products;

    }

    @Override

    public Product getProductbyQuantity( int P_quantity) {

        // TODO Auto-generated method stub

        return products.get((int) P_quantity);

    }

}

public class PojoClass1 {

 

    public static void main(String[] args) {

        ProductDAO1 productdao=new ProductDAOimp();

        for(Product pr:productdao.getAllProducts()) {

            System.out.print(" Productid= "+pr.getP_id());

            System.out.print(" Productname= "+pr.getP_name());

            System.out.print(" Productprice= "+pr.getP_price());

            System.out.print(" Productquantity= "+pr.getP_quantity());

            System.out.println();

            //Product product1=productdao.getAllProducts().get(0);

            //System.out.println("First product is "+product1.getP_id()+" "+product1.getP_name());

        

            

}}}