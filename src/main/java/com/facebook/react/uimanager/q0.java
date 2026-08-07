package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/q0;", "", "Landroid/view/View;", "childView", "Landroid/view/MotionEvent;", "ev", "Ljn0/h0;", "a", "(Landroid/view/View;Landroid/view/MotionEvent;)V", DateTokenConverter.CONVERTER_KEY, "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface q0 {
    void a(View childView, MotionEvent ev2);

    void d(View childView, MotionEvent ev2);
}
