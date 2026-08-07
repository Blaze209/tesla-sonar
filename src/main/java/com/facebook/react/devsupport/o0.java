package com.facebook.react.devsupport;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/devsupport/o0;", "Ljn/h;", "Lpn/e;", "devSupportManager", "<init>", "(Lpn/e;)V", "", "appKey", "Ljn0/h0;", "c", "(Ljava/lang/String;)V", "", "b", "()Z", DateTokenConverter.CONVERTER_KEY, "()V", "show", "hide", "a", "Lpn/e;", "Landroid/view/View;", "Landroid/view/View;", "reactRootView", "Lcom/facebook/react/devsupport/n0;", "Lcom/facebook/react/devsupport/n0;", "dialog", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o0 implements jn.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pn.e devSupportManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private View reactRootView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private n0 dialog;

    public o0(pn.e devSupportManager) {
        p013kotlin.jvm.internal.s.k(devSupportManager, "devSupportManager");
        this.devSupportManager = devSupportManager;
    }

    @Override // jn.h
    public boolean a() {
        n0 n0Var = this.dialog;
        if (n0Var != null) {
            return n0Var.isShowing();
        }
        return false;
    }

    @Override // jn.h
    public boolean b() {
        return this.reactRootView != null;
    }

    @Override // jn.h
    public void c(String appKey) {
        p013kotlin.jvm.internal.s.k(appKey, "appKey");
        gn.a.b(p013kotlin.jvm.internal.s.f(appKey, "LogBox"), "This surface manager can only create LogBox React application");
        View viewB = this.devSupportManager.b("LogBox");
        this.reactRootView = viewB;
        if (viewB == null) {
            uo.c.b("Unable to launch logbox because react was unable to create the root view");
        }
    }

    @Override // jn.h
    public void d() {
        View view = this.reactRootView;
        if (view != null) {
            this.devSupportManager.e(view);
            this.reactRootView = null;
        }
    }

    @Override // jn.h
    public void hide() {
        n0 n0Var;
        if (a() && (n0Var = this.dialog) != null) {
            n0Var.dismiss();
        }
        View view = this.reactRootView;
        ViewGroup viewGroup = (ViewGroup) (view != null ? view.getParent() : null);
        if (viewGroup != null) {
            viewGroup.removeView(this.reactRootView);
        }
        this.dialog = null;
    }

    @Override // jn.h
    public void show() {
        if (a() || !b()) {
            return;
        }
        Activity currentActivity = this.devSupportManager.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            uo.c.b("Unable to launch logbox because react activity is not available, here is the error that logbox would've displayed: ");
            return;
        }
        n0 n0Var = new n0(currentActivity, this.reactRootView);
        this.dialog = n0Var;
        n0Var.setCancelable(false);
        n0Var.show();
    }
}
