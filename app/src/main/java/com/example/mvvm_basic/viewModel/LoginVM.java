package com.example.mvvm_basic.viewModel;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;

import com.example.mvvm_basic.BR;
import com.example.mvvm_basic.model.User;

public class LoginVM extends BaseObservable {
    private String email;
    private String password;
    public ObservableField<String> messageLogin = new ObservableField<>();
    public ObservableField<Boolean> isShowMSG = new ObservableField<>();
    public ObservableField<Boolean> isSuccess = new ObservableField<>();

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    public void onClickLogin () {
        User user = new User(getEmail(),getPassword());
        isShowMSG.set(true);
        if(user.isValidEmail() && user.isValidPassword()){
            messageLogin.set("Login success");
            isSuccess.set(true);
        } else {
            messageLogin.set("Email or Password invalid !!!");
            isSuccess.set(false);
        }
    }


}
