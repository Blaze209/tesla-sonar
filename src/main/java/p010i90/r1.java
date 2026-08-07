package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import e3.m;
import java.util.Set;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import n90.FormFieldEntry;
import o4.z0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import r90.g;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010-\u001a\u00020)8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R \u00100\u001a\u00020.8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010+\u001a\u0004\b/\u0010,R\u001a\u00105\u001a\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b\u001e\u00104R\"\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u000107068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010:R\u001a\u0010>\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010\u001f\u001a\u0004\b=\u0010!R\"\u0010F\u001a\u0004\u0018\u00010?8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u0010E\u001a\u0004\bB\u0010CR\"\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\bG\u0010:R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u0007068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00108R \u0010L\u001a\b\u0012\u0004\u0012\u00020\u00070\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010%\u001a\u0004\bK\u0010'R \u0010N\u001a\b\u0012\u0004\u0012\u00020\u00070\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\bM\u0010'R \u0010P\u001a\b\u0012\u0004\u0012\u00020\u00070\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\bO\u0010'R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\f068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u00108R \u0010S\u001a\b\u0012\u0004\u0012\u00020\f0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\bR\u0010'R \u0010T\u001a\b\u0012\u0004\u0012\u00020\u00050\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010%\u001a\u0004\b\u001a\u0010'R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\u0005068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u00108R \u0010W\u001a\b\u0012\u0004\u0012\u00020\u00050\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b@\u0010'R\"\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010%\u001a\u0004\b\u0016\u0010'R \u0010[\u001a\b\u0012\u0004\u0012\u00020\u00050\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010%\u001a\u0004\b[\u0010'R \u0010]\u001a\b\u0012\u0004\u0012\u00020\\0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010%\u001a\u0004\bJ\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Li90/r1;", "Li90/v1;", "Li90/l1;", "Li90/u1;", "textFieldConfig", "", "showOptionalLabel", "", "initialValue", "<init>", "(Li90/u1;ZLjava/lang/String;)V", "displayFormatted", "Li90/x1;", "q", "(Ljava/lang/String;)Li90/x1;", "rawValue", "Ljn0/h0;", "t", "(Ljava/lang/String;)V", "newHasFocus", "h", "(Z)V", "a", "Li90/u1;", "y", "()Li90/u1;", "b", "Z", "n", "()Z", "c", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "Lkotlinx/coroutines/flow/StateFlow;", "Li90/w1;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/flow/StateFlow;", "f", "()Lkotlinx/coroutines/flow/StateFlow;", "trailingIcon", "Lo4/x;", "e", "I", "()I", "capitalization", "Lo4/y;", "o", "keyboardType", "Lo4/z0;", "g", "Lo4/z0;", "()Lo4/z0;", "visualTransformation", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "v", "()Lkotlinx/coroutines/flow/MutableStateFlow;", AnnotatedPrivateKey.LABEL, IntegerTokenConverter.CONVERTER_KEY, "getDebugLabel", "debugLabel", "Le3/m;", "j", "Le3/m;", "k", "()Le3/m;", "getAutofillType$annotations", "()V", "autofillType", "w", "placeHolder", "_fieldValue", "m", "p", "fieldValue", "x", "rawFieldValue", "getContentDescription", "contentDescription", "_fieldState", "r", "fieldState", "loading", "s", "_hasFocus", "visibleError", "Li90/c0;", "u", AnalyticsAttribute.Error, "isComplete", "Ln90/a;", "formFieldValue", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class r1 implements v1, l1 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f76877x = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u1 textFieldConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean showOptionalLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String initialValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<w1> trailingIcon;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int capitalization;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int keyboardType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final z0 visualTransformation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Integer> label;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String debugLabel;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final m autofillType;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<String> placeHolder;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<String> _fieldValue;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> fieldValue;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> rawFieldValue;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> contentDescription;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<x1> _fieldState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<x1> fieldState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> loading;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Boolean> _hasFocus;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> visibleError;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<c0> error;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> isComplete;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<FormFieldEntry> formFieldValue;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "visibleError", "Li90/c0;", "a", "(Z)Li90/c0;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<Boolean, c0> {
        a() {
            super(1);
        }

        public final c0 a(boolean z11) {
            c0 c0VarA = ((x1) r1.this._fieldState.getValue()).a();
            if (c0VarA == null || !z11) {
                return null;
            }
            return c0VarA;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ c0 invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "complete", "", "value", "Ln90/a;", "a", "(ZLjava/lang/String;)Ln90/a;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<Boolean, String, FormFieldEntry> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f76902c = new b();

        b() {
            super(2);
        }

        public final FormFieldEntry a(boolean z11, String value) {
            s.k(value, "value");
            return new FormFieldEntry(value, z11);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ FormFieldEntry invoke(Boolean bool, String str) {
            return a(bool.booleanValue(), str);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li90/x1;", "it", "", "a", "(Li90/x1;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements l<x1, Boolean> {
        c() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(x1 it) {
            s.k(it, "it");
            return Boolean.valueOf(it.isValid() || (!it.isValid() && r1.this.getShowOptionalLabel() && it.b()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements l<String, String> {
        d() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            s.k(it, "it");
            return r1.this.getTextFieldConfig().h(it);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li90/x1;", "fieldState", "", "hasFocus", "a", "(Li90/x1;Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements p<x1, Boolean, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f76905c = new e();

        e() {
            super(2);
        }

        public final Boolean a(x1 fieldState, boolean z11) {
            s.k(fieldState, "fieldState");
            return Boolean.valueOf(fieldState.c(z11));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Boolean invoke(x1 x1Var, Boolean bool) {
            return a(x1Var, bool.booleanValue());
        }
    }

    public r1(u1 textFieldConfig, boolean z11, String str) {
        s.k(textFieldConfig, "textFieldConfig");
        this.textFieldConfig = textFieldConfig;
        this.showOptionalLabel = z11;
        this.initialValue = str;
        this.trailingIcon = textFieldConfig.f();
        this.capitalization = textFieldConfig.getCapitalization();
        this.keyboardType = textFieldConfig.getKeyboard();
        z0 visualTransformation = textFieldConfig.getVisualTransformation();
        this.visualTransformation = visualTransformation == null ? z0.INSTANCE.c() : visualTransformation;
        this.label = StateFlowKt.MutableStateFlow(textFieldConfig.getLabel());
        this.debugLabel = textFieldConfig.getDebugLabel();
        this.autofillType = textFieldConfig instanceof v ? m.CreditCardExpirationDate : textFieldConfig instanceof x0 ? m.PostalCode : textFieldConfig instanceof a0 ? m.EmailAddress : textFieldConfig instanceof j0 ? m.PersonFullName : null;
        this.placeHolder = StateFlowKt.MutableStateFlow(textFieldConfig.d());
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this._fieldValue = MutableStateFlow;
        this.fieldValue = FlowKt.asStateFlow(MutableStateFlow);
        this.rawFieldValue = g.m(MutableStateFlow, new d());
        this.contentDescription = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<x1> MutableStateFlow2 = StateFlowKt.MutableStateFlow(y1.a.f77113c);
        this._fieldState = MutableStateFlow2;
        this.fieldState = FlowKt.asStateFlow(MutableStateFlow2);
        this.loading = textFieldConfig.b();
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this._hasFocus = MutableStateFlow3;
        this.visibleError = g.h(MutableStateFlow2, MutableStateFlow3, e.f76905c);
        this.error = g.m(j(), new a());
        this.isComplete = g.m(MutableStateFlow2, new c());
        this.formFieldValue = g.h(isComplete(), x(), b.f76902c);
        String initialValue = getInitialValue();
        if (initialValue != null) {
            t(initialValue);
        }
    }

    @Override // p010i90.l1
    public StateFlow<c0> a() {
        return this.error;
    }

    @Override // p010i90.v1
    public StateFlow<Boolean> b() {
        return this.loading;
    }

    @Override // p010i90.v1
    /* JADX INFO: renamed from: c, reason: from getter */
    public z0 getVisualTransformation() {
        return this.visualTransformation;
    }

    @Override // p010i90.v1
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getCapitalization() {
        return this.capitalization;
    }

    @Override // p010i90.v1
    public StateFlow<w1> f() {
        return this.trailingIcon;
    }

    @Override // p010i90.v1, p010i90.i1
    public void g(boolean z11, j1 j1Var, androidx.compose.ui.d dVar, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11, int i12, p020r2.l lVar, int i13) {
        v1.a.a(this, z11, j1Var, dVar, set, identifierSpec, i11, i12, lVar, i13);
    }

    @Override // p010i90.v1
    public StateFlow<String> getContentDescription() {
        return this.contentDescription;
    }

    @Override // p010i90.v1
    public void h(boolean newHasFocus) {
        this._hasFocus.setValue(Boolean.valueOf(newHasFocus));
    }

    @Override // p010i90.v1
    public void i(w1.Dropdown.Item item) {
        v1.a.d(this, item);
    }

    @Override // p010i90.h0
    public StateFlow<Boolean> isComplete() {
        return this.isComplete;
    }

    @Override // p010i90.v1
    public StateFlow<Boolean> j() {
        return this.visibleError;
    }

    @Override // p010i90.v1
    /* JADX INFO: renamed from: k, reason: from getter */
    public m getAutofillType() {
        return this.autofillType;
    }

    @Override // p010i90.v1
    /* JADX INFO: renamed from: l, reason: from getter */
    public String getInitialValue() {
        return this.initialValue;
    }

    @Override // p010i90.h0
    public StateFlow<FormFieldEntry> m() {
        return this.formFieldValue;
    }

    @Override // p010i90.v1
    /* JADX INFO: renamed from: n, reason: from getter */
    public boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    @Override // p010i90.v1
    /* JADX INFO: renamed from: o, reason: from getter */
    public int getKeyboardType() {
        return this.keyboardType;
    }

    @Override // p010i90.v1
    public StateFlow<String> p() {
        return this.fieldValue;
    }

    @Override // p010i90.v1
    public x1 q(String displayFormatted) {
        s.k(displayFormatted, "displayFormatted");
        x1 value = this._fieldState.getValue();
        this._fieldValue.setValue(this.textFieldConfig.j(displayFormatted));
        this._fieldState.setValue(this.textFieldConfig.g(this._fieldValue.getValue()));
        if (s.f(this._fieldState.getValue(), value)) {
            return null;
        }
        return this._fieldState.getValue();
    }

    @Override // p010i90.v1
    public StateFlow<x1> r() {
        return this.fieldState;
    }

    @Override // p010i90.v1
    public boolean s() {
        return v1.a.b(this);
    }

    @Override // p010i90.h0
    public void t(String rawValue) {
        s.k(rawValue, "rawValue");
        q(this.textFieldConfig.a(rawValue));
    }

    @Override // p010i90.v1
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow<Integer> getLabel() {
        return this.label;
    }

    @Override // p010i90.v1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow<String> d() {
        return this.placeHolder;
    }

    public StateFlow<String> x() {
        return this.rawFieldValue;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final u1 getTextFieldConfig() {
        return this.textFieldConfig;
    }

    public /* synthetic */ r1(u1 u1Var, boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(u1Var, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : str);
    }
}
