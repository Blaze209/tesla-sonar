package com.fourthline.vision.internal;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import com.fourthline.core.VideoDuration;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.Try;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.MotionData;
import com.fourthline.vision.ScannerImage;
import com.fourthline.vision.selfie.LivenessCheckType;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.SelfieScannerMetadata;
import com.fourthline.vision.selfie.SelfieScannerResult;
import com.fourthline.vision.selfie.SelfieScannerWarning;
import com.fourthline.vision.selfie.compose.SelfieScannerEvent;
import com.fourthline.vision.selfie.compose.SelfieScannerInternalConfig;
import com.fourthline.vision.selfie.internal.domain.steps.HeadMetadata;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.vision.internal.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4242m5 implements H5, InterfaceC4267q2, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f38581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f38582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.a f38583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SelfieScannerConfig f38584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wn0.l f38585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC4264q f38586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final E3 f38587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TimestampProvider f38588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final LocationProvider f38589i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final U2 f38590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C4283s5 f38591k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C4151a6 f38592l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Y3 f38593m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private H5.a f38594n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private R2 f38595o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f38596p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Pair f38597q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Job f38598r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Job f38599s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final p020r2.p1 f38600t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f38601u;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.m5$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LivenessCheckType.values().length];
            try {
                iArr[LivenessCheckType.HEAD_TURN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LivenessCheckType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[R2.values().length];
            try {
                iArr2[R2.Selfie.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[R2.HeadTurnLeft.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[R2.HeadTurnRight.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[R2.RandomnessLiveness.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.m5$b */
    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f38603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f38604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f38605d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f38606e;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            b bVar = C4242m5.this.new b(continuation);
            bVar.f38606e = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0123  */
        /* JADX WARN: Code duplicated, block: B:30:0x0137  */
        /* JADX WARN: Code duplicated, block: B:33:0x0149  */
        /* JADX WARN: Code duplicated, block: B:34:0x015a  */
        /* JADX WARN: Code duplicated, block: B:37:0x016c  */
        /* JADX WARN: Code duplicated, block: B:39:0x0178  */
        /* JADX WARN: Code duplicated, block: B:41:0x017c  */
        /* JADX WARN: Code duplicated, block: B:44:0x01cc  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Pair pair;
            Bitmap bitmap;
            VideoRecording videoRecording;
            Pair pair2;
            CoroutineScope coroutineScope2;
            VideoRecording videoRecording2;
            Try r14;
            String simpleName;
            int length;
            String name;
            int length2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f38605d;
            MotionData motionData = null;
            if (i11 == 0) {
                jn0.t.b(obj);
                CoroutineScope coroutineScope3 = (CoroutineScope) this.f38606e;
                Pair pair3 = C4242m5.this.f38597q;
                if (pair3 == null) {
                    C4242m5.this.fail(SelfieScannerError.UNKNOWN);
                    return jn0.h0.f84049a;
                }
                C4165c4 rectangle = AbstractC4173d4.toRectangle(k3.z3.a((j3.i) C4242m5.this.f38583c.invoke()));
                Bitmap bitmapCropBitmap = Y1.cropBitmap(((C4236m) pair3.e()).getBitmap(), AbstractC4292u0.translateScreenToTarget(new C4301v2(true).performCorrection(rectangle, rectangle, (C4165c4) pair3.f()), (E5) C4242m5.this.f38582b.invoke(), new E5(((C4236m) pair3.e()).getBitmap().getWidth(), ((C4236m) pair3.e()).getBitmap().getHeight()), ((C4236m) pair3.e()).getRotationDegrees(), true), ((C4236m) pair3.e()).getRotationDegrees());
                C4151a6 c4151a6 = C4242m5.this.f38592l;
                this.f38606e = coroutineScope3;
                this.f38602a = pair3;
                this.f38603b = bitmapCropBitmap;
                this.f38605d = 1;
                Object objStopRecording = c4151a6.stopRecording(this);
                if (objStopRecording != coroutine_suspended) {
                    coroutineScope = coroutineScope3;
                    obj = objStopRecording;
                    pair = pair3;
                    bitmap = bitmapCropBitmap;
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                bitmap = (Bitmap) this.f38603b;
                pair = (Pair) this.f38602a;
                coroutineScope = (CoroutineScope) this.f38606e;
                jn0.t.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                videoRecording2 = (VideoRecording) this.f38604c;
                bitmap = (Bitmap) this.f38603b;
                pair2 = (Pair) this.f38602a;
                coroutineScope2 = (CoroutineScope) this.f38606e;
                jn0.t.b(obj);
            }
            r14 = (Try) obj;
            if (r14 instanceof Try.Failure) {
                Throwable exception = ((Try.Failure) r14).getException();
                if (coroutineScope2.getClass().isAnonymousClass()) {
                    name = coroutineScope2.getClass().getName();
                    length2 = name.length();
                    p013kotlin.jvm.internal.s.h(name);
                    if (length2 > 23) {
                        p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
                    }
                } else {
                    simpleName = coroutineScope2.getClass().getSimpleName();
                    length = simpleName.length();
                    p013kotlin.jvm.internal.s.h(simpleName);
                    if (length > 23) {
                        p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
                    }
                }
                Objects.toString(exception);
            } else {
                if (r14 instanceof Try.Success) {
                    throw new NoWhenBranchMatchedException();
                }
                motionData = (MotionData) ((Try.Success) r14).getValue();
            }
            SelfieScannerResult selfieScannerResult = new SelfieScannerResult(new ScannerImage(((C4236m) pair2.e()).getBitmap(), bitmap), new SelfieScannerMetadata(C4242m5.this.f38588h.getCurrentTime(), C4242m5.this.f38589i.getLocation(), motionData), videoRecording2);
            C4242m5.this.f38585e.invoke(new SelfieScannerEvent.OnSuccess(selfieScannerResult));
            C4242m5.this.f38591k.onSuccess(selfieScannerResult);
            return jn0.h0.f84049a;
            Uri uri = (Uri) obj;
            if (uri != null) {
                URI uriCreate = URI.create(uri.toString());
                p013kotlin.jvm.internal.s.j(uriCreate, "create(...)");
                videoRecording = new VideoRecording(uriCreate, VideoDuration.DEFAULT.INSTANCE, null, 4, null);
            } else {
                videoRecording = null;
            }
            E3 e11 = C4242m5.this.f38587g;
            this.f38606e = coroutineScope;
            this.f38602a = pair;
            this.f38603b = bitmap;
            this.f38604c = videoRecording;
            this.f38605d = 2;
            obj = e11.stop(this);
            if (obj != coroutine_suspended) {
                pair2 = pair;
                coroutineScope2 = coroutineScope;
                videoRecording2 = videoRecording;
                r14 = (Try) obj;
                if (r14 instanceof Try.Failure) {
                    Throwable exception2 = ((Try.Failure) r14).getException();
                    if (coroutineScope2.getClass().isAnonymousClass()) {
                        name = coroutineScope2.getClass().getName();
                        length2 = name.length();
                        p013kotlin.jvm.internal.s.h(name);
                        if (length2 > 23) {
                            p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
                        }
                    } else {
                        simpleName = coroutineScope2.getClass().getSimpleName();
                        length = simpleName.length();
                        p013kotlin.jvm.internal.s.h(simpleName);
                        if (length > 23) {
                            p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
                        }
                    }
                    Objects.toString(exception2);
                } else {
                    if (r14 instanceof Try.Success) {
                        throw new NoWhenBranchMatchedException();
                    }
                    motionData = (MotionData) ((Try.Success) r14).getValue();
                }
                SelfieScannerResult selfieScannerResult2 = new SelfieScannerResult(new ScannerImage(((C4236m) pair2.e()).getBitmap(), bitmap), new SelfieScannerMetadata(C4242m5.this.f38588h.getCurrentTime(), C4242m5.this.f38589i.getLocation(), motionData), videoRecording2);
                C4242m5.this.f38585e.invoke(new SelfieScannerEvent.OnSuccess(selfieScannerResult2));
                C4242m5.this.f38591k.onSuccess(selfieScannerResult2);
                return jn0.h0.f84049a;
            }
            return coroutine_suspended;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.m5$c */
    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f38609b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C4165c4 f38611d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C4165c4 c4165c4, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f38611d = c4165c4;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return C4242m5.this.new c(this.f38611d, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C4242m5 c4242m5;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f38609b;
            if (i11 == 0) {
                jn0.t.b(obj);
                C4242m5 c4242m6 = C4242m5.this;
                InterfaceC4264q interfaceC4264q = c4242m6.f38586f;
                this.f38608a = c4242m6;
                this.f38609b = 1;
                Object objTakePicture = interfaceC4264q.takePicture(this);
                if (objTakePicture == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c4242m5 = c4242m6;
                obj = objTakePicture;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4242m5 = (C4242m5) this.f38608a;
                jn0.t.b(obj);
            }
            c4242m5.f38597q = jn0.x.a(obj, this.f38611d);
            C4242m5.this.startRecording();
            if (C4242m5.this.isRandomnessLivenessEnabled()) {
                C4242m5.this.proceedToRandomnessLiveness();
            } else {
                C4242m5.this.proceedNextStep();
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.m5$d */
    static final class d extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38612a;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return C4242m5.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f38612a;
            if (i11 == 0) {
                jn0.t.b(obj);
                this.f38612a = 1;
                if (DelayKt.delay(60000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            C4242m5.this.onTimeout();
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.m5$e */
    static final class e extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38614a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return C4242m5.this.new e(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f38614a;
            if (i11 == 0) {
                jn0.t.b(obj);
                this.f38614a = 1;
                if (DelayKt.delay(30000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            C4242m5.this.onTimeout();
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public C4242m5(wn0.a<E5> screenSize, wn0.a<j3.i> detectionArea, SelfieScannerConfig config, wn0.l<? super SelfieScannerEvent, jn0.h0> callback, InterfaceC4264q cameraEngine, E3 motionDataManager, TimestampProvider timestampProvider, LocationProvider locationProvider, U2 isSteadyProvider, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(screenSize, "screenSize");
        p013kotlin.jvm.internal.s.k(detectionArea, "detectionArea");
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        p013kotlin.jvm.internal.s.k(cameraEngine, "cameraEngine");
        p013kotlin.jvm.internal.s.k(motionDataManager, "motionDataManager");
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(locationProvider, "locationProvider");
        p013kotlin.jvm.internal.s.k(isSteadyProvider, "isSteadyProvider");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f38581a = coroutineScope;
        this.f38582b = screenSize;
        this.f38583c = detectionArea;
        this.f38584d = config;
        this.f38585e = callback;
        this.f38586f = cameraEngine;
        this.f38587g = motionDataManager;
        this.f38588h = timestampProvider;
        this.f38589i = locationProvider;
        this.f38590j = isSteadyProvider;
        this.f38591k = new C4283s5(config, new wn0.a() { // from class: com.fourthline.vision.internal.ta
            @Override // wn0.a
            public final Object invoke() {
                return C4242m5.analytics$lambda$0(this.f38926a);
            }
        });
        this.f38592l = new C4151a6(cameraEngine, config.getRecordingType(), this, VideoDuration.DEFAULT.INSTANCE.getDuration(), new wn0.a() { // from class: com.fourthline.vision.internal.ua
            @Override // wn0.a
            public final Object invoke() {
                return C4242m5.videoRecorderManager$lambda$1(this.f38981a);
            }
        });
        this.f38593m = new Y3(new wn0.a() { // from class: com.fourthline.vision.internal.va
            @Override // wn0.a
            public final Object invoke() {
                return C4242m5.randomnessLivenessSteps$lambda$2(this.f39051a);
            }
        });
        this.f38594n = H5.a.d.f37750a;
        this.f38595o = R2.Selfie;
        this.f38596p = p013kotlin.collections.v.m();
        this.f38600t = p020r2.s3.d(null, null, 2, null);
        start();
        isSteadyProvider.start();
        this.f38601u = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List analytics$lambda$0(C4242m5 c4242m5) {
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = c4242m5.f38584d.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness != null) {
            return randomnessLiveness.getSessionRandomnessLivenessSteps();
        }
        return null;
    }

    private final boolean areEyesOpen(zx.a aVar) {
        Float fG = aVar.g();
        Float f11 = aVar.f();
        return fG != null && f11 != null && fG.floatValue() >= 0.6f && f11.floatValue() >= 0.6f;
    }

    private final void cancelTimeouts() {
        Job job = this.f38598r;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.f38599s;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(SelfieScannerError selfieScannerError) {
        H5.a state = getState();
        if (!(state instanceof H5.a.d) && !(state instanceof H5.a.C0633a)) {
            if (!(state instanceof H5.a.b) && !(state instanceof H5.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            setState(H5.a.c.f37749a);
            cancelTimeouts();
            this.f38585e.invoke(new SelfieScannerEvent.OnFail(selfieScannerError));
            this.f38591k.onFail(this.f38595o.toPublicStep(), selfieScannerError, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRandomnessLivenessEnabled() {
        return this.f38584d.getInternalConfig().getRandomnessLiveness() != null;
    }

    private final void onAllStepsCompleted() {
        cancelTimeouts();
        this.f38590j.stop();
        setState(H5.a.b.f37748a);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 onFacesDetection$lambda$4(C4242m5 c4242m5, HeadMetadata it) {
        wn0.l<SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent, jn0.h0> callback;
        p013kotlin.jvm.internal.s.k(it, "it");
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = c4242m5.f38584d.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness != null && (callback = randomnessLiveness.getCallback()) != null) {
            callback.invoke(new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnHeadMoved(it));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 onFacesDetection$lambda$5(C4242m5 c4242m5, int i11) {
        wn0.l<SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent, jn0.h0> callback;
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = c4242m5.f38584d.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness != null && (callback = randomnessLiveness.getCallback()) != null) {
            callback.invoke(new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepUpdate(i11));
        }
        c4242m5.resetStepTimeout();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 onFacesDetection$lambda$6(C4242m5 c4242m5, int i11) {
        wn0.l<SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent, jn0.h0> callback;
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = c4242m5.f38584d.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness != null && (callback = randomnessLiveness.getCallback()) != null) {
            callback.invoke(new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepSuccess(i11));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 onFacesDetection$lambda$7(C4242m5 c4242m5) {
        c4242m5.onAllStepsCompleted();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTimeout() {
        fail(SelfieScannerError.TIMEOUT);
        Job job = this.f38598r;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.f38599s;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void proceedNextStep() {
        int iIndexOf = this.f38596p.indexOf(this.f38595o);
        if (iIndexOf >= this.f38596p.size() - 1) {
            onAllStepsCompleted();
            return;
        }
        this.f38595o = (R2) this.f38596p.get(iIndexOf + 1);
        setState(H5.a.C0633a.f37747a);
        resetStepTimeout();
        this.f38585e.invoke(new SelfieScannerEvent.OnStepUpdate(this.f38595o.toPublicStep()));
        this.f38591k.onStepUpdate(this.f38595o.toPublicStep());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void proceedToRandomnessLiveness() {
        wn0.l<SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent, jn0.h0> callback;
        wn0.l<SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent, jn0.h0> callback2;
        resetStepTimeout();
        this.f38593m.start();
        Y3 y11 = this.f38593m;
        y11.start();
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = this.f38584d.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness != null && (callback2 = randomnessLiveness.getCallback()) != null) {
            callback2.invoke(new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepCountUpdate(y11.getSteps().size()));
        }
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness2 = this.f38584d.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness2 != null && (callback = randomnessLiveness2.getCallback()) != null) {
            callback.invoke(new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepUpdate(((Number) p013kotlin.collections.v.o0(y11.getSteps())).intValue()));
        }
        this.f38595o = R2.RandomnessLiveness;
        setState(H5.a.C0633a.f37747a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List randomnessLivenessSteps$lambda$2(C4242m5 c4242m5) {
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = c4242m5.f38584d.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness != null) {
            return randomnessLiveness.getSessionRandomnessLivenessSteps();
        }
        return null;
    }

    private final void resetScannerTimeout() {
        Job job = this.f38598r;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f38598r = BuildersKt__Builders_commonKt.launch$default(this, null, null, new d(null), 3, null);
    }

    private final void resetStepTimeout() {
        Job job = this.f38599s;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f38599s = BuildersKt__Builders_commonKt.launch$default(this, null, null, new e(null), 3, null);
    }

    private final void resetSteps() {
        List listP0;
        cancelTimeouts();
        R2 r11 = R2.Selfie;
        this.f38595o = r11;
        int i11 = a.$EnumSwitchMapping$0[this.f38584d.getLivenessCheckType().ordinal()];
        if (i11 == 1) {
            listP0 = p013kotlin.collections.v.P0(p013kotlin.collections.v.e(r11), p013kotlin.collections.v.v(p013kotlin.collections.v.p(R2.HeadTurnLeft, R2.HeadTurnRight), zn0.d.a(System.currentTimeMillis())));
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listP0 = p013kotlin.collections.v.e(r11);
        }
        this.f38596p = listP0;
    }

    private void setRecognizedBounds(C4165c4 c4165c4) {
        this.f38600t.setValue(c4165c4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startRecording() {
        this.f38592l.startRecording();
        this.f38587g.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 videoRecorderManager$lambda$1(C4242m5 c4242m5) {
        c4242m5.fail(SelfieScannerError.RECORDING_FAILED);
        return jn0.h0.f84049a;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f38581a.getCoroutineContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fourthline.vision.internal.H5
    public C4165c4 getRecognizedBounds() {
        return (C4165c4) this.f38600t.getValue();
    }

    @Override // com.fourthline.vision.internal.H5
    public H5.a getState() {
        return this.f38594n;
    }

    @Override // com.fourthline.vision.internal.H5
    public void moveToNextStep() {
        proceedNextStep();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4267q2
    public void onFacesDetection(List<? extends zx.a> faces) {
        p013kotlin.jvm.internal.s.k(faces, "faces");
        H5.a state = getState();
        if (!(state instanceof H5.a.C0633a)) {
            if (!(state instanceof H5.a.d) && !(state instanceof H5.a.b) && !(state instanceof H5.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        faces.size();
        if (faces.size() > 1) {
            fail(SelfieScannerError.MULTIPLE_FACES_DETECTED);
            return;
        }
        if (faces.isEmpty()) {
            if (this.f38595o == R2.Selfie) {
                this.f38585e.invoke(new SelfieScannerEvent.OnWarnings(p013kotlin.collections.v.e(SelfieScannerWarning.FACE_NOT_DETECTED)));
                return;
            } else {
                if (System.currentTimeMillis() - this.f38601u > 200) {
                    fail(SelfieScannerError.FACE_DISAPPEARED);
                    return;
                }
                return;
            }
        }
        zx.a aVar = faces.get(0);
        wn0.l<C4165c4, C4165c4> boundingBoxToScreen = this.f38586f.getCoordinates().getBoundingBoxToScreen();
        Rect rectA = aVar.a();
        p013kotlin.jvm.internal.s.j(rectA, "getBoundingBox(...)");
        C4165c4 c4165c4Invoke = boundingBoxToScreen.invoke(AbstractC4173d4.toRectangle(rectA));
        setRecognizedBounds(c4165c4Invoke);
        this.f38601u = System.currentTimeMillis();
        int i11 = a.$EnumSwitchMapping$1[this.f38595o.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                if (aVar.d() > 20.0f) {
                    proceedNextStep();
                    return;
                }
                return;
            } else if (i11 != 3) {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f38593m.process(aVar, new wn0.l() { // from class: com.fourthline.vision.internal.pa
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return C4242m5.onFacesDetection$lambda$4(this.f38767a, (HeadMetadata) obj);
                    }
                }, new wn0.l() { // from class: com.fourthline.vision.internal.qa
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return C4242m5.onFacesDetection$lambda$5(this.f38793a, ((Integer) obj).intValue());
                    }
                }, new wn0.l() { // from class: com.fourthline.vision.internal.ra
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return C4242m5.onFacesDetection$lambda$6(this.f38816a, ((Integer) obj).intValue());
                    }
                }, new wn0.a() { // from class: com.fourthline.vision.internal.sa
                    @Override // wn0.a
                    public final Object invoke() {
                        return C4242m5.onFacesDetection$lambda$7(this.f38869a);
                    }
                });
                return;
            } else {
                if (aVar.d() < -20.0f) {
                    proceedNextStep();
                    return;
                }
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (!this.f38590j.isSteady()) {
            arrayList.add(SelfieScannerWarning.DEVICE_NOT_STEADY);
        }
        if (aVar.d() > 6.0f) {
            arrayList.add(SelfieScannerWarning.FACE_YAW_TOO_BIG);
        }
        if (!k3.z3.a((j3.i) this.f38583c.invoke()).contains(AbstractC4173d4.toRect(c4165c4Invoke))) {
            arrayList.add(SelfieScannerWarning.FACE_NOT_IN_FRAME);
        }
        if (!arrayList.isEmpty()) {
            this.f38585e.invoke(new SelfieScannerEvent.OnWarnings(arrayList));
            return;
        }
        cancelTimeouts();
        setState(H5.a.d.f37750a);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(c4165c4Invoke, null), 3, null);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4267q2
    public void onModelsMissing() {
        fail(SelfieScannerError.RECOGNITION_MODELS_NOT_DOWNLOADED);
    }

    @Override // com.fourthline.vision.internal.H5
    public void resetCurrentStep() {
    }

    @Override // com.fourthline.vision.internal.H5
    public void restart() {
        this.f38591k.onReset();
        this.f38593m.reset();
        setState(H5.a.d.f37750a);
        cancelTimeouts();
        start();
    }

    public void setState(H5.a aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<set-?>");
        this.f38594n = aVar;
    }

    @Override // com.fourthline.vision.internal.H5
    public void start() {
        resetScannerTimeout();
        resetSteps();
        setState(H5.a.C0633a.f37747a);
        this.f38591k.onStart();
        this.f38585e.invoke(new SelfieScannerEvent.OnStepUpdate(this.f38595o.toPublicStep()));
        this.f38591k.onStepUpdate(this.f38595o.toPublicStep());
        resetStepTimeout();
    }

    @Override // com.fourthline.vision.internal.H5
    public void stop() {
        if (getState() instanceof H5.a.C0633a) {
            fail(SelfieScannerError.SCANNER_INTERRUPTED);
        }
    }

    @Override // com.fourthline.vision.internal.H5
    public void takeSnapshot() {
    }
}
