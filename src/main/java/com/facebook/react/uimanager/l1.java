package com.facebook.react.uimanager;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ReadableArray;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0017¢\u0006\u0004\b\u000b\u0010\nJ)\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH'¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b\u0011\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/l1;", "Landroid/view/View;", "T", "", "view", "", "propName", "value", "Ljn0/h0;", "b", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V", DateTokenConverter.CONVERTER_KEY, "commandName", "Lcom/facebook/react/bridge/ReadableArray;", "args", "c", "(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface l1<T extends View> {
    @jn0.e
    default void a(T view, String commandName, ReadableArray args) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (commandName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        c(view, commandName, args);
    }

    /* synthetic */ void b(View view, String propName, Object value);

    /* synthetic */ void c(View view, String commandName, ReadableArray args);

    @jn0.e
    default void d(T view, String propName, Object value) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (propName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        b(view, propName, value);
    }
}
