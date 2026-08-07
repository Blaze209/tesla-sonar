package com.mrousavy.camera.react;

import android.content.ComponentCallbacks2;
import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.b1;
import com.mrousavy.camera.frameprocessors.VisionCameraInstaller;
import com.mrousavy.camera.frameprocessors.VisionCameraProxy;
import dz.v1;
import dz.y1;
import fz.TakeSnapshotOptions;
import java.util.concurrent.CancellationException;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@xn.a(name = "CameraView")
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b!\u0010\"J'\u0010$\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b$\u0010\"J'\u0010'\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b+\u0010*J\u001f\u0010,\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b,\u0010*J\u001f\u0010-\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b-\u0010*J'\u0010/\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b/\u0010\"J\u000f\u00100\u001a\u00020\u000bH\u0007¢\u0006\u0004\b0\u0010\u001bJ\u000f\u00101\u001a\u00020\u000bH\u0007¢\u0006\u0004\b1\u0010\u001bJ\u000f\u00102\u001a\u00020\u000bH\u0007¢\u0006\u0004\b2\u0010\u001bJ\u0017\u00103\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b5\u00104J\u0017\u00106\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b6\u00104R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/mrousavy/camera/react/CameraViewModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "viewId", "Lcom/mrousavy/camera/react/o;", "findCameraView", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "permission", "", "canRequestPermission", "(Ljava/lang/String;)Z", "Lfz/k;", "getPermission", "(Ljava/lang/String;)Lfz/k;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "requestPermission", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "invalidate", "()V", "getName", "()Ljava/lang/String;", "installFrameProcessorBindings", "()Z", "viewTag", "Lcom/facebook/react/bridge/ReadableMap;", "options", "takePhoto", "(ILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "jsOptions", "takeSnapshot", "Lcom/facebook/react/bridge/Callback;", "onRecordCallback", "startRecording", "(ILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V", "pauseRecording", "(ILcom/facebook/react/bridge/Promise;)V", "resumeRecording", "stopRecording", "cancelRecording", "point", "focus", "getCameraPermissionStatus", "getMicrophonePermissionStatus", "getLocationPermissionStatus", "requestCameraPermission", "(Lcom/facebook/react/bridge/Promise;)V", "requestMicrophonePermission", "requestLocationPermission", "Lkotlinx/coroutines/CoroutineScope;", "backgroundCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Companion", "a", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CameraViewModule extends ReactContextBaseJavaModule {
    public static final String TAG = "CameraView";
    private final CoroutineScope backgroundCoroutineScope;
    private static int sharedRequestCode = 10;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.mrousavy.camera.react.CameraViewModule$cancelRecording$1", f = "CameraViewModule.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f45673n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f45675p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Promise f45676q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, Promise promise, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f45675p = i11;
            this.f45676q = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return CameraViewModule.this.new b(this.f45675p, this.f45676q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws y1 {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f45673n;
            if (i11 == 0) {
                jn0.t.b(obj);
                CameraViewModule cameraViewModule = CameraViewModule.this;
                int i12 = this.f45675p;
                this.f45673n = 1;
                obj = cameraViewModule.findCameraView(i12, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            o oVar = (o) obj;
            Promise promise = this.f45676q;
            try {
                w.c(oVar);
                promise.resolve(null);
            } catch (Throwable th2) {
                th2.printStackTrace();
                dz.c v1Var = th2 instanceof dz.c ? th2 : new v1(th2);
                promise.reject(v1Var.getDomain() + "/" + v1Var.getId(), v1Var.getMessage(), v1Var.getCause());
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation f45677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f45678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CameraViewModule f45679c;

        public c(CancellableContinuation cancellableContinuation, int i11, CameraViewModule cameraViewModule) {
            this.f45677a = cancellableContinuation;
            this.f45678b = i11;
            this.f45679c = cameraViewModule;
        }

        @Override // java.lang.Runnable
        public final void run() throws y1 {
            if (this.f45677a.isCancelled()) {
                throw new CancellationException();
            }
            Log.d("CameraView", "Finding view " + this.f45678b + "...");
            ReactApplicationContext reactApplicationContext = this.f45679c.getReactApplicationContext();
            if (reactApplicationContext == null) {
                throw new Error("React Context was null!");
            }
            UIManager uIManagerG = b1.g(reactApplicationContext, 1);
            if (uIManagerG == null) {
                throw new Error("UIManager not found!");
            }
            View viewResolveView = uIManagerG.resolveView(this.f45678b);
            o oVar = viewResolveView instanceof o ? (o) viewResolveView : null;
            if (oVar == null) {
                throw new y1(this.f45678b);
            }
            Log.d("CameraView", "Found view " + this.f45678b + "!");
            this.f45677a.resumeWith(jn0.s.b(oVar));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.mrousavy.camera.react.CameraViewModule$focus$1", f = "CameraViewModule.kt", i = {1}, l = {183, 185}, m = "invokeSuspend", n = {"promise$iv"}, s = {"L$0"})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f45680n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f45681o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f45683q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Promise f45684r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ ReadableMap f45685s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11, Promise promise, ReadableMap readableMap, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f45683q = i11;
            this.f45684r = promise;
            this.f45685s = readableMap;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return CameraViewModule.this.new d(this.f45683q, this.f45684r, this.f45685s, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0054  */
        /* JADX WARN: Code duplicated, block: B:30:0x0057  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws y1 {
            o oVar;
            Promise promise;
            ReadableMap readableMap;
            Promise promise2;
            dz.c v1Var;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f45681o;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    CameraViewModule cameraViewModule = CameraViewModule.this;
                    int i12 = this.f45683q;
                    this.f45681o = 1;
                    obj = cameraViewModule.findCameraView(i12, this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    promise2 = (Promise) this.f45680n;
                    try {
                        jn0.t.b(obj);
                        promise2.resolve(null);
                    } catch (Throwable th2) {
                        th = th2;
                        th.printStackTrace();
                        if (th instanceof dz.c) {
                            v1Var = th;
                        } else {
                            v1Var = new v1(th);
                        }
                        promise2.reject(v1Var.getDomain() + "/" + v1Var.getId(), v1Var.getMessage(), v1Var.getCause());
                    }
                    return h0.f84049a;
                }
                jn0.t.b(obj);
                this.f45680n = promise;
                this.f45681o = 2;
                if (t.a(oVar, readableMap, this) != coroutine_suspended) {
                    promise2 = promise;
                    promise2.resolve(null);
                    return h0.f84049a;
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                th = th3;
                promise2 = promise;
                th.printStackTrace();
                if (th instanceof dz.c) {
                    v1Var = th;
                } else {
                    v1Var = new v1(th);
                }
                promise2.reject(v1Var.getDomain() + "/" + v1Var.getId(), v1Var.getMessage(), v1Var.getCause());
            }
            oVar = (o) obj;
            promise = this.f45684r;
            readableMap = this.f45685s;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.mrousavy.camera.react.CameraViewModule$pauseRecording$1", f = "CameraViewModule.kt", i = {0}, l = {140}, m = "invokeSuspend", n = {"promise$iv"}, s = {"L$0"})
    static final class e extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f45686n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f45687o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Promise f45688p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ CameraViewModule f45689q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f45690r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Promise promise, CameraViewModule cameraViewModule, int i11, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f45688p = promise;
            this.f45689q = cameraViewModule;
            this.f45690r = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new e(this.f45688p, this.f45689q, this.f45690r, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0048  */
        /* JADX WARN: Code duplicated, block: B:24:0x004b  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Promise promise;
            dz.c th2;
            dz.c v1Var;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f45687o;
            if (i11 == 0) {
                jn0.t.b(obj);
                Promise promise2 = this.f45688p;
                CameraViewModule cameraViewModule = this.f45689q;
                int i12 = this.f45690r;
                try {
                    this.f45686n = promise2;
                    this.f45687o = 1;
                    Object objFindCameraView = cameraViewModule.findCameraView(i12, this);
                    if (objFindCameraView == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    promise = promise2;
                    obj = objFindCameraView;
                } catch (Throwable th3) {
                    promise = promise2;
                    th2 = th3;
                    th2.printStackTrace();
                    if (th2 instanceof dz.c) {
                        v1Var = th2;
                    } else {
                        v1Var = new v1(th2);
                    }
                    promise.reject(v1Var.getDomain() + "/" + v1Var.getId(), v1Var.getMessage(), v1Var.getCause());
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                promise = (Promise) this.f45686n;
                try {
                    jn0.t.b(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    th2.printStackTrace();
                    if (th2 instanceof dz.c) {
                        v1Var = th2;
                    } else {
                        v1Var = new v1(th2);
                    }
                    promise.reject(v1Var.getDomain() + "/" + v1Var.getId(), v1Var.getMessage(), v1Var.getCause());
                }
            }
            w.d((o) obj);
            promise.resolve(null);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.mrousavy.camera.react.CameraViewModule$resumeRecording$1", f = "CameraViewModule.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f45691n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f45693p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Promise f45694q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i11, Promise promise, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f45693p = i11;
            this.f45694q = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return CameraViewModule.this.new f(this.f45693p, this.f45694q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws y1 {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f45691n;
            if (i11 == 0) {
                jn0.t.b(obj);
                CameraViewModule cameraViewModule = CameraViewModule.this;
                int i12 = this.f45693p;
                this.f45691n = 1;
                obj = cameraViewModule.findCameraView(i12, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            o oVar = (o) obj;
            Promise promise = this.f45694q;
            try {
                w.e(oVar);
                promise.resolve(null);
            } catch (Throwable th2) {
                th2.printStackTrace();
                dz.c v1Var = th2 instanceof dz.c ? th2 : new v1(th2);
                promise.reject(v1Var.getDomain() + "/" + v1Var.getId(), v1Var.getMessage(), v1Var.getCause());
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.mrousavy.camera.react.CameraViewModule$startRecording$1", f = "CameraViewModule.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f45695n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f45697p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ ReadableMap f45698q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Callback f45699r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i11, ReadableMap readableMap, Callback callback, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f45697p = i11;
            this.f45698q = readableMap;
            this.f45699r = callback;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return CameraViewModule.this.new g(this.f45697p, this.f45698q, this.f45699r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws y1 {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f45695n;
            if (i11 == 0) {
                jn0.t.b(obj);
                CameraViewModule cameraViewModule = CameraViewModule.this;
                int i12 = this.f45697p;
                this.f45695n = 1;
                obj = cameraViewModule.findCameraView(i12, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            o oVar = (o) obj;
            try {
                fz.p.Companion companion = fz.p.INSTANCE;
                ReactApplicationContext reactApplicationContext = CameraViewModule.this.getReactApplicationContext();
                p013kotlin.jvm.internal.s.j(reactApplicationContext, "access$getReactApplicationContext(...)");
                w.f(oVar, companion.a(reactApplicationContext, this.f45698q), this.f45699r);
            } catch (dz.c e11) {
                this.f45699r.invoke(null, iz.a.c(e11.getDomain() + "/" + e11.getId(), e11.getMessage(), e11, null, 8, null));
            } catch (Throwable th2) {
                this.f45699r.invoke(null, iz.a.c("capture/unknown", "An unknown error occurred while trying to start a video recording! " + th2.getMessage(), th2, null, 8, null));
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.mrousavy.camera.react.CameraViewModule$stopRecording$1", f = "CameraViewModule.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f45700n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f45702p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Promise f45703q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i11, Promise promise, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f45702p = i11;
            this.f45703q = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return CameraViewModule.this.new h(this.f45702p, this.f45703q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws y1 {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f45700n;
            if (i11 == 0) {
                jn0.t.b(obj);
                CameraViewModule cameraViewModule = CameraViewModule.this;
                int i12 = this.f45702p;
                this.f45700n = 1;
                obj = cameraViewModule.findCameraView(i12, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            o oVar = (o) obj;
            Promise promise = this.f45703q;
            try {
                w.i(oVar);
                promise.resolve(null);
            } catch (Throwable th2) {
                th2.printStackTrace();
                dz.c v1Var = th2 instanceof dz.c ? th2 : new v1(th2);
                promise.reject(v1Var.getDomain() + "/" + v1Var.getId(), v1Var.getMessage(), v1Var.getCause());
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.mrousavy.camera.react.CameraViewModule$takePhoto$1", f = "CameraViewModule.kt", i = {1}, l = {94, 96}, m = "invokeSuspend", n = {"promise$iv"}, s = {"L$0"})
    static final class i extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f45704n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f45705o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f45707q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Promise f45708r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ ReadableMap f45709s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i11, Promise promise, ReadableMap readableMap, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f45707q = i11;
            this.f45708r = promise;
            this.f45709s = readableMap;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return CameraViewModule.this.new i(this.f45707q, this.f45708r, this.f45709s, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0053  */
        /* JADX WARN: Code duplicated, block: B:29:0x0056  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws y1 {
            o oVar;
            Promise promise;
            ReadableMap readableMap;
            Promise promise2;
            dz.c v1Var;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f45705o;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    CameraViewModule cameraViewModule = CameraViewModule.this;
                    int i12 = this.f45707q;
                    this.f45705o = 1;
                    obj = cameraViewModule.findCameraView(i12, this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    promise2 = (Promise) this.f45704n;
                    try {
                        jn0.t.b(obj);
                        promise2.resolve(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        th.printStackTrace();
                        if (th instanceof dz.c) {
                            v1Var = th;
                        } else {
                            v1Var = new v1(th);
                        }
                        promise2.reject(v1Var.getDomain() + "/" + v1Var.getId(), v1Var.getMessage(), v1Var.getCause());
                    }
                    return h0.f84049a;
                }
                jn0.t.b(obj);
                this.f45704n = promise;
                this.f45705o = 2;
                obj = x.a(oVar, readableMap, this);
                if (obj != coroutine_suspended) {
                    promise2 = promise;
                    promise2.resolve(obj);
                    return h0.f84049a;
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                th = th3;
                promise2 = promise;
                th.printStackTrace();
                if (th instanceof dz.c) {
                    v1Var = th;
                } else {
                    v1Var = new v1(th);
                }
                promise2.reject(v1Var.getDomain() + "/" + v1Var.getId(), v1Var.getMessage(), v1Var.getCause());
            }
            oVar = (o) obj;
            promise = this.f45708r;
            readableMap = this.f45709s;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.mrousavy.camera.react.CameraViewModule$takeSnapshot$1", f = "CameraViewModule.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f45710n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f45712p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ ReadableMap f45713q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Promise f45714r;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CameraViewModule f45715a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ReadableMap f45716b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ o f45717c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Promise f45718d;

            public a(CameraViewModule cameraViewModule, ReadableMap readableMap, o oVar, Promise promise) {
                this.f45715a = cameraViewModule;
                this.f45716b = readableMap;
                this.f45717c = oVar;
                this.f45718d = promise;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    TakeSnapshotOptions.Companion companion = TakeSnapshotOptions.INSTANCE;
                    ReactApplicationContext reactApplicationContext = this.f45715a.getReactApplicationContext();
                    p013kotlin.jvm.internal.s.j(reactApplicationContext, "access$getReactApplicationContext(...)");
                    this.f45718d.resolve(y.a(this.f45717c, companion.a(reactApplicationContext, this.f45716b)));
                } catch (Throwable th2) {
                    this.f45718d.reject(th2);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i11, ReadableMap readableMap, Promise promise, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f45712p = i11;
            this.f45713q = readableMap;
            this.f45714r = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return CameraViewModule.this.new j(this.f45712p, this.f45713q, this.f45714r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws y1 {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f45710n;
            if (i11 == 0) {
                jn0.t.b(obj);
                CameraViewModule cameraViewModule = CameraViewModule.this;
                int i12 = this.f45712p;
                this.f45710n = 1;
                obj = cameraViewModule.findCameraView(i12, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            o oVar = (o) obj;
            CameraViewModule cameraViewModule2 = CameraViewModule.this;
            ReadableMap readableMap = this.f45713q;
            Promise promise = this.f45714r;
            if (UiThreadUtil.isOnUiThread()) {
                try {
                    TakeSnapshotOptions.Companion companion = TakeSnapshotOptions.INSTANCE;
                    ReactApplicationContext reactApplicationContext = cameraViewModule2.getReactApplicationContext();
                    p013kotlin.jvm.internal.s.j(reactApplicationContext, "access$getReactApplicationContext(...)");
                    promise.resolve(y.a(oVar, companion.a(reactApplicationContext, readableMap)));
                } catch (Throwable th2) {
                    promise.reject(th2);
                }
            } else {
                UiThreadUtil.runOnUiThread(new a(cameraViewModule2, readableMap, oVar, promise));
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    static {
        try {
            System.loadLibrary("VisionCamera");
        } catch (UnsatisfiedLinkError e11) {
            Log.e("VisionCameraProxy", "Failed to load VisionCamera C++ library!", e11);
            throw e11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraViewModule(ReactApplicationContext reactContext) {
        super(reactContext);
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        this.backgroundCoroutineScope = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(dz.i.INSTANCE.b()));
    }

    private final boolean canRequestPermission(String permission) {
        ComponentCallbacks2 currentActivity = getReactApplicationContext().getCurrentActivity();
        co.f fVar = currentActivity instanceof co.f ? (co.f) currentActivity : null;
        if (fVar != null) {
            return fVar.shouldShowRequestPermissionRationale(permission);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object findCameraView(int i11, Continuation<? super o> continuation) throws y1 {
        if (!UiThreadUtil.isOnUiThread()) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            UiThreadUtil.runOnUiThread(new c(cancellableContinuationImpl, i11, this));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }
        Log.d("CameraView", "Finding view " + i11 + "...");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null) {
            throw new Error("React Context was null!");
        }
        UIManager uIManagerG = b1.g(reactApplicationContext, 1);
        if (uIManagerG == null) {
            throw new Error("UIManager not found!");
        }
        View viewResolveView = uIManagerG.resolveView(i11);
        o oVar = viewResolveView instanceof o ? (o) viewResolveView : null;
        if (oVar == null) {
            throw new y1(i11);
        }
        Log.d("CameraView", "Found view " + i11 + "!");
        return oVar;
    }

    private final fz.k getPermission(String permission) {
        fz.k kVarA = fz.k.INSTANCE.a(androidx.core.content.b.checkSelfPermission(getReactApplicationContext(), permission));
        return (kVarA == fz.k.DENIED && canRequestPermission(permission)) ? fz.k.NOT_DETERMINED : kVarA;
    }

    private final void requestPermission(String permission, final Promise promise) {
        ComponentCallbacks2 currentActivity = getReactApplicationContext().getCurrentActivity();
        if (!(currentActivity instanceof co.f)) {
            promise.reject("NO_ACTIVITY", "No PermissionAwareActivity was found! Make sure the app has launched before calling this function.");
            return;
        }
        final int i11 = sharedRequestCode;
        sharedRequestCode = i11 + 1;
        ((co.f) currentActivity).a(new String[]{permission}, i11, new co.g() { // from class: com.mrousavy.camera.react.q
            @Override // co.g
            public final boolean onRequestPermissionsResult(int i12, String[] strArr, int[] iArr) {
                return CameraViewModule.requestPermission$lambda$1(i11, promise, i12, strArr, iArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean requestPermission$lambda$1(int i11, Promise promise, int i12, String[] strArr, int[] grantResults) {
        p013kotlin.jvm.internal.s.k(strArr, "<unused var>");
        p013kotlin.jvm.internal.s.k(grantResults, "grantResults");
        if (i12 != i11) {
            return false;
        }
        promise.resolve(fz.k.INSTANCE.a(!(grantResults.length == 0) ? grantResults[0] : -1).getUnionValue());
        return true;
    }

    @ReactMethod
    public final void cancelRecording(int viewTag, Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this.backgroundCoroutineScope, null, null, new b(viewTag, promise, null), 3, null);
    }

    @ReactMethod
    public final void focus(int viewTag, ReadableMap point, Promise promise) {
        p013kotlin.jvm.internal.s.k(point, "point");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this.backgroundCoroutineScope, null, null, new d(viewTag, promise, point, null), 3, null);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final String getCameraPermissionStatus() {
        return getPermission("android.permission.CAMERA").getUnionValue();
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final String getLocationPermissionStatus() {
        fz.k permission = getPermission("android.permission.ACCESS_FINE_LOCATION");
        return permission == fz.k.GRANTED ? permission.getUnionValue() : getPermission("android.permission.ACCESS_COARSE_LOCATION").getUnionValue();
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final String getMicrophonePermissionStatus() {
        return getPermission("android.permission.RECORD_AUDIO").getUnionValue();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CameraView";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean installFrameProcessorBindings() {
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            p013kotlin.jvm.internal.s.j(reactApplicationContext, "getReactApplicationContext(...)");
            VisionCameraInstaller.install(new VisionCameraProxy(reactApplicationContext));
            return true;
        } catch (Error e11) {
            Log.e("CameraView", "Failed to install Frame Processor JSI Bindings!", e11);
            return false;
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        if (CoroutineScopeKt.isActive(this.backgroundCoroutineScope)) {
            CoroutineScopeKt.cancel$default(this.backgroundCoroutineScope, "CameraViewModule has been destroyed.", null, 2, null);
        }
    }

    @ReactMethod
    public final void pauseRecording(int viewTag, Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this.backgroundCoroutineScope, null, null, new e(promise, this, viewTag, null), 3, null);
    }

    @ReactMethod
    public final void requestCameraPermission(Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        requestPermission("android.permission.CAMERA", promise);
    }

    @ReactMethod
    public final void requestLocationPermission(Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        requestPermission("android.permission.ACCESS_FINE_LOCATION", promise);
    }

    @ReactMethod
    public final void requestMicrophonePermission(Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        requestPermission("android.permission.RECORD_AUDIO", promise);
    }

    @ReactMethod
    public final void resumeRecording(int viewTag, Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this.backgroundCoroutineScope, null, null, new f(viewTag, promise, null), 3, null);
    }

    @ReactMethod
    public final void startRecording(int viewTag, ReadableMap jsOptions, Callback onRecordCallback) {
        p013kotlin.jvm.internal.s.k(jsOptions, "jsOptions");
        p013kotlin.jvm.internal.s.k(onRecordCallback, "onRecordCallback");
        BuildersKt__Builders_commonKt.launch$default(this.backgroundCoroutineScope, null, null, new g(viewTag, jsOptions, onRecordCallback, null), 3, null);
    }

    @ReactMethod
    public final void stopRecording(int viewTag, Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this.backgroundCoroutineScope, null, null, new h(viewTag, promise, null), 3, null);
    }

    @ReactMethod
    public final void takePhoto(int viewTag, ReadableMap options, Promise promise) {
        p013kotlin.jvm.internal.s.k(options, "options");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this.backgroundCoroutineScope, null, null, new i(viewTag, promise, options, null), 3, null);
    }

    @ReactMethod
    public final void takeSnapshot(int viewTag, ReadableMap jsOptions, Promise promise) {
        p013kotlin.jvm.internal.s.k(jsOptions, "jsOptions");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this.backgroundCoroutineScope, null, null, new j(viewTag, jsOptions, promise, null), 3, null);
    }
}
