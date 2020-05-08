package com.base.androidopengl

import android.opengl.GLSurfaceView
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

/**
 * 着色器：计算机程序，用来处理图像浓淡的工具，后来演化为可以进行CG动画的处理以及影视后期的处理工具
 * 顶点：储存一组绘图需要使用的绘图元素
 */
class LessonOneRenderer : GLSurfaceView.Renderer {
    /**
     * 每当绘制新帧的时候调用
     */
    override fun onDrawFrame(gl: GL10?) {
        TODO("Not yet implemented")
    }

    /**
     * 页面改变时会被调用，例如：横竖屏切换
     */
    override fun onSurfaceChanged(gl: GL10?, width: Int, height: Int) {
        TODO("Not yet implemented")
    }

    /**
     * 页面第一次调用的时候创建，如果我们失去上下文，系统重建的时候也会调用
     */
    override fun onSurfaceCreated(gl: GL10?, config: EGLConfig?) {
        TODO("Not yet implemented")
    }

}
