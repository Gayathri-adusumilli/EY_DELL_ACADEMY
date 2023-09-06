package com.programming.class_1;
import java.util.ArrayList;

import java.util.Iterator;

import java.util.List;

 

class Product {

    private int product_id;

    private String Product_name;

    private int Product_price;

    private String Product_sku;

 

    public int getProduct_id() {

        return product_id;

    }

 

    public void setProduct_id(int product_id) {

        this.product_id = product_id;

    }

 

    public String getProduct_name() {

        return Product_name;

    }

 

    public void setProduct_name(String product_name) {

        Product_name = product_name;

    }

 

    public int getProduct_price() {

        return Product_price;

    }

 

    public void setProduct_price(int product_price) {

        Product_price = product_price;

    }

 

    public String getProduct_sku() {

        return Product_sku;

    }

 

    public void setProduct_sku(String product_sku) {

        Product_sku = product_sku;

    }

 

    public Product(int product_id, String product_name, int product_price, String product_sku) {

 

        this.product_id = product_id;

        Product_name = product_name;

        Product_price = product_price;

        Product_sku = product_sku;

    }

 

    @Override

    public String toString() {

        return "Product [product_id=" + product_id + ", Product_name=" + Product_name + ", Product_price="

                + Product_price + ", Product_sku=" + Product_sku + "]";

    }

 

}

 

interface ProductDAO {

 

    public List<Product> getAlloProduct();

 

    public List<Product> getProduct(int product_id);

 

    public void updateProduct(Product p);

 

    public void deleteProduct(Product p);

 

    public Product[] getAllProduct();

 

    public Product[] getProductById(Product p);

 

}

 

class ProductDAOImp1 implements ProductDAO {

    List<Product> products;

    private Product[] Product;

 

    public ProductDAOImp1() {

        products = new ArrayList<>();

        Product pr1 = new Product(1, "ABC", 123, "Mobile");

        Product pr2 = new Product(2, "XYZ", 456, "Tab");

        products.add(pr1);

        products.add(pr2);

 

        Iterator<Product> itr = products.iterator();

        while (itr.hasNext()) {

            Product p = itr.next();

            System.out.println(p.toString());

        }

    }

    // List<Product> giveMeProductByOwner = pr1.getProductByOwner(pr1);

 

    @Override

    public List<Product> getAlloProduct() {

 

        return products;

    }

 

    @Override

    public List<Product> getProduct(int product_id) {

        // TODO Auto-generated method stub

        return products;

    }

 

    @Override

    public void updateProduct(Product p) {

        // TODO Auto-generated method stub

 

    }

 

    @Override

    public void deleteProduct(Product p) {

        // TODO Auto-generated method stub

 

    }

 

    @Override

    public Product[] getAllProduct() {

        // TODO Auto-generated method stub

        return null;

    }

 

    @Override

    public Product[] getProductById(Product pr1) {

        // TODO Auto-generated method stub

        System.out.println("" + pr1.getProduct_id());

        if (pr1 != null) {

            return Product;

        }

        return null;

 

    }

 

}

 

public class PojoClass {

 

    public static void main(String[] args) {

//        Product p1 = new Product(1, "Iphone", 76000, "Mobile");

//        System.out.println(p1);

        ProductDAO productDao = new ProductDAOImp1();

        for (Product st : productDao.getAlloProduct()) {

            System.out.println("student [stu id" + st.getProduct_id() + "]");

 

            productDao.getProduct(0);

 

        }

 

    }

}

