package com.fourthline.vision.internal;

import android.graphics.Rect;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.List;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.SafeContinuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4215j implements InterfaceC4287t2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f38430c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f38431d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zx.d f38432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S3 f38433b;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.j$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.j$b */
    static final class b implements wn0.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f38434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f38435b;

        b(Continuation<? super T> continuation, wn0.l<? super List<? extends zx.a>, ? extends T> lVar) {
            this.f38434a = continuation;
            this.f38435b = lVar;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<zx.a>) obj);
            return jn0.h0.f84049a;
        }

        public final void invoke(List<zx.a> list) {
            Continuation continuation = this.f38434a;
            jn0.s.Companion companion = jn0.s.INSTANCE;
            wn0.l lVar = this.f38435b;
            p013kotlin.jvm.internal.s.h(list);
            continuation.resumeWith(jn0.s.b(lVar.invoke(list)));
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.j$c */
    static final class c implements OnFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f38436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC4215j f38437b;

        c(Continuation<? super T> continuation, AbstractC4215j abstractC4215j) {
            this.f38436a = continuation;
            this.f38437b = abstractC4215j;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception e11) {
            Throwable th2;
            p013kotlin.jvm.internal.s.k(e11, "e");
            Continuation continuation = this.f38436a;
            jn0.s.Companion companion = jn0.s.INSTANCE;
            if (C3.isMissingModelsException(e11)) {
                th2 = AbstractC4255o4.b.f38689b;
            } else if (!this.f38437b.f38433b.get().booleanValue()) {
                th2 = e11;
                th2 = AbstractC4255o4.c.f38690b;
            }
            th2 = e11;
            continuation.resumeWith(jn0.s.b(jn0.t.a(th2)));
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.j$d */
    static final class d implements OnSuccessListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ wn0.l f38438a;

        d(wn0.l function) {
            p013kotlin.jvm.internal.s.k(function, "function");
            this.f38438a = function;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f38438a.invoke(obj);
        }
    }

    public AbstractC4215j(zx.d detector, S3 playServicesAvailable) {
        p013kotlin.jvm.internal.s.k(detector, "detector");
        p013kotlin.jvm.internal.s.k(playServicesAvailable, "playServicesAvailable");
        this.f38432a = detector;
        this.f38433b = playServicesAvailable;
    }

    private final int decreaseBy(int i11, float f11) {
        return (int) (i11 * (1 - f11));
    }

    protected final boolean areEyesOpen(zx.a aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        Float fG = aVar.g();
        Float f11 = aVar.f();
        return fG != null && f11 != null && fG.floatValue() >= 0.6f && f11.floatValue() >= 0.6f;
    }

    protected final <T extends List<? extends AbstractC4273r2>> Object awaitDetection(D3 d11, wn0.l<? super List<? extends zx.a>, ? extends T> lVar, Continuation<? super T> continuation) throws Throwable {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        this.f38432a.process(d11.getImage()).addOnSuccessListener(new d(new b(safeContinuation, lVar))).addOnFailureListener(new c(safeContinuation, this));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f38432a.close();
    }

    protected final C4165c4 toFaceBox(Rect rect) {
        p013kotlin.jvm.internal.s.k(rect, "<this>");
        return C4165c4.copy$default(AbstractC4173d4.toRectangle(rect), decreaseBy(rect.left, -0.1f), decreaseBy(rect.top, 0.1f), decreaseBy(rect.right, 0.1f), 0, 8, null);
    }
}
