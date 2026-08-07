package p50;

import android.annotation.SuppressLint;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p009i2.q1;
import p011ja.d0;
import p011ja.f0;
import p011ja.k;
import p011ja.r;
import p011ja.y;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.e2;
import p020r2.l;
import p020r2.n3;
import p020r2.o;
import p020r2.p1;
import p020r2.s3;
import p020r2.y3;
import v1.i;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes7.dex */
@d0.b("BottomSheetNavigator")
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0015\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR+\u0010'\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010,\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010)\u001a\u0004\b*\u0010+R&\u00102\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\t0-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R \u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f07038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u00105¨\u0006=²\u0006\u0012\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000f078\nX\u008a\u0084\u0002²\u0006\u000e\u0010<\u001a\u0004\u0018\u00010\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lp50/b;", "Lja/d0;", "Lp50/b$a;", "Li2/q1;", "sheetState", "<init>", "(Li2/q1;)V", "Lja/f0;", "state", "Ljn0/h0;", "f", "(Lja/f0;)V", "n", "()Lp50/b$a;", "", "Lja/k;", "entries", "Lja/y;", "navOptions", "Lja/d0$a;", "navigatorExtras", "e", "(Ljava/util/List;Lja/y;Lja/d0$a;)V", "popUpTo", "", "savedState", "j", "(Lja/k;Z)V", "c", "Li2/q1;", "r", "()Li2/q1;", "<set-?>", DateTokenConverter.CONVERTER_KEY, "Lr2/p1;", "o", "()Z", "t", "(Z)V", "attached", "Lp50/c;", "Lp50/c;", "getNavigatorSheetState$financial_connections_release", "()Lp50/c;", "navigatorSheetState", "Lkotlin/Function1;", "Lv1/i;", "Lwn0/q;", "q", "()Lwn0/q;", "sheetContent", "Lkotlinx/coroutines/flow/StateFlow;", "p", "()Lkotlinx/coroutines/flow/StateFlow;", "backStack", "", "s", "transitionsInProgress", "a", "transitionsInProgressEntries", "retainedEntry", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b extends d0<a> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f101110g = q1.f74975e;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q1 sheetState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p1 attached;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c navigatorSheetState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final q<i, l, Integer, h0> sheetContent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bR,\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lp50/b$a;", "Lja/r;", "Lja/d;", "Lp50/b;", "navigator", "Lkotlin/Function2;", "Lv1/i;", "Lja/k;", "Ljn0/h0;", "content", "<init>", "(Lp50/b;Lwn0/r;)V", "m", "Lwn0/r;", "A", "()Lwn0/r;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends r implements p011ja.d {

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final wn0.r<i, k, l, Integer, h0> content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(b navigator, wn0.r<? super i, ? super k, ? super l, ? super Integer, h0> content) {
            super(navigator);
            s.k(navigator, "navigator");
            s.k(content, "content");
            this.content = content;
        }

        public final wn0.r<i, k, l, Integer, h0> A() {
            return this.content;
        }
    }

    /* JADX INFO: renamed from: p50.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/i;", "Ljn0/h0;", "c", "(Lv1/i;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class C2143b extends u implements q<i, l, Integer, h0> {

        /* JADX INFO: renamed from: p50.b$b$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator$sheetContent$1$1", f = "BottomSheetNavigation.kt", i = {}, l = {184}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f101117n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ b f101118o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f101118o = bVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f101118o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f101117n;
                if (i11 == 0) {
                    t.b(obj);
                    q1 sheetState = this.f101118o.getSheetState();
                    this.f101117n = 1;
                    if (sheetState.l(this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: p50.b$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class C2144b extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f101119c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ y3<k> f101120d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2144b(b bVar, y3<k> y3Var) {
                super(0);
                this.f101119c = bVar;
                this.f101120d = y3Var;
            }

            public final void b() {
                f0 f0VarB = this.f101119c.b();
                k kVarF = C2143b.f(this.f101120d);
                s.h(kVarF);
                f0VarB.h(kVarF, false);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: p50.b$b$c */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/k;", "it", "Ljn0/h0;", "a", "(Lja/k;)V"}, k = 3, mv = {1, 9, 0})
        static final class c extends u implements wn0.l<k, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f101121c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ y3<Set<k>> f101122d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(b bVar, y3<? extends Set<k>> y3Var) {
                super(1);
                this.f101121c = bVar;
                this.f101122d = y3Var;
            }

            public final void a(k it) {
                s.k(it, "it");
                Set setE = C2143b.e(this.f101122d);
                f0 f0VarB = this.f101121c.b();
                Iterator it2 = setE.iterator();
                while (it2.hasNext()) {
                    f0VarB.e((k) it2.next());
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(k kVar) {
                a(kVar);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: p50.b$b$d */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/k;", "backStackEntry", "Ljn0/h0;", "a", "(Lja/k;)V"}, k = 3, mv = {1, 9, 0})
        static final class d extends u implements wn0.l<k, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f101123c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ y3<Set<k>> f101124d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            d(b bVar, y3<? extends Set<k>> y3Var) {
                super(1);
                this.f101123c = bVar;
                this.f101124d = y3Var;
            }

            public final void a(k backStackEntry) {
                s.k(backStackEntry, "backStackEntry");
                if (C2143b.e(this.f101124d).contains(backStackEntry)) {
                    this.f101123c.b().e(backStackEntry);
                } else {
                    this.f101123c.b().g(backStackEntry, false);
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(k kVar) {
                a(kVar);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: p50.b$b$e */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr2/e2;", "Lja/k;", "Ljn0/h0;", "<anonymous>", "(Lr2/e2;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator$sheetContent$1$retainedEntry$2", f = "BottomSheetNavigation.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends SuspendLambda implements p<e2<k>, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f101125n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f101126o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ b f101127p;

            /* JADX INFO: renamed from: p50.b$b$e$a */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/k;", "it", "Ljn0/h0;", "a", "(Lja/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
            static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ e2<k> f101128a;

                a(e2<k> e2Var) {
                    this.f101128a = e2Var;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(k kVar, Continuation<? super h0> continuation) {
                    this.f101128a.setValue(kVar);
                    return h0.f84049a;
                }
            }

            /* JADX INFO: renamed from: p50.b$b$e$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1", f = "BottomSheetNavigation.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
            public static final class C2145b extends SuspendLambda implements p<FlowCollector<? super k>, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f101129n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private /* synthetic */ Object f101130o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ Flow f101131p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ b f101132q;

                /* JADX INFO: renamed from: p50.b$b$e$b$a */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                public static final class a<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ FlowCollector<k> f101133a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ b f101134b;

                    /* JADX INFO: renamed from: p50.b$b$e$b$a$a, reason: collision with other inner class name */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator$sheetContent$1$retainedEntry$2$invokeSuspend$$inlined$transform$1$1", f = "BottomSheetNavigation.kt", i = {0, 0}, l = {224, EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE}, m = "emit", n = {"backStackEntries", "$this$invokeSuspend_u24lambda_u240"}, s = {"L$0", "L$1"})
                    public static final class C2146a extends ContinuationImpl {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        /* synthetic */ Object f101135n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        int f101136o;

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        Object f101138q;

                        /* JADX INFO: renamed from: r, reason: collision with root package name */
                        Object f101139r;

                        public C2146a(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.f101135n = obj;
                            this.f101136o |= Integer.MIN_VALUE;
                            return a.this.emit(null, this);
                        }
                    }

                    public a(FlowCollector flowCollector, b bVar) {
                        this.f101134b = bVar;
                        this.f101133a = flowCollector;
                    }

                    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
                    
                        if (r10.emit(r11, r0) == r1) goto L40;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
                    
                        if (r10.emit(r11, r0) == r1) goto L40;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(T r10, p013kotlin.coroutines.Continuation<? super jn0.h0> r11) throws java.lang.Throwable {
                        /*
                            r9 = this;
                            boolean r0 = r11 instanceof p50.b.C2143b.e.C2145b.a.C2146a
                            if (r0 == 0) goto L13
                            r0 = r11
                            p50.b$b$e$b$a$a r0 = (p50.b.C2143b.e.C2145b.a.C2146a) r0
                            int r1 = r0.f101136o
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f101136o = r1
                            goto L18
                        L13:
                            p50.b$b$e$b$a$a r0 = new p50.b$b$e$b$a$a
                            r0.<init>(r11)
                        L18:
                            java.lang.Object r11 = r0.f101135n
                            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r2 = r0.f101136o
                            r3 = 4
                            r4 = 3
                            r5 = 2
                            r6 = 1
                            r7 = 0
                            if (r2 == 0) goto L55
                            if (r2 == r6) goto L44
                            if (r2 == r5) goto L3f
                            if (r2 == r4) goto L3f
                            if (r2 == r3) goto L37
                            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                            r10.<init>(r11)
                            throw r10
                        L37:
                            java.lang.Object r10 = r0.f101138q
                            java.lang.Throwable r10 = (java.lang.Throwable) r10
                            jn0.t.b(r11)
                            goto L97
                        L3f:
                            jn0.t.b(r11)
                            goto La9
                        L44:
                            java.lang.Object r10 = r0.f101139r
                            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
                            java.lang.Object r2 = r0.f101138q
                            java.util.List r2 = (java.util.List) r2
                            jn0.t.b(r11)     // Catch: java.lang.Throwable -> L50 java.util.concurrent.CancellationException -> L98
                            goto L71
                        L50:
                            r11 = move-exception
                            r8 = r11
                            r11 = r10
                            r10 = r8
                            goto L86
                        L55:
                            jn0.t.b(r11)
                            kotlinx.coroutines.flow.FlowCollector<ja.k> r11 = r9.f101133a
                            r2 = r10
                            java.util.List r2 = (java.util.List) r2
                            p50.b r10 = r9.f101134b     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L84
                            i2.q1 r10 = r10.getSheetState()     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L84
                            r0.f101138q = r2     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L84
                            r0.f101139r = r11     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L84
                            r0.f101136o = r6     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L84
                            java.lang.Object r10 = r10.i(r0)     // Catch: java.lang.Throwable -> L82 java.util.concurrent.CancellationException -> L84
                            if (r10 != r1) goto L70
                            goto La8
                        L70:
                            r10 = r11
                        L71:
                            java.lang.Object r11 = p013kotlin.collections.v.C0(r2)
                            r0.f101138q = r7
                            r0.f101139r = r7
                            r0.f101136o = r5
                            java.lang.Object r10 = r10.emit(r11, r0)
                            if (r10 != r1) goto La9
                            goto La8
                        L82:
                            r10 = move-exception
                            goto L86
                        L84:
                            r10 = r11
                            goto L98
                        L86:
                            java.lang.Object r2 = p013kotlin.collections.v.C0(r2)
                            r0.f101138q = r10
                            r0.f101139r = r7
                            r0.f101136o = r3
                            java.lang.Object r11 = r11.emit(r2, r0)
                            if (r11 != r1) goto L97
                            goto La8
                        L97:
                            throw r10
                        L98:
                            java.lang.Object r11 = p013kotlin.collections.v.C0(r2)
                            r0.f101138q = r7
                            r0.f101139r = r7
                            r0.f101136o = r4
                            java.lang.Object r10 = r10.emit(r11, r0)
                            if (r10 != r1) goto La9
                        La8:
                            return r1
                        La9:
                            jn0.h0 r10 = jn0.h0.f84049a
                            return r10
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p50.b.C2143b.e.C2145b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2145b(Flow flow, Continuation continuation, b bVar) {
                    super(2, continuation);
                    this.f101131p = flow;
                    this.f101132q = bVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    C2145b c2145b = new C2145b(this.f101131p, continuation, this.f101132q);
                    c2145b.f101130o = obj;
                    return c2145b;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f101129n;
                    if (i11 == 0) {
                        t.b(obj);
                        FlowCollector flowCollector = (FlowCollector) this.f101130o;
                        Flow flow = this.f101131p;
                        a aVar = new a(flowCollector, this.f101132q);
                        this.f101129n = 1;
                        if (flow.collect(aVar, this) == coroutine_suspended) {
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
                public final Object invoke(FlowCollector<? super k> flowCollector, Continuation<? super h0> continuation) {
                    return ((C2145b) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(b bVar, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f101127p = bVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(e2<k> e2Var, Continuation<? super h0> continuation) {
                return ((e) create(e2Var, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                e eVar = new e(this.f101127p, continuation);
                eVar.f101126o = obj;
                return eVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f101125n;
                if (i11 == 0) {
                    t.b(obj);
                    e2 e2Var = (e2) this.f101126o;
                    Flow flow = FlowKt.flow(new C2145b(this.f101127p.p(), null, this.f101127p));
                    a aVar = new a(e2Var);
                    this.f101125n = 1;
                    if (flow.collect(aVar, this) == coroutine_suspended) {
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

        C2143b() {
            super(3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set<k> e(y3<? extends Set<k>> y3Var) {
            return y3Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k f(y3<k> y3Var) {
            return y3Var.getValue();
        }

        public final void c(i iVar, l lVar, int i11) {
            s.k(iVar, "$this$null");
            if ((i11 & 14) == 0) {
                i11 |= lVar.n(iVar) ? 4 : 2;
            }
            if ((i11 & 91) == 18 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1706159018, i11, -1, "com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator.sheetContent.<anonymous> (BottomSheetNavigation.kt:152)");
            }
            a3.d dVarA = a3.f.a(lVar, 0);
            y3 y3VarA = r90.f.a(b.this.s(), lVar, 8);
            y3 y3VarL = n3.l(null, b.this.p(), new e(b.this, null), lVar, 582);
            lVar.H(-581015616);
            if (f(y3VarL) != null) {
                Function0.g(f(y3VarL), new a(b.this, null), lVar, 72);
                f.d.a(false, new C2144b(b.this, y3VarL), lVar, 0, 1);
            }
            lVar.T();
            f.a(iVar, f(y3VarL), b.this.getSheetState(), dVarA, new c(b.this, y3VarA), new d(b.this, y3VarA), lVar, (i11 & 14) | 4160 | (q1.f74975e << 6));
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(i iVar, l lVar, Integer num) {
            c(iVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public b(q1 sheetState) {
        s.k(sheetState, "sheetState");
        this.sheetState = sheetState;
        this.attached = s3.d(Boolean.FALSE, null, 2, null);
        this.navigatorSheetState = new c(sheetState);
        this.sheetContent = z2.c.c(-1706159018, true, new C2143b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean o() {
        return ((Boolean) this.attached.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StateFlow<List<k>> p() {
        return o() ? b().b() : StateFlowKt.MutableStateFlow(v.m());
    }

    private final void t(boolean z11) {
        this.attached.setValue(Boolean.valueOf(z11));
    }

    @Override // p011ja.d0
    @SuppressLint({"NewApi"})
    public void e(List<k> entries, y navOptions, d0.a navigatorExtras) {
        s.k(entries, "entries");
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            b().k((k) it.next());
        }
    }

    @Override // p011ja.d0
    public void f(f0 state) {
        s.k(state, "state");
        super.f(state);
        t(true);
    }

    @Override // p011ja.d0
    public void j(k popUpTo, boolean savedState) {
        s.k(popUpTo, "popUpTo");
        b().h(popUpTo, savedState);
    }

    @Override // p011ja.d0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public a a() {
        return new a(this, d.f101141a.a());
    }

    public final q<i, l, Integer, h0> q() {
        return this.sheetContent;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final q1 getSheetState() {
        return this.sheetState;
    }

    public final StateFlow<Set<k>> s() {
        return o() ? b().c() : StateFlowKt.MutableStateFlow(d1.d());
    }
}
