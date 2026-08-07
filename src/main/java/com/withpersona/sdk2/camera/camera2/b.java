package com.withpersona.sdk2.camera.camera2;

import android.graphics.Point;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import bg0.CameraChoice;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Kind;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.SafeContinuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 *2\u00020\u0001:\u0001-B3\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b\"\u0010!J-\u0010*\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u001f¢\u0006\u0004\b,\u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00103R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00105R\"\u0010;\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00107\u001a\u0004\b8\u0010\u001e\"\u0004\b9\u0010:R$\u0010B\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010DR\u0016\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010F¨\u0006G"}, d2 = {"Lcom/withpersona/sdk2/camera/camera2/b;", "", "Lbg0/i;", "cameraChoice", "", "Landroid/view/Surface;", "targets", "Landroid/os/Handler;", "handler", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "<init>", "(Lbg0/i;Ljava/util/List;Landroid/os/Handler;Landroid/hardware/camera2/CameraCharacteristics;)V", "Landroid/hardware/camera2/CameraDevice;", Kind.DEVICE, "Landroid/hardware/camera2/CameraCaptureSession;", "f", "(Landroid/hardware/camera2/CameraDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "stateCallback", "", "k", "(Landroid/hardware/camera2/CameraDevice;Ljava/util/List;Landroid/os/Handler;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Z", "session", "previewStabilization", "surfaces", "Landroid/hardware/camera2/CaptureRequest;", "g", "(Landroid/hardware/camera2/CameraCaptureSession;ZLjava/util/List;)Landroid/hardware/camera2/CaptureRequest;", "h", "()Z", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "()V", "l", "", "x", "y", "Landroid/util/Size;", "size", "", "duration", "j", "(IILandroid/util/Size;J)V", "e", "a", "Lbg0/i;", "b", "Ljava/util/List;", "c", "Landroid/os/Handler;", "Landroid/hardware/camera2/CameraCharacteristics;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Z", "getEnableTorch", IntegerTokenConverter.CONVERTER_KEY, "(Z)V", "enableTorch", "Landroid/hardware/camera2/params/MeteringRectangle;", "Landroid/hardware/camera2/params/MeteringRectangle;", "getMeteringRect", "()Landroid/hardware/camera2/params/MeteringRectangle;", "setMeteringRect", "(Landroid/hardware/camera2/params/MeteringRectangle;)V", "meteringRect", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "resetFocusJob", "Landroid/hardware/camera2/CameraCaptureSession;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CameraChoice cameraChoice;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Surface> targets;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CameraCharacteristics cameraCharacteristics;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean enableTorch;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private MeteringRectangle meteringRect;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Job resetFocusJob;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private CameraCaptureSession session;

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.camera2.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/camera/camera2/b$a;", "", "<init>", "()V", "Lbg0/i;", "cameraChoice", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "", "Landroid/view/Surface;", "targets", "Landroid/hardware/camera2/CameraDevice;", Kind.DEVICE, "Landroid/os/Handler;", "handler", "Lcom/withpersona/sdk2/camera/camera2/b;", "a", "(Lbg0/i;Landroid/hardware/camera2/CameraCharacteristics;Ljava/util/List;Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.withpersona.sdk2.camera.camera2.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$Companion", f = "CameraCaptureSessionWrapper.kt", i = {}, l = {42}, m = "create", n = {}, s = {})
        static final class C1160a extends ContinuationImpl {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f57293n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f57294o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f57295p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f57297r;

            C1160a(Continuation<? super C1160a> continuation) {
                super(continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f57295p = obj;
                this.f57297r |= Integer.MIN_VALUE;
                return Companion.this.a(null, null, null, null, null, this);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        public final Object a(CameraChoice cameraChoice, CameraCharacteristics cameraCharacteristics, List<? extends Surface> list, CameraDevice cameraDevice, Handler handler, Continuation<? super b> continuation) {
            C1160a c1160a;
            b bVar;
            b bVar2;
            if (continuation instanceof C1160a) {
                c1160a = (C1160a) continuation;
                int i11 = c1160a.f57297r;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c1160a.f57297r = i11 - Integer.MIN_VALUE;
                } else {
                    c1160a = new C1160a(continuation);
                }
            } else {
                c1160a = new C1160a(continuation);
            }
            Object objF = c1160a.f57295p;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = c1160a.f57297r;
            if (i12 == 0) {
                t.b(objF);
                b bVar3 = new b(cameraChoice, list, handler, cameraCharacteristics, null);
                c1160a.f57293n = bVar3;
                c1160a.f57294o = bVar3;
                c1160a.f57297r = 1;
                objF = bVar3.f(cameraDevice, c1160a);
                if (objF == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bVar = bVar3;
                bVar2 = bVar;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (b) c1160a.f57294o;
                bVar2 = (b) c1160a.f57293n;
                t.b(objF);
            }
            bVar.session = (CameraCaptureSession) objF;
            return bVar2;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.camera2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/withpersona/sdk2/camera/camera2/b$b", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "Landroid/hardware/camera2/CameraCaptureSession;", "session", "Ljn0/h0;", "onConfigured", "(Landroid/hardware/camera2/CameraCaptureSession;)V", "onConfigureFailed", "onReady", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1161b extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation<CameraCaptureSession> f57298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CameraDevice f57299b;

        /* JADX WARN: Multi-variable type inference failed */
        C1161b(Continuation<? super CameraCaptureSession> continuation, CameraDevice cameraDevice) {
            this.f57298a = continuation;
            this.f57299b = cameraDevice;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession session) {
            s.k(session, "session");
            RuntimeException runtimeException = new RuntimeException("Camera " + this.f57299b.getId() + " session configuration failed");
            Continuation<CameraCaptureSession> continuation = this.f57298a;
            jn0.s.Companion companion = jn0.s.INSTANCE;
            continuation.resumeWith(jn0.s.b(t.a(runtimeException)));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession session) {
            s.k(session, "session");
            this.f57298a.resumeWith(jn0.s.b(session));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession session) {
            s.k(session, "session");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$setFocus$1", f = "CameraCaptureSessionWrapper.kt", i = {}, l = {159, 161}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f57300n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ long f57301o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ b f57302p;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$setFocus$1$1", f = "CameraCaptureSessionWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f57303n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ b f57304o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f57304o = bVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f57304o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f57303n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.f57304o.d();
                this.f57304o.l();
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j11, b bVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f57301o = j11;
            this.f57302p = bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new c(this.f57301o, this.f57302p, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6) == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f57300n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r7)
                goto L41
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                jn0.t.b(r7)
                goto L2c
            L1e:
                jn0.t.b(r7)
                long r4 = r6.f57301o
                r6.f57300n = r3
                java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r4, r6)
                if (r7 != r0) goto L2c
                goto L40
            L2c:
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                com.withpersona.sdk2.camera.camera2.b$c$a r1 = new com.withpersona.sdk2.camera.camera2.b$c$a
                com.withpersona.sdk2.camera.camera2.b r3 = r6.f57302p
                r4 = 0
                r1.<init>(r3, r4)
                r6.f57300n = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto L41
            L40:
                return r0
            L41:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.camera.camera2.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public /* synthetic */ b(CameraChoice cameraChoice, List list, Handler handler, CameraCharacteristics cameraCharacteristics, DefaultConstructorMarker defaultConstructorMarker) {
        this(cameraChoice, list, handler, cameraCharacteristics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        this.meteringRect = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(CameraDevice cameraDevice, Continuation<? super CameraCaptureSession> continuation) throws Throwable {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        k(cameraDevice, this.targets, this.handler, new C1161b(safeContinuation, cameraDevice));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    private final CaptureRequest g(CameraCaptureSession session, boolean previewStabilization, List<? extends Surface> surfaces) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest = session.getDevice().createCaptureRequest(1);
        Iterator<T> it = surfaces.iterator();
        while (it.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it.next());
        }
        builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, this.cameraChoice.g());
        if (previewStabilization && Build.VERSION.SDK_INT >= 33) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        }
        if (this.enableTorch) {
            builderCreateCaptureRequest.set(CaptureRequest.FLASH_MODE, 2);
        }
        MeteringRectangle meteringRectangle = this.meteringRect;
        if (meteringRectangle != null && h()) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{meteringRectangle});
        }
        CaptureRequest captureRequestBuild = builderCreateCaptureRequest.build();
        s.j(captureRequestBuild, "build(...)");
        return captureRequestBuild;
    }

    private final boolean h() {
        Integer num = (Integer) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        return (num != null ? num.intValue() : 0) >= 1;
    }

    private final boolean k(CameraDevice device, List<? extends Surface> targets, Handler handler, CameraCaptureSession.StateCallback stateCallback) throws CameraAccessException {
        if (Build.VERSION.SDK_INT < 33) {
            device.createCaptureSession(targets, stateCallback, handler);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Surface> it = targets.iterator();
        while (it.hasNext()) {
            OutputConfiguration outputConfiguration = new OutputConfiguration(it.next());
            outputConfiguration.setDynamicRangeProfile(this.cameraChoice.getAdditionalOptions().getDynamicRange());
            arrayList.add(outputConfiguration);
        }
        device.createCaptureSessionByOutputConfigurations(arrayList, stateCallback, handler);
        return true;
    }

    public final void e() {
        CoroutineScopeKt.cancel$default(this.coroutineScope, null, 1, null);
    }

    public final void i(boolean z11) {
        this.enableTorch = z11;
    }

    public final void j(int x11, int y11, Size size, long duration) {
        s.k(size, "size");
        this.meteringRect = new MeteringRectangle(new Point(x11, y11), size, 1000);
        Job job = this.resetFocusJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.resetFocusJob = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new c(duration, this, null), 3, null);
    }

    public final void l() {
        CameraCaptureSession cameraCaptureSession = this.session;
        if (cameraCaptureSession == null) {
            s.B("session");
            cameraCaptureSession = null;
        }
        CaptureRequest captureRequestG = g(cameraCaptureSession, this.cameraChoice.getAdditionalOptions().getPreviewStabilization(), this.targets);
        CameraCaptureSession cameraCaptureSession2 = this.session;
        if (cameraCaptureSession2 == null) {
            s.B("session");
            cameraCaptureSession2 = null;
        }
        cameraCaptureSession2.setRepeatingRequest(captureRequestG, null, this.handler);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(CameraChoice cameraChoice, List<? extends Surface> list, Handler handler, CameraCharacteristics cameraCharacteristics) {
        this.cameraChoice = cameraChoice;
        this.targets = list;
        this.handler = handler;
        this.cameraCharacteristics = cameraCharacteristics;
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
    }
}
