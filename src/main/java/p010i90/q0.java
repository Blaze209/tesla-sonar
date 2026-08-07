package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC4419g;
import java.util.Set;
import jn0.h0;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import n90.FormFieldEntry;
import o4.r;
import o4.z0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.slf4j.Marker;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.text.t;
import p020r2.k2;
import p020r2.o;
import p020r2.w2;
import t30.a;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ^2\u00020\u00012\u00020\u0002:\u0001)BC\b\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJR\u0010'\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00062\b\u0010#\u001a\u0004\u0018\u00010!2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0017ø\u0001\u0000¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u000eR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010-R \u00107\u001a\b\u0012\u0004\u0012\u000202018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0003088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R \u0010>\u001a\b\u0012\u0004\u0012\u00020\u0003018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u00104\u001a\u0004\b=\u00106R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\b088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010:R\u0014\u0010B\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010AR\u0017\u0010H\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020I018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u00104R\u001c\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u00104R \u0010P\u001a\b\u0012\u0004\u0012\u00020\u0003018\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u00104\u001a\u0004\bO\u00106R \u0010R\u001a\b\u0012\u0004\u0012\u00020\b018\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u00104\u001a\u0004\bR\u00106R \u0010T\u001a\b\u0012\u0004\u0012\u00020S018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u00104\u001a\u0004\bQ\u00106R\"\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010U018\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u00104\u001a\u0004\b)\u00106R\u001d\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u0003018\u0006¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\bX\u00106R\u001d\u0010]\u001a\b\u0012\u0004\u0012\u00020Z018\u0006¢\u0006\f\n\u0004\b[\u00104\u001a\u0004\b\\\u00106\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006_"}, d2 = {"Li90/q0;", "Li90/h0;", "Li90/i1;", "", "initialPhoneNumber", "initiallySelectedCountryCode", "", "overrideCountryCodes", "", "showOptionalLabel", "acceptAnyInput", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZ)V", "w", "()Ljava/lang/String;", "phoneNumber", "y", "(Ljava/lang/String;)Ljava/lang/String;", "A", "displayFormatted", "Ljn0/h0;", "D", "(Ljava/lang/String;)V", "rawValue", "t", "newHasFocus", "h", "(Z)V", "enabled", "Li90/j1;", "field", "Landroidx/compose/ui/d;", "modifier", "Li90/g0;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/d;", "nextFocusDirection", "previousFocusDirection", "g", "(ZLi90/j1;Landroidx/compose/ui/d;Ljava/util/Set;Li90/g0;IILr2/l;I)V", "a", "Ljava/lang/String;", "z", "b", "Z", "n", "()Z", "c", "Lkotlinx/coroutines/flow/StateFlow;", "", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/flow/StateFlow;", "getLabel", "()Lkotlinx/coroutines/flow/StateFlow;", AnnotatedPrivateKey.LABEL, "Lkotlinx/coroutines/flow/MutableStateFlow;", "e", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_fieldValue", "f", "p", "fieldValue", "_hasFocus", "Li90/t;", "Li90/t;", "countryConfig", "Li90/y;", IntegerTokenConverter.CONVERTER_KEY, "Li90/y;", "x", "()Li90/y;", "countryDropdownController", "Li90/t0;", "j", "phoneNumberFormatter", "k", "phoneNumberMinimumLength", "l", "getRawFieldValue", "rawFieldValue", "m", "isComplete", "Ln90/a;", "formFieldValue", "Li90/c0;", "o", AnalyticsAttribute.Error, "B", "placeholder", "Lo4/z0;", "q", "C", "visualTransformation", "r", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class q0 implements h0, i1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f76828s = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String initialPhoneNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean showOptionalLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean acceptAnyInput;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Integer> label;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<String> _fieldValue;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> fieldValue;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Boolean> _hasFocus;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t countryConfig;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final y countryDropdownController;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<t0> phoneNumberFormatter;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Integer> phoneNumberMinimumLength;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> rawFieldValue;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> isComplete;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<FormFieldEntry> formFieldValue;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<c0> error;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> placeholder;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<z0> visualTransformation;

    /* JADX INFO: renamed from: i90.q0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Li90/q0$a;", "", "<init>", "()V", "", "initialValue", "initiallySelectedCountryCode", "", "overrideCountryCodes", "", "showOptionalLabel", "acceptAnyInput", "Li90/q0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZ)Li90/q0;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ q0 b(Companion companion, String str, String str2, Set set, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = "";
            }
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                set = d1.d();
            }
            if ((i11 & 8) != 0) {
                z11 = false;
            }
            return companion.a(str, str2, set, z11, (i11 & 16) != 0 ? false : z12);
        }

        public final q0 a(String initialValue, String initiallySelectedCountryCode, Set<String> overrideCountryCodes, boolean showOptionalLabel, boolean acceptAnyInput) {
            s.k(initialValue, "initialValue");
            s.k(overrideCountryCodes, "overrideCountryCodes");
            t0 t0VarC = null;
            boolean zB0 = t.b0(initialValue, Marker.ANY_NON_NULL_MARKER, false, 2, null);
            if (initiallySelectedCountryCode == null && zB0) {
                t0VarC = t0.INSTANCE.d(initialValue);
            } else if (initiallySelectedCountryCode != null) {
                t0VarC = t0.INSTANCE.c(initiallySelectedCountryCode);
            }
            if (t0VarC == null) {
                return new q0(initialValue, initiallySelectedCountryCode, overrideCountryCodes, showOptionalLabel, acceptAnyInput, null);
            }
            String strE = t0VarC.getPrefix();
            return new q0(t.T0(t0VarC.g(t.T0(initialValue, strE)), strE), t0VarC.getCountryCode(), overrideCountryCodes, showOptionalLabel, acceptAnyInput, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f76847d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ j1 f76848e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f76849f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Set<IdentifierSpec> f76850g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ IdentifierSpec f76851h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f76852i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f76853j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f76854k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11, j1 j1Var, androidx.compose.ui.d dVar, Set<IdentifierSpec> set, IdentifierSpec g0Var, int i11, int i12, int i13) {
            super(2);
            this.f76847d = z11;
            this.f76848e = j1Var;
            this.f76849f = dVar;
            this.f76850g = set;
            this.f76851h = g0Var;
            this.f76852i = i11;
            this.f76853j = i12;
            this.f76854k = i13;
        }

        public final void a(p020r2.l lVar, int i11) {
            q0.this.g(this.f76847d, this.f76848e, this.f76849f, this.f76850g, this.f76851h, this.f76852i, this.f76853j, lVar, k2.a(this.f76854k | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt30/a;", PlaceTypes.COUNTRY, "", "a", "(Lt30/a;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.l<a, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f76855c = new c();

        c() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(a country) {
            String str;
            s.k(country, "country");
            String strA = t.INSTANCE.a(country.b().getValue());
            String strG = t0.INSTANCE.g(country.b().getValue());
            if (strG != null) {
                str = "  " + strG + "  ";
            } else {
                str = null;
            }
            return v.y0(v.r(strA, str), "", null, null, 0, null, null, 62, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt30/a;", PlaceTypes.COUNTRY, "", "a", "(Lt30/a;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.l<a, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f76856c = new d();

        d() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(a country) {
            s.k(country, "country");
            return v.y0(v.r(t.INSTANCE.a(country.b().getValue()), country.getName(), t0.INSTANCE.g(country.b().getValue())), " ", null, null, 0, null, null, 62, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "value", "", "complete", "hasFocus", "Li90/c0;", "a", "(Ljava/lang/String;ZZ)Li90/c0;"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements q<String, Boolean, Boolean, c0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f76857c = new e();

        e() {
            super(3);
        }

        public final c0 a(String value, boolean z11, boolean z12) {
            s.k(value, "value");
            if (t.y0(value) || z11 || z12) {
                return null;
            }
            return new c0(f90.h.G, null, 2, null);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ c0 invoke(String str, Boolean bool, Boolean bool2) {
            return a(str, bool.booleanValue(), bool2.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "fieldValue", "", "isComplete", "Ln90/a;", "a", "(Ljava/lang/String;Z)Ln90/a;"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements p<String, Boolean, FormFieldEntry> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f76858c = new f();

        f() {
            super(2);
        }

        public final FormFieldEntry a(String fieldValue, boolean z11) {
            s.k(fieldValue, "fieldValue");
            return new FormFieldEntry(fieldValue, z11);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ FormFieldEntry invoke(String str, Boolean bool) {
            return a(str, bool.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "value", "", "minLength", "", "a", "(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class g extends u implements p<String, Integer, Boolean> {
        g() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String value, Integer num) {
            s.k(value, "value");
            return Boolean.valueOf(value.length() >= (num != null ? num.intValue() : 0) || q0.this.acceptAnyInput);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Li90/t0;", "a", "(I)Li90/t0;"}, k = 3, mv = {1, 9, 0})
    static final class h extends u implements wn0.l<Integer, t0> {
        h() {
            super(1);
        }

        public final t0 a(int i11) {
            return t0.INSTANCE.c(q0.this.countryConfig.g().get(i11).b().getValue());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ t0 invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class i extends u implements wn0.l<Integer, Integer> {
        i() {
            super(1);
        }

        public final Integer a(int i11) {
            return t0.INSTANCE.f(q0.this.countryConfig.g().get(i11).b().getValue());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li90/t0;", "it", "", "a", "(Li90/t0;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class j extends u implements wn0.l<t0, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f76862c = new j();

        j() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(t0 it) {
            s.k(it, "it");
            return it.getPlaceholder();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "value", "Li90/t0;", "formatter", "a", "(Ljava/lang/String;Li90/t0;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class k extends u implements p<String, t0, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f76863c = new k();

        k() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String value, t0 formatter) {
            s.k(value, "value");
            s.k(formatter, "formatter");
            return formatter.g(value);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li90/t0;", "it", "Lo4/z0;", "a", "(Li90/t0;)Lo4/z0;"}, k = 3, mv = {1, 9, 0})
    static final class l extends u implements wn0.l<t0, z0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f76864c = new l();

        l() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z0 invoke(t0 it) {
            s.k(it, "it");
            return it.getVisualTransformation();
        }
    }

    public /* synthetic */ q0(String str, String str2, Set set, boolean z11, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, set, z11, z12);
    }

    public final String A() {
        return t.T0(this._fieldValue.getValue(), this.phoneNumberFormatter.getValue().getPrefix());
    }

    public final StateFlow<String> B() {
        return this.placeholder;
    }

    public final StateFlow<z0> C() {
        return this.visualTransformation;
    }

    public final void D(String displayFormatted) {
        s.k(displayFormatted, "displayFormatted");
        this._fieldValue.setValue(this.phoneNumberFormatter.getValue().h(displayFormatted));
    }

    @Override // p010i90.l1
    public StateFlow<c0> a() {
        return this.error;
    }

    @Override // p010i90.i1
    public void g(boolean z11, j1 field, androidx.compose.ui.d modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec g0Var, int i11, int i12, p020r2.l lVar, int i13) {
        s.k(field, "field");
        s.k(modifier, "modifier");
        s.k(hiddenIdentifiers, "hiddenIdentifiers");
        p020r2.l lVarV = lVar.v(-1468906333);
        if (o.J()) {
            o.S(-1468906333, i13, -1, "com.stripe.android.uicore.elements.PhoneNumberController.ComposeUI (PhoneNumberController.kt:180)");
        }
        s0.d(z11, this, null, null, false, false, null, null, !s.f(g0Var, field.getIdentifier()) ? r.INSTANCE.d() : r.INSTANCE.b(), lVarV, (i13 & 14) | 64, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(z11, field, modifier, hiddenIdentifiers, g0Var, i11, i12, i13));
        }
    }

    public StateFlow<Integer> getLabel() {
        return this.label;
    }

    public final void h(boolean newHasFocus) {
        this._hasFocus.setValue(Boolean.valueOf(newHasFocus));
    }

    @Override // p010i90.h0
    public StateFlow<Boolean> isComplete() {
        return this.isComplete;
    }

    @Override // p010i90.h0
    public StateFlow<FormFieldEntry> m() {
        return this.formFieldValue;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    public StateFlow<String> p() {
        return this.fieldValue;
    }

    @Override // p010i90.h0
    public void t(String rawValue) {
        s.k(rawValue, "rawValue");
        D(rawValue);
    }

    public final String w() {
        return this.phoneNumberFormatter.getValue().getCountryCode();
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final y getCountryDropdownController() {
        return this.countryDropdownController;
    }

    public final String y(String phoneNumber) {
        s.k(phoneNumber, "phoneNumber");
        return this.phoneNumberFormatter.getValue().g(phoneNumber);
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getInitialPhoneNumber() {
        return this.initialPhoneNumber;
    }

    private q0(String str, String str2, Set<String> set, boolean z11, boolean z12) {
        this.initialPhoneNumber = str;
        this.showOptionalLabel = z11;
        this.acceptAnyInput = z12;
        this.label = r90.g.n(Integer.valueOf(o30.e.f96368f));
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow(str);
        this._fieldValue = MutableStateFlow;
        this.fieldValue = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this._hasFocus = MutableStateFlow2;
        t tVar = new t(set, null, true, false, c.f76855c, d.f76856c, 10, null);
        this.countryConfig = tVar;
        y yVar = new y(tVar, str2);
        this.countryDropdownController = yVar;
        StateFlow<t0> stateFlowM = r90.g.m(yVar.y(), new h());
        this.phoneNumberFormatter = stateFlowM;
        StateFlow<Integer> stateFlowM2 = r90.g.m(yVar.y(), new i());
        this.phoneNumberMinimumLength = stateFlowM2;
        this.rawFieldValue = r90.g.h(p(), stateFlowM, k.f76863c);
        this.isComplete = r90.g.h(p(), stateFlowM2, new g());
        this.formFieldValue = r90.g.h(p(), isComplete(), f.f76858c);
        this.error = r90.g.g(p(), isComplete(), MutableStateFlow2, e.f76857c);
        this.placeholder = r90.g.m(stateFlowM, j.f76862c);
        this.visualTransformation = r90.g.m(stateFlowM, l.f76864c);
    }
}
