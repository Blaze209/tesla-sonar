package com.fourthline.vision.internal;

import android.graphics.Rect;
import android.net.Uri;
import android.util.Size;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.Try;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.core.mrz.IdlMrzInfoValidationError;
import com.fourthline.core.mrz.MrtdMrzInfoValidationError;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.core.mrz.ValidationError;
import com.fourthline.vision.MotionData;
import com.fourthline.vision.ScannerImage;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerDataSource;
import com.fourthline.vision.document.DocumentScannerError;
import com.fourthline.vision.document.DocumentScannerMetadata;
import com.fourthline.vision.document.DocumentScannerResult;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepError;
import com.fourthline.vision.document.DocumentScannerStepMetadata;
import com.fourthline.vision.document.DocumentScannerStepResult;
import com.fourthline.vision.document.DocumentScannerStepWarning;
import com.fourthline.vision.document.MrzValidationPolicy;
import com.fourthline.vision.document.compose.DocumentScannerEvent;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
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
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class X1 implements H5, M0, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f38036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4264q f38037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DocumentScannerConfig f38038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wn0.l f38039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wn0.a f38040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wn0.a f38041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final E3 f38042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TimestampProvider f38043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final LocationProvider f38044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final U2 f38045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p020r2.p1 f38046k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C4246n2 f38047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C4149a4.a f38048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C4151a6 f38049n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f38050o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f38051p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private H5.a f38052q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Job f38053r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Job f38054s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private MrzInfo f38055t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f38056u;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MrzValidationPolicy.values().length];
            try {
                iArr[MrzValidationPolicy.STRONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MrzValidationPolicy.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MrzValidationPolicy.WEAK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38057a;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return X1.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f38057a;
            if (i11 == 0) {
                jn0.t.b(obj);
                X1 x11 = X1.this;
                this.f38057a = 1;
                if (x11.finishScanner(this) == coroutine_suspended) {
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
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f38060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f38061c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38063e;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38061c = obj;
            this.f38063e |= Integer.MIN_VALUE;
            return X1.this.finishScanner(this);
        }
    }

    public static final class d implements DocumentScannerDataSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f38064a;

        d() {
            this.f38064a = X1.this.f38038c.getShouldStartAutomatically();
        }

        @Override // com.fourthline.vision.document.DocumentScannerDataSource
        public DocumentScannerConfig getConfig() {
            return X1.this.f38038c;
        }

        @Override // com.fourthline.vision.document.DocumentScannerDataSource
        public Rect getDocumentDetectionArea() {
            return k3.z3.a((j3.i) X1.this.f38040e.invoke());
        }

        @Override // com.fourthline.vision.document.DocumentScannerDataSource
        public boolean getShouldStartAutomatically() {
            return this.f38064a;
        }
    }

    static final class e extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38066a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return X1.this.new e(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f38066a;
            if (i11 == 0) {
                jn0.t.b(obj);
                this.f38066a = 1;
                if (DelayKt.delay(60000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            X1.this.timeout();
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    static final class f extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38068a;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return X1.this.new f(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f38068a;
            if (i11 == 0) {
                jn0.t.b(obj);
                this.f38068a = 1;
                if (DelayKt.delay(40000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            X1.this.timeout();
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    static final class g extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f38071b;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return X1.this.new g(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            X1 x11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f38071b;
            if (i11 == 0) {
                jn0.t.b(obj);
                X1 x12 = X1.this;
                InterfaceC4264q interfaceC4264q = x12.f38037b;
                this.f38070a = x12;
                this.f38071b = 1;
                Object objTakePicture = interfaceC4264q.takePicture(this);
                if (objTakePicture == coroutine_suspended) {
                    return coroutine_suspended;
                }
                x11 = x12;
                obj = objTakePicture;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x11 = (X1) this.f38070a;
                jn0.t.b(obj);
            }
            x11.takeSnapshot((C4236m) obj);
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public X1(InterfaceC4264q cameraEngine, DocumentScannerConfig config, wn0.l<? super DocumentScannerEvent, jn0.h0> callback, wn0.a<j3.i> detectionArea, wn0.a<E5> screenSize, E3 motionDataManager, TimestampProvider timestampProvider, LocationProvider locationProvider, U2 isSteadyProvider, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(cameraEngine, "cameraEngine");
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        p013kotlin.jvm.internal.s.k(detectionArea, "detectionArea");
        p013kotlin.jvm.internal.s.k(screenSize, "screenSize");
        p013kotlin.jvm.internal.s.k(motionDataManager, "motionDataManager");
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(locationProvider, "locationProvider");
        p013kotlin.jvm.internal.s.k(isSteadyProvider, "isSteadyProvider");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f38036a = coroutineScope;
        this.f38037b = cameraEngine;
        this.f38038c = config;
        this.f38039d = callback;
        this.f38040e = detectionArea;
        this.f38041f = screenSize;
        this.f38042g = motionDataManager;
        this.f38043h = timestampProvider;
        this.f38044i = locationProvider;
        this.f38045j = isSteadyProvider;
        this.f38046k = p020r2.s3.d(null, null, 2, null);
        this.f38047l = new C4246n2(config);
        this.f38048m = C4149a4.f38137a.getRecordingPlan(config.getType(), config.getIncludeAngledSteps(), Long.valueOf(config.getVideoDuration().getDuration()));
        this.f38049n = new C4151a6(cameraEngine, config.getRecordingType(), this, config.getVideoDuration().getDuration(), new wn0.a() { // from class: com.fourthline.vision.internal.u8
            @Override // wn0.a
            public final Object invoke() {
                return X1.videoRecorderManager$lambda$1(this.f38979a);
            }
        });
        this.f38050o = AbstractC4187f2.documentSteps(config.getType(), config.getIncludeAngledSteps());
        this.f38051p = new ArrayList();
        this.f38052q = H5.a.d.f37750a;
        this.f38056u = -1;
    }

    private final boolean canAcceptMrzAccordingToPolicy(List<? extends ValidationError> list, MrzValidationPolicy mrzValidationPolicy) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ValidationError validationError = (ValidationError) obj;
            if (validationError != MrtdMrzInfoValidationError.INVALID_TOTAL_CHECKSUM && validationError != IdlMrzInfoValidationError.INVALID_TOTAL_CHECKSUM) {
                arrayList.add(obj);
            }
        }
        int i11 = a.$EnumSwitchMapping$0[mrzValidationPolicy.ordinal()];
        if (i11 == 1) {
            return list.isEmpty();
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (arrayList.size() > 3) {
                return false;
            }
        } else if (arrayList.size() > 1) {
            return false;
        }
        return true;
    }

    private final void cancelTimeouts() {
        Job job = this.f38053r;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.f38054s;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
    }

    private final void fail(DocumentScannerError documentScannerError) {
        DocumentScannerStep documentScannerStep;
        Objects.toString(documentScannerError);
        H5.a state = getState();
        if (!(state instanceof H5.a.d) && !(state instanceof H5.a.C0633a)) {
            if (!(state instanceof H5.a.b) && !(state instanceof H5.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        setState(H5.a.c.f37749a);
        cancelTimeouts();
        this.f38039d.invoke(new DocumentScannerEvent.OnFail(documentScannerError));
        C4246n2 c4246n2 = this.f38047l;
        try {
            documentScannerStep = (DocumentScannerStep) this.f38050o.get(this.f38056u);
        } catch (IndexOutOfBoundsException unused) {
            documentScannerStep = (DocumentScannerStep) this.f38050o.get(0);
        }
        c4246n2.onFail(documentScannerStep, documentScannerError, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00de  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:46:0x0129  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object finishScanner(Continuation<? super jn0.h0> continuation) {
        c cVar;
        X1 x11;
        VideoRecording videoRecording;
        X1 x12;
        Try r12;
        String simpleName;
        int length;
        String name;
        int length2;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f38063e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f38063e = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objStopRecording = cVar.f38061c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f38063e;
        MotionData motionData = null;
        if (i12 == 0) {
            jn0.t.b(objStopRecording);
            this.f38045j.stop();
            setState(H5.a.b.f37748a);
            cancelTimeouts();
            C4151a6 c4151a6 = this.f38049n;
            cVar.f38059a = this;
            cVar.f38063e = 1;
            objStopRecording = c4151a6.stopRecording(cVar);
            if (objStopRecording != coroutine_suspended) {
                x11 = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            x11 = (X1) cVar.f38059a;
            jn0.t.b(objStopRecording);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            VideoRecording videoRecording2 = (VideoRecording) cVar.f38060b;
            x12 = (X1) cVar.f38059a;
            jn0.t.b(objStopRecording);
            videoRecording = videoRecording2;
        }
        r12 = (Try) objStopRecording;
        if (r12 instanceof Try.Failure) {
            Throwable exception = ((Try.Failure) r12).getException();
            if (x12.getClass().isAnonymousClass()) {
                name = X1.class.getName();
                length2 = name.length();
                p013kotlin.jvm.internal.s.h(name);
                if (length2 > 23) {
                    p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
                }
            } else {
                simpleName = X1.class.getSimpleName();
                length = simpleName.length();
                p013kotlin.jvm.internal.s.h(simpleName);
                if (length > 23) {
                    p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
                }
            }
            Objects.toString(exception);
        } else {
            if (r12 instanceof Try.Success) {
                throw new NoWhenBranchMatchedException();
            }
            motionData = (MotionData) ((Try.Success) r12).getValue();
        }
        DocumentScannerResult documentScannerResult = new DocumentScannerResult(videoRecording, x12.f38055t, x12.f38038c.getType(), x12.f38051p, new DocumentScannerMetadata(x12.f38043h.getCurrentTime(), x12.f38044i.getLocation(), motionData));
        x12.f38039d.invoke(new DocumentScannerEvent.OnSuccess(documentScannerResult));
        x12.f38047l.onSuccess(documentScannerResult);
        return jn0.h0.f84049a;
        Uri uri = (Uri) objStopRecording;
        if (uri != null) {
            URI uriCreate = URI.create(uri.toString());
            p013kotlin.jvm.internal.s.j(uriCreate, "create(...)");
            videoRecording = new VideoRecording(uriCreate, x11.f38038c.getVideoDuration(), null, 4, null);
        } else {
            videoRecording = null;
        }
        E3 e11 = x11.f38042g;
        cVar.f38059a = x11;
        cVar.f38060b = videoRecording;
        cVar.f38063e = 2;
        objStopRecording = e11.stop(cVar);
        if (objStopRecording != coroutine_suspended) {
            x12 = x11;
            r12 = (Try) objStopRecording;
            if (r12 instanceof Try.Failure) {
                Throwable exception2 = ((Try.Failure) r12).getException();
                if (x12.getClass().isAnonymousClass()) {
                    name = X1.class.getName();
                    length2 = name.length();
                    p013kotlin.jvm.internal.s.h(name);
                    if (length2 > 23) {
                        p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
                    }
                } else {
                    simpleName = X1.class.getSimpleName();
                    length = simpleName.length();
                    p013kotlin.jvm.internal.s.h(simpleName);
                    if (length > 23) {
                        p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
                    }
                }
                Objects.toString(exception2);
            } else {
                if (r12 instanceof Try.Success) {
                    throw new NoWhenBranchMatchedException();
                }
                motionData = (MotionData) ((Try.Success) r12).getValue();
            }
            DocumentScannerResult documentScannerResult2 = new DocumentScannerResult(videoRecording, x12.f38055t, x12.f38038c.getType(), x12.f38051p, new DocumentScannerMetadata(x12.f38043h.getCurrentTime(), x12.f38044i.getLocation(), motionData));
            x12.f38039d.invoke(new DocumentScannerEvent.OnSuccess(documentScannerResult2));
            x12.f38047l.onSuccess(documentScannerResult2);
            return jn0.h0.f84049a;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onTextDetected$lambda$5(Rect rect, X1 x11, dy.a.e textBlock) {
        C4165c4 rectangle;
        p013kotlin.jvm.internal.s.k(textBlock, "textBlock");
        Rect rectA = textBlock.a();
        C4165c4 c4165c4Invoke = (rectA == null || (rectangle = AbstractC4173d4.toRectangle(rectA)) == null) ? null : x11.f38037b.getCoordinates().getBoundingBoxToScreen().invoke(rectangle);
        boolean z11 = c4165c4Invoke != null && rect.contains(AbstractC4173d4.toRect(c4165c4Invoke));
        textBlock.e();
        return z11;
    }

    private final void resetScannerTimeout() {
        Job job = this.f38053r;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f38053r = BuildersKt__Builders_commonKt.launch$default(this, null, null, new e(null), 3, null);
    }

    private final void resetStepTimeout() {
        Job job = this.f38054s;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f38054s = BuildersKt__Builders_commonKt.launch$default(this, null, null, new f(null), 3, null);
    }

    private final void setActiveStep(int i11) {
        this.f38056u = i11;
        if (i11 >= this.f38050o.size()) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(null), 3, null);
            return;
        }
        resetStepTimeout();
        DocumentScannerStep documentScannerStep = (DocumentScannerStep) this.f38050o.get(i11);
        this.f38039d.invoke(new DocumentScannerEvent.OnStepUpdate(documentScannerStep));
        this.f38047l.onStepUpdate(documentScannerStep);
        setState(H5.a.C0633a.f37747a);
        if (this.f38048m.requiresRecordingOnStartStep(i11)) {
            startRecording();
        }
    }

    private void setRecognizedBounds(C4165c4 c4165c4) {
        this.f38046k.setValue(c4165c4);
    }

    private final void startRecording() {
        this.f38049n.startRecording();
        this.f38042g.start();
    }

    private final void stepFail(DocumentScannerStepError documentScannerStepError) {
        setState(H5.a.d.f37750a);
        this.f38039d.invoke(new DocumentScannerEvent.OnStepFail(documentScannerStepError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void timeout() {
        fail(DocumentScannerError.TIMEOUT);
    }

    private final MrzInfo tryCreateMrzCandidate(String str) {
        MrzInfo mrzInfoCreate = MrzInfo.INSTANCE.create(str);
        if (mrzInfoCreate == null) {
            return null;
        }
        mrzInfoCreate.getRawMrz();
        Objects.toString(mrzInfoCreate.getValidationErrors());
        if (canAcceptMrzAccordingToPolicy(mrzInfoCreate.getValidationErrors(), this.f38038c.getMrzValidationPolicy())) {
            return mrzInfoCreate;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 videoRecorderManager$lambda$1(X1 x11) {
        x11.fail(DocumentScannerError.RECORDING_FAILED);
        return jn0.h0.f84049a;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f38036a.getCoroutineContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fourthline.vision.internal.H5
    public C4165c4 getRecognizedBounds() {
        return (C4165c4) this.f38046k.getValue();
    }

    @Override // com.fourthline.vision.internal.H5
    public H5.a getState() {
        return this.f38052q;
    }

    @Override // com.fourthline.vision.internal.H5
    public void moveToNextStep() {
        H5.a state = getState();
        if (state instanceof H5.a.C0633a) {
            stepFail(DocumentScannerStepError.MOVE_TO_NEXT_STEP_NOT_ALLOWED);
            return;
        }
        if (state instanceof H5.a.d) {
            this.f38047l.onMoveToNextStep();
            setActiveStep(this.f38056u + 1);
        } else if (!(state instanceof H5.a.b) && !(state instanceof H5.a.c)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.fourthline.vision.internal.M0
    public void onBarcodeDetected(List<? extends tx.a> barcodes) {
        Pair pairA;
        MrzInfo mrzInfoTryCreateMrzCandidate;
        p013kotlin.jvm.internal.s.k(barcodes, "barcodes");
        Objects.toString(barcodes);
        Iterator<T> it = barcodes.iterator();
        do {
            pairA = null;
            if (!it.hasNext()) {
                break;
            }
            tx.a aVar = (tx.a) it.next();
            String strD = aVar.d();
            if (strD != null && (mrzInfoTryCreateMrzCandidate = tryCreateMrzCandidate(strD)) != null) {
                wn0.l<C4165c4, C4165c4> boundingBoxToScreen = this.f38037b.getCoordinates().getBoundingBoxToScreen();
                Rect rectA = aVar.a();
                p013kotlin.jvm.internal.s.h(rectA);
                pairA = jn0.x.a(mrzInfoTryCreateMrzCandidate, boundingBoxToScreen.invoke(AbstractC4173d4.toRectangle(rectA)));
            }
        } while (pairA == null);
        if (pairA != null) {
            this.f38055t = (MrzInfo) pairA.e();
            setRecognizedBounds((C4165c4) pairA.f());
        }
    }

    @Override // com.fourthline.vision.internal.M0
    public void onTextDetected(dy.a text) {
        Pair pairA;
        p013kotlin.jvm.internal.s.k(text, "text");
        H5.a state = getState();
        if (!(state instanceof H5.a.C0633a)) {
            if (!(state instanceof H5.a.d) && !(state instanceof H5.a.b) && !(state instanceof H5.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        text.a();
        final Rect documentDetectionArea = new V0(new d()).getDocumentDetectionArea();
        I3 i11 = new I3(new C4330z3(), new K3());
        T0.c cVarBuildDetectionRoot = new B3(new wn0.l() { // from class: com.fourthline.vision.internal.v8
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(X1.onTextDetected$lambda$5(documentDetectionArea, this, (dy.a.e) obj));
            }
        }).buildDetectionRoot(text);
        C4165c4 c4165c4Invoke = this.f38037b.getCoordinates().getScreenToBoundingBox().invoke(AbstractC4173d4.toRectangle(documentDetectionArea));
        T0.c cVarCorrect = i11.correct(cVarBuildDetectionRoot, new Size(c4165c4Invoke.width(), c4165c4Invoke.height()));
        Iterator<T> it = cVarCorrect.getTexts().iterator();
        while (it.hasNext()) {
            ((T0.d) it.next()).getText();
        }
        if (!this.f38045j.isSteady()) {
            this.f38039d.invoke(new DocumentScannerEvent.OnWarnings(p013kotlin.collections.v.e(DocumentScannerStepWarning.DEVICE_NOT_STEADY)));
            return;
        }
        Iterator<T> it2 = cVarCorrect.getTexts().iterator();
        do {
            pairA = null;
            if (!it2.hasNext()) {
                break;
            }
            T0.d dVar = (T0.d) it2.next();
            MrzInfo mrzInfoTryCreateMrzCandidate = tryCreateMrzCandidate(dVar.getText());
            if (mrzInfoTryCreateMrzCandidate != null) {
                pairA = jn0.x.a(mrzInfoTryCreateMrzCandidate, this.f38037b.getCoordinates().getBoundingBoxToScreen().invoke(dVar.getBox()));
            }
        } while (pairA == null);
        if (pairA != null) {
            this.f38055t = (MrzInfo) pairA.e();
            setRecognizedBounds((C4165c4) pairA.f());
        }
    }

    @Override // com.fourthline.vision.internal.H5
    public void resetCurrentStep() {
        H5.a state = getState();
        if ((state instanceof H5.a.C0633a) || (state instanceof H5.a.b) || (state instanceof H5.a.c)) {
            stepFail(DocumentScannerStepError.RESET_CURRENT_STEP_NOT_ALLOWED);
        } else {
            if (!(state instanceof H5.a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f38047l.onResetCurrentStep((DocumentScannerStep) this.f38050o.get(this.f38056u));
            setActiveStep(this.f38056u);
        }
    }

    @Override // com.fourthline.vision.internal.H5
    public void restart() {
        this.f38047l.onReset();
        setState(H5.a.d.f37750a);
        this.f38051p.clear();
        start();
    }

    public void setState(H5.a aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<set-?>");
        this.f38052q = aVar;
    }

    @Override // com.fourthline.vision.internal.H5
    public void start() {
        H5.a state = getState();
        if (!(state instanceof H5.a.d)) {
            if (!(state instanceof H5.a.C0633a) && !(state instanceof H5.a.b) && !(state instanceof H5.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        this.f38047l.onStart();
        this.f38045j.start();
        this.f38039d.invoke(new DocumentScannerEvent.OnStepsCountUpdate(this.f38050o.size()));
        resetScannerTimeout();
        setActiveStep(0);
    }

    @Override // com.fourthline.vision.internal.H5
    public void stop() {
        if (getState() instanceof H5.a.C0633a) {
            fail(DocumentScannerError.SCANNER_INTERRUPTED);
        }
    }

    @Override // com.fourthline.vision.internal.H5
    public void takeSnapshot() {
        if (this.f38048m.requiresRecordingOnTakePhoto(this.f38056u)) {
            startRecording();
        }
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new g(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void takeSnapshot(C4236m c4236m) {
        this.f38047l.onTakeSnapshot((DocumentScannerStep) this.f38050o.get(this.f38056u));
        H5.a state = getState();
        if (!(state instanceof H5.a.d) && !(state instanceof H5.a.b) && !(state instanceof H5.a.c)) {
            if (state instanceof H5.a.C0633a) {
                cancelTimeouts();
                setState(H5.a.d.f37750a);
                DocumentScannerStepResult documentScannerStepResult = new DocumentScannerStepResult(new ScannerImage(c4236m.getBitmap(), Y1.cropBitmap(c4236m.getBitmap(), AbstractC4292u0.translateScreenToTarget(AbstractC4173d4.toRectangle(k3.z3.a((j3.i) this.f38040e.invoke())), (E5) this.f38041f.invoke(), new E5(c4236m.getBitmap().getWidth(), c4236m.getBitmap().getHeight()), c4236m.getRotationDegrees(), true), c4236m.getRotationDegrees())), new DocumentScannerStepMetadata(this.f38043h.getCurrentTime(), this.f38044i.getLocation(), ((DocumentScannerStep) this.f38050o.get(this.f38056u)).getFileSide(), ((DocumentScannerStep) this.f38050o.get(this.f38056u)).isAngled()), p013kotlin.collections.d1.d());
                this.f38051p.add(documentScannerStepResult);
                this.f38039d.invoke(new DocumentScannerEvent.OnStepSuccess(documentScannerStepResult));
                this.f38047l.onStepSuccess((DocumentScannerStep) this.f38050o.get(this.f38056u), documentScannerStepResult);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
        stepFail(DocumentScannerStepError.TAKE_SNAPSHOT_NOT_ALLOWED);
    }
}
