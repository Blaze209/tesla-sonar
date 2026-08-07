package com.airbnb.android.react.lottie;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.v0;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import tf.k0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001c\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u0014J\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001f\u0010\u0014J\u0017\u0010 \u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b \u0010\u0014J!\u0010$\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u00162\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J!\u0010'\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\u00162\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b'\u0010%J!\u0010)\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\u00162\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b)\u0010%J!\u0010+\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u00162\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b+\u0010%J\u001f\u0010-\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\nH\u0007¢\u0006\u0004\b-\u0010\u000eJ!\u0010/\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\u00162\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b/\u0010%J!\u00101\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010\u00162\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b1\u0010%J\u001f\u00103\u001a\u00020\f2\u0006\u00102\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020\f2\u0006\u00106\u001a\u0002052\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020\f2\u0006\u0010:\u001a\u0002092\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00020\f2\u0006\u0010=\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b>\u00104J\u001f\u0010@\u001a\u00020\f2\u0006\u0010?\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b@\u00104J\u001f\u0010B\u001a\u00020\f2\u0006\u0010A\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\bB\u00104J\u001f\u0010D\u001a\u00020\f2\u0006\u0010C\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\bD\u00104J!\u0010F\u001a\u00020\f2\b\u0010E\u001a\u0004\u0018\u00010\u00162\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\bF\u0010%J!\u0010I\u001a\u00020\f2\b\u0010H\u001a\u0004\u0018\u00010G2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\bI\u0010JJ!\u0010L\u001a\u00020\f2\b\u0010K\u001a\u0004\u0018\u00010G2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\bL\u0010JR&\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010M8FX\u0087\u0004¢\u0006\f\u0012\u0004\bO\u0010\u0003\u001a\u0004\bN\u0010\u0018¨\u0006Q"}, d2 = {"Lcom/airbnb/android/react/lottie/g;", "", "<init>", "()V", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/airbnb/lottie/LottieAnimationView;", "e", "(Lcom/facebook/react/uimanager/v0;)Lcom/airbnb/lottie/LottieAnimationView;", "view", "", "isCancelled", "Ljn0/h0;", "r", "(Lcom/airbnb/lottie/LottieAnimationView;Z)V", "", AnalyticsAttribute.Error, "p", "(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/Throwable;)V", "q", "(Lcom/airbnb/lottie/LottieAnimationView;)V", "", "", "f", "()Ljava/util/Map;", "", "startFrame", "endFrame", "j", "(Lcom/airbnb/lottie/LottieAnimationView;II)V", "l", "h", "n", "name", "Lcom/airbnb/android/react/lottie/h;", "viewManager", Gender.FEMALE, "(Ljava/lang/String;Lcom/airbnb/android/react/lottie/h;)V", "json", "E", "urlString", "G", "uri", "D", "cacheComposition", "t", "resizeMode", "C", "renderMode", "B", "hardwareAccelerationAndroid", "x", "(ZLcom/airbnb/android/react/lottie/h;)V", "", ReactProgressBarViewManager.PROP_PROGRESS, "A", "(FLcom/airbnb/android/react/lottie/h;)V", "", "speed", "H", "(DLcom/airbnb/android/react/lottie/h;)V", "loop", "z", "autoPlay", "s", "enableMergePaths", "v", "enableSafeMode", "w", "imageAssetsFolder", "y", "Lcom/facebook/react/bridge/ReadableArray;", "colorFilters", "u", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/airbnb/android/react/lottie/h;)V", "textFilters", "I", "", "g", "getExportedViewConstants$annotations", "exportedViewConstants", "lottie-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f19837a = new g();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/airbnb/android/react/lottie/g$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Ljn0/h0;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "lottie-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f19838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f19839b;

        a(boolean z11, LottieAnimationView lottieAnimationView) {
            this.f19838a = z11;
            this.f19839b = lottieAnimationView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v11) {
            s.k(v11, "v");
            LottieAnimationView lottieAnimationView = (LottieAnimationView) v11;
            if (this.f19838a) {
                this.f19839b.v();
            } else {
                this.f19839b.y();
            }
            lottieAnimationView.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v11) {
            s.k(v11, "v");
            ((LottieAnimationView) v11).removeOnAttachStateChangeListener(this);
        }
    }

    private g() {
    }

    public static final void A(float progress, h viewManager) {
        s.k(viewManager, "viewManager");
        viewManager.m(Float.valueOf(progress));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    public static final void B(String renderMode, h viewManager) {
        k0 k0Var;
        s.k(viewManager, "viewManager");
        if (renderMode == null) {
            k0Var = null;
        } else {
            int iHashCode = renderMode.hashCode();
            if (iHashCode != 165298699) {
                if (iHashCode != 899536360) {
                    if (iHashCode == 2101957031 && renderMode.equals("SOFTWARE")) {
                        k0Var = k0.SOFTWARE;
                    } else {
                        k0Var = null;
                    }
                } else if (renderMode.equals("HARDWARE")) {
                    k0Var = k0.HARDWARE;
                } else {
                    k0Var = null;
                }
            } else if (renderMode.equals("AUTOMATIC")) {
                k0Var = k0.AUTOMATIC;
            } else {
                k0Var = null;
            }
        }
        viewManager.n(k0Var);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    public static final void C(String resizeMode, h viewManager) {
        ImageView.ScaleType scaleType;
        s.k(viewManager, "viewManager");
        if (resizeMode == null) {
            scaleType = null;
        } else {
            int iHashCode = resizeMode.hashCode();
            if (iHashCode != -1364013995) {
                if (iHashCode != 94852023) {
                    if (iHashCode == 951526612 && resizeMode.equals("contain")) {
                        scaleType = ImageView.ScaleType.FIT_CENTER;
                    } else {
                        scaleType = null;
                    }
                } else if (resizeMode.equals("cover")) {
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                } else {
                    scaleType = null;
                }
            } else if (resizeMode.equals("center")) {
                scaleType = ImageView.ScaleType.CENTER_INSIDE;
            } else {
                scaleType = null;
            }
        }
        viewManager.o(scaleType);
    }

    public static final void D(String uri, h viewManager) {
        s.k(viewManager, "viewManager");
        viewManager.p(uri);
        viewManager.a();
    }

    public static final void E(String json, h viewManager) {
        s.k(viewManager, "viewManager");
        viewManager.c(json);
        viewManager.a();
    }

    public static final void F(String name, h viewManager) {
        s.k(viewManager, "viewManager");
        if (name != null && !t.h0(name, ".", false, 2, null)) {
            name = name + ".json";
        }
        viewManager.d(name);
        viewManager.a();
    }

    public static final void G(String urlString, h viewManager) {
        s.k(viewManager, "viewManager");
        viewManager.e(urlString);
        viewManager.a();
    }

    public static final void H(double speed, h viewManager) {
        s.k(viewManager, "viewManager");
        viewManager.q(Float.valueOf((float) speed));
    }

    public static final void I(ReadableArray textFilters, h viewManager) {
        s.k(viewManager, "viewManager");
        viewManager.r(textFilters);
    }

    public static final LottieAnimationView e(v0 context) {
        s.k(context, "context");
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        return lottieAnimationView;
    }

    public static final Map<String, Object> f() {
        Map<String, Object> mapF = jn.c.f("topAnimationFinish", jn.c.d("registrationName", "onAnimationFinish"), "topAnimationFailure", jn.c.d("registrationName", "onAnimationFailure"), "topAnimationLoaded", jn.c.d("registrationName", "onAnimationLoaded"));
        s.j(mapF, "of(...)");
        return mapF;
    }

    public static final Map<String, Object> g() {
        Map<String, Object> mapA = jn.c.a().b("VERSION", 1).a();
        s.j(mapA, "build(...)");
        return mapA;
    }

    public static final void h(final LottieAnimationView view) {
        s.k(view, "view");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.airbnb.android.react.lottie.f
            @Override // java.lang.Runnable
            public final void run() {
                g.i(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(LottieAnimationView lottieAnimationView) {
        if (ViewCompat.S(lottieAnimationView)) {
            lottieAnimationView.u();
        }
    }

    public static final void j(final LottieAnimationView view, final int startFrame, final int endFrame) {
        s.k(view, "view");
        final boolean z11 = (startFrame == -1 || endFrame == -1) ? false : true;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.airbnb.android.react.lottie.e
            @Override // java.lang.Runnable
            public final void run() {
                g.k(z11, startFrame, endFrame, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(boolean z11, int i11, int i12, LottieAnimationView lottieAnimationView) {
        if (!z11) {
            tf.i composition = lottieAnimationView.getComposition();
            Integer numValueOf = composition != null ? Integer.valueOf((int) composition.p()) : null;
            tf.i composition2 = lottieAnimationView.getComposition();
            Integer numValueOf2 = composition2 != null ? Integer.valueOf((int) composition2.f()) : null;
            int minFrame = (int) lottieAnimationView.getMinFrame();
            int maxFrame = (int) lottieAnimationView.getMaxFrame();
            if (numValueOf != null && numValueOf2 != null && (minFrame != numValueOf.intValue() || maxFrame != numValueOf2.intValue())) {
                lottieAnimationView.setMinAndMaxFrame(numValueOf.intValue(), numValueOf2.intValue());
            }
        } else if (i11 > i12) {
            lottieAnimationView.setMinAndMaxFrame(i12, i11);
            if (lottieAnimationView.getSpeed() > BitmapDescriptorFactory.HUE_RED) {
                lottieAnimationView.z();
            }
        } else {
            lottieAnimationView.setMinAndMaxFrame(i11, i12);
            if (lottieAnimationView.getSpeed() < BitmapDescriptorFactory.HUE_RED) {
                lottieAnimationView.z();
            }
        }
        if (!ViewCompat.S(lottieAnimationView)) {
            lottieAnimationView.addOnAttachStateChangeListener(new a(z11, lottieAnimationView));
        } else if (z11) {
            lottieAnimationView.v();
        } else {
            lottieAnimationView.y();
        }
    }

    public static final void l(final LottieAnimationView view) {
        s.k(view, "view");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.airbnb.android.react.lottie.c
            @Override // java.lang.Runnable
            public final void run() {
                g.m(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(LottieAnimationView lottieAnimationView) {
        if (ViewCompat.S(lottieAnimationView)) {
            lottieAnimationView.m();
            lottieAnimationView.setProgress(BitmapDescriptorFactory.HUE_RED);
        }
    }

    public static final void n(final LottieAnimationView view) {
        s.k(view, "view");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.airbnb.android.react.lottie.d
            @Override // java.lang.Runnable
            public final void run() {
                g.o(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(LottieAnimationView lottieAnimationView) {
        if (ViewCompat.S(lottieAnimationView)) {
            lottieAnimationView.y();
        }
    }

    public static final void p(LottieAnimationView view, Throwable error) {
        s.k(view, "view");
        s.k(error, "error");
        Context context = view.getContext();
        s.i(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        v0 v0Var = (v0) context;
        EventDispatcher eventDispatcherC = b1.c(v0Var, view.getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.h(new j(v0Var.c(), view.getId(), error));
        }
    }

    public static final void q(LottieAnimationView view) {
        s.k(view, "view");
        Context context = view.getContext();
        s.i(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        v0 v0Var = (v0) context;
        EventDispatcher eventDispatcherC = b1.c(v0Var, view.getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.h(new l(v0Var.c(), view.getId()));
        }
    }

    public static final void r(LottieAnimationView view, boolean isCancelled) {
        s.k(view, "view");
        Context context = view.getContext();
        s.i(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        v0 v0Var = (v0) context;
        EventDispatcher eventDispatcherC = b1.c(v0Var, view.getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.h(new k(v0Var.c(), view.getId(), isCancelled));
        }
    }

    public static final void s(boolean autoPlay, h viewManager) {
        s.k(viewManager, "viewManager");
        viewManager.f(Boolean.valueOf(autoPlay));
    }

    public static final void t(LottieAnimationView view, boolean cacheComposition) {
        s.k(view, "view");
        view.setCacheComposition(cacheComposition);
    }

    public static final void u(ReadableArray colorFilters, h viewManager) {
        s.k(viewManager, "viewManager");
        viewManager.g(colorFilters);
    }

    public static final void v(boolean enableMergePaths, h viewManager) {
        s.k(viewManager, "viewManager");
        viewManager.h(Boolean.valueOf(enableMergePaths));
    }

    public static final void w(boolean enableSafeMode, h viewManager) {
        s.k(viewManager, "viewManager");
        viewManager.i(Boolean.valueOf(enableSafeMode));
    }

    public static final void x(boolean hardwareAccelerationAndroid, h viewManager) {
        s.k(viewManager, "viewManager");
        viewManager.k(hardwareAccelerationAndroid ? 2 : 1);
    }

    public static final void y(String imageAssetsFolder, h viewManager) {
        s.k(viewManager, "viewManager");
        viewManager.j(imageAssetsFolder);
    }

    public static final void z(boolean loop, h viewManager) {
        s.k(viewManager, "viewManager");
        viewManager.l(Boolean.valueOf(loop));
    }
}
