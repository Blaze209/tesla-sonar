package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.List;
import java.util.Set;
import jn0.h0;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import n90.FormFieldEntry;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import r90.g;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JR\u0010\"\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0017ø\u0001\u0000¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u00100\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\n018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\n058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010=\u001a\b\u0012\u0004\u0012\u00020\n058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u00109R \u0010?\u001a\b\u0012\u0004\u0012\u00020\u0006058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u00107\u001a\u0004\b>\u00109R\"\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0006058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u00107\u001a\u0004\bA\u00109R\"\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010C058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u00107\u001a\u0004\b$\u00109R \u0010G\u001a\b\u0012\u0004\u0012\u00020\u0015058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u00107\u001a\u0004\bG\u00109R \u0010K\u001a\b\u0012\u0004\u0012\u00020H058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u00107\u001a\u0004\bJ\u00109R\u0017\u0010N\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bL\u0010-\u001a\u0004\bM\u0010/\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006O"}, d2 = {"Li90/y;", "Li90/h0;", "Li90/l1;", "Li90/i1;", "Li90/x;", "config", "", "initialValue", "<init>", "(Li90/x;Ljava/lang/String;)V", "", "index", "Ljn0/h0;", "C", "(I)V", "z", "(I)Ljava/lang/String;", "B", "rawValue", "t", "(Ljava/lang/String;)V", "", "enabled", "Li90/j1;", "field", "Landroidx/compose/ui/d;", "modifier", "", "Li90/g0;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/d;", "nextFocusDirection", "previousFocusDirection", "g", "(ZLi90/j1;Landroidx/compose/ui/d;Ljava/util/Set;Li90/g0;IILr2/l;I)V", "a", "Li90/x;", "", "b", "Ljava/util/List;", "w", "()Ljava/util/List;", "displayItems", "c", "Z", "v", "()Z", "disableDropdownWithSingleElement", "Lkotlinx/coroutines/flow/MutableStateFlow;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/flow/MutableStateFlow;", "_selectedIndex", "Lkotlinx/coroutines/flow/StateFlow;", "e", "Lkotlinx/coroutines/flow/StateFlow;", "y", "()Lkotlinx/coroutines/flow/StateFlow;", "selectedIndex", "f", "getLabel", AnnotatedPrivateKey.LABEL, "getFieldValue", "fieldValue", "h", "x", "rawFieldValue", "Li90/c0;", IntegerTokenConverter.CONVERTER_KEY, AnalyticsAttribute.Error, "j", "isComplete", "Ln90/a;", "k", "m", "formFieldValue", "l", "A", "tinyMode", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class y implements h0, l1, i1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f77085m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<String> displayItems;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean disableDropdownWithSingleElement;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Integer> _selectedIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Integer> selectedIndex;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Integer> label;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> fieldValue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> rawFieldValue;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<c0> error;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> isComplete;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<FormFieldEntry> formFieldValue;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean tinyMode;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f77099d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ j1 f77100e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f77101f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Set<IdentifierSpec> f77102g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ IdentifierSpec f77103h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f77104i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f77105j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f77106k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, j1 j1Var, androidx.compose.ui.d dVar, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11, int i12, int i13) {
            super(2);
            this.f77099d = z11;
            this.f77100e = j1Var;
            this.f77101f = dVar;
            this.f77102g = set;
            this.f77103h = identifierSpec;
            this.f77104i = i11;
            this.f77105j = i12;
            this.f77106k = i13;
        }

        public final void a(l lVar, int i11) {
            y.this.g(this.f77099d, this.f77100e, this.f77101f, this.f77102g, this.f77103h, this.f77104i, this.f77105j, lVar, k2.a(this.f77106k | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.l<Integer, String> {
        b() {
            super(1);
        }

        public final String a(int i11) {
            return y.this.w().get(i11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "complete", "", "value", "Ln90/a;", "a", "(ZLjava/lang/String;)Ln90/a;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements p<Boolean, String, FormFieldEntry> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f77108c = new c();

        c() {
            super(2);
        }

        public final FormFieldEntry a(boolean z11, String str) {
            return new FormFieldEntry(str, z11);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ FormFieldEntry invoke(Boolean bool, String str) {
            return a(bool.booleanValue(), str);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.l<Integer, String> {
        d() {
            super(1);
        }

        public final String a(int i11) {
            return (String) v.r0(y.this.config.b(), i11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public y(x config, String str) {
        s.k(config, "config");
        this.config = config;
        this.displayItems = config.e();
        this.disableDropdownWithSingleElement = config.d();
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this._selectedIndex = MutableStateFlow;
        this.selectedIndex = MutableStateFlow;
        this.label = StateFlowKt.MutableStateFlow(Integer.valueOf(config.getLabel()));
        this.fieldValue = g.m(MutableStateFlow, new b());
        this.rawFieldValue = g.m(MutableStateFlow, new d());
        this.error = g.n(null);
        this.isComplete = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.formFieldValue = g.h(isComplete(), x(), c.f77108c);
        this.tinyMode = config.getTinyMode();
        if (str != null) {
            t(str);
        }
    }

    private final void C(int index) {
        if (index < this.displayItems.size()) {
            this._selectedIndex.setValue(Integer.valueOf(index));
        }
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final boolean getTinyMode() {
        return this.tinyMode;
    }

    public final void B(int index) {
        C(index);
    }

    @Override // p010i90.l1
    public StateFlow<c0> a() {
        return this.error;
    }

    @Override // p010i90.i1
    public void g(boolean z11, j1 field, androidx.compose.ui.d modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, int i11, int i12, l lVar, int i13) {
        s.k(field, "field");
        s.k(modifier, "modifier");
        s.k(hiddenIdentifiers, "hiddenIdentifiers");
        l lVarV = lVar.v(-186755585);
        if (o.J()) {
            o.S(-186755585, i13, -1, "com.stripe.android.uicore.elements.DropdownFieldController.ComposeUI (DropdownFieldController.kt:78)");
        }
        z.a(this, z11, null, false, lVarV, ((i13 << 3) & 112) | 8, 12);
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(z11, field, modifier, hiddenIdentifiers, identifierSpec, i11, i12, i13));
        }
    }

    public StateFlow<Integer> getLabel() {
        return this.label;
    }

    @Override // p010i90.h0
    public StateFlow<Boolean> isComplete() {
        return this.isComplete;
    }

    @Override // p010i90.h0
    public StateFlow<FormFieldEntry> m() {
        return this.formFieldValue;
    }

    @Override // p010i90.h0
    public void t(String rawValue) {
        s.k(rawValue, "rawValue");
        Integer numValueOf = Integer.valueOf(this.displayItems.indexOf(this.config.a(rawValue)));
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        C(numValueOf != null ? numValueOf.intValue() : 0);
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getDisableDropdownWithSingleElement() {
        return this.disableDropdownWithSingleElement;
    }

    public final List<String> w() {
        return this.displayItems;
    }

    public StateFlow<String> x() {
        return this.rawFieldValue;
    }

    public final StateFlow<Integer> y() {
        return this.selectedIndex;
    }

    public final String z(int index) {
        return this.config.f(index);
    }

    public /* synthetic */ y(x xVar, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(xVar, (i11 & 2) != 0 ? null : str);
    }
}
