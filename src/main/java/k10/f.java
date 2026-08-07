package k10;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Window;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.ref.WeakReference;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u0012J\u0015\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lk10/f;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", "mReactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Landroidx/core/view/WindowInsetsControllerCompat;", "g", "()Landroidx/core/view/WindowInsetsControllerCompat;", "", "h", "()Z", "Lm10/d;", "r", "()Lm10/d;", "hidden", "Ljn0/h0;", "l", "(Z)V", "", "color", "animated", IntegerTokenConverter.CONVERTER_KEY, "(IZ)V", "translucent", "p", "", "style", "n", "(Ljava/lang/String;)V", "", "f", "()Ljava/util/Map;", "a", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lk10/h;", "b", "Lk10/h;", "original", "c", "Landroidx/core/view/WindowInsetsControllerCompat;", "controller", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/ref/WeakReference;", "lastActivity", "e", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReactApplicationContext mReactContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private h original;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private WindowInsetsControllerCompat controller;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private WeakReference<Activity> lastActivity;

    public f(ReactApplicationContext mReactContext) {
        s.k(mReactContext, "mReactContext");
        this.mReactContext = mReactContext;
        this.original = new h(mReactContext);
        this.lastActivity = new WeakReference<>(null);
    }

    private final WindowInsetsControllerCompat g() {
        Activity currentActivity = this.mReactContext.getCurrentActivity();
        if (this.controller == null || !s.f(currentActivity, this.lastActivity.get())) {
            if (currentActivity == null) {
                g10.a.d(g10.a.f67023a, g.f84636a, "StatusBarManagerCompatModule: can not get `WindowInsetsControllerCompat` because current activity is null.", null, 4, null);
                return this.controller;
            }
            Window window = currentActivity.getWindow();
            this.lastActivity = new WeakReference<>(currentActivity);
            this.controller = new WindowInsetsControllerCompat(window, window.getDecorView());
        }
        return this.controller;
    }

    private final boolean h() {
        m10.d dVarR = r();
        if (dVarR != null) {
            return dVarR.getActive();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Activity activity, boolean z11, int i11) {
        final Window window = activity.getWindow();
        if (!z11) {
            window.setStatusBarColor(i11);
            return;
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), Integer.valueOf(i11));
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: k10.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.k(window, valueAnimator);
            }
        });
        valueAnimatorOfObject.setDuration(300L).setStartDelay(0L);
        valueAnimatorOfObject.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Window window, ValueAnimator animator) {
        s.k(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        s.i(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        window.setStatusBarColor(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(boolean z11, f fVar) {
        if (z11) {
            WindowInsetsControllerCompat windowInsetsControllerCompatG = fVar.g();
            if (windowInsetsControllerCompatG != null) {
                windowInsetsControllerCompatG.c(WindowInsetsCompat.n.g());
                return;
            }
            return;
        }
        WindowInsetsControllerCompat windowInsetsControllerCompatG2 = fVar.g();
        if (windowInsetsControllerCompatG2 != null) {
            windowInsetsControllerCompatG2.i(WindowInsetsCompat.n.g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(f fVar, String str) {
        WindowInsetsControllerCompat windowInsetsControllerCompatG = fVar.g();
        if (windowInsetsControllerCompatG != null) {
            windowInsetsControllerCompatG.g(s.f(str, "dark-content"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(f fVar, boolean z11) {
        m10.d dVarR = fVar.r();
        if (dVarR != null) {
            dVarR.o(z11);
        }
    }

    private final m10.d r() {
        return m10.f.f90930a.a();
    }

    public final Map<String, Object> f() {
        return this.original.a();
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public final void i(final int color, final boolean animated) {
        if (!h()) {
            this.original.b(color, animated);
            return;
        }
        final Activity currentActivity = this.mReactContext.getCurrentActivity();
        if (currentActivity == null) {
            g10.a.d(g10.a.f67023a, g.f84636a, "StatusBarManagerCompatModule: Ignored status bar change, current activity is null.", null, 4, null);
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: k10.d
                @Override // java.lang.Runnable
                public final void run() {
                    f.j(currentActivity, animated, color);
                }
            });
        }
    }

    public final void l(final boolean hidden) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: k10.a
            @Override // java.lang.Runnable
            public final void run() {
                f.m(hidden, this);
            }
        });
    }

    public final void n(final String style) {
        s.k(style, "style");
        if (h()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: k10.b
                @Override // java.lang.Runnable
                public final void run() {
                    f.o(this.f84623a, style);
                }
            });
        } else {
            this.original.c(style);
        }
    }

    public final void p(final boolean translucent) {
        if (h()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: k10.c
                @Override // java.lang.Runnable
                public final void run() {
                    f.q(this.f84625a, translucent);
                }
            });
        } else {
            this.original.d(translucent);
        }
    }
}
