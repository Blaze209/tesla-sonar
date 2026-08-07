package p020r2;

import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J*\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0013"}, d2 = {"Lr2/x1;", "Lr2/f1;", "frameClock", "<init>", "(Lr2/f1;)V", "Ljn0/h0;", "a", "()V", "b", "R", "Lkotlin/Function1;", "", "onFrame", "B", "(Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lr2/f1;", "Lr2/a1;", "Lr2/a1;", "latch", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x1 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f1 frameClock;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a1 latch = new a1();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", i = {0, 0}, l = {62, 63}, m = "withFrameNanos", n = {"this", "onFrame"}, s = {"L$0", "L$1"})
    static final class a<R> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f106870n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f106871o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f106872p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f106874r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f106872p = obj;
            this.f106874r |= Integer.MIN_VALUE;
            return x1.this.B(null, this);
        }
    }

    public x1(f1 f1Var) {
        this.frameClock = f1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p020r2.f1
    public <R> Object B(l<? super Long, ? extends R> lVar, Continuation<? super R> continuation) {
        a aVar;
        x1 x1Var;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f106874r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f106874r = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f106872p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f106874r;
        if (i12 == 0) {
            t.b(obj);
            a1 a1Var = this.latch;
            aVar.f106870n = this;
            aVar.f106871o = lVar;
            aVar.f106874r = 1;
            if (a1Var.c(aVar) != coroutine_suspended) {
                x1Var = this;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return obj;
        }
        lVar = (l) aVar.f106871o;
        x1Var = (x1) aVar.f106870n;
        t.b(obj);
        f1 f1Var = x1Var.frameClock;
        aVar.f106870n = null;
        aVar.f106871o = null;
        aVar.f106874r = 2;
        Object objB = f1Var.B(lVar, aVar);
        return objB == coroutine_suspended ? coroutine_suspended : objB;
    }

    public final void a() {
        this.latch.d();
    }

    public final void b() {
        this.latch.f();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
    public <R> R fold(R r11, p<? super R, ? super CoroutineContext.Element, ? extends R> pVar) {
        return (R) f1.a.a(this, r11, pVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) f1.a.b(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return f1.a.c(this, key);
    }

    @Override // p013kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return f1.a.d(this, coroutineContext);
    }
}
