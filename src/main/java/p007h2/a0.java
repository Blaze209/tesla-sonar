package p007h2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j3.g;
import j3.h;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.u;
import p019p1.e1;
import p019p1.n;
import p019p1.p1;
import p019p1.r1;
import p020r2.Function0;
import p020r2.n3;
import p020r2.o;
import p020r2.y3;
import wn0.l;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u001a\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\" \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\"²\u0006\f\u0010 \u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/d;", "Lkotlin/Function0;", "Lj3/g;", "magnifierCenter", "Lkotlin/Function1;", "platformMagnifier", DateTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/d;Lwn0/a;Lwn0/l;)Landroidx/compose/ui/d;", "targetCalculation", "Lr2/y3;", "f", "(Lwn0/a;Lr2/l;I)Lr2/y3;", "Lp1/n;", "a", "Lp1/n;", "UnspecifiedAnimationVector2D", "Lp1/p1;", "b", "Lp1/p1;", "getUnspecifiedSafeOffsetVectorConverter", "()Lp1/p1;", "UnspecifiedSafeOffsetVectorConverter", "c", "J", "getOffsetDisplacementThreshold", "()J", "OffsetDisplacementThreshold", "Lp1/e1;", "Lp1/e1;", "e", "()Lp1/e1;", "MagnifierSpringSpec", "animatedCenter", "targetValue", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n f70211a = new n(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p1<g, n> f70212b = r1.a(a.f70215c, b.f70216c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f70213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e1<g> f70214d;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3/g;", "it", "Lp1/n;", "a", "(J)Lp1/n;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<g, n> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f70215c = new a();

        a() {
            super(1);
        }

        public final n a(long j11) {
            return h.c(j11) ? new n(g.m(j11), g.n(j11)) : a0.f70211a;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ n invoke(g gVar) {
            return a(gVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1/n;", "it", "Lj3/g;", "a", "(Lp1/n;)J"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<n, g> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f70216c = new b();

        b() {
            super(1);
        }

        public final long a(n nVar) {
            return h.a(nVar.getV1(), nVar.getV2());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ g invoke(n nVar) {
            return g.d(a(nVar));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "b", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements q<androidx.compose.ui.d, p020r2.l, Integer, androidx.compose.ui.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<g> f70217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<wn0.a<g>, androidx.compose.ui.d> f70218d;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj3/g;", "b", "()J"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.a<g> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y3<g> f70219c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y3<g> y3Var) {
                super(0);
                this.f70219c = y3Var;
            }

            public final long b() {
                return c.c(this.f70219c);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ g invoke() {
                return g.d(b());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(wn0.a<g> aVar, l<? super wn0.a<g>, ? extends androidx.compose.ui.d> lVar) {
            super(3);
            this.f70217c = aVar;
            this.f70218d = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long c(y3<g> y3Var) {
            return y3Var.getValue().getPackedValue();
        }

        public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, p020r2.l lVar, int i11) {
            lVar.o(759876635);
            if (o.J()) {
                o.S(759876635, i11, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:65)");
            }
            y3 y3VarF = a0.f(this.f70217c, lVar, 0);
            l<wn0.a<g>, androidx.compose.ui.d> lVar2 = this.f70218d;
            boolean zN = lVar.n(y3VarF);
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new a(y3VarF);
                lVar.B(objI);
            }
            androidx.compose.ui.d dVarInvoke = lVar2.invoke((wn0.a) objI);
            if (o.J()) {
                o.R();
            }
            lVar.l();
            return dVarInvoke;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.d invoke(androidx.compose.ui.d dVar, p020r2.l lVar, Integer num) {
            return b(dVar, lVar, num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70220n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f70221o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ y3<g> f70222p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p019p1.a<g, n> f70223q;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj3/g;", "b", "()J"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.a<g> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y3<g> f70224c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y3<g> y3Var) {
                super(0);
                this.f70224c = y3Var;
            }

            public final long b() {
                return a0.g(this.f70224c);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ g invoke() {
                return g.d(b());
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3/g;", "targetValue", "Ljn0/h0;", "a", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class b<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p019p1.a<g, n> f70225a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CoroutineScope f70226b;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1", f = "SelectionMagnifier.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
            static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f70227n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ p019p1.a<g, n> f70228o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ long f70229p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(p019p1.a<g, n> aVar, long j11, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f70228o = aVar;
                    this.f70229p = j11;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f70228o, this.f70229p, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f70227n;
                    if (i11 == 0) {
                        t.b(obj);
                        p019p1.a<g, n> aVar = this.f70228o;
                        g gVarD = g.d(this.f70229p);
                        e1<g> e1VarE = a0.e();
                        this.f70227n = 1;
                        if (p019p1.a.f(aVar, gVarD, e1VarE, null, null, this, 12, null) == coroutine_suspended) {
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

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            b(p019p1.a<g, n> aVar, CoroutineScope coroutineScope) {
                this.f70225a = aVar;
                this.f70226b = coroutineScope;
            }

            public final Object a(long j11, Continuation<? super h0> continuation) {
                if (h.c(this.f70225a.m().getPackedValue()) && h.c(j11) && g.n(this.f70225a.m().getPackedValue()) != g.n(j11)) {
                    BuildersKt__Builders_commonKt.launch$default(this.f70226b, null, null, new a(this.f70225a, j11, null), 3, null);
                    return h0.f84049a;
                }
                Object objT = this.f70225a.t(g.d(j11), continuation);
                return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : h0.f84049a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((g) obj).getPackedValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(y3<g> y3Var, p019p1.a<g, n> aVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f70222p = y3Var;
            this.f70223q = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f70222p, this.f70223q, continuation);
            dVar.f70221o = obj;
            return dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f70220n;
            if (i11 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f70221o;
                Flow flowP = n3.p(new a(this.f70222p));
                b bVar = new b(this.f70223q, coroutineScope);
                this.f70220n = 1;
                if (flowP.collect(bVar, this) == coroutine_suspended) {
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

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    static {
        long jA = h.a(0.01f, 0.01f);
        f70213c = jA;
        f70214d = new e1<>(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, g.d(jA), 3, null);
    }

    public static final androidx.compose.ui.d d(androidx.compose.ui.d dVar, wn0.a<g> aVar, l<? super wn0.a<g>, ? extends androidx.compose.ui.d> lVar) {
        return androidx.compose.ui.c.c(dVar, null, new c(aVar, lVar), 1, null);
    }

    public static final e1<g> e() {
        return f70214d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y3<g> f(wn0.a<g> aVar, p020r2.l lVar, int i11) {
        if (o.J()) {
            o.S(-1589795249, i11, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)");
        }
        Object objI = lVar.I();
        p020r2.l.Companion companion = p020r2.l.INSTANCE;
        if (objI == companion.a()) {
            objI = n3.e(aVar);
            lVar.B(objI);
        }
        y3 y3Var = (y3) objI;
        Object objI2 = lVar.I();
        if (objI2 == companion.a()) {
            Object aVar2 = new p019p1.a(g.d(g(y3Var)), f70212b, g.d(f70213c), null, 8, null);
            lVar.B(aVar2);
            objI2 = aVar2;
        }
        p019p1.a aVar3 = (p019p1.a) objI2;
        h0 h0Var = h0.f84049a;
        boolean zK = lVar.K(aVar3);
        Object objI3 = lVar.I();
        if (zK || objI3 == companion.a()) {
            objI3 = new d(y3Var, aVar3, null);
            lVar.B(objI3);
        }
        Function0.g(h0Var, (p) objI3, lVar, 6);
        y3<g> y3VarG = aVar3.g();
        if (o.J()) {
            o.R();
        }
        return y3VarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(y3<g> y3Var) {
        return y3Var.getValue().getPackedValue();
    }
}
