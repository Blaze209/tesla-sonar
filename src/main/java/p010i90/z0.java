package p010i90;

import androidx.compose.ui.d;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.CombineKt;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import r90.e;
import r90.g;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007JR\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0018\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Li90/z0;", "Li90/l1;", "Li90/i1;", "", "Li90/n1;", "fields", "<init>", "(Ljava/util/List;)V", "", "enabled", "Li90/j1;", "field", "Landroidx/compose/ui/d;", "modifier", "", "Li90/g0;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/d;", "nextFocusDirection", "previousFocusDirection", "Ljn0/h0;", "g", "(ZLi90/j1;Landroidx/compose/ui/d;Ljava/util/Set;Li90/g0;IILr2/l;I)V", "a", "Ljava/util/List;", "u", "()Ljava/util/List;", "Lkotlinx/coroutines/flow/StateFlow;", "Li90/c0;", "b", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", AnalyticsAttribute.Error, "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class z0 implements l1, i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<n1> fields;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<c0> error;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f77162d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ j1 f77163e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f77164f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Set<IdentifierSpec> f77165g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ IdentifierSpec f77166h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f77167i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f77168j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f77169k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, j1 j1Var, d dVar, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11, int i12, int i13) {
            super(2);
            this.f77162d = z11;
            this.f77163e = j1Var;
            this.f77164f = dVar;
            this.f77165g = set;
            this.f77166h = identifierSpec;
            this.f77167i = i11;
            this.f77168j = i12;
            this.f77169k = i13;
        }

        public final void a(l lVar, int i11) {
            z0.this.g(this.f77162d, this.f77163e, this.f77164f, this.f77165g, this.f77166h, this.f77167i, this.f77168j, lVar, k2.a(this.f77169k | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Flow<c0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow[] f77170a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<c0[]> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Flow[] f77171c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Flow[] flowArr) {
                super(0);
                this.f77171c = flowArr;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c0[] invoke() {
                return new c0[this.f77171c.length];
            }
        }

        /* JADX INFO: renamed from: i90.z0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.uicore.elements.RowController$special$$inlined$combineAsStateFlow$1$3", f = "RowController.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
        public static final class C1629b extends SuspendLambda implements q<FlowCollector<? super c0>, c0[], Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f77172n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f77173o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f77174p;

            public C1629b(Continuation continuation) {
                super(3, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f77172n;
                if (i11 == 0) {
                    t.b(obj);
                    FlowCollector flowCollector = (FlowCollector) this.f77173o;
                    c0 c0Var = (c0) v.q0(v.l0(n.w1((Object[]) this.f77174p)));
                    this.f77172n = 1;
                    if (flowCollector.emit(c0Var, this) == coroutine_suspended) {
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

            @Override // wn0.q
            public final Object invoke(FlowCollector<? super c0> flowCollector, c0[] c0VarArr, Continuation<? super h0> continuation) {
                C1629b c1629b = new C1629b(continuation);
                c1629b.f77173o = flowCollector;
                c1629b.f77174p = c0VarArr;
                return c1629b.invokeSuspend(h0.f84049a);
            }
        }

        public b(Flow[] flowArr) {
            this.f77170a = flowArr;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super c0> flowCollector, Continuation continuation) {
            Flow[] flowArr = this.f77170a;
            Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new a(flowArr), new C1629b(null), continuation);
            return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0004\u001a\u00028\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "R", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends u implements wn0.a<c0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f77175c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(0);
            this.f77175c = list;
        }

        @Override // wn0.a
        public final c0 invoke() {
            List list = this.f77175c;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((StateFlow) it.next()).getValue());
            }
            return (c0) v.q0(v.l0(arrayList));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z0(List<? extends n1> fields) {
        s.k(fields, "fields");
        this.fields = fields;
        List<? extends n1> list = fields;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((n1) it.next()).h().a());
        }
        this.error = new e(arrayList.isEmpty() ? g.n((c0) v.q0(v.l0(v.m()))) : new b((Flow[]) v.m1(arrayList).toArray(new Flow[0])), new c(arrayList));
    }

    @Override // p010i90.l1
    public StateFlow<c0> a() {
        return this.error;
    }

    @Override // p010i90.i1
    public void g(boolean z11, j1 field, d modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, int i11, int i12, l lVar, int i13) {
        s.k(field, "field");
        s.k(modifier, "modifier");
        s.k(hiddenIdentifiers, "hiddenIdentifiers");
        l lVarV = lVar.v(-55811811);
        if (o.J()) {
            o.S(-55811811, i13, -1, "com.stripe.android.uicore.elements.RowController.ComposeUI (RowController.kt:28)");
        }
        b1.a(z11, this, hiddenIdentifiers, identifierSpec, lVarV, (i13 & 14) | 576 | ((i13 >> 3) & 7168));
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(z11, field, modifier, hiddenIdentifiers, identifierSpec, i11, i12, i13));
        }
    }

    public final List<n1> u() {
        return this.fields;
    }
}
