package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/facebook/react/uimanager/IllegalViewOperationException;", "Lcom/facebook/react/bridge/JSApplicationCausedNativeException;", "", "msg", "<init>", "(Ljava/lang/String;)V", "Landroid/view/View;", "view", "", "cause", "(Ljava/lang/String;Landroid/view/View;Ljava/lang/Throwable;)V", "a", "Landroid/view/View;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class IllegalViewOperationException extends JSApplicationCausedNativeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IllegalViewOperationException(String msg) {
        super(msg);
        p013kotlin.jvm.internal.s.k(msg, "msg");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IllegalViewOperationException(String msg, View view, Throwable cause) {
        super(msg, cause);
        p013kotlin.jvm.internal.s.k(msg, "msg");
        p013kotlin.jvm.internal.s.k(cause, "cause");
        this.view = view;
    }
}
