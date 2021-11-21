package com.example.riteshkumarsingh.weatherapplication

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
* 检测测试，将在安卓设备上执行。
 *
* 参见[测试文档]（http://d.android.com/tools/testing）。
 */
@RunWith（AndroidJUnit4：：class)
类示例仪器测试 {
@Test
    有趣的使用应用上下文() {
        //被测应用的上下文。
        val appContext = InstrumentationRegistry.getTargetContext（）
assertEquals（"com.example.riteshkumarsingh.githubuser"，appContext.packageName）
    }
}
