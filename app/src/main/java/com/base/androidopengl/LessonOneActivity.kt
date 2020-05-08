package com.base.androidopengl

import android.app.ActivityManager
import android.content.Context
import android.opengl.GLSurfaceView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LessonOneActivity : AppCompatActivity() {
    private val glSurfaceView: GLSurfaceView by lazy {
        return@lazy GLSurfaceView(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val glVersion = isSupportOpenGL()
        if (glVersion) {
            //选择一个客户端版本 openGL 2.0
            glSurfaceView.setEGLContextClientVersion(2)
            //设置一个渲染器
            glSurfaceView.setRenderer(LessonOneRenderer())
        } else {
            return
        }
    }

    /**
     * 获取是否支持OpenGl2.x
     */
    private fun isSupportOpenGL(): Boolean {
        val activityManager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val glVersion = activityManager.deviceConfigurationInfo.reqGlEsVersion
        return glVersion >= 0x20000
    }

    override fun onResume() {
        super.onResume()
        glSurfaceView.onResume()
    }

    override fun onPause() {
        super.onPause()
        glSurfaceView.onPause()
    }
}
