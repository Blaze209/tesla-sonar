package com.fourthline.vision.internal;

import com.fourthline.vision.document.DocumentScannerStepWarning;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.List;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.SafeContinuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class P3 extends J3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dy.c f37875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U0 f37876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W0 f37877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final S3 f37878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f37879e;

    public enum a {
        FAIL,
        DISABLE;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f37883d = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return f37883d;
        }
    }

    static final class b implements wn0.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ D3 f37885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Continuation f37886c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l f37887d;

        b(D3 d11, Continuation<? super List<? extends T0>> continuation, wn0.l<? super T0.c, ? extends List<? extends T0>> lVar) {
            this.f37885b = d11;
            this.f37886c = continuation;
            this.f37887d = lVar;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((dy.a) obj);
            return jn0.h0.f84049a;
        }

        public final void invoke(dy.a aVar) {
            W0 w11 = P3.this.f37877c;
            U0 u11 = P3.this.f37876b;
            p013kotlin.jvm.internal.s.h(aVar);
            T0.c cVarCorrect = w11.correct(u11.buildDetectionRoot(aVar), Q3.getSize(this.f37885b.getImage()));
            Continuation continuation = this.f37886c;
            jn0.s.Companion companion = jn0.s.INSTANCE;
            continuation.resumeWith(jn0.s.b(this.f37887d.invoke(cVarCorrect)));
        }
    }

    static final class c implements OnFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f37888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ P3 f37889b;

        c(Continuation<? super List<? extends T0>> continuation, P3 p11) {
            this.f37888a = continuation;
            this.f37889b = p11;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception e11) {
            Throwable gVar;
            p013kotlin.jvm.internal.s.k(e11, "e");
            Continuation continuation = this.f37888a;
            jn0.s.Companion companion = jn0.s.INSTANCE;
            if (this.f37889b.f37879e == a.DISABLE) {
                gVar = AbstractC4255o4.d.f38691b;
            } else if (C3.isMissingModelsException(e11)) {
                gVar = new AbstractC4255o4.g(p013kotlin.collections.v.e(DocumentScannerStepWarning.RECOGNITION_MODELS_NOT_DOWNLOADED), null, 2, null);
            } else if (!this.f37889b.f37878d.get().booleanValue()) {
                gVar = e11;
                gVar = new AbstractC4255o4.g(p013kotlin.collections.v.e(DocumentScannerStepWarning.GOOGLE_PLAY_SERVICES_NOT_AVAILABLE), null, 2, null);
            }
            gVar = e11;
            continuation.resumeWith(jn0.s.b(jn0.t.a(gVar)));
        }
    }

    public /* synthetic */ P3(dy.c cVar, U0 u11, W0 w11, S3 s11, a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, u11, w11, s11, (i11 & 16) != 0 ? a.FAIL : aVar);
    }

    @Override // com.fourthline.vision.internal.J3
    protected Object awaitDetection(D3 d11, wn0.l<? super T0.c, ? extends List<? extends T0>> lVar, Continuation<? super List<? extends T0>> continuation) throws Throwable {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        this.f37875a.process(d11.getImage()).addOnSuccessListener(new Q3.a(new b(d11, safeContinuation, lVar))).addOnFailureListener(new c(safeContinuation, this));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f37875a.close();
    }

    public P3(dy.c detector, U0 detectionAdapter, W0 detectionCorrector, S3 playServicesAvailable, a failureStrategy) {
        p013kotlin.jvm.internal.s.k(detector, "detector");
        p013kotlin.jvm.internal.s.k(detectionAdapter, "detectionAdapter");
        p013kotlin.jvm.internal.s.k(detectionCorrector, "detectionCorrector");
        p013kotlin.jvm.internal.s.k(playServicesAvailable, "playServicesAvailable");
        p013kotlin.jvm.internal.s.k(failureStrategy, "failureStrategy");
        this.f37875a = detector;
        this.f37876b = detectionAdapter;
        this.f37877c = detectionCorrector;
        this.f37878d = playServicesAvailable;
        this.f37879e = failureStrategy;
    }
}
