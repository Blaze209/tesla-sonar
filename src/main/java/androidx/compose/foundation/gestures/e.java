package androidx.compose.foundation.gestures;

import j3.g;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p021s1.z;
import w4.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u0012\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/gestures/e;", "Lu3/a;", "Ls1/z;", "scrollingLogic", "", "enabled", "<init>", "(Ls1/z;Z)V", "Lj3/g;", "consumed", "available", "Lu3/e;", "source", "n0", "(JJI)J", "Lw4/y;", "V", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ls1/z;", "getScrollingLogic", "()Ls1/z;", "b", "Z", "getEnabled", "()Z", "(Z)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class e implements u3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z scrollingLogic;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", i = {0}, l = {865}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f4415n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f4416o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f4418q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4416o = obj;
            this.f4418q |= Integer.MIN_VALUE;
            return e.this.V(0L, 0L, this);
        }
    }

    public e(z zVar, boolean z11) {
        this.scrollingLogic = zVar;
        this.enabled = z11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // u3.a
    public Object V(long j11, long j12, Continuation<? super y> continuation) {
        a aVar;
        long jA;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f4418q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f4418q = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objN = aVar.f4416o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f4418q;
        if (i12 == 0) {
            t.b(objN);
            if (this.enabled) {
                z zVar = this.scrollingLogic;
                aVar.f4415n = j12;
                aVar.f4418q = 1;
                objN = zVar.n(j12, aVar);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                jA = y.INSTANCE.a();
            }
            return y.b(jA);
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j12 = aVar.f4415n;
        t.b(objN);
        jA = y.k(j12, ((y) objN).getPackedValue());
        return y.b(jA);
    }

    public final void a(boolean z11) {
        this.enabled = z11;
    }

    @Override // u3.a
    public long n0(long consumed, long available, int source) {
        return this.enabled ? this.scrollingLogic.r(available) : g.INSTANCE.c();
    }
}
