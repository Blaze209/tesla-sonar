package com.fourthline.vision.internal;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Handler;
import android.view.Surface;
import com.fourthline.core.internal.Try;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.SafeContinuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.vision.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4257p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CameraManager f38714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f38715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4312x f38716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f38717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CameraDevice f38718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private B2 f38719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private F f38720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f38721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MeteringRectangle f38722i;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.p$a */
    static final class a implements wn0.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f38724b;

        a(b bVar) {
            this.f38724b = bVar;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return jn0.h0.f84049a;
        }

        public final void invoke(Throwable th2) {
            C4257p.this.f38714a.unregisterAvailabilityCallback(this.f38724b);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.p$b */
    public static final class b extends CameraManager.AvailabilityCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4257p f38726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation f38727c;

        b(String str, C4257p c4257p, CancellableContinuation<? super Boolean> cancellableContinuation) {
            this.f38725a = str;
            this.f38726b = c4257p;
            this.f38727c = cancellableContinuation;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            this.f38726b.f38714a.unregisterAvailabilityCallback(this);
            if (this.f38727c.isActive()) {
                CancellableContinuation cancellableContinuation = this.f38727c;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                cancellableContinuation.resumeWith(jn0.s.b(Boolean.TRUE));
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String id2) {
            p013kotlin.jvm.internal.s.k(id2, "id");
            if (p013kotlin.jvm.internal.s.f(id2, this.f38725a)) {
                this.f38726b.f38714a.unregisterAvailabilityCallback(this);
                CancellableContinuation cancellableContinuation = this.f38727c;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                cancellableContinuation.resumeWith(jn0.s.b(Boolean.TRUE));
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String id2) {
            p013kotlin.jvm.internal.s.k(id2, "id");
            if (p013kotlin.jvm.internal.s.f(id2, this.f38725a)) {
                this.f38726b.f38714a.unregisterAvailabilityCallback(this);
                CancellableContinuation cancellableContinuation = this.f38727c;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                cancellableContinuation.resumeWith(jn0.s.b(Boolean.FALSE));
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.p$c */
    public static final class c extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f38728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CameraDevice f38729b;

        c(Continuation<? super CameraCaptureSession> continuation, CameraDevice cameraDevice) {
            this.f38728a = continuation;
            this.f38729b = cameraDevice;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession session) {
            p013kotlin.jvm.internal.s.k(session, "session");
            AbstractC4277s.b bVar = new AbstractC4277s.b("Camera " + this.f38729b.getId() + " session configuration failed");
            Continuation continuation = this.f38728a;
            jn0.s.Companion companion = jn0.s.INSTANCE;
            continuation.resumeWith(jn0.s.b(jn0.t.a(bVar)));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession session) {
            p013kotlin.jvm.internal.s.k(session, "session");
            this.f38728a.resumeWith(jn0.s.b(session));
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.p$d */
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38730a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38732c;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38730a = obj;
            this.f38732c |= Integer.MIN_VALUE;
            return C4257p.this.initializeCamera$fourthline_vision_release(null, this);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.p$e */
    static final class e extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f38734b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f38736d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(List<? extends Surface> list, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f38736d = list;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return C4257p.this.new e(this.f38736d, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0077  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
        
            if (r2 == r1) goto L29;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 244
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.C4257p.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.p$f */
    public static final class f extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation f38738b;

        f(String str, CancellableContinuation<? super CameraDevice> cancellableContinuation) {
            this.f38737a = str;
            this.f38738b = cancellableContinuation;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice device) {
            p013kotlin.jvm.internal.s.k(device, "device");
            AbstractC4277s.a aVar = new AbstractC4277s.a("Camera " + this.f38737a + " is closed");
            if (this.f38738b.isActive()) {
                CancellableContinuation cancellableContinuation = this.f38738b;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                cancellableContinuation.resumeWith(jn0.s.b(jn0.t.a(aVar)));
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice device) {
            p013kotlin.jvm.internal.s.k(device, "device");
            if (this.f38738b.isActive()) {
                CancellableContinuation cancellableContinuation = this.f38738b;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                cancellableContinuation.resumeWith(jn0.s.b(jn0.t.a(new AbstractC4277s.a(null, 1, null))));
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice device, int i11) {
            String str;
            p013kotlin.jvm.internal.s.k(device, "device");
            if (i11 == 1) {
                str = "Camera in use";
            } else if (i11 == 2) {
                str = "Maximum cameras in use";
            } else if (i11 == 3) {
                str = "Device policy";
            } else if (i11 != 4) {
                str = i11 != 5 ? "Unknown" : "Fatal (service)";
            } else {
                str = "Fatal (device)";
            }
            AbstractC4277s.a aVar = new AbstractC4277s.a("Camera " + this.f38737a + " error: (" + i11 + ") " + str);
            if (this.f38738b.isActive()) {
                CancellableContinuation cancellableContinuation = this.f38738b;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                cancellableContinuation.resumeWith(jn0.s.b(jn0.t.a(aVar)));
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice device) {
            p013kotlin.jvm.internal.s.k(device, "device");
            this.f38738b.resumeWith(jn0.s.b(device));
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.p$g */
    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f38740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f38741c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38743e;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38741c = obj;
            this.f38743e |= Integer.MIN_VALUE;
            return C4257p.this.waitCameraCanOpen(null, this);
        }
    }

    public C4257p(CameraManager cameraManager, Handler cameraHandler, C4312x cameraInfoProvider) {
        p013kotlin.jvm.internal.s.k(cameraManager, "cameraManager");
        p013kotlin.jvm.internal.s.k(cameraHandler, "cameraHandler");
        p013kotlin.jvm.internal.s.k(cameraInfoProvider, "cameraInfoProvider");
        this.f38714a = cameraManager;
        this.f38715b = cameraHandler;
        this.f38716c = cameraInfoProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object canOpen(String str, Continuation<? super Boolean> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        b bVar = new b(str, this, cancellableContinuationImpl);
        cancellableContinuationImpl.invokeOnCancellation(new a(bVar));
        this.f38714a.registerAvailabilityCallback(bVar, this.f38715b);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object createCaptureSession(CameraDevice cameraDevice, List<? extends Surface> list, Continuation<? super CameraCaptureSession> continuation) throws Throwable {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        cameraDevice.createCaptureSession(list, new c(safeContinuation, cameraDevice), this.f38715b);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final Object openCamera(CameraManager cameraManager, String str, Continuation<? super CameraDevice> continuation) throws CameraAccessException {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cameraManager.openCamera(str, new f(str, cancellableContinuationImpl), this.f38715b);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(50, r0) == r1) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0071 -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitCameraCanOpen(java.lang.String r9, p013kotlin.coroutines.Continuation<? super jn0.h0> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.fourthline.vision.internal.C4257p.g
            if (r0 == 0) goto L13
            r0 = r10
            com.fourthline.vision.internal.p$g r0 = (com.fourthline.vision.internal.C4257p.g) r0
            int r1 = r0.f38743e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38743e = r1
            goto L18
        L13:
            com.fourthline.vision.internal.p$g r0 = new com.fourthline.vision.internal.p$g
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f38741c
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f38743e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r9 = r0.f38740b
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.f38739a
            com.fourthline.vision.internal.p r2 = (com.fourthline.vision.internal.C4257p) r2
            jn0.t.b(r10)
        L33:
            r10 = r2
            goto L4d
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            java.lang.Object r9 = r0.f38740b
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.f38739a
            com.fourthline.vision.internal.p r2 = (com.fourthline.vision.internal.C4257p) r2
            jn0.t.b(r10)
            goto L5d
        L49:
            jn0.t.b(r10)
            r10 = r8
        L4d:
            r0.f38739a = r10
            r0.f38740b = r9
            r0.f38743e = r4
            java.lang.Object r2 = r10.canOpen(r9, r0)
            if (r2 != r1) goto L5a
            goto L73
        L5a:
            r7 = r2
            r2 = r10
            r10 = r7
        L5d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L74
            r0.f38739a = r2
            r0.f38740b = r9
            r0.f38743e = r3
            r5 = 50
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.delay(r5, r0)
            if (r10 != r1) goto L33
        L73:
            return r1
        L74:
            jn0.h0 r9 = jn0.h0.f84049a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.C4257p.waitCameraCanOpen(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void changeFocusArea$fourthline_vision_release(Rect focusArea, Rect cameraPreviewRect) throws CameraAccessException {
        p013kotlin.jvm.internal.s.k(focusArea, "focusArea");
        p013kotlin.jvm.internal.s.k(cameraPreviewRect, "cameraPreviewRect");
        if (C4257p.class.isAnonymousClass()) {
            String name = C4257p.class.getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = C4257p.class.getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(focusArea);
        Objects.toString(cameraPreviewRect);
        if (focusArea.isEmpty() || cameraPreviewRect.isEmpty() || this.f38720g == null || this.f38721h == null) {
            return;
        }
        B2 b11 = this.f38719f;
        List<? extends Surface> list = null;
        if (b11 == null) {
            p013kotlin.jvm.internal.s.B("focusingAreaCalculator");
            b11 = null;
        }
        MeteringRectangle meteringRectangleCalculateFocusArea = b11.calculateFocusArea(focusArea, cameraPreviewRect, this.f38716c.getOrientationHint());
        if (C4257p.class.isAnonymousClass()) {
            String name2 = C4257p.class.getName();
            int length3 = name2.length();
            p013kotlin.jvm.internal.s.h(name2);
            if (length3 > 23) {
                p013kotlin.jvm.internal.s.j(name2.substring(name2.length() - 23, name2.length()), "substring(...)");
            }
        } else {
            String simpleName2 = C4257p.class.getSimpleName();
            int length4 = simpleName2.length();
            p013kotlin.jvm.internal.s.h(simpleName2);
            if (length4 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName2.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(meteringRectangleCalculateFocusArea);
        if (meteringRectangleCalculateFocusArea == null || p013kotlin.jvm.internal.s.f(meteringRectangleCalculateFocusArea, this.f38722i)) {
            return;
        }
        this.f38722i = meteringRectangleCalculateFocusArea;
        F f11 = this.f38720g;
        if (f11 == null) {
            p013kotlin.jvm.internal.s.B("cameraCaptureSession");
            f11 = null;
        }
        String str = this.f38717d;
        if (str == null) {
            p013kotlin.jvm.internal.s.B("cameraId");
            str = null;
        }
        List<? extends Surface> list2 = this.f38721h;
        if (list2 == null) {
            p013kotlin.jvm.internal.s.B("targets");
        } else {
            list = list2;
        }
        f11.setup$fourthline_vision_release(str, list, meteringRectangleCalculateFocusArea);
    }

    public final void closeCamera$fourthline_vision_release() {
        CameraDevice cameraDevice = this.f38718e;
        if (cameraDevice != null) {
            cameraDevice.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object initializeCamera$fourthline_vision_release(List<? extends Surface> list, Continuation<? super Try<jn0.h0>> continuation) {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f38732c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f38732c = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f38730a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f38732c;
        try {
            if (i12 == 0) {
                jn0.t.b(obj);
                Try.Companion companion = Try.INSTANCE;
                this.f38721h = list;
                String cameraId = this.f38716c.getCameraId();
                if (cameraId == null) {
                    throw AbstractC4277s.d.f38822a;
                }
                this.f38717d = cameraId;
                MainCoroutineDispatcher main = Dispatchers.getMain();
                e eVar = new e(list, null);
                dVar.f38732c = 1;
                if (BuildersKt.withContext(main, eVar, dVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return new Try.Success(jn0.h0.f84049a);
        } catch (Throwable th2) {
            if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError)) {
                throw th2;
            }
            return new Try.Failure(th2);
        }
    }
}
