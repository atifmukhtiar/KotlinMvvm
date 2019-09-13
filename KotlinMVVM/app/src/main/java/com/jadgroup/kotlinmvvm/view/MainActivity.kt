package com.jadgroup.kotlinmvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.jadgroup.kotlinmvvm.R
import com.jadgroup.kotlinmvvm.model.User
import com.jadgroup.kotlinmvvm.viewmodel.ViewModelMainActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = ViewModelProviders.of(this)[ViewModelMainActivity::class.java]

        val userObserver = Observer<User> { user ->
            // Update the UI, in this case, a TextView.
            val textViewEmail: TextView = this.findViewById(R.id.txtViewEmail)
            textViewEmail.text = user.email;
            val textViewPassword: TextView = this.findViewById(R.id.txtViewPassword)
            textViewPassword.text = user.password;
        }

        model.getUsersData().observe(this, userObserver);

    }


}
