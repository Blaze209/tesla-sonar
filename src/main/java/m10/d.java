package m10;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.a0;
import androidx.core.view.z0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.uimanager.v0;
import f10.KeyboardAnimationCallbackConfig;
import f10.k;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\bJ\u0019\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\bJ\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010\u001dJ\u0015\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001a¢\u0006\u0004\b!\u0010\u001dJ\u0015\u0010\"\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\"\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u001e\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0016\u0010 \u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010,\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010(R*\u00102\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010(\u001a\u0004\b/\u00100\"\u0004\b1\u0010\u001dR\u0018\u00105\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010(R$\u0010=\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u0012\"\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010C¨\u0006E"}, d2 = {"Lm10/d;", "Lcom/facebook/react/views/view/e;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "<init>", "(Lcom/facebook/react/uimanager/v0;)V", "Ljn0/h0;", "t", "()V", "s", "q", "p", "n", "m", "k", "l", "Lf10/k;", "getKeyboardCallback", "()Lf10/k;", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "setEdgeToEdge", "", "isStatusBarTranslucent", "setStatusBarTranslucent", "(Z)V", "isNavigationBarTranslucent", "setNavigationBarTranslucent", "isPreservingEdgeToEdge", "setPreserveEdgeToEdge", "o", "a", "Lcom/facebook/react/uimanager/v0;", "getReactContext", "()Lcom/facebook/react/uimanager/v0;", "b", "Z", "c", DateTokenConverter.CONVERTER_KEY, "e", "isEdgeToEdge", "value", "f", "getActive", "()Z", "setActive", "active", "g", "Lcom/facebook/react/views/view/e;", "eventView", "h", "wasMounted", IntegerTokenConverter.CONVERTER_KEY, "Lf10/k;", "getCallback$react_native_keyboard_controller_release", "setCallback$react_native_keyboard_controller_release", "(Lf10/k;)V", "callback", "Lf10/l;", "j", "Lf10/l;", "config", "Li10/b;", "Li10/b;", "modalAttachedWatcher", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class d extends com.facebook.react.views.view.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v0 reactContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isStatusBarTranslucent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isNavigationBarTranslucent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isPreservingEdgeToEdge;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isEdgeToEdge;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean active;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private com.facebook.react.views.view.e eventView;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean wasMounted;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private k callback;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final KeyboardAnimationCallbackConfig config;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final i10.b modalAttachedWatcher;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class a extends p implements wn0.a<k> {
        a(Object obj) {
            super(0, obj, d.class, "getKeyboardCallback", "getKeyboardCallback()Lcom/reactnativekeyboardcontroller/listeners/KeyboardAnimationCallback;", 0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final k invoke() {
            return ((d) this.receiver).getCallback();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(v0 reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
        KeyboardAnimationCallbackConfig keyboardAnimationCallbackConfig = new KeyboardAnimationCallbackConfig(WindowInsetsCompat.n.h(), WindowInsetsCompat.n.c(), 1, this.isNavigationBarTranslucent);
        this.config = keyboardAnimationCallbackConfig;
        this.modalAttachedWatcher = new i10.b(this, reactContext, keyboardAnimationCallbackConfig, new a(this));
        f.f90930a.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getKeyboardCallback, reason: from getter */
    public final k getCallback() {
        return this.callback;
    }

    private final void k() {
        s();
        this.modalAttachedWatcher.c();
    }

    private final void l() {
        q();
        this.modalAttachedWatcher.b();
    }

    private final void m() {
        t();
        l();
    }

    private final void n() {
        t();
        k();
    }

    private final void p() {
        t();
        c10.i.d(this);
    }

    private final void q() {
        k kVar = this.callback;
        if (kVar != null) {
            kVar.d();
        }
        final com.facebook.react.views.view.e eVar = this.eventView;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: m10.c
            @Override // java.lang.Runnable
            public final void run() {
                d.r(eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(com.facebook.react.views.view.e eVar) {
        c10.h.a(eVar);
    }

    private final void s() {
        if (this.reactContext.getCurrentActivity() == null) {
            g10.a.d(g10.a.f67023a, e.f90929a, "Can not setup keyboard animation listener, since `currentActivity` is null", null, 4, null);
            return;
        }
        this.eventView = new com.facebook.react.views.view.e(getContext());
        ViewGroup viewGroupA = c10.f.a(this.reactContext);
        if (viewGroupA != null) {
            viewGroupA.addView(this.eventView);
        }
        k kVar = new k(this, this, this.reactContext, this.config);
        this.callback = kVar;
        com.facebook.react.views.view.e eVar = this.eventView;
        if (eVar != null) {
            ViewCompat.L0(eVar, kVar);
            ViewCompat.E0(eVar, this.callback);
            c10.i.d(eVar);
        }
    }

    private final void t() {
        View viewC = c10.f.c(this.reactContext);
        if (viewC != null) {
            ViewCompat.E0(viewC, new a0() { // from class: m10.b
                @Override // androidx.core.view.a0
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return d.u(this.f90916a, view, windowInsetsCompat);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat u(d dVar, View v11, WindowInsetsCompat insets) {
        s.k(v11, "v");
        s.k(insets, "insets");
        ViewGroup viewGroupA = c10.f.a(dVar.reactContext);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        boolean z11 = dVar.active;
        boolean z12 = true;
        boolean z13 = !z11 || dVar.isStatusBarTranslucent;
        if (z11 && !dVar.isNavigationBarTranslucent) {
            z12 = false;
        }
        k5.e eVarF = insets.f(WindowInsetsCompat.n.f());
        s.j(eVarF, "getInsets(...)");
        k5.e eVarF2 = insets.f(WindowInsetsCompat.n.h());
        s.j(eVarF2, "getInsets(...)");
        layoutParams.setMargins(eVarF.f84924a, z13 ? 0 : eVarF2.f84925b, eVarF.f84926c, z12 ? 0 : eVarF.f84927d);
        if (viewGroupA != null) {
            viewGroupA.setLayoutParams(layoutParams);
        }
        return c10.i.c(v11, insets, dVar.isStatusBarTranslucent, dVar.active);
    }

    public final boolean getActive() {
        return this.active;
    }

    public final k getCallback$react_native_keyboard_controller_release() {
        return this.callback;
    }

    public final v0 getReactContext() {
        return this.reactContext;
    }

    public final void o(boolean isStatusBarTranslucent) {
        if (!this.active || this.isStatusBarTranslucent == isStatusBarTranslucent) {
            return;
        }
        this.isStatusBarTranslucent = isStatusBarTranslucent;
        p();
    }

    @Override // com.facebook.react.views.view.e, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.wasMounted) {
            k();
        } else {
            this.wasMounted = true;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        p();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    public final void setActive(boolean z11) {
        this.active = z11;
        if (z11) {
            n();
        } else {
            m();
        }
    }

    public final void setCallback$react_native_keyboard_controller_release(k kVar) {
        this.callback = kVar;
    }

    public final void setEdgeToEdge() {
        Window window;
        boolean z11 = this.active || this.isPreservingEdgeToEdge;
        if (this.isEdgeToEdge != z11) {
            this.isEdgeToEdge = z11;
            Activity currentActivity = this.reactContext.getCurrentActivity();
            if (currentActivity != null) {
                z0.b(currentActivity.getWindow(), true ^ this.isEdgeToEdge);
            }
            Activity currentActivity2 = this.reactContext.getCurrentActivity();
            if (currentActivity2 == null || (window = currentActivity2.getWindow()) == null) {
                return;
            }
            window.clearFlags(1024);
        }
    }

    public final void setNavigationBarTranslucent(boolean isNavigationBarTranslucent) {
        this.isNavigationBarTranslucent = isNavigationBarTranslucent;
        this.config.e(isNavigationBarTranslucent);
    }

    public final void setPreserveEdgeToEdge(boolean isPreservingEdgeToEdge) {
        this.isPreservingEdgeToEdge = isPreservingEdgeToEdge;
    }

    public final void setStatusBarTranslucent(boolean isStatusBarTranslucent) {
        this.isStatusBarTranslucent = isStatusBarTranslucent;
    }
}
