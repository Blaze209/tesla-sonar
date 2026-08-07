package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.CombineKt;
import p010i90.IdentifierSpec;
import p010i90.SimpleTextElement;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.w2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011JR\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010%\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00104\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010$R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0013058\u0006¢\u0006\f\n\u0004\b:\u00108\u001a\u0004\b;\u0010<R\"\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010@\u001a\u0004\b!\u0010A\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"Lz80/c0;", "Li90/l1;", "Li90/i1;", "Lh30/b$a;", "cardAccountRangeRepositoryFactory", "", "Li90/g0;", "", "initialValues", "", "collectName", "Lx80/a;", "cbcEligibility", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "workContext", "<init>", "(Lh30/b$a;Ljava/util/Map;ZLx80/a;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)V", "enabled", "Li90/j1;", "field", "Landroidx/compose/ui/d;", "modifier", "", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/d;", "nextFocusDirection", "previousFocusDirection", "Ljn0/h0;", "g", "(ZLi90/j1;Landroidx/compose/ui/d;Ljava/util/Set;Li90/g0;IILr2/l;I)V", "Li90/p1;", "a", "Li90/p1;", "x", "()Li90/p1;", "nameElement", "Lz80/l0;", "b", "Lz80/l0;", "y", "()Lz80/l0;", "numberElement", "Lz80/r0;", "c", "Lz80/r0;", "u", "()Lz80/r0;", "cvcElement", DateTokenConverter.CONVERTER_KEY, "v", "expirationDateElement", "", "Li90/n1;", "e", "Ljava/util/List;", "rowFields", "f", "w", "()Ljava/util/List;", "fields", "Lkotlinx/coroutines/flow/StateFlow;", "Li90/c0;", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", AnalyticsAttribute.Error, "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c0 implements p010i90.l1, p010i90.i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SimpleTextElement nameElement;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CardNumberElement numberElement;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CvcElement cvcElement;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SimpleTextElement expirationDateElement;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<p010i90.n1> rowFields;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<p010i90.j1> fields;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<p010i90.c0> error;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f127386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p010i90.j1 f127387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f127388f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Set<IdentifierSpec> f127389g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ IdentifierSpec f127390h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f127391i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f127392j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f127393k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, p010i90.j1 j1Var, androidx.compose.ui.d dVar, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11, int i12, int i13) {
            super(2);
            this.f127386d = z11;
            this.f127387e = j1Var;
            this.f127388f = dVar;
            this.f127389g = set;
            this.f127390h = identifierSpec;
            this.f127391i = i11;
            this.f127392j = i12;
            this.f127393k = i13;
        }

        public final void a(p020r2.l lVar, int i11) {
            c0.this.g(this.f127386d, this.f127387e, this.f127388f, this.f127389g, this.f127390h, this.f127391i, this.f127392j, lVar, p020r2.k2.a(this.f127393k | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Flow<p010i90.c0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow[] f127394a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<p010i90.c0[]> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Flow[] f127395c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Flow[] flowArr) {
                super(0);
                this.f127395c = flowArr;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final p010i90.c0[] invoke() {
                return new p010i90.c0[this.f127395c.length];
            }
        }

        /* JADX INFO: renamed from: z80.c0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.ui.core.elements.CardDetailsController$special$$inlined$combineAsStateFlow$1$3", f = "CardDetailsController.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
        public static final class C2769b extends SuspendLambda implements wn0.q<FlowCollector<? super p010i90.c0>, p010i90.c0[], Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f127396n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f127397o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f127398p;

            public C2769b(Continuation continuation) {
                super(3, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f127396n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    FlowCollector flowCollector = (FlowCollector) this.f127397o;
                    p010i90.c0 c0Var = (p010i90.c0) p013kotlin.collections.v.q0(p013kotlin.collections.v.l0(p013kotlin.collections.n.w1((Object[]) this.f127398p)));
                    this.f127396n = 1;
                    if (flowCollector.emit(c0Var, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                return jn0.h0.f84049a;
            }

            @Override // wn0.q
            public final Object invoke(FlowCollector<? super p010i90.c0> flowCollector, p010i90.c0[] c0VarArr, Continuation<? super jn0.h0> continuation) {
                C2769b c2769b = new C2769b(continuation);
                c2769b.f127397o = flowCollector;
                c2769b.f127398p = c0VarArr;
                return c2769b.invokeSuspend(jn0.h0.f84049a);
            }
        }

        public b(Flow[] flowArr) {
            this.f127394a = flowArr;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super p010i90.c0> flowCollector, Continuation continuation) {
            Flow[] flowArr = this.f127394a;
            Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new a(flowArr), new C2769b(null), continuation);
            return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0004\u001a\u00028\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "R", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends p013kotlin.jvm.internal.u implements wn0.a<p010i90.c0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f127399c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(0);
            this.f127399c = list;
        }

        @Override // wn0.a
        public final p010i90.c0 invoke() {
            List list = this.f127399c;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((StateFlow) it.next()).getValue());
            }
            return (p010i90.c0) p013kotlin.collections.v.q0(p013kotlin.collections.v.l0(arrayList));
        }
    }

    public c0(h30.b.a cardAccountRangeRepositoryFactory, Map<IdentifierSpec, String> initialValues, boolean z11, x80.a cbcEligibility, CoroutineContext uiContext, CoroutineContext workContext) {
        SimpleTextElement simpleTextElement;
        b0 eligible;
        p013kotlin.jvm.internal.s.k(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        p013kotlin.jvm.internal.s.k(initialValues, "initialValues");
        p013kotlin.jvm.internal.s.k(cbcEligibility, "cbcEligibility");
        p013kotlin.jvm.internal.s.k(uiContext, "uiContext");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        if (z11) {
            p010i90.q1 q1Var = new p010i90.q1(Integer.valueOf(w80.n.D), o4.x.INSTANCE.e(), o4.y.INSTANCE.h(), null, 8, null);
            IdentifierSpec.Companion companion = IdentifierSpec.INSTANCE;
            simpleTextElement = new SimpleTextElement(companion.r(), new p010i90.r1(q1Var, false, initialValues.get(companion.r()), 2, null));
        } else {
            simpleTextElement = null;
        }
        this.nameElement = simpleTextElement;
        IdentifierSpec.Companion companion2 = IdentifierSpec.INSTANCE;
        IdentifierSpec identifierSpecJ = companion2.j();
        j0 j0Var = new j0();
        h30.b bVarCreate = cardAccountRangeRepositoryFactory.create();
        String str = initialValues.get(companion2.j());
        if (cbcEligibility instanceof x80.a.Eligible) {
            List<com.stripe.android.model.h> listA = ((x80.a.Eligible) cbcEligibility).a();
            String str2 = initialValues.get(companion2.v());
            eligible = new b0.Eligible(listA, str2 != null ? com.stripe.android.model.h.INSTANCE.b(str2) : null);
        } else {
            if (!(cbcEligibility instanceof x80.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            eligible = b0.b.f127364a;
        }
        CardNumberElement cardNumberElement = new CardNumberElement(identifierSpecJ, new s0(j0Var, bVarCreate, uiContext, workContext, null, str, false, eligible, 80, null));
        this.numberElement = cardNumberElement;
        CvcElement cvcElement = new CvcElement(companion2.g(), new q0(new p0(), cardNumberElement.i().u(), initialValues.get(companion2.g()), false, 8, null));
        this.cvcElement = cvcElement;
        IdentifierSpec identifierSpecA = companion2.a(InquiryField.DateField.TYPE);
        p010i90.v vVar = new p010i90.v();
        String str3 = initialValues.get(companion2.h());
        String str4 = initialValues.get(companion2.i());
        SimpleTextElement simpleTextElement2 = new SimpleTextElement(identifierSpecA, new p010i90.r1(vVar, false, ((Object) str3) + (str4 != null ? p013kotlin.text.t.U1(str4, 2) : null), 2, null));
        this.expirationDateElement = simpleTextElement2;
        List<p010i90.n1> listP = p013kotlin.collections.v.p(simpleTextElement2, cvcElement);
        this.rowFields = listP;
        this.fields = p013kotlin.collections.v.r(simpleTextElement, cardNumberElement, new p010i90.a1(companion2.a("row_" + UUID.randomUUID().getLeastSignificantBits()), listP, new p010i90.z0(listP)));
        List listR = p013kotlin.collections.v.r(simpleTextElement, cardNumberElement, simpleTextElement2, cvcElement);
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listR, 10));
        Iterator it = listR.iterator();
        while (it.hasNext()) {
            arrayList.add(((p010i90.n1) it.next()).getController());
        }
        ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((p010i90.h0) it2.next()).a());
        }
        this.error = new r90.e(arrayList2.isEmpty() ? r90.g.n((p010i90.c0) p013kotlin.collections.v.q0(p013kotlin.collections.v.l0(p013kotlin.collections.v.m()))) : new b((Flow[]) p013kotlin.collections.v.m1(arrayList2).toArray(new Flow[0])), new c(arrayList2));
    }

    @Override // p010i90.l1
    public StateFlow<p010i90.c0> a() {
        return this.error;
    }

    @Override // p010i90.i1
    public void g(boolean z11, p010i90.j1 field, androidx.compose.ui.d modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, int i11, int i12, p020r2.l lVar, int i13) {
        p013kotlin.jvm.internal.s.k(field, "field");
        p013kotlin.jvm.internal.s.k(modifier, "modifier");
        p013kotlin.jvm.internal.s.k(hiddenIdentifiers, "hiddenIdentifiers");
        p020r2.l lVarV = lVar.v(-1407073849);
        if (p020r2.o.J()) {
            p020r2.o.S(-1407073849, i13, -1, "com.stripe.android.ui.core.elements.CardDetailsController.ComposeUI (CardDetailsController.kt:124)");
        }
        f0.a(z11, this, hiddenIdentifiers, identifierSpec, lVarV, (i13 & 14) | 576 | (IdentifierSpec.f76539d << 9) | ((i13 >> 3) & 7168));
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(z11, field, modifier, hiddenIdentifiers, identifierSpec, i11, i12, i13));
        }
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final CvcElement getCvcElement() {
        return this.cvcElement;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final SimpleTextElement getExpirationDateElement() {
        return this.expirationDateElement;
    }

    public final List<p010i90.j1> w() {
        return this.fields;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final SimpleTextElement getNameElement() {
        return this.nameElement;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final CardNumberElement getNumberElement() {
        return this.numberElement;
    }

    public /* synthetic */ c0(h30.b.a aVar, Map map, boolean z11, x80.a aVar2, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, map, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? x80.a.c.f123091a : aVar2, (i11 & 16) != 0 ? Dispatchers.getMain() : coroutineContext, (i11 & 32) != 0 ? Dispatchers.getIO() : coroutineContext2);
    }
}
