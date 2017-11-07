package com.puzzlebench.kotlintraininglevel_1.ui

import java.lang.ref.WeakReference
import kotlin.reflect.KProperty

/**
 * Created by andres.serrano on 6/11/2017.
 */
fun <T> weak(value: T) = WeakRef(value)

class WeakRef<out T>(value: T) {
    private val weakReference: WeakReference<T> = WeakReference(value)
    operator fun getValue(thisRef: Any, property: KProperty<*>): T? = weakReference.get()
}