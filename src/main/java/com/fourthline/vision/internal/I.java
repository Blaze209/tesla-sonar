package com.fourthline.vision.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.view.PreviewView;
import androidx.core.util.Consumer;
import androidx.p003lifecycle.LifecycleOwner;
import com.fourthline.core.ContextExtensionsKt;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.SafeContinuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class I implements InterfaceC4264q, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f37751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0.p f37752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineScope f37753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f37754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private x0.h f37755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ExecutorService f37756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f37757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Size f37758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c0.h1 f37759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c0.r0 f37760j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.camera.core.f f37761k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private z0.r1 f37762l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f37763m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private z0.g1 f37764n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f37765o;

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f37767b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PreviewView f37769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.camera.core.f.a f37770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ LifecycleOwner f37771f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(PreviewView previewView, androidx.camera.core.f.a aVar, LifecycleOwner lifecycleOwner, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f37769d = previewView;
            this.f37770e = aVar;
            this.f37771f = lifecycleOwner;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return I.this.new a(this.f37769d, this.f37770e, this.f37771f, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            I i11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f37767b;
            if (i12 == 0) {
                jn0.t.b(obj);
                I i13 = I.this;
                com.google.common.util.concurrent.s<x0.h> sVarB = x0.h.INSTANCE.b(i13.f37751a);
                this.f37766a = i13;
                this.f37767b = 1;
                Object objA = androidx.concurrent.futures.e.a(sVarB, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i11 = i13;
                obj = objA;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = (I) this.f37766a;
                jn0.t.b(obj);
            }
            i11.f37755e = (x0.h) obj;
            I i14 = I.this;
            c0.c2 viewPort = this.f37769d.getViewPort();
            i14.initializeCameraProvider(viewPort != null ? viewPort.c() : 0, new Size(this.f37769d.getWidth(), this.f37769d.getHeight()), this.f37770e);
            x0.h hVar = I.this.f37755e;
            if (hVar != null) {
                hVar.h();
            }
            c0.h1 h1Var = I.this.f37759i;
            if (h1Var != null) {
                h1Var.l0(this.f37769d.getSurfaceProvider());
            }
            try {
                x0.h hVar2 = I.this.f37755e;
                if (hVar2 != null) {
                    hVar2.e(this.f37771f, I.this.f37752b, I.this.f37759i, I.this.f37760j, I.this.f37761k, I.this.f37762l);
                }
            } catch (Exception unused) {
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public static final class b implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f37772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final wn0.l f37773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final wn0.l f37774c;

        b(final I i11) {
            this.f37773b = new wn0.l() { // from class: com.fourthline.vision.internal.a8
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return I.b.boundingBoxToScreen$lambda$0(i11, (C4165c4) obj);
                }
            };
            this.f37774c = new wn0.l() { // from class: com.fourthline.vision.internal.b8
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return I.b.screenToBoundingBox$lambda$1(i11, (C4165c4) obj);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4165c4 boundingBoxToScreen$lambda$0(I i11, C4165c4 box) {
            p013kotlin.jvm.internal.s.k(box, "box");
            return AbstractC4292u0.translateTargetToScreen(box, new E5(i11.f37758h.getWidth(), i11.f37758h.getHeight()), new E5(480, 640), 0, p013kotlin.jvm.internal.s.f(i11.f37752b, c0.p.f18376c));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4165c4 screenToBoundingBox$lambda$1(I i11, C4165c4 box) {
            p013kotlin.jvm.internal.s.k(box, "box");
            return AbstractC4292u0.translateScreenToTarget$default(box, new E5(i11.f37758h.getWidth(), i11.f37758h.getHeight()), new E5(480, 640), 0, false, 16, (Object) null);
        }

        @Override // com.fourthline.vision.internal.r
        public int getAnalyzerTargetCoordinateSystem() {
            return this.f37772a;
        }

        @Override // com.fourthline.vision.internal.r
        public wn0.l<C4165c4, C4165c4> getBoundingBoxToScreen() {
            return this.f37773b;
        }

        @Override // com.fourthline.vision.internal.r
        public wn0.l<C4165c4, C4165c4> getScreenToBoundingBox() {
            return this.f37774c;
        }
    }

    public static final class c implements Z5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Channel f37775a = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);

        static final class a extends SuspendLambda implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f37777a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ K f37779c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(K k11, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f37779c = k11;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return c.this.new a(this.f37779c, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f37777a;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    Channel channel = c.this.f37775a;
                    K k11 = this.f37779c;
                    this.f37777a = 1;
                    if (channel.send(k11, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                return jn0.h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        static final class b extends ContinuationImpl {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f37780a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f37782c;

            b(Continuation<? super b> continuation) {
                super(continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f37780a = obj;
                this.f37782c |= Integer.MIN_VALUE;
                return c.this.stop(this);
            }
        }

        c() {
        }

        public final void sendResult(K result) {
            p013kotlin.jvm.internal.s.k(result, "result");
            BuildersKt__Builders_commonKt.launch$default(I.this.f37753c, null, null, new a(result, null), 3, null);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.fourthline.vision.internal.Z5
        public Object stop(Continuation<? super Uri> continuation) throws Z5.a {
            b bVar;
            if (continuation instanceof b) {
                bVar = (b) continuation;
                int i11 = bVar.f37782c;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    bVar.f37782c = i11 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(continuation);
                }
            } else {
                bVar = new b(continuation);
            }
            Object objReceive = bVar.f37780a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = bVar.f37782c;
            if (i12 == 0) {
                jn0.t.b(objReceive);
                I.this.stopRecording();
                Channel channel = this.f37775a;
                bVar.f37782c = 1;
                objReceive = channel.receive(bVar);
                if (objReceive == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(objReceive);
            }
            K k11 = (K) objReceive;
            if (k11 instanceof K.a) {
                throw new Z5.a(((K.a) k11).getThrowable());
            }
            if (!(k11 instanceof K.b)) {
                throw new NoWhenBranchMatchedException();
            }
            Uri savedUri = ((K.b) k11).getSavedUri();
            if (savedUri != null) {
                return savedUri;
            }
            throw new IllegalStateException("No URI returned");
        }
    }

    static final class d extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f37784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f37785c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c0.r0 f37786d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ I f37787e;

        public static final class a extends c0.r0.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Continuation f37788a;

            a(Continuation<? super C4236m> continuation) {
                this.f37788a = continuation;
            }

            @Override // c0.r0.e
            public void onCaptureSuccess(androidx.camera.core.n imageProxy) {
                p013kotlin.jvm.internal.s.k(imageProxy, "imageProxy");
                try {
                    Bitmap bitmapQ1 = imageProxy.q1();
                    imageProxy.close();
                    p013kotlin.jvm.internal.s.j(bitmapQ1, "apply(...)");
                    Bitmap bitmapRotate = rotate(bitmapQ1, imageProxy.z().d());
                    Continuation continuation = this.f37788a;
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    continuation.resumeWith(jn0.s.b(new C4236m(bitmapRotate, 0)));
                } catch (Exception e11) {
                    imageProxy.close();
                    Continuation continuation2 = this.f37788a;
                    jn0.s.Companion companion2 = jn0.s.INSTANCE;
                    continuation2.resumeWith(jn0.s.b(jn0.t.a(e11)));
                }
            }

            @Override // c0.r0.e
            public void onError(ImageCaptureException exception) {
                p013kotlin.jvm.internal.s.k(exception, "exception");
                Continuation continuation = this.f37788a;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                continuation.resumeWith(jn0.s.b(jn0.t.a(exception)));
            }

            public final Bitmap rotate(Bitmap bitmap, int i11) {
                p013kotlin.jvm.internal.s.k(bitmap, "<this>");
                if (i11 == 0) {
                    return bitmap;
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(i11);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                p013kotlin.jvm.internal.s.j(bitmapCreateBitmap, "createBitmap(...)");
                return bitmapCreateBitmap;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c0.r0 r0Var, I i11, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f37786d = r0Var;
            this.f37787e = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new d(this.f37786d, this.f37787e, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f37785c;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            jn0.t.b(obj);
            c0.r0 r0Var = this.f37786d;
            I i12 = this.f37787e;
            this.f37783a = r0Var;
            this.f37784b = i12;
            this.f37785c = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
            r0Var.J0(i12.f37757g, new a(safeContinuation));
            Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            return orThrow == coroutine_suspended ? coroutine_suspended : orThrow;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C4236m> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public I(Context context, c0.p cameraSelector, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(cameraSelector, "cameraSelector");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f37751a = context;
        this.f37752b = cameraSelector;
        this.f37753c = coroutineScope;
        this.f37754d = new b(this);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        p013kotlin.jvm.internal.s.j(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f37756f = executorServiceNewSingleThreadExecutor;
        Executor mainExecutor = androidx.core.content.b.getMainExecutor(context);
        p013kotlin.jvm.internal.s.j(mainExecutor, "getMainExecutor(...)");
        this.f37757g = mainExecutor;
        this.f37758h = new Size(0, 0);
        this.f37763m = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeCameraProvider(int i11, Size size, final androidx.camera.core.f.a aVar) {
        try {
            x0.h hVar = this.f37755e;
            if (hVar != null) {
                hVar.h();
            }
            this.f37759i = new c0.h1.a().e();
            this.f37760j = new c0.r0.b().h(1).e();
            androidx.camera.core.f fVarE = new androidx.camera.core.f.c().h(0).m(1).n(new s0.c.a().f(new s0.d(new Size(640, 480), 1)).a()).a(i11).e();
            fVarE.n0(this.f37756f, new androidx.camera.core.f.a() { // from class: com.fourthline.vision.internal.x7
                @Override // androidx.camera.core.f.a
                public final void analyze(androidx.camera.core.n nVar) {
                    I.initializeCameraProvider$lambda$1$lambda$0(aVar, nVar);
                }
            });
            this.f37761k = fVarE;
            z0.t0.i iVarD = new z0.t0.i().d(this.f37757g);
            if (getVideoRecordingBitrate() != -1) {
                iVarD.f(getVideoRecordingBitrate());
            }
            z0.t0 t0VarC = iVarD.c();
            p013kotlin.jvm.internal.s.j(t0VarC, "build(...)");
            this.f37762l = z0.r1.Z0(t0VarC);
            this.f37758h = size;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeCameraProvider$lambda$1$lambda$0(androidx.camera.core.f.a aVar, androidx.camera.core.n imageProxy) {
        p013kotlin.jvm.internal.s.k(imageProxy, "imageProxy");
        aVar.analyze(imageProxy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 recordVideo$lambda$3(c cVar, K result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        cVar.sendResult(result);
        return jn0.h0.f84049a;
    }

    private final void startRecording(z0.r1<z0.t0> r1Var, z0.r rVar, final wn0.l<? super K, jn0.h0> lVar) {
        if (this.f37765o) {
            return;
        }
        this.f37765o = true;
        this.f37764n = ((z0.t0) r1Var.F0()).e0(this.f37751a, rVar).j(this.f37757g, new Consumer() { // from class: com.fourthline.vision.internal.z7
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                I.startRecording$lambda$4(this.f39158a, lVar, (z0.d2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRecording$lambda$4(I i11, wn0.l lVar, z0.d2 d2Var) {
        if (!(d2Var instanceof z0.d2.d) && (d2Var instanceof z0.d2.a)) {
            i11.f37765o = false;
            z0.d2.a aVar = (z0.d2.a) d2Var;
            lVar.invoke(!aVar.m() ? new K.b(aVar.l().a()) : new K.a(aVar.j()));
            i11.f37764n = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopRecording() {
        if (this.f37765o) {
            z0.g1 g1Var = this.f37764n;
            if (g1Var != null) {
                g1Var.stop();
            }
            this.f37764n = null;
            this.f37765o = false;
        }
    }

    @Override // com.fourthline.vision.internal.InterfaceC4264q
    public void bindToPreview(PreviewView previewView, LifecycleOwner lifecycleOwner, androidx.camera.core.f.a analyzer) {
        p013kotlin.jvm.internal.s.k(previewView, "previewView");
        p013kotlin.jvm.internal.s.k(lifecycleOwner, "lifecycleOwner");
        p013kotlin.jvm.internal.s.k(analyzer, "analyzer");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(previewView, analyzer, lifecycleOwner, null), 3, null);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4264q
    public r getCoordinates() {
        return this.f37754d;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f37753c.getCoroutineContext();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4264q
    public int getVideoRecordingBitrate() {
        return this.f37763m;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4264q
    public Z5 recordVideo() {
        z0.r rVarB = new z0.r.a(new File(new File(ContextExtensionsKt.getFourthlineDirectory(this.f37751a)), "video_" + UUID.randomUUID() + ".mp4")).b();
        p013kotlin.jvm.internal.s.j(rVarB, "build(...)");
        z0.r1<z0.t0> r1Var = this.f37762l;
        if (r1Var == null) {
            throw new IllegalStateException("VideoCapture not ready");
        }
        final c cVar = new c();
        startRecording(r1Var, rVarB, new wn0.l() { // from class: com.fourthline.vision.internal.y7
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return I.recordVideo$lambda$3(cVar, (K) obj);
            }
        });
        return cVar;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4264q
    public void setVideoRecordingBitrate(int i11) {
        this.f37763m = i11;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4264q
    public Object takePicture(Continuation<? super C4236m> continuation) {
        c0.r0 r0Var = this.f37760j;
        if (r0Var != null) {
            return BuildersKt.withContext(Dispatchers.getMain(), new d(r0Var, this, null), continuation);
        }
        throw new IllegalStateException("ImageCapture not ready");
    }
}
