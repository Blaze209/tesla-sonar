package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.CombineKt;
import n90.FormFieldEntry;
import p010i90.IdentifierSpec;
import p010i90.SimpleTextElement;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00190\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001d0\u001c0\u00190\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010(\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b\u001f\u0010'R\u001c\u0010.\u001a\u0004\u0018\u00010*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b$\u0010-¨\u0006/"}, d2 = {"Lz80/d0;", "Li90/m1;", "Li90/g0;", "identifier", "Lh30/b$a;", "cardAccountRangeRepositoryFactory", "", "", "initialValues", "", "collectName", "Lx80/a;", "cbcEligibility", "Lz80/c0;", "controller", "<init>", "(Li90/g0;Lh30/b$a;Ljava/util/Map;ZLx80/a;Lz80/c0;)V", "Li90/l1;", "h", "()Li90/l1;", "rawValuesMap", "Ljn0/h0;", "g", "(Ljava/util/Map;)V", "Lkotlinx/coroutines/flow/StateFlow;", "", "e", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlin/Pair;", "Ln90/a;", "c", "b", "Lx80/a;", "Lz80/c0;", IntegerTokenConverter.CONVERTER_KEY, "()Lz80/c0;", DateTokenConverter.CONVERTER_KEY, "Z", "j", "()Z", "isCardScanEnabled", "allowsUserInteraction", "Lx30/c;", "f", "Lx30/c;", "()Lx30/c;", "mandateText", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d0 extends p010i90.m1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final x80.a cbcEligibility;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c0 controller;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isCardScanEnabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean allowsUserInteraction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final x30.c mandateText;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Flow<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow[] f127416a;

        /* JADX INFO: renamed from: z80.d0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class C2770a extends p013kotlin.jvm.internal.u implements wn0.a<Pair<? extends IdentifierSpec, ? extends FormFieldEntry>[]> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Flow[] f127417c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2770a(Flow[] flowArr) {
                super(0);
                this.f127417c = flowArr;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Pair<? extends IdentifierSpec, ? extends FormFieldEntry>[] invoke() {
                return new Pair[this.f127417c.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.ui.core.elements.CardDetailsElement$getFormFieldValueFlow$$inlined$combineAsStateFlow$1$3", f = "CardDetailsElement.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements wn0.q<FlowCollector<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>, Pair<? extends IdentifierSpec, ? extends FormFieldEntry>[], Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f127418n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f127419o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f127420p;

            public b(Continuation continuation) {
                super(3, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f127418n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    FlowCollector flowCollector = (FlowCollector) this.f127419o;
                    List listM1 = p013kotlin.collections.v.m1(p013kotlin.collections.n.w1((Object[]) this.f127420p));
                    this.f127418n = 1;
                    if (flowCollector.emit(listM1, this) == coroutine_suspended) {
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
            public final Object invoke(FlowCollector<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> flowCollector, Pair<? extends IdentifierSpec, ? extends FormFieldEntry>[] pairArr, Continuation<? super jn0.h0> continuation) {
                b bVar = new b(continuation);
                bVar.f127419o = flowCollector;
                bVar.f127420p = pairArr;
                return bVar.invokeSuspend(jn0.h0.f84049a);
            }
        }

        public a(Flow[] flowArr) {
            this.f127416a = flowArr;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> flowCollector, Continuation continuation) {
            Flow[] flowArr = this.f127416a;
            Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new C2770a(flowArr), new b(null), continuation);
            return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0004\u001a\u00028\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "R", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends p013kotlin.jvm.internal.u implements wn0.a<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f127421c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(0);
            this.f127421c = list;
        }

        @Override // wn0.a
        public final List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>> invoke() {
            List list = this.f127421c;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((StateFlow) it.next()).getValue());
            }
            return p013kotlin.collections.v.m1(arrayList);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln90/a;", "it", "Lkotlin/Pair;", "Li90/g0;", "a", "(Ln90/a;)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<FormFieldEntry, Pair<? extends IdentifierSpec, ? extends FormFieldEntry>> {
        c() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<IdentifierSpec, FormFieldEntry> invoke(FormFieldEntry it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return jn0.x.a(d0.this.getController().getNameElement().getIdentifier(), it);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln90/a;", "it", "Lkotlin/Pair;", "Li90/g0;", "a", "(Ln90/a;)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.l<FormFieldEntry, Pair<? extends IdentifierSpec, ? extends FormFieldEntry>> {
        d() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<IdentifierSpec, FormFieldEntry> invoke(FormFieldEntry it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return jn0.x.a(d0.this.getController().getNumberElement().getIdentifier(), it);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln90/a;", "it", "Lkotlin/Pair;", "Li90/g0;", "a", "(Ln90/a;)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.l<FormFieldEntry, Pair<? extends IdentifierSpec, ? extends FormFieldEntry>> {
        e() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<IdentifierSpec, FormFieldEntry> invoke(FormFieldEntry it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return jn0.x.a(d0.this.getController().getCvcElement().getIdentifier(), it);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/stripe/android/model/h;", "it", "Lkotlin/Pair;", "Li90/g0;", "Ln90/a;", "a", "(Lcom/stripe/android/model/h;)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.l<com.stripe.android.model.h, Pair<? extends IdentifierSpec, ? extends FormFieldEntry>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f127425c = new f();

        f() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<IdentifierSpec, FormFieldEntry> invoke(com.stripe.android.model.h it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return jn0.x.a(IdentifierSpec.INSTANCE.f(), new FormFieldEntry(it.getCode(), true));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/stripe/android/model/h;", "brand", "Lkotlin/Pair;", "Li90/g0;", "Ln90/a;", "a", "(Lcom/stripe/android/model/h;)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.l<com.stripe.android.model.h, Pair<? extends IdentifierSpec, ? extends FormFieldEntry>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f127426c = new g();

        g() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<IdentifierSpec, FormFieldEntry> invoke(com.stripe.android.model.h brand) {
            p013kotlin.jvm.internal.s.k(brand, "brand");
            IdentifierSpec identifierSpecV = IdentifierSpec.INSTANCE.v();
            String code = brand.getCode();
            if (brand == com.stripe.android.model.h.Unknown) {
                code = null;
            }
            return jn0.x.a(identifierSpecV, new FormFieldEntry(code, true));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln90/a;", "it", "Lkotlin/Pair;", "Li90/g0;", "a", "(Ln90/a;)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
    static final class h extends p013kotlin.jvm.internal.u implements wn0.l<FormFieldEntry, Pair<? extends IdentifierSpec, ? extends FormFieldEntry>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f127427c = new h();

        h() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<IdentifierSpec, FormFieldEntry> invoke(FormFieldEntry it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return jn0.x.a(IdentifierSpec.INSTANCE.h(), e0.c(it));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln90/a;", "it", "Lkotlin/Pair;", "Li90/g0;", "a", "(Ln90/a;)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.l<FormFieldEntry, Pair<? extends IdentifierSpec, ? extends FormFieldEntry>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f127428c = new i();

        i() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<IdentifierSpec, FormFieldEntry> invoke(FormFieldEntry it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return jn0.x.a(IdentifierSpec.INSTANCE.i(), e0.d(it));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d0(IdentifierSpec identifierSpec, h30.b.a aVar, Map map, boolean z11, x80.a aVar2, c0 c0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z12 = (i11 & 8) != 0 ? false : z11;
        x80.a aVar3 = (i11 & 16) != 0 ? x80.a.c.f123091a : aVar2;
        this(identifierSpec, aVar, map, z12, aVar3, (i11 & 32) != 0 ? new c0(aVar, map, z12, aVar3, null, null, 48, null) : c0Var);
    }

    @Override // p010i90.j1
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getAllowsUserInteraction() {
        return this.allowsUserInteraction;
    }

    @Override // p010i90.j1
    public StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> c() {
        List listC = p013kotlin.collections.v.c();
        if (this.controller.getNameElement() != null) {
            listC.add(r90.g.m(this.controller.getNameElement().i().m(), new c()));
        }
        listC.add(r90.g.m(this.controller.getNumberElement().i().m(), new d()));
        listC.add(r90.g.m(this.controller.getCvcElement().i().m(), new e()));
        listC.add(r90.g.m(this.controller.getNumberElement().i().u(), f.f127425c));
        if (this.cbcEligibility instanceof x80.a.Eligible) {
            listC.add(r90.g.m(this.controller.getNumberElement().i().w(), g.f127426c));
        }
        listC.add(r90.g.m(this.controller.getExpirationDateElement().i().m(), h.f127427c));
        listC.add(r90.g.m(this.controller.getExpirationDateElement().i().m(), i.f127428c));
        List listA = p013kotlin.collections.v.a(listC);
        return new r90.e(listA.isEmpty() ? r90.g.n(p013kotlin.collections.v.m1(p013kotlin.collections.v.m())) : new a((Flow[]) p013kotlin.collections.v.m1(listA).toArray(new Flow[0])), new b(listA));
    }

    @Override // p010i90.j1
    /* JADX INFO: renamed from: d, reason: from getter */
    public x30.c getMandateText() {
        return this.mandateText;
    }

    @Override // p010i90.j1
    public StateFlow<List<IdentifierSpec>> e() {
        SimpleTextElement nameElement = this.controller.getNameElement();
        IdentifierSpec identifier = nameElement != null ? nameElement.getIdentifier() : null;
        IdentifierSpec identifier2 = this.controller.getNumberElement().getIdentifier();
        IdentifierSpec identifier3 = this.controller.getExpirationDateElement().getIdentifier();
        IdentifierSpec identifier4 = this.controller.getCvcElement().getIdentifier();
        IdentifierSpec.Companion companion = IdentifierSpec.INSTANCE;
        return r90.g.n(p013kotlin.collections.v.r(identifier, identifier2, identifier3, identifier4, companion.f(), this.cbcEligibility instanceof x80.a.Eligible ? companion.v() : null));
    }

    @Override // p010i90.j1
    public void g(Map<IdentifierSpec, String> rawValuesMap) {
        p013kotlin.jvm.internal.s.k(rawValuesMap, "rawValuesMap");
    }

    @Override // p010i90.j1
    public p010i90.l1 h() {
        return this.controller;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final c0 getController() {
        return this.controller;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsCardScanEnabled() {
        return this.isCardScanEnabled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(IdentifierSpec identifier, h30.b.a cardAccountRangeRepositoryFactory, Map<IdentifierSpec, String> initialValues, boolean z11, x80.a cbcEligibility, c0 controller) {
        super(identifier);
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        p013kotlin.jvm.internal.s.k(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        p013kotlin.jvm.internal.s.k(initialValues, "initialValues");
        p013kotlin.jvm.internal.s.k(cbcEligibility, "cbcEligibility");
        p013kotlin.jvm.internal.s.k(controller, "controller");
        this.cbcEligibility = cbcEligibility;
        this.controller = controller;
        this.isCardScanEnabled = controller.getNumberElement().i().v();
        this.allowsUserInteraction = true;
    }
}
