package com.airbnb.android.react.lottie;

import android.animation.Animator;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.v0;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.util.Map;
import java.util.WeakHashMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import tf.a0;
import tf.c0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\rJ)\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b \u0010\u001eJ!\u0010\"\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\"\u0010\u001eJ!\u0010%\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b(\u0010\u001eJ!\u0010*\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b*\u0010\u001eJ!\u0010,\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u00103\u001a\u000202H\u0007¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u00106\u001a\u00020#H\u0007¢\u0006\u0004\b7\u0010&J\u001f\u00109\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u00108\u001a\u00020#H\u0007¢\u0006\u0004\b9\u0010&J!\u0010;\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010:\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b;\u0010\u001eJ\u001f\u0010=\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010<\u001a\u00020#H\u0007¢\u0006\u0004\b=\u0010&J\u001f\u0010?\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010>\u001a\u00020#H\u0007¢\u0006\u0004\b?\u0010&J!\u0010A\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010@\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\bA\u0010BJ!\u0010D\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010C\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\bD\u0010BJ!\u0010F\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010E\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\bF\u0010\u001eJ\u0017\u0010G\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0002H\u0014¢\u0006\u0004\bG\u0010HR \u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/airbnb/lottie/LottieAnimationView;", "<init>", "()V", "view", "Lcom/airbnb/android/react/lottie/h;", "getOrCreatePropertyManager", "(Lcom/airbnb/lottie/LottieAnimationView;)Lcom/airbnb/android/react/lottie/h;", "", "", "", "getExportedViewConstants", "()Ljava/util/Map;", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/airbnb/lottie/LottieAnimationView;", "", "getExportedCustomDirectEventTypeConstants", "commandName", "Lcom/facebook/react/bridge/ReadableArray;", "args", "Ljn0/h0;", "receiveCommand", "(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "name", "setSourceName", "(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;)V", "json", "setSourceJson", "urlString", "setSourceURL", "", "cacheComposition", "setCacheComposition", "(Lcom/airbnb/lottie/LottieAnimationView;Z)V", "resizeMode", "setResizeMode", "renderMode", "setRenderMode", "hardwareAccelerationAndroid", "setHardwareAccelerationAndroid", "(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/Boolean;)V", "", ReactProgressBarViewManager.PROP_PROGRESS, "setProgress", "(Lcom/airbnb/lottie/LottieAnimationView;F)V", "", "speed", "setSpeed", "(Lcom/airbnb/lottie/LottieAnimationView;D)V", "loop", "setLoop", "autoPlay", "setAutoPlay", "imageAssetsFolder", "setImageAssetsFolder", "enableMergePaths", "setEnableMergePaths", "enableSafeMode", "setEnableSafeMode", "colorFilters", "setColorFilters", "(Lcom/airbnb/lottie/LottieAnimationView;Lcom/facebook/react/bridge/ReadableArray;)V", "textFilters", "setTextFilters", "uri", "setSourceDotLottie", "onAfterUpdateTransaction", "(Lcom/airbnb/lottie/LottieAnimationView;)V", "Ljava/util/WeakHashMap;", "propManagersMap", "Ljava/util/WeakHashMap;", "lottie-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LottieAnimationViewManager extends SimpleViewManager<LottieAnimationView> {
    private final WeakHashMap<LottieAnimationView, h> propManagersMap = new WeakHashMap<>();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"com/airbnb/android/react/lottie/LottieAnimationViewManager$a", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "Ljn0/h0;", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "lottie-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f19827a;

        a(LottieAnimationView lottieAnimationView) {
            this.f19827a = lottieAnimationView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            s.k(animation, "animation");
            g.r(this.f19827a, true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            s.k(animation, "animation");
            g.r(this.f19827a, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            s.k(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            s.k(animation, "animation");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$0(LottieAnimationView lottieAnimationView, Throwable th2) {
        s.h(th2);
        g.p(lottieAnimationView, th2);
    }

    private final h getOrCreatePropertyManager(LottieAnimationView view) {
        h hVar = this.propManagersMap.get(view);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(view);
        this.propManagersMap.put(view, hVar2);
        return hVar2;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return g.f();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return g.g();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "LottieAnimationView";
    }

    @no.a(name = "autoPlay")
    public final void setAutoPlay(LottieAnimationView view, boolean autoPlay) {
        s.k(view, "view");
        g.s(autoPlay, getOrCreatePropertyManager(view));
    }

    @no.a(name = "cacheComposition")
    public final void setCacheComposition(LottieAnimationView view, boolean cacheComposition) {
        s.h(view);
        g.t(view, cacheComposition);
    }

    @no.a(name = "colorFilters")
    public final void setColorFilters(LottieAnimationView view, ReadableArray colorFilters) {
        s.k(view, "view");
        g.u(colorFilters, getOrCreatePropertyManager(view));
    }

    @no.a(name = "enableMergePathsAndroidForKitKatAndAbove")
    public final void setEnableMergePaths(LottieAnimationView view, boolean enableMergePaths) {
        s.k(view, "view");
        g.v(enableMergePaths, getOrCreatePropertyManager(view));
    }

    @no.a(name = "enableSafeModeAndroid")
    public final void setEnableSafeMode(LottieAnimationView view, boolean enableSafeMode) {
        s.k(view, "view");
        g.w(enableSafeMode, getOrCreatePropertyManager(view));
    }

    @no.a(name = "hardwareAccelerationAndroid")
    public final void setHardwareAccelerationAndroid(LottieAnimationView view, Boolean hardwareAccelerationAndroid) {
        s.k(view, "view");
        s.h(hardwareAccelerationAndroid);
        g.x(hardwareAccelerationAndroid.booleanValue(), getOrCreatePropertyManager(view));
    }

    @no.a(name = "imageAssetsFolder")
    public final void setImageAssetsFolder(LottieAnimationView view, String imageAssetsFolder) {
        s.k(view, "view");
        g.y(imageAssetsFolder, getOrCreatePropertyManager(view));
    }

    @no.a(name = "loop")
    public final void setLoop(LottieAnimationView view, boolean loop) {
        s.k(view, "view");
        g.z(loop, getOrCreatePropertyManager(view));
    }

    @no.a(name = ReactProgressBarViewManager.PROP_PROGRESS)
    public final void setProgress(LottieAnimationView view, float progress) {
        s.k(view, "view");
        g.A(progress, getOrCreatePropertyManager(view));
    }

    @no.a(name = "renderMode")
    public final void setRenderMode(LottieAnimationView view, String renderMode) {
        s.k(view, "view");
        g.B(renderMode, getOrCreatePropertyManager(view));
    }

    @no.a(name = "resizeMode")
    public final void setResizeMode(LottieAnimationView view, String resizeMode) {
        s.k(view, "view");
        g.C(resizeMode, getOrCreatePropertyManager(view));
    }

    @no.a(name = "sourceDotLottieURI")
    public final void setSourceDotLottie(LottieAnimationView view, String uri) {
        s.k(view, "view");
        g.D(uri, getOrCreatePropertyManager(view));
    }

    @no.a(name = "sourceJson")
    public final void setSourceJson(LottieAnimationView view, String json) {
        s.k(view, "view");
        g.E(json, getOrCreatePropertyManager(view));
    }

    @no.a(name = "sourceName")
    public final void setSourceName(LottieAnimationView view, String name) {
        s.k(view, "view");
        g.F(name, getOrCreatePropertyManager(view));
    }

    @no.a(name = "sourceURL")
    public final void setSourceURL(LottieAnimationView view, String urlString) {
        s.k(view, "view");
        g.G(urlString, getOrCreatePropertyManager(view));
    }

    @no.a(name = "speed")
    public final void setSpeed(LottieAnimationView view, double speed) {
        s.k(view, "view");
        g.H(speed, getOrCreatePropertyManager(view));
    }

    @no.a(name = "textFiltersAndroid")
    public final void setTextFilters(LottieAnimationView view, ReadableArray textFilters) {
        s.k(view, "view");
        g.I(textFilters, getOrCreatePropertyManager(view));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public LottieAnimationView createViewInstance(v0 context) {
        s.k(context, "context");
        final LottieAnimationView lottieAnimationViewE = g.e(context);
        lottieAnimationViewE.setFailureListener(new a0() { // from class: com.airbnb.android.react.lottie.a
            @Override // tf.a0
            public final void onResult(Object obj) {
                LottieAnimationViewManager.createViewInstance$lambda$0(lottieAnimationViewE, (Throwable) obj);
            }
        });
        lottieAnimationViewE.j(new c0() { // from class: com.airbnb.android.react.lottie.b
            @Override // tf.c0
            public final void a(tf.i iVar) {
                g.q(lottieAnimationViewE);
            }
        });
        lottieAnimationViewE.i(new a(lottieAnimationViewE));
        return lottieAnimationViewE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(LottieAnimationView view) {
        s.k(view, "view");
        super.onAfterUpdateTransaction(view);
        getOrCreatePropertyManager(view).a();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(LottieAnimationView view, String commandName, ReadableArray args) {
        s.k(view, "view");
        s.k(commandName, "commandName");
        switch (commandName.hashCode()) {
            case -934426579:
                if (commandName.equals("resume")) {
                    g.n(view);
                    break;
                }
                break;
            case 3443508:
                if (commandName.equals("play")) {
                    g.j(view, args != null ? args.getInt(0) : -1, args != null ? args.getInt(1) : -1);
                    break;
                }
                break;
            case 106440182:
                if (commandName.equals("pause")) {
                    g.h(view);
                    break;
                }
                break;
            case 108404047:
                if (commandName.equals("reset")) {
                    g.l(view);
                    break;
                }
                break;
        }
    }
}
