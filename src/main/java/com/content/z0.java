package com.content;

import android.app.Activity;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.uimanager.v0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/reactnativestripesdk/z0;", "Landroid/widget/FrameLayout;", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/uimanager/v0;)V", "", "value", "Ljn0/h0;", "setKeyboardShouldPersistTaps", "(Z)V", "Landroid/view/MotionEvent;", "event", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "a", "Lcom/facebook/react/uimanager/v0;", "b", "Z", "keyboardShouldPersistTapsValue", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v0 context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean keyboardShouldPersistTapsValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(v0 context) {
        super(context);
        s.k(context, "context");
        this.context = context;
        this.keyboardShouldPersistTapsValue = true;
        getRootView().setFocusable(true);
        getRootView().setFocusableInTouchMode(true);
        getRootView().setClickable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        s.h(event);
        if (event.getAction() == 0 && !this.keyboardShouldPersistTapsValue) {
            Activity currentActivity = this.context.getCurrentActivity();
            s.h(currentActivity);
            View currentFocus = currentActivity.getCurrentFocus();
            if (currentFocus instanceof EditText) {
                Rect rect = new Rect();
                EditText editText = (EditText) currentFocus;
                editText.getGlobalVisibleRect(rect);
                if (!rect.contains((int) event.getRawX(), (int) event.getRawY())) {
                    Object systemService = this.context.getSystemService("input_method");
                    s.i(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
                    getRootView().requestFocus();
                }
            }
        }
        return super.dispatchTouchEvent(event);
    }

    public final void setKeyboardShouldPersistTaps(boolean value) {
        this.keyboardShouldPersistTapsValue = value;
    }
}
