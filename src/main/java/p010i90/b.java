package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC4419g;
import f90.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.CombineKt;
import n90.FormFieldEntry;
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
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.p;
import wn0.q;
import wn0.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001d\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a0\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001a0\u0019H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ%\u0010!\u001a\u00020 2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0016¢\u0006\u0004\b!\u0010\"R$\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u001a\u0010+\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b#\u0010*R\u001c\u0010/\u001a\u0004\u0018\u00010,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010-\u001a\u0004\b&\u0010.R\u001a\u00104\u001a\u0002008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00101\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R \u0010D\u001a\u00020=8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u0010C\u001a\u0004\b@\u0010AR\"\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010$R\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR \u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010R\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001c\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010NR\u001c\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010NR#\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\u001a0\u00198\u0006¢\u0006\f\n\u0004\bW\u0010N\u001a\u0004\bX\u0010\u001eR\u0017\u0010^\u001a\u00020Z8\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b[\u0010]¨\u0006_"}, d2 = {"Li90/b;", "Li90/m1;", "Li90/g0;", "_identifier", "", "", "rawValuesMap", "Li90/i;", "addressType", "", "countryCodes", "Li90/y;", "countryDropdownFieldController", "Li90/d1;", "sameAsShippingElement", "shippingValuesMap", "Li90/i0;", "isPlacesAvailable", "", "hideCountry", "<init>", "(Li90/g0;Ljava/util/Map;Li90/i;Ljava/util/Set;Li90/y;Li90/d1;Ljava/util/Map;Li90/i0;Z)V", "Li90/l1;", "h", "()Li90/l1;", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlin/Pair;", "Ln90/a;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "e", "Ljn0/h0;", "g", "(Ljava/util/Map;)V", "b", "Ljava/util/Map;", "Li90/i;", DateTokenConverter.CONVERTER_KEY, "Li90/i0;", "Z", "f", "()Z", "allowsUserInteraction", "Lx30/c;", "Lx30/c;", "()Lx30/c;", "mandateText", "Li90/u;", "Li90/u;", "t", "()Li90/u;", "countryElement", "Li90/p1;", IntegerTokenConverter.CONVERTER_KEY, "Li90/p1;", "nameElement", "Li90/g;", "j", "Li90/g;", "addressAutoCompleteElement", "Li90/r0;", "k", "Li90/r0;", "u", "()Li90/r0;", "getPhoneNumberElement$annotations", "()V", "phoneNumberElement", "", "l", "currentValuesMap", "Li90/e;", "m", "Li90/e;", "elementsRegistry", "Li90/j1;", "n", "Lkotlinx/coroutines/flow/StateFlow;", "otherFields", "o", "Ljava/lang/Boolean;", "lastSameAsShipping", "p", "sameAsShippingUpdatedFlow", "q", "fieldsUpdatedFlow", "r", "getFields", "fields", "Li90/a;", "s", "Li90/a;", "()Li90/a;", "controller", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class b extends m1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Map<IdentifierSpec, String> rawValuesMap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i addressType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i0 isPlacesAvailable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean hideCountry;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean allowsUserInteraction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final x30.c mandateText;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final CountryElement countryElement;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final SimpleTextElement nameElement;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p010i90.g addressAutoCompleteElement;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final PhoneNumberElement phoneNumberElement;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Map<IdentifierSpec, String> currentValuesMap;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p010i90.e elementsRegistry;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<List<j1>> otherFields;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Boolean lastSameAsShipping;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<h0> sameAsShippingUpdatedFlow;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<h0> fieldsUpdatedFlow;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<List<j1>> fields;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final p010i90.a controller;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", PlaceTypes.COUNTRY, "", "Li90/j1;", "otherFields", "Ljn0/h0;", "<anonymous parameter 2>", "<anonymous parameter 3>", "a", "(Ljava/lang/String;Ljava/util/List;Ljn0/h0;Ljn0/h0;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements r<String, List<? extends j1>, h0, h0, List<? extends j1>> {
        a() {
            super(4);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x007d  */
        @Override // wn0.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<j1> invoke(String str, List<? extends j1> otherFields, h0 h0Var, h0 h0Var2) {
            s.k(otherFields, "otherFields");
            SimpleTextElement simpleTextElement = b.this.nameElement;
            CountryElement countryElement = b.this.getCountryElement();
            if (b.this.hideCountry) {
                countryElement = null;
            }
            List<j1> listR = v.r(simpleTextElement, countryElement, b.this.addressAutoCompleteElement);
            SimpleTextElement simpleTextElement2 = b.this.nameElement;
            CountryElement countryElement2 = b.this.getCountryElement();
            if (b.this.hideCountry) {
                countryElement2 = null;
            }
            List<? extends j1> list = otherFields;
            List<j1> listP0 = v.P0(v.r(simpleTextElement2, countryElement2), list);
            i iVar = b.this.addressType;
            if (iVar instanceof i.ShippingCondensed) {
                if (!((i.ShippingCondensed) b.this.addressType).b(str, b.this.isPlacesAvailable)) {
                    listR = listP0;
                }
            } else if (iVar instanceof i.ShippingExpanded) {
                listR = listP0;
            } else {
                listR = v.P0(v.q(b.this.hideCountry ? null : b.this.getCountryElement()), list);
            }
            return b.this.addressType.getPhoneNumberState() != v0.HIDDEN ? v.Q0(listR, b.this.getPhoneNumberElement()) : listR;
        }
    }

    /* JADX INFO: renamed from: i90.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Li90/j1;", "fieldElements", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlin/Pair;", "Li90/g0;", "Ln90/a;", "a", "(Ljava/util/List;)Lkotlinx/coroutines/flow/StateFlow;"}, k = 3, mv = {1, 9, 0})
    static final class C1606b extends u implements l<List<? extends j1>, StateFlow<? extends List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1606b f76295c = new C1606b();

        /* JADX INFO: renamed from: i90.b$b$a */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Flow<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Flow[] f76296a;

            /* JADX INFO: renamed from: i90.b$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
            static final class C1607a extends u implements wn0.a<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[]> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Flow[] f76297c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1607a(Flow[] flowArr) {
                    super(0);
                    this.f76297c = flowArr;
                }

                @Override // wn0.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] invoke() {
                    return new List[this.f76297c.length];
                }
            }

            /* JADX INFO: renamed from: i90.b$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.stripe.android.uicore.elements.AddressElement$fieldsUpdatedFlow$1$invoke$$inlined$combineAsStateFlow$1$3", f = "AddressElement.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
            public static final class C1608b extends SuspendLambda implements q<FlowCollector<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[], Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f76298n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private /* synthetic */ Object f76299o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                /* synthetic */ Object f76300p;

                public C1608b(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f76298n;
                    if (i11 == 0) {
                        t.b(obj);
                        FlowCollector flowCollector = (FlowCollector) this.f76299o;
                        List listA = v.A(v.m1(n.w1((Object[]) this.f76300p)));
                        this.f76298n = 1;
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
                public final Object invoke(FlowCollector<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> flowCollector, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] listArr, Continuation<? super h0> continuation) {
                    C1608b c1608b = new C1608b(continuation);
                    c1608b.f76299o = flowCollector;
                    c1608b.f76300p = listArr;
                    return c1608b.invokeSuspend(h0.f84049a);
                }
            }

            public a(Flow[] flowArr) {
                this.f76296a = flowArr;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> flowCollector, Continuation continuation) {
                Flow[] flowArr = this.f76296a;
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new C1607a(flowArr), new C1608b(null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: i90.b$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0004\u001a\u00028\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "R", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class C1609b extends u implements wn0.a<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f76301c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1609b(List list) {
                super(0);
                this.f76301c = list;
            }

            @Override // wn0.a
            public final List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>> invoke() {
                List list = this.f76301c;
                ArrayList arrayList = new ArrayList(v.y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((StateFlow) it.next()).getValue());
                }
                return v.A(v.m1(arrayList));
            }
        }

        C1606b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> invoke(List<? extends j1> fieldElements) {
            s.k(fieldElements, "fieldElements");
            List<? extends j1> list = fieldElements;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((j1) it.next()).c());
            }
            return new r90.e(arrayList.isEmpty() ? r90.g.n(v.A(v.m1(v.m()))) : new a((Flow[]) v.m1(arrayList).toArray(new Flow[0])), new C1609b(arrayList));
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", PlaceTypes.COUNTRY, "", "Lkotlin/Pair;", "Li90/g0;", "Ln90/a;", "values", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/util/List;)Ljn0/h0;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements p<String, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SameAsShippingElement f76303d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map<IdentifierSpec, String> f76304e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SameAsShippingElement sameAsShippingElement, Map<IdentifierSpec, String> map) {
            super(2);
            this.f76303d = sameAsShippingElement;
            this.f76304e = map;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke(String str, List<Pair<IdentifierSpec, FormFieldEntry>> values) {
            String str2;
            s.k(values, "values");
            if (str != null) {
                b.this.currentValuesMap.put(IdentifierSpec.INSTANCE.l(), str);
            }
            Map map = b.this.currentValuesMap;
            List<Pair<IdentifierSpec, FormFieldEntry>> list = values;
            LinkedHashMap linkedHashMap = new LinkedHashMap(bo0.n.f(v0.e(v.y(list, 10)), 16));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Pair pair2 = new Pair(pair.e(), ((FormFieldEntry) pair.f()).getValue());
                linkedHashMap.put(pair2.e(), pair2.f());
            }
            map.putAll(linkedHashMap);
            Map map2 = b.this.currentValuesMap;
            Map<IdentifierSpec, String> map3 = this.f76304e;
            boolean z11 = true;
            if (!map2.isEmpty()) {
                for (Map.Entry entry : map2.entrySet()) {
                    if (map3 == null || (str2 = map3.get(entry.getKey())) == null) {
                        str2 = "";
                    }
                    if (!s.f(str2, entry.getValue())) {
                        z11 = false;
                        break;
                    }
                }
            }
            b.this.lastSameAsShipping = Boolean.valueOf(z11);
            SameAsShippingElement sameAsShippingElement = this.f76303d;
            if (sameAsShippingElement == null) {
                return null;
            }
            sameAsShippingElement.g(v0.f(x.a(sameAsShippingElement.getIdentifier(), String.valueOf(z11))));
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Li90/j1;", "fieldElements", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlin/Pair;", "Li90/g0;", "Ln90/a;", "a", "(Ljava/util/List;)Lkotlinx/coroutines/flow/StateFlow;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements l<List<? extends j1>, StateFlow<? extends List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f76305c = new d();

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Flow<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Flow[] f76306a;

            /* JADX INFO: renamed from: i90.b$d$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
            static final class C1610a extends u implements wn0.a<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[]> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Flow[] f76307c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1610a(Flow[] flowArr) {
                    super(0);
                    this.f76307c = flowArr;
                }

                @Override // wn0.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] invoke() {
                    return new List[this.f76307c.length];
                }
            }

            /* JADX INFO: renamed from: i90.b$d$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.stripe.android.uicore.elements.AddressElement$getFormFieldValueFlow$1$invoke$$inlined$combineAsStateFlow$1$3", f = "AddressElement.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
            public static final class C1611b extends SuspendLambda implements q<FlowCollector<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[], Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f76308n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private /* synthetic */ Object f76309o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                /* synthetic */ Object f76310p;

                public C1611b(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f76308n;
                    if (i11 == 0) {
                        t.b(obj);
                        FlowCollector flowCollector = (FlowCollector) this.f76309o;
                        List listA = v.A(v.m1(n.w1((Object[]) this.f76310p)));
                        this.f76308n = 1;
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
                public final Object invoke(FlowCollector<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> flowCollector, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] listArr, Continuation<? super h0> continuation) {
                    C1611b c1611b = new C1611b(continuation);
                    c1611b.f76309o = flowCollector;
                    c1611b.f76310p = listArr;
                    return c1611b.invokeSuspend(h0.f84049a);
                }
            }

            public a(Flow[] flowArr) {
                this.f76306a = flowArr;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> flowCollector, Continuation continuation) {
                Flow[] flowArr = this.f76306a;
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new C1610a(flowArr), new C1611b(null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: i90.b$d$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0004\u001a\u00028\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "R", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class C1612b extends u implements wn0.a<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f76311c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1612b(List list) {
                super(0);
                this.f76311c = list;
            }

            @Override // wn0.a
            public final List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>> invoke() {
                List list = this.f76311c;
                ArrayList arrayList = new ArrayList(v.y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((StateFlow) it.next()).getValue());
                }
                return v.A(v.m1(arrayList));
            }
        }

        d() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> invoke(List<? extends j1> fieldElements) {
            s.k(fieldElements, "fieldElements");
            List<? extends j1> list = fieldElements;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((j1) it.next()).c());
            }
            return new r90.e(arrayList.isEmpty() ? r90.g.n(v.A(v.m1(v.m()))) : new a((Flow[]) v.m1(arrayList).toArray(new Flow[0])), new C1612b(arrayList));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Li90/j1;", "it", "Lkotlinx/coroutines/flow/StateFlow;", "Li90/g0;", "a", "(Ljava/util/List;)Lkotlinx/coroutines/flow/StateFlow;"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements l<List<? extends j1>, StateFlow<? extends List<? extends IdentifierSpec>>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f76312c = new e();

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Flow<List<? extends IdentifierSpec>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Flow[] f76313a;

            /* JADX INFO: renamed from: i90.b$e$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
            static final class C1613a extends u implements wn0.a<List<? extends IdentifierSpec>[]> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Flow[] f76314c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1613a(Flow[] flowArr) {
                    super(0);
                    this.f76314c = flowArr;
                }

                @Override // wn0.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final List<? extends IdentifierSpec>[] invoke() {
                    return new List[this.f76314c.length];
                }
            }

            /* JADX INFO: renamed from: i90.b$e$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.stripe.android.uicore.elements.AddressElement$getTextFieldIdentifiers$1$invoke$$inlined$combineAsStateFlow$1$3", f = "AddressElement.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
            public static final class C1614b extends SuspendLambda implements q<FlowCollector<? super List<? extends IdentifierSpec>>, List<? extends IdentifierSpec>[], Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f76315n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private /* synthetic */ Object f76316o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                /* synthetic */ Object f76317p;

                public C1614b(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f76315n;
                    if (i11 == 0) {
                        t.b(obj);
                        FlowCollector flowCollector = (FlowCollector) this.f76316o;
                        List listA = v.A(v.m1(n.w1((Object[]) this.f76317p)));
                        this.f76315n = 1;
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
                    C1614b c1614b = new C1614b(continuation);
                    c1614b.f76316o = flowCollector;
                    c1614b.f76317p = listArr;
                    return c1614b.invokeSuspend(h0.f84049a);
                }
            }

            public a(Flow[] flowArr) {
                this.f76313a = flowArr;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends IdentifierSpec>> flowCollector, Continuation continuation) {
                Flow[] flowArr = this.f76313a;
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new C1613a(flowArr), new C1614b(null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: i90.b$e$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0004\u001a\u00028\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "R", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class C1615b extends u implements wn0.a<List<? extends IdentifierSpec>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f76318c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1615b(List list) {
                super(0);
                this.f76318c = list;
            }

            @Override // wn0.a
            public final List<? extends IdentifierSpec> invoke() {
                List list = this.f76318c;
                ArrayList arrayList = new ArrayList(v.y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((StateFlow) it.next()).getValue());
                }
                return v.A(v.m1(arrayList));
            }
        }

        e() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StateFlow<List<IdentifierSpec>> invoke(List<? extends j1> it) {
            s.k(it, "it");
            List<? extends j1> list = it;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((j1) it2.next()).e());
            }
            return new r90.e(arrayList.isEmpty() ? r90.g.n(v.A(v.m1(v.m()))) : new a((Flow[]) v.m1(arrayList).toArray(new Flow[0])), new C1615b(arrayList));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "countryCode", "", "Li90/j1;", "a", "(Ljava/lang/String;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements l<String, List<? extends j1>> {
        f() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<j1> invoke(String str) {
            if (str != null) {
                b.this.getPhoneNumberElement().i().getCountryDropdownController().t(str);
            }
            List<j1> listA = b.this.elementsRegistry.a(str);
            if (listA == null) {
                listA = v.m();
            }
            List<j1> list = listA;
            b bVar = b.this;
            for (j1 j1Var : list) {
                p010i90.c.b(j1Var, str, bVar.addressType, bVar.isPlacesAvailable);
                j1Var.g(bVar.rawValuesMap);
            }
            return list;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Li90/j1;", "fields", "", "sameAsShippingValue", "Ljn0/h0;", "a", "(Ljava/util/List;Ljava/lang/Boolean;)Ljn0/h0;"}, k = 3, mv = {1, 9, 0})
    static final class g extends u implements p<List<? extends j1>, Boolean, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Map<IdentifierSpec, String> f76321d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Map<IdentifierSpec, String> map) {
            super(2);
            this.f76321d = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke(List<? extends j1> fields, Boolean bool) {
            String str;
            s.k(fields, "fields");
            if (s.f(bool, b.this.lastSameAsShipping)) {
                bool = null;
            } else {
                b.this.lastSameAsShipping = bool;
            }
            CountryElement countryElement = b.this.getCountryElement();
            if (b.this.hideCountry) {
                countryElement = null;
            }
            List listP0 = v.P0(v.q(countryElement), fields);
            if (bool == null) {
                return null;
            }
            Map linkedHashMap = this.f76321d;
            b bVar = b.this;
            if (!bool.booleanValue()) {
                Map map = bVar.currentValuesMap;
                linkedHashMap = new LinkedHashMap(v0.e(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    if (s.f(entry.getKey(), IdentifierSpec.INSTANCE.l())) {
                        str = (String) entry.getValue();
                    } else {
                        str = (String) bVar.rawValuesMap.get(entry.getKey());
                        if (str == null) {
                            str = "";
                        }
                    }
                    linkedHashMap.put(key, str);
                }
            } else if (linkedHashMap == null) {
                linkedHashMap = v0.i();
            }
            Iterator it = listP0.iterator();
            while (it.hasNext()) {
                ((j1) it.next()).g(linkedHashMap);
            }
            return h0.f84049a;
        }
    }

    public /* synthetic */ b(IdentifierSpec identifierSpec, Map map, i iVar, Set set, y yVar, SameAsShippingElement sameAsShippingElement, Map map2, i0 i0Var, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        Set set2;
        y yVar2;
        Map mapI = (i11 & 2) != 0 ? v0.i() : map;
        i normal = (i11 & 4) != 0 ? new i.Normal(null, 1, null) : iVar;
        Set setD = (i11 & 8) != 0 ? d1.d() : set;
        if ((i11 & 16) != 0) {
            set2 = setD;
            yVar2 = new y(new t(set2, null, false, false, null, null, 62, null), (String) mapI.get(IdentifierSpec.INSTANCE.l()));
        } else {
            set2 = setD;
            yVar2 = yVar;
        }
        this(identifierSpec, mapI, normal, set2, yVar2, sameAsShippingElement, map2, (i11 & 128) != 0 ? new w() : i0Var, (i11 & 256) != 0 ? false : z11);
    }

    @Override // p010i90.j1
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getAllowsUserInteraction() {
        return this.allowsUserInteraction;
    }

    @Override // p010i90.j1
    public StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> c() {
        return r90.g.l(this.fields, d.f76305c);
    }

    @Override // p010i90.j1
    /* JADX INFO: renamed from: d, reason: from getter */
    public x30.c getMandateText() {
        return this.mandateText;
    }

    @Override // p010i90.j1
    public StateFlow<List<IdentifierSpec>> e() {
        return r90.g.l(this.fields, e.f76312c);
    }

    @Override // p010i90.j1
    public void g(Map<IdentifierSpec, String> rawValuesMap) {
        s.k(rawValuesMap, "rawValuesMap");
        this.rawValuesMap = rawValuesMap;
    }

    @Override // p010i90.j1
    public l1 h() {
        return this.controller;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final p010i90.a getController() {
        return this.controller;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final CountryElement getCountryElement() {
        return this.countryElement;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final PhoneNumberElement getPhoneNumberElement() {
        return this.phoneNumberElement;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(IdentifierSpec _identifier, Map<IdentifierSpec, String> rawValuesMap, i addressType, Set<String> countryCodes, y countryDropdownFieldController, SameAsShippingElement sameAsShippingElement, Map<IdentifierSpec, String> map, i0 isPlacesAvailable, boolean z11) {
        c1 c1VarI;
        StateFlow<Boolean> stateFlowV;
        super(_identifier);
        s.k(_identifier, "_identifier");
        s.k(rawValuesMap, "rawValuesMap");
        s.k(addressType, "addressType");
        s.k(countryCodes, "countryCodes");
        s.k(countryDropdownFieldController, "countryDropdownFieldController");
        s.k(isPlacesAvailable, "isPlacesAvailable");
        this.rawValuesMap = rawValuesMap;
        this.addressType = addressType;
        this.isPlacesAvailable = isPlacesAvailable;
        this.hideCountry = z11;
        this.allowsUserInteraction = true;
        IdentifierSpec.Companion companion = IdentifierSpec.INSTANCE;
        CountryElement countryElement = new CountryElement(companion.l(), countryDropdownFieldController);
        this.countryElement = countryElement;
        this.nameElement = new SimpleTextElement(companion.r(), new r1(new q1(Integer.valueOf(o30.e.f96367e), 0, 0, null, 14, null), false, this.rawValuesMap.get(companion.r()), 2, null));
        IdentifierSpec identifierSpecS = companion.s();
        q1 q1Var = new q1(Integer.valueOf(h.f64613a), 0, 0, null, 14, null);
        i.ShippingCondensed shippingCondensed = addressType instanceof i.ShippingCondensed ? (i.ShippingCondensed) addressType : null;
        this.addressAutoCompleteElement = new p010i90.g(identifierSpecS, q1Var, shippingCondensed != null ? shippingCondensed.d() : null);
        IdentifierSpec identifierSpecT = companion.t();
        q0.Companion companion2 = q0.INSTANCE;
        String str = this.rawValuesMap.get(companion.t());
        this.phoneNumberElement = new PhoneNumberElement(identifierSpecT, q0.Companion.b(companion2, str == null ? "" : str, null, null, addressType.getPhoneNumberState() == v0.OPTIONAL, true, 6, null));
        this.currentValuesMap = new LinkedHashMap();
        this.elementsRegistry = new p010i90.e(g90.b.f67651a);
        StateFlow<List<j1>> stateFlowM = r90.g.m(countryElement.i().x(), new f());
        this.otherFields = stateFlowM;
        StateFlow<h0> stateFlowH = r90.g.h(stateFlowM, (sameAsShippingElement == null || (c1VarI = sameAsShippingElement.i()) == null || (stateFlowV = c1VarI.v()) == null) ? r90.g.n(null) : stateFlowV, new g(map));
        this.sameAsShippingUpdatedFlow = stateFlowH;
        StateFlow<h0> stateFlowH2 = r90.g.h(countryElement.i().x(), r90.g.l(stateFlowM, C1606b.f76295c), new c(sameAsShippingElement, map));
        this.fieldsUpdatedFlow = stateFlowH2;
        StateFlow<List<j1>> stateFlowF = r90.g.f(countryElement.i().x(), stateFlowM, stateFlowH, stateFlowH2, new a());
        this.fields = stateFlowF;
        this.controller = new p010i90.a(stateFlowF);
    }
}
