package com.jadgroup.kotlinmvvm.viewmodel


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jadgroup.kotlinmvvm.model.User

class ViewModelMainActivity() : ViewModel() {
    private var userData: MutableLiveData<User> = MutableLiveData();
    init {
        populate();
    }
    fun getUsersData(): MutableLiveData<User> {
        return this.userData
    }

    private fun populate() {
        // call your Rest API or whatever and populate your data
        val user=User();
        user.email = "abd@gmail.com";
        user.password= "xyz";
        this.userData.value = user;
    }

}

