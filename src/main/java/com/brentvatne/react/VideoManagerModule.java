package com.brentvatne.react;

import android.view.View;
import com.brentvatne.exoplayer.p0;
import com.brentvatne.react.VideoManagerModule;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.b1;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import vi.i;
import wn0.l;
import yn0.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\u00020\u0001:\u0001,B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\"\u0010!J!\u0010%\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/brentvatne/react/VideoManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "reactTag", "Lkotlin/Function1;", "Lcom/brentvatne/exoplayer/p0;", "Ljn0/h0;", "callback", "performOnPlayerView", "(ILwn0/l;)V", "", "getName", "()Ljava/lang/String;", "", "paused", "setPlayerPauseStateCmd", "(ILjava/lang/Boolean;)V", "", "time", "tolerance", "seekCmd", "(IFF)V", "volume", "setVolumeCmd", "(IF)V", "fullScreen", "setFullScreenCmd", "(IZ)V", "enterPictureInPictureCmd", "(I)V", "exitPictureInPictureCmd", "Lcom/facebook/react/bridge/ReadableMap;", "source", "setSourceCmd", "(ILcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getCurrentPosition", "(ILcom/facebook/react/bridge/Promise;)V", "Companion", "a", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VideoManagerModule extends ReactContextBaseJavaModule {
    private static final String REACT_CLASS = "VideoManager";

    public VideoManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 enterPictureInPictureCmd$lambda$5(p0 p0Var) {
        if (p0Var != null) {
            p0Var.R0();
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 exitPictureInPictureCmd$lambda$6(p0 p0Var) {
        if (p0Var != null) {
            p0Var.S0();
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 getCurrentPosition$lambda$8(Promise promise, p0 p0Var) {
        if (p0Var != null) {
            p0Var.W0(promise);
        }
        return h0.f84049a;
    }

    private final void performOnPlayerView(final int reactTag, final l<? super p0, h0> callback) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: yi.f
            @Override // java.lang.Runnable
            public final void run() {
                VideoManagerModule.performOnPlayerView$lambda$0(this.f125609a, reactTag, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performOnPlayerView$lambda$0(VideoManagerModule videoManagerModule, int i11, l lVar) {
        try {
            UIManager uIManagerG = b1.g(videoManagerModule.getReactApplicationContext(), 1);
            View viewResolveView = uIManagerG != null ? uIManagerG.resolveView(i11) : null;
            if (viewResolveView instanceof p0) {
                lVar.invoke(viewResolveView);
            } else {
                lVar.invoke(null);
            }
        } catch (Exception unused) {
            lVar.invoke(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 seekCmd$lambda$2(float f11, p0 p0Var) {
        if (p0Var != null) {
            p0Var.L1(a.d(f11 * 1000.0f));
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 setFullScreenCmd$lambda$4(boolean z11, p0 p0Var) {
        if (p0Var != null) {
            p0Var.setFullscreen(z11);
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 setPlayerPauseStateCmd$lambda$1(Boolean bool, p0 p0Var) {
        if (p0Var != null) {
            s.h(bool);
            p0Var.setPausedModifier(bool.booleanValue());
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 setSourceCmd$lambda$7(ReadableMap readableMap, VideoManagerModule videoManagerModule, p0 p0Var) {
        if (p0Var != null) {
            i.Companion companion = i.INSTANCE;
            ReactApplicationContext reactApplicationContext = videoManagerModule.getReactApplicationContext();
            s.j(reactApplicationContext, "getReactApplicationContext(...)");
            p0Var.setSrc(companion.c(readableMap, reactApplicationContext));
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 setVolumeCmd$lambda$3(float f11, p0 p0Var) {
        if (p0Var != null) {
            p0Var.setVolumeModifier(f11);
        }
        return h0.f84049a;
    }

    @ReactMethod
    public final void enterPictureInPictureCmd(int reactTag) {
        performOnPlayerView(reactTag, new l() { // from class: yi.k
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return VideoManagerModule.enterPictureInPictureCmd$lambda$5((p0) obj);
            }
        });
    }

    @ReactMethod
    public final void exitPictureInPictureCmd(int reactTag) {
        performOnPlayerView(reactTag, new l() { // from class: yi.e
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return VideoManagerModule.exitPictureInPictureCmd$lambda$6((p0) obj);
            }
        });
    }

    @ReactMethod
    public final void getCurrentPosition(int reactTag, final Promise promise) {
        s.k(promise, "promise");
        performOnPlayerView(reactTag, new l() { // from class: yi.j
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return VideoManagerModule.getCurrentPosition$lambda$8(promise, (p0) obj);
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactMethod
    public final void seekCmd(int reactTag, final float time, float tolerance) {
        performOnPlayerView(reactTag, new l() { // from class: yi.l
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return VideoManagerModule.seekCmd$lambda$2(time, (p0) obj);
            }
        });
    }

    @ReactMethod
    public final void setFullScreenCmd(int reactTag, final boolean fullScreen) {
        performOnPlayerView(reactTag, new l() { // from class: yi.g
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return VideoManagerModule.setFullScreenCmd$lambda$4(fullScreen, (p0) obj);
            }
        });
    }

    @ReactMethod
    public final void setPlayerPauseStateCmd(int reactTag, final Boolean paused) {
        performOnPlayerView(reactTag, new l() { // from class: yi.m
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return VideoManagerModule.setPlayerPauseStateCmd$lambda$1(paused, (p0) obj);
            }
        });
    }

    @ReactMethod
    public final void setSourceCmd(int reactTag, final ReadableMap source) {
        performOnPlayerView(reactTag, new l() { // from class: yi.i
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return VideoManagerModule.setSourceCmd$lambda$7(source, this, (p0) obj);
            }
        });
    }

    @ReactMethod
    public final void setVolumeCmd(int reactTag, final float volume) {
        performOnPlayerView(reactTag, new l() { // from class: yi.h
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return VideoManagerModule.setVolumeCmd$lambda$3(volume, (p0) obj);
            }
        });
    }
}
