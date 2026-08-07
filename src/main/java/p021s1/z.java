package p021s1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j3.g;
import j3.h;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.m0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import q1.n0;
import w4.y;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001N\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u0011*\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u0011*\u00020\u0011ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u0010*\u00020\u0011ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u00020\u0010*\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u0011*\u00020\u0011ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u001b\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0086@ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u001b\u0010#\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0086@ø\u0001\u0001¢\u0006\u0004\b#\u0010!J\r\u0010$\u001a\u00020\n¢\u0006\u0004\b$\u0010%J>\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010'\u001a\u00020&2\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0*\u0012\u0006\u0012\u0004\u0018\u00010\u00010(H\u0086@¢\u0006\u0004\b,\u0010-J?\u0010.\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\n¢\u0006\u0004\b0\u0010%J\u0016\u00101\u001a\u00020\u0010*\u00020\u001dH\u0002ø\u0001\u0001¢\u0006\u0004\b1\u0010\u0017J\u0016\u00102\u001a\u00020\u001d*\u00020\u001dH\u0002ø\u0001\u0001¢\u0006\u0004\b2\u0010\u0015J\u001e\u00104\u001a\u00020\u001d*\u00020\u001d2\u0006\u00103\u001a\u00020\u0010H\u0002ø\u0001\u0001¢\u0006\u0004\b4\u00105J&\u0010:\u001a\u00020\u0011*\u0002062\u0006\u00107\u001a\u00020\u00112\u0006\u00109\u001a\u000208H\u0002ø\u0001\u0001¢\u0006\u0004\b:\u0010;R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010J\u001a\u0002088\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010M\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR \u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010%\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006X"}, d2 = {"Ls1/z;", "", "Ls1/x;", "scrollableState", "Lq1/n0;", "overscrollEffect", "Ls1/m;", "flingBehavior", "Ls1/p;", "orientation", "", "reverseDirection", "Lu3/b;", "nestedScrollDispatcher", "<init>", "(Ls1/x;Lq1/n0;Ls1/m;Ls1/p;ZLu3/b;)V", "", "Lj3/g;", "B", "(F)J", "x", "(J)J", "A", "(J)F", "t", "(F)F", "u", "scroll", "r", "Lw4/y;", "initialVelocity", "Ljn0/h0;", "q", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "available", "n", "w", "()Z", "Lq1/h0;", "scrollPriority", "Lkotlin/Function2;", "Ls1/o;", "Lkotlin/coroutines/Continuation;", "block", "v", "(Lq1/h0;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "C", "(Ls1/x;Ls1/p;Lq1/n0;ZLs1/m;Lu3/b;)Z", "p", "z", "y", "newValue", "D", "(JF)J", "Ls1/u;", "delta", "Lu3/e;", "source", "s", "(Ls1/u;JI)J", "a", "Ls1/x;", "b", "Lq1/n0;", "c", "Ls1/m;", DateTokenConverter.CONVERTER_KEY, "Ls1/p;", "e", "Z", "f", "Lu3/b;", "g", "I", "latestScrollSource", "h", "Ls1/u;", "outerStateScope", "s1/z$c", IntegerTokenConverter.CONVERTER_KEY, "Ls1/z$c;", "nestedScrollScope", "Lkotlin/Function1;", "j", "Lwn0/l;", "performScrollForOverscroll", "o", "shouldDispatchOverscroll", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private x scrollableState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private n0 overscrollEffect;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private m flingBehavior;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private p orientation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean reverseDirection;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private u3.b nestedScrollDispatcher;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int latestScrollSource = u3.e.INSTANCE.c();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private u outerStateScope = androidx.compose.foundation.gestures.d.f4397b;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final c nestedScrollScope = new c();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final l<g, g> performScrollForOverscroll = new e();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", i = {0}, l = {769}, m = "doFlingAnimation-QWom1Mo", n = {"result"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f109646n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f109647o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f109649q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109647o = obj;
            this.f109649q |= Integer.MIN_VALUE;
            return z.this.n(0L, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls1/o;", "Ljn0/h0;", "<anonymous>", "(Ls1/o;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", i = {}, l = {782}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<o, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f109650n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f109651o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        long f109652p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f109653q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f109654r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ m0 f109656t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ long f109657u;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"s1/z$b$a", "Ls1/u;", "", "pixels", "a", "(F)F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements u {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ z f109658a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f109659b;

            a(z zVar, o oVar) {
                this.f109658a = zVar;
                this.f109659b = oVar;
            }

            @Override // p021s1.u
            public float a(float pixels) {
                z zVar = this.f109658a;
                return zVar.t(zVar.A(this.f109659b.a(zVar.u(zVar.B(pixels)), u3.e.INSTANCE.b())));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m0 m0Var, long j11, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f109656t = m0Var;
            this.f109657u = j11;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o oVar, Continuation<? super h0> continuation) {
            return ((b) create(oVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = z.this.new b(this.f109656t, this.f109657u, continuation);
            bVar.f109654r = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            z zVar;
            m0 m0Var;
            z zVar2;
            long j11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f109653q;
            if (i11 == 0) {
                t.b(obj);
                a aVar = new a(z.this, (o) this.f109654r);
                zVar = z.this;
                m0 m0Var2 = this.f109656t;
                long j12 = this.f109657u;
                m mVar = zVar.flingBehavior;
                long j13 = m0Var2.f86528a;
                float fT = zVar.t(zVar.z(j12));
                this.f109654r = zVar;
                this.f109650n = zVar;
                this.f109651o = m0Var2;
                this.f109652p = j13;
                this.f109653q = 1;
                Object objA = mVar.a(aVar, fT, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                m0Var = m0Var2;
                obj = objA;
                zVar2 = zVar;
                j11 = j13;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = this.f109652p;
                m0Var = (m0) this.f109651o;
                zVar = (z) this.f109650n;
                zVar2 = (z) this.f109654r;
                t.b(obj);
            }
            m0Var.f86528a = zVar.D(j11, zVar2.t(((Number) obj).floatValue()));
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"s1/z$c", "Ls1/o;", "Lj3/g;", "offset", "Lu3/e;", "source", "b", "(JI)J", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements o {
        c() {
        }

        @Override // p021s1.o
        public long a(long offset, int source) {
            z.this.latestScrollSource = source;
            n0 n0Var = z.this.overscrollEffect;
            if (n0Var != null && z.this.o()) {
                return n0Var.a(offset, z.this.latestScrollSource, z.this.performScrollForOverscroll);
            }
            return z.this.s(z.this.outerStateScope, offset, source);
        }

        @Override // p021s1.o
        public long b(long offset, int source) {
            return z.this.s(z.this.outerStateScope, offset, source);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw4/y;", "velocity", "<anonymous>", "(Lw4/y;)Lw4/y;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", i = {0, 1, 1, 2, 2}, l = {745, 748, 751}, m = "invokeSuspend", n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
    static final class d extends SuspendLambda implements p<y, Continuation<? super y>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f109661n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f109662o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ long f109663p;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        public final Object a(long j11, Continuation<? super y> continuation) {
            return ((d) create(y.b(j11), continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = z.this.new d(continuation);
            dVar.f109663p = ((y) obj).getPackedValue();
            return dVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(y yVar, Continuation<? super y> continuation) {
            return a(yVar.getPackedValue(), continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        
            if (r0 == r6) goto L22;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r6 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r13.f109662o
                r1 = 3
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L35
                if (r0 == r3) goto L2e
                if (r0 == r2) goto L25
                if (r0 != r1) goto L1d
                long r0 = r13.f109661n
                long r2 = r13.f109663p
                jn0.t.b(r14)
                r7 = r2
                r3 = r0
                r0 = r14
                goto L88
            L1d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L25:
                long r2 = r13.f109661n
                long r7 = r13.f109663p
                jn0.t.b(r14)
                r0 = r14
                goto L68
            L2e:
                long r3 = r13.f109663p
                jn0.t.b(r14)
                r0 = r14
                goto L4c
            L35:
                jn0.t.b(r14)
                long r7 = r13.f109663p
                s1.z r0 = p021s1.z.this
                u3.b r0 = p021s1.z.c(r0)
                r13.f109663p = r7
                r13.f109662o = r3
                java.lang.Object r0 = r0.c(r7, r13)
                if (r0 != r6) goto L4b
                goto L87
            L4b:
                r3 = r7
            L4c:
                w4.y r0 = (w4.y) r0
                long r7 = r0.getPackedValue()
                long r7 = w4.y.k(r3, r7)
                s1.z r0 = p021s1.z.this
                r13.f109663p = r3
                r13.f109661n = r7
                r13.f109662o = r2
                java.lang.Object r0 = r0.n(r7, r13)
                if (r0 != r6) goto L65
                goto L87
            L65:
                r11 = r7
                r7 = r3
                r2 = r11
            L68:
                w4.y r0 = (w4.y) r0
                long r9 = r0.getPackedValue()
                s1.z r0 = p021s1.z.this
                u3.b r0 = p021s1.z.c(r0)
                long r2 = w4.y.k(r2, r9)
                r13.f109663p = r7
                r13.f109661n = r9
                r13.f109662o = r1
                r5 = r13
                r1 = r2
                r3 = r9
                java.lang.Object r0 = r0.a(r1, r3, r5)
                if (r0 != r6) goto L88
            L87:
                return r6
            L88:
                w4.y r0 = (w4.y) r0
                long r0 = r0.getPackedValue()
                long r0 = w4.y.k(r3, r0)
                long r0 = w4.y.k(r7, r0)
                w4.y r0 = w4.y.b(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: s1.z.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj3/g;", "delta", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements l<g, g> {
        e() {
            super(1);
        }

        public final long a(long j11) {
            u uVar = z.this.outerStateScope;
            z zVar = z.this;
            return zVar.s(uVar, j11, zVar.latestScrollSource);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ g invoke(g gVar) {
            return g.d(a(gVar.getPackedValue()));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls1/u;", "Ljn0/h0;", "<anonymous>", "(Ls1/u;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", i = {}, l = {804}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<u, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f109666n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f109667o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p<o, Continuation<? super h0>, Object> f109669q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(p<? super o, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f109669q = pVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(u uVar, Continuation<? super h0> continuation) {
            return ((f) create(uVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = z.this.new f(this.f109669q, continuation);
            fVar.f109667o = obj;
            return fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f109666n;
            if (i11 == 0) {
                t.b(obj);
                z.this.outerStateScope = (u) this.f109667o;
                p<o, Continuation<? super h0>, Object> pVar = this.f109669q;
                c cVar = z.this.nestedScrollScope;
                this.f109666n = 1;
                if (pVar.invoke(cVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }
    }

    public z(x xVar, n0 n0Var, m mVar, p pVar, boolean z11, u3.b bVar) {
        this.scrollableState = xVar;
        this.overscrollEffect = n0Var;
        this.flingBehavior = mVar;
        this.orientation = pVar;
        this.reverseDirection = z11;
        this.nestedScrollDispatcher = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long D(long j11, float f11) {
        return this.orientation == p.Horizontal ? y.e(j11, f11, BitmapDescriptorFactory.HUE_RED, 2, null) : y.e(j11, BitmapDescriptorFactory.HUE_RED, f11, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o() {
        return this.scrollableState.c() || this.scrollableState.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long s(u uVar, long j11, int i11) {
        long jD = this.nestedScrollDispatcher.d(j11, i11);
        long jQ = g.q(j11, jD);
        long jU = u(B(uVar.a(A(u(x(jQ))))));
        return g.r(g.r(jD, jU), this.nestedScrollDispatcher.b(jU, g.q(jQ, jU), i11));
    }

    private final long y(long j11) {
        return this.orientation == p.Horizontal ? y.e(j11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1, null) : y.e(j11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float z(long j11) {
        return this.orientation == p.Horizontal ? y.h(j11) : y.i(j11);
    }

    public final float A(long j11) {
        return this.orientation == p.Horizontal ? g.m(j11) : g.n(j11);
    }

    public final long B(float f11) {
        if (f11 == BitmapDescriptorFactory.HUE_RED) {
            return g.INSTANCE.c();
        }
        return this.orientation == p.Horizontal ? h.a(f11, BitmapDescriptorFactory.HUE_RED) : h.a(BitmapDescriptorFactory.HUE_RED, f11);
    }

    public final boolean C(x scrollableState, p orientation, n0 overscrollEffect, boolean reverseDirection, m flingBehavior, u3.b nestedScrollDispatcher) {
        boolean z11;
        boolean z12 = true;
        if (s.f(this.scrollableState, scrollableState)) {
            z11 = false;
        } else {
            this.scrollableState = scrollableState;
            z11 = true;
        }
        this.overscrollEffect = overscrollEffect;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z11 = true;
        }
        if (this.reverseDirection != reverseDirection) {
            this.reverseDirection = reverseDirection;
        } else {
            z12 = z11;
        }
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        return z12;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(long j11, Continuation<? super y> continuation) {
        a aVar;
        m0 m0Var;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f109649q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f109649q = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f109647o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f109649q;
        if (i12 == 0) {
            t.b(obj);
            m0 m0Var2 = new m0();
            m0Var2.f86528a = j11;
            q1.h0 h0Var = q1.h0.Default;
            p<? super o, ? super Continuation<? super h0>, ? extends Object> bVar = new b(m0Var2, j11, null);
            aVar.f109646n = m0Var2;
            aVar.f109649q = 1;
            if (v(h0Var, bVar, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            m0Var = m0Var2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m0Var = (m0) aVar.f109646n;
            t.b(obj);
        }
        return y.b(m0Var.f86528a);
    }

    public final boolean p() {
        return this.orientation == p.Vertical;
    }

    public final Object q(long j11, Continuation<? super h0> continuation) {
        long jY = y(j11);
        d dVar = new d(null);
        n0 n0Var = this.overscrollEffect;
        if (n0Var == null || !o()) {
            Object objInvoke = dVar.invoke(y.b(jY), continuation);
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : h0.f84049a;
        }
        Object objB = n0Var.b(jY, dVar, continuation);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : h0.f84049a;
    }

    public final long r(long scroll) {
        return this.scrollableState.a() ? g.INSTANCE.c() : B(t(this.scrollableState.d(t(A(scroll)))));
    }

    public final float t(float f11) {
        return this.reverseDirection ? f11 * (-1) : f11;
    }

    public final long u(long j11) {
        return this.reverseDirection ? g.s(j11, -1.0f) : j11;
    }

    public final Object v(q1.h0 h0Var, p<? super o, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super h0> continuation) {
        Object objB = this.scrollableState.b(h0Var, new f(pVar, null), continuation);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : h0.f84049a;
    }

    public final boolean w() {
        if (this.scrollableState.a()) {
            return true;
        }
        n0 n0Var = this.overscrollEffect;
        return n0Var != null ? n0Var.c() : false;
    }

    public final long x(long j11) {
        return this.orientation == p.Horizontal ? g.g(j11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1, null) : g.g(j11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, null);
    }
}
