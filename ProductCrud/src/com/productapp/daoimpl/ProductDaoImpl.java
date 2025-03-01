package com.productapp.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.productapp.dao.ProductDao;
import com.productapp.model.Product;
import com.productapp.utility.SqlUtil;

public class ProductDaoImpl implements ProductDao {

    @Override
    public int save(Product product) {
        int result = -1;
        try {
            SqlUtil.connectionDb();  // Establish database connection
            
            // Insert product into the database
            String qry = "INSERT INTO products (id, name, price) VALUES (" 
                         + product.getId() + ", '" 
                         + product.getName() + "', " 
                         + product.getPrice() + ")";
                         
            result = SqlUtil.insert(qry);  // Execute the query
            
        } catch (Exception e) {
            System.out.println("Error in saving product: " + e.getMessage());
        } finally {
            try {
                SqlUtil.close();  // Close the connection
            } catch (SQLException e) {
                System.out.println("Error in closing resources: " + e.getMessage());
            }
        }
        return result;  // Return the result of the operation
    }

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        ResultSet rs = null;

        try {
            SqlUtil.connectionDb();  // Establish database connection
            
            String qry = "SELECT * FROM products";
            rs = SqlUtil.fetch(qry);  // Fetch the data from the database
            
            // Check if ResultSet is not null and process it
            if (rs != null) {
                while (rs.next()) { // Process the result set
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    float price = rs.getFloat("price");
                    
                    // Create a product object and add it to the list
                    products.add(new Product(id, name, price));
                }
            } else {
                System.out.println("No products found.");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Error in loading database driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error in fetching products: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();  // Close the ResultSet
                SqlUtil.close();  // Close the connection
            } catch (SQLException e) {
                System.out.println("Error in closing resources: " + e.getMessage());
            }
        }

        return products;  // Return the list of products
    }

	@Override
	public Product getById(int id) {
		
		return null;
	}

	@Override
	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int id, Product product) {
		// TODO Auto-generated method stub
		return 0;
	}
