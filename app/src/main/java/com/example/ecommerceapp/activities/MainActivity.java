package com.example.ecommerceapp.activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.ecommerceapp.R;
import com.example.ecommerceapp.adapters.CategoryAdapter;
import com.example.ecommerceapp.adapters.ProductAdapter;
import com.example.ecommerceapp.databinding.ActivityMainBinding;
import com.example.ecommerceapp.model.Category;
import com.example.ecommerceapp.model.Product;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    CategoryAdapter categoryAdapter;
    ArrayList<Category> categories;

    ProductAdapter productAdapter;
    ArrayList<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        EdgeToEdge.enable(this);

        setContentView(binding.getRoot());


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        initCategories();
        initProduct();
    }

    void initCategories(){
        categories = new ArrayList<>();

        categories.add(new Category("Babies and Toys", "#fe438e","https://th.bing.com/th/id/OIP.L9fHBvqaEe0XucXKBONxtgHaE7?rs=1&pid=ImgDetMain",1,"Some Description"));
        categories.add(new Category("Babies and Toys", "#fe438e","https://th.bing.com/th/id/OIP.L9fHBvqaEe0XucXKBONxtgHaE7?rs=1&pid=ImgDetMain",1,"Some Description"));

        categories.add(new Category("Babies and Toys", "#fe438e","https://th.bing.com/th/id/OIP.L9fHBvqaEe0XucXKBONxtgHaE7?rs=1&pid=ImgDetMain",1,"Some Description"));

        categories.add(new Category("Babies and Toys", "#fe438e","https://th.bing.com/th/id/OIP.L9fHBvqaEe0XucXKBONxtgHaE7?rs=1&pid=ImgDetMain",1,"Some Description"));

        categories.add(new Category("Babies and Toys", "#fe438e","https://th.bing.com/th/id/OIP.L9fHBvqaEe0XucXKBONxtgHaE7?rs=1&pid=ImgDetMain",1,"Some Description"));

        categories.add(new Category("Babies and Toys", "#fe438e","https://th.bing.com/th/id/OIP.L9fHBvqaEe0XucXKBONxtgHaE7?rs=1&pid=ImgDetMain",1,"Some Description"));

        categories.add(new Category("Babies and Toys", "#fe438e","https://th.bing.com/th/id/OIP.L9fHBvqaEe0XucXKBONxtgHaE7?rs=1&pid=ImgDetMain",1,"Some Description"));

        categories.add(new Category("Babies and Toys", "#fe438e","https://th.bing.com/th/id/OIP.L9fHBvqaEe0XucXKBONxtgHaE7?rs=1&pid=ImgDetMain",1,"Some Description"));


        categoryAdapter = new CategoryAdapter(categories,this);


        GridLayoutManager layoutManager = new GridLayoutManager(this,4);
        binding.categoriesList.setLayoutManager(layoutManager);
        binding.categoriesList.setAdapter(categoryAdapter);
    }


    void initProduct() {
        products = new ArrayList<>();

        products.add(new Product(10, 1, "https://i.pinimg.com/564x/c1/1d/16/c11d164de692594acf53c9a855093139.jpg", "White T-shirt", 1000, "", 10));

        products.add(new Product(5, 2, "https://media.gq.com/photos/654a66099efb7efc0873124f/3:4/w_748%2Cc_limit/Straight-Leg-Pant.jpg", "Pants", 850, "", 5));

        products.add(new Product(10, 3, "https://m.media-amazon.com/images/I/718mkaH0USL.AC_UY1100.jpg", "Baggy Pants", 1000, "", 10));

        products.add(new Product(10, 4, "https://assets.vogue.com/photos/641b4f46036bf43d1c7c315a/3:4/w_748%2Cc_limit/slide_14.jpg", "Women Pants", 900, "", 10));

        products.add(new Product(10, 5, "https://images-cdn.ubuy.co.in/6560db8a83321d0fe272bba7-mens-shirts-summer-cotton-linen-solid.jpg", "Blue shirt", 800, "", 10));

        productAdapter = new ProductAdapter(this, products);

//        getRecentProducts();

        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        binding.productList.setLayoutManager(layoutManager);
        binding.productList.setAdapter(productAdapter);
    }


}