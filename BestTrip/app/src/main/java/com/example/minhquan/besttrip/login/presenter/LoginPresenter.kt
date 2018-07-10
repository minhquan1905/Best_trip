package com.example.minhquan.besttrip.login.presenter

import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth
import android.support.v7.app.AppCompatActivity
import com.example.minhquan.besttrip.login.view.Login


class LoginPresenter(var viewlogin: Login) : AppCompatActivity() {

    fun login(email: EditText, password: EditText) {
        var mAuth: FirebaseAuth = FirebaseAuth.getInstance()
        mAuth.signInWithEmailAndPassword(email.text.toString(), password.text.toString())
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                       viewlogin.showLoginSuccess()
                    } else {
                       viewlogin.showLoginFail()
                    }
                }
    }


}