package com.mrousavy.camera.frameprocessors;

import android.util.Log;
import androidx.annotation.Keep;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.b1;
import com.mrousavy.camera.react.o;
import dz.y1;
import java.lang.ref.WeakReference;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ,2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082 ¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u001dH\u0007¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010*R\u0011\u0010.\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/mrousavy/camera/frameprocessors/VisionCameraProxy;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "viewId", "Lcom/mrousavy/camera/react/o;", "c", "(I)Lcom/mrousavy/camera/react/o;", "", "jsContext", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "jsCallInvokerHolder", "Lcom/mrousavy/camera/frameprocessors/VisionCameraScheduler;", "scheduler", "Lcom/facebook/jni/HybridData;", "initHybrid", "(JLcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;Lcom/mrousavy/camera/frameprocessors/VisionCameraScheduler;)Lcom/facebook/jni/HybridData;", "Lcom/mrousavy/camera/frameprocessors/FrameProcessor;", "frameProcessor", "Ljn0/h0;", "setFrameProcessor", "(ILcom/mrousavy/camera/frameprocessors/FrameProcessor;)V", "removeFrameProcessor", "(I)V", "", "name", "", "options", "Lcom/mrousavy/camera/frameprocessors/FrameProcessorPlugin;", "initFrameProcessorPlugin", "(Ljava/lang/String;Ljava/util/Map;)Lcom/mrousavy/camera/frameprocessors/FrameProcessorPlugin;", "a", "Lcom/facebook/react/bridge/ReactApplicationContext;", "mHybridData", "Lcom/facebook/jni/HybridData;", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "mContext", "Lcom/mrousavy/camera/frameprocessors/VisionCameraScheduler;", "mScheduler", DateTokenConverter.CONVERTER_KEY, "()Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VisionCameraProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReactApplicationContext reactContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private WeakReference<ReactApplicationContext> mContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private VisionCameraScheduler mScheduler;

    @Keep
    @in.a
    private HybridData mHybridData;

    public VisionCameraProxy(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
        CallInvokerHolder jSCallInvokerHolder = getReactContext().getCatalystInstance().getJSCallInvokerHolder();
        s.i(jSCallInvokerHolder, "null cannot be cast to non-null type com.facebook.react.turbomodule.core.CallInvokerHolderImpl");
        CallInvokerHolderImpl callInvokerHolderImpl = (CallInvokerHolderImpl) jSCallInvokerHolder;
        JavaScriptContextHolder javaScriptContextHolder = getReactContext().getJavaScriptContextHolder();
        if (javaScriptContextHolder == null) {
            throw new Error("JSI Runtime is null! VisionCamera does not yet support bridgeless mode..");
        }
        long j11 = javaScriptContextHolder.get();
        this.mScheduler = new VisionCameraScheduler();
        this.mContext = new WeakReference<>(getReactContext());
        this.mHybridData = initHybrid(j11, callInvokerHolderImpl, this.mScheduler);
    }

    private final o c(int viewId) throws y1 {
        StringBuilder sb2;
        String str;
        Log.d("VisionCameraProxy", "Finding view " + viewId + "...");
        ReactApplicationContext reactApplicationContext = this.mContext.get();
        o oVar = null;
        if (reactApplicationContext != null) {
            UIManager uIManagerG = b1.g(reactApplicationContext, viewId);
            oVar = (o) (uIManagerG != null ? uIManagerG.resolveView(viewId) : null);
        }
        if (oVar != null) {
            sb2 = new StringBuilder();
            str = "Found view ";
        } else {
            sb2 = new StringBuilder();
            str = "Couldn't find view ";
        }
        sb2.append(str);
        sb2.append(viewId);
        sb2.append("!");
        Log.d("VisionCameraProxy", sb2.toString());
        if (oVar != null) {
            return oVar;
        }
        throw new y1(viewId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(VisionCameraProxy visionCameraProxy, int i11) {
        visionCameraProxy.c(i11).setFrameProcessor$react_native_vision_camera_release(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(VisionCameraProxy visionCameraProxy, int i11, FrameProcessor frameProcessor) {
        visionCameraProxy.c(i11).setFrameProcessor$react_native_vision_camera_release(frameProcessor);
    }

    private final native HybridData initHybrid(long jsContext, CallInvokerHolderImpl jsCallInvokerHolder, VisionCameraScheduler scheduler);

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @Keep
    @in.a
    public final FrameProcessorPlugin initFrameProcessorPlugin(String name, Map<String, ? extends Object> options) {
        s.k(name, "name");
        s.k(options, "options");
        return FrameProcessorPluginRegistry.getPlugin(name, this, options);
    }

    @Keep
    @in.a
    public final void removeFrameProcessor(final int viewId) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.mrousavy.camera.frameprocessors.b
            @Override // java.lang.Runnable
            public final void run() {
                VisionCameraProxy.e(this.f45665a, viewId);
            }
        });
    }

    @Keep
    @in.a
    public final void setFrameProcessor(final int viewId, final FrameProcessor frameProcessor) {
        s.k(frameProcessor, "frameProcessor");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.mrousavy.camera.frameprocessors.a
            @Override // java.lang.Runnable
            public final void run() {
                VisionCameraProxy.f(this.f45662a, viewId, frameProcessor);
            }
        });
    }
}
