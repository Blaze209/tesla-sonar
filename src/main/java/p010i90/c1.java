package p010i90;

import androidx.compose.ui.d;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import f90.h;
import java.util.Set;
import jn0.h0;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import n90.FormFieldEntry;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.text.t;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import r90.g;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJR\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0017ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!R \u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!R\"\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010!R\"\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010\u001f\u001a\u0004\b\u001e\u0010!R \u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b2\u0010!R \u00106\u001a\b\u0012\u0004\u0012\u0002030\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010\u001f\u001a\u0004\b5\u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"Li90/c1;", "Li90/h0;", "Li90/i1;", "", "initialValue", "<init>", "(Z)V", "value", "Ljn0/h0;", "w", "", "rawValue", "t", "(Ljava/lang/String;)V", "enabled", "Li90/j1;", "field", "Landroidx/compose/ui/d;", "modifier", "", "Li90/g0;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/d;", "nextFocusDirection", "previousFocusDirection", "g", "(ZLi90/j1;Landroidx/compose/ui/d;Ljava/util/Set;Li90/g0;IILr2/l;I)V", "Lkotlinx/coroutines/flow/StateFlow;", "", "a", "Lkotlinx/coroutines/flow/StateFlow;", "getLabel", "()Lkotlinx/coroutines/flow/StateFlow;", AnnotatedPrivateKey.LABEL, "Lkotlinx/coroutines/flow/MutableStateFlow;", "b", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_value", "c", "v", DateTokenConverter.CONVERTER_KEY, "p", "fieldValue", "e", "u", "rawFieldValue", "Li90/c0;", "f", AnalyticsAttribute.Error, "isComplete", "Ln90/a;", "h", "m", "formFieldValue", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c1 implements h0, i1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f76444i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Integer> label = g.n(Integer.valueOf(h.f64636x));

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Boolean> _value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> value;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> fieldValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> rawFieldValue;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<c0> error;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> isComplete;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<FormFieldEntry> formFieldValue;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f76454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ j1 f76455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f76456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Set<IdentifierSpec> f76457g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ IdentifierSpec f76458h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f76459i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f76460j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f76461k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, j1 j1Var, d dVar, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11, int i12, int i13) {
            super(2);
            this.f76454d = z11;
            this.f76455e = j1Var;
            this.f76456f = dVar;
            this.f76457g = set;
            this.f76458h = identifierSpec;
            this.f76459i = i11;
            this.f76460j = i12;
            this.f76461k = i13;
        }

        public final void a(l lVar, int i11) {
            c1.this.g(this.f76454d, this.f76455e, this.f76456f, this.f76457g, this.f76458h, this.f76459i, this.f76460j, lVar, k2.a(this.f76461k | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Z)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.l<Boolean, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f76462c = new b();

        b() {
            super(1);
        }

        public final String a(boolean z11) {
            return String.valueOf(z11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ String invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Ln90/a;", "a", "(Ljava/lang/String;)Ln90/a;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.l<String, FormFieldEntry> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f76463c = new c();

        c() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FormFieldEntry invoke(String str) {
            return new FormFieldEntry(str, true);
        }
    }

    public c1(boolean z11) {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(z11));
        this._value = MutableStateFlow;
        StateFlow<Boolean> stateFlowAsStateFlow = FlowKt.asStateFlow(MutableStateFlow);
        this.value = stateFlowAsStateFlow;
        this.fieldValue = g.m(stateFlowAsStateFlow, b.f76462c);
        this.rawFieldValue = p();
        this.error = g.n(null);
        this.isComplete = g.n(Boolean.TRUE);
        this.formFieldValue = g.m(u(), c.f76463c);
    }

    @Override // p010i90.l1
    public StateFlow<c0> a() {
        return this.error;
    }

    @Override // p010i90.i1
    public void g(boolean z11, j1 field, d modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, int i11, int i12, l lVar, int i13) {
        int i14;
        s.k(field, "field");
        s.k(modifier, "modifier");
        s.k(hiddenIdentifiers, "hiddenIdentifiers");
        l lVarV = lVar.v(1284799623);
        if (o.J()) {
            i14 = i13;
            o.S(1284799623, i14, -1, "com.stripe.android.uicore.elements.SameAsShippingController.ComposeUI (SameAsShippingController.kt:49)");
        } else {
            i14 = i13;
        }
        e1.a(this, lVarV, 8);
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(z11, field, modifier, hiddenIdentifiers, identifierSpec, i11, i12, i14));
        }
    }

    public StateFlow<Integer> getLabel() {
        return this.label;
    }

    @Override // p010i90.h0
    public StateFlow<FormFieldEntry> m() {
        return this.formFieldValue;
    }

    public StateFlow<String> p() {
        return this.fieldValue;
    }

    @Override // p010i90.h0
    public void t(String rawValue) {
        s.k(rawValue, "rawValue");
        Boolean boolE1 = t.E1(rawValue);
        w(boolE1 != null ? boolE1.booleanValue() : true);
    }

    public StateFlow<String> u() {
        return this.rawFieldValue;
    }

    public final StateFlow<Boolean> v() {
        return this.value;
    }

    public final void w(boolean value) {
        this._value.setValue(Boolean.valueOf(value));
    }
}
