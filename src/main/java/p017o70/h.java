package p017o70;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.CombineKt;
import n90.FormFieldEntry;
import p010i90.IdentifierSpec;
import p010i90.SectionElement;
import p010i90.d0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.d1;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.p;
import wn0.q;
import z80.LayoutSpec;
import z80.a0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R#\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000eR+\u0010\u0019\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u000b\u0010\u000eR)\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00180\u00170\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u0014\u0010\u000eR \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001f\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001a\u0010\u000e¨\u0006 "}, d2 = {"Lo70/h;", "", "Lz80/p1;", "formSpec", "Lt60/h;", "transformSpecToElement", "<init>", "(Lz80/p1;Lt60/h;)V", "Lkotlinx/coroutines/flow/StateFlow;", "", "Li90/d0;", "a", "Lkotlinx/coroutines/flow/StateFlow;", "b", "()Lkotlinx/coroutines/flow/StateFlow;", "elements", "Lz80/a0;", "cardBillingElement", "", "Li90/g0;", "c", DateTokenConverter.CONVERTER_KEY, "hiddenIdentifiers", "", "Ln90/a;", "completeFormValues", "e", "formValues", "f", "textFieldControllerIdsFlow", "g", "lastTextFieldIdentifier", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<List<d0>> elements;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<a0> cardBillingElement;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Set<IdentifierSpec>> hiddenIdentifiers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Map<IdentifierSpec, FormFieldEntry>> completeFormValues;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Map<IdentifierSpec, FormFieldEntry>> formValues;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<List<IdentifierSpec>> textFieldControllerIdsFlow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<IdentifierSpec> lastTextFieldIdentifier;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Li90/d0;", "elementsList", "Lz80/a0;", "a", "(Ljava/util/List;)Lz80/a0;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<List<? extends d0>, a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f96813c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a0 invoke(List<? extends d0> elementsList) {
            s.k(elementsList, "elementsList");
            ArrayList arrayList = new ArrayList();
            for (Object obj : elementsList) {
                if (obj instanceof SectionElement) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                v.E(arrayList2, ((SectionElement) it.next()).g());
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (obj2 instanceof a0) {
                    arrayList3.add(obj2);
                }
            }
            return (a0) v.q0(arrayList3);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Li90/d0;", "elementsList", "Lkotlinx/coroutines/flow/StateFlow;", "", "Li90/g0;", "Ln90/a;", "a", "(Ljava/util/List;)Lkotlinx/coroutines/flow/StateFlow;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements l<List<? extends d0>, StateFlow<? extends Map<IdentifierSpec, ? extends FormFieldEntry>>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f96814c = new b();

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Flow<Map<IdentifierSpec, ? extends FormFieldEntry>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Flow[] f96815a;

            /* JADX INFO: renamed from: o70.h$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
            static final class C2063a extends u implements wn0.a<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[]> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Flow[] f96816c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2063a(Flow[] flowArr) {
                    super(0);
                    this.f96816c = flowArr;
                }

                @Override // wn0.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] invoke() {
                    return new List[this.f96816c.length];
                }
            }

            /* JADX INFO: renamed from: o70.h$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.FormController$completeFormValues$1$invoke$$inlined$combineAsStateFlow$1$3", f = "FormController.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
            public static final class C2064b extends SuspendLambda implements q<FlowCollector<? super Map<IdentifierSpec, ? extends FormFieldEntry>>, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[], Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f96817n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private /* synthetic */ Object f96818o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                /* synthetic */ Object f96819p;

                public C2064b(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f96817n;
                    if (i11 == 0) {
                        t.b(obj);
                        FlowCollector flowCollector = (FlowCollector) this.f96818o;
                        Map mapY = v0.y(v.A(v.m1(n.w1((Object[]) this.f96819p))));
                        this.f96817n = 1;
                        if (flowCollector.emit(mapY, this) == coroutine_suspended) {
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
                public final Object invoke(FlowCollector<? super Map<IdentifierSpec, ? extends FormFieldEntry>> flowCollector, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] listArr, Continuation<? super h0> continuation) {
                    C2064b c2064b = new C2064b(continuation);
                    c2064b.f96818o = flowCollector;
                    c2064b.f96819p = listArr;
                    return c2064b.invokeSuspend(h0.f84049a);
                }
            }

            public a(Flow[] flowArr) {
                this.f96815a = flowArr;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Map<IdentifierSpec, ? extends FormFieldEntry>> flowCollector, Continuation continuation) {
                Flow[] flowArr = this.f96815a;
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new C2063a(flowArr), new C2064b(null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: o70.h$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0004\u001a\u00028\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "R", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class C2065b extends u implements wn0.a<Map<IdentifierSpec, ? extends FormFieldEntry>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f96820c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2065b(List list) {
                super(0);
                this.f96820c = list;
            }

            @Override // wn0.a
            public final Map<IdentifierSpec, ? extends FormFieldEntry> invoke() {
                List list = this.f96820c;
                ArrayList arrayList = new ArrayList(v.y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((StateFlow) it.next()).getValue());
                }
                return v0.y(v.A(v.m1(arrayList)));
            }
        }

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StateFlow<Map<IdentifierSpec, FormFieldEntry>> invoke(List<? extends d0> elementsList) {
            s.k(elementsList, "elementsList");
            List<? extends d0> list = elementsList;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((d0) it.next()).c());
            }
            return new r90.e(arrayList.isEmpty() ? r90.g.n(v0.y(v.A(v.m1(v.m())))) : new a((Flow[]) v.m1(arrayList).toArray(new Flow[0])), new C2065b(arrayList));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Li90/g0;", "Ln90/a;", "elementsList", "", "hiddenIdentifiers", "a", "(Ljava/util/Map;Ljava/util/Set;)Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements p<Map<IdentifierSpec, ? extends FormFieldEntry>, Set<? extends IdentifierSpec>, Map<IdentifierSpec, ? extends FormFieldEntry>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f96821c = new c();

        c() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<IdentifierSpec, FormFieldEntry> invoke(Map<IdentifierSpec, FormFieldEntry> elementsList, Set<IdentifierSpec> hiddenIdentifiers) {
            s.k(elementsList, "elementsList");
            s.k(hiddenIdentifiers, "hiddenIdentifiers");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<IdentifierSpec, FormFieldEntry> entry : elementsList.entrySet()) {
                if (!hiddenIdentifiers.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Li90/g0;", "Ln90/a;", "map", "a", "(Ljava/util/Map;)Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements l<Map<IdentifierSpec, ? extends FormFieldEntry>, Map<IdentifierSpec, ? extends FormFieldEntry>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f96822c = new d();

        d() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<IdentifierSpec, FormFieldEntry> invoke(Map<IdentifierSpec, FormFieldEntry> map) {
            s.k(map, "map");
            Collection<FormFieldEntry> collectionValues = map.values();
            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                return map;
            }
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (!((FormFieldEntry) it.next()).getIsComplete()) {
                    return null;
                }
            }
            return map;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Li90/d0;", "elementsList", "Lkotlinx/coroutines/flow/StateFlow;", "", "Li90/g0;", "Ln90/a;", "a", "(Ljava/util/List;)Lkotlinx/coroutines/flow/StateFlow;"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements l<List<? extends d0>, StateFlow<? extends Map<IdentifierSpec, ? extends FormFieldEntry>>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f96823c = new e();

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Flow<Map<IdentifierSpec, ? extends FormFieldEntry>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Flow[] f96824a;

            /* JADX INFO: renamed from: o70.h$e$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
            static final class C2066a extends u implements wn0.a<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[]> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Flow[] f96825c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2066a(Flow[] flowArr) {
                    super(0);
                    this.f96825c = flowArr;
                }

                @Override // wn0.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] invoke() {
                    return new List[this.f96825c.length];
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.FormController$formValues$1$invoke$$inlined$combineAsStateFlow$1$3", f = "FormController.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements q<FlowCollector<? super Map<IdentifierSpec, ? extends FormFieldEntry>>, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[], Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f96826n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private /* synthetic */ Object f96827o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                /* synthetic */ Object f96828p;

                public b(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f96826n;
                    if (i11 == 0) {
                        t.b(obj);
                        FlowCollector flowCollector = (FlowCollector) this.f96827o;
                        Map mapY = v0.y(v.A(v.m1(n.w1((Object[]) this.f96828p))));
                        this.f96826n = 1;
                        if (flowCollector.emit(mapY, this) == coroutine_suspended) {
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
                public final Object invoke(FlowCollector<? super Map<IdentifierSpec, ? extends FormFieldEntry>> flowCollector, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] listArr, Continuation<? super h0> continuation) {
                    b bVar = new b(continuation);
                    bVar.f96827o = flowCollector;
                    bVar.f96828p = listArr;
                    return bVar.invokeSuspend(h0.f84049a);
                }
            }

            public a(Flow[] flowArr) {
                this.f96824a = flowArr;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Map<IdentifierSpec, ? extends FormFieldEntry>> flowCollector, Continuation continuation) {
                Flow[] flowArr = this.f96824a;
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new C2066a(flowArr), new b(null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0004\u001a\u00028\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "R", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends u implements wn0.a<Map<IdentifierSpec, ? extends FormFieldEntry>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f96829c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List list) {
                super(0);
                this.f96829c = list;
            }

            @Override // wn0.a
            public final Map<IdentifierSpec, ? extends FormFieldEntry> invoke() {
                List list = this.f96829c;
                ArrayList arrayList = new ArrayList(v.y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((StateFlow) it.next()).getValue());
                }
                return v0.y(v.A(v.m1(arrayList)));
            }
        }

        e() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StateFlow<Map<IdentifierSpec, FormFieldEntry>> invoke(List<? extends d0> elementsList) {
            s.k(elementsList, "elementsList");
            List<? extends d0> list = elementsList;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((d0) it.next()).c());
            }
            return new r90.e(arrayList.isEmpty() ? r90.g.n(v0.y(v.A(v.m1(v.m())))) : new a((Flow[]) v.m1(arrayList).toArray(new Flow[0])), new b(arrayList));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Li90/g0;", "Ln90/a;", "elementsList", "", "hiddenIdentifiers", "a", "(Ljava/util/Map;Ljava/util/Set;)Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements p<Map<IdentifierSpec, ? extends FormFieldEntry>, Set<? extends IdentifierSpec>, Map<IdentifierSpec, ? extends FormFieldEntry>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f96830c = new f();

        f() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<IdentifierSpec, FormFieldEntry> invoke(Map<IdentifierSpec, FormFieldEntry> elementsList, Set<IdentifierSpec> hiddenIdentifiers) {
            s.k(elementsList, "elementsList");
            s.k(hiddenIdentifiers, "hiddenIdentifiers");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<IdentifierSpec, FormFieldEntry> entry : elementsList.entrySet()) {
                if (!hiddenIdentifiers.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Li90/g0;", "Ln90/a;", "map", "a", "(Ljava/util/Map;)Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
    static final class g extends u implements l<Map<IdentifierSpec, ? extends FormFieldEntry>, Map<IdentifierSpec, ? extends FormFieldEntry>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f96831c = new g();

        g() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<IdentifierSpec, FormFieldEntry> invoke(Map<IdentifierSpec, FormFieldEntry> map) {
            s.k(map, "map");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<IdentifierSpec, FormFieldEntry> entry : map.entrySet()) {
                if (entry.getValue().getIsComplete()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }
    }

    /* JADX INFO: renamed from: o70.h$h, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz80/a0;", "it", "Lkotlinx/coroutines/flow/StateFlow;", "", "Li90/g0;", "a", "(Lz80/a0;)Lkotlinx/coroutines/flow/StateFlow;"}, k = 3, mv = {1, 9, 0})
    static final class C2067h extends u implements l<a0, StateFlow<? extends Set<? extends IdentifierSpec>>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2067h f96832c = new C2067h();

        C2067h() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StateFlow<Set<IdentifierSpec>> invoke(a0 a0Var) {
            StateFlow<Set<IdentifierSpec>> stateFlowW;
            return (a0Var == null || (stateFlowW = a0Var.w()) == null) ? r90.g.n(d1.d()) : stateFlowW;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Li90/g0;", "hiddenIds", "", "textFieldControllerIds", "a", "(Ljava/util/Set;Ljava/util/List;)Li90/g0;"}, k = 3, mv = {1, 9, 0})
    static final class i extends u implements p<Set<? extends IdentifierSpec>, List<? extends IdentifierSpec>, IdentifierSpec> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f96833c = new i();

        i() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IdentifierSpec invoke(Set<IdentifierSpec> hiddenIds, List<IdentifierSpec> textFieldControllerIds) {
            IdentifierSpec identifierSpecPrevious;
            s.k(hiddenIds, "hiddenIds");
            s.k(textFieldControllerIds, "textFieldControllerIds");
            ListIterator<IdentifierSpec> listIterator = textFieldControllerIds.listIterator(textFieldControllerIds.size());
            while (listIterator.hasPrevious()) {
                identifierSpecPrevious = listIterator.previous();
                if (!hiddenIds.contains(identifierSpecPrevious)) {
                    return identifierSpecPrevious;
                }
            }
            identifierSpecPrevious = null;
            return identifierSpecPrevious;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Li90/d0;", "elementsList", "Lkotlinx/coroutines/flow/StateFlow;", "Li90/g0;", "a", "(Ljava/util/List;)Lkotlinx/coroutines/flow/StateFlow;"}, k = 3, mv = {1, 9, 0})
    static final class j extends u implements l<List<? extends d0>, StateFlow<? extends List<? extends IdentifierSpec>>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f96834c = new j();

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Flow<List<? extends IdentifierSpec>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Flow[] f96835a;

            /* JADX INFO: renamed from: o70.h$j$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
            static final class C2068a extends u implements wn0.a<List<? extends IdentifierSpec>[]> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Flow[] f96836c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2068a(Flow[] flowArr) {
                    super(0);
                    this.f96836c = flowArr;
                }

                @Override // wn0.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final List<? extends IdentifierSpec>[] invoke() {
                    return new List[this.f96836c.length];
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.FormController$textFieldControllerIdsFlow$1$invoke$$inlined$combineAsStateFlow$1$3", f = "FormController.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements q<FlowCollector<? super List<? extends IdentifierSpec>>, List<? extends IdentifierSpec>[], Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f96837n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private /* synthetic */ Object f96838o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                /* synthetic */ Object f96839p;

                public b(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f96837n;
                    if (i11 == 0) {
                        t.b(obj);
                        FlowCollector flowCollector = (FlowCollector) this.f96838o;
                        List listA = v.A(v.m1(n.w1((Object[]) this.f96839p)));
                        this.f96837n = 1;
                        if (flowCollector.emit(listA, this) == coroutine_suspended) {
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
                public final Object invoke(FlowCollector<? super List<? extends IdentifierSpec>> flowCollector, List<? extends IdentifierSpec>[] listArr, Continuation<? super h0> continuation) {
                    b bVar = new b(continuation);
                    bVar.f96838o = flowCollector;
                    bVar.f96839p = listArr;
                    return bVar.invokeSuspend(h0.f84049a);
                }
            }

            public a(Flow[] flowArr) {
                this.f96835a = flowArr;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends IdentifierSpec>> flowCollector, Continuation continuation) {
                Flow[] flowArr = this.f96835a;
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new C2068a(flowArr), new b(null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0004\u001a\u00028\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "R", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends u implements wn0.a<List<? extends IdentifierSpec>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f96840c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List list) {
                super(0);
                this.f96840c = list;
            }

            @Override // wn0.a
            public final List<? extends IdentifierSpec> invoke() {
                List list = this.f96840c;
                ArrayList arrayList = new ArrayList(v.y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((StateFlow) it.next()).getValue());
                }
                return v.A(v.m1(arrayList));
            }
        }

        j() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StateFlow<List<IdentifierSpec>> invoke(List<? extends d0> elementsList) {
            s.k(elementsList, "elementsList");
            List<? extends d0> list = elementsList;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((d0) it.next()).e());
            }
            return new r90.e(arrayList.isEmpty() ? r90.g.n(v.A(v.m1(v.m()))) : new a((Flow[]) v.m1(arrayList).toArray(new Flow[0])), new b(arrayList));
        }
    }

    public h(LayoutSpec formSpec, t60.h transformSpecToElement) {
        s.k(formSpec, "formSpec");
        s.k(transformSpecToElement, "transformSpecToElement");
        StateFlow<List<d0>> stateFlowN = r90.g.n(t60.h.b(transformSpecToElement, formSpec.a(), null, 2, null));
        this.elements = stateFlowN;
        StateFlow<a0> stateFlowM = r90.g.m(stateFlowN, a.f96813c);
        this.cardBillingElement = stateFlowM;
        StateFlow<Set<IdentifierSpec>> stateFlowL = r90.g.l(stateFlowM, C2067h.f96832c);
        this.hiddenIdentifiers = stateFlowL;
        this.completeFormValues = r90.g.m(r90.g.h(r90.g.l(stateFlowN, b.f96814c), stateFlowL, c.f96821c), d.f96822c);
        this.formValues = r90.g.m(r90.g.h(r90.g.l(stateFlowN, e.f96823c), stateFlowL, f.f96830c), g.f96831c);
        StateFlow<List<IdentifierSpec>> stateFlowL2 = r90.g.l(stateFlowN, j.f96834c);
        this.textFieldControllerIdsFlow = stateFlowL2;
        this.lastTextFieldIdentifier = r90.g.h(stateFlowL, stateFlowL2, i.f96833c);
    }

    public final StateFlow<Map<IdentifierSpec, FormFieldEntry>> a() {
        return this.completeFormValues;
    }

    public final StateFlow<List<d0>> b() {
        return this.elements;
    }

    public final StateFlow<Map<IdentifierSpec, FormFieldEntry>> c() {
        return this.formValues;
    }

    public final StateFlow<Set<IdentifierSpec>> d() {
        return this.hiddenIdentifiers;
    }

    public final StateFlow<IdentifierSpec> e() {
        return this.lastTextFieldIdentifier;
    }
}
