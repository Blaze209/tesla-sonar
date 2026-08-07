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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJR\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u0018\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Li90/a;", "Li90/l1;", "Li90/i1;", "Lkotlinx/coroutines/flow/StateFlow;", "", "Li90/j1;", "fieldsFlowable", "<init>", "(Lkotlinx/coroutines/flow/StateFlow;)V", "", "enabled", "field", "Landroidx/compose/ui/d;", "modifier", "", "Li90/g0;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/d;", "nextFocusDirection", "previousFocusDirection", "Ljn0/h0;", "g", "(ZLi90/j1;Landroidx/compose/ui/d;Ljava/util/Set;Li90/g0;IILr2/l;I)V", "a", "Lkotlinx/coroutines/flow/StateFlow;", "u", "()Lkotlinx/coroutines/flow/StateFlow;", "Li90/c0;", "b", AnalyticsAttribute.Error, "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements l1, i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f76237c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<List<j1>> fieldsFlowable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<c0> error;

    /* JADX INFO: renamed from: i90.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C1600a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f76241d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ j1 f76242e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f76243f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Set<IdentifierSpec> f76244g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ IdentifierSpec f76245h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f76246i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f76247j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f76248k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1600a(boolean z11, j1 j1Var, d dVar, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11, int i12, int i13) {
            super(2);
            this.f76241d = z11;
            this.f76242e = j1Var;
            this.f76243f = dVar;
            this.f76244g = set;
            this.f76245h = identifierSpec;
            this.f76246i = i11;
            this.f76247j = i12;
            this.f76248k = i13;
        }

        public final void a(l lVar, int i11) {
            a.this.g(this.f76241d, this.f76242e, this.f76243f, this.f76244g, this.f76245h, this.f76246i, this.f76247j, lVar, k2.a(this.f76248k | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Li90/j1;", "sectionFieldElements", "Lkotlinx/coroutines/flow/StateFlow;", "Li90/c0;", "a", "(Ljava/util/List;)Lkotlinx/coroutines/flow/StateFlow;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.l<List<? extends j1>, StateFlow<? extends c0>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f76249c = new b();

        /* JADX INFO: renamed from: i90.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C1601a implements Flow<c0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Flow[] f76250a;

            /* JADX INFO: renamed from: i90.a$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
            static final class C1602a extends u implements wn0.a<c0[]> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Flow[] f76251c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1602a(Flow[] flowArr) {
                    super(0);
                    this.f76251c = flowArr;
                }

                @Override // wn0.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c0[] invoke() {
                    return new c0[this.f76251c.length];
                }
            }

            /* JADX INFO: renamed from: i90.a$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.stripe.android.uicore.elements.AddressController$error$1$invoke$$inlined$combineAsStateFlow$1$3", f = "AddressController.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
            public static final class C1603b extends SuspendLambda implements q<FlowCollector<? super c0>, c0[], Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f76252n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private /* synthetic */ Object f76253o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                /* synthetic */ Object f76254p;

                public C1603b(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f76252n;
                    if (i11 == 0) {
                        t.b(obj);
                        FlowCollector flowCollector = (FlowCollector) this.f76253o;
                        c0 c0Var = (c0) v.q0(v.l0(n.w1((Object[]) this.f76254p)));
                        this.f76252n = 1;
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
                    C1603b c1603b = new C1603b(continuation);
                    c1603b.f76253o = flowCollector;
                    c1603b.f76254p = c0VarArr;
                    return c1603b.invokeSuspend(h0.f84049a);
                }
            }

            public C1601a(Flow[] flowArr) {
                this.f76250a = flowArr;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super c0> flowCollector, Continuation continuation) {
                Flow[] flowArr = this.f76250a;
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new C1602a(flowArr), new C1603b(null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: i90.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0004\u001a\u00028\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "R", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class C1604b extends u implements wn0.a<c0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f76255c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1604b(List list) {
                super(0);
                this.f76255c = list;
            }

            @Override // wn0.a
            public final c0 invoke() {
                List list = this.f76255c;
                ArrayList arrayList = new ArrayList(v.y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((StateFlow) it.next()).getValue());
                }
                return (c0) v.q0(v.l0(arrayList));
            }
        }

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StateFlow<c0> invoke(List<? extends j1> sectionFieldElements) {
            s.k(sectionFieldElements, "sectionFieldElements");
            List<? extends j1> list = sectionFieldElements;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((j1) it.next()).getController().a());
            }
            return new e(arrayList.isEmpty() ? g.n((c0) v.q0(v.l0(v.m()))) : new C1601a((Flow[]) v.m1(arrayList).toArray(new Flow[0])), new C1604b(arrayList));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(StateFlow<? extends List<? extends j1>> fieldsFlowable) {
        s.k(fieldsFlowable, "fieldsFlowable");
        this.fieldsFlowable = fieldsFlowable;
        this.error = g.l(fieldsFlowable, b.f76249c);
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
        l lVarV = lVar.v(791653481);
        if (o.J()) {
            o.S(791653481, i13, -1, "com.stripe.android.uicore.elements.AddressController.ComposeUI (AddressController.kt:40)");
        }
        d.a(z11, this, hiddenIdentifiers, identifierSpec, lVarV, (i13 & 14) | 576 | ((i13 >> 3) & 7168));
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new C1600a(z11, field, modifier, hiddenIdentifiers, identifierSpec, i11, i12, i13));
        }
    }

    public final StateFlow<List<j1>> u() {
        return this.fieldsFlowable;
    }
}
