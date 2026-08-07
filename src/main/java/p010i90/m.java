package p010i90;

import androidx.compose.ui.d;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import f90.h;
import java.util.Set;
import jn0.h0;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B'\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJR\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0017ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u001d\u00100R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070,8F¢\u0006\u0006\u001a\u0004\b2\u00100\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Li90/m;", "Li90/l1;", "Li90/i1;", "Li90/m$b;", "labelResource", "", "debugTag", "", "initialValue", "<init>", "(Li90/m$b;Ljava/lang/String;Z)V", "value", "Ljn0/h0;", "y", "(Z)V", "enabled", "Li90/j1;", "field", "Landroidx/compose/ui/d;", "modifier", "", "Li90/g0;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/d;", "nextFocusDirection", "previousFocusDirection", "g", "(ZLi90/j1;Landroidx/compose/ui/d;Ljava/util/Set;Li90/g0;IILr2/l;I)V", "a", "Li90/m$b;", "w", "()Li90/m$b;", "b", "Ljava/lang/String;", "v", "()Ljava/lang/String;", "c", "Z", "hasBeenEdited", "Lkotlinx/coroutines/flow/MutableStateFlow;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/flow/MutableStateFlow;", "_isChecked", "Lkotlinx/coroutines/flow/StateFlow;", "Li90/c0;", "e", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", AnalyticsAttribute.Error, "x", "isChecked", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class m implements l1, i1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f76690f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b labelResource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String debugTag;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hasBeenEdited;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Boolean> _isChecked;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<c0> error;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f76697d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ j1 f76698e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f76699f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Set<IdentifierSpec> f76700g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ IdentifierSpec f76701h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f76702i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f76703j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f76704k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, j1 j1Var, d dVar, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11, int i12, int i13) {
            super(2);
            this.f76697d = z11;
            this.f76698e = j1Var;
            this.f76699f = dVar;
            this.f76700g = set;
            this.f76701h = identifierSpec;
            this.f76702i = i11;
            this.f76703j = i12;
            this.f76704k = i13;
        }

        public final void a(l lVar, int i11) {
            m.this.g(this.f76697d, this.f76698e, this.f76699f, this.f76700g, this.f76701h, this.f76702i, this.f76703j, lVar, k2.a(this.f76704k | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0004\"\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"Li90/m$b;", "", "", "labelId", "", "args", "<init>", "(I[Ljava/lang/Object;)V", "a", "I", "b", "()I", "[Ljava/lang/Object;", "()[Ljava/lang/Object;", "formatArgs", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int labelId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Object[] formatArgs;

        public b(int i11, Object... args) {
            s.k(args, "args");
            this.labelId = i11;
            this.formatArgs = args;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object[] getFormatArgs() {
            return this.formatArgs;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getLabelId() {
            return this.labelId;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Li90/c0;", "a", "(Z)Li90/c0;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.l<Boolean, c0> {
        c() {
            super(1);
        }

        public final c0 a(boolean z11) {
            if (z11 || !m.this.hasBeenEdited) {
                return null;
            }
            return new c0(h.D, null, 2, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ c0 invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    public m() {
        this(null, null, false, 7, null);
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
        l lVarV = lVar.v(579664739);
        if (o.J()) {
            o.S(579664739, i13, -1, "com.stripe.android.uicore.elements.CheckboxFieldController.ComposeUI (CheckboxFieldController.kt:55)");
        }
        o.a(modifier, this, z11, lVarV, ((i13 >> 6) & 14) | 64 | ((i13 << 6) & 896), 0);
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(z11, field, modifier, hiddenIdentifiers, identifierSpec, i11, i12, i13));
        }
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getDebugTag() {
        return this.debugTag;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final b getLabelResource() {
        return this.labelResource;
    }

    public final StateFlow<Boolean> x() {
        return this._isChecked;
    }

    public final void y(boolean value) {
        if (!this.hasBeenEdited) {
            this.hasBeenEdited = true;
        }
        this._isChecked.setValue(Boolean.valueOf(value));
    }

    public m(b bVar, String debugTag, boolean z11) {
        s.k(debugTag, "debugTag");
        this.labelResource = bVar;
        this.debugTag = debugTag;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(z11));
        this._isChecked = MutableStateFlow;
        this.error = g.m(MutableStateFlow, new c());
    }

    public /* synthetic */ m(b bVar, String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bVar, (i11 & 2) != 0 ? "CHECKBOX_FIELD" : str, (i11 & 4) != 0 ? false : z11);
    }
}
