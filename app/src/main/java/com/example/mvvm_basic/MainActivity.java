package com.example.mvvm_basic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.mvvm_basic.databinding.ActivityMainBinding;
import com.example.mvvm_basic.viewModel.LoginVM;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        LoginVM loginVM = new LoginVM();
        activityMainBinding.setLoginVM(loginVM);
    }
}