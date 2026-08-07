package kotlin;

import androidx.compose.ui.platform.r2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import i3.f;
import i4.TextStyle;
import i4.d;
import i4.p0;
import jn0.h0;
import k3.q0;
import k3.r3;
import o4.TextFieldValue;
import o4.k;
import o4.r;
import o4.w0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p014n4.q;
import p020r2.i2;
import p020r2.p1;
import p020r2.s3;
import w4.h;
import wn0.l;
import z3.v;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJl\u0010!\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00106\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R$\u0010>\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010D\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\b8\u0010\f\"\u0004\bB\u0010CR1\u0010J\u001a\u00020E2\u0006\u0010?\u001a\u00020E8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b:\u0010A\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010LR\u001c\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010O0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010AR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR+\u0010\\\u001a\u00020X2\u0006\u0010?\u001a\u00020X8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010A\u001a\u0004\b2\u0010Y\"\u0004\bZ\u0010[R+\u0010`\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010A\u001a\u0004\b^\u0010\f\"\u0004\b_\u0010CR+\u0010d\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010A\u001a\u0004\bb\u0010\f\"\u0004\bc\u0010CR+\u0010g\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010A\u001a\u0004\be\u0010\f\"\u0004\bf\u0010CR+\u0010j\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010A\u001a\u0004\bh\u0010\f\"\u0004\bi\u0010CR$\u0010n\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010\fR+\u0010r\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bo\u0010A\u001a\u0004\bp\u0010\f\"\u0004\bq\u0010CR\u0014\u0010u\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010tR\"\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010vR#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0006¢\u0006\f\n\u0004\be\u0010v\u001a\u0004\ba\u0010xR#\u0010z\u001a\u000e\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u00190\u00178\u0006¢\u0006\f\n\u0004\bb\u0010v\u001a\u0004\b]\u0010xR\u0017\u0010~\u001a\u00020{8\u0006¢\u0006\f\n\u0004\b%\u0010|\u001a\u0004\b@\u0010}R*\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0004\bT\u0010i\u001a\u0004\bk\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R6\u0010\u0084\u0001\u001a\u00030\u0082\u00012\u0007\u0010?\u001a\u00030\u0082\u00018F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0004\b\u000b\u0010A\u001a\u0004\bo\u0010\u007f\"\u0006\b\u0083\u0001\u0010\u0081\u0001R6\u0010\u0086\u0001\u001a\u00030\u0082\u00012\u0007\u0010?\u001a\u00030\u0082\u00018F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0004\bp\u0010A\u001a\u0004\b-\u0010\u007f\"\u0006\b\u0085\u0001\u0010\u0081\u0001R-\u0010\u008b\u0001\u001a\u0004\u0018\u00010K2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010K8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bP\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R-\u0010\u008f\u0001\u001a\u0004\u0018\u00010O2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010O8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bR\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0090\u0001"}, d2 = {"Lb2/b0;", "", "Lb2/l0;", "textDelegate", "Lr2/i2;", "recomposeScope", "Landroidx/compose/ui/platform/r2;", "keyboardController", "<init>", "(Lb2/l0;Lr2/i2;Landroidx/compose/ui/platform/r2;)V", "", "x", "()Z", "Li4/d;", "untransformedText", "visualText", "Li4/r0;", "textStyle", "softWrap", "Lw4/d;", "density", "Ln4/q$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Lo4/o0;", "Ljn0/h0;", "onValueChange", "Lb2/z;", "keyboardActions", "Li3/f;", "focusManager", "Lk3/p1;", "selectionBackgroundColor", Gender.NONE, "(Li4/d;Li4/d;Li4/r0;ZLw4/d;Ln4/q$b;Lwn0/l;Lb2/z;Li3/f;J)V", "a", "Lb2/l0;", "v", "()Lb2/l0;", "setTextDelegate", "(Lb2/l0;)V", "b", "Lr2/i2;", "o", "()Lr2/i2;", "c", "Landroidx/compose/ui/platform/r2;", "h", "()Landroidx/compose/ui/platform/r2;", "Lo4/k;", DateTokenConverter.CONVERTER_KEY, "Lo4/k;", "n", "()Lo4/k;", "processor", "Lo4/w0;", "e", "Lo4/w0;", "g", "()Lo4/w0;", "E", "(Lo4/w0;)V", "inputSession", "<set-?>", "f", "Lr2/p1;", "C", "(Z)V", "hasFocus", "Lw4/h;", "k", "()F", "H", "(F)V", "minHeightForSingleLineField", "Lz3/v;", "Lz3/v;", "_layoutCoordinates", "Lr2/p1;", "Lb2/c1;", IntegerTokenConverter.CONVERTER_KEY, "layoutResultState", "j", "Li4/d;", "w", "()Li4/d;", "setUntransformedText", "(Li4/d;)V", "Lb2/n;", "()Lb2/n;", "B", "(Lb2/n;)V", "handleState", "l", "s", "K", "showFloatingToolbar", "m", "u", Gender.MALE, "showSelectionHandleStart", "t", "L", "showSelectionHandleEnd", "r", "J", "showCursorHandle", "p", "Z", "z", "isLayoutResultStale", "q", "y", "D", "isInTouchMode", "Lb2/x;", "Lb2/x;", "keyboardActionRunner", "Lwn0/l;", "onValueChangeOriginal", "()Lwn0/l;", "Lo4/r;", "onImeActionPerformed", "Lk3/r3;", "Lk3/r3;", "()Lk3/r3;", "highlightPaint", "()J", "setSelectionBackgroundColor-8_81llA", "(J)V", "Li4/p0;", "I", "selectionPreviewHighlightRange", "A", "deletionPreviewHighlightRange", "value", "()Lz3/v;", Gender.FEMALE, "(Lz3/v;)V", "layoutCoordinates", "()Lb2/c1;", "G", "(Lb2/c1;)V", "layoutResult", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private l0 textDelegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i2 recomposeScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r2 keyboardController;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k processor = new k();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private w0 inputSession;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p1 hasFocus;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p1 minHeightForSingleLineField;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private v _layoutCoordinates;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final p1<c1> layoutResultState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private d untransformedText;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p1 handleState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p1 showFloatingToolbar;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p1 showSelectionHandleStart;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p1 showSelectionHandleEnd;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final p1 showCursorHandle;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isLayoutResultStale;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p1 isInTouchMode;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final x keyboardActionRunner;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private l<? super TextFieldValue, h0> onValueChangeOriginal;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final l<TextFieldValue, h0> onValueChange;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final l<r, h0> onImeActionPerformed;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final r3 highlightPaint;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private long selectionBackgroundColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final p1 selectionPreviewHighlightRange;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final p1 deletionPreviewHighlightRange;

    @p013kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo4/r;", "imeAction", "Ljn0/h0;", "a", "(I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<r, h0> {
        a() {
            super(1);
        }

        public final void a(int i11) {
            b0.this.keyboardActionRunner.d(i11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(r rVar) {
            a(rVar.getValue());
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo4/o0;", "it", "Ljn0/h0;", "a", "(Lo4/o0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<TextFieldValue, h0> {
        b() {
            super(1);
        }

        public final void a(TextFieldValue textFieldValue) {
            String strH = textFieldValue.h();
            d untransformedText = b0.this.getUntransformedText();
            if (!s.f(strH, untransformedText != null ? untransformedText.getText() : null)) {
                b0.this.B(n.None);
            }
            b0 b0Var = b0.this;
            p0.Companion companion = p0.INSTANCE;
            b0Var.I(companion.a());
            b0.this.A(companion.a());
            b0.this.onValueChangeOriginal.invoke(textFieldValue);
            b0.this.getRecomposeScope().invalidate();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(TextFieldValue textFieldValue) {
            a(textFieldValue);
            return h0.f84049a;
        }
    }

    public b0(l0 l0Var, i2 i2Var, r2 r2Var) {
        this.textDelegate = l0Var;
        this.recomposeScope = i2Var;
        this.keyboardController = r2Var;
        Boolean bool = Boolean.FALSE;
        this.hasFocus = s3.d(bool, null, 2, null);
        this.minHeightForSingleLineField = s3.d(h.d(h.g(0)), null, 2, null);
        this.layoutResultState = s3.d(null, null, 2, null);
        this.handleState = s3.d(n.None, null, 2, null);
        this.showFloatingToolbar = s3.d(bool, null, 2, null);
        this.showSelectionHandleStart = s3.d(bool, null, 2, null);
        this.showSelectionHandleEnd = s3.d(bool, null, 2, null);
        this.showCursorHandle = s3.d(bool, null, 2, null);
        this.isLayoutResultStale = true;
        this.isInTouchMode = s3.d(Boolean.TRUE, null, 2, null);
        this.keyboardActionRunner = new x(r2Var);
        this.onValueChangeOriginal = c.f15367c;
        this.onValueChange = new b();
        this.onImeActionPerformed = new a();
        this.highlightPaint = q0.a();
        this.selectionBackgroundColor = k3.p1.INSTANCE.j();
        p0.Companion companion = p0.INSTANCE;
        this.selectionPreviewHighlightRange = s3.d(p0.b(companion.a()), null, 2, null);
        this.deletionPreviewHighlightRange = s3.d(p0.b(companion.a()), null, 2, null);
    }

    public final void A(long j11) {
        this.deletionPreviewHighlightRange.setValue(p0.b(j11));
    }

    public final void B(n nVar) {
        this.handleState.setValue(nVar);
    }

    public final void C(boolean z11) {
        this.hasFocus.setValue(Boolean.valueOf(z11));
    }

    public final void D(boolean z11) {
        this.isInTouchMode.setValue(Boolean.valueOf(z11));
    }

    public final void E(w0 w0Var) {
        this.inputSession = w0Var;
    }

    public final void F(v vVar) {
        this._layoutCoordinates = vVar;
    }

    public final void G(c1 c1Var) {
        this.layoutResultState.setValue(c1Var);
        this.isLayoutResultStale = false;
    }

    public final void H(float f11) {
        this.minHeightForSingleLineField.setValue(h.d(f11));
    }

    public final void I(long j11) {
        this.selectionPreviewHighlightRange.setValue(p0.b(j11));
    }

    public final void J(boolean z11) {
        this.showCursorHandle.setValue(Boolean.valueOf(z11));
    }

    public final void K(boolean z11) {
        this.showFloatingToolbar.setValue(Boolean.valueOf(z11));
    }

    public final void L(boolean z11) {
        this.showSelectionHandleEnd.setValue(Boolean.valueOf(z11));
    }

    public final void M(boolean z11) {
        this.showSelectionHandleStart.setValue(Boolean.valueOf(z11));
    }

    public final void N(d untransformedText, d visualText, TextStyle textStyle, boolean softWrap, w4.d density, q.b fontFamilyResolver, l<? super TextFieldValue, h0> onValueChange, z keyboardActions, f focusManager, long selectionBackgroundColor) {
        this.onValueChangeOriginal = onValueChange;
        this.selectionBackgroundColor = selectionBackgroundColor;
        x xVar = this.keyboardActionRunner;
        xVar.f(keyboardActions);
        xVar.e(focusManager);
        this.untransformedText = untransformedText;
        l0 l0VarC = m0.c(this.textDelegate, visualText, textStyle, density, fontFamilyResolver, softWrap, 0, 0, 0, p013kotlin.collections.v.m(), 448, null);
        if (this.textDelegate != l0VarC) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = l0VarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c() {
        return ((p0) this.deletionPreviewHighlightRange.getValue()).getPackedValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n d() {
        return (n) this.handleState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final r3 getHighlightPaint() {
        return this.highlightPaint;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final w0 getInputSession() {
        return this.inputSession;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final r2 getKeyboardController() {
        return this.keyboardController;
    }

    public final v i() {
        v vVar = this._layoutCoordinates;
        if (vVar == null || !vVar.b0()) {
            return null;
        }
        return vVar;
    }

    public final c1 j() {
        return this.layoutResultState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float k() {
        return ((h) this.minHeightForSingleLineField.getValue()).getValue();
    }

    public final l<r, h0> l() {
        return this.onImeActionPerformed;
    }

    public final l<TextFieldValue, h0> m() {
        return this.onValueChange;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final k getProcessor() {
        return this.processor;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final i2 getRecomposeScope() {
        return this.recomposeScope;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getSelectionBackgroundColor() {
        return this.selectionBackgroundColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long q() {
        return ((p0) this.selectionPreviewHighlightRange.getValue()).getPackedValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r() {
        return ((Boolean) this.showCursorHandle.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean s() {
        return ((Boolean) this.showFloatingToolbar.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean t() {
        return ((Boolean) this.showSelectionHandleEnd.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean u() {
        return ((Boolean) this.showSelectionHandleStart.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final l0 getTextDelegate() {
        return this.textDelegate;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final d getUntransformedText() {
        return this.untransformedText;
    }

    public final boolean x() {
        return (p0.h(q()) && p0.h(c())) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean y() {
        return ((Boolean) this.isInTouchMode.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final boolean getIsLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    @p013kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo4/o0;", "it", "Ljn0/h0;", "a", "(Lo4/o0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements l<TextFieldValue, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f15367c = new c();

        c() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(TextFieldValue textFieldValue) {
            a(textFieldValue);
            return h0.f84049a;
        }

        public final void a(TextFieldValue textFieldValue) {
        }
    }
}
