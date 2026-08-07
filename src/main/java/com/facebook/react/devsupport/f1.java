package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.fbreact.specs.NativeRedBoxSpec;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/devsupport/f1;", "Ljn/h;", "Lpn/e;", "devSupportManager", "<init>", "(Lpn/e;)V", "", "appKey", "Ljn0/h0;", "c", "(Ljava/lang/String;)V", "", "b", "()Z", DateTokenConverter.CONVERTER_KEY, "()V", "show", "hide", "a", "Lpn/e;", "Lcom/facebook/react/devsupport/i0;", "Lcom/facebook/react/devsupport/i0;", "doubleTapReloadRecognizer", "Landroid/app/Dialog;", "Landroid/app/Dialog;", "dialog", "Lcom/facebook/react/devsupport/d1;", "Lcom/facebook/react/devsupport/d1;", "redBoxContentView", "e", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f1 implements jn.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pn.e devSupportManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i0 doubleTapReloadRecognizer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Dialog dialog;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private d1 redBoxContentView;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.f1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/devsupport/f1$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "Ljava/lang/Runnable;", "runnable", "Ljn0/h0;", "b", "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/Runnable;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.facebook.react.devsupport.f1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"com/facebook/react/devsupport/f1$a$a", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Ljn0/h0;", "onHostResume", "()V", "onHostPause", "onHostDestroy", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0449a implements LifecycleEventListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f22476a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ReactContext f22477b;

            C0449a(Runnable runnable, ReactContext reactContext) {
                this.f22476a = runnable;
                this.f22477b = reactContext;
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostDestroy() {
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostPause() {
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostResume() {
                this.f22476a.run();
                this.f22477b.removeLifecycleEventListener(this);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(ReactContext reactContext, Runnable runnable) {
            reactContext.addLifecycleEventListener(new C0449a(runnable, reactContext));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/facebook/react/devsupport/f1$b", "Landroid/app/Dialog;", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "Landroid/os/Bundle;", "savedInstanceState", "Ljn0/h0;", "onCreate", "(Landroid/os/Bundle;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends Dialog {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1 f22478a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, f1 f1Var, int i11) {
            super(activity, i11);
            this.f22478a = f1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final WindowInsetsCompat b(int i11, View view, WindowInsetsCompat windowInsetsCompat) {
            p013kotlin.jvm.internal.s.k(view, "view");
            p013kotlin.jvm.internal.s.k(windowInsetsCompat, "windowInsetsCompat");
            k5.e eVarF = windowInsetsCompat.f(i11);
            p013kotlin.jvm.internal.s.j(eVarF, "getInsets(...)");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            p013kotlin.jvm.internal.s.i(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((FrameLayout.LayoutParams) layoutParams).setMargins(eVarF.f84924a, eVarF.f84925b, eVarF.f84926c, eVarF.f84927d);
            return WindowInsetsCompat.f7692b;
        }

        @Override // android.app.Dialog
        protected void onCreate(Bundle savedInstanceState) {
            Window window = getWindow();
            if (window == null) {
                throw new IllegalStateException("Required value was null.");
            }
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
            final int iH = WindowInsetsCompat.n.h() | WindowInsetsCompat.n.b();
            d1 d1Var = this.f22478a.redBoxContentView;
            if (d1Var == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ViewCompat.E0(d1Var, new androidx.core.view.a0() { // from class: com.facebook.react.devsupport.g1
                @Override // androidx.core.view.a0
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return f1.b.b(iH, view, windowInsetsCompat);
                }
            });
        }

        @Override // android.app.Dialog, android.view.KeyEvent.Callback
        public boolean onKeyUp(int keyCode, KeyEvent event) {
            p013kotlin.jvm.internal.s.k(event, "event");
            if (keyCode == 82) {
                this.f22478a.devSupportManager.r();
                return true;
            }
            if (this.f22478a.doubleTapReloadRecognizer.b(keyCode, getCurrentFocus())) {
                this.f22478a.devSupportManager.C();
            }
            return super.onKeyUp(keyCode, event);
        }
    }

    public f1(pn.e devSupportManager) {
        p013kotlin.jvm.internal.s.k(devSupportManager, "devSupportManager");
        this.devSupportManager = devSupportManager;
        this.doubleTapReloadRecognizer = new i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(f1 f1Var) {
        f1Var.show();
    }

    @Override // jn.h
    public boolean a() {
        Dialog dialog = this.dialog;
        return dialog != null && dialog.isShowing();
    }

    @Override // jn.h
    public boolean b() {
        return this.redBoxContentView != null;
    }

    @Override // jn.h
    public void c(String appKey) {
        p013kotlin.jvm.internal.s.k(appKey, "appKey");
        pn.j jVarO = this.devSupportManager.o();
        Activity currentActivity = this.devSupportManager.getCurrentActivity();
        if (currentActivity != null && !currentActivity.isFinishing()) {
            d1 d1Var = new d1(currentActivity, this.devSupportManager, jVarO);
            d1Var.d();
            this.redBoxContentView = d1Var;
            return;
        }
        String strU = this.devSupportManager.u();
        if (strU == null) {
            strU = "N/A";
        }
        qk.a.m("ReactNative", "Unable to launch redbox because react activity is not available, here is the error that redbox would've displayed: " + strU);
    }

    @Override // jn.h
    public void d() {
        this.redBoxContentView = null;
    }

    @Override // jn.h
    public void hide() {
        try {
            Dialog dialog = this.dialog;
            if (dialog != null) {
                dialog.dismiss();
            }
        } catch (IllegalArgumentException e11) {
            qk.a.n("ReactNative", "RedBoxDialogSurfaceDelegate: error while dismissing dialog: ", e11);
        }
        d();
        this.dialog = null;
    }

    @Override // jn.h
    public void show() {
        String strU = this.devSupportManager.u();
        Activity currentActivity = this.devSupportManager.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            ReactContext reactContextH = this.devSupportManager.h();
            if (reactContextH != null) {
                INSTANCE.b(reactContextH, new Runnable() { // from class: com.facebook.react.devsupport.e1
                    @Override // java.lang.Runnable
                    public final void run() {
                        f1.i(this.f22468a);
                    }
                });
                return;
            }
            if (strU == null) {
                strU = "N/A";
            }
            qk.a.m("ReactNative", "Unable to launch redbox because react activity and react context is not available, here is the error that redbox would've displayed: " + strU);
            return;
        }
        d1 d1Var = this.redBoxContentView;
        if ((d1Var != null ? d1Var.getContext() : null) != currentActivity) {
            c(NativeRedBoxSpec.NAME);
        }
        d1 d1Var2 = this.redBoxContentView;
        if (d1Var2 != null) {
            d1Var2.g();
        }
        if (this.dialog == null) {
            b bVar = new b(currentActivity, this, com.facebook.react.q.f22913c);
            bVar.requestWindowFeature(1);
            d1 d1Var3 = this.redBoxContentView;
            if (d1Var3 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            bVar.setContentView(d1Var3);
            this.dialog = bVar;
        }
        Dialog dialog = this.dialog;
        if (dialog != null) {
            dialog.show();
        }
    }
}
