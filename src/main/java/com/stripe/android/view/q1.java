package com.stripe.android.view;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/q1;", "", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Ljn0/h0;", "a", "()V", "Landroid/app/Activity;", "Landroid/view/inputmethod/InputMethodManager;", "b", "Landroid/view/inputmethod/InputMethodManager;", "inputMethodManager", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Activity activity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InputMethodManager inputMethodManager;

    public q1(Activity activity) {
        p013kotlin.jvm.internal.s.k(activity, "activity");
        this.activity = activity;
        Object systemService = activity.getSystemService("input_method");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.inputMethodManager = (InputMethodManager) systemService;
    }

    public final /* synthetic */ void a() {
        if (this.inputMethodManager.isAcceptingText()) {
            InputMethodManager inputMethodManager = this.inputMethodManager;
            View currentFocus = this.activity.getCurrentFocus();
            inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : null, 0);
        }
    }
}
