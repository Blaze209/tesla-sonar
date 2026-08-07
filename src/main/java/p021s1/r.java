package p021s1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import w4.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u0006*\u00020\nH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u0006*\u00020\rH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u0006*\u00020\u0007H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\r*\u00020\u0006H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\r*\u00020\nH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\fJ\u0017\u0010\u0018\u001a\u00020\u0012*\u00020\u0013H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\n*\u00020\u0006H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\n*\u00020\rH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001cH\u0086@¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b#\u0010!R\u0016\u0010&\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010%R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\r8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\r8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b.\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Ls1/r;", "Ls1/q;", "Lw4/d;", "density", "<init>", "(Lw4/d;)V", "Lw4/h;", "", "i1", "(F)I", "Lw4/v;", "p", "(J)F", "", "x", "(F)F", "w", "(I)F", "Lj3/m;", "Lw4/k;", "o", "(J)J", "O1", "m1", "C", "E", "(F)J", "s", "Ljn0/h0;", "c", "()V", "n", "q", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "l1", "b", "Z", "isReleased", "isCanceled", "Lkotlinx/coroutines/sync/Mutex;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/sync/Mutex;", "mutex", "getDensity", "()F", "M1", "fontScale", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r implements q, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d f109601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isReleased;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isCanceled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Mutex mutex = MutexKt.Mutex(false);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {0}, l = {357}, m = "reset", n = {"this"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f109605n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f109606o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f109608q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109606o = obj;
            this.f109608q |= Integer.MIN_VALUE;
            return r.this.q(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {0}, l = {370}, m = "tryAwaitRelease", n = {"this"}, s = {"L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f109609n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f109610o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f109612q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109610o = obj;
            this.f109612q |= Integer.MIN_VALUE;
            return r.this.l1(this);
        }
    }

    public r(d dVar) {
        this.f109601a = dVar;
    }

    @Override // w4.d
    public long C(long j11) {
        return this.f109601a.C(j11);
    }

    @Override // w4.l
    public long E(float f11) {
        return this.f109601a.E(f11);
    }

    @Override // w4.l
    /* JADX INFO: renamed from: M1 */
    public float getFontScale() {
        return this.f109601a.getFontScale();
    }

    @Override // w4.d
    public float O1(float f11) {
        return this.f109601a.O1(f11);
    }

    public final void c() {
        this.isCanceled = true;
        Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
    }

    @Override // w4.d
    public float getDensity() {
        return this.f109601a.getDensity();
    }

    @Override // w4.d
    public int i1(float f11) {
        return this.f109601a.i1(f11);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p021s1.q
    public Object l1(Continuation<? super Boolean> continuation) {
        b bVar;
        r rVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f109612q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f109612q = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f109610o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f109612q;
        if (i12 == 0) {
            t.b(obj);
            if (this.isReleased || this.isCanceled) {
                rVar = this;
            } else {
                Mutex mutex = this.mutex;
                bVar.f109609n = this;
                bVar.f109612q = 1;
                if (Mutex.DefaultImpls.lock$default(mutex, null, bVar, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                rVar = this;
            }
            return Boxing.boxBoolean(rVar.isReleased);
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rVar = (r) bVar.f109609n;
        t.b(obj);
        Mutex.DefaultImpls.unlock$default(rVar.mutex, null, 1, null);
        return Boxing.boxBoolean(rVar.isReleased);
    }

    @Override // w4.d
    public float m1(long j11) {
        return this.f109601a.m1(j11);
    }

    public final void n() {
        this.isReleased = true;
        Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
    }

    @Override // w4.d
    public long o(long j11) {
        return this.f109601a.o(j11);
    }

    @Override // w4.l
    public float p(long j11) {
        return this.f109601a.p(j11);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(Continuation<? super h0> continuation) {
        a aVar;
        r rVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f109608q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f109608q = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f109606o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f109608q;
        if (i12 == 0) {
            t.b(obj);
            Mutex mutex = this.mutex;
            aVar.f109605n = this;
            aVar.f109608q = 1;
            if (Mutex.DefaultImpls.lock$default(mutex, null, aVar, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            rVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = (r) aVar.f109605n;
            t.b(obj);
        }
        rVar.isReleased = false;
        rVar.isCanceled = false;
        return h0.f84049a;
    }

    @Override // w4.d
    public long s(float f11) {
        return this.f109601a.s(f11);
    }

    @Override // w4.d
    public float w(int i11) {
        return this.f109601a.w(i11);
    }

    @Override // w4.d
    public float x(float f11) {
        return this.f109601a.x(f11);
    }
}
