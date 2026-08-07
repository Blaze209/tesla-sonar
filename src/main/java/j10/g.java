package j10;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.view.f1;
import c10.i;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 -2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\nJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lj10/g;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", "mReactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "mode", "Ljn0/h0;", "r", "(I)V", "l", "()I", "q", "n", "()V", "m", "", "keepFocus", "animated", "g", "(ZZ)V", "", "direction", "o", "(Ljava/lang/String;)V", "", "viewTag", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "t", "(DLcom/facebook/react/bridge/Promise;)V", "a", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lcom/facebook/react/bridge/UIManager;", "b", "Lcom/facebook/react/bridge/UIManager;", "uiManager", "Ld10/f;", "c", "Ld10/f;", "controller", DateTokenConverter.CONVERTER_KEY, "I", "mDefaultMode", "e", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReactApplicationContext mReactContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final UIManager uiManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d10.f controller;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int mDefaultMode;

    public g(ReactApplicationContext mReactContext) {
        s.k(mReactContext, "mReactContext");
        this.mReactContext = mReactContext;
        this.uiManager = c10.f.d(mReactContext);
        this.controller = new d10.f();
        this.mDefaultMode = l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(boolean z11, g gVar, final View view, Activity activity, final boolean z12) {
        if (Build.VERSION.SDK_INT >= 30 && !z11) {
            gVar.controller.x(view, new l() { // from class: j10.e
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return g.i(view, z12, (f1) obj);
                }
            });
            return;
        }
        Object systemService = activity != null ? activity.getSystemService("input_method") : null;
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        k(z12, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 i(final View view, final boolean z11, f1 insetsController) {
        s.k(insetsController, "insetsController");
        insetsController.a(false);
        view.post(new Runnable() { // from class: j10.f
            @Override // java.lang.Runnable
            public final void run() {
                g.j(z11, view);
            }
        });
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(boolean z11, View view) {
        k(z11, view);
    }

    private static final void k(boolean z11, View view) {
        if (z11) {
            return;
        }
        view.clearFocus();
    }

    private final int l() {
        Window window;
        WindowManager.LayoutParams attributes;
        Activity currentActivity = this.mReactContext.getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return 0;
        }
        return attributes.softInputMode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p() {
        l10.a.f89487a.a();
    }

    private final void r(final int mode) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: j10.d
            @Override // java.lang.Runnable
            public final void run() {
                g.s(this.f82412a, mode);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(g gVar, int i11) {
        Activity currentActivity;
        Window window;
        if (gVar.l() == i11 || (currentActivity = gVar.mReactContext.getCurrentActivity()) == null || (window = currentActivity.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(g gVar, double d11, Promise promise) {
        UIManager uIManager = gVar.uiManager;
        View viewResolveView = uIManager != null ? uIManager.resolveView((int) d11) : null;
        if (viewResolveView == null) {
            promise.reject("E_VIEW_NOT_FOUND", "Could not find view for tag");
            return;
        }
        int[] iArrB = i.b(viewResolveView);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", c10.d.a(iArrB[0]));
        writableMapCreateMap.putDouble("y", c10.d.a(iArrB[1]));
        writableMapCreateMap.putDouble(Snapshot.WIDTH, c10.d.a(viewResolveView.getWidth()));
        writableMapCreateMap.putDouble(Snapshot.HEIGHT, c10.d.a(viewResolveView.getHeight()));
        promise.resolve(writableMapCreateMap);
    }

    public final void g(final boolean keepFocus, final boolean animated) {
        final Activity currentActivity = this.mReactContext.getCurrentActivity();
        final EditText editTextB = l10.a.f89487a.b();
        if (editTextB != null) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: j10.a
                @Override // java.lang.Runnable
                public final void run() {
                    g.h(animated, this, editTextB, currentActivity, keepFocus);
                }
            });
        }
    }

    public final void n() {
        r(this.mDefaultMode);
    }

    public final void o(String direction) {
        s.k(direction, "direction");
        if (s.f(direction, "current")) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: j10.c
                @Override // java.lang.Runnable
                public final void run() {
                    g.p();
                }
            });
            return;
        }
        EditText editTextB = l10.a.f89487a.b();
        if (editTextB != null) {
            l10.c.f89490a.k(direction, editTextB);
        }
    }

    public final void q(int mode) {
        r(mode);
    }

    public final void t(final double viewTag, final Promise promise) {
        s.k(promise, "promise");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: j10.b
            @Override // java.lang.Runnable
            public final void run() {
                g.u(this.f82409a, viewTag, promise);
            }
        });
    }

    public final void m() {
    }
}
