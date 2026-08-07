package com.fourthline.vision.internal;

import android.graphics.Rect;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.SafeContinuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class W3 extends J3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sx.a f38028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S3 f38029b;

    static final class a implements wn0.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f38030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f38031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ W3 f38032c;

        a(Continuation<? super List<? extends T0>> continuation, wn0.l<? super T0.c, ? extends List<? extends T0>> lVar, W3 w11) {
            this.f38030a = continuation;
            this.f38031b = lVar;
            this.f38032c = w11;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<tx.a>) obj);
            return jn0.h0.f84049a;
        }

        public final void invoke(List<tx.a> list) {
            Continuation continuation = this.f38030a;
            jn0.s.Companion companion = jn0.s.INSTANCE;
            wn0.l lVar = this.f38031b;
            W3 w11 = this.f38032c;
            p013kotlin.jvm.internal.s.h(list);
            continuation.resumeWith(jn0.s.b(lVar.invoke(w11.textDetection(list))));
        }
    }

    static final class b implements OnFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f38033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ W3 f38034b;

        b(Continuation<? super List<? extends T0>> continuation, W3 w11) {
            this.f38033a = continuation;
            this.f38034b = w11;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception e11) {
            Throwable th2;
            p013kotlin.jvm.internal.s.k(e11, "e");
            Continuation continuation = this.f38033a;
            jn0.s.Companion companion = jn0.s.INSTANCE;
            if (C3.isMissingModelsException(e11)) {
                th2 = AbstractC4255o4.b.f38689b;
            } else if (!this.f38034b.f38029b.get().booleanValue()) {
                th2 = e11;
                th2 = AbstractC4255o4.c.f38690b;
            }
            th2 = e11;
            continuation.resumeWith(jn0.s.b(jn0.t.a(th2)));
        }
    }

    static final class c implements OnSuccessListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ wn0.l f38035a;

        c(wn0.l function) {
            p013kotlin.jvm.internal.s.k(function, "function");
            this.f38035a = function;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f38035a.invoke(obj);
        }
    }

    public W3(sx.a detector, S3 playServicesAvailable) {
        p013kotlin.jvm.internal.s.k(detector, "detector");
        p013kotlin.jvm.internal.s.k(playServicesAvailable, "playServicesAvailable");
        this.f38028a = detector;
        this.f38029b = playServicesAvailable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T0.c textDetection(List<? extends tx.a> list) {
        T0.d dVar;
        Rect rectA;
        ArrayList arrayList = new ArrayList();
        for (tx.a aVar : list) {
            String strD = aVar.d();
            if (strD == null || (rectA = aVar.a()) == null) {
                dVar = null;
            } else {
                C4165c4 rectangle = AbstractC4173d4.toRectangle(rectA);
                dVar = new T0.d(strD, rectangle, p013kotlin.collections.v.e(new T0.a(strD, rectangle, null, 4, null)));
            }
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return new T0.c(arrayList);
    }

    @Override // com.fourthline.vision.internal.J3
    protected Object awaitDetection(D3 d11, wn0.l<? super T0.c, ? extends List<? extends T0>> lVar, Continuation<? super List<? extends T0>> continuation) throws Throwable {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        this.f38028a.process(d11.getImage()).addOnSuccessListener(new c(new a(safeContinuation, lVar, this))).addOnFailureListener(new b(safeContinuation, this));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f38028a.close();
    }
}
