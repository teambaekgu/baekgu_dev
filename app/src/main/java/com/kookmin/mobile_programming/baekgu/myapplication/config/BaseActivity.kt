package com.kookmin.mobile_programming.baekgu.myapplication.config

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import java.text.SimpleDateFormat
import java.util.*

abstract class BaseActivity<B : ViewBinding>(private val inflate: (LayoutInflater) -> B) :
    AppCompatActivity() {
    protected lateinit var binding: B
        private set
    private val toastList = arrayListOf<Toast>()

    // 뷰 바인딩 객체를 받아서 inflate해서 화면을 만들어줌.
    // 즉 매번 onCreate에서 setContentView를 하지 않아도 됨.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStop() {
        for (toast in toastList) {
            toast.cancel()
        }
        toastList.clear()
        super.onStop()
    }

    // 로딩 다이얼로그, 즉 로딩창을 띄워줌.
    // 네트워크가 시작될 때 사용자가 무작정 기다리게 하지 않기 위해 작성.
    fun showLoadingDialog(context: Context) {
    }
    // 띄워 놓은 로딩 다이얼로그를 없앰.
    fun dismissLoadingDialog() {
    }

    // 토스트를 쉽게 띄울 수 있게 해줌.
    fun showCustomToast(message: String) {
        val toast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
        toast.show()
        toastList.add(toast)
    }




    fun calculationTime(feedCreated:String):String{
        var start = System.currentTimeMillis()
        val date = Date(start)
        val allFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        val mFormat = SimpleDateFormat("HH:mm:ss")
        val time = mFormat.format(date)
        val allTime=allFormat.format(date)

        var timeCurrent=time.split(":")
        var yearsCurrent=allTime.split(" ")[0].split("-")

        var timeFeed=feedCreated.split(" ")[1].split(":") // 시,분,초
        var yearsFeed=feedCreated.split(" ")[0].split("-") // 연도,월,일

        if(yearsCurrent[0]!=yearsFeed[0]){ // 1년이상 차이날때
            return feedCreated.split(" ")[0]
        }else if(Math.abs((yearsCurrent[1].toInt()-yearsFeed[1].toInt()))>1){ // 1달이상 차이날때
            return feedCreated.split(" ")[0]
        }else if(Math.abs(yearsCurrent[2].toInt()-yearsFeed[2].toInt())>7){ // 7일이상 차이날때
            return feedCreated.split(" ")[0]
        }else if(Math.abs(yearsCurrent[2].toInt()-yearsFeed[2].toInt())>0){ // 7일이하 1일이상 차이날떄
            var temp=Math.abs(yearsCurrent[2].toInt()-yearsFeed[2].toInt())
            return "${temp}일전"
        }else if(Math.abs(timeCurrent[0].toInt()-timeFeed[0].toInt())>0){ // 1시간이상 차이날때
            return "${Math.abs(timeCurrent[0].toInt()-timeFeed[0].toInt())}시간전"
        }else if(Math.abs(timeCurrent[1].toInt()-timeFeed[1].toInt())>0){ // 1분이상 차이날때
            return "${Math.abs(timeCurrent[1].toInt()-timeFeed[1].toInt())}분전"
        }else{
            return "${Math.abs(timeCurrent[2].toInt()-timeFeed[2].toInt())}초전"
        }
    }


    fun closeKeyboard(){
        val manager = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        if(currentFocus?.windowToken!=null){
            manager.hideSoftInputFromWindow(
                currentFocus!!.windowToken,
                InputMethodManager.HIDE_NOT_ALWAYS
            )
        }
    }
}