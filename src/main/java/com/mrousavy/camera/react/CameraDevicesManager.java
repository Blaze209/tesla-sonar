package com.mrousavy.camera.react;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.util.Log;
import androidx.camera.extensions.ExtensionsManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001,\u0018\u0000 /2\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\u001d\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/mrousavy/camera/react/CameraDevicesManager;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/bridge/ReadableArray;", "getDevicesJson", "()Lcom/facebook/react/bridge/ReadableArray;", "", "getName", "()Ljava/lang/String;", "Ljn0/h0;", "initialize", "()V", "invalidate", "sendAvailableDevicesChangedEvent", "", "", "getConstants", "()Ljava/util/Map;", "eventName", "addListener", "(Ljava/lang/String;)V", "", "count", "removeListeners", "(I)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Ljava/util/concurrent/ExecutorService;", "executor", "Ljava/util/concurrent/ExecutorService;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "Lx0/h;", "cameraProvider", "Lx0/h;", "Landroidx/camera/extensions/ExtensionsManager;", "extensionsManager", "Landroidx/camera/extensions/ExtensionsManager;", "com/mrousavy/camera/react/CameraDevicesManager$c", "callback", "Lcom/mrousavy/camera/react/CameraDevicesManager$c;", "Companion", "b", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CameraDevicesManager extends ReactContextBaseJavaModule {
    private static final String TAG = "CameraDevices";
    private final c callback;
    private final CameraManager cameraManager;
    private x0.h cameraProvider;
    private final CoroutineScope coroutineScope;
    private final ExecutorService executor;
    private ExtensionsManager extensionsManager;
    private final ReactApplicationContext reactContext;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.mrousavy.camera.react.CameraDevicesManager$1", f = "CameraDevicesManager.kt", i = {}, l = {67, 69}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f45668n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f45669o;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return CameraDevicesManager.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CameraDevicesManager cameraDevicesManager;
            CameraDevicesManager cameraDevicesManager2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f45669o;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        cameraDevicesManager = (CameraDevicesManager) this.f45668n;
                        jn0.t.b(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cameraDevicesManager2 = (CameraDevicesManager) this.f45668n;
                        jn0.t.b(obj);
                    }
                    cameraDevicesManager2.extensionsManager = (ExtensionsManager) obj;
                    Log.i(CameraDevicesManager.TAG, "Successfully initialized!");
                    return h0.f84049a;
                }
                jn0.t.b(obj);
                Log.i(CameraDevicesManager.TAG, "Initializing ProcessCameraProvider...");
                cameraDevicesManager = CameraDevicesManager.this;
                com.google.common.util.concurrent.s<x0.h> sVarB = x0.h.INSTANCE.b(cameraDevicesManager.reactContext);
                ExecutorService executorService = CameraDevicesManager.this.executor;
                this.f45668n = cameraDevicesManager;
                this.f45669o = 1;
                obj = ez.h.a(sVarB, executorService, this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
                cameraDevicesManager.cameraProvider = (x0.h) obj;
                Log.i(CameraDevicesManager.TAG, "Initializing ExtensionsManager...");
                CameraDevicesManager cameraDevicesManager3 = CameraDevicesManager.this;
                ReactApplicationContext reactApplicationContext = cameraDevicesManager3.reactContext;
                x0.h hVar = CameraDevicesManager.this.cameraProvider;
                p013kotlin.jvm.internal.s.h(hVar);
                com.google.common.util.concurrent.s<ExtensionsManager> sVarC = ExtensionsManager.c(reactApplicationContext, hVar);
                p013kotlin.jvm.internal.s.j(sVarC, "getInstanceAsync(...)");
                ExecutorService executorService2 = CameraDevicesManager.this.executor;
                this.f45668n = cameraDevicesManager3;
                this.f45669o = 2;
                Object objA = ez.h.a(sVarC, executorService2, this);
                if (objA != coroutine_suspended) {
                    cameraDevicesManager2 = cameraDevicesManager3;
                    obj = objA;
                    cameraDevicesManager2.extensionsManager = (ExtensionsManager) obj;
                    Log.i(CameraDevicesManager.TAG, "Successfully initialized!");
                    return h0.f84049a;
                }
                return coroutine_suspended;
            } catch (Throwable th2) {
                Log.e(CameraDevicesManager.TAG, "Failed to initialize ProcessCameraProvider/ExtensionsManager! Error: " + th2.getMessage(), th2);
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tR$\u0010\u000e\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00020\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"com/mrousavy/camera/react/CameraDevicesManager$c", "Landroid/hardware/camera2/CameraManager$AvailabilityCallback;", "", "cameraId", "", "a", "(Ljava/lang/String;)Z", "Ljn0/h0;", "onCameraAvailable", "(Ljava/lang/String;)V", "onCameraUnavailable", "", "kotlin.jvm.PlatformType", "Ljava/util/List;", "deviceIds", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends CameraManager.AvailabilityCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private List<String> deviceIds;

        c() throws CameraAccessException {
            String[] cameraIdList = CameraDevicesManager.this.cameraManager.getCameraIdList();
            p013kotlin.jvm.internal.s.j(cameraIdList, "getCameraIdList(...)");
            this.deviceIds = p013kotlin.collections.n.F1(cameraIdList);
        }

        private final boolean a(String cameraId) {
            try {
                CameraDevicesManager.this.cameraManager.getCameraCharacteristics(cameraId);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String cameraId) {
            p013kotlin.jvm.internal.s.k(cameraId, "cameraId");
            Log.i(CameraDevicesManager.TAG, "Camera #" + cameraId + " is now available.");
            if (this.deviceIds.contains(cameraId)) {
                return;
            }
            this.deviceIds.add(cameraId);
            CameraDevicesManager.this.sendAvailableDevicesChangedEvent();
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String cameraId) {
            p013kotlin.jvm.internal.s.k(cameraId, "cameraId");
            Log.i(CameraDevicesManager.TAG, "Camera #" + cameraId + " is now unavailable.");
            if (!this.deviceIds.contains(cameraId) || a(cameraId)) {
                return;
            }
            this.deviceIds.remove(cameraId);
            CameraDevicesManager.this.sendAvailableDevicesChangedEvent();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraDevicesManager(ReactApplicationContext reactContext) {
        super(reactContext);
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
        ExecutorService executorServiceB = dz.i.INSTANCE.b();
        this.executor = executorServiceB;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(executorServiceB));
        this.coroutineScope = CoroutineScope;
        Object systemService = reactContext.getSystemService("camera");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        this.cameraManager = (CameraManager) systemService;
        this.callback = new c();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new a(null), 3, null);
    }

    private final ReadableArray getDevicesJson() {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        x0.h hVar = this.cameraProvider;
        if (hVar == null) {
            p013kotlin.jvm.internal.s.h(writableArrayCreateArray);
            return writableArrayCreateArray;
        }
        ExtensionsManager extensionsManager = this.extensionsManager;
        if (extensionsManager == null) {
            p013kotlin.jvm.internal.s.h(writableArrayCreateArray);
            return writableArrayCreateArray;
        }
        Iterator<T> it = hVar.a().iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushMap(new dz.b((c0.n) it.next(), extensionsManager).l());
        }
        p013kotlin.jvm.internal.s.h(writableArrayCreateArray);
        return writableArrayCreateArray;
    }

    @ReactMethod
    public final void addListener(String eventName) {
        p013kotlin.jvm.internal.s.k(eventName, "eventName");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        ReadableArray devicesJson = getDevicesJson();
        ReadableMap map = devicesJson.size() > 0 ? devicesJson.getMap(0) : null;
        return v0.o(jn0.x.a("availableCameraDevices", devicesJson), jn0.x.a("userPreferredCameraDevice", map != null ? map.toHashMap() : null));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.cameraManager.registerAvailabilityCallback(this.callback, (Handler) null);
        sendAvailableDevicesChangedEvent();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.cameraManager.unregisterAvailabilityCallback(this.callback);
        super.invalidate();
    }

    @ReactMethod
    public final void removeListeners(int count) {
    }

    public final void sendAvailableDevicesChangedEvent() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("CameraDevicesChanged", getDevicesJson());
    }
}
