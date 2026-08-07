package p024x1;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.h0;
import jn0.s;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.SafeContinuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import z3.p0;
import z3.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lx1/b;", "Lz3/p0;", "<init>", "()V", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lz3/v;", "coordinates", "P", "(Lz3/v;)V", "", "b", "Z", "wasPositioned", "Lkotlin/coroutines/Continuation;", "c", "Lkotlin/coroutines/Continuation;", "continuation", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean wasPositioned;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Continuation<? super h0> continuation;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", i = {0, 0}, l = {35}, m = "waitForFirstLayout", n = {"this", "oldContinuation"}, s = {"L$0", "L$1"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f122528n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f122529o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f122530p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f122532r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f122530p = obj;
            this.f122532r |= Integer.MIN_VALUE;
            return b.this.i(this);
        }
    }

    @Override // z3.p0
    public void P(v coordinates) {
        if (this.wasPositioned) {
            return;
        }
        this.wasPositioned = true;
        Continuation<? super h0> continuation = this.continuation;
        if (continuation != null) {
            s.Companion companion = s.INSTANCE;
            continuation.resumeWith(s.b(h0.f84049a));
        }
        this.continuation = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(Continuation<? super h0> continuation) {
        a aVar;
        Continuation<? super h0> continuation2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f122532r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f122532r = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f122530p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f122532r;
        if (i12 == 0) {
            t.b(obj);
            if (!this.wasPositioned) {
                Continuation<? super h0> continuation3 = this.continuation;
                aVar.f122528n = this;
                aVar.f122529o = continuation3;
                aVar.f122532r = 1;
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(aVar));
                this.continuation = safeContinuation;
                Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(aVar);
                }
                if (orThrow == coroutine_suspended) {
                    return coroutine_suspended;
                }
                continuation2 = continuation3;
            }
            return h0.f84049a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        continuation2 = (Continuation) aVar.f122529o;
        t.b(obj);
        if (continuation2 != null) {
            s.Companion companion = s.INSTANCE;
            continuation2.resumeWith(s.b(h0.f84049a));
        }
        return h0.f84049a;
    }
}
