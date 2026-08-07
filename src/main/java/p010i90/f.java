package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import e3.m;
import java.util.Set;
import jn0.h0;
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
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import r90.g;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018JR\u0010%\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\u0010!\u001a\u0004\u0018\u00010\u001f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0017ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\"\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010<\u001a\u0002088\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;R \u0010?\u001a\u00020=8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u0010:\u001a\u0004\b>\u0010;R\u001a\u0010C\u001a\u00020@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010A\u001a\u0004\b-\u0010BR\u001a\u0010G\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010D\u001a\u0004\bE\u0010FR\"\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010I0H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010Q\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010.\u001a\u0004\bP\u00100R\"\u0010W\u001a\u0004\u0018\u00010R8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\bS\u0010T\u0012\u0004\bV\u0010(\u001a\u0004\bS\u0010UR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\n0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010KR \u0010[\u001a\b\u0012\u0004\u0012\u00020\n018\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u00104\u001a\u0004\bZ\u00106R \u0010]\u001a\b\u0012\u0004\u0012\u00020\n018\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u00104\u001a\u0004\b\\\u00106R \u0010_\u001a\b\u0012\u0004\u0012\u00020\n018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u00104\u001a\u0004\b^\u00106R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020\u000f0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010KR \u0010b\u001a\b\u0012\u0004\u0012\u00020\u000f018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\ba\u00106R \u0010c\u001a\b\u0012\u0004\u0012\u00020\u0012018\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u00104\u001a\u0004\b+\u00106R\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00120H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010KR \u0010f\u001a\b\u0012\u0004\u0012\u00020\u0012018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u00104\u001a\u0004\bO\u00106R\"\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010g018\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u00104\u001a\u0004\b)\u00106R \u0010k\u001a\b\u0012\u0004\u0012\u00020\u0012018\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u00104\u001a\u0004\bk\u00106R \u0010m\u001a\b\u0012\u0004\u0012\u00020l018\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u00104\u001a\u0004\bY\u00106\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006n"}, d2 = {"Li90/f;", "Li90/v1;", "Li90/h0;", "Li90/l1;", "Li90/i1;", "Li90/u1;", "config", "Lkotlin/Function0;", "Ljn0/h0;", "onNavigation", "", "initialValue", "<init>", "(Li90/u1;Lwn0/a;Ljava/lang/String;)V", "displayFormatted", "Li90/x1;", "q", "(Ljava/lang/String;)Li90/x1;", "", "newHasFocus", "h", "(Z)V", "rawValue", "t", "(Ljava/lang/String;)V", "enabled", "Li90/j1;", "field", "Landroidx/compose/ui/d;", "modifier", "", "Li90/g0;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/d;", "nextFocusDirection", "previousFocusDirection", "g", "(ZLi90/j1;Landroidx/compose/ui/d;Ljava/util/Set;Li90/g0;IILr2/l;I)V", "y", "()V", "a", "Li90/u1;", "b", "Lwn0/a;", "c", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "Lkotlinx/coroutines/flow/StateFlow;", "Li90/w1;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/flow/StateFlow;", "f", "()Lkotlinx/coroutines/flow/StateFlow;", "trailingIcon", "Lo4/x;", "e", "I", "()I", "capitalization", "Lo4/y;", "o", "keyboardType", "Lo4/z0;", "Lo4/z0;", "()Lo4/z0;", "visualTransformation", "Z", "n", "()Z", "showOptionalLabel", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", IntegerTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/flow/MutableStateFlow;", "w", "()Lkotlinx/coroutines/flow/MutableStateFlow;", AnnotatedPrivateKey.LABEL, "j", "getDebugLabel", "debugLabel", "Le3/m;", "k", "Le3/m;", "()Le3/m;", "getAutofillType$annotations", "autofillType", "_fieldValue", "m", "p", "fieldValue", "x", "rawFieldValue", "getContentDescription", "contentDescription", "_fieldState", "r", "fieldState", "loading", "s", "_hasFocus", "visibleError", "Li90/c0;", "u", AnalyticsAttribute.Error, "v", "isComplete", "Ln90/a;", "formFieldValue", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f implements v1, h0, l1, i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u1 config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> onNavigation;

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
    private final boolean showOptionalLabel;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Integer> label;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String debugLabel;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final m autofillType;

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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f76509d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ j1 f76510e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f76511f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Set<IdentifierSpec> f76512g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ IdentifierSpec f76513h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f76514i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f76515j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f76516k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, j1 j1Var, androidx.compose.ui.d dVar, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11, int i12, int i13) {
            super(2);
            this.f76509d = z11;
            this.f76510e = j1Var;
            this.f76511f = dVar;
            this.f76512g = set;
            this.f76513h = identifierSpec;
            this.f76514i = i11;
            this.f76515j = i12;
            this.f76516k = i13;
        }

        public final void a(l lVar, int i11) {
            f.this.g(this.f76509d, this.f76510e, this.f76511f, this.f76512g, this.f76513h, this.f76514i, this.f76515j, lVar, k2.a(this.f76516k | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "visibleError", "Li90/c0;", "a", "(Z)Li90/c0;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.l<Boolean, c0> {
        b() {
            super(1);
        }

        public final c0 a(boolean z11) {
            c0 c0VarA = ((x1) f.this._fieldState.getValue()).a();
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
    static final class c extends u implements p<Boolean, String, FormFieldEntry> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f76518c = new c();

        c() {
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
    static final class d extends u implements wn0.l<x1, Boolean> {
        d() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(x1 it) {
            s.k(it, "it");
            return Boolean.valueOf(it.isValid() || (!it.isValid() && f.this.getShowOptionalLabel() && it.b()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements wn0.l<String, String> {
        e() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String it) {
            s.k(it, "it");
            return f.this.config.h(it);
        }
    }

    /* JADX INFO: renamed from: i90.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li90/x1;", "fieldState", "", "hasFocus", "a", "(Li90/x1;Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class C1616f extends u implements p<x1, Boolean, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1616f f76521c = new C1616f();

        C1616f() {
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

    public f(u1 config, wn0.a<h0> aVar, String str) {
        s.k(config, "config");
        this.config = config;
        this.onNavigation = aVar;
        this.initialValue = str;
        String initialValue = getInitialValue();
        if (initialValue != null) {
            t(initialValue);
        }
        this.trailingIcon = config.f();
        this.capitalization = config.getCapitalization();
        this.keyboardType = config.getKeyboard();
        z0 visualTransformation = config.getVisualTransformation();
        this.visualTransformation = visualTransformation == null ? z0.INSTANCE.c() : visualTransformation;
        this.label = StateFlowKt.MutableStateFlow(config.getLabel());
        this.debugLabel = config.getDebugLabel();
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this._fieldValue = MutableStateFlow;
        this.fieldValue = FlowKt.asStateFlow(MutableStateFlow);
        this.rawFieldValue = g.m(MutableStateFlow, new e());
        this.contentDescription = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<x1> MutableStateFlow2 = StateFlowKt.MutableStateFlow(y1.a.f77113c);
        this._fieldState = MutableStateFlow2;
        this.fieldState = FlowKt.asStateFlow(MutableStateFlow2);
        this.loading = config.b();
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this._hasFocus = MutableStateFlow3;
        this.visibleError = g.h(MutableStateFlow2, MutableStateFlow3, C1616f.f76521c);
        this.error = g.m(j(), new b());
        this.isComplete = g.m(MutableStateFlow2, new d());
        this.formFieldValue = g.h(isComplete(), x(), c.f76518c);
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
    public StateFlow<String> d() {
        return v1.a.c(this);
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
    public void g(boolean z11, j1 field, androidx.compose.ui.d modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, int i11, int i12, l lVar, int i13) {
        int i14;
        s.k(field, "field");
        s.k(modifier, "modifier");
        s.k(hiddenIdentifiers, "hiddenIdentifiers");
        l lVarV = lVar.v(-2122817753);
        if (o.J()) {
            i14 = i13;
            o.S(-2122817753, i14, -1, "com.stripe.android.uicore.elements.AddressTextFieldController.ComposeUI (AddressTextFieldController.kt:112)");
        } else {
            i14 = i13;
        }
        h.a(this, null, lVarV, 8, 2);
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(z11, field, modifier, hiddenIdentifiers, identifierSpec, i11, i12, i14));
        }
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
        this._fieldValue.setValue(this.config.j(displayFormatted));
        this._fieldState.setValue(this.config.g(this._fieldValue.getValue()));
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
        q(this.config.a(rawValue));
    }

    @Override // p010i90.v1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow<Integer> getLabel() {
        return this.label;
    }

    public StateFlow<String> x() {
        return this.rawFieldValue;
    }

    public final void y() {
        wn0.a<h0> aVar = this.onNavigation;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public /* synthetic */ f(u1 u1Var, wn0.a aVar, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(u1Var, (i11 & 2) != 0 ? null : aVar, (i11 & 4) != 0 ? null : str);
    }
}
