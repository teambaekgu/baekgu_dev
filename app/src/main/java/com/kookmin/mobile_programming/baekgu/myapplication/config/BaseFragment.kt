package com.kookmin.mobile_programming.baekgu.myapplication.config

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import java.text.SimpleDateFormat
import java.util.*

// Fragment의 기본을 작성, 뷰 바인딩 활용
abstract class BaseFragment<B : ViewBinding>(
    private val bind: (View) -> B,
    @LayoutRes layoutResId: Int
) : Fragment(layoutResId) {
    private var _binding: B? = null
    private val toastList = arrayListOf<Toast>()

    protected val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = bind(super.onCreateView(inflater, container, savedInstanceState)!!)
        return binding.root
    }

    override fun onStop() {
        for (toast in toastList) {
            toast.cancel()
        }
        toastList.clear()
        super.onStop()
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    fun showCustomToast(message: String) {
        val toast = Toast.makeText(activity, message, Toast.LENGTH_SHORT)
        toast.show()
        toastList.add(toast)
    }

    fun showLoadingDialog(context: Context) {
    }

    fun dismissLoadingDialog() {
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

}