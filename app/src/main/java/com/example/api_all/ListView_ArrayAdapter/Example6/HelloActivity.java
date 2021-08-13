package com.example.api_all.ListView_ArrayAdapter.Example6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.api_all.ListView_ArrayAdapter.Example6.adapter.ProductAdapter;
import com.example.api_all.ListView_ArrayAdapter.Example6.model.Product;
import com.example.api_all.R;

import java.util.ArrayList;
import java.util.List;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        ArrayList<Product> products = new ArrayList<>();
        if (products.size() == 0) {
            products.add(new Product("Картовель", "кг"));
            products.add(new Product("Картовель", "кг"));
            products.add(new Product("Картовель", "кг"));
            products.add(new Product("Картовель", "кг"));
            products.add(new Product("Картовель", "кг"));
            products.add(new Product("Картовель", "кг"));
            products.add(new Product("Картовель", "кг"));
        }
        ListView productList = findViewById(R.id.productList);
        ProductAdapter adapter = new ProductAdapter(this, R.layout.hello_item, products);
        productList.setAdapter(adapter);
    }
}