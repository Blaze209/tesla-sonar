package kotlin;

import i4.TextLayoutResult;
import i4.TextStyle;
import i4.p0;
import jn0.h0;
import k3.SolidColor;
import k3.h1;
import o4.ImeOptions;
import o4.TextFieldValue;
import o4.z0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.o;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import w4.h;
import w4.i;
import wn0.l;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a×\u0001\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u001a\b\u0002\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001c\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a×\u0001\u0010!\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020 2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u001a\b\u0002\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001c\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b!\u0010\"\"\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010$\"\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010'¨\u0006/²\u0006\f\u0010*\u001a\u00020)8\nX\u008a\u0084\u0002²\u0006\f\u0010+\u001a\u00020)8\nX\u008a\u0084\u0002²\u0006\f\u0010,\u001a\u00020)8\nX\u008a\u0084\u0002²\u0006\u000e\u0010-\u001a\u00020 8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010.\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "value", "Lkotlin/Function1;", "Ljn0/h0;", "onValueChange", "Landroidx/compose/ui/d;", "modifier", "", "enabled", "readOnly", "Li4/r0;", "textStyle", "Lb2/a0;", "keyboardOptions", "Lb2/z;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Lo4/z0;", "visualTransformation", "Li4/m0;", "onTextLayout", "Lu1/l;", "interactionSource", "Lk3/h1;", "cursorBrush", "Lkotlin/Function0;", "decorationBox", "a", "(Ljava/lang/String;Lwn0/l;Landroidx/compose/ui/d;ZZLi4/r0;Lb2/a0;Lb2/z;ZIILo4/z0;Lwn0/l;Lu1/l;Lk3/h1;Lwn0/q;Lr2/l;III)V", "Lo4/o0;", "b", "(Lo4/o0;Lwn0/l;Landroidx/compose/ui/d;ZZLi4/r0;Lb2/a0;Lb2/z;ZIILo4/z0;Lwn0/l;Lu1/l;Lk3/h1;Lwn0/q;Lr2/l;III)V", "Ld2/b;", "Ld2/b;", "DefaultTextFieldDecorator", "Lw4/k;", "J", "MinTouchTargetSizeForHandles", "", "cursorHandleState", "startHandleState", "endHandleState", "textFieldValueState", "lastTextValue", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d2.b f15368a = Function0.f15417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f15369b;

    @p013kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo4/o0;", "it", "Ljn0/h0;", "a", "(Lo4/o0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<TextFieldValue, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f15371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<TextFieldValue, h0> f15372d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(TextFieldValue textFieldValue, l<? super TextFieldValue, h0> lVar) {
            super(1);
            this.f15371c = textFieldValue;
            this.f15372d = lVar;
        }

        public final void a(TextFieldValue textFieldValue) {
            if (s.f(this.f15371c, textFieldValue)) {
                return;
            }
            this.f15372d.invoke(textFieldValue);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(TextFieldValue textFieldValue) {
            a(textFieldValue);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: b2.c$c, reason: collision with other inner class name */
    @p013kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C0281c extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f15373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<TextFieldValue, h0> f15374d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f15375e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f15376f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f15377g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ TextStyle f15378h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ KeyboardOptions f15379i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ z f15380j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f15381k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f15382l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f15383m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ z0 f15384n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ l<TextLayoutResult, h0> f15385o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ u1.l f15386p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ h1 f15387q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ q<p<? super p020r2.l, ? super Integer, h0>, p020r2.l, Integer, h0> f15388r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f15389s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f15390t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f15391u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0281c(TextFieldValue textFieldValue, l<? super TextFieldValue, h0> lVar, androidx.compose.ui.d dVar, boolean z11, boolean z12, TextStyle textStyle, KeyboardOptions keyboardOptions, z zVar, boolean z13, int i11, int i12, z0 z0Var, l<? super TextLayoutResult, h0> lVar2, u1.l lVar3, h1 h1Var, q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar, int i13, int i14, int i15) {
            super(2);
            this.f15373c = textFieldValue;
            this.f15374d = lVar;
            this.f15375e = dVar;
            this.f15376f = z11;
            this.f15377g = z12;
            this.f15378h = textStyle;
            this.f15379i = keyboardOptions;
            this.f15380j = zVar;
            this.f15381k = z13;
            this.f15382l = i11;
            this.f15383m = i12;
            this.f15384n = z0Var;
            this.f15385o = lVar2;
            this.f15386p = lVar3;
            this.f15387q = h1Var;
            this.f15388r = qVar;
            this.f15389s = i13;
            this.f15390t = i14;
            this.f15391u = i15;
        }

        public final void a(p020r2.l lVar, int i11) {
            c.b(this.f15373c, this.f15374d, this.f15375e, this.f15376f, this.f15377g, this.f15378h, this.f15379i, this.f15380j, this.f15381k, this.f15382l, this.f15383m, this.f15384n, this.f15385o, this.f15386p, this.f15387q, this.f15388r, lVar, k2.a(this.f15389s | 1), k2.a(this.f15390t), this.f15391u);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f15393c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p1<TextFieldValue> f15394d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(TextFieldValue textFieldValue, p1<TextFieldValue> p1Var) {
            super(0);
            this.f15393c = textFieldValue;
            this.f15394d = p1Var;
        }

        public final void b() {
            if (p0.g(this.f15393c.getSelection(), c.c(this.f15394d).getSelection()) && s.f(this.f15393c.getComposition(), c.c(this.f15394d).getComposition())) {
                return;
            }
            c.d(this.f15394d, this.f15393c);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo4/o0;", "newTextFieldValueState", "Ljn0/h0;", "a", "(Lo4/o0;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements l<TextFieldValue, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<String, h0> f15395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p1<TextFieldValue> f15396d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p1<String> f15397e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(l<? super String, h0> lVar, p1<TextFieldValue> p1Var, p1<String> p1Var2) {
            super(1);
            this.f15395c = lVar;
            this.f15396d = p1Var;
            this.f15397e = p1Var2;
        }

        public final void a(TextFieldValue textFieldValue) {
            c.d(this.f15396d, textFieldValue);
            boolean zF = s.f(c.e(this.f15397e), textFieldValue.h());
            c.f(this.f15397e, textFieldValue.h());
            if (zF) {
                return;
            }
            this.f15395c.invoke(textFieldValue.h());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(TextFieldValue textFieldValue) {
            a(textFieldValue);
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f15398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<String, h0> f15399d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f15400e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f15401f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f15402g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ TextStyle f15403h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ KeyboardOptions f15404i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ z f15405j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f15406k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f15407l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f15408m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ z0 f15409n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ l<TextLayoutResult, h0> f15410o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ u1.l f15411p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ h1 f15412q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ q<p<? super p020r2.l, ? super Integer, h0>, p020r2.l, Integer, h0> f15413r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f15414s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f15415t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f15416u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(String str, l<? super String, h0> lVar, androidx.compose.ui.d dVar, boolean z11, boolean z12, TextStyle textStyle, KeyboardOptions keyboardOptions, z zVar, boolean z13, int i11, int i12, z0 z0Var, l<? super TextLayoutResult, h0> lVar2, u1.l lVar3, h1 h1Var, q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar, int i13, int i14, int i15) {
            super(2);
            this.f15398c = str;
            this.f15399d = lVar;
            this.f15400e = dVar;
            this.f15401f = z11;
            this.f15402g = z12;
            this.f15403h = textStyle;
            this.f15404i = keyboardOptions;
            this.f15405j = zVar;
            this.f15406k = z13;
            this.f15407l = i11;
            this.f15408m = i12;
            this.f15409n = z0Var;
            this.f15410o = lVar2;
            this.f15411p = lVar3;
            this.f15412q = h1Var;
            this.f15413r = qVar;
            this.f15414s = i13;
            this.f15415t = i14;
            this.f15416u = i15;
        }

        public final void a(p020r2.l lVar, int i11) {
            c.a(this.f15398c, this.f15399d, this.f15400e, this.f15401f, this.f15402g, this.f15403h, this.f15404i, this.f15405j, this.f15406k, this.f15407l, this.f15408m, this.f15409n, this.f15410o, this.f15411p, this.f15412q, this.f15413r, lVar, k2.a(this.f15414s | 1), k2.a(this.f15415t), this.f15416u);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: b2.c$h, reason: from Kotlin metadata */
    @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Ljn0/h0;", "it", "<anonymous>", "(Lwn0/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class Function0 implements d2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Function0 f15417a = new Function0();

        Function0() {
        }
    }

    static {
        float f11 = 40;
        f15369b = i.b(h.g(f11), h.g(f11));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0121  */
    /* JADX WARN: Code duplicated, block: B:103:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x0133  */
    /* JADX WARN: Code duplicated, block: B:109:0x0139  */
    /* JADX WARN: Code duplicated, block: B:110:0x0142  */
    /* JADX WARN: Code duplicated, block: B:112:0x0146  */
    /* JADX WARN: Code duplicated, block: B:114:0x0150  */
    /* JADX WARN: Code duplicated, block: B:115:0x0153  */
    /* JADX WARN: Code duplicated, block: B:117:0x0158  */
    /* JADX WARN: Code duplicated, block: B:120:0x0162  */
    /* JADX WARN: Code duplicated, block: B:122:0x0169  */
    /* JADX WARN: Code duplicated, block: B:124:0x016d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0177  */
    /* JADX WARN: Code duplicated, block: B:127:0x017a  */
    /* JADX WARN: Code duplicated, block: B:129:0x017f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0188  */
    /* JADX WARN: Code duplicated, block: B:133:0x018b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0191  */
    /* JADX WARN: Code duplicated, block: B:137:0x0199  */
    /* JADX WARN: Code duplicated, block: B:138:0x019c  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:148:0x01be  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:153:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:157:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:163:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:167:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:170:0x0201  */
    /* JADX WARN: Code duplicated, block: B:174:0x0212  */
    /* JADX WARN: Code duplicated, block: B:180:0x023f  */
    /* JADX WARN: Code duplicated, block: B:182:0x0248  */
    /* JADX WARN: Code duplicated, block: B:189:0x0276 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x0278  */
    /* JADX WARN: Code duplicated, block: B:192:0x027d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0281  */
    /* JADX WARN: Code duplicated, block: B:196:0x0284  */
    /* JADX WARN: Code duplicated, block: B:198:0x028d  */
    /* JADX WARN: Code duplicated, block: B:200:0x0296  */
    /* JADX WARN: Code duplicated, block: B:201:0x029d  */
    /* JADX WARN: Code duplicated, block: B:203:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:204:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:207:0x02a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:209:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:211:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:213:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:214:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:216:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:217:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:219:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:220:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:222:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:223:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:225:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:226:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:228:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:230:0x030b  */
    /* JADX WARN: Code duplicated, block: B:233:0x0317  */
    /* JADX WARN: Code duplicated, block: B:236:0x032d  */
    /* JADX WARN: Code duplicated, block: B:237:0x0352  */
    /* JADX WARN: Code duplicated, block: B:240:0x0381  */
    /* JADX WARN: Code duplicated, block: B:242:0x0387  */
    /* JADX WARN: Code duplicated, block: B:245:0x039a  */
    /* JADX WARN: Code duplicated, block: B:246:0x039c  */
    /* JADX WARN: Code duplicated, block: B:249:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:251:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:254:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:255:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:258:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:259:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:262:0x03df  */
    /* JADX WARN: Code duplicated, block: B:263:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:266:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:268:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:271:0x043a  */
    /* JADX WARN: Code duplicated, block: B:275:0x0458  */
    /* JADX WARN: Code duplicated, block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:91:0x010a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:94:0x0113  */
    /* JADX WARN: Code duplicated, block: B:98:0x011d  */
    public static final void a(String str, l<? super String, h0> lVar, androidx.compose.ui.d dVar, boolean z11, boolean z12, TextStyle textStyle, KeyboardOptions keyboardOptions, z zVar, boolean z13, int i11, int i12, z0 z0Var, l<? super TextLayoutResult, h0> lVar2, u1.l lVar3, h1 h1Var, q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar, p020r2.l lVar4, int i13, int i14, int i15) {
        int i16;
        androidx.compose.ui.d dVar2;
        int i17;
        boolean z14;
        int i18;
        int i19;
        int i21;
        boolean z15;
        int i22;
        int i23;
        TextStyle textStyleA;
        int i24;
        int i25;
        KeyboardOptions keyboardOptionsA;
        int i26;
        int i27;
        z zVar2;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        z zVarA;
        boolean z16;
        int i49;
        int i51;
        z0 z0VarC;
        l<? super TextLayoutResult, h0> lVar5;
        u1.l lVar6;
        h1 solidColor;
        q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVarA;
        int i52;
        int i53;
        KeyboardOptions keyboardOptions2;
        boolean z17;
        TextStyle textStyle2;
        androidx.compose.ui.d dVar3;
        u1.l lVar7;
        z zVar3;
        h1 h1Var2;
        boolean z18;
        Object objI;
        p020r2.l.Companion companion;
        p1 p1Var;
        TextFieldValue textFieldValueD;
        boolean zN;
        int i54;
        Object objI2;
        boolean z19;
        Object objI3;
        p1 p1Var2;
        int i55;
        int i56;
        boolean z21;
        boolean z22;
        Object objI4;
        p020r2.l lVar8;
        TextStyle textStyle3;
        u1.l lVar9;
        h1 h1Var3;
        boolean z23;
        boolean z24;
        q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar2;
        KeyboardOptions keyboardOptions3;
        boolean z25;
        androidx.compose.ui.d dVar4;
        z0 z0Var2;
        l<? super TextLayoutResult, h0> lVar10;
        z zVar4;
        int i57;
        int i58;
        w2 w2VarX;
        p020r2.l lVarV = lVar4.v(945255183);
        if ((i15 & 1) != 0) {
            i16 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i16 = (lVarV.n(str) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i13 & 48) == 0) {
            i16 |= lVarV.K(lVar) ? 32 : 16;
        }
        int i59 = i15 & 4;
        if (i59 == 0) {
            if ((i13 & KyberEngine.KyberPolyBytes) == 0) {
                dVar2 = dVar;
                i16 |= lVarV.n(dVar2) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    z14 = z11;
                    if (lVarV.p(z14)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 16;
                i21 = PKIFailureInfo.certRevoked;
                if (i19 != 0) {
                    if ((i13 & 24576) == 0) {
                        z15 = z12;
                        if (lVarV.p(z15)) {
                            i22 = 16384;
                        } else {
                            i22 = 8192;
                        }
                        i16 |= i22;
                    }
                    i23 = i15 & 32;
                    if (i23 != 0) {
                        i16 |= 196608;
                        textStyleA = textStyle;
                    } else {
                        textStyleA = textStyle;
                        if ((i13 & 196608) == 0) {
                            if (lVarV.n(textStyleA)) {
                                i24 = 131072;
                            } else {
                                i24 = 65536;
                            }
                            i16 |= i24;
                        }
                    }
                    i25 = i15 & 64;
                    if (i25 != 0) {
                        i16 |= 1572864;
                        keyboardOptionsA = keyboardOptions;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                        if ((i13 & 1572864) == 0) {
                            if (lVarV.n(keyboardOptionsA)) {
                                i26 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i26 = PKIFailureInfo.signerNotTrusted;
                            }
                            i16 |= i26;
                        }
                    }
                    i27 = i15 & 128;
                    if (i27 != 0) {
                        i16 |= 12582912;
                        zVar2 = zVar;
                    } else {
                        zVar2 = zVar;
                        if ((i13 & 12582912) == 0) {
                            if (lVarV.n(zVar2)) {
                                i28 = 8388608;
                            } else {
                                i28 = 4194304;
                            }
                            i16 |= i28;
                        }
                    }
                    i29 = i15 & 256;
                    if (i29 != 0) {
                        i16 |= 100663296;
                    } else if ((i13 & 100663296) == 0) {
                        if (lVarV.p(z13)) {
                            i31 = 67108864;
                        } else {
                            i31 = 33554432;
                        }
                        i16 |= i31;
                    }
                    if ((i13 & 805306368) != 0) {
                        i16 |= ((i15 & 512) == 0 || !lVarV.r(i11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                    }
                    i32 = i15 & 1024;
                    if (i32 != 0) {
                        i33 = i14 | 6;
                    } else if ((i14 & 6) == 0) {
                        if (lVarV.r(i12)) {
                            i34 = 4;
                        } else {
                            i34 = 2;
                        }
                        i33 = i14 | i34;
                    } else {
                        i33 = i14;
                    }
                    i35 = i15 & 2048;
                    if (i35 != 0) {
                        i33 |= 48;
                    } else if ((i14 & 48) != 0) {
                        if (lVarV.n(z0Var)) {
                            i36 = 32;
                        } else {
                            i36 = 16;
                        }
                        i33 |= i36;
                    }
                    i37 = i33;
                    i38 = i15 & 4096;
                    if (i38 != 0) {
                        i39 = i37 | KyberEngine.KyberPolyBytes;
                    } else if ((i14 & KyberEngine.KyberPolyBytes) == 0) {
                        if (lVarV.K(lVar2)) {
                            i41 = 256;
                        } else {
                            i41 = 128;
                        }
                        i39 = i37 | i41;
                    } else {
                        i39 = i37;
                    }
                    i42 = i15 & PKIFailureInfo.certRevoked;
                    if (i42 != 0) {
                        i44 = i39 | 3072;
                    } else {
                        i43 = i39;
                        if ((i14 & 3072) == 0) {
                            i44 = i43 | (lVarV.n(lVar3) ? 2048 : 1024);
                        } else {
                            i44 = i43;
                        }
                    }
                    i45 = i15 & 16384;
                    if (i45 != 0) {
                        i46 = i44;
                        if ((i14 & 24576) == 0) {
                            if (lVarV.n(h1Var)) {
                                i21 = 16384;
                            }
                            i46 |= i21;
                        }
                        i47 = i15 & 32768;
                        if (i47 != 0) {
                            i46 |= 196608;
                        } else if ((i14 & 196608) == 0) {
                            i46 |= lVarV.K(qVar) ? 131072 : 65536;
                        }
                        i48 = i46;
                        if ((i16 & 306783379) != 306783378 && (74899 & i48) == 74898 && lVarV.b()) {
                            lVarV.j();
                            i58 = i11;
                            qVar2 = qVar;
                            lVar8 = lVarV;
                            zVar4 = zVar2;
                            z23 = z14;
                            keyboardOptions3 = keyboardOptionsA;
                            z24 = z15;
                            textStyle3 = textStyleA;
                            dVar4 = dVar2;
                            z25 = z13;
                            i57 = i12;
                            z0Var2 = z0Var;
                            lVar10 = lVar2;
                            lVar9 = lVar3;
                            h1Var3 = h1Var;
                        } else {
                            lVarV.L();
                            if ((i13 & 1) != 0 || lVarV.k()) {
                                if (i59 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i17 != 0) {
                                    z14 = true;
                                }
                                if (i19 != 0) {
                                    z15 = false;
                                }
                                if (i23 != 0) {
                                    textStyleA = TextStyle.INSTANCE.a();
                                }
                                if (i25 != 0) {
                                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                                }
                                if (i27 != 0) {
                                    zVarA = z.INSTANCE.a();
                                } else {
                                    zVarA = zVar2;
                                }
                                if (i29 != 0) {
                                    z16 = false;
                                } else {
                                    z16 = z13;
                                }
                                if ((i15 & 512) != 0) {
                                    if (z16) {
                                        i49 = 1;
                                    } else {
                                        i49 = Integer.MAX_VALUE;
                                    }
                                    i16 &= -1879048193;
                                } else {
                                    i49 = i11;
                                }
                                if (i32 != 0) {
                                    i51 = 1;
                                } else {
                                    i51 = i12;
                                }
                                if (i35 != 0) {
                                    z0VarC = z0.INSTANCE.c();
                                } else {
                                    z0VarC = z0Var;
                                }
                                if (i38 != 0) {
                                    lVar5 = d.f15392c;
                                } else {
                                    lVar5 = lVar2;
                                }
                                if (i42 != 0) {
                                    lVar6 = null;
                                } else {
                                    lVar6 = lVar3;
                                }
                                if (i45 != 0) {
                                    solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                                } else {
                                    solidColor = h1Var;
                                }
                                if (i47 != 0) {
                                    qVarA = kotlin.f.f15524a.a();
                                } else {
                                    qVarA = qVar;
                                }
                                i52 = i49;
                                i53 = i51;
                                keyboardOptions2 = keyboardOptionsA;
                                z17 = z15;
                                textStyle2 = textStyleA;
                                dVar3 = dVar2;
                                lVar7 = lVar6;
                                zVar3 = zVarA;
                                h1Var2 = solidColor;
                                z18 = z16;
                            } else {
                                lVarV.j();
                                if ((i15 & 512) != 0) {
                                    i16 &= -1879048193;
                                }
                                zVar3 = zVar2;
                                textStyle2 = textStyleA;
                                z18 = z13;
                                i52 = i11;
                                i53 = i12;
                                z0VarC = z0Var;
                                lVar5 = lVar2;
                                qVarA = qVar;
                                keyboardOptions2 = keyboardOptionsA;
                                z17 = z15;
                                dVar3 = dVar2;
                                lVar7 = lVar3;
                                h1Var2 = h1Var;
                            }
                            lVarV.C();
                            if (o.J()) {
                                o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                            }
                            objI = lVarV.I();
                            companion = p020r2.l.INSTANCE;
                            if (objI == companion.a()) {
                                p1 p1VarD = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                                lVarV.B(p1VarD);
                                objI = p1VarD;
                            }
                            p1Var = (p1) objI;
                            textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                            zN = lVarV.n(textFieldValueD);
                            i54 = i53;
                            objI2 = lVarV.I();
                            androidx.compose.ui.d dVar5 = dVar3;
                            if (zN || objI2 == companion.a()) {
                                objI2 = new e(textFieldValueD, p1Var);
                                lVarV.B(objI2);
                            }
                            p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                            if ((i16 & 14) == 4) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            objI3 = lVarV.I();
                            if (z19 || objI3 == companion.a()) {
                                objI3 = s3.d(str, null, 2, null);
                                lVarV.B(objI3);
                            }
                            p1Var2 = (p1) objI3;
                            ImeOptions imeOptionsG = keyboardOptions2.g(z18);
                            boolean z26 = !z18;
                            boolean z27 = z14;
                            l<? super TextLayoutResult, h0> lVar11 = lVar5;
                            if (z18) {
                                i55 = 1;
                            } else {
                                i55 = i54;
                            }
                            if (z18) {
                                i56 = 1;
                            } else {
                                i56 = i52;
                            }
                            boolean zN2 = lVarV.n(p1Var2);
                            KeyboardOptions keyboardOptions4 = keyboardOptions2;
                            if ((i16 & 112) == 32) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            z22 = zN2 | z21;
                            objI4 = lVarV.I();
                            if (z22 || objI4 == companion.a()) {
                                objI4 = new f(lVar, p1Var, p1Var2);
                                lVarV.B(objI4);
                            }
                            int i61 = i48 << 9;
                            lVar8 = lVarV;
                            j.a(textFieldValueD, (l) objI4, dVar5, textStyle2, z0VarC, lVar11, lVar7, h1Var2, z26, i56, i55, imeOptionsG, zVar3, z27, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i61) | (458752 & i61) | (3670016 & i61) | (i61 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                            if (o.J()) {
                                o.R();
                            }
                            textStyle3 = textStyle2;
                            lVar9 = lVar7;
                            h1Var3 = h1Var2;
                            z23 = z27;
                            z24 = z17;
                            qVar2 = qVarA;
                            keyboardOptions3 = keyboardOptions4;
                            z25 = z18;
                            dVar4 = dVar5;
                            z0Var2 = z0VarC;
                            lVar10 = lVar11;
                            zVar4 = zVar3;
                            i57 = i54;
                            i58 = i52;
                        }
                        w2VarX = lVar8.x();
                        if (w2VarX != null) {
                            w2VarX.a(new g(str, lVar, dVar4, z23, z24, textStyle3, keyboardOptions3, zVar4, z25, i58, i57, z0Var2, lVar10, lVar9, h1Var3, qVar2, i13, i14, i15));
                        }
                    }
                    i46 = i44 | 24576;
                    i47 = i15 & 32768;
                    if (i47 != 0) {
                        i46 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        i46 |= lVarV.K(qVar) ? 131072 : 65536;
                    }
                    i48 = i46;
                    if ((i16 & 306783379) != 306783378) {
                        lVarV.L();
                        if ((i13 & 1) != 0) {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = d.f15392c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                qVarA = kotlin.f.f15524a.a();
                            } else {
                                qVarA = qVar;
                            }
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            z17 = z15;
                            textStyle2 = textStyleA;
                            dVar3 = dVar2;
                            lVar7 = lVar6;
                            zVar3 = zVarA;
                            h1Var2 = solidColor;
                            z18 = z16;
                        } else {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = d.f15392c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                qVarA = kotlin.f.f15524a.a();
                            } else {
                                qVarA = qVar;
                            }
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            z17 = z15;
                            textStyle2 = textStyleA;
                            dVar3 = dVar2;
                            lVar7 = lVar6;
                            zVar3 = zVarA;
                            h1Var2 = solidColor;
                            z18 = z16;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                        }
                        objI = lVarV.I();
                        companion = p020r2.l.INSTANCE;
                        if (objI == companion.a()) {
                            p1 p1VarD2 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                            lVarV.B(p1VarD2);
                            objI = p1VarD2;
                        }
                        p1Var = (p1) objI;
                        textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                        zN = lVarV.n(textFieldValueD);
                        i54 = i53;
                        objI2 = lVarV.I();
                        androidx.compose.ui.d dVar6 = dVar3;
                        if (zN) {
                            objI2 = new e(textFieldValueD, p1Var);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new e(textFieldValueD, p1Var);
                            lVarV.B(objI2);
                        }
                        p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                        if ((i16 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objI3 = lVarV.I();
                        if (z19) {
                            objI3 = s3.d(str, null, 2, null);
                            lVarV.B(objI3);
                        } else {
                            objI3 = s3.d(str, null, 2, null);
                            lVarV.B(objI3);
                        }
                        p1Var2 = (p1) objI3;
                        ImeOptions imeOptionsG2 = keyboardOptions2.g(z18);
                        boolean z28 = !z18;
                        boolean z29 = z14;
                        l<? super TextLayoutResult, h0> lVar12 = lVar5;
                        if (z18) {
                            i55 = 1;
                        } else {
                            i55 = i54;
                        }
                        if (z18) {
                            i56 = 1;
                        } else {
                            i56 = i52;
                        }
                        boolean zN3 = lVarV.n(p1Var2);
                        KeyboardOptions keyboardOptions5 = keyboardOptions2;
                        if ((i16 & 112) == 32) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        z22 = zN3 | z21;
                        objI4 = lVarV.I();
                        if (z22) {
                            objI4 = new f(lVar, p1Var, p1Var2);
                            lVarV.B(objI4);
                        } else {
                            objI4 = new f(lVar, p1Var, p1Var2);
                            lVarV.B(objI4);
                        }
                        int i62 = i48 << 9;
                        lVar8 = lVarV;
                        j.a(textFieldValueD, (l) objI4, dVar6, textStyle2, z0VarC, lVar12, lVar7, h1Var2, z28, i56, i55, imeOptionsG2, zVar3, z29, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i62) | (458752 & i62) | (3670016 & i62) | (i62 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                        if (o.J()) {
                            o.R();
                        }
                        textStyle3 = textStyle2;
                        lVar9 = lVar7;
                        h1Var3 = h1Var2;
                        z23 = z29;
                        z24 = z17;
                        qVar2 = qVarA;
                        keyboardOptions3 = keyboardOptions5;
                        z25 = z18;
                        dVar4 = dVar6;
                        z0Var2 = z0VarC;
                        lVar10 = lVar12;
                        zVar4 = zVar3;
                        i57 = i54;
                        i58 = i52;
                    } else {
                        lVarV.L();
                        if ((i13 & 1) != 0) {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = d.f15392c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                qVarA = kotlin.f.f15524a.a();
                            } else {
                                qVarA = qVar;
                            }
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            z17 = z15;
                            textStyle2 = textStyleA;
                            dVar3 = dVar2;
                            lVar7 = lVar6;
                            zVar3 = zVarA;
                            h1Var2 = solidColor;
                            z18 = z16;
                        } else {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = d.f15392c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                qVarA = kotlin.f.f15524a.a();
                            } else {
                                qVarA = qVar;
                            }
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            z17 = z15;
                            textStyle2 = textStyleA;
                            dVar3 = dVar2;
                            lVar7 = lVar6;
                            zVar3 = zVarA;
                            h1Var2 = solidColor;
                            z18 = z16;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                        }
                        objI = lVarV.I();
                        companion = p020r2.l.INSTANCE;
                        if (objI == companion.a()) {
                            p1 p1VarD3 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                            lVarV.B(p1VarD3);
                            objI = p1VarD3;
                        }
                        p1Var = (p1) objI;
                        textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                        zN = lVarV.n(textFieldValueD);
                        i54 = i53;
                        objI2 = lVarV.I();
                        androidx.compose.ui.d dVar7 = dVar3;
                        if (zN) {
                            objI2 = new e(textFieldValueD, p1Var);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new e(textFieldValueD, p1Var);
                            lVarV.B(objI2);
                        }
                        p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                        if ((i16 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objI3 = lVarV.I();
                        if (z19) {
                            objI3 = s3.d(str, null, 2, null);
                            lVarV.B(objI3);
                        } else {
                            objI3 = s3.d(str, null, 2, null);
                            lVarV.B(objI3);
                        }
                        p1Var2 = (p1) objI3;
                        ImeOptions imeOptionsG3 = keyboardOptions2.g(z18);
                        boolean z210 = !z18;
                        boolean z211 = z14;
                        l<? super TextLayoutResult, h0> lVar13 = lVar5;
                        if (z18) {
                            i55 = 1;
                        } else {
                            i55 = i54;
                        }
                        if (z18) {
                            i56 = 1;
                        } else {
                            i56 = i52;
                        }
                        boolean zN4 = lVarV.n(p1Var2);
                        KeyboardOptions keyboardOptions6 = keyboardOptions2;
                        if ((i16 & 112) == 32) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        z22 = zN4 | z21;
                        objI4 = lVarV.I();
                        if (z22) {
                            objI4 = new f(lVar, p1Var, p1Var2);
                            lVarV.B(objI4);
                        } else {
                            objI4 = new f(lVar, p1Var, p1Var2);
                            lVarV.B(objI4);
                        }
                        int i63 = i48 << 9;
                        lVar8 = lVarV;
                        j.a(textFieldValueD, (l) objI4, dVar7, textStyle2, z0VarC, lVar13, lVar7, h1Var2, z210, i56, i55, imeOptionsG3, zVar3, z211, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i63) | (458752 & i63) | (3670016 & i63) | (i63 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                        if (o.J()) {
                            o.R();
                        }
                        textStyle3 = textStyle2;
                        lVar9 = lVar7;
                        h1Var3 = h1Var2;
                        z23 = z211;
                        z24 = z17;
                        qVar2 = qVarA;
                        keyboardOptions3 = keyboardOptions6;
                        z25 = z18;
                        dVar4 = dVar7;
                        z0Var2 = z0VarC;
                        lVar10 = lVar13;
                        zVar4 = zVar3;
                        i57 = i54;
                        i58 = i52;
                    }
                    w2VarX = lVar8.x();
                    if (w2VarX != null) {
                        w2VarX.a(new g(str, lVar, dVar4, z23, z24, textStyle3, keyboardOptions3, zVar4, z25, i58, i57, z0Var2, lVar10, lVar9, h1Var3, qVar2, i13, i14, i15));
                    }
                }
                i16 |= 24576;
                z15 = z12;
                i23 = i15 & 32;
                if (i23 != 0) {
                    i16 |= 196608;
                    textStyleA = textStyle;
                } else {
                    textStyleA = textStyle;
                    if ((i13 & 196608) == 0) {
                        if (lVarV.n(textStyleA)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i16 |= i24;
                    }
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 1572864;
                    keyboardOptionsA = keyboardOptions;
                } else {
                    keyboardOptionsA = keyboardOptions;
                    if ((i13 & 1572864) == 0) {
                        if (lVarV.n(keyboardOptionsA)) {
                            i26 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i26 = PKIFailureInfo.signerNotTrusted;
                        }
                        i16 |= i26;
                    }
                }
                i27 = i15 & 128;
                if (i27 != 0) {
                    i16 |= 12582912;
                    zVar2 = zVar;
                } else {
                    zVar2 = zVar;
                    if ((i13 & 12582912) == 0) {
                        if (lVarV.n(zVar2)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i16 |= i28;
                    }
                }
                i29 = i15 & 256;
                if (i29 != 0) {
                    i16 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (lVarV.p(z13)) {
                        i31 = 67108864;
                    } else {
                        i31 = 33554432;
                    }
                    i16 |= i31;
                }
                if ((i13 & 805306368) != 0) {
                    i16 |= ((i15 & 512) == 0 || !lVarV.r(i11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                i32 = i15 & 1024;
                if (i32 != 0) {
                    i33 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (lVarV.r(i12)) {
                        i34 = 4;
                    } else {
                        i34 = 2;
                    }
                    i33 = i14 | i34;
                } else {
                    i33 = i14;
                }
                i35 = i15 & 2048;
                if (i35 != 0) {
                    i33 |= 48;
                } else if ((i14 & 48) != 0) {
                    if (lVarV.n(z0Var)) {
                        i36 = 32;
                    } else {
                        i36 = 16;
                    }
                    i33 |= i36;
                }
                i37 = i33;
                i38 = i15 & 4096;
                if (i38 != 0) {
                    i39 = i37 | KyberEngine.KyberPolyBytes;
                } else if ((i14 & KyberEngine.KyberPolyBytes) == 0) {
                    if (lVarV.K(lVar2)) {
                        i41 = 256;
                    } else {
                        i41 = 128;
                    }
                    i39 = i37 | i41;
                } else {
                    i39 = i37;
                }
                i42 = i15 & PKIFailureInfo.certRevoked;
                if (i42 != 0) {
                    i44 = i39 | 3072;
                } else {
                    i43 = i39;
                    if ((i14 & 3072) == 0) {
                        i44 = i43 | (lVarV.n(lVar3) ? 2048 : 1024);
                    } else {
                        i44 = i43;
                    }
                }
                i45 = i15 & 16384;
                if (i45 != 0) {
                    i46 = i44;
                    if ((i14 & 24576) == 0) {
                        if (lVarV.n(h1Var)) {
                            i21 = 16384;
                        }
                        i46 |= i21;
                    }
                    i47 = i15 & 32768;
                    if (i47 != 0) {
                        i46 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        i46 |= lVarV.K(qVar) ? 131072 : 65536;
                    }
                    i48 = i46;
                    if ((i16 & 306783379) != 306783378) {
                        lVarV.L();
                        if ((i13 & 1) != 0) {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = d.f15392c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                qVarA = kotlin.f.f15524a.a();
                            } else {
                                qVarA = qVar;
                            }
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            z17 = z15;
                            textStyle2 = textStyleA;
                            dVar3 = dVar2;
                            lVar7 = lVar6;
                            zVar3 = zVarA;
                            h1Var2 = solidColor;
                            z18 = z16;
                        } else {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = d.f15392c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                qVarA = kotlin.f.f15524a.a();
                            } else {
                                qVarA = qVar;
                            }
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            z17 = z15;
                            textStyle2 = textStyleA;
                            dVar3 = dVar2;
                            lVar7 = lVar6;
                            zVar3 = zVarA;
                            h1Var2 = solidColor;
                            z18 = z16;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                        }
                        objI = lVarV.I();
                        companion = p020r2.l.INSTANCE;
                        if (objI == companion.a()) {
                            p1 p1VarD4 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                            lVarV.B(p1VarD4);
                            objI = p1VarD4;
                        }
                        p1Var = (p1) objI;
                        textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                        zN = lVarV.n(textFieldValueD);
                        i54 = i53;
                        objI2 = lVarV.I();
                        androidx.compose.ui.d dVar8 = dVar3;
                        if (zN) {
                            objI2 = new e(textFieldValueD, p1Var);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new e(textFieldValueD, p1Var);
                            lVarV.B(objI2);
                        }
                        p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                        if ((i16 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objI3 = lVarV.I();
                        if (z19) {
                            objI3 = s3.d(str, null, 2, null);
                            lVarV.B(objI3);
                        } else {
                            objI3 = s3.d(str, null, 2, null);
                            lVarV.B(objI3);
                        }
                        p1Var2 = (p1) objI3;
                        ImeOptions imeOptionsG4 = keyboardOptions2.g(z18);
                        boolean z212 = !z18;
                        boolean z213 = z14;
                        l<? super TextLayoutResult, h0> lVar14 = lVar5;
                        if (z18) {
                            i55 = 1;
                        } else {
                            i55 = i54;
                        }
                        if (z18) {
                            i56 = 1;
                        } else {
                            i56 = i52;
                        }
                        boolean zN5 = lVarV.n(p1Var2);
                        KeyboardOptions keyboardOptions7 = keyboardOptions2;
                        if ((i16 & 112) == 32) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        z22 = zN5 | z21;
                        objI4 = lVarV.I();
                        if (z22) {
                            objI4 = new f(lVar, p1Var, p1Var2);
                            lVarV.B(objI4);
                        } else {
                            objI4 = new f(lVar, p1Var, p1Var2);
                            lVarV.B(objI4);
                        }
                        int i64 = i48 << 9;
                        lVar8 = lVarV;
                        j.a(textFieldValueD, (l) objI4, dVar8, textStyle2, z0VarC, lVar14, lVar7, h1Var2, z212, i56, i55, imeOptionsG4, zVar3, z213, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i64) | (458752 & i64) | (3670016 & i64) | (i64 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                        if (o.J()) {
                            o.R();
                        }
                        textStyle3 = textStyle2;
                        lVar9 = lVar7;
                        h1Var3 = h1Var2;
                        z23 = z213;
                        z24 = z17;
                        qVar2 = qVarA;
                        keyboardOptions3 = keyboardOptions7;
                        z25 = z18;
                        dVar4 = dVar8;
                        z0Var2 = z0VarC;
                        lVar10 = lVar14;
                        zVar4 = zVar3;
                        i57 = i54;
                        i58 = i52;
                    } else {
                        lVarV.L();
                        if ((i13 & 1) != 0) {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = d.f15392c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                qVarA = kotlin.f.f15524a.a();
                            } else {
                                qVarA = qVar;
                            }
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            z17 = z15;
                            textStyle2 = textStyleA;
                            dVar3 = dVar2;
                            lVar7 = lVar6;
                            zVar3 = zVarA;
                            h1Var2 = solidColor;
                            z18 = z16;
                        } else {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = d.f15392c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                qVarA = kotlin.f.f15524a.a();
                            } else {
                                qVarA = qVar;
                            }
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            z17 = z15;
                            textStyle2 = textStyleA;
                            dVar3 = dVar2;
                            lVar7 = lVar6;
                            zVar3 = zVarA;
                            h1Var2 = solidColor;
                            z18 = z16;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                        }
                        objI = lVarV.I();
                        companion = p020r2.l.INSTANCE;
                        if (objI == companion.a()) {
                            p1 p1VarD5 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                            lVarV.B(p1VarD5);
                            objI = p1VarD5;
                        }
                        p1Var = (p1) objI;
                        textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                        zN = lVarV.n(textFieldValueD);
                        i54 = i53;
                        objI2 = lVarV.I();
                        androidx.compose.ui.d dVar9 = dVar3;
                        if (zN) {
                            objI2 = new e(textFieldValueD, p1Var);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new e(textFieldValueD, p1Var);
                            lVarV.B(objI2);
                        }
                        p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                        if ((i16 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objI3 = lVarV.I();
                        if (z19) {
                            objI3 = s3.d(str, null, 2, null);
                            lVarV.B(objI3);
                        } else {
                            objI3 = s3.d(str, null, 2, null);
                            lVarV.B(objI3);
                        }
                        p1Var2 = (p1) objI3;
                        ImeOptions imeOptionsG5 = keyboardOptions2.g(z18);
                        boolean z214 = !z18;
                        boolean z215 = z14;
                        l<? super TextLayoutResult, h0> lVar15 = lVar5;
                        if (z18) {
                            i55 = 1;
                        } else {
                            i55 = i54;
                        }
                        if (z18) {
                            i56 = 1;
                        } else {
                            i56 = i52;
                        }
                        boolean zN6 = lVarV.n(p1Var2);
                        KeyboardOptions keyboardOptions8 = keyboardOptions2;
                        if ((i16 & 112) == 32) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        z22 = zN6 | z21;
                        objI4 = lVarV.I();
                        if (z22) {
                            objI4 = new f(lVar, p1Var, p1Var2);
                            lVarV.B(objI4);
                        } else {
                            objI4 = new f(lVar, p1Var, p1Var2);
                            lVarV.B(objI4);
                        }
                        int i65 = i48 << 9;
                        lVar8 = lVarV;
                        j.a(textFieldValueD, (l) objI4, dVar9, textStyle2, z0VarC, lVar15, lVar7, h1Var2, z214, i56, i55, imeOptionsG5, zVar3, z215, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i65) | (458752 & i65) | (3670016 & i65) | (i65 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                        if (o.J()) {
                            o.R();
                        }
                        textStyle3 = textStyle2;
                        lVar9 = lVar7;
                        h1Var3 = h1Var2;
                        z23 = z215;
                        z24 = z17;
                        qVar2 = qVarA;
                        keyboardOptions3 = keyboardOptions8;
                        z25 = z18;
                        dVar4 = dVar9;
                        z0Var2 = z0VarC;
                        lVar10 = lVar15;
                        zVar4 = zVar3;
                        i57 = i54;
                        i58 = i52;
                    }
                    w2VarX = lVar8.x();
                    if (w2VarX != null) {
                        w2VarX.a(new g(str, lVar, dVar4, z23, z24, textStyle3, keyboardOptions3, zVar4, z25, i58, i57, z0Var2, lVar10, lVar9, h1Var3, qVar2, i13, i14, i15));
                    }
                }
                i46 = i44 | 24576;
                i47 = i15 & 32768;
                if (i47 != 0) {
                    i46 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i46 |= lVarV.K(qVar) ? 131072 : 65536;
                }
                i48 = i46;
                if ((i16 & 306783379) != 306783378) {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        p1 p1VarD6 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        lVarV.B(p1VarD6);
                        objI = p1VarD6;
                    }
                    p1Var = (p1) objI;
                    textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                    zN = lVarV.n(textFieldValueD);
                    i54 = i53;
                    objI2 = lVarV.I();
                    androidx.compose.ui.d dVar10 = dVar3;
                    if (zN) {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    }
                    p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                    if ((i16 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objI3 = lVarV.I();
                    if (z19) {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    } else {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    }
                    p1Var2 = (p1) objI3;
                    ImeOptions imeOptionsG6 = keyboardOptions2.g(z18);
                    boolean z216 = !z18;
                    boolean z217 = z14;
                    l<? super TextLayoutResult, h0> lVar16 = lVar5;
                    if (z18) {
                        i55 = 1;
                    } else {
                        i55 = i54;
                    }
                    if (z18) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    boolean zN7 = lVarV.n(p1Var2);
                    KeyboardOptions keyboardOptions9 = keyboardOptions2;
                    if ((i16 & 112) == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = zN7 | z21;
                    objI4 = lVarV.I();
                    if (z22) {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    }
                    int i66 = i48 << 9;
                    lVar8 = lVarV;
                    j.a(textFieldValueD, (l) objI4, dVar10, textStyle2, z0VarC, lVar16, lVar7, h1Var2, z216, i56, i55, imeOptionsG6, zVar3, z217, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i66) | (458752 & i66) | (3670016 & i66) | (i66 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                    if (o.J()) {
                        o.R();
                    }
                    textStyle3 = textStyle2;
                    lVar9 = lVar7;
                    h1Var3 = h1Var2;
                    z23 = z217;
                    z24 = z17;
                    qVar2 = qVarA;
                    keyboardOptions3 = keyboardOptions9;
                    z25 = z18;
                    dVar4 = dVar10;
                    z0Var2 = z0VarC;
                    lVar10 = lVar16;
                    zVar4 = zVar3;
                    i57 = i54;
                    i58 = i52;
                } else {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        p1 p1VarD7 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        lVarV.B(p1VarD7);
                        objI = p1VarD7;
                    }
                    p1Var = (p1) objI;
                    textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                    zN = lVarV.n(textFieldValueD);
                    i54 = i53;
                    objI2 = lVarV.I();
                    androidx.compose.ui.d dVar11 = dVar3;
                    if (zN) {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    }
                    p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                    if ((i16 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objI3 = lVarV.I();
                    if (z19) {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    } else {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    }
                    p1Var2 = (p1) objI3;
                    ImeOptions imeOptionsG7 = keyboardOptions2.g(z18);
                    boolean z218 = !z18;
                    boolean z219 = z14;
                    l<? super TextLayoutResult, h0> lVar17 = lVar5;
                    if (z18) {
                        i55 = 1;
                    } else {
                        i55 = i54;
                    }
                    if (z18) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    boolean zN8 = lVarV.n(p1Var2);
                    KeyboardOptions keyboardOptions10 = keyboardOptions2;
                    if ((i16 & 112) == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = zN8 | z21;
                    objI4 = lVarV.I();
                    if (z22) {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    }
                    int i67 = i48 << 9;
                    lVar8 = lVarV;
                    j.a(textFieldValueD, (l) objI4, dVar11, textStyle2, z0VarC, lVar17, lVar7, h1Var2, z218, i56, i55, imeOptionsG7, zVar3, z219, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i67) | (458752 & i67) | (3670016 & i67) | (i67 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                    if (o.J()) {
                        o.R();
                    }
                    textStyle3 = textStyle2;
                    lVar9 = lVar7;
                    h1Var3 = h1Var2;
                    z23 = z219;
                    z24 = z17;
                    qVar2 = qVarA;
                    keyboardOptions3 = keyboardOptions10;
                    z25 = z18;
                    dVar4 = dVar11;
                    z0Var2 = z0VarC;
                    lVar10 = lVar17;
                    zVar4 = zVar3;
                    i57 = i54;
                    i58 = i52;
                }
                w2VarX = lVar8.x();
                if (w2VarX != null) {
                    w2VarX.a(new g(str, lVar, dVar4, z23, z24, textStyle3, keyboardOptions3, zVar4, z25, i58, i57, z0Var2, lVar10, lVar9, h1Var3, qVar2, i13, i14, i15));
                }
            }
            i16 |= 3072;
            z14 = z11;
            i19 = i15 & 16;
            i21 = PKIFailureInfo.certRevoked;
            if (i19 != 0) {
                if ((i13 & 24576) == 0) {
                    z15 = z12;
                    if (lVarV.p(z15)) {
                        i22 = 16384;
                    } else {
                        i22 = 8192;
                    }
                    i16 |= i22;
                }
                i23 = i15 & 32;
                if (i23 != 0) {
                    i16 |= 196608;
                    textStyleA = textStyle;
                } else {
                    textStyleA = textStyle;
                    if ((i13 & 196608) == 0) {
                        if (lVarV.n(textStyleA)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i16 |= i24;
                    }
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 1572864;
                    keyboardOptionsA = keyboardOptions;
                } else {
                    keyboardOptionsA = keyboardOptions;
                    if ((i13 & 1572864) == 0) {
                        if (lVarV.n(keyboardOptionsA)) {
                            i26 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i26 = PKIFailureInfo.signerNotTrusted;
                        }
                        i16 |= i26;
                    }
                }
                i27 = i15 & 128;
                if (i27 != 0) {
                    i16 |= 12582912;
                    zVar2 = zVar;
                } else {
                    zVar2 = zVar;
                    if ((i13 & 12582912) == 0) {
                        if (lVarV.n(zVar2)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i16 |= i28;
                    }
                }
                i29 = i15 & 256;
                if (i29 != 0) {
                    i16 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (lVarV.p(z13)) {
                        i31 = 67108864;
                    } else {
                        i31 = 33554432;
                    }
                    i16 |= i31;
                }
                if ((i13 & 805306368) != 0) {
                    i16 |= ((i15 & 512) == 0 || !lVarV.r(i11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                i32 = i15 & 1024;
                if (i32 != 0) {
                    i33 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (lVarV.r(i12)) {
                        i34 = 4;
                    } else {
                        i34 = 2;
                    }
                    i33 = i14 | i34;
                } else {
                    i33 = i14;
                }
                i35 = i15 & 2048;
                if (i35 != 0) {
                    i33 |= 48;
                } else if ((i14 & 48) != 0) {
                    if (lVarV.n(z0Var)) {
                        i36 = 32;
                    } else {
                        i36 = 16;
                    }
                    i33 |= i36;
                }
                i37 = i33;
                i38 = i15 & 4096;
                if (i38 != 0) {
                    i39 = i37 | KyberEngine.KyberPolyBytes;
                } else if ((i14 & KyberEngine.KyberPolyBytes) == 0) {
                    if (lVarV.K(lVar2)) {
                        i41 = 256;
                    } else {
                        i41 = 128;
                    }
                    i39 = i37 | i41;
                } else {
                    i39 = i37;
                }
                i42 = i15 & PKIFailureInfo.certRevoked;
                if (i42 != 0) {
                    i44 = i39 | 3072;
                } else {
                    i43 = i39;
                    if ((i14 & 3072) == 0) {
                        i44 = i43 | (lVarV.n(lVar3) ? 2048 : 1024);
                    } else {
                        i44 = i43;
                    }
                }
                i45 = i15 & 16384;
                if (i45 != 0) {
                    i46 = i44;
                    if ((i14 & 24576) == 0) {
                        if (lVarV.n(h1Var)) {
                            i21 = 16384;
                        }
                        i46 |= i21;
                    }
                    i47 = i15 & 32768;
                    if (i47 != 0) {
                        i46 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        i46 |= lVarV.K(qVar) ? 131072 : 65536;
                    }
                    i48 = i46;
                    if ((i16 & 306783379) != 306783378) {
                        lVarV.L();
                        if ((i13 & 1) != 0) {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = d.f15392c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                qVarA = kotlin.f.f15524a.a();
                            } else {
                                qVarA = qVar;
                            }
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            z17 = z15;
                            textStyle2 = textStyleA;
                            dVar3 = dVar2;
                            lVar7 = lVar6;
                            zVar3 = zVarA;
                            h1Var2 = solidColor;
                            z18 = z16;
                        } else {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = d.f15392c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                qVarA = kotlin.f.f15524a.a();
                            } else {
                                qVarA = qVar;
                            }
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            z17 = z15;
                            textStyle2 = textStyleA;
                            dVar3 = dVar2;
                            lVar7 = lVar6;
                            zVar3 = zVarA;
                            h1Var2 = solidColor;
                            z18 = z16;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                        }
                        objI = lVarV.I();
                        companion = p020r2.l.INSTANCE;
                        if (objI == companion.a()) {
                            p1 p1VarD8 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                            lVarV.B(p1VarD8);
                            objI = p1VarD8;
                        }
                        p1Var = (p1) objI;
                        textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                        zN = lVarV.n(textFieldValueD);
                        i54 = i53;
                        objI2 = lVarV.I();
                        androidx.compose.ui.d dVar12 = dVar3;
                        if (zN) {
                            objI2 = new e(textFieldValueD, p1Var);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new e(textFieldValueD, p1Var);
                            lVarV.B(objI2);
                        }
                        p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                        if ((i16 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objI3 = lVarV.I();
                        if (z19) {
                            objI3 = s3.d(str, null, 2, null);
                            lVarV.B(objI3);
                        } else {
                            objI3 = s3.d(str, null, 2, null);
                            lVarV.B(objI3);
                        }
                        p1Var2 = (p1) objI3;
                        ImeOptions imeOptionsG8 = keyboardOptions2.g(z18);
                        boolean z2110 = !z18;
                        boolean z2111 = z14;
                        l<? super TextLayoutResult, h0> lVar18 = lVar5;
                        if (z18) {
                            i55 = 1;
                        } else {
                            i55 = i54;
                        }
                        if (z18) {
                            i56 = 1;
                        } else {
                            i56 = i52;
                        }
                        boolean zN9 = lVarV.n(p1Var2);
                        KeyboardOptions keyboardOptions11 = keyboardOptions2;
                        if ((i16 & 112) == 32) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        z22 = zN9 | z21;
                        objI4 = lVarV.I();
                        if (z22) {
                            objI4 = new f(lVar, p1Var, p1Var2);
                            lVarV.B(objI4);
                        } else {
                            objI4 = new f(lVar, p1Var, p1Var2);
                            lVarV.B(objI4);
                        }
                        int i68 = i48 << 9;
                        lVar8 = lVarV;
                        j.a(textFieldValueD, (l) objI4, dVar12, textStyle2, z0VarC, lVar18, lVar7, h1Var2, z2110, i56, i55, imeOptionsG8, zVar3, z2111, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i68) | (458752 & i68) | (3670016 & i68) | (i68 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                        if (o.J()) {
                            o.R();
                        }
                        textStyle3 = textStyle2;
                        lVar9 = lVar7;
                        h1Var3 = h1Var2;
                        z23 = z2111;
                        z24 = z17;
                        qVar2 = qVarA;
                        keyboardOptions3 = keyboardOptions11;
                        z25 = z18;
                        dVar4 = dVar12;
                        z0Var2 = z0VarC;
                        lVar10 = lVar18;
                        zVar4 = zVar3;
                        i57 = i54;
                        i58 = i52;
                    } else {
                        lVarV.L();
                        if ((i13 & 1) != 0) {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = d.f15392c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                qVarA = kotlin.f.f15524a.a();
                            } else {
                                qVarA = qVar;
                            }
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            z17 = z15;
                            textStyle2 = textStyleA;
                            dVar3 = dVar2;
                            lVar7 = lVar6;
                            zVar3 = zVarA;
                            h1Var2 = solidColor;
                            z18 = z16;
                        } else {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = d.f15392c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                qVarA = kotlin.f.f15524a.a();
                            } else {
                                qVarA = qVar;
                            }
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            z17 = z15;
                            textStyle2 = textStyleA;
                            dVar3 = dVar2;
                            lVar7 = lVar6;
                            zVar3 = zVarA;
                            h1Var2 = solidColor;
                            z18 = z16;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                        }
                        objI = lVarV.I();
                        companion = p020r2.l.INSTANCE;
                        if (objI == companion.a()) {
                            p1 p1VarD9 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                            lVarV.B(p1VarD9);
                            objI = p1VarD9;
                        }
                        p1Var = (p1) objI;
                        textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                        zN = lVarV.n(textFieldValueD);
                        i54 = i53;
                        objI2 = lVarV.I();
                        androidx.compose.ui.d dVar13 = dVar3;
                        if (zN) {
                            objI2 = new e(textFieldValueD, p1Var);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new e(textFieldValueD, p1Var);
                            lVarV.B(objI2);
                        }
                        p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                        if ((i16 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objI3 = lVarV.I();
                        if (z19) {
                            objI3 = s3.d(str, null, 2, null);
                            lVarV.B(objI3);
                        } else {
                            objI3 = s3.d(str, null, 2, null);
                            lVarV.B(objI3);
                        }
                        p1Var2 = (p1) objI3;
                        ImeOptions imeOptionsG9 = keyboardOptions2.g(z18);
                        boolean z2112 = !z18;
                        boolean z2113 = z14;
                        l<? super TextLayoutResult, h0> lVar19 = lVar5;
                        if (z18) {
                            i55 = 1;
                        } else {
                            i55 = i54;
                        }
                        if (z18) {
                            i56 = 1;
                        } else {
                            i56 = i52;
                        }
                        boolean zN10 = lVarV.n(p1Var2);
                        KeyboardOptions keyboardOptions12 = keyboardOptions2;
                        if ((i16 & 112) == 32) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        z22 = zN10 | z21;
                        objI4 = lVarV.I();
                        if (z22) {
                            objI4 = new f(lVar, p1Var, p1Var2);
                            lVarV.B(objI4);
                        } else {
                            objI4 = new f(lVar, p1Var, p1Var2);
                            lVarV.B(objI4);
                        }
                        int i69 = i48 << 9;
                        lVar8 = lVarV;
                        j.a(textFieldValueD, (l) objI4, dVar13, textStyle2, z0VarC, lVar19, lVar7, h1Var2, z2112, i56, i55, imeOptionsG9, zVar3, z2113, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i69) | (458752 & i69) | (3670016 & i69) | (i69 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                        if (o.J()) {
                            o.R();
                        }
                        textStyle3 = textStyle2;
                        lVar9 = lVar7;
                        h1Var3 = h1Var2;
                        z23 = z2113;
                        z24 = z17;
                        qVar2 = qVarA;
                        keyboardOptions3 = keyboardOptions12;
                        z25 = z18;
                        dVar4 = dVar13;
                        z0Var2 = z0VarC;
                        lVar10 = lVar19;
                        zVar4 = zVar3;
                        i57 = i54;
                        i58 = i52;
                    }
                    w2VarX = lVar8.x();
                    if (w2VarX != null) {
                        w2VarX.a(new g(str, lVar, dVar4, z23, z24, textStyle3, keyboardOptions3, zVar4, z25, i58, i57, z0Var2, lVar10, lVar9, h1Var3, qVar2, i13, i14, i15));
                    }
                }
                i46 = i44 | 24576;
                i47 = i15 & 32768;
                if (i47 != 0) {
                    i46 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i46 |= lVarV.K(qVar) ? 131072 : 65536;
                }
                i48 = i46;
                if ((i16 & 306783379) != 306783378) {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        p1 p1VarD10 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        lVarV.B(p1VarD10);
                        objI = p1VarD10;
                    }
                    p1Var = (p1) objI;
                    textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                    zN = lVarV.n(textFieldValueD);
                    i54 = i53;
                    objI2 = lVarV.I();
                    androidx.compose.ui.d dVar14 = dVar3;
                    if (zN) {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    }
                    p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                    if ((i16 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objI3 = lVarV.I();
                    if (z19) {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    } else {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    }
                    p1Var2 = (p1) objI3;
                    ImeOptions imeOptionsG10 = keyboardOptions2.g(z18);
                    boolean z2114 = !z18;
                    boolean z2115 = z14;
                    l<? super TextLayoutResult, h0> lVar110 = lVar5;
                    if (z18) {
                        i55 = 1;
                    } else {
                        i55 = i54;
                    }
                    if (z18) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    boolean zN11 = lVarV.n(p1Var2);
                    KeyboardOptions keyboardOptions13 = keyboardOptions2;
                    if ((i16 & 112) == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = zN11 | z21;
                    objI4 = lVarV.I();
                    if (z22) {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    }
                    int i610 = i48 << 9;
                    lVar8 = lVarV;
                    j.a(textFieldValueD, (l) objI4, dVar14, textStyle2, z0VarC, lVar110, lVar7, h1Var2, z2114, i56, i55, imeOptionsG10, zVar3, z2115, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i610) | (458752 & i610) | (3670016 & i610) | (i610 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                    if (o.J()) {
                        o.R();
                    }
                    textStyle3 = textStyle2;
                    lVar9 = lVar7;
                    h1Var3 = h1Var2;
                    z23 = z2115;
                    z24 = z17;
                    qVar2 = qVarA;
                    keyboardOptions3 = keyboardOptions13;
                    z25 = z18;
                    dVar4 = dVar14;
                    z0Var2 = z0VarC;
                    lVar10 = lVar110;
                    zVar4 = zVar3;
                    i57 = i54;
                    i58 = i52;
                } else {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        p1 p1VarD11 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        lVarV.B(p1VarD11);
                        objI = p1VarD11;
                    }
                    p1Var = (p1) objI;
                    textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                    zN = lVarV.n(textFieldValueD);
                    i54 = i53;
                    objI2 = lVarV.I();
                    androidx.compose.ui.d dVar15 = dVar3;
                    if (zN) {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    }
                    p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                    if ((i16 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objI3 = lVarV.I();
                    if (z19) {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    } else {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    }
                    p1Var2 = (p1) objI3;
                    ImeOptions imeOptionsG11 = keyboardOptions2.g(z18);
                    boolean z2116 = !z18;
                    boolean z2117 = z14;
                    l<? super TextLayoutResult, h0> lVar111 = lVar5;
                    if (z18) {
                        i55 = 1;
                    } else {
                        i55 = i54;
                    }
                    if (z18) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    boolean zN12 = lVarV.n(p1Var2);
                    KeyboardOptions keyboardOptions14 = keyboardOptions2;
                    if ((i16 & 112) == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = zN12 | z21;
                    objI4 = lVarV.I();
                    if (z22) {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    }
                    int i611 = i48 << 9;
                    lVar8 = lVarV;
                    j.a(textFieldValueD, (l) objI4, dVar15, textStyle2, z0VarC, lVar111, lVar7, h1Var2, z2116, i56, i55, imeOptionsG11, zVar3, z2117, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i611) | (458752 & i611) | (3670016 & i611) | (i611 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                    if (o.J()) {
                        o.R();
                    }
                    textStyle3 = textStyle2;
                    lVar9 = lVar7;
                    h1Var3 = h1Var2;
                    z23 = z2117;
                    z24 = z17;
                    qVar2 = qVarA;
                    keyboardOptions3 = keyboardOptions14;
                    z25 = z18;
                    dVar4 = dVar15;
                    z0Var2 = z0VarC;
                    lVar10 = lVar111;
                    zVar4 = zVar3;
                    i57 = i54;
                    i58 = i52;
                }
                w2VarX = lVar8.x();
                if (w2VarX != null) {
                    w2VarX.a(new g(str, lVar, dVar4, z23, z24, textStyle3, keyboardOptions3, zVar4, z25, i58, i57, z0Var2, lVar10, lVar9, h1Var3, qVar2, i13, i14, i15));
                }
            }
            i16 |= 24576;
            z15 = z12;
            i23 = i15 & 32;
            if (i23 != 0) {
                i16 |= 196608;
                textStyleA = textStyle;
            } else {
                textStyleA = textStyle;
                if ((i13 & 196608) == 0) {
                    if (lVarV.n(textStyleA)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i16 |= i24;
                }
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
                keyboardOptionsA = keyboardOptions;
            } else {
                keyboardOptionsA = keyboardOptions;
                if ((i13 & 1572864) == 0) {
                    if (lVarV.n(keyboardOptionsA)) {
                        i26 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i26 = PKIFailureInfo.signerNotTrusted;
                    }
                    i16 |= i26;
                }
            }
            i27 = i15 & 128;
            if (i27 != 0) {
                i16 |= 12582912;
                zVar2 = zVar;
            } else {
                zVar2 = zVar;
                if ((i13 & 12582912) == 0) {
                    if (lVarV.n(zVar2)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i16 |= i28;
                }
            }
            i29 = i15 & 256;
            if (i29 != 0) {
                i16 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (lVarV.p(z13)) {
                    i31 = 67108864;
                } else {
                    i31 = 33554432;
                }
                i16 |= i31;
            }
            if ((i13 & 805306368) != 0) {
                i16 |= ((i15 & 512) == 0 || !lVarV.r(i11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            i32 = i15 & 1024;
            if (i32 != 0) {
                i33 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (lVarV.r(i12)) {
                    i34 = 4;
                } else {
                    i34 = 2;
                }
                i33 = i14 | i34;
            } else {
                i33 = i14;
            }
            i35 = i15 & 2048;
            if (i35 != 0) {
                i33 |= 48;
            } else if ((i14 & 48) != 0) {
                if (lVarV.n(z0Var)) {
                    i36 = 32;
                } else {
                    i36 = 16;
                }
                i33 |= i36;
            }
            i37 = i33;
            i38 = i15 & 4096;
            if (i38 != 0) {
                i39 = i37 | KyberEngine.KyberPolyBytes;
            } else if ((i14 & KyberEngine.KyberPolyBytes) == 0) {
                if (lVarV.K(lVar2)) {
                    i41 = 256;
                } else {
                    i41 = 128;
                }
                i39 = i37 | i41;
            } else {
                i39 = i37;
            }
            i42 = i15 & PKIFailureInfo.certRevoked;
            if (i42 != 0) {
                i44 = i39 | 3072;
            } else {
                i43 = i39;
                if ((i14 & 3072) == 0) {
                    i44 = i43 | (lVarV.n(lVar3) ? 2048 : 1024);
                } else {
                    i44 = i43;
                }
            }
            i45 = i15 & 16384;
            if (i45 != 0) {
                i46 = i44;
                if ((i14 & 24576) == 0) {
                    if (lVarV.n(h1Var)) {
                        i21 = 16384;
                    }
                    i46 |= i21;
                }
                i47 = i15 & 32768;
                if (i47 != 0) {
                    i46 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i46 |= lVarV.K(qVar) ? 131072 : 65536;
                }
                i48 = i46;
                if ((i16 & 306783379) != 306783378) {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        p1 p1VarD12 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        lVarV.B(p1VarD12);
                        objI = p1VarD12;
                    }
                    p1Var = (p1) objI;
                    textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                    zN = lVarV.n(textFieldValueD);
                    i54 = i53;
                    objI2 = lVarV.I();
                    androidx.compose.ui.d dVar16 = dVar3;
                    if (zN) {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    }
                    p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                    if ((i16 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objI3 = lVarV.I();
                    if (z19) {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    } else {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    }
                    p1Var2 = (p1) objI3;
                    ImeOptions imeOptionsG12 = keyboardOptions2.g(z18);
                    boolean z2118 = !z18;
                    boolean z2119 = z14;
                    l<? super TextLayoutResult, h0> lVar112 = lVar5;
                    if (z18) {
                        i55 = 1;
                    } else {
                        i55 = i54;
                    }
                    if (z18) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    boolean zN13 = lVarV.n(p1Var2);
                    KeyboardOptions keyboardOptions15 = keyboardOptions2;
                    if ((i16 & 112) == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = zN13 | z21;
                    objI4 = lVarV.I();
                    if (z22) {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    }
                    int i612 = i48 << 9;
                    lVar8 = lVarV;
                    j.a(textFieldValueD, (l) objI4, dVar16, textStyle2, z0VarC, lVar112, lVar7, h1Var2, z2118, i56, i55, imeOptionsG12, zVar3, z2119, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i612) | (458752 & i612) | (3670016 & i612) | (i612 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                    if (o.J()) {
                        o.R();
                    }
                    textStyle3 = textStyle2;
                    lVar9 = lVar7;
                    h1Var3 = h1Var2;
                    z23 = z2119;
                    z24 = z17;
                    qVar2 = qVarA;
                    keyboardOptions3 = keyboardOptions15;
                    z25 = z18;
                    dVar4 = dVar16;
                    z0Var2 = z0VarC;
                    lVar10 = lVar112;
                    zVar4 = zVar3;
                    i57 = i54;
                    i58 = i52;
                } else {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        p1 p1VarD13 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        lVarV.B(p1VarD13);
                        objI = p1VarD13;
                    }
                    p1Var = (p1) objI;
                    textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                    zN = lVarV.n(textFieldValueD);
                    i54 = i53;
                    objI2 = lVarV.I();
                    androidx.compose.ui.d dVar17 = dVar3;
                    if (zN) {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    }
                    p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                    if ((i16 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objI3 = lVarV.I();
                    if (z19) {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    } else {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    }
                    p1Var2 = (p1) objI3;
                    ImeOptions imeOptionsG13 = keyboardOptions2.g(z18);
                    boolean z21110 = !z18;
                    boolean z21111 = z14;
                    l<? super TextLayoutResult, h0> lVar113 = lVar5;
                    if (z18) {
                        i55 = 1;
                    } else {
                        i55 = i54;
                    }
                    if (z18) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    boolean zN14 = lVarV.n(p1Var2);
                    KeyboardOptions keyboardOptions16 = keyboardOptions2;
                    if ((i16 & 112) == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = zN14 | z21;
                    objI4 = lVarV.I();
                    if (z22) {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    }
                    int i613 = i48 << 9;
                    lVar8 = lVarV;
                    j.a(textFieldValueD, (l) objI4, dVar17, textStyle2, z0VarC, lVar113, lVar7, h1Var2, z21110, i56, i55, imeOptionsG13, zVar3, z21111, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i613) | (458752 & i613) | (3670016 & i613) | (i613 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                    if (o.J()) {
                        o.R();
                    }
                    textStyle3 = textStyle2;
                    lVar9 = lVar7;
                    h1Var3 = h1Var2;
                    z23 = z21111;
                    z24 = z17;
                    qVar2 = qVarA;
                    keyboardOptions3 = keyboardOptions16;
                    z25 = z18;
                    dVar4 = dVar17;
                    z0Var2 = z0VarC;
                    lVar10 = lVar113;
                    zVar4 = zVar3;
                    i57 = i54;
                    i58 = i52;
                }
                w2VarX = lVar8.x();
                if (w2VarX != null) {
                    w2VarX.a(new g(str, lVar, dVar4, z23, z24, textStyle3, keyboardOptions3, zVar4, z25, i58, i57, z0Var2, lVar10, lVar9, h1Var3, qVar2, i13, i14, i15));
                }
            }
            i46 = i44 | 24576;
            i47 = i15 & 32768;
            if (i47 != 0) {
                i46 |= 196608;
            } else if ((i14 & 196608) == 0) {
                i46 |= lVarV.K(qVar) ? 131072 : 65536;
            }
            i48 = i46;
            if ((i16 & 306783379) != 306783378) {
                lVarV.L();
                if ((i13 & 1) != 0) {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = d.f15392c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        qVarA = kotlin.f.f15524a.a();
                    } else {
                        qVarA = qVar;
                    }
                    i52 = i49;
                    i53 = i51;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    textStyle2 = textStyleA;
                    dVar3 = dVar2;
                    lVar7 = lVar6;
                    zVar3 = zVarA;
                    h1Var2 = solidColor;
                    z18 = z16;
                } else {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = d.f15392c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        qVarA = kotlin.f.f15524a.a();
                    } else {
                        qVarA = qVar;
                    }
                    i52 = i49;
                    i53 = i51;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    textStyle2 = textStyleA;
                    dVar3 = dVar2;
                    lVar7 = lVar6;
                    zVar3 = zVarA;
                    h1Var2 = solidColor;
                    z18 = z16;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                }
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    p1 p1VarD14 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    lVarV.B(p1VarD14);
                    objI = p1VarD14;
                }
                p1Var = (p1) objI;
                textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                zN = lVarV.n(textFieldValueD);
                i54 = i53;
                objI2 = lVarV.I();
                androidx.compose.ui.d dVar18 = dVar3;
                if (zN) {
                    objI2 = new e(textFieldValueD, p1Var);
                    lVarV.B(objI2);
                } else {
                    objI2 = new e(textFieldValueD, p1Var);
                    lVarV.B(objI2);
                }
                p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                if ((i16 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objI3 = lVarV.I();
                if (z19) {
                    objI3 = s3.d(str, null, 2, null);
                    lVarV.B(objI3);
                } else {
                    objI3 = s3.d(str, null, 2, null);
                    lVarV.B(objI3);
                }
                p1Var2 = (p1) objI3;
                ImeOptions imeOptionsG14 = keyboardOptions2.g(z18);
                boolean z21112 = !z18;
                boolean z21113 = z14;
                l<? super TextLayoutResult, h0> lVar114 = lVar5;
                if (z18) {
                    i55 = 1;
                } else {
                    i55 = i54;
                }
                if (z18) {
                    i56 = 1;
                } else {
                    i56 = i52;
                }
                boolean zN15 = lVarV.n(p1Var2);
                KeyboardOptions keyboardOptions17 = keyboardOptions2;
                if ((i16 & 112) == 32) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                z22 = zN15 | z21;
                objI4 = lVarV.I();
                if (z22) {
                    objI4 = new f(lVar, p1Var, p1Var2);
                    lVarV.B(objI4);
                } else {
                    objI4 = new f(lVar, p1Var, p1Var2);
                    lVarV.B(objI4);
                }
                int i614 = i48 << 9;
                lVar8 = lVarV;
                j.a(textFieldValueD, (l) objI4, dVar18, textStyle2, z0VarC, lVar114, lVar7, h1Var2, z21112, i56, i55, imeOptionsG14, zVar3, z21113, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i614) | (458752 & i614) | (3670016 & i614) | (i614 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                if (o.J()) {
                    o.R();
                }
                textStyle3 = textStyle2;
                lVar9 = lVar7;
                h1Var3 = h1Var2;
                z23 = z21113;
                z24 = z17;
                qVar2 = qVarA;
                keyboardOptions3 = keyboardOptions17;
                z25 = z18;
                dVar4 = dVar18;
                z0Var2 = z0VarC;
                lVar10 = lVar114;
                zVar4 = zVar3;
                i57 = i54;
                i58 = i52;
            } else {
                lVarV.L();
                if ((i13 & 1) != 0) {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = d.f15392c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        qVarA = kotlin.f.f15524a.a();
                    } else {
                        qVarA = qVar;
                    }
                    i52 = i49;
                    i53 = i51;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    textStyle2 = textStyleA;
                    dVar3 = dVar2;
                    lVar7 = lVar6;
                    zVar3 = zVarA;
                    h1Var2 = solidColor;
                    z18 = z16;
                } else {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = d.f15392c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        qVarA = kotlin.f.f15524a.a();
                    } else {
                        qVarA = qVar;
                    }
                    i52 = i49;
                    i53 = i51;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    textStyle2 = textStyleA;
                    dVar3 = dVar2;
                    lVar7 = lVar6;
                    zVar3 = zVarA;
                    h1Var2 = solidColor;
                    z18 = z16;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                }
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    p1 p1VarD15 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    lVarV.B(p1VarD15);
                    objI = p1VarD15;
                }
                p1Var = (p1) objI;
                textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                zN = lVarV.n(textFieldValueD);
                i54 = i53;
                objI2 = lVarV.I();
                androidx.compose.ui.d dVar19 = dVar3;
                if (zN) {
                    objI2 = new e(textFieldValueD, p1Var);
                    lVarV.B(objI2);
                } else {
                    objI2 = new e(textFieldValueD, p1Var);
                    lVarV.B(objI2);
                }
                p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                if ((i16 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objI3 = lVarV.I();
                if (z19) {
                    objI3 = s3.d(str, null, 2, null);
                    lVarV.B(objI3);
                } else {
                    objI3 = s3.d(str, null, 2, null);
                    lVarV.B(objI3);
                }
                p1Var2 = (p1) objI3;
                ImeOptions imeOptionsG15 = keyboardOptions2.g(z18);
                boolean z21114 = !z18;
                boolean z21115 = z14;
                l<? super TextLayoutResult, h0> lVar115 = lVar5;
                if (z18) {
                    i55 = 1;
                } else {
                    i55 = i54;
                }
                if (z18) {
                    i56 = 1;
                } else {
                    i56 = i52;
                }
                boolean zN16 = lVarV.n(p1Var2);
                KeyboardOptions keyboardOptions18 = keyboardOptions2;
                if ((i16 & 112) == 32) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                z22 = zN16 | z21;
                objI4 = lVarV.I();
                if (z22) {
                    objI4 = new f(lVar, p1Var, p1Var2);
                    lVarV.B(objI4);
                } else {
                    objI4 = new f(lVar, p1Var, p1Var2);
                    lVarV.B(objI4);
                }
                int i615 = i48 << 9;
                lVar8 = lVarV;
                j.a(textFieldValueD, (l) objI4, dVar19, textStyle2, z0VarC, lVar115, lVar7, h1Var2, z21114, i56, i55, imeOptionsG15, zVar3, z21115, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i615) | (458752 & i615) | (3670016 & i615) | (i615 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                if (o.J()) {
                    o.R();
                }
                textStyle3 = textStyle2;
                lVar9 = lVar7;
                h1Var3 = h1Var2;
                z23 = z21115;
                z24 = z17;
                qVar2 = qVarA;
                keyboardOptions3 = keyboardOptions18;
                z25 = z18;
                dVar4 = dVar19;
                z0Var2 = z0VarC;
                lVar10 = lVar115;
                zVar4 = zVar3;
                i57 = i54;
                i58 = i52;
            }
            w2VarX = lVar8.x();
            if (w2VarX != null) {
                w2VarX.a(new g(str, lVar, dVar4, z23, z24, textStyle3, keyboardOptions3, zVar4, z25, i58, i57, z0Var2, lVar10, lVar9, h1Var3, qVar2, i13, i14, i15));
            }
        }
        i16 |= KyberEngine.KyberPolyBytes;
        dVar2 = dVar;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i13 & 3072) == 0) {
                z14 = z11;
                if (lVarV.p(z14)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            i19 = i15 & 16;
            i21 = PKIFailureInfo.certRevoked;
            if (i19 != 0) {
                if ((i13 & 24576) == 0) {
                    z15 = z12;
                    if (lVarV.p(z15)) {
                        i22 = 16384;
                    } else {
                        i22 = 8192;
                    }
                    i16 |= i22;
                }
                i23 = i15 & 32;
                if (i23 != 0) {
                    i16 |= 196608;
                    textStyleA = textStyle;
                } else {
                    textStyleA = textStyle;
                    if ((i13 & 196608) == 0) {
                        if (lVarV.n(textStyleA)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i16 |= i24;
                    }
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 1572864;
                    keyboardOptionsA = keyboardOptions;
                } else {
                    keyboardOptionsA = keyboardOptions;
                    if ((i13 & 1572864) == 0) {
                        if (lVarV.n(keyboardOptionsA)) {
                            i26 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i26 = PKIFailureInfo.signerNotTrusted;
                        }
                        i16 |= i26;
                    }
                }
                i27 = i15 & 128;
                if (i27 != 0) {
                    i16 |= 12582912;
                    zVar2 = zVar;
                } else {
                    zVar2 = zVar;
                    if ((i13 & 12582912) == 0) {
                        if (lVarV.n(zVar2)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i16 |= i28;
                    }
                }
                i29 = i15 & 256;
                if (i29 != 0) {
                    i16 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (lVarV.p(z13)) {
                        i31 = 67108864;
                    } else {
                        i31 = 33554432;
                    }
                    i16 |= i31;
                }
                if ((i13 & 805306368) != 0) {
                    i16 |= ((i15 & 512) == 0 || !lVarV.r(i11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                i32 = i15 & 1024;
                if (i32 != 0) {
                    i33 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (lVarV.r(i12)) {
                        i34 = 4;
                    } else {
                        i34 = 2;
                    }
                    i33 = i14 | i34;
                } else {
                    i33 = i14;
                }
                i35 = i15 & 2048;
                if (i35 != 0) {
                    i33 |= 48;
                } else if ((i14 & 48) != 0) {
                    if (lVarV.n(z0Var)) {
                        i36 = 32;
                    } else {
                        i36 = 16;
                    }
                    i33 |= i36;
                }
                i37 = i33;
                i38 = i15 & 4096;
                if (i38 != 0) {
                    i39 = i37 | KyberEngine.KyberPolyBytes;
                } else if ((i14 & KyberEngine.KyberPolyBytes) == 0) {
                    if (lVarV.K(lVar2)) {
                        i41 = 256;
                    } else {
                        i41 = 128;
                    }
                    i39 = i37 | i41;
                } else {
                    i39 = i37;
                }
                i42 = i15 & PKIFailureInfo.certRevoked;
                if (i42 != 0) {
                    i44 = i39 | 3072;
                } else {
                    i43 = i39;
                    if ((i14 & 3072) == 0) {
                        i44 = i43 | (lVarV.n(lVar3) ? 2048 : 1024);
                    } else {
                        i44 = i43;
                    }
                }
                i45 = i15 & 16384;
                if (i45 != 0) {
                    i46 = i44;
                    if ((i14 & 24576) == 0) {
                        if (lVarV.n(h1Var)) {
                            i21 = 16384;
                        }
                        i46 |= i21;
                    }
                    i47 = i15 & 32768;
                    if (i47 != 0) {
                        i46 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        i46 |= lVarV.K(qVar) ? 131072 : 65536;
                    }
                    i48 = i46;
                    if ((i16 & 306783379) != 306783378) {
                        lVarV.L();
                        if ((i13 & 1) != 0) {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = d.f15392c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                qVarA = kotlin.f.f15524a.a();
                            } else {
                                qVarA = qVar;
                            }
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            z17 = z15;
                            textStyle2 = textStyleA;
                            dVar3 = dVar2;
                            lVar7 = lVar6;
                            zVar3 = zVarA;
                            h1Var2 = solidColor;
                            z18 = z16;
                        } else {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = d.f15392c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                qVarA = kotlin.f.f15524a.a();
                            } else {
                                qVarA = qVar;
                            }
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            z17 = z15;
                            textStyle2 = textStyleA;
                            dVar3 = dVar2;
                            lVar7 = lVar6;
                            zVar3 = zVarA;
                            h1Var2 = solidColor;
                            z18 = z16;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                        }
                        objI = lVarV.I();
                        companion = p020r2.l.INSTANCE;
                        if (objI == companion.a()) {
                            p1 p1VarD16 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                            lVarV.B(p1VarD16);
                            objI = p1VarD16;
                        }
                        p1Var = (p1) objI;
                        textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                        zN = lVarV.n(textFieldValueD);
                        i54 = i53;
                        objI2 = lVarV.I();
                        androidx.compose.ui.d dVar110 = dVar3;
                        if (zN) {
                            objI2 = new e(textFieldValueD, p1Var);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new e(textFieldValueD, p1Var);
                            lVarV.B(objI2);
                        }
                        p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                        if ((i16 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objI3 = lVarV.I();
                        if (z19) {
                            objI3 = s3.d(str, null, 2, null);
                            lVarV.B(objI3);
                        } else {
                            objI3 = s3.d(str, null, 2, null);
                            lVarV.B(objI3);
                        }
                        p1Var2 = (p1) objI3;
                        ImeOptions imeOptionsG16 = keyboardOptions2.g(z18);
                        boolean z21116 = !z18;
                        boolean z21117 = z14;
                        l<? super TextLayoutResult, h0> lVar116 = lVar5;
                        if (z18) {
                            i55 = 1;
                        } else {
                            i55 = i54;
                        }
                        if (z18) {
                            i56 = 1;
                        } else {
                            i56 = i52;
                        }
                        boolean zN17 = lVarV.n(p1Var2);
                        KeyboardOptions keyboardOptions19 = keyboardOptions2;
                        if ((i16 & 112) == 32) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        z22 = zN17 | z21;
                        objI4 = lVarV.I();
                        if (z22) {
                            objI4 = new f(lVar, p1Var, p1Var2);
                            lVarV.B(objI4);
                        } else {
                            objI4 = new f(lVar, p1Var, p1Var2);
                            lVarV.B(objI4);
                        }
                        int i616 = i48 << 9;
                        lVar8 = lVarV;
                        j.a(textFieldValueD, (l) objI4, dVar110, textStyle2, z0VarC, lVar116, lVar7, h1Var2, z21116, i56, i55, imeOptionsG16, zVar3, z21117, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i616) | (458752 & i616) | (3670016 & i616) | (i616 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                        if (o.J()) {
                            o.R();
                        }
                        textStyle3 = textStyle2;
                        lVar9 = lVar7;
                        h1Var3 = h1Var2;
                        z23 = z21117;
                        z24 = z17;
                        qVar2 = qVarA;
                        keyboardOptions3 = keyboardOptions19;
                        z25 = z18;
                        dVar4 = dVar110;
                        z0Var2 = z0VarC;
                        lVar10 = lVar116;
                        zVar4 = zVar3;
                        i57 = i54;
                        i58 = i52;
                    } else {
                        lVarV.L();
                        if ((i13 & 1) != 0) {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = d.f15392c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                qVarA = kotlin.f.f15524a.a();
                            } else {
                                qVarA = qVar;
                            }
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            z17 = z15;
                            textStyle2 = textStyleA;
                            dVar3 = dVar2;
                            lVar7 = lVar6;
                            zVar3 = zVarA;
                            h1Var2 = solidColor;
                            z18 = z16;
                        } else {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = d.f15392c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                qVarA = kotlin.f.f15524a.a();
                            } else {
                                qVarA = qVar;
                            }
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            z17 = z15;
                            textStyle2 = textStyleA;
                            dVar3 = dVar2;
                            lVar7 = lVar6;
                            zVar3 = zVarA;
                            h1Var2 = solidColor;
                            z18 = z16;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                        }
                        objI = lVarV.I();
                        companion = p020r2.l.INSTANCE;
                        if (objI == companion.a()) {
                            p1 p1VarD17 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                            lVarV.B(p1VarD17);
                            objI = p1VarD17;
                        }
                        p1Var = (p1) objI;
                        textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                        zN = lVarV.n(textFieldValueD);
                        i54 = i53;
                        objI2 = lVarV.I();
                        androidx.compose.ui.d dVar111 = dVar3;
                        if (zN) {
                            objI2 = new e(textFieldValueD, p1Var);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new e(textFieldValueD, p1Var);
                            lVarV.B(objI2);
                        }
                        p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                        if ((i16 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objI3 = lVarV.I();
                        if (z19) {
                            objI3 = s3.d(str, null, 2, null);
                            lVarV.B(objI3);
                        } else {
                            objI3 = s3.d(str, null, 2, null);
                            lVarV.B(objI3);
                        }
                        p1Var2 = (p1) objI3;
                        ImeOptions imeOptionsG17 = keyboardOptions2.g(z18);
                        boolean z21118 = !z18;
                        boolean z21119 = z14;
                        l<? super TextLayoutResult, h0> lVar117 = lVar5;
                        if (z18) {
                            i55 = 1;
                        } else {
                            i55 = i54;
                        }
                        if (z18) {
                            i56 = 1;
                        } else {
                            i56 = i52;
                        }
                        boolean zN18 = lVarV.n(p1Var2);
                        KeyboardOptions keyboardOptions110 = keyboardOptions2;
                        if ((i16 & 112) == 32) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        z22 = zN18 | z21;
                        objI4 = lVarV.I();
                        if (z22) {
                            objI4 = new f(lVar, p1Var, p1Var2);
                            lVarV.B(objI4);
                        } else {
                            objI4 = new f(lVar, p1Var, p1Var2);
                            lVarV.B(objI4);
                        }
                        int i617 = i48 << 9;
                        lVar8 = lVarV;
                        j.a(textFieldValueD, (l) objI4, dVar111, textStyle2, z0VarC, lVar117, lVar7, h1Var2, z21118, i56, i55, imeOptionsG17, zVar3, z21119, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i617) | (458752 & i617) | (3670016 & i617) | (i617 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                        if (o.J()) {
                            o.R();
                        }
                        textStyle3 = textStyle2;
                        lVar9 = lVar7;
                        h1Var3 = h1Var2;
                        z23 = z21119;
                        z24 = z17;
                        qVar2 = qVarA;
                        keyboardOptions3 = keyboardOptions110;
                        z25 = z18;
                        dVar4 = dVar111;
                        z0Var2 = z0VarC;
                        lVar10 = lVar117;
                        zVar4 = zVar3;
                        i57 = i54;
                        i58 = i52;
                    }
                    w2VarX = lVar8.x();
                    if (w2VarX != null) {
                        w2VarX.a(new g(str, lVar, dVar4, z23, z24, textStyle3, keyboardOptions3, zVar4, z25, i58, i57, z0Var2, lVar10, lVar9, h1Var3, qVar2, i13, i14, i15));
                    }
                }
                i46 = i44 | 24576;
                i47 = i15 & 32768;
                if (i47 != 0) {
                    i46 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i46 |= lVarV.K(qVar) ? 131072 : 65536;
                }
                i48 = i46;
                if ((i16 & 306783379) != 306783378) {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        p1 p1VarD18 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        lVarV.B(p1VarD18);
                        objI = p1VarD18;
                    }
                    p1Var = (p1) objI;
                    textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                    zN = lVarV.n(textFieldValueD);
                    i54 = i53;
                    objI2 = lVarV.I();
                    androidx.compose.ui.d dVar112 = dVar3;
                    if (zN) {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    }
                    p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                    if ((i16 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objI3 = lVarV.I();
                    if (z19) {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    } else {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    }
                    p1Var2 = (p1) objI3;
                    ImeOptions imeOptionsG18 = keyboardOptions2.g(z18);
                    boolean z211110 = !z18;
                    boolean z211111 = z14;
                    l<? super TextLayoutResult, h0> lVar118 = lVar5;
                    if (z18) {
                        i55 = 1;
                    } else {
                        i55 = i54;
                    }
                    if (z18) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    boolean zN19 = lVarV.n(p1Var2);
                    KeyboardOptions keyboardOptions111 = keyboardOptions2;
                    if ((i16 & 112) == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = zN19 | z21;
                    objI4 = lVarV.I();
                    if (z22) {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    }
                    int i618 = i48 << 9;
                    lVar8 = lVarV;
                    j.a(textFieldValueD, (l) objI4, dVar112, textStyle2, z0VarC, lVar118, lVar7, h1Var2, z211110, i56, i55, imeOptionsG18, zVar3, z211111, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i618) | (458752 & i618) | (3670016 & i618) | (i618 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                    if (o.J()) {
                        o.R();
                    }
                    textStyle3 = textStyle2;
                    lVar9 = lVar7;
                    h1Var3 = h1Var2;
                    z23 = z211111;
                    z24 = z17;
                    qVar2 = qVarA;
                    keyboardOptions3 = keyboardOptions111;
                    z25 = z18;
                    dVar4 = dVar112;
                    z0Var2 = z0VarC;
                    lVar10 = lVar118;
                    zVar4 = zVar3;
                    i57 = i54;
                    i58 = i52;
                } else {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        p1 p1VarD19 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        lVarV.B(p1VarD19);
                        objI = p1VarD19;
                    }
                    p1Var = (p1) objI;
                    textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                    zN = lVarV.n(textFieldValueD);
                    i54 = i53;
                    objI2 = lVarV.I();
                    androidx.compose.ui.d dVar113 = dVar3;
                    if (zN) {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    }
                    p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                    if ((i16 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objI3 = lVarV.I();
                    if (z19) {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    } else {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    }
                    p1Var2 = (p1) objI3;
                    ImeOptions imeOptionsG19 = keyboardOptions2.g(z18);
                    boolean z211112 = !z18;
                    boolean z211113 = z14;
                    l<? super TextLayoutResult, h0> lVar119 = lVar5;
                    if (z18) {
                        i55 = 1;
                    } else {
                        i55 = i54;
                    }
                    if (z18) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    boolean zN110 = lVarV.n(p1Var2);
                    KeyboardOptions keyboardOptions112 = keyboardOptions2;
                    if ((i16 & 112) == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = zN110 | z21;
                    objI4 = lVarV.I();
                    if (z22) {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    }
                    int i619 = i48 << 9;
                    lVar8 = lVarV;
                    j.a(textFieldValueD, (l) objI4, dVar113, textStyle2, z0VarC, lVar119, lVar7, h1Var2, z211112, i56, i55, imeOptionsG19, zVar3, z211113, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i619) | (458752 & i619) | (3670016 & i619) | (i619 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                    if (o.J()) {
                        o.R();
                    }
                    textStyle3 = textStyle2;
                    lVar9 = lVar7;
                    h1Var3 = h1Var2;
                    z23 = z211113;
                    z24 = z17;
                    qVar2 = qVarA;
                    keyboardOptions3 = keyboardOptions112;
                    z25 = z18;
                    dVar4 = dVar113;
                    z0Var2 = z0VarC;
                    lVar10 = lVar119;
                    zVar4 = zVar3;
                    i57 = i54;
                    i58 = i52;
                }
                w2VarX = lVar8.x();
                if (w2VarX != null) {
                    w2VarX.a(new g(str, lVar, dVar4, z23, z24, textStyle3, keyboardOptions3, zVar4, z25, i58, i57, z0Var2, lVar10, lVar9, h1Var3, qVar2, i13, i14, i15));
                }
            }
            i16 |= 24576;
            z15 = z12;
            i23 = i15 & 32;
            if (i23 != 0) {
                i16 |= 196608;
                textStyleA = textStyle;
            } else {
                textStyleA = textStyle;
                if ((i13 & 196608) == 0) {
                    if (lVarV.n(textStyleA)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i16 |= i24;
                }
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
                keyboardOptionsA = keyboardOptions;
            } else {
                keyboardOptionsA = keyboardOptions;
                if ((i13 & 1572864) == 0) {
                    if (lVarV.n(keyboardOptionsA)) {
                        i26 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i26 = PKIFailureInfo.signerNotTrusted;
                    }
                    i16 |= i26;
                }
            }
            i27 = i15 & 128;
            if (i27 != 0) {
                i16 |= 12582912;
                zVar2 = zVar;
            } else {
                zVar2 = zVar;
                if ((i13 & 12582912) == 0) {
                    if (lVarV.n(zVar2)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i16 |= i28;
                }
            }
            i29 = i15 & 256;
            if (i29 != 0) {
                i16 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (lVarV.p(z13)) {
                    i31 = 67108864;
                } else {
                    i31 = 33554432;
                }
                i16 |= i31;
            }
            if ((i13 & 805306368) != 0) {
                i16 |= ((i15 & 512) == 0 || !lVarV.r(i11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            i32 = i15 & 1024;
            if (i32 != 0) {
                i33 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (lVarV.r(i12)) {
                    i34 = 4;
                } else {
                    i34 = 2;
                }
                i33 = i14 | i34;
            } else {
                i33 = i14;
            }
            i35 = i15 & 2048;
            if (i35 != 0) {
                i33 |= 48;
            } else if ((i14 & 48) != 0) {
                if (lVarV.n(z0Var)) {
                    i36 = 32;
                } else {
                    i36 = 16;
                }
                i33 |= i36;
            }
            i37 = i33;
            i38 = i15 & 4096;
            if (i38 != 0) {
                i39 = i37 | KyberEngine.KyberPolyBytes;
            } else if ((i14 & KyberEngine.KyberPolyBytes) == 0) {
                if (lVarV.K(lVar2)) {
                    i41 = 256;
                } else {
                    i41 = 128;
                }
                i39 = i37 | i41;
            } else {
                i39 = i37;
            }
            i42 = i15 & PKIFailureInfo.certRevoked;
            if (i42 != 0) {
                i44 = i39 | 3072;
            } else {
                i43 = i39;
                if ((i14 & 3072) == 0) {
                    i44 = i43 | (lVarV.n(lVar3) ? 2048 : 1024);
                } else {
                    i44 = i43;
                }
            }
            i45 = i15 & 16384;
            if (i45 != 0) {
                i46 = i44;
                if ((i14 & 24576) == 0) {
                    if (lVarV.n(h1Var)) {
                        i21 = 16384;
                    }
                    i46 |= i21;
                }
                i47 = i15 & 32768;
                if (i47 != 0) {
                    i46 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i46 |= lVarV.K(qVar) ? 131072 : 65536;
                }
                i48 = i46;
                if ((i16 & 306783379) != 306783378) {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        p1 p1VarD110 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        lVarV.B(p1VarD110);
                        objI = p1VarD110;
                    }
                    p1Var = (p1) objI;
                    textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                    zN = lVarV.n(textFieldValueD);
                    i54 = i53;
                    objI2 = lVarV.I();
                    androidx.compose.ui.d dVar114 = dVar3;
                    if (zN) {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    }
                    p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                    if ((i16 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objI3 = lVarV.I();
                    if (z19) {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    } else {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    }
                    p1Var2 = (p1) objI3;
                    ImeOptions imeOptionsG110 = keyboardOptions2.g(z18);
                    boolean z211114 = !z18;
                    boolean z211115 = z14;
                    l<? super TextLayoutResult, h0> lVar1110 = lVar5;
                    if (z18) {
                        i55 = 1;
                    } else {
                        i55 = i54;
                    }
                    if (z18) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    boolean zN111 = lVarV.n(p1Var2);
                    KeyboardOptions keyboardOptions113 = keyboardOptions2;
                    if ((i16 & 112) == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = zN111 | z21;
                    objI4 = lVarV.I();
                    if (z22) {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    }
                    int i6110 = i48 << 9;
                    lVar8 = lVarV;
                    j.a(textFieldValueD, (l) objI4, dVar114, textStyle2, z0VarC, lVar1110, lVar7, h1Var2, z211114, i56, i55, imeOptionsG110, zVar3, z211115, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i6110) | (458752 & i6110) | (3670016 & i6110) | (i6110 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                    if (o.J()) {
                        o.R();
                    }
                    textStyle3 = textStyle2;
                    lVar9 = lVar7;
                    h1Var3 = h1Var2;
                    z23 = z211115;
                    z24 = z17;
                    qVar2 = qVarA;
                    keyboardOptions3 = keyboardOptions113;
                    z25 = z18;
                    dVar4 = dVar114;
                    z0Var2 = z0VarC;
                    lVar10 = lVar1110;
                    zVar4 = zVar3;
                    i57 = i54;
                    i58 = i52;
                } else {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        p1 p1VarD111 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        lVarV.B(p1VarD111);
                        objI = p1VarD111;
                    }
                    p1Var = (p1) objI;
                    textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                    zN = lVarV.n(textFieldValueD);
                    i54 = i53;
                    objI2 = lVarV.I();
                    androidx.compose.ui.d dVar115 = dVar3;
                    if (zN) {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    }
                    p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                    if ((i16 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objI3 = lVarV.I();
                    if (z19) {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    } else {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    }
                    p1Var2 = (p1) objI3;
                    ImeOptions imeOptionsG111 = keyboardOptions2.g(z18);
                    boolean z211116 = !z18;
                    boolean z211117 = z14;
                    l<? super TextLayoutResult, h0> lVar1111 = lVar5;
                    if (z18) {
                        i55 = 1;
                    } else {
                        i55 = i54;
                    }
                    if (z18) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    boolean zN112 = lVarV.n(p1Var2);
                    KeyboardOptions keyboardOptions114 = keyboardOptions2;
                    if ((i16 & 112) == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = zN112 | z21;
                    objI4 = lVarV.I();
                    if (z22) {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    }
                    int i6111 = i48 << 9;
                    lVar8 = lVarV;
                    j.a(textFieldValueD, (l) objI4, dVar115, textStyle2, z0VarC, lVar1111, lVar7, h1Var2, z211116, i56, i55, imeOptionsG111, zVar3, z211117, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i6111) | (458752 & i6111) | (3670016 & i6111) | (i6111 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                    if (o.J()) {
                        o.R();
                    }
                    textStyle3 = textStyle2;
                    lVar9 = lVar7;
                    h1Var3 = h1Var2;
                    z23 = z211117;
                    z24 = z17;
                    qVar2 = qVarA;
                    keyboardOptions3 = keyboardOptions114;
                    z25 = z18;
                    dVar4 = dVar115;
                    z0Var2 = z0VarC;
                    lVar10 = lVar1111;
                    zVar4 = zVar3;
                    i57 = i54;
                    i58 = i52;
                }
                w2VarX = lVar8.x();
                if (w2VarX != null) {
                    w2VarX.a(new g(str, lVar, dVar4, z23, z24, textStyle3, keyboardOptions3, zVar4, z25, i58, i57, z0Var2, lVar10, lVar9, h1Var3, qVar2, i13, i14, i15));
                }
            }
            i46 = i44 | 24576;
            i47 = i15 & 32768;
            if (i47 != 0) {
                i46 |= 196608;
            } else if ((i14 & 196608) == 0) {
                i46 |= lVarV.K(qVar) ? 131072 : 65536;
            }
            i48 = i46;
            if ((i16 & 306783379) != 306783378) {
                lVarV.L();
                if ((i13 & 1) != 0) {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = d.f15392c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        qVarA = kotlin.f.f15524a.a();
                    } else {
                        qVarA = qVar;
                    }
                    i52 = i49;
                    i53 = i51;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    textStyle2 = textStyleA;
                    dVar3 = dVar2;
                    lVar7 = lVar6;
                    zVar3 = zVarA;
                    h1Var2 = solidColor;
                    z18 = z16;
                } else {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = d.f15392c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        qVarA = kotlin.f.f15524a.a();
                    } else {
                        qVarA = qVar;
                    }
                    i52 = i49;
                    i53 = i51;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    textStyle2 = textStyleA;
                    dVar3 = dVar2;
                    lVar7 = lVar6;
                    zVar3 = zVarA;
                    h1Var2 = solidColor;
                    z18 = z16;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                }
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    p1 p1VarD112 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    lVarV.B(p1VarD112);
                    objI = p1VarD112;
                }
                p1Var = (p1) objI;
                textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                zN = lVarV.n(textFieldValueD);
                i54 = i53;
                objI2 = lVarV.I();
                androidx.compose.ui.d dVar116 = dVar3;
                if (zN) {
                    objI2 = new e(textFieldValueD, p1Var);
                    lVarV.B(objI2);
                } else {
                    objI2 = new e(textFieldValueD, p1Var);
                    lVarV.B(objI2);
                }
                p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                if ((i16 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objI3 = lVarV.I();
                if (z19) {
                    objI3 = s3.d(str, null, 2, null);
                    lVarV.B(objI3);
                } else {
                    objI3 = s3.d(str, null, 2, null);
                    lVarV.B(objI3);
                }
                p1Var2 = (p1) objI3;
                ImeOptions imeOptionsG112 = keyboardOptions2.g(z18);
                boolean z211118 = !z18;
                boolean z211119 = z14;
                l<? super TextLayoutResult, h0> lVar1112 = lVar5;
                if (z18) {
                    i55 = 1;
                } else {
                    i55 = i54;
                }
                if (z18) {
                    i56 = 1;
                } else {
                    i56 = i52;
                }
                boolean zN113 = lVarV.n(p1Var2);
                KeyboardOptions keyboardOptions115 = keyboardOptions2;
                if ((i16 & 112) == 32) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                z22 = zN113 | z21;
                objI4 = lVarV.I();
                if (z22) {
                    objI4 = new f(lVar, p1Var, p1Var2);
                    lVarV.B(objI4);
                } else {
                    objI4 = new f(lVar, p1Var, p1Var2);
                    lVarV.B(objI4);
                }
                int i6112 = i48 << 9;
                lVar8 = lVarV;
                j.a(textFieldValueD, (l) objI4, dVar116, textStyle2, z0VarC, lVar1112, lVar7, h1Var2, z211118, i56, i55, imeOptionsG112, zVar3, z211119, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i6112) | (458752 & i6112) | (3670016 & i6112) | (i6112 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                if (o.J()) {
                    o.R();
                }
                textStyle3 = textStyle2;
                lVar9 = lVar7;
                h1Var3 = h1Var2;
                z23 = z211119;
                z24 = z17;
                qVar2 = qVarA;
                keyboardOptions3 = keyboardOptions115;
                z25 = z18;
                dVar4 = dVar116;
                z0Var2 = z0VarC;
                lVar10 = lVar1112;
                zVar4 = zVar3;
                i57 = i54;
                i58 = i52;
            } else {
                lVarV.L();
                if ((i13 & 1) != 0) {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = d.f15392c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        qVarA = kotlin.f.f15524a.a();
                    } else {
                        qVarA = qVar;
                    }
                    i52 = i49;
                    i53 = i51;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    textStyle2 = textStyleA;
                    dVar3 = dVar2;
                    lVar7 = lVar6;
                    zVar3 = zVarA;
                    h1Var2 = solidColor;
                    z18 = z16;
                } else {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = d.f15392c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        qVarA = kotlin.f.f15524a.a();
                    } else {
                        qVarA = qVar;
                    }
                    i52 = i49;
                    i53 = i51;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    textStyle2 = textStyleA;
                    dVar3 = dVar2;
                    lVar7 = lVar6;
                    zVar3 = zVarA;
                    h1Var2 = solidColor;
                    z18 = z16;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                }
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    p1 p1VarD113 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    lVarV.B(p1VarD113);
                    objI = p1VarD113;
                }
                p1Var = (p1) objI;
                textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                zN = lVarV.n(textFieldValueD);
                i54 = i53;
                objI2 = lVarV.I();
                androidx.compose.ui.d dVar117 = dVar3;
                if (zN) {
                    objI2 = new e(textFieldValueD, p1Var);
                    lVarV.B(objI2);
                } else {
                    objI2 = new e(textFieldValueD, p1Var);
                    lVarV.B(objI2);
                }
                p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                if ((i16 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objI3 = lVarV.I();
                if (z19) {
                    objI3 = s3.d(str, null, 2, null);
                    lVarV.B(objI3);
                } else {
                    objI3 = s3.d(str, null, 2, null);
                    lVarV.B(objI3);
                }
                p1Var2 = (p1) objI3;
                ImeOptions imeOptionsG113 = keyboardOptions2.g(z18);
                boolean z2111110 = !z18;
                boolean z2111111 = z14;
                l<? super TextLayoutResult, h0> lVar1113 = lVar5;
                if (z18) {
                    i55 = 1;
                } else {
                    i55 = i54;
                }
                if (z18) {
                    i56 = 1;
                } else {
                    i56 = i52;
                }
                boolean zN114 = lVarV.n(p1Var2);
                KeyboardOptions keyboardOptions116 = keyboardOptions2;
                if ((i16 & 112) == 32) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                z22 = zN114 | z21;
                objI4 = lVarV.I();
                if (z22) {
                    objI4 = new f(lVar, p1Var, p1Var2);
                    lVarV.B(objI4);
                } else {
                    objI4 = new f(lVar, p1Var, p1Var2);
                    lVarV.B(objI4);
                }
                int i6113 = i48 << 9;
                lVar8 = lVarV;
                j.a(textFieldValueD, (l) objI4, dVar117, textStyle2, z0VarC, lVar1113, lVar7, h1Var2, z2111110, i56, i55, imeOptionsG113, zVar3, z2111111, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i6113) | (458752 & i6113) | (3670016 & i6113) | (i6113 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                if (o.J()) {
                    o.R();
                }
                textStyle3 = textStyle2;
                lVar9 = lVar7;
                h1Var3 = h1Var2;
                z23 = z2111111;
                z24 = z17;
                qVar2 = qVarA;
                keyboardOptions3 = keyboardOptions116;
                z25 = z18;
                dVar4 = dVar117;
                z0Var2 = z0VarC;
                lVar10 = lVar1113;
                zVar4 = zVar3;
                i57 = i54;
                i58 = i52;
            }
            w2VarX = lVar8.x();
            if (w2VarX != null) {
                w2VarX.a(new g(str, lVar, dVar4, z23, z24, textStyle3, keyboardOptions3, zVar4, z25, i58, i57, z0Var2, lVar10, lVar9, h1Var3, qVar2, i13, i14, i15));
            }
        }
        i16 |= 3072;
        z14 = z11;
        i19 = i15 & 16;
        i21 = PKIFailureInfo.certRevoked;
        if (i19 != 0) {
            if ((i13 & 24576) == 0) {
                z15 = z12;
                if (lVarV.p(z15)) {
                    i22 = 16384;
                } else {
                    i22 = 8192;
                }
                i16 |= i22;
            }
            i23 = i15 & 32;
            if (i23 != 0) {
                i16 |= 196608;
                textStyleA = textStyle;
            } else {
                textStyleA = textStyle;
                if ((i13 & 196608) == 0) {
                    if (lVarV.n(textStyleA)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i16 |= i24;
                }
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
                keyboardOptionsA = keyboardOptions;
            } else {
                keyboardOptionsA = keyboardOptions;
                if ((i13 & 1572864) == 0) {
                    if (lVarV.n(keyboardOptionsA)) {
                        i26 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i26 = PKIFailureInfo.signerNotTrusted;
                    }
                    i16 |= i26;
                }
            }
            i27 = i15 & 128;
            if (i27 != 0) {
                i16 |= 12582912;
                zVar2 = zVar;
            } else {
                zVar2 = zVar;
                if ((i13 & 12582912) == 0) {
                    if (lVarV.n(zVar2)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i16 |= i28;
                }
            }
            i29 = i15 & 256;
            if (i29 != 0) {
                i16 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (lVarV.p(z13)) {
                    i31 = 67108864;
                } else {
                    i31 = 33554432;
                }
                i16 |= i31;
            }
            if ((i13 & 805306368) != 0) {
                i16 |= ((i15 & 512) == 0 || !lVarV.r(i11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            i32 = i15 & 1024;
            if (i32 != 0) {
                i33 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (lVarV.r(i12)) {
                    i34 = 4;
                } else {
                    i34 = 2;
                }
                i33 = i14 | i34;
            } else {
                i33 = i14;
            }
            i35 = i15 & 2048;
            if (i35 != 0) {
                i33 |= 48;
            } else if ((i14 & 48) != 0) {
                if (lVarV.n(z0Var)) {
                    i36 = 32;
                } else {
                    i36 = 16;
                }
                i33 |= i36;
            }
            i37 = i33;
            i38 = i15 & 4096;
            if (i38 != 0) {
                i39 = i37 | KyberEngine.KyberPolyBytes;
            } else if ((i14 & KyberEngine.KyberPolyBytes) == 0) {
                if (lVarV.K(lVar2)) {
                    i41 = 256;
                } else {
                    i41 = 128;
                }
                i39 = i37 | i41;
            } else {
                i39 = i37;
            }
            i42 = i15 & PKIFailureInfo.certRevoked;
            if (i42 != 0) {
                i44 = i39 | 3072;
            } else {
                i43 = i39;
                if ((i14 & 3072) == 0) {
                    i44 = i43 | (lVarV.n(lVar3) ? 2048 : 1024);
                } else {
                    i44 = i43;
                }
            }
            i45 = i15 & 16384;
            if (i45 != 0) {
                i46 = i44;
                if ((i14 & 24576) == 0) {
                    if (lVarV.n(h1Var)) {
                        i21 = 16384;
                    }
                    i46 |= i21;
                }
                i47 = i15 & 32768;
                if (i47 != 0) {
                    i46 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i46 |= lVarV.K(qVar) ? 131072 : 65536;
                }
                i48 = i46;
                if ((i16 & 306783379) != 306783378) {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        p1 p1VarD114 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        lVarV.B(p1VarD114);
                        objI = p1VarD114;
                    }
                    p1Var = (p1) objI;
                    textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                    zN = lVarV.n(textFieldValueD);
                    i54 = i53;
                    objI2 = lVarV.I();
                    androidx.compose.ui.d dVar118 = dVar3;
                    if (zN) {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    }
                    p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                    if ((i16 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objI3 = lVarV.I();
                    if (z19) {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    } else {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    }
                    p1Var2 = (p1) objI3;
                    ImeOptions imeOptionsG114 = keyboardOptions2.g(z18);
                    boolean z2111112 = !z18;
                    boolean z2111113 = z14;
                    l<? super TextLayoutResult, h0> lVar1114 = lVar5;
                    if (z18) {
                        i55 = 1;
                    } else {
                        i55 = i54;
                    }
                    if (z18) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    boolean zN115 = lVarV.n(p1Var2);
                    KeyboardOptions keyboardOptions117 = keyboardOptions2;
                    if ((i16 & 112) == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = zN115 | z21;
                    objI4 = lVarV.I();
                    if (z22) {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    }
                    int i6114 = i48 << 9;
                    lVar8 = lVarV;
                    j.a(textFieldValueD, (l) objI4, dVar118, textStyle2, z0VarC, lVar1114, lVar7, h1Var2, z2111112, i56, i55, imeOptionsG114, zVar3, z2111113, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i6114) | (458752 & i6114) | (3670016 & i6114) | (i6114 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                    if (o.J()) {
                        o.R();
                    }
                    textStyle3 = textStyle2;
                    lVar9 = lVar7;
                    h1Var3 = h1Var2;
                    z23 = z2111113;
                    z24 = z17;
                    qVar2 = qVarA;
                    keyboardOptions3 = keyboardOptions117;
                    z25 = z18;
                    dVar4 = dVar118;
                    z0Var2 = z0VarC;
                    lVar10 = lVar1114;
                    zVar4 = zVar3;
                    i57 = i54;
                    i58 = i52;
                } else {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = d.f15392c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            qVarA = kotlin.f.f15524a.a();
                        } else {
                            qVarA = qVar;
                        }
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        z17 = z15;
                        textStyle2 = textStyleA;
                        dVar3 = dVar2;
                        lVar7 = lVar6;
                        zVar3 = zVarA;
                        h1Var2 = solidColor;
                        z18 = z16;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                    }
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        p1 p1VarD115 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                        lVarV.B(p1VarD115);
                        objI = p1VarD115;
                    }
                    p1Var = (p1) objI;
                    textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                    zN = lVarV.n(textFieldValueD);
                    i54 = i53;
                    objI2 = lVarV.I();
                    androidx.compose.ui.d dVar119 = dVar3;
                    if (zN) {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new e(textFieldValueD, p1Var);
                        lVarV.B(objI2);
                    }
                    p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                    if ((i16 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objI3 = lVarV.I();
                    if (z19) {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    } else {
                        objI3 = s3.d(str, null, 2, null);
                        lVarV.B(objI3);
                    }
                    p1Var2 = (p1) objI3;
                    ImeOptions imeOptionsG115 = keyboardOptions2.g(z18);
                    boolean z2111114 = !z18;
                    boolean z2111115 = z14;
                    l<? super TextLayoutResult, h0> lVar1115 = lVar5;
                    if (z18) {
                        i55 = 1;
                    } else {
                        i55 = i54;
                    }
                    if (z18) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    boolean zN116 = lVarV.n(p1Var2);
                    KeyboardOptions keyboardOptions118 = keyboardOptions2;
                    if ((i16 & 112) == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = zN116 | z21;
                    objI4 = lVarV.I();
                    if (z22) {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    } else {
                        objI4 = new f(lVar, p1Var, p1Var2);
                        lVarV.B(objI4);
                    }
                    int i6115 = i48 << 9;
                    lVar8 = lVarV;
                    j.a(textFieldValueD, (l) objI4, dVar119, textStyle2, z0VarC, lVar1115, lVar7, h1Var2, z2111114, i56, i55, imeOptionsG115, zVar3, z2111115, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i6115) | (458752 & i6115) | (3670016 & i6115) | (i6115 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                    if (o.J()) {
                        o.R();
                    }
                    textStyle3 = textStyle2;
                    lVar9 = lVar7;
                    h1Var3 = h1Var2;
                    z23 = z2111115;
                    z24 = z17;
                    qVar2 = qVarA;
                    keyboardOptions3 = keyboardOptions118;
                    z25 = z18;
                    dVar4 = dVar119;
                    z0Var2 = z0VarC;
                    lVar10 = lVar1115;
                    zVar4 = zVar3;
                    i57 = i54;
                    i58 = i52;
                }
                w2VarX = lVar8.x();
                if (w2VarX != null) {
                    w2VarX.a(new g(str, lVar, dVar4, z23, z24, textStyle3, keyboardOptions3, zVar4, z25, i58, i57, z0Var2, lVar10, lVar9, h1Var3, qVar2, i13, i14, i15));
                }
            }
            i46 = i44 | 24576;
            i47 = i15 & 32768;
            if (i47 != 0) {
                i46 |= 196608;
            } else if ((i14 & 196608) == 0) {
                i46 |= lVarV.K(qVar) ? 131072 : 65536;
            }
            i48 = i46;
            if ((i16 & 306783379) != 306783378) {
                lVarV.L();
                if ((i13 & 1) != 0) {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = d.f15392c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        qVarA = kotlin.f.f15524a.a();
                    } else {
                        qVarA = qVar;
                    }
                    i52 = i49;
                    i53 = i51;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    textStyle2 = textStyleA;
                    dVar3 = dVar2;
                    lVar7 = lVar6;
                    zVar3 = zVarA;
                    h1Var2 = solidColor;
                    z18 = z16;
                } else {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = d.f15392c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        qVarA = kotlin.f.f15524a.a();
                    } else {
                        qVarA = qVar;
                    }
                    i52 = i49;
                    i53 = i51;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    textStyle2 = textStyleA;
                    dVar3 = dVar2;
                    lVar7 = lVar6;
                    zVar3 = zVarA;
                    h1Var2 = solidColor;
                    z18 = z16;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                }
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    p1 p1VarD116 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    lVarV.B(p1VarD116);
                    objI = p1VarD116;
                }
                p1Var = (p1) objI;
                textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                zN = lVarV.n(textFieldValueD);
                i54 = i53;
                objI2 = lVarV.I();
                androidx.compose.ui.d dVar1110 = dVar3;
                if (zN) {
                    objI2 = new e(textFieldValueD, p1Var);
                    lVarV.B(objI2);
                } else {
                    objI2 = new e(textFieldValueD, p1Var);
                    lVarV.B(objI2);
                }
                p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                if ((i16 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objI3 = lVarV.I();
                if (z19) {
                    objI3 = s3.d(str, null, 2, null);
                    lVarV.B(objI3);
                } else {
                    objI3 = s3.d(str, null, 2, null);
                    lVarV.B(objI3);
                }
                p1Var2 = (p1) objI3;
                ImeOptions imeOptionsG116 = keyboardOptions2.g(z18);
                boolean z2111116 = !z18;
                boolean z2111117 = z14;
                l<? super TextLayoutResult, h0> lVar1116 = lVar5;
                if (z18) {
                    i55 = 1;
                } else {
                    i55 = i54;
                }
                if (z18) {
                    i56 = 1;
                } else {
                    i56 = i52;
                }
                boolean zN117 = lVarV.n(p1Var2);
                KeyboardOptions keyboardOptions119 = keyboardOptions2;
                if ((i16 & 112) == 32) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                z22 = zN117 | z21;
                objI4 = lVarV.I();
                if (z22) {
                    objI4 = new f(lVar, p1Var, p1Var2);
                    lVarV.B(objI4);
                } else {
                    objI4 = new f(lVar, p1Var, p1Var2);
                    lVarV.B(objI4);
                }
                int i6116 = i48 << 9;
                lVar8 = lVarV;
                j.a(textFieldValueD, (l) objI4, dVar1110, textStyle2, z0VarC, lVar1116, lVar7, h1Var2, z2111116, i56, i55, imeOptionsG116, zVar3, z2111117, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i6116) | (458752 & i6116) | (3670016 & i6116) | (i6116 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                if (o.J()) {
                    o.R();
                }
                textStyle3 = textStyle2;
                lVar9 = lVar7;
                h1Var3 = h1Var2;
                z23 = z2111117;
                z24 = z17;
                qVar2 = qVarA;
                keyboardOptions3 = keyboardOptions119;
                z25 = z18;
                dVar4 = dVar1110;
                z0Var2 = z0VarC;
                lVar10 = lVar1116;
                zVar4 = zVar3;
                i57 = i54;
                i58 = i52;
            } else {
                lVarV.L();
                if ((i13 & 1) != 0) {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = d.f15392c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        qVarA = kotlin.f.f15524a.a();
                    } else {
                        qVarA = qVar;
                    }
                    i52 = i49;
                    i53 = i51;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    textStyle2 = textStyleA;
                    dVar3 = dVar2;
                    lVar7 = lVar6;
                    zVar3 = zVarA;
                    h1Var2 = solidColor;
                    z18 = z16;
                } else {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = d.f15392c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        qVarA = kotlin.f.f15524a.a();
                    } else {
                        qVarA = qVar;
                    }
                    i52 = i49;
                    i53 = i51;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    textStyle2 = textStyleA;
                    dVar3 = dVar2;
                    lVar7 = lVar6;
                    zVar3 = zVarA;
                    h1Var2 = solidColor;
                    z18 = z16;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                }
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    p1 p1VarD117 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    lVarV.B(p1VarD117);
                    objI = p1VarD117;
                }
                p1Var = (p1) objI;
                textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                zN = lVarV.n(textFieldValueD);
                i54 = i53;
                objI2 = lVarV.I();
                androidx.compose.ui.d dVar1111 = dVar3;
                if (zN) {
                    objI2 = new e(textFieldValueD, p1Var);
                    lVarV.B(objI2);
                } else {
                    objI2 = new e(textFieldValueD, p1Var);
                    lVarV.B(objI2);
                }
                p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                if ((i16 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objI3 = lVarV.I();
                if (z19) {
                    objI3 = s3.d(str, null, 2, null);
                    lVarV.B(objI3);
                } else {
                    objI3 = s3.d(str, null, 2, null);
                    lVarV.B(objI3);
                }
                p1Var2 = (p1) objI3;
                ImeOptions imeOptionsG117 = keyboardOptions2.g(z18);
                boolean z2111118 = !z18;
                boolean z2111119 = z14;
                l<? super TextLayoutResult, h0> lVar1117 = lVar5;
                if (z18) {
                    i55 = 1;
                } else {
                    i55 = i54;
                }
                if (z18) {
                    i56 = 1;
                } else {
                    i56 = i52;
                }
                boolean zN118 = lVarV.n(p1Var2);
                KeyboardOptions keyboardOptions1110 = keyboardOptions2;
                if ((i16 & 112) == 32) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                z22 = zN118 | z21;
                objI4 = lVarV.I();
                if (z22) {
                    objI4 = new f(lVar, p1Var, p1Var2);
                    lVarV.B(objI4);
                } else {
                    objI4 = new f(lVar, p1Var, p1Var2);
                    lVarV.B(objI4);
                }
                int i6117 = i48 << 9;
                lVar8 = lVarV;
                j.a(textFieldValueD, (l) objI4, dVar1111, textStyle2, z0VarC, lVar1117, lVar7, h1Var2, z2111118, i56, i55, imeOptionsG117, zVar3, z2111119, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i6117) | (458752 & i6117) | (3670016 & i6117) | (i6117 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                if (o.J()) {
                    o.R();
                }
                textStyle3 = textStyle2;
                lVar9 = lVar7;
                h1Var3 = h1Var2;
                z23 = z2111119;
                z24 = z17;
                qVar2 = qVarA;
                keyboardOptions3 = keyboardOptions1110;
                z25 = z18;
                dVar4 = dVar1111;
                z0Var2 = z0VarC;
                lVar10 = lVar1117;
                zVar4 = zVar3;
                i57 = i54;
                i58 = i52;
            }
            w2VarX = lVar8.x();
            if (w2VarX != null) {
                w2VarX.a(new g(str, lVar, dVar4, z23, z24, textStyle3, keyboardOptions3, zVar4, z25, i58, i57, z0Var2, lVar10, lVar9, h1Var3, qVar2, i13, i14, i15));
            }
        }
        i16 |= 24576;
        z15 = z12;
        i23 = i15 & 32;
        if (i23 != 0) {
            i16 |= 196608;
            textStyleA = textStyle;
        } else {
            textStyleA = textStyle;
            if ((i13 & 196608) == 0) {
                if (lVarV.n(textStyleA)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i16 |= i24;
            }
        }
        i25 = i15 & 64;
        if (i25 != 0) {
            i16 |= 1572864;
            keyboardOptionsA = keyboardOptions;
        } else {
            keyboardOptionsA = keyboardOptions;
            if ((i13 & 1572864) == 0) {
                if (lVarV.n(keyboardOptionsA)) {
                    i26 = PKIFailureInfo.badCertTemplate;
                } else {
                    i26 = PKIFailureInfo.signerNotTrusted;
                }
                i16 |= i26;
            }
        }
        i27 = i15 & 128;
        if (i27 != 0) {
            i16 |= 12582912;
            zVar2 = zVar;
        } else {
            zVar2 = zVar;
            if ((i13 & 12582912) == 0) {
                if (lVarV.n(zVar2)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i16 |= i28;
            }
        }
        i29 = i15 & 256;
        if (i29 != 0) {
            i16 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            if (lVarV.p(z13)) {
                i31 = 67108864;
            } else {
                i31 = 33554432;
            }
            i16 |= i31;
        }
        if ((i13 & 805306368) != 0) {
            i16 |= ((i15 & 512) == 0 || !lVarV.r(i11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
        }
        i32 = i15 & 1024;
        if (i32 != 0) {
            i33 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            if (lVarV.r(i12)) {
                i34 = 4;
            } else {
                i34 = 2;
            }
            i33 = i14 | i34;
        } else {
            i33 = i14;
        }
        i35 = i15 & 2048;
        if (i35 != 0) {
            i33 |= 48;
        } else if ((i14 & 48) != 0) {
            if (lVarV.n(z0Var)) {
                i36 = 32;
            } else {
                i36 = 16;
            }
            i33 |= i36;
        }
        i37 = i33;
        i38 = i15 & 4096;
        if (i38 != 0) {
            i39 = i37 | KyberEngine.KyberPolyBytes;
        } else if ((i14 & KyberEngine.KyberPolyBytes) == 0) {
            if (lVarV.K(lVar2)) {
                i41 = 256;
            } else {
                i41 = 128;
            }
            i39 = i37 | i41;
        } else {
            i39 = i37;
        }
        i42 = i15 & PKIFailureInfo.certRevoked;
        if (i42 != 0) {
            i44 = i39 | 3072;
        } else {
            i43 = i39;
            if ((i14 & 3072) == 0) {
                i44 = i43 | (lVarV.n(lVar3) ? 2048 : 1024);
            } else {
                i44 = i43;
            }
        }
        i45 = i15 & 16384;
        if (i45 != 0) {
            i46 = i44;
            if ((i14 & 24576) == 0) {
                if (lVarV.n(h1Var)) {
                    i21 = 16384;
                }
                i46 |= i21;
            }
            i47 = i15 & 32768;
            if (i47 != 0) {
                i46 |= 196608;
            } else if ((i14 & 196608) == 0) {
                i46 |= lVarV.K(qVar) ? 131072 : 65536;
            }
            i48 = i46;
            if ((i16 & 306783379) != 306783378) {
                lVarV.L();
                if ((i13 & 1) != 0) {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = d.f15392c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        qVarA = kotlin.f.f15524a.a();
                    } else {
                        qVarA = qVar;
                    }
                    i52 = i49;
                    i53 = i51;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    textStyle2 = textStyleA;
                    dVar3 = dVar2;
                    lVar7 = lVar6;
                    zVar3 = zVarA;
                    h1Var2 = solidColor;
                    z18 = z16;
                } else {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = d.f15392c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        qVarA = kotlin.f.f15524a.a();
                    } else {
                        qVarA = qVar;
                    }
                    i52 = i49;
                    i53 = i51;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    textStyle2 = textStyleA;
                    dVar3 = dVar2;
                    lVar7 = lVar6;
                    zVar3 = zVarA;
                    h1Var2 = solidColor;
                    z18 = z16;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                }
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    p1 p1VarD118 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    lVarV.B(p1VarD118);
                    objI = p1VarD118;
                }
                p1Var = (p1) objI;
                textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                zN = lVarV.n(textFieldValueD);
                i54 = i53;
                objI2 = lVarV.I();
                androidx.compose.ui.d dVar1112 = dVar3;
                if (zN) {
                    objI2 = new e(textFieldValueD, p1Var);
                    lVarV.B(objI2);
                } else {
                    objI2 = new e(textFieldValueD, p1Var);
                    lVarV.B(objI2);
                }
                p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                if ((i16 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objI3 = lVarV.I();
                if (z19) {
                    objI3 = s3.d(str, null, 2, null);
                    lVarV.B(objI3);
                } else {
                    objI3 = s3.d(str, null, 2, null);
                    lVarV.B(objI3);
                }
                p1Var2 = (p1) objI3;
                ImeOptions imeOptionsG118 = keyboardOptions2.g(z18);
                boolean z21111110 = !z18;
                boolean z21111111 = z14;
                l<? super TextLayoutResult, h0> lVar1118 = lVar5;
                if (z18) {
                    i55 = 1;
                } else {
                    i55 = i54;
                }
                if (z18) {
                    i56 = 1;
                } else {
                    i56 = i52;
                }
                boolean zN119 = lVarV.n(p1Var2);
                KeyboardOptions keyboardOptions1111 = keyboardOptions2;
                if ((i16 & 112) == 32) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                z22 = zN119 | z21;
                objI4 = lVarV.I();
                if (z22) {
                    objI4 = new f(lVar, p1Var, p1Var2);
                    lVarV.B(objI4);
                } else {
                    objI4 = new f(lVar, p1Var, p1Var2);
                    lVarV.B(objI4);
                }
                int i6118 = i48 << 9;
                lVar8 = lVarV;
                j.a(textFieldValueD, (l) objI4, dVar1112, textStyle2, z0VarC, lVar1118, lVar7, h1Var2, z21111110, i56, i55, imeOptionsG118, zVar3, z21111111, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i6118) | (458752 & i6118) | (3670016 & i6118) | (i6118 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                if (o.J()) {
                    o.R();
                }
                textStyle3 = textStyle2;
                lVar9 = lVar7;
                h1Var3 = h1Var2;
                z23 = z21111111;
                z24 = z17;
                qVar2 = qVarA;
                keyboardOptions3 = keyboardOptions1111;
                z25 = z18;
                dVar4 = dVar1112;
                z0Var2 = z0VarC;
                lVar10 = lVar1118;
                zVar4 = zVar3;
                i57 = i54;
                i58 = i52;
            } else {
                lVarV.L();
                if ((i13 & 1) != 0) {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = d.f15392c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        qVarA = kotlin.f.f15524a.a();
                    } else {
                        qVarA = qVar;
                    }
                    i52 = i49;
                    i53 = i51;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    textStyle2 = textStyleA;
                    dVar3 = dVar2;
                    lVar7 = lVar6;
                    zVar3 = zVarA;
                    h1Var2 = solidColor;
                    z18 = z16;
                } else {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = d.f15392c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        qVarA = kotlin.f.f15524a.a();
                    } else {
                        qVarA = qVar;
                    }
                    i52 = i49;
                    i53 = i51;
                    keyboardOptions2 = keyboardOptionsA;
                    z17 = z15;
                    textStyle2 = textStyleA;
                    dVar3 = dVar2;
                    lVar7 = lVar6;
                    zVar3 = zVarA;
                    h1Var2 = solidColor;
                    z18 = z16;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                }
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    p1 p1VarD119 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    lVarV.B(p1VarD119);
                    objI = p1VarD119;
                }
                p1Var = (p1) objI;
                textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
                zN = lVarV.n(textFieldValueD);
                i54 = i53;
                objI2 = lVarV.I();
                androidx.compose.ui.d dVar1113 = dVar3;
                if (zN) {
                    objI2 = new e(textFieldValueD, p1Var);
                    lVarV.B(objI2);
                } else {
                    objI2 = new e(textFieldValueD, p1Var);
                    lVarV.B(objI2);
                }
                p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
                if ((i16 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objI3 = lVarV.I();
                if (z19) {
                    objI3 = s3.d(str, null, 2, null);
                    lVarV.B(objI3);
                } else {
                    objI3 = s3.d(str, null, 2, null);
                    lVarV.B(objI3);
                }
                p1Var2 = (p1) objI3;
                ImeOptions imeOptionsG119 = keyboardOptions2.g(z18);
                boolean z21111112 = !z18;
                boolean z21111113 = z14;
                l<? super TextLayoutResult, h0> lVar1119 = lVar5;
                if (z18) {
                    i55 = 1;
                } else {
                    i55 = i54;
                }
                if (z18) {
                    i56 = 1;
                } else {
                    i56 = i52;
                }
                boolean zN1110 = lVarV.n(p1Var2);
                KeyboardOptions keyboardOptions1112 = keyboardOptions2;
                if ((i16 & 112) == 32) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                z22 = zN1110 | z21;
                objI4 = lVarV.I();
                if (z22) {
                    objI4 = new f(lVar, p1Var, p1Var2);
                    lVarV.B(objI4);
                } else {
                    objI4 = new f(lVar, p1Var, p1Var2);
                    lVarV.B(objI4);
                }
                int i6119 = i48 << 9;
                lVar8 = lVarV;
                j.a(textFieldValueD, (l) objI4, dVar1113, textStyle2, z0VarC, lVar1119, lVar7, h1Var2, z21111112, i56, i55, imeOptionsG119, zVar3, z21111113, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i6119) | (458752 & i6119) | (3670016 & i6119) | (i6119 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
                if (o.J()) {
                    o.R();
                }
                textStyle3 = textStyle2;
                lVar9 = lVar7;
                h1Var3 = h1Var2;
                z23 = z21111113;
                z24 = z17;
                qVar2 = qVarA;
                keyboardOptions3 = keyboardOptions1112;
                z25 = z18;
                dVar4 = dVar1113;
                z0Var2 = z0VarC;
                lVar10 = lVar1119;
                zVar4 = zVar3;
                i57 = i54;
                i58 = i52;
            }
            w2VarX = lVar8.x();
            if (w2VarX != null) {
                w2VarX.a(new g(str, lVar, dVar4, z23, z24, textStyle3, keyboardOptions3, zVar4, z25, i58, i57, z0Var2, lVar10, lVar9, h1Var3, qVar2, i13, i14, i15));
            }
        }
        i46 = i44 | 24576;
        i47 = i15 & 32768;
        if (i47 != 0) {
            i46 |= 196608;
        } else if ((i14 & 196608) == 0) {
            i46 |= lVarV.K(qVar) ? 131072 : 65536;
        }
        i48 = i46;
        if ((i16 & 306783379) != 306783378) {
            lVarV.L();
            if ((i13 & 1) != 0) {
                if (i59 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if (i19 != 0) {
                    z15 = false;
                }
                if (i23 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i25 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i27 != 0) {
                    zVarA = z.INSTANCE.a();
                } else {
                    zVarA = zVar2;
                }
                if (i29 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if ((i15 & 512) != 0) {
                    if (z16) {
                        i49 = 1;
                    } else {
                        i49 = Integer.MAX_VALUE;
                    }
                    i16 &= -1879048193;
                } else {
                    i49 = i11;
                }
                if (i32 != 0) {
                    i51 = 1;
                } else {
                    i51 = i12;
                }
                if (i35 != 0) {
                    z0VarC = z0.INSTANCE.c();
                } else {
                    z0VarC = z0Var;
                }
                if (i38 != 0) {
                    lVar5 = d.f15392c;
                } else {
                    lVar5 = lVar2;
                }
                if (i42 != 0) {
                    lVar6 = null;
                } else {
                    lVar6 = lVar3;
                }
                if (i45 != 0) {
                    solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                } else {
                    solidColor = h1Var;
                }
                if (i47 != 0) {
                    qVarA = kotlin.f.f15524a.a();
                } else {
                    qVarA = qVar;
                }
                i52 = i49;
                i53 = i51;
                keyboardOptions2 = keyboardOptionsA;
                z17 = z15;
                textStyle2 = textStyleA;
                dVar3 = dVar2;
                lVar7 = lVar6;
                zVar3 = zVarA;
                h1Var2 = solidColor;
                z18 = z16;
            } else {
                if (i59 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if (i19 != 0) {
                    z15 = false;
                }
                if (i23 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i25 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i27 != 0) {
                    zVarA = z.INSTANCE.a();
                } else {
                    zVarA = zVar2;
                }
                if (i29 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if ((i15 & 512) != 0) {
                    if (z16) {
                        i49 = 1;
                    } else {
                        i49 = Integer.MAX_VALUE;
                    }
                    i16 &= -1879048193;
                } else {
                    i49 = i11;
                }
                if (i32 != 0) {
                    i51 = 1;
                } else {
                    i51 = i12;
                }
                if (i35 != 0) {
                    z0VarC = z0.INSTANCE.c();
                } else {
                    z0VarC = z0Var;
                }
                if (i38 != 0) {
                    lVar5 = d.f15392c;
                } else {
                    lVar5 = lVar2;
                }
                if (i42 != 0) {
                    lVar6 = null;
                } else {
                    lVar6 = lVar3;
                }
                if (i45 != 0) {
                    solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                } else {
                    solidColor = h1Var;
                }
                if (i47 != 0) {
                    qVarA = kotlin.f.f15524a.a();
                } else {
                    qVarA = qVar;
                }
                i52 = i49;
                i53 = i51;
                keyboardOptions2 = keyboardOptionsA;
                z17 = z15;
                textStyle2 = textStyleA;
                dVar3 = dVar2;
                lVar7 = lVar6;
                zVar3 = zVarA;
                h1Var2 = solidColor;
                z18 = z16;
            }
            lVarV.C();
            if (o.J()) {
                o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
            }
            objI = lVarV.I();
            companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                p1 p1VarD1110 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                lVarV.B(p1VarD1110);
                objI = p1VarD1110;
            }
            p1Var = (p1) objI;
            textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
            zN = lVarV.n(textFieldValueD);
            i54 = i53;
            objI2 = lVarV.I();
            androidx.compose.ui.d dVar1114 = dVar3;
            if (zN) {
                objI2 = new e(textFieldValueD, p1Var);
                lVarV.B(objI2);
            } else {
                objI2 = new e(textFieldValueD, p1Var);
                lVarV.B(objI2);
            }
            p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
            if ((i16 & 14) == 4) {
                z19 = true;
            } else {
                z19 = false;
            }
            objI3 = lVarV.I();
            if (z19) {
                objI3 = s3.d(str, null, 2, null);
                lVarV.B(objI3);
            } else {
                objI3 = s3.d(str, null, 2, null);
                lVarV.B(objI3);
            }
            p1Var2 = (p1) objI3;
            ImeOptions imeOptionsG1110 = keyboardOptions2.g(z18);
            boolean z21111114 = !z18;
            boolean z21111115 = z14;
            l<? super TextLayoutResult, h0> lVar11110 = lVar5;
            if (z18) {
                i55 = 1;
            } else {
                i55 = i54;
            }
            if (z18) {
                i56 = 1;
            } else {
                i56 = i52;
            }
            boolean zN1111 = lVarV.n(p1Var2);
            KeyboardOptions keyboardOptions1113 = keyboardOptions2;
            if ((i16 & 112) == 32) {
                z21 = true;
            } else {
                z21 = false;
            }
            z22 = zN1111 | z21;
            objI4 = lVarV.I();
            if (z22) {
                objI4 = new f(lVar, p1Var, p1Var2);
                lVarV.B(objI4);
            } else {
                objI4 = new f(lVar, p1Var, p1Var2);
                lVarV.B(objI4);
            }
            int i61110 = i48 << 9;
            lVar8 = lVarV;
            j.a(textFieldValueD, (l) objI4, dVar1114, textStyle2, z0VarC, lVar11110, lVar7, h1Var2, z21111114, i56, i55, imeOptionsG1110, zVar3, z21111115, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i61110) | (458752 & i61110) | (3670016 & i61110) | (i61110 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
            if (o.J()) {
                o.R();
            }
            textStyle3 = textStyle2;
            lVar9 = lVar7;
            h1Var3 = h1Var2;
            z23 = z21111115;
            z24 = z17;
            qVar2 = qVarA;
            keyboardOptions3 = keyboardOptions1113;
            z25 = z18;
            dVar4 = dVar1114;
            z0Var2 = z0VarC;
            lVar10 = lVar11110;
            zVar4 = zVar3;
            i57 = i54;
            i58 = i52;
        } else {
            lVarV.L();
            if ((i13 & 1) != 0) {
                if (i59 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if (i19 != 0) {
                    z15 = false;
                }
                if (i23 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i25 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i27 != 0) {
                    zVarA = z.INSTANCE.a();
                } else {
                    zVarA = zVar2;
                }
                if (i29 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if ((i15 & 512) != 0) {
                    if (z16) {
                        i49 = 1;
                    } else {
                        i49 = Integer.MAX_VALUE;
                    }
                    i16 &= -1879048193;
                } else {
                    i49 = i11;
                }
                if (i32 != 0) {
                    i51 = 1;
                } else {
                    i51 = i12;
                }
                if (i35 != 0) {
                    z0VarC = z0.INSTANCE.c();
                } else {
                    z0VarC = z0Var;
                }
                if (i38 != 0) {
                    lVar5 = d.f15392c;
                } else {
                    lVar5 = lVar2;
                }
                if (i42 != 0) {
                    lVar6 = null;
                } else {
                    lVar6 = lVar3;
                }
                if (i45 != 0) {
                    solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                } else {
                    solidColor = h1Var;
                }
                if (i47 != 0) {
                    qVarA = kotlin.f.f15524a.a();
                } else {
                    qVarA = qVar;
                }
                i52 = i49;
                i53 = i51;
                keyboardOptions2 = keyboardOptionsA;
                z17 = z15;
                textStyle2 = textStyleA;
                dVar3 = dVar2;
                lVar7 = lVar6;
                zVar3 = zVarA;
                h1Var2 = solidColor;
                z18 = z16;
            } else {
                if (i59 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if (i19 != 0) {
                    z15 = false;
                }
                if (i23 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i25 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i27 != 0) {
                    zVarA = z.INSTANCE.a();
                } else {
                    zVarA = zVar2;
                }
                if (i29 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if ((i15 & 512) != 0) {
                    if (z16) {
                        i49 = 1;
                    } else {
                        i49 = Integer.MAX_VALUE;
                    }
                    i16 &= -1879048193;
                } else {
                    i49 = i11;
                }
                if (i32 != 0) {
                    i51 = 1;
                } else {
                    i51 = i12;
                }
                if (i35 != 0) {
                    z0VarC = z0.INSTANCE.c();
                } else {
                    z0VarC = z0Var;
                }
                if (i38 != 0) {
                    lVar5 = d.f15392c;
                } else {
                    lVar5 = lVar2;
                }
                if (i42 != 0) {
                    lVar6 = null;
                } else {
                    lVar6 = lVar3;
                }
                if (i45 != 0) {
                    solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                } else {
                    solidColor = h1Var;
                }
                if (i47 != 0) {
                    qVarA = kotlin.f.f15524a.a();
                } else {
                    qVarA = qVar;
                }
                i52 = i49;
                i53 = i51;
                keyboardOptions2 = keyboardOptionsA;
                z17 = z15;
                textStyle2 = textStyleA;
                dVar3 = dVar2;
                lVar7 = lVar6;
                zVar3 = zVarA;
                h1Var2 = solidColor;
                z18 = z16;
            }
            lVarV.C();
            if (o.J()) {
                o.S(945255183, i16, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
            }
            objI = lVarV.I();
            companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                p1 p1VarD1111 = s3.d(new TextFieldValue(str, 0L, (p0) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                lVarV.B(p1VarD1111);
                objI = p1VarD1111;
            }
            p1Var = (p1) objI;
            textFieldValueD = TextFieldValue.d(c(p1Var), str, 0L, null, 6, null);
            zN = lVarV.n(textFieldValueD);
            i54 = i53;
            objI2 = lVarV.I();
            androidx.compose.ui.d dVar1115 = dVar3;
            if (zN) {
                objI2 = new e(textFieldValueD, p1Var);
                lVarV.B(objI2);
            } else {
                objI2 = new e(textFieldValueD, p1Var);
                lVarV.B(objI2);
            }
            p020r2.Function0.i((wn0.a) objI2, lVarV, 0);
            if ((i16 & 14) == 4) {
                z19 = true;
            } else {
                z19 = false;
            }
            objI3 = lVarV.I();
            if (z19) {
                objI3 = s3.d(str, null, 2, null);
                lVarV.B(objI3);
            } else {
                objI3 = s3.d(str, null, 2, null);
                lVarV.B(objI3);
            }
            p1Var2 = (p1) objI3;
            ImeOptions imeOptionsG1111 = keyboardOptions2.g(z18);
            boolean z21111116 = !z18;
            boolean z21111117 = z14;
            l<? super TextLayoutResult, h0> lVar11111 = lVar5;
            if (z18) {
                i55 = 1;
            } else {
                i55 = i54;
            }
            if (z18) {
                i56 = 1;
            } else {
                i56 = i52;
            }
            boolean zN1112 = lVarV.n(p1Var2);
            KeyboardOptions keyboardOptions1114 = keyboardOptions2;
            if ((i16 & 112) == 32) {
                z21 = true;
            } else {
                z21 = false;
            }
            z22 = zN1112 | z21;
            objI4 = lVarV.I();
            if (z22) {
                objI4 = new f(lVar, p1Var, p1Var2);
                lVarV.B(objI4);
            } else {
                objI4 = new f(lVar, p1Var, p1Var2);
                lVarV.B(objI4);
            }
            int i61111 = i48 << 9;
            lVar8 = lVarV;
            j.a(textFieldValueD, (l) objI4, dVar1115, textStyle2, z0VarC, lVar11111, lVar7, h1Var2, z21111116, i56, i55, imeOptionsG1111, zVar3, z21111117, z17, qVarA, lVar8, (i16 & 896) | ((i16 >> 6) & 7168) | (57344 & i61111) | (458752 & i61111) | (3670016 & i61111) | (i61111 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i48 & 458752), 0);
            if (o.J()) {
                o.R();
            }
            textStyle3 = textStyle2;
            lVar9 = lVar7;
            h1Var3 = h1Var2;
            z23 = z21111117;
            z24 = z17;
            qVar2 = qVarA;
            keyboardOptions3 = keyboardOptions1114;
            z25 = z18;
            dVar4 = dVar1115;
            z0Var2 = z0VarC;
            lVar10 = lVar11111;
            zVar4 = zVar3;
            i57 = i54;
            i58 = i52;
        }
        w2VarX = lVar8.x();
        if (w2VarX != null) {
            w2VarX.a(new g(str, lVar, dVar4, z23, z24, textStyle3, keyboardOptions3, zVar4, z25, i58, i57, z0Var2, lVar10, lVar9, h1Var3, qVar2, i13, i14, i15));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0123  */
    /* JADX WARN: Code duplicated, block: B:103:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x0135  */
    /* JADX WARN: Code duplicated, block: B:109:0x013b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0144  */
    /* JADX WARN: Code duplicated, block: B:112:0x0148  */
    /* JADX WARN: Code duplicated, block: B:114:0x0152  */
    /* JADX WARN: Code duplicated, block: B:115:0x0155  */
    /* JADX WARN: Code duplicated, block: B:117:0x015a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0164  */
    /* JADX WARN: Code duplicated, block: B:122:0x016b  */
    /* JADX WARN: Code duplicated, block: B:124:0x016f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0179  */
    /* JADX WARN: Code duplicated, block: B:127:0x017c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0181  */
    /* JADX WARN: Code duplicated, block: B:132:0x018c  */
    /* JADX WARN: Code duplicated, block: B:133:0x018f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0195  */
    /* JADX WARN: Code duplicated, block: B:137:0x019d  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:155:0x01da  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:163:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:167:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:169:0x0204  */
    /* JADX WARN: Code duplicated, block: B:173:0x0215  */
    /* JADX WARN: Code duplicated, block: B:179:0x0241  */
    /* JADX WARN: Code duplicated, block: B:181:0x024a  */
    /* JADX WARN: Code duplicated, block: B:189:0x0274 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x0276  */
    /* JADX WARN: Code duplicated, block: B:192:0x027b  */
    /* JADX WARN: Code duplicated, block: B:194:0x027f  */
    /* JADX WARN: Code duplicated, block: B:196:0x0282  */
    /* JADX WARN: Code duplicated, block: B:198:0x028b  */
    /* JADX WARN: Code duplicated, block: B:200:0x0294  */
    /* JADX WARN: Code duplicated, block: B:201:0x029b  */
    /* JADX WARN: Code duplicated, block: B:203:0x029e  */
    /* JADX WARN: Code duplicated, block: B:204:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:207:0x02a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:209:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:211:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:213:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:214:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:216:0x02be  */
    /* JADX WARN: Code duplicated, block: B:217:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:219:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:220:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:222:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:223:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:225:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:226:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:228:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:229:0x0307  */
    /* JADX WARN: Code duplicated, block: B:232:0x0320  */
    /* JADX WARN: Code duplicated, block: B:235:0x0334  */
    /* JADX WARN: Code duplicated, block: B:236:0x0337  */
    /* JADX WARN: Code duplicated, block: B:238:0x033b  */
    /* JADX WARN: Code duplicated, block: B:239:0x033e  */
    /* JADX WARN: Code duplicated, block: B:242:0x0349  */
    /* JADX WARN: Code duplicated, block: B:243:0x034c  */
    /* JADX WARN: Code duplicated, block: B:247:0x0356  */
    /* JADX WARN: Code duplicated, block: B:250:0x0360  */
    /* JADX WARN: Code duplicated, block: B:252:0x0368  */
    /* JADX WARN: Code duplicated, block: B:255:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:259:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:261:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x0101  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:91:0x010c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:94:0x0115  */
    /* JADX WARN: Code duplicated, block: B:98:0x011f  */
    /* JADX WARN: Instruction removed from duplicated block: B:179:0x0241, please report this as an issue */
    public static final void b(TextFieldValue textFieldValue, l<? super TextFieldValue, h0> lVar, androidx.compose.ui.d dVar, boolean z11, boolean z12, TextStyle textStyle, KeyboardOptions keyboardOptions, z zVar, boolean z13, int i11, int i12, z0 z0Var, l<? super TextLayoutResult, h0> lVar2, u1.l lVar3, h1 h1Var, q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar, p020r2.l lVar4, int i13, int i14, int i15) {
        int i16;
        androidx.compose.ui.d dVar2;
        int i17;
        boolean z14;
        int i18;
        int i19;
        int i21;
        boolean z15;
        int i22;
        int i23;
        TextStyle textStyleA;
        int i24;
        int i25;
        KeyboardOptions keyboardOptionsA;
        int i26;
        int i27;
        z zVar2;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        z zVarA;
        boolean z16;
        int i49;
        int i51;
        z0 z0VarC;
        l<? super TextLayoutResult, h0> lVar5;
        u1.l lVar6;
        h1 solidColor;
        h1 h1Var2;
        boolean z17;
        int i52;
        int i53;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        z zVar3;
        int i54;
        boolean z18;
        boolean z19;
        q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVarB;
        int i55;
        int i56;
        boolean z21;
        boolean z22;
        Object objI;
        z zVar4;
        p020r2.l lVar7;
        int i57;
        int i58;
        boolean z23;
        z0 z0Var2;
        boolean z24;
        q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar2;
        l<? super TextLayoutResult, h0> lVar8;
        h1 h1Var3;
        boolean z25;
        KeyboardOptions keyboardOptions3;
        u1.l lVar9;
        TextStyle textStyle3;
        androidx.compose.ui.d dVar3;
        w2 w2VarX;
        p020r2.l lVarV = lVar4.v(1804514146);
        if ((i15 & 1) != 0) {
            i16 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i16 = (lVarV.n(textFieldValue) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i13 & 48) == 0) {
            i16 |= lVarV.K(lVar) ? 32 : 16;
        }
        int i59 = i15 & 4;
        if (i59 == 0) {
            if ((i13 & KyberEngine.KyberPolyBytes) == 0) {
                dVar2 = dVar;
                i16 |= lVarV.n(dVar2) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    z14 = z11;
                    if (lVarV.p(z14)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 16;
                i21 = PKIFailureInfo.certRevoked;
                if (i19 != 0) {
                    if ((i13 & 24576) == 0) {
                        z15 = z12;
                        if (lVarV.p(z15)) {
                            i22 = 16384;
                        } else {
                            i22 = 8192;
                        }
                        i16 |= i22;
                    }
                    i23 = i15 & 32;
                    if (i23 != 0) {
                        i16 |= 196608;
                        textStyleA = textStyle;
                    } else {
                        textStyleA = textStyle;
                        if ((i13 & 196608) == 0) {
                            if (lVarV.n(textStyleA)) {
                                i24 = 131072;
                            } else {
                                i24 = 65536;
                            }
                            i16 |= i24;
                        }
                    }
                    i25 = i15 & 64;
                    if (i25 != 0) {
                        i16 |= 1572864;
                        keyboardOptionsA = keyboardOptions;
                    } else {
                        keyboardOptionsA = keyboardOptions;
                        if ((i13 & 1572864) == 0) {
                            if (lVarV.n(keyboardOptionsA)) {
                                i26 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i26 = PKIFailureInfo.signerNotTrusted;
                            }
                            i16 |= i26;
                        }
                    }
                    i27 = i15 & 128;
                    if (i27 != 0) {
                        i16 |= 12582912;
                        zVar2 = zVar;
                    } else {
                        zVar2 = zVar;
                        if ((i13 & 12582912) == 0) {
                            if (lVarV.n(zVar2)) {
                                i28 = 8388608;
                            } else {
                                i28 = 4194304;
                            }
                            i16 |= i28;
                        }
                    }
                    i29 = i15 & 256;
                    if (i29 != 0) {
                        i16 |= 100663296;
                    } else if ((i13 & 100663296) == 0) {
                        if (lVarV.p(z13)) {
                            i31 = 67108864;
                        } else {
                            i31 = 33554432;
                        }
                        i16 |= i31;
                    }
                    if ((i13 & 805306368) != 0) {
                        i16 |= ((i15 & 512) == 0 || !lVarV.r(i11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                    }
                    i32 = i15 & 1024;
                    if (i32 != 0) {
                        i33 = i14 | 6;
                    } else if ((i14 & 6) == 0) {
                        if (lVarV.r(i12)) {
                            i34 = 4;
                        } else {
                            i34 = 2;
                        }
                        i33 = i14 | i34;
                    } else {
                        i33 = i14;
                    }
                    i35 = i15 & 2048;
                    if (i35 != 0) {
                        i33 |= 48;
                    } else if ((i14 & 48) != 0) {
                        if (lVarV.n(z0Var)) {
                            i36 = 32;
                        } else {
                            i36 = 16;
                        }
                        i33 |= i36;
                    }
                    i37 = i33;
                    i38 = i15 & 4096;
                    if (i38 != 0) {
                        i39 = i37 | KyberEngine.KyberPolyBytes;
                    } else if ((i14 & KyberEngine.KyberPolyBytes) == 0) {
                        if (lVarV.K(lVar2)) {
                            i41 = 256;
                        } else {
                            i41 = 128;
                        }
                        i39 = i37 | i41;
                    } else {
                        i39 = i37;
                    }
                    i42 = i15 & PKIFailureInfo.certRevoked;
                    if (i42 != 0) {
                        i44 = i39 | 3072;
                    } else {
                        i43 = i39;
                        if ((i14 & 3072) == 0) {
                            i44 = i43 | (lVarV.n(lVar3) ? 2048 : 1024);
                        } else {
                            i44 = i43;
                        }
                    }
                    i45 = i15 & 16384;
                    if (i45 != 0) {
                        i46 = i44;
                        if ((i14 & 24576) == 0) {
                            if (lVarV.n(h1Var)) {
                                i21 = 16384;
                            }
                            i46 |= i21;
                        }
                        i47 = i15 & 32768;
                        if (i47 != 0) {
                            i46 |= 196608;
                        } else if ((i14 & 196608) == 0) {
                            i46 |= lVarV.K(qVar) ? 131072 : 65536;
                        }
                        i48 = i46;
                        if ((i16 & 306783379) != 306783378 && (74899 & i48) == 74898 && lVarV.b()) {
                            lVarV.j();
                            i57 = i11;
                            z0Var2 = z0Var;
                            qVar2 = qVar;
                            lVar7 = lVarV;
                            z24 = z14;
                            zVar4 = zVar2;
                            z25 = z15;
                            textStyle3 = textStyleA;
                            keyboardOptions3 = keyboardOptionsA;
                            dVar3 = dVar2;
                            z23 = z13;
                            i58 = i12;
                            lVar8 = lVar2;
                            lVar9 = lVar3;
                            h1Var3 = h1Var;
                        } else {
                            lVarV.L();
                            if ((i13 & 1) != 0 || lVarV.k()) {
                                if (i59 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i17 != 0) {
                                    z14 = true;
                                }
                                if (i19 != 0) {
                                    z15 = false;
                                }
                                if (i23 != 0) {
                                    textStyleA = TextStyle.INSTANCE.a();
                                }
                                if (i25 != 0) {
                                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                                }
                                if (i27 != 0) {
                                    zVarA = z.INSTANCE.a();
                                } else {
                                    zVarA = zVar2;
                                }
                                if (i29 != 0) {
                                    z16 = false;
                                } else {
                                    z16 = z13;
                                }
                                if ((i15 & 512) != 0) {
                                    if (z16) {
                                        i49 = 1;
                                    } else {
                                        i49 = Integer.MAX_VALUE;
                                    }
                                    i16 &= -1879048193;
                                } else {
                                    i49 = i11;
                                }
                                if (i32 != 0) {
                                    i51 = 1;
                                } else {
                                    i51 = i12;
                                }
                                if (i35 != 0) {
                                    z0VarC = z0.INSTANCE.c();
                                } else {
                                    z0VarC = z0Var;
                                }
                                if (i38 != 0) {
                                    lVar5 = a.f15370c;
                                } else {
                                    lVar5 = lVar2;
                                }
                                if (i42 != 0) {
                                    lVar6 = null;
                                } else {
                                    lVar6 = lVar3;
                                }
                                if (i45 != 0) {
                                    solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                                } else {
                                    solidColor = h1Var;
                                }
                                if (i47 != 0) {
                                    boolean z26 = z14;
                                    qVarB = kotlin.f.f15524a.b();
                                    textStyle2 = textStyleA;
                                    z18 = z26;
                                    h1Var2 = solidColor;
                                    z17 = z16;
                                    i52 = i49;
                                    i53 = i51;
                                    keyboardOptions2 = keyboardOptionsA;
                                    zVar3 = zVarA;
                                    i54 = i16;
                                    z19 = z15;
                                } else {
                                    h1Var2 = solidColor;
                                    z17 = z16;
                                    i52 = i49;
                                    i53 = i51;
                                    textStyle2 = textStyleA;
                                    keyboardOptions2 = keyboardOptionsA;
                                    zVar3 = zVarA;
                                    i54 = i16;
                                    z18 = z14;
                                    z19 = z15;
                                }
                                lVarV.C();
                                if (o.J()) {
                                    o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                                }
                                ImeOptions imeOptionsG = keyboardOptions2.g(z17);
                                androidx.compose.ui.d dVar4 = dVar2;
                                q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar3 = qVarB;
                                boolean z27 = !z17;
                                if (z17) {
                                    i55 = 1;
                                } else {
                                    i55 = i53;
                                }
                                if (z17) {
                                    i56 = 1;
                                } else {
                                    i56 = i52;
                                }
                                TextStyle textStyle4 = textStyle2;
                                if ((i54 & 14) == 4) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                z22 = z21 | ((i54 & 112) == 32);
                                objI = lVarV.I();
                                if (z22 || objI == p020r2.l.INSTANCE.a()) {
                                    objI = new b(textFieldValue, lVar);
                                    lVarV.B(objI);
                                }
                                int i61 = i48 << 9;
                                int i62 = ((i54 >> 6) & 7168) | (i54 & 910) | (i61 & 57344) | (i61 & 458752) | (i61 & 3670016) | (i61 & 29360128);
                                int i63 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                                boolean z28 = z17;
                                l<? super TextLayoutResult, h0> lVar10 = lVar5;
                                KeyboardOptions keyboardOptions4 = keyboardOptions2;
                                z0 z0Var3 = z0VarC;
                                u1.l lVar11 = lVar6;
                                j.a(textFieldValue, (l) objI, dVar4, textStyle4, z0Var3, lVar10, lVar11, h1Var2, z27, i56, i55, imeOptionsG, zVar3, z18, z19, qVar3, lVarV, i62, i63, 0);
                                if (o.J()) {
                                    o.R();
                                }
                                zVar4 = zVar3;
                                lVar7 = lVarV;
                                i57 = i52;
                                i58 = i53;
                                z23 = z28;
                                z0Var2 = z0Var3;
                                z24 = z18;
                                qVar2 = qVar3;
                                lVar8 = lVar10;
                                h1Var3 = h1Var2;
                                z25 = z19;
                                keyboardOptions3 = keyboardOptions4;
                                lVar9 = lVar11;
                                textStyle3 = textStyle4;
                                dVar3 = dVar4;
                            } else {
                                lVarV.j();
                                if ((i15 & 512) != 0) {
                                    i16 &= -1879048193;
                                }
                                z17 = z13;
                                i52 = i11;
                                i53 = i12;
                                z0VarC = z0Var;
                                lVar5 = lVar2;
                                lVar6 = lVar3;
                                zVar3 = zVar2;
                                textStyle2 = textStyleA;
                                keyboardOptions2 = keyboardOptionsA;
                                i54 = i16;
                                z18 = z14;
                                z19 = z15;
                                h1Var2 = h1Var;
                            }
                            qVarB = qVar;
                            lVarV.C();
                            if (o.J()) {
                                o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                            }
                            ImeOptions imeOptionsG2 = keyboardOptions2.g(z17);
                            androidx.compose.ui.d dVar5 = dVar2;
                            q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar4 = qVarB;
                            boolean z29 = !z17;
                            if (z17) {
                                i55 = 1;
                            } else {
                                i55 = i53;
                            }
                            if (z17) {
                                i56 = 1;
                            } else {
                                i56 = i52;
                            }
                            TextStyle textStyle5 = textStyle2;
                            if ((i54 & 14) == 4) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            z22 = z21 | ((i54 & 112) == 32);
                            objI = lVarV.I();
                            if (z22) {
                                objI = new b(textFieldValue, lVar);
                                lVarV.B(objI);
                            } else {
                                objI = new b(textFieldValue, lVar);
                                lVarV.B(objI);
                            }
                            int i64 = i48 << 9;
                            int i65 = ((i54 >> 6) & 7168) | (i54 & 910) | (i64 & 57344) | (i64 & 458752) | (i64 & 3670016) | (i64 & 29360128);
                            int i66 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                            boolean z210 = z17;
                            l<? super TextLayoutResult, h0> lVar12 = lVar5;
                            KeyboardOptions keyboardOptions5 = keyboardOptions2;
                            z0 z0Var4 = z0VarC;
                            u1.l lVar13 = lVar6;
                            j.a(textFieldValue, (l) objI, dVar5, textStyle5, z0Var4, lVar12, lVar13, h1Var2, z29, i56, i55, imeOptionsG2, zVar3, z18, z19, qVar4, lVarV, i65, i66, 0);
                            if (o.J()) {
                                o.R();
                            }
                            zVar4 = zVar3;
                            lVar7 = lVarV;
                            i57 = i52;
                            i58 = i53;
                            z23 = z210;
                            z0Var2 = z0Var4;
                            z24 = z18;
                            qVar2 = qVar4;
                            lVar8 = lVar12;
                            h1Var3 = h1Var2;
                            z25 = z19;
                            keyboardOptions3 = keyboardOptions5;
                            lVar9 = lVar13;
                            textStyle3 = textStyle5;
                            dVar3 = dVar5;
                        }
                        w2VarX = lVar7.x();
                        if (w2VarX != null) {
                            w2VarX.a(new C0281c(textFieldValue, lVar, dVar3, z24, z25, textStyle3, keyboardOptions3, zVar4, z23, i57, i58, z0Var2, lVar8, lVar9, h1Var3, qVar2, i13, i14, i15));
                        }
                    }
                    i46 = i44 | 24576;
                    i47 = i15 & 32768;
                    if (i47 != 0) {
                        i46 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        i46 |= lVarV.K(qVar) ? 131072 : 65536;
                    }
                    i48 = i46;
                    if ((i16 & 306783379) != 306783378) {
                        lVarV.L();
                        if ((i13 & 1) != 0) {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = a.f15370c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                boolean z211 = z14;
                                qVarB = kotlin.f.f15524a.b();
                                textStyle2 = textStyleA;
                                z18 = z211;
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z19 = z15;
                            } else {
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                textStyle2 = textStyleA;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z18 = z14;
                                z19 = z15;
                                qVarB = qVar;
                            }
                        } else {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = a.f15370c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                boolean z212 = z14;
                                qVarB = kotlin.f.f15524a.b();
                                textStyle2 = textStyleA;
                                z18 = z212;
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z19 = z15;
                            } else {
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                textStyle2 = textStyleA;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z18 = z14;
                                z19 = z15;
                                qVarB = qVar;
                            }
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                        }
                        ImeOptions imeOptionsG3 = keyboardOptions2.g(z17);
                        androidx.compose.ui.d dVar6 = dVar2;
                        q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar5 = qVarB;
                        boolean z213 = !z17;
                        if (z17) {
                            i55 = 1;
                        } else {
                            i55 = i53;
                        }
                        if (z17) {
                            i56 = 1;
                        } else {
                            i56 = i52;
                        }
                        TextStyle textStyle6 = textStyle2;
                        if ((i54 & 14) == 4) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        z22 = z21 | ((i54 & 112) == 32);
                        objI = lVarV.I();
                        if (z22) {
                            objI = new b(textFieldValue, lVar);
                            lVarV.B(objI);
                        } else {
                            objI = new b(textFieldValue, lVar);
                            lVarV.B(objI);
                        }
                        int i67 = i48 << 9;
                        int i68 = ((i54 >> 6) & 7168) | (i54 & 910) | (i67 & 57344) | (i67 & 458752) | (i67 & 3670016) | (i67 & 29360128);
                        int i69 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                        boolean z214 = z17;
                        l<? super TextLayoutResult, h0> lVar14 = lVar5;
                        KeyboardOptions keyboardOptions6 = keyboardOptions2;
                        z0 z0Var5 = z0VarC;
                        u1.l lVar15 = lVar6;
                        j.a(textFieldValue, (l) objI, dVar6, textStyle6, z0Var5, lVar14, lVar15, h1Var2, z213, i56, i55, imeOptionsG3, zVar3, z18, z19, qVar5, lVarV, i68, i69, 0);
                        if (o.J()) {
                            o.R();
                        }
                        zVar4 = zVar3;
                        lVar7 = lVarV;
                        i57 = i52;
                        i58 = i53;
                        z23 = z214;
                        z0Var2 = z0Var5;
                        z24 = z18;
                        qVar2 = qVar5;
                        lVar8 = lVar14;
                        h1Var3 = h1Var2;
                        z25 = z19;
                        keyboardOptions3 = keyboardOptions6;
                        lVar9 = lVar15;
                        textStyle3 = textStyle6;
                        dVar3 = dVar6;
                    } else {
                        lVarV.L();
                        if ((i13 & 1) != 0) {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = a.f15370c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                boolean z215 = z14;
                                qVarB = kotlin.f.f15524a.b();
                                textStyle2 = textStyleA;
                                z18 = z215;
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z19 = z15;
                            } else {
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                textStyle2 = textStyleA;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z18 = z14;
                                z19 = z15;
                                qVarB = qVar;
                            }
                        } else {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = a.f15370c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                boolean z216 = z14;
                                qVarB = kotlin.f.f15524a.b();
                                textStyle2 = textStyleA;
                                z18 = z216;
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z19 = z15;
                            } else {
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                textStyle2 = textStyleA;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z18 = z14;
                                z19 = z15;
                                qVarB = qVar;
                            }
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                        }
                        ImeOptions imeOptionsG4 = keyboardOptions2.g(z17);
                        androidx.compose.ui.d dVar7 = dVar2;
                        q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar6 = qVarB;
                        boolean z217 = !z17;
                        if (z17) {
                            i55 = 1;
                        } else {
                            i55 = i53;
                        }
                        if (z17) {
                            i56 = 1;
                        } else {
                            i56 = i52;
                        }
                        TextStyle textStyle7 = textStyle2;
                        if ((i54 & 14) == 4) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        z22 = z21 | ((i54 & 112) == 32);
                        objI = lVarV.I();
                        if (z22) {
                            objI = new b(textFieldValue, lVar);
                            lVarV.B(objI);
                        } else {
                            objI = new b(textFieldValue, lVar);
                            lVarV.B(objI);
                        }
                        int i610 = i48 << 9;
                        int i611 = ((i54 >> 6) & 7168) | (i54 & 910) | (i610 & 57344) | (i610 & 458752) | (i610 & 3670016) | (i610 & 29360128);
                        int i612 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                        boolean z218 = z17;
                        l<? super TextLayoutResult, h0> lVar16 = lVar5;
                        KeyboardOptions keyboardOptions7 = keyboardOptions2;
                        z0 z0Var6 = z0VarC;
                        u1.l lVar17 = lVar6;
                        j.a(textFieldValue, (l) objI, dVar7, textStyle7, z0Var6, lVar16, lVar17, h1Var2, z217, i56, i55, imeOptionsG4, zVar3, z18, z19, qVar6, lVarV, i611, i612, 0);
                        if (o.J()) {
                            o.R();
                        }
                        zVar4 = zVar3;
                        lVar7 = lVarV;
                        i57 = i52;
                        i58 = i53;
                        z23 = z218;
                        z0Var2 = z0Var6;
                        z24 = z18;
                        qVar2 = qVar6;
                        lVar8 = lVar16;
                        h1Var3 = h1Var2;
                        z25 = z19;
                        keyboardOptions3 = keyboardOptions7;
                        lVar9 = lVar17;
                        textStyle3 = textStyle7;
                        dVar3 = dVar7;
                    }
                    w2VarX = lVar7.x();
                    if (w2VarX != null) {
                        w2VarX.a(new C0281c(textFieldValue, lVar, dVar3, z24, z25, textStyle3, keyboardOptions3, zVar4, z23, i57, i58, z0Var2, lVar8, lVar9, h1Var3, qVar2, i13, i14, i15));
                    }
                }
                i16 |= 24576;
                z15 = z12;
                i23 = i15 & 32;
                if (i23 != 0) {
                    i16 |= 196608;
                    textStyleA = textStyle;
                } else {
                    textStyleA = textStyle;
                    if ((i13 & 196608) == 0) {
                        if (lVarV.n(textStyleA)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i16 |= i24;
                    }
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 1572864;
                    keyboardOptionsA = keyboardOptions;
                } else {
                    keyboardOptionsA = keyboardOptions;
                    if ((i13 & 1572864) == 0) {
                        if (lVarV.n(keyboardOptionsA)) {
                            i26 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i26 = PKIFailureInfo.signerNotTrusted;
                        }
                        i16 |= i26;
                    }
                }
                i27 = i15 & 128;
                if (i27 != 0) {
                    i16 |= 12582912;
                    zVar2 = zVar;
                } else {
                    zVar2 = zVar;
                    if ((i13 & 12582912) == 0) {
                        if (lVarV.n(zVar2)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i16 |= i28;
                    }
                }
                i29 = i15 & 256;
                if (i29 != 0) {
                    i16 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (lVarV.p(z13)) {
                        i31 = 67108864;
                    } else {
                        i31 = 33554432;
                    }
                    i16 |= i31;
                }
                if ((i13 & 805306368) != 0) {
                    i16 |= ((i15 & 512) == 0 || !lVarV.r(i11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                i32 = i15 & 1024;
                if (i32 != 0) {
                    i33 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (lVarV.r(i12)) {
                        i34 = 4;
                    } else {
                        i34 = 2;
                    }
                    i33 = i14 | i34;
                } else {
                    i33 = i14;
                }
                i35 = i15 & 2048;
                if (i35 != 0) {
                    i33 |= 48;
                } else if ((i14 & 48) != 0) {
                    if (lVarV.n(z0Var)) {
                        i36 = 32;
                    } else {
                        i36 = 16;
                    }
                    i33 |= i36;
                }
                i37 = i33;
                i38 = i15 & 4096;
                if (i38 != 0) {
                    i39 = i37 | KyberEngine.KyberPolyBytes;
                } else if ((i14 & KyberEngine.KyberPolyBytes) == 0) {
                    if (lVarV.K(lVar2)) {
                        i41 = 256;
                    } else {
                        i41 = 128;
                    }
                    i39 = i37 | i41;
                } else {
                    i39 = i37;
                }
                i42 = i15 & PKIFailureInfo.certRevoked;
                if (i42 != 0) {
                    i44 = i39 | 3072;
                } else {
                    i43 = i39;
                    if ((i14 & 3072) == 0) {
                        i44 = i43 | (lVarV.n(lVar3) ? 2048 : 1024);
                    } else {
                        i44 = i43;
                    }
                }
                i45 = i15 & 16384;
                if (i45 != 0) {
                    i46 = i44;
                    if ((i14 & 24576) == 0) {
                        if (lVarV.n(h1Var)) {
                            i21 = 16384;
                        }
                        i46 |= i21;
                    }
                    i47 = i15 & 32768;
                    if (i47 != 0) {
                        i46 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        i46 |= lVarV.K(qVar) ? 131072 : 65536;
                    }
                    i48 = i46;
                    if ((i16 & 306783379) != 306783378) {
                        lVarV.L();
                        if ((i13 & 1) != 0) {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = a.f15370c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                boolean z219 = z14;
                                qVarB = kotlin.f.f15524a.b();
                                textStyle2 = textStyleA;
                                z18 = z219;
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z19 = z15;
                            } else {
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                textStyle2 = textStyleA;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z18 = z14;
                                z19 = z15;
                                qVarB = qVar;
                            }
                        } else {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = a.f15370c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                boolean z2110 = z14;
                                qVarB = kotlin.f.f15524a.b();
                                textStyle2 = textStyleA;
                                z18 = z2110;
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z19 = z15;
                            } else {
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                textStyle2 = textStyleA;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z18 = z14;
                                z19 = z15;
                                qVarB = qVar;
                            }
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                        }
                        ImeOptions imeOptionsG5 = keyboardOptions2.g(z17);
                        androidx.compose.ui.d dVar8 = dVar2;
                        q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar7 = qVarB;
                        boolean z2111 = !z17;
                        if (z17) {
                            i55 = 1;
                        } else {
                            i55 = i53;
                        }
                        if (z17) {
                            i56 = 1;
                        } else {
                            i56 = i52;
                        }
                        TextStyle textStyle8 = textStyle2;
                        if ((i54 & 14) == 4) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        z22 = z21 | ((i54 & 112) == 32);
                        objI = lVarV.I();
                        if (z22) {
                            objI = new b(textFieldValue, lVar);
                            lVarV.B(objI);
                        } else {
                            objI = new b(textFieldValue, lVar);
                            lVarV.B(objI);
                        }
                        int i613 = i48 << 9;
                        int i614 = ((i54 >> 6) & 7168) | (i54 & 910) | (i613 & 57344) | (i613 & 458752) | (i613 & 3670016) | (i613 & 29360128);
                        int i615 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                        boolean z2112 = z17;
                        l<? super TextLayoutResult, h0> lVar18 = lVar5;
                        KeyboardOptions keyboardOptions8 = keyboardOptions2;
                        z0 z0Var7 = z0VarC;
                        u1.l lVar19 = lVar6;
                        j.a(textFieldValue, (l) objI, dVar8, textStyle8, z0Var7, lVar18, lVar19, h1Var2, z2111, i56, i55, imeOptionsG5, zVar3, z18, z19, qVar7, lVarV, i614, i615, 0);
                        if (o.J()) {
                            o.R();
                        }
                        zVar4 = zVar3;
                        lVar7 = lVarV;
                        i57 = i52;
                        i58 = i53;
                        z23 = z2112;
                        z0Var2 = z0Var7;
                        z24 = z18;
                        qVar2 = qVar7;
                        lVar8 = lVar18;
                        h1Var3 = h1Var2;
                        z25 = z19;
                        keyboardOptions3 = keyboardOptions8;
                        lVar9 = lVar19;
                        textStyle3 = textStyle8;
                        dVar3 = dVar8;
                    } else {
                        lVarV.L();
                        if ((i13 & 1) != 0) {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = a.f15370c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                boolean z2113 = z14;
                                qVarB = kotlin.f.f15524a.b();
                                textStyle2 = textStyleA;
                                z18 = z2113;
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z19 = z15;
                            } else {
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                textStyle2 = textStyleA;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z18 = z14;
                                z19 = z15;
                                qVarB = qVar;
                            }
                        } else {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = a.f15370c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                boolean z2114 = z14;
                                qVarB = kotlin.f.f15524a.b();
                                textStyle2 = textStyleA;
                                z18 = z2114;
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z19 = z15;
                            } else {
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                textStyle2 = textStyleA;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z18 = z14;
                                z19 = z15;
                                qVarB = qVar;
                            }
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                        }
                        ImeOptions imeOptionsG6 = keyboardOptions2.g(z17);
                        androidx.compose.ui.d dVar9 = dVar2;
                        q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar8 = qVarB;
                        boolean z2115 = !z17;
                        if (z17) {
                            i55 = 1;
                        } else {
                            i55 = i53;
                        }
                        if (z17) {
                            i56 = 1;
                        } else {
                            i56 = i52;
                        }
                        TextStyle textStyle9 = textStyle2;
                        if ((i54 & 14) == 4) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        z22 = z21 | ((i54 & 112) == 32);
                        objI = lVarV.I();
                        if (z22) {
                            objI = new b(textFieldValue, lVar);
                            lVarV.B(objI);
                        } else {
                            objI = new b(textFieldValue, lVar);
                            lVarV.B(objI);
                        }
                        int i616 = i48 << 9;
                        int i617 = ((i54 >> 6) & 7168) | (i54 & 910) | (i616 & 57344) | (i616 & 458752) | (i616 & 3670016) | (i616 & 29360128);
                        int i618 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                        boolean z2116 = z17;
                        l<? super TextLayoutResult, h0> lVar110 = lVar5;
                        KeyboardOptions keyboardOptions9 = keyboardOptions2;
                        z0 z0Var8 = z0VarC;
                        u1.l lVar111 = lVar6;
                        j.a(textFieldValue, (l) objI, dVar9, textStyle9, z0Var8, lVar110, lVar111, h1Var2, z2115, i56, i55, imeOptionsG6, zVar3, z18, z19, qVar8, lVarV, i617, i618, 0);
                        if (o.J()) {
                            o.R();
                        }
                        zVar4 = zVar3;
                        lVar7 = lVarV;
                        i57 = i52;
                        i58 = i53;
                        z23 = z2116;
                        z0Var2 = z0Var8;
                        z24 = z18;
                        qVar2 = qVar8;
                        lVar8 = lVar110;
                        h1Var3 = h1Var2;
                        z25 = z19;
                        keyboardOptions3 = keyboardOptions9;
                        lVar9 = lVar111;
                        textStyle3 = textStyle9;
                        dVar3 = dVar9;
                    }
                    w2VarX = lVar7.x();
                    if (w2VarX != null) {
                        w2VarX.a(new C0281c(textFieldValue, lVar, dVar3, z24, z25, textStyle3, keyboardOptions3, zVar4, z23, i57, i58, z0Var2, lVar8, lVar9, h1Var3, qVar2, i13, i14, i15));
                    }
                }
                i46 = i44 | 24576;
                i47 = i15 & 32768;
                if (i47 != 0) {
                    i46 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i46 |= lVarV.K(qVar) ? 131072 : 65536;
                }
                i48 = i46;
                if ((i16 & 306783379) != 306783378) {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z2117 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z2117;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z2118 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z2118;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                    }
                    ImeOptions imeOptionsG7 = keyboardOptions2.g(z17);
                    androidx.compose.ui.d dVar10 = dVar2;
                    q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar9 = qVarB;
                    boolean z2119 = !z17;
                    if (z17) {
                        i55 = 1;
                    } else {
                        i55 = i53;
                    }
                    if (z17) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    TextStyle textStyle10 = textStyle2;
                    if ((i54 & 14) == 4) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = z21 | ((i54 & 112) == 32);
                    objI = lVarV.I();
                    if (z22) {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    } else {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    }
                    int i619 = i48 << 9;
                    int i6110 = ((i54 >> 6) & 7168) | (i54 & 910) | (i619 & 57344) | (i619 & 458752) | (i619 & 3670016) | (i619 & 29360128);
                    int i6111 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                    boolean z21110 = z17;
                    l<? super TextLayoutResult, h0> lVar112 = lVar5;
                    KeyboardOptions keyboardOptions10 = keyboardOptions2;
                    z0 z0Var9 = z0VarC;
                    u1.l lVar113 = lVar6;
                    j.a(textFieldValue, (l) objI, dVar10, textStyle10, z0Var9, lVar112, lVar113, h1Var2, z2119, i56, i55, imeOptionsG7, zVar3, z18, z19, qVar9, lVarV, i6110, i6111, 0);
                    if (o.J()) {
                        o.R();
                    }
                    zVar4 = zVar3;
                    lVar7 = lVarV;
                    i57 = i52;
                    i58 = i53;
                    z23 = z21110;
                    z0Var2 = z0Var9;
                    z24 = z18;
                    qVar2 = qVar9;
                    lVar8 = lVar112;
                    h1Var3 = h1Var2;
                    z25 = z19;
                    keyboardOptions3 = keyboardOptions10;
                    lVar9 = lVar113;
                    textStyle3 = textStyle10;
                    dVar3 = dVar10;
                } else {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z21111 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z21111;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z21112 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z21112;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                    }
                    ImeOptions imeOptionsG8 = keyboardOptions2.g(z17);
                    androidx.compose.ui.d dVar11 = dVar2;
                    q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar10 = qVarB;
                    boolean z21113 = !z17;
                    if (z17) {
                        i55 = 1;
                    } else {
                        i55 = i53;
                    }
                    if (z17) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    TextStyle textStyle11 = textStyle2;
                    if ((i54 & 14) == 4) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = z21 | ((i54 & 112) == 32);
                    objI = lVarV.I();
                    if (z22) {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    } else {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    }
                    int i6112 = i48 << 9;
                    int i6113 = ((i54 >> 6) & 7168) | (i54 & 910) | (i6112 & 57344) | (i6112 & 458752) | (i6112 & 3670016) | (i6112 & 29360128);
                    int i6114 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                    boolean z21114 = z17;
                    l<? super TextLayoutResult, h0> lVar114 = lVar5;
                    KeyboardOptions keyboardOptions11 = keyboardOptions2;
                    z0 z0Var10 = z0VarC;
                    u1.l lVar115 = lVar6;
                    j.a(textFieldValue, (l) objI, dVar11, textStyle11, z0Var10, lVar114, lVar115, h1Var2, z21113, i56, i55, imeOptionsG8, zVar3, z18, z19, qVar10, lVarV, i6113, i6114, 0);
                    if (o.J()) {
                        o.R();
                    }
                    zVar4 = zVar3;
                    lVar7 = lVarV;
                    i57 = i52;
                    i58 = i53;
                    z23 = z21114;
                    z0Var2 = z0Var10;
                    z24 = z18;
                    qVar2 = qVar10;
                    lVar8 = lVar114;
                    h1Var3 = h1Var2;
                    z25 = z19;
                    keyboardOptions3 = keyboardOptions11;
                    lVar9 = lVar115;
                    textStyle3 = textStyle11;
                    dVar3 = dVar11;
                }
                w2VarX = lVar7.x();
                if (w2VarX != null) {
                    w2VarX.a(new C0281c(textFieldValue, lVar, dVar3, z24, z25, textStyle3, keyboardOptions3, zVar4, z23, i57, i58, z0Var2, lVar8, lVar9, h1Var3, qVar2, i13, i14, i15));
                }
            }
            i16 |= 3072;
            z14 = z11;
            i19 = i15 & 16;
            i21 = PKIFailureInfo.certRevoked;
            if (i19 != 0) {
                if ((i13 & 24576) == 0) {
                    z15 = z12;
                    if (lVarV.p(z15)) {
                        i22 = 16384;
                    } else {
                        i22 = 8192;
                    }
                    i16 |= i22;
                }
                i23 = i15 & 32;
                if (i23 != 0) {
                    i16 |= 196608;
                    textStyleA = textStyle;
                } else {
                    textStyleA = textStyle;
                    if ((i13 & 196608) == 0) {
                        if (lVarV.n(textStyleA)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i16 |= i24;
                    }
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 1572864;
                    keyboardOptionsA = keyboardOptions;
                } else {
                    keyboardOptionsA = keyboardOptions;
                    if ((i13 & 1572864) == 0) {
                        if (lVarV.n(keyboardOptionsA)) {
                            i26 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i26 = PKIFailureInfo.signerNotTrusted;
                        }
                        i16 |= i26;
                    }
                }
                i27 = i15 & 128;
                if (i27 != 0) {
                    i16 |= 12582912;
                    zVar2 = zVar;
                } else {
                    zVar2 = zVar;
                    if ((i13 & 12582912) == 0) {
                        if (lVarV.n(zVar2)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i16 |= i28;
                    }
                }
                i29 = i15 & 256;
                if (i29 != 0) {
                    i16 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (lVarV.p(z13)) {
                        i31 = 67108864;
                    } else {
                        i31 = 33554432;
                    }
                    i16 |= i31;
                }
                if ((i13 & 805306368) != 0) {
                    i16 |= ((i15 & 512) == 0 || !lVarV.r(i11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                i32 = i15 & 1024;
                if (i32 != 0) {
                    i33 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (lVarV.r(i12)) {
                        i34 = 4;
                    } else {
                        i34 = 2;
                    }
                    i33 = i14 | i34;
                } else {
                    i33 = i14;
                }
                i35 = i15 & 2048;
                if (i35 != 0) {
                    i33 |= 48;
                } else if ((i14 & 48) != 0) {
                    if (lVarV.n(z0Var)) {
                        i36 = 32;
                    } else {
                        i36 = 16;
                    }
                    i33 |= i36;
                }
                i37 = i33;
                i38 = i15 & 4096;
                if (i38 != 0) {
                    i39 = i37 | KyberEngine.KyberPolyBytes;
                } else if ((i14 & KyberEngine.KyberPolyBytes) == 0) {
                    if (lVarV.K(lVar2)) {
                        i41 = 256;
                    } else {
                        i41 = 128;
                    }
                    i39 = i37 | i41;
                } else {
                    i39 = i37;
                }
                i42 = i15 & PKIFailureInfo.certRevoked;
                if (i42 != 0) {
                    i44 = i39 | 3072;
                } else {
                    i43 = i39;
                    if ((i14 & 3072) == 0) {
                        i44 = i43 | (lVarV.n(lVar3) ? 2048 : 1024);
                    } else {
                        i44 = i43;
                    }
                }
                i45 = i15 & 16384;
                if (i45 != 0) {
                    i46 = i44;
                    if ((i14 & 24576) == 0) {
                        if (lVarV.n(h1Var)) {
                            i21 = 16384;
                        }
                        i46 |= i21;
                    }
                    i47 = i15 & 32768;
                    if (i47 != 0) {
                        i46 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        i46 |= lVarV.K(qVar) ? 131072 : 65536;
                    }
                    i48 = i46;
                    if ((i16 & 306783379) != 306783378) {
                        lVarV.L();
                        if ((i13 & 1) != 0) {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = a.f15370c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                boolean z21115 = z14;
                                qVarB = kotlin.f.f15524a.b();
                                textStyle2 = textStyleA;
                                z18 = z21115;
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z19 = z15;
                            } else {
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                textStyle2 = textStyleA;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z18 = z14;
                                z19 = z15;
                                qVarB = qVar;
                            }
                        } else {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = a.f15370c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                boolean z21116 = z14;
                                qVarB = kotlin.f.f15524a.b();
                                textStyle2 = textStyleA;
                                z18 = z21116;
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z19 = z15;
                            } else {
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                textStyle2 = textStyleA;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z18 = z14;
                                z19 = z15;
                                qVarB = qVar;
                            }
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                        }
                        ImeOptions imeOptionsG9 = keyboardOptions2.g(z17);
                        androidx.compose.ui.d dVar12 = dVar2;
                        q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar11 = qVarB;
                        boolean z21117 = !z17;
                        if (z17) {
                            i55 = 1;
                        } else {
                            i55 = i53;
                        }
                        if (z17) {
                            i56 = 1;
                        } else {
                            i56 = i52;
                        }
                        TextStyle textStyle12 = textStyle2;
                        if ((i54 & 14) == 4) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        z22 = z21 | ((i54 & 112) == 32);
                        objI = lVarV.I();
                        if (z22) {
                            objI = new b(textFieldValue, lVar);
                            lVarV.B(objI);
                        } else {
                            objI = new b(textFieldValue, lVar);
                            lVarV.B(objI);
                        }
                        int i6115 = i48 << 9;
                        int i6116 = ((i54 >> 6) & 7168) | (i54 & 910) | (i6115 & 57344) | (i6115 & 458752) | (i6115 & 3670016) | (i6115 & 29360128);
                        int i6117 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                        boolean z21118 = z17;
                        l<? super TextLayoutResult, h0> lVar116 = lVar5;
                        KeyboardOptions keyboardOptions12 = keyboardOptions2;
                        z0 z0Var11 = z0VarC;
                        u1.l lVar117 = lVar6;
                        j.a(textFieldValue, (l) objI, dVar12, textStyle12, z0Var11, lVar116, lVar117, h1Var2, z21117, i56, i55, imeOptionsG9, zVar3, z18, z19, qVar11, lVarV, i6116, i6117, 0);
                        if (o.J()) {
                            o.R();
                        }
                        zVar4 = zVar3;
                        lVar7 = lVarV;
                        i57 = i52;
                        i58 = i53;
                        z23 = z21118;
                        z0Var2 = z0Var11;
                        z24 = z18;
                        qVar2 = qVar11;
                        lVar8 = lVar116;
                        h1Var3 = h1Var2;
                        z25 = z19;
                        keyboardOptions3 = keyboardOptions12;
                        lVar9 = lVar117;
                        textStyle3 = textStyle12;
                        dVar3 = dVar12;
                    } else {
                        lVarV.L();
                        if ((i13 & 1) != 0) {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = a.f15370c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                boolean z21119 = z14;
                                qVarB = kotlin.f.f15524a.b();
                                textStyle2 = textStyleA;
                                z18 = z21119;
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z19 = z15;
                            } else {
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                textStyle2 = textStyleA;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z18 = z14;
                                z19 = z15;
                                qVarB = qVar;
                            }
                        } else {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = a.f15370c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                boolean z211110 = z14;
                                qVarB = kotlin.f.f15524a.b();
                                textStyle2 = textStyleA;
                                z18 = z211110;
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z19 = z15;
                            } else {
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                textStyle2 = textStyleA;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z18 = z14;
                                z19 = z15;
                                qVarB = qVar;
                            }
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                        }
                        ImeOptions imeOptionsG10 = keyboardOptions2.g(z17);
                        androidx.compose.ui.d dVar13 = dVar2;
                        q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar12 = qVarB;
                        boolean z211111 = !z17;
                        if (z17) {
                            i55 = 1;
                        } else {
                            i55 = i53;
                        }
                        if (z17) {
                            i56 = 1;
                        } else {
                            i56 = i52;
                        }
                        TextStyle textStyle13 = textStyle2;
                        if ((i54 & 14) == 4) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        z22 = z21 | ((i54 & 112) == 32);
                        objI = lVarV.I();
                        if (z22) {
                            objI = new b(textFieldValue, lVar);
                            lVarV.B(objI);
                        } else {
                            objI = new b(textFieldValue, lVar);
                            lVarV.B(objI);
                        }
                        int i6118 = i48 << 9;
                        int i6119 = ((i54 >> 6) & 7168) | (i54 & 910) | (i6118 & 57344) | (i6118 & 458752) | (i6118 & 3670016) | (i6118 & 29360128);
                        int i61110 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                        boolean z211112 = z17;
                        l<? super TextLayoutResult, h0> lVar118 = lVar5;
                        KeyboardOptions keyboardOptions13 = keyboardOptions2;
                        z0 z0Var12 = z0VarC;
                        u1.l lVar119 = lVar6;
                        j.a(textFieldValue, (l) objI, dVar13, textStyle13, z0Var12, lVar118, lVar119, h1Var2, z211111, i56, i55, imeOptionsG10, zVar3, z18, z19, qVar12, lVarV, i6119, i61110, 0);
                        if (o.J()) {
                            o.R();
                        }
                        zVar4 = zVar3;
                        lVar7 = lVarV;
                        i57 = i52;
                        i58 = i53;
                        z23 = z211112;
                        z0Var2 = z0Var12;
                        z24 = z18;
                        qVar2 = qVar12;
                        lVar8 = lVar118;
                        h1Var3 = h1Var2;
                        z25 = z19;
                        keyboardOptions3 = keyboardOptions13;
                        lVar9 = lVar119;
                        textStyle3 = textStyle13;
                        dVar3 = dVar13;
                    }
                    w2VarX = lVar7.x();
                    if (w2VarX != null) {
                        w2VarX.a(new C0281c(textFieldValue, lVar, dVar3, z24, z25, textStyle3, keyboardOptions3, zVar4, z23, i57, i58, z0Var2, lVar8, lVar9, h1Var3, qVar2, i13, i14, i15));
                    }
                }
                i46 = i44 | 24576;
                i47 = i15 & 32768;
                if (i47 != 0) {
                    i46 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i46 |= lVarV.K(qVar) ? 131072 : 65536;
                }
                i48 = i46;
                if ((i16 & 306783379) != 306783378) {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z211113 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z211113;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z211114 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z211114;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                    }
                    ImeOptions imeOptionsG11 = keyboardOptions2.g(z17);
                    androidx.compose.ui.d dVar14 = dVar2;
                    q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar13 = qVarB;
                    boolean z211115 = !z17;
                    if (z17) {
                        i55 = 1;
                    } else {
                        i55 = i53;
                    }
                    if (z17) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    TextStyle textStyle14 = textStyle2;
                    if ((i54 & 14) == 4) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = z21 | ((i54 & 112) == 32);
                    objI = lVarV.I();
                    if (z22) {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    } else {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    }
                    int i61111 = i48 << 9;
                    int i61112 = ((i54 >> 6) & 7168) | (i54 & 910) | (i61111 & 57344) | (i61111 & 458752) | (i61111 & 3670016) | (i61111 & 29360128);
                    int i61113 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                    boolean z211116 = z17;
                    l<? super TextLayoutResult, h0> lVar1110 = lVar5;
                    KeyboardOptions keyboardOptions14 = keyboardOptions2;
                    z0 z0Var13 = z0VarC;
                    u1.l lVar1111 = lVar6;
                    j.a(textFieldValue, (l) objI, dVar14, textStyle14, z0Var13, lVar1110, lVar1111, h1Var2, z211115, i56, i55, imeOptionsG11, zVar3, z18, z19, qVar13, lVarV, i61112, i61113, 0);
                    if (o.J()) {
                        o.R();
                    }
                    zVar4 = zVar3;
                    lVar7 = lVarV;
                    i57 = i52;
                    i58 = i53;
                    z23 = z211116;
                    z0Var2 = z0Var13;
                    z24 = z18;
                    qVar2 = qVar13;
                    lVar8 = lVar1110;
                    h1Var3 = h1Var2;
                    z25 = z19;
                    keyboardOptions3 = keyboardOptions14;
                    lVar9 = lVar1111;
                    textStyle3 = textStyle14;
                    dVar3 = dVar14;
                } else {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z211117 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z211117;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z211118 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z211118;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                    }
                    ImeOptions imeOptionsG12 = keyboardOptions2.g(z17);
                    androidx.compose.ui.d dVar15 = dVar2;
                    q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar14 = qVarB;
                    boolean z211119 = !z17;
                    if (z17) {
                        i55 = 1;
                    } else {
                        i55 = i53;
                    }
                    if (z17) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    TextStyle textStyle15 = textStyle2;
                    if ((i54 & 14) == 4) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = z21 | ((i54 & 112) == 32);
                    objI = lVarV.I();
                    if (z22) {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    } else {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    }
                    int i61114 = i48 << 9;
                    int i61115 = ((i54 >> 6) & 7168) | (i54 & 910) | (i61114 & 57344) | (i61114 & 458752) | (i61114 & 3670016) | (i61114 & 29360128);
                    int i61116 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                    boolean z2111110 = z17;
                    l<? super TextLayoutResult, h0> lVar1112 = lVar5;
                    KeyboardOptions keyboardOptions15 = keyboardOptions2;
                    z0 z0Var14 = z0VarC;
                    u1.l lVar1113 = lVar6;
                    j.a(textFieldValue, (l) objI, dVar15, textStyle15, z0Var14, lVar1112, lVar1113, h1Var2, z211119, i56, i55, imeOptionsG12, zVar3, z18, z19, qVar14, lVarV, i61115, i61116, 0);
                    if (o.J()) {
                        o.R();
                    }
                    zVar4 = zVar3;
                    lVar7 = lVarV;
                    i57 = i52;
                    i58 = i53;
                    z23 = z2111110;
                    z0Var2 = z0Var14;
                    z24 = z18;
                    qVar2 = qVar14;
                    lVar8 = lVar1112;
                    h1Var3 = h1Var2;
                    z25 = z19;
                    keyboardOptions3 = keyboardOptions15;
                    lVar9 = lVar1113;
                    textStyle3 = textStyle15;
                    dVar3 = dVar15;
                }
                w2VarX = lVar7.x();
                if (w2VarX != null) {
                    w2VarX.a(new C0281c(textFieldValue, lVar, dVar3, z24, z25, textStyle3, keyboardOptions3, zVar4, z23, i57, i58, z0Var2, lVar8, lVar9, h1Var3, qVar2, i13, i14, i15));
                }
            }
            i16 |= 24576;
            z15 = z12;
            i23 = i15 & 32;
            if (i23 != 0) {
                i16 |= 196608;
                textStyleA = textStyle;
            } else {
                textStyleA = textStyle;
                if ((i13 & 196608) == 0) {
                    if (lVarV.n(textStyleA)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i16 |= i24;
                }
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
                keyboardOptionsA = keyboardOptions;
            } else {
                keyboardOptionsA = keyboardOptions;
                if ((i13 & 1572864) == 0) {
                    if (lVarV.n(keyboardOptionsA)) {
                        i26 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i26 = PKIFailureInfo.signerNotTrusted;
                    }
                    i16 |= i26;
                }
            }
            i27 = i15 & 128;
            if (i27 != 0) {
                i16 |= 12582912;
                zVar2 = zVar;
            } else {
                zVar2 = zVar;
                if ((i13 & 12582912) == 0) {
                    if (lVarV.n(zVar2)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i16 |= i28;
                }
            }
            i29 = i15 & 256;
            if (i29 != 0) {
                i16 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (lVarV.p(z13)) {
                    i31 = 67108864;
                } else {
                    i31 = 33554432;
                }
                i16 |= i31;
            }
            if ((i13 & 805306368) != 0) {
                i16 |= ((i15 & 512) == 0 || !lVarV.r(i11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            i32 = i15 & 1024;
            if (i32 != 0) {
                i33 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (lVarV.r(i12)) {
                    i34 = 4;
                } else {
                    i34 = 2;
                }
                i33 = i14 | i34;
            } else {
                i33 = i14;
            }
            i35 = i15 & 2048;
            if (i35 != 0) {
                i33 |= 48;
            } else if ((i14 & 48) != 0) {
                if (lVarV.n(z0Var)) {
                    i36 = 32;
                } else {
                    i36 = 16;
                }
                i33 |= i36;
            }
            i37 = i33;
            i38 = i15 & 4096;
            if (i38 != 0) {
                i39 = i37 | KyberEngine.KyberPolyBytes;
            } else if ((i14 & KyberEngine.KyberPolyBytes) == 0) {
                if (lVarV.K(lVar2)) {
                    i41 = 256;
                } else {
                    i41 = 128;
                }
                i39 = i37 | i41;
            } else {
                i39 = i37;
            }
            i42 = i15 & PKIFailureInfo.certRevoked;
            if (i42 != 0) {
                i44 = i39 | 3072;
            } else {
                i43 = i39;
                if ((i14 & 3072) == 0) {
                    i44 = i43 | (lVarV.n(lVar3) ? 2048 : 1024);
                } else {
                    i44 = i43;
                }
            }
            i45 = i15 & 16384;
            if (i45 != 0) {
                i46 = i44;
                if ((i14 & 24576) == 0) {
                    if (lVarV.n(h1Var)) {
                        i21 = 16384;
                    }
                    i46 |= i21;
                }
                i47 = i15 & 32768;
                if (i47 != 0) {
                    i46 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i46 |= lVarV.K(qVar) ? 131072 : 65536;
                }
                i48 = i46;
                if ((i16 & 306783379) != 306783378) {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z2111111 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z2111111;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z2111112 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z2111112;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                    }
                    ImeOptions imeOptionsG13 = keyboardOptions2.g(z17);
                    androidx.compose.ui.d dVar16 = dVar2;
                    q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar15 = qVarB;
                    boolean z2111113 = !z17;
                    if (z17) {
                        i55 = 1;
                    } else {
                        i55 = i53;
                    }
                    if (z17) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    TextStyle textStyle16 = textStyle2;
                    if ((i54 & 14) == 4) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = z21 | ((i54 & 112) == 32);
                    objI = lVarV.I();
                    if (z22) {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    } else {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    }
                    int i61117 = i48 << 9;
                    int i61118 = ((i54 >> 6) & 7168) | (i54 & 910) | (i61117 & 57344) | (i61117 & 458752) | (i61117 & 3670016) | (i61117 & 29360128);
                    int i61119 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                    boolean z2111114 = z17;
                    l<? super TextLayoutResult, h0> lVar1114 = lVar5;
                    KeyboardOptions keyboardOptions16 = keyboardOptions2;
                    z0 z0Var15 = z0VarC;
                    u1.l lVar1115 = lVar6;
                    j.a(textFieldValue, (l) objI, dVar16, textStyle16, z0Var15, lVar1114, lVar1115, h1Var2, z2111113, i56, i55, imeOptionsG13, zVar3, z18, z19, qVar15, lVarV, i61118, i61119, 0);
                    if (o.J()) {
                        o.R();
                    }
                    zVar4 = zVar3;
                    lVar7 = lVarV;
                    i57 = i52;
                    i58 = i53;
                    z23 = z2111114;
                    z0Var2 = z0Var15;
                    z24 = z18;
                    qVar2 = qVar15;
                    lVar8 = lVar1114;
                    h1Var3 = h1Var2;
                    z25 = z19;
                    keyboardOptions3 = keyboardOptions16;
                    lVar9 = lVar1115;
                    textStyle3 = textStyle16;
                    dVar3 = dVar16;
                } else {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z2111115 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z2111115;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z2111116 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z2111116;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                    }
                    ImeOptions imeOptionsG14 = keyboardOptions2.g(z17);
                    androidx.compose.ui.d dVar17 = dVar2;
                    q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar16 = qVarB;
                    boolean z2111117 = !z17;
                    if (z17) {
                        i55 = 1;
                    } else {
                        i55 = i53;
                    }
                    if (z17) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    TextStyle textStyle17 = textStyle2;
                    if ((i54 & 14) == 4) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = z21 | ((i54 & 112) == 32);
                    objI = lVarV.I();
                    if (z22) {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    } else {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    }
                    int i611110 = i48 << 9;
                    int i611111 = ((i54 >> 6) & 7168) | (i54 & 910) | (i611110 & 57344) | (i611110 & 458752) | (i611110 & 3670016) | (i611110 & 29360128);
                    int i611112 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                    boolean z2111118 = z17;
                    l<? super TextLayoutResult, h0> lVar1116 = lVar5;
                    KeyboardOptions keyboardOptions17 = keyboardOptions2;
                    z0 z0Var16 = z0VarC;
                    u1.l lVar1117 = lVar6;
                    j.a(textFieldValue, (l) objI, dVar17, textStyle17, z0Var16, lVar1116, lVar1117, h1Var2, z2111117, i56, i55, imeOptionsG14, zVar3, z18, z19, qVar16, lVarV, i611111, i611112, 0);
                    if (o.J()) {
                        o.R();
                    }
                    zVar4 = zVar3;
                    lVar7 = lVarV;
                    i57 = i52;
                    i58 = i53;
                    z23 = z2111118;
                    z0Var2 = z0Var16;
                    z24 = z18;
                    qVar2 = qVar16;
                    lVar8 = lVar1116;
                    h1Var3 = h1Var2;
                    z25 = z19;
                    keyboardOptions3 = keyboardOptions17;
                    lVar9 = lVar1117;
                    textStyle3 = textStyle17;
                    dVar3 = dVar17;
                }
                w2VarX = lVar7.x();
                if (w2VarX != null) {
                    w2VarX.a(new C0281c(textFieldValue, lVar, dVar3, z24, z25, textStyle3, keyboardOptions3, zVar4, z23, i57, i58, z0Var2, lVar8, lVar9, h1Var3, qVar2, i13, i14, i15));
                }
            }
            i46 = i44 | 24576;
            i47 = i15 & 32768;
            if (i47 != 0) {
                i46 |= 196608;
            } else if ((i14 & 196608) == 0) {
                i46 |= lVarV.K(qVar) ? 131072 : 65536;
            }
            i48 = i46;
            if ((i16 & 306783379) != 306783378) {
                lVarV.L();
                if ((i13 & 1) != 0) {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = a.f15370c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        boolean z2111119 = z14;
                        qVarB = kotlin.f.f15524a.b();
                        textStyle2 = textStyleA;
                        z18 = z2111119;
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z19 = z15;
                    } else {
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z18 = z14;
                        z19 = z15;
                        qVarB = qVar;
                    }
                } else {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = a.f15370c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        boolean z21111110 = z14;
                        qVarB = kotlin.f.f15524a.b();
                        textStyle2 = textStyleA;
                        z18 = z21111110;
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z19 = z15;
                    } else {
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z18 = z14;
                        z19 = z15;
                        qVarB = qVar;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                }
                ImeOptions imeOptionsG15 = keyboardOptions2.g(z17);
                androidx.compose.ui.d dVar18 = dVar2;
                q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar17 = qVarB;
                boolean z21111111 = !z17;
                if (z17) {
                    i55 = 1;
                } else {
                    i55 = i53;
                }
                if (z17) {
                    i56 = 1;
                } else {
                    i56 = i52;
                }
                TextStyle textStyle18 = textStyle2;
                if ((i54 & 14) == 4) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                z22 = z21 | ((i54 & 112) == 32);
                objI = lVarV.I();
                if (z22) {
                    objI = new b(textFieldValue, lVar);
                    lVarV.B(objI);
                } else {
                    objI = new b(textFieldValue, lVar);
                    lVarV.B(objI);
                }
                int i611113 = i48 << 9;
                int i611114 = ((i54 >> 6) & 7168) | (i54 & 910) | (i611113 & 57344) | (i611113 & 458752) | (i611113 & 3670016) | (i611113 & 29360128);
                int i611115 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                boolean z21111112 = z17;
                l<? super TextLayoutResult, h0> lVar1118 = lVar5;
                KeyboardOptions keyboardOptions18 = keyboardOptions2;
                z0 z0Var17 = z0VarC;
                u1.l lVar1119 = lVar6;
                j.a(textFieldValue, (l) objI, dVar18, textStyle18, z0Var17, lVar1118, lVar1119, h1Var2, z21111111, i56, i55, imeOptionsG15, zVar3, z18, z19, qVar17, lVarV, i611114, i611115, 0);
                if (o.J()) {
                    o.R();
                }
                zVar4 = zVar3;
                lVar7 = lVarV;
                i57 = i52;
                i58 = i53;
                z23 = z21111112;
                z0Var2 = z0Var17;
                z24 = z18;
                qVar2 = qVar17;
                lVar8 = lVar1118;
                h1Var3 = h1Var2;
                z25 = z19;
                keyboardOptions3 = keyboardOptions18;
                lVar9 = lVar1119;
                textStyle3 = textStyle18;
                dVar3 = dVar18;
            } else {
                lVarV.L();
                if ((i13 & 1) != 0) {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = a.f15370c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        boolean z21111113 = z14;
                        qVarB = kotlin.f.f15524a.b();
                        textStyle2 = textStyleA;
                        z18 = z21111113;
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z19 = z15;
                    } else {
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z18 = z14;
                        z19 = z15;
                        qVarB = qVar;
                    }
                } else {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = a.f15370c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        boolean z21111114 = z14;
                        qVarB = kotlin.f.f15524a.b();
                        textStyle2 = textStyleA;
                        z18 = z21111114;
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z19 = z15;
                    } else {
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z18 = z14;
                        z19 = z15;
                        qVarB = qVar;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                }
                ImeOptions imeOptionsG16 = keyboardOptions2.g(z17);
                androidx.compose.ui.d dVar19 = dVar2;
                q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar18 = qVarB;
                boolean z21111115 = !z17;
                if (z17) {
                    i55 = 1;
                } else {
                    i55 = i53;
                }
                if (z17) {
                    i56 = 1;
                } else {
                    i56 = i52;
                }
                TextStyle textStyle19 = textStyle2;
                if ((i54 & 14) == 4) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                z22 = z21 | ((i54 & 112) == 32);
                objI = lVarV.I();
                if (z22) {
                    objI = new b(textFieldValue, lVar);
                    lVarV.B(objI);
                } else {
                    objI = new b(textFieldValue, lVar);
                    lVarV.B(objI);
                }
                int i611116 = i48 << 9;
                int i611117 = ((i54 >> 6) & 7168) | (i54 & 910) | (i611116 & 57344) | (i611116 & 458752) | (i611116 & 3670016) | (i611116 & 29360128);
                int i611118 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                boolean z21111116 = z17;
                l<? super TextLayoutResult, h0> lVar11110 = lVar5;
                KeyboardOptions keyboardOptions19 = keyboardOptions2;
                z0 z0Var18 = z0VarC;
                u1.l lVar11111 = lVar6;
                j.a(textFieldValue, (l) objI, dVar19, textStyle19, z0Var18, lVar11110, lVar11111, h1Var2, z21111115, i56, i55, imeOptionsG16, zVar3, z18, z19, qVar18, lVarV, i611117, i611118, 0);
                if (o.J()) {
                    o.R();
                }
                zVar4 = zVar3;
                lVar7 = lVarV;
                i57 = i52;
                i58 = i53;
                z23 = z21111116;
                z0Var2 = z0Var18;
                z24 = z18;
                qVar2 = qVar18;
                lVar8 = lVar11110;
                h1Var3 = h1Var2;
                z25 = z19;
                keyboardOptions3 = keyboardOptions19;
                lVar9 = lVar11111;
                textStyle3 = textStyle19;
                dVar3 = dVar19;
            }
            w2VarX = lVar7.x();
            if (w2VarX != null) {
                w2VarX.a(new C0281c(textFieldValue, lVar, dVar3, z24, z25, textStyle3, keyboardOptions3, zVar4, z23, i57, i58, z0Var2, lVar8, lVar9, h1Var3, qVar2, i13, i14, i15));
            }
        }
        i16 |= KyberEngine.KyberPolyBytes;
        dVar2 = dVar;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i13 & 3072) == 0) {
                z14 = z11;
                if (lVarV.p(z14)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            i19 = i15 & 16;
            i21 = PKIFailureInfo.certRevoked;
            if (i19 != 0) {
                if ((i13 & 24576) == 0) {
                    z15 = z12;
                    if (lVarV.p(z15)) {
                        i22 = 16384;
                    } else {
                        i22 = 8192;
                    }
                    i16 |= i22;
                }
                i23 = i15 & 32;
                if (i23 != 0) {
                    i16 |= 196608;
                    textStyleA = textStyle;
                } else {
                    textStyleA = textStyle;
                    if ((i13 & 196608) == 0) {
                        if (lVarV.n(textStyleA)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i16 |= i24;
                    }
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 1572864;
                    keyboardOptionsA = keyboardOptions;
                } else {
                    keyboardOptionsA = keyboardOptions;
                    if ((i13 & 1572864) == 0) {
                        if (lVarV.n(keyboardOptionsA)) {
                            i26 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i26 = PKIFailureInfo.signerNotTrusted;
                        }
                        i16 |= i26;
                    }
                }
                i27 = i15 & 128;
                if (i27 != 0) {
                    i16 |= 12582912;
                    zVar2 = zVar;
                } else {
                    zVar2 = zVar;
                    if ((i13 & 12582912) == 0) {
                        if (lVarV.n(zVar2)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i16 |= i28;
                    }
                }
                i29 = i15 & 256;
                if (i29 != 0) {
                    i16 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (lVarV.p(z13)) {
                        i31 = 67108864;
                    } else {
                        i31 = 33554432;
                    }
                    i16 |= i31;
                }
                if ((i13 & 805306368) != 0) {
                    i16 |= ((i15 & 512) == 0 || !lVarV.r(i11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                i32 = i15 & 1024;
                if (i32 != 0) {
                    i33 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (lVarV.r(i12)) {
                        i34 = 4;
                    } else {
                        i34 = 2;
                    }
                    i33 = i14 | i34;
                } else {
                    i33 = i14;
                }
                i35 = i15 & 2048;
                if (i35 != 0) {
                    i33 |= 48;
                } else if ((i14 & 48) != 0) {
                    if (lVarV.n(z0Var)) {
                        i36 = 32;
                    } else {
                        i36 = 16;
                    }
                    i33 |= i36;
                }
                i37 = i33;
                i38 = i15 & 4096;
                if (i38 != 0) {
                    i39 = i37 | KyberEngine.KyberPolyBytes;
                } else if ((i14 & KyberEngine.KyberPolyBytes) == 0) {
                    if (lVarV.K(lVar2)) {
                        i41 = 256;
                    } else {
                        i41 = 128;
                    }
                    i39 = i37 | i41;
                } else {
                    i39 = i37;
                }
                i42 = i15 & PKIFailureInfo.certRevoked;
                if (i42 != 0) {
                    i44 = i39 | 3072;
                } else {
                    i43 = i39;
                    if ((i14 & 3072) == 0) {
                        i44 = i43 | (lVarV.n(lVar3) ? 2048 : 1024);
                    } else {
                        i44 = i43;
                    }
                }
                i45 = i15 & 16384;
                if (i45 != 0) {
                    i46 = i44;
                    if ((i14 & 24576) == 0) {
                        if (lVarV.n(h1Var)) {
                            i21 = 16384;
                        }
                        i46 |= i21;
                    }
                    i47 = i15 & 32768;
                    if (i47 != 0) {
                        i46 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        i46 |= lVarV.K(qVar) ? 131072 : 65536;
                    }
                    i48 = i46;
                    if ((i16 & 306783379) != 306783378) {
                        lVarV.L();
                        if ((i13 & 1) != 0) {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = a.f15370c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                boolean z21111117 = z14;
                                qVarB = kotlin.f.f15524a.b();
                                textStyle2 = textStyleA;
                                z18 = z21111117;
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z19 = z15;
                            } else {
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                textStyle2 = textStyleA;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z18 = z14;
                                z19 = z15;
                                qVarB = qVar;
                            }
                        } else {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = a.f15370c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                boolean z21111118 = z14;
                                qVarB = kotlin.f.f15524a.b();
                                textStyle2 = textStyleA;
                                z18 = z21111118;
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z19 = z15;
                            } else {
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                textStyle2 = textStyleA;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z18 = z14;
                                z19 = z15;
                                qVarB = qVar;
                            }
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                        }
                        ImeOptions imeOptionsG17 = keyboardOptions2.g(z17);
                        androidx.compose.ui.d dVar110 = dVar2;
                        q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar19 = qVarB;
                        boolean z21111119 = !z17;
                        if (z17) {
                            i55 = 1;
                        } else {
                            i55 = i53;
                        }
                        if (z17) {
                            i56 = 1;
                        } else {
                            i56 = i52;
                        }
                        TextStyle textStyle110 = textStyle2;
                        if ((i54 & 14) == 4) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        z22 = z21 | ((i54 & 112) == 32);
                        objI = lVarV.I();
                        if (z22) {
                            objI = new b(textFieldValue, lVar);
                            lVarV.B(objI);
                        } else {
                            objI = new b(textFieldValue, lVar);
                            lVarV.B(objI);
                        }
                        int i611119 = i48 << 9;
                        int i6111110 = ((i54 >> 6) & 7168) | (i54 & 910) | (i611119 & 57344) | (i611119 & 458752) | (i611119 & 3670016) | (i611119 & 29360128);
                        int i6111111 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                        boolean z211111110 = z17;
                        l<? super TextLayoutResult, h0> lVar11112 = lVar5;
                        KeyboardOptions keyboardOptions110 = keyboardOptions2;
                        z0 z0Var19 = z0VarC;
                        u1.l lVar11113 = lVar6;
                        j.a(textFieldValue, (l) objI, dVar110, textStyle110, z0Var19, lVar11112, lVar11113, h1Var2, z21111119, i56, i55, imeOptionsG17, zVar3, z18, z19, qVar19, lVarV, i6111110, i6111111, 0);
                        if (o.J()) {
                            o.R();
                        }
                        zVar4 = zVar3;
                        lVar7 = lVarV;
                        i57 = i52;
                        i58 = i53;
                        z23 = z211111110;
                        z0Var2 = z0Var19;
                        z24 = z18;
                        qVar2 = qVar19;
                        lVar8 = lVar11112;
                        h1Var3 = h1Var2;
                        z25 = z19;
                        keyboardOptions3 = keyboardOptions110;
                        lVar9 = lVar11113;
                        textStyle3 = textStyle110;
                        dVar3 = dVar110;
                    } else {
                        lVarV.L();
                        if ((i13 & 1) != 0) {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = a.f15370c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                boolean z211111111 = z14;
                                qVarB = kotlin.f.f15524a.b();
                                textStyle2 = textStyleA;
                                z18 = z211111111;
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z19 = z15;
                            } else {
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                textStyle2 = textStyleA;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z18 = z14;
                                z19 = z15;
                                qVarB = qVar;
                            }
                        } else {
                            if (i59 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            }
                            if (i23 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i25 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            }
                            if (i27 != 0) {
                                zVarA = z.INSTANCE.a();
                            } else {
                                zVarA = zVar2;
                            }
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                if (z16) {
                                    i49 = 1;
                                } else {
                                    i49 = Integer.MAX_VALUE;
                                }
                                i16 &= -1879048193;
                            } else {
                                i49 = i11;
                            }
                            if (i32 != 0) {
                                i51 = 1;
                            } else {
                                i51 = i12;
                            }
                            if (i35 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i38 != 0) {
                                lVar5 = a.f15370c;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i42 != 0) {
                                lVar6 = null;
                            } else {
                                lVar6 = lVar3;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                            } else {
                                solidColor = h1Var;
                            }
                            if (i47 != 0) {
                                boolean z211111112 = z14;
                                qVarB = kotlin.f.f15524a.b();
                                textStyle2 = textStyleA;
                                z18 = z211111112;
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z19 = z15;
                            } else {
                                h1Var2 = solidColor;
                                z17 = z16;
                                i52 = i49;
                                i53 = i51;
                                textStyle2 = textStyleA;
                                keyboardOptions2 = keyboardOptionsA;
                                zVar3 = zVarA;
                                i54 = i16;
                                z18 = z14;
                                z19 = z15;
                                qVarB = qVar;
                            }
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                        }
                        ImeOptions imeOptionsG18 = keyboardOptions2.g(z17);
                        androidx.compose.ui.d dVar111 = dVar2;
                        q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar110 = qVarB;
                        boolean z211111113 = !z17;
                        if (z17) {
                            i55 = 1;
                        } else {
                            i55 = i53;
                        }
                        if (z17) {
                            i56 = 1;
                        } else {
                            i56 = i52;
                        }
                        TextStyle textStyle111 = textStyle2;
                        if ((i54 & 14) == 4) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        z22 = z21 | ((i54 & 112) == 32);
                        objI = lVarV.I();
                        if (z22) {
                            objI = new b(textFieldValue, lVar);
                            lVarV.B(objI);
                        } else {
                            objI = new b(textFieldValue, lVar);
                            lVarV.B(objI);
                        }
                        int i6111112 = i48 << 9;
                        int i6111113 = ((i54 >> 6) & 7168) | (i54 & 910) | (i6111112 & 57344) | (i6111112 & 458752) | (i6111112 & 3670016) | (i6111112 & 29360128);
                        int i6111114 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                        boolean z211111114 = z17;
                        l<? super TextLayoutResult, h0> lVar11114 = lVar5;
                        KeyboardOptions keyboardOptions111 = keyboardOptions2;
                        z0 z0Var110 = z0VarC;
                        u1.l lVar11115 = lVar6;
                        j.a(textFieldValue, (l) objI, dVar111, textStyle111, z0Var110, lVar11114, lVar11115, h1Var2, z211111113, i56, i55, imeOptionsG18, zVar3, z18, z19, qVar110, lVarV, i6111113, i6111114, 0);
                        if (o.J()) {
                            o.R();
                        }
                        zVar4 = zVar3;
                        lVar7 = lVarV;
                        i57 = i52;
                        i58 = i53;
                        z23 = z211111114;
                        z0Var2 = z0Var110;
                        z24 = z18;
                        qVar2 = qVar110;
                        lVar8 = lVar11114;
                        h1Var3 = h1Var2;
                        z25 = z19;
                        keyboardOptions3 = keyboardOptions111;
                        lVar9 = lVar11115;
                        textStyle3 = textStyle111;
                        dVar3 = dVar111;
                    }
                    w2VarX = lVar7.x();
                    if (w2VarX != null) {
                        w2VarX.a(new C0281c(textFieldValue, lVar, dVar3, z24, z25, textStyle3, keyboardOptions3, zVar4, z23, i57, i58, z0Var2, lVar8, lVar9, h1Var3, qVar2, i13, i14, i15));
                    }
                }
                i46 = i44 | 24576;
                i47 = i15 & 32768;
                if (i47 != 0) {
                    i46 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i46 |= lVarV.K(qVar) ? 131072 : 65536;
                }
                i48 = i46;
                if ((i16 & 306783379) != 306783378) {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z211111115 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z211111115;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z211111116 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z211111116;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                    }
                    ImeOptions imeOptionsG19 = keyboardOptions2.g(z17);
                    androidx.compose.ui.d dVar112 = dVar2;
                    q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar111 = qVarB;
                    boolean z211111117 = !z17;
                    if (z17) {
                        i55 = 1;
                    } else {
                        i55 = i53;
                    }
                    if (z17) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    TextStyle textStyle112 = textStyle2;
                    if ((i54 & 14) == 4) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = z21 | ((i54 & 112) == 32);
                    objI = lVarV.I();
                    if (z22) {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    } else {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    }
                    int i6111115 = i48 << 9;
                    int i6111116 = ((i54 >> 6) & 7168) | (i54 & 910) | (i6111115 & 57344) | (i6111115 & 458752) | (i6111115 & 3670016) | (i6111115 & 29360128);
                    int i6111117 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                    boolean z211111118 = z17;
                    l<? super TextLayoutResult, h0> lVar11116 = lVar5;
                    KeyboardOptions keyboardOptions112 = keyboardOptions2;
                    z0 z0Var111 = z0VarC;
                    u1.l lVar11117 = lVar6;
                    j.a(textFieldValue, (l) objI, dVar112, textStyle112, z0Var111, lVar11116, lVar11117, h1Var2, z211111117, i56, i55, imeOptionsG19, zVar3, z18, z19, qVar111, lVarV, i6111116, i6111117, 0);
                    if (o.J()) {
                        o.R();
                    }
                    zVar4 = zVar3;
                    lVar7 = lVarV;
                    i57 = i52;
                    i58 = i53;
                    z23 = z211111118;
                    z0Var2 = z0Var111;
                    z24 = z18;
                    qVar2 = qVar111;
                    lVar8 = lVar11116;
                    h1Var3 = h1Var2;
                    z25 = z19;
                    keyboardOptions3 = keyboardOptions112;
                    lVar9 = lVar11117;
                    textStyle3 = textStyle112;
                    dVar3 = dVar112;
                } else {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z211111119 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z211111119;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z2111111110 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z2111111110;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                    }
                    ImeOptions imeOptionsG110 = keyboardOptions2.g(z17);
                    androidx.compose.ui.d dVar113 = dVar2;
                    q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar112 = qVarB;
                    boolean z2111111111 = !z17;
                    if (z17) {
                        i55 = 1;
                    } else {
                        i55 = i53;
                    }
                    if (z17) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    TextStyle textStyle113 = textStyle2;
                    if ((i54 & 14) == 4) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = z21 | ((i54 & 112) == 32);
                    objI = lVarV.I();
                    if (z22) {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    } else {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    }
                    int i6111118 = i48 << 9;
                    int i6111119 = ((i54 >> 6) & 7168) | (i54 & 910) | (i6111118 & 57344) | (i6111118 & 458752) | (i6111118 & 3670016) | (i6111118 & 29360128);
                    int i61111110 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                    boolean z2111111112 = z17;
                    l<? super TextLayoutResult, h0> lVar11118 = lVar5;
                    KeyboardOptions keyboardOptions113 = keyboardOptions2;
                    z0 z0Var112 = z0VarC;
                    u1.l lVar11119 = lVar6;
                    j.a(textFieldValue, (l) objI, dVar113, textStyle113, z0Var112, lVar11118, lVar11119, h1Var2, z2111111111, i56, i55, imeOptionsG110, zVar3, z18, z19, qVar112, lVarV, i6111119, i61111110, 0);
                    if (o.J()) {
                        o.R();
                    }
                    zVar4 = zVar3;
                    lVar7 = lVarV;
                    i57 = i52;
                    i58 = i53;
                    z23 = z2111111112;
                    z0Var2 = z0Var112;
                    z24 = z18;
                    qVar2 = qVar112;
                    lVar8 = lVar11118;
                    h1Var3 = h1Var2;
                    z25 = z19;
                    keyboardOptions3 = keyboardOptions113;
                    lVar9 = lVar11119;
                    textStyle3 = textStyle113;
                    dVar3 = dVar113;
                }
                w2VarX = lVar7.x();
                if (w2VarX != null) {
                    w2VarX.a(new C0281c(textFieldValue, lVar, dVar3, z24, z25, textStyle3, keyboardOptions3, zVar4, z23, i57, i58, z0Var2, lVar8, lVar9, h1Var3, qVar2, i13, i14, i15));
                }
            }
            i16 |= 24576;
            z15 = z12;
            i23 = i15 & 32;
            if (i23 != 0) {
                i16 |= 196608;
                textStyleA = textStyle;
            } else {
                textStyleA = textStyle;
                if ((i13 & 196608) == 0) {
                    if (lVarV.n(textStyleA)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i16 |= i24;
                }
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
                keyboardOptionsA = keyboardOptions;
            } else {
                keyboardOptionsA = keyboardOptions;
                if ((i13 & 1572864) == 0) {
                    if (lVarV.n(keyboardOptionsA)) {
                        i26 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i26 = PKIFailureInfo.signerNotTrusted;
                    }
                    i16 |= i26;
                }
            }
            i27 = i15 & 128;
            if (i27 != 0) {
                i16 |= 12582912;
                zVar2 = zVar;
            } else {
                zVar2 = zVar;
                if ((i13 & 12582912) == 0) {
                    if (lVarV.n(zVar2)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i16 |= i28;
                }
            }
            i29 = i15 & 256;
            if (i29 != 0) {
                i16 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (lVarV.p(z13)) {
                    i31 = 67108864;
                } else {
                    i31 = 33554432;
                }
                i16 |= i31;
            }
            if ((i13 & 805306368) != 0) {
                i16 |= ((i15 & 512) == 0 || !lVarV.r(i11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            i32 = i15 & 1024;
            if (i32 != 0) {
                i33 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (lVarV.r(i12)) {
                    i34 = 4;
                } else {
                    i34 = 2;
                }
                i33 = i14 | i34;
            } else {
                i33 = i14;
            }
            i35 = i15 & 2048;
            if (i35 != 0) {
                i33 |= 48;
            } else if ((i14 & 48) != 0) {
                if (lVarV.n(z0Var)) {
                    i36 = 32;
                } else {
                    i36 = 16;
                }
                i33 |= i36;
            }
            i37 = i33;
            i38 = i15 & 4096;
            if (i38 != 0) {
                i39 = i37 | KyberEngine.KyberPolyBytes;
            } else if ((i14 & KyberEngine.KyberPolyBytes) == 0) {
                if (lVarV.K(lVar2)) {
                    i41 = 256;
                } else {
                    i41 = 128;
                }
                i39 = i37 | i41;
            } else {
                i39 = i37;
            }
            i42 = i15 & PKIFailureInfo.certRevoked;
            if (i42 != 0) {
                i44 = i39 | 3072;
            } else {
                i43 = i39;
                if ((i14 & 3072) == 0) {
                    i44 = i43 | (lVarV.n(lVar3) ? 2048 : 1024);
                } else {
                    i44 = i43;
                }
            }
            i45 = i15 & 16384;
            if (i45 != 0) {
                i46 = i44;
                if ((i14 & 24576) == 0) {
                    if (lVarV.n(h1Var)) {
                        i21 = 16384;
                    }
                    i46 |= i21;
                }
                i47 = i15 & 32768;
                if (i47 != 0) {
                    i46 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i46 |= lVarV.K(qVar) ? 131072 : 65536;
                }
                i48 = i46;
                if ((i16 & 306783379) != 306783378) {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z2111111113 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z2111111113;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z2111111114 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z2111111114;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                    }
                    ImeOptions imeOptionsG111 = keyboardOptions2.g(z17);
                    androidx.compose.ui.d dVar114 = dVar2;
                    q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar113 = qVarB;
                    boolean z2111111115 = !z17;
                    if (z17) {
                        i55 = 1;
                    } else {
                        i55 = i53;
                    }
                    if (z17) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    TextStyle textStyle114 = textStyle2;
                    if ((i54 & 14) == 4) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = z21 | ((i54 & 112) == 32);
                    objI = lVarV.I();
                    if (z22) {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    } else {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    }
                    int i61111111 = i48 << 9;
                    int i61111112 = ((i54 >> 6) & 7168) | (i54 & 910) | (i61111111 & 57344) | (i61111111 & 458752) | (i61111111 & 3670016) | (i61111111 & 29360128);
                    int i61111113 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                    boolean z2111111116 = z17;
                    l<? super TextLayoutResult, h0> lVar111110 = lVar5;
                    KeyboardOptions keyboardOptions114 = keyboardOptions2;
                    z0 z0Var113 = z0VarC;
                    u1.l lVar111111 = lVar6;
                    j.a(textFieldValue, (l) objI, dVar114, textStyle114, z0Var113, lVar111110, lVar111111, h1Var2, z2111111115, i56, i55, imeOptionsG111, zVar3, z18, z19, qVar113, lVarV, i61111112, i61111113, 0);
                    if (o.J()) {
                        o.R();
                    }
                    zVar4 = zVar3;
                    lVar7 = lVarV;
                    i57 = i52;
                    i58 = i53;
                    z23 = z2111111116;
                    z0Var2 = z0Var113;
                    z24 = z18;
                    qVar2 = qVar113;
                    lVar8 = lVar111110;
                    h1Var3 = h1Var2;
                    z25 = z19;
                    keyboardOptions3 = keyboardOptions114;
                    lVar9 = lVar111111;
                    textStyle3 = textStyle114;
                    dVar3 = dVar114;
                } else {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z2111111117 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z2111111117;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z2111111118 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z2111111118;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                    }
                    ImeOptions imeOptionsG112 = keyboardOptions2.g(z17);
                    androidx.compose.ui.d dVar115 = dVar2;
                    q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar114 = qVarB;
                    boolean z2111111119 = !z17;
                    if (z17) {
                        i55 = 1;
                    } else {
                        i55 = i53;
                    }
                    if (z17) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    TextStyle textStyle115 = textStyle2;
                    if ((i54 & 14) == 4) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = z21 | ((i54 & 112) == 32);
                    objI = lVarV.I();
                    if (z22) {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    } else {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    }
                    int i61111114 = i48 << 9;
                    int i61111115 = ((i54 >> 6) & 7168) | (i54 & 910) | (i61111114 & 57344) | (i61111114 & 458752) | (i61111114 & 3670016) | (i61111114 & 29360128);
                    int i61111116 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                    boolean z21111111110 = z17;
                    l<? super TextLayoutResult, h0> lVar111112 = lVar5;
                    KeyboardOptions keyboardOptions115 = keyboardOptions2;
                    z0 z0Var114 = z0VarC;
                    u1.l lVar111113 = lVar6;
                    j.a(textFieldValue, (l) objI, dVar115, textStyle115, z0Var114, lVar111112, lVar111113, h1Var2, z2111111119, i56, i55, imeOptionsG112, zVar3, z18, z19, qVar114, lVarV, i61111115, i61111116, 0);
                    if (o.J()) {
                        o.R();
                    }
                    zVar4 = zVar3;
                    lVar7 = lVarV;
                    i57 = i52;
                    i58 = i53;
                    z23 = z21111111110;
                    z0Var2 = z0Var114;
                    z24 = z18;
                    qVar2 = qVar114;
                    lVar8 = lVar111112;
                    h1Var3 = h1Var2;
                    z25 = z19;
                    keyboardOptions3 = keyboardOptions115;
                    lVar9 = lVar111113;
                    textStyle3 = textStyle115;
                    dVar3 = dVar115;
                }
                w2VarX = lVar7.x();
                if (w2VarX != null) {
                    w2VarX.a(new C0281c(textFieldValue, lVar, dVar3, z24, z25, textStyle3, keyboardOptions3, zVar4, z23, i57, i58, z0Var2, lVar8, lVar9, h1Var3, qVar2, i13, i14, i15));
                }
            }
            i46 = i44 | 24576;
            i47 = i15 & 32768;
            if (i47 != 0) {
                i46 |= 196608;
            } else if ((i14 & 196608) == 0) {
                i46 |= lVarV.K(qVar) ? 131072 : 65536;
            }
            i48 = i46;
            if ((i16 & 306783379) != 306783378) {
                lVarV.L();
                if ((i13 & 1) != 0) {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = a.f15370c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        boolean z21111111111 = z14;
                        qVarB = kotlin.f.f15524a.b();
                        textStyle2 = textStyleA;
                        z18 = z21111111111;
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z19 = z15;
                    } else {
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z18 = z14;
                        z19 = z15;
                        qVarB = qVar;
                    }
                } else {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = a.f15370c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        boolean z21111111112 = z14;
                        qVarB = kotlin.f.f15524a.b();
                        textStyle2 = textStyleA;
                        z18 = z21111111112;
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z19 = z15;
                    } else {
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z18 = z14;
                        z19 = z15;
                        qVarB = qVar;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                }
                ImeOptions imeOptionsG113 = keyboardOptions2.g(z17);
                androidx.compose.ui.d dVar116 = dVar2;
                q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar115 = qVarB;
                boolean z21111111113 = !z17;
                if (z17) {
                    i55 = 1;
                } else {
                    i55 = i53;
                }
                if (z17) {
                    i56 = 1;
                } else {
                    i56 = i52;
                }
                TextStyle textStyle116 = textStyle2;
                if ((i54 & 14) == 4) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                z22 = z21 | ((i54 & 112) == 32);
                objI = lVarV.I();
                if (z22) {
                    objI = new b(textFieldValue, lVar);
                    lVarV.B(objI);
                } else {
                    objI = new b(textFieldValue, lVar);
                    lVarV.B(objI);
                }
                int i61111117 = i48 << 9;
                int i61111118 = ((i54 >> 6) & 7168) | (i54 & 910) | (i61111117 & 57344) | (i61111117 & 458752) | (i61111117 & 3670016) | (i61111117 & 29360128);
                int i61111119 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                boolean z21111111114 = z17;
                l<? super TextLayoutResult, h0> lVar111114 = lVar5;
                KeyboardOptions keyboardOptions116 = keyboardOptions2;
                z0 z0Var115 = z0VarC;
                u1.l lVar111115 = lVar6;
                j.a(textFieldValue, (l) objI, dVar116, textStyle116, z0Var115, lVar111114, lVar111115, h1Var2, z21111111113, i56, i55, imeOptionsG113, zVar3, z18, z19, qVar115, lVarV, i61111118, i61111119, 0);
                if (o.J()) {
                    o.R();
                }
                zVar4 = zVar3;
                lVar7 = lVarV;
                i57 = i52;
                i58 = i53;
                z23 = z21111111114;
                z0Var2 = z0Var115;
                z24 = z18;
                qVar2 = qVar115;
                lVar8 = lVar111114;
                h1Var3 = h1Var2;
                z25 = z19;
                keyboardOptions3 = keyboardOptions116;
                lVar9 = lVar111115;
                textStyle3 = textStyle116;
                dVar3 = dVar116;
            } else {
                lVarV.L();
                if ((i13 & 1) != 0) {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = a.f15370c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        boolean z21111111115 = z14;
                        qVarB = kotlin.f.f15524a.b();
                        textStyle2 = textStyleA;
                        z18 = z21111111115;
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z19 = z15;
                    } else {
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z18 = z14;
                        z19 = z15;
                        qVarB = qVar;
                    }
                } else {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = a.f15370c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        boolean z21111111116 = z14;
                        qVarB = kotlin.f.f15524a.b();
                        textStyle2 = textStyleA;
                        z18 = z21111111116;
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z19 = z15;
                    } else {
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z18 = z14;
                        z19 = z15;
                        qVarB = qVar;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                }
                ImeOptions imeOptionsG114 = keyboardOptions2.g(z17);
                androidx.compose.ui.d dVar117 = dVar2;
                q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar116 = qVarB;
                boolean z21111111117 = !z17;
                if (z17) {
                    i55 = 1;
                } else {
                    i55 = i53;
                }
                if (z17) {
                    i56 = 1;
                } else {
                    i56 = i52;
                }
                TextStyle textStyle117 = textStyle2;
                if ((i54 & 14) == 4) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                z22 = z21 | ((i54 & 112) == 32);
                objI = lVarV.I();
                if (z22) {
                    objI = new b(textFieldValue, lVar);
                    lVarV.B(objI);
                } else {
                    objI = new b(textFieldValue, lVar);
                    lVarV.B(objI);
                }
                int i611111110 = i48 << 9;
                int i611111111 = ((i54 >> 6) & 7168) | (i54 & 910) | (i611111110 & 57344) | (i611111110 & 458752) | (i611111110 & 3670016) | (i611111110 & 29360128);
                int i611111112 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                boolean z21111111118 = z17;
                l<? super TextLayoutResult, h0> lVar111116 = lVar5;
                KeyboardOptions keyboardOptions117 = keyboardOptions2;
                z0 z0Var116 = z0VarC;
                u1.l lVar111117 = lVar6;
                j.a(textFieldValue, (l) objI, dVar117, textStyle117, z0Var116, lVar111116, lVar111117, h1Var2, z21111111117, i56, i55, imeOptionsG114, zVar3, z18, z19, qVar116, lVarV, i611111111, i611111112, 0);
                if (o.J()) {
                    o.R();
                }
                zVar4 = zVar3;
                lVar7 = lVarV;
                i57 = i52;
                i58 = i53;
                z23 = z21111111118;
                z0Var2 = z0Var116;
                z24 = z18;
                qVar2 = qVar116;
                lVar8 = lVar111116;
                h1Var3 = h1Var2;
                z25 = z19;
                keyboardOptions3 = keyboardOptions117;
                lVar9 = lVar111117;
                textStyle3 = textStyle117;
                dVar3 = dVar117;
            }
            w2VarX = lVar7.x();
            if (w2VarX != null) {
                w2VarX.a(new C0281c(textFieldValue, lVar, dVar3, z24, z25, textStyle3, keyboardOptions3, zVar4, z23, i57, i58, z0Var2, lVar8, lVar9, h1Var3, qVar2, i13, i14, i15));
            }
        }
        i16 |= 3072;
        z14 = z11;
        i19 = i15 & 16;
        i21 = PKIFailureInfo.certRevoked;
        if (i19 != 0) {
            if ((i13 & 24576) == 0) {
                z15 = z12;
                if (lVarV.p(z15)) {
                    i22 = 16384;
                } else {
                    i22 = 8192;
                }
                i16 |= i22;
            }
            i23 = i15 & 32;
            if (i23 != 0) {
                i16 |= 196608;
                textStyleA = textStyle;
            } else {
                textStyleA = textStyle;
                if ((i13 & 196608) == 0) {
                    if (lVarV.n(textStyleA)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i16 |= i24;
                }
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
                keyboardOptionsA = keyboardOptions;
            } else {
                keyboardOptionsA = keyboardOptions;
                if ((i13 & 1572864) == 0) {
                    if (lVarV.n(keyboardOptionsA)) {
                        i26 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i26 = PKIFailureInfo.signerNotTrusted;
                    }
                    i16 |= i26;
                }
            }
            i27 = i15 & 128;
            if (i27 != 0) {
                i16 |= 12582912;
                zVar2 = zVar;
            } else {
                zVar2 = zVar;
                if ((i13 & 12582912) == 0) {
                    if (lVarV.n(zVar2)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i16 |= i28;
                }
            }
            i29 = i15 & 256;
            if (i29 != 0) {
                i16 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (lVarV.p(z13)) {
                    i31 = 67108864;
                } else {
                    i31 = 33554432;
                }
                i16 |= i31;
            }
            if ((i13 & 805306368) != 0) {
                i16 |= ((i15 & 512) == 0 || !lVarV.r(i11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            i32 = i15 & 1024;
            if (i32 != 0) {
                i33 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (lVarV.r(i12)) {
                    i34 = 4;
                } else {
                    i34 = 2;
                }
                i33 = i14 | i34;
            } else {
                i33 = i14;
            }
            i35 = i15 & 2048;
            if (i35 != 0) {
                i33 |= 48;
            } else if ((i14 & 48) != 0) {
                if (lVarV.n(z0Var)) {
                    i36 = 32;
                } else {
                    i36 = 16;
                }
                i33 |= i36;
            }
            i37 = i33;
            i38 = i15 & 4096;
            if (i38 != 0) {
                i39 = i37 | KyberEngine.KyberPolyBytes;
            } else if ((i14 & KyberEngine.KyberPolyBytes) == 0) {
                if (lVarV.K(lVar2)) {
                    i41 = 256;
                } else {
                    i41 = 128;
                }
                i39 = i37 | i41;
            } else {
                i39 = i37;
            }
            i42 = i15 & PKIFailureInfo.certRevoked;
            if (i42 != 0) {
                i44 = i39 | 3072;
            } else {
                i43 = i39;
                if ((i14 & 3072) == 0) {
                    i44 = i43 | (lVarV.n(lVar3) ? 2048 : 1024);
                } else {
                    i44 = i43;
                }
            }
            i45 = i15 & 16384;
            if (i45 != 0) {
                i46 = i44;
                if ((i14 & 24576) == 0) {
                    if (lVarV.n(h1Var)) {
                        i21 = 16384;
                    }
                    i46 |= i21;
                }
                i47 = i15 & 32768;
                if (i47 != 0) {
                    i46 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    i46 |= lVarV.K(qVar) ? 131072 : 65536;
                }
                i48 = i46;
                if ((i16 & 306783379) != 306783378) {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z21111111119 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z21111111119;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z211111111110 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z211111111110;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                    }
                    ImeOptions imeOptionsG115 = keyboardOptions2.g(z17);
                    androidx.compose.ui.d dVar118 = dVar2;
                    q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar117 = qVarB;
                    boolean z211111111111 = !z17;
                    if (z17) {
                        i55 = 1;
                    } else {
                        i55 = i53;
                    }
                    if (z17) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    TextStyle textStyle118 = textStyle2;
                    if ((i54 & 14) == 4) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = z21 | ((i54 & 112) == 32);
                    objI = lVarV.I();
                    if (z22) {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    } else {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    }
                    int i611111113 = i48 << 9;
                    int i611111114 = ((i54 >> 6) & 7168) | (i54 & 910) | (i611111113 & 57344) | (i611111113 & 458752) | (i611111113 & 3670016) | (i611111113 & 29360128);
                    int i611111115 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                    boolean z211111111112 = z17;
                    l<? super TextLayoutResult, h0> lVar111118 = lVar5;
                    KeyboardOptions keyboardOptions118 = keyboardOptions2;
                    z0 z0Var117 = z0VarC;
                    u1.l lVar111119 = lVar6;
                    j.a(textFieldValue, (l) objI, dVar118, textStyle118, z0Var117, lVar111118, lVar111119, h1Var2, z211111111111, i56, i55, imeOptionsG115, zVar3, z18, z19, qVar117, lVarV, i611111114, i611111115, 0);
                    if (o.J()) {
                        o.R();
                    }
                    zVar4 = zVar3;
                    lVar7 = lVarV;
                    i57 = i52;
                    i58 = i53;
                    z23 = z211111111112;
                    z0Var2 = z0Var117;
                    z24 = z18;
                    qVar2 = qVar117;
                    lVar8 = lVar111118;
                    h1Var3 = h1Var2;
                    z25 = z19;
                    keyboardOptions3 = keyboardOptions118;
                    lVar9 = lVar111119;
                    textStyle3 = textStyle118;
                    dVar3 = dVar118;
                } else {
                    lVarV.L();
                    if ((i13 & 1) != 0) {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z211111111113 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z211111111113;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    } else {
                        if (i59 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        }
                        if (i23 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i25 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i27 != 0) {
                            zVarA = z.INSTANCE.a();
                        } else {
                            zVarA = zVar2;
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            if (z16) {
                                i49 = 1;
                            } else {
                                i49 = Integer.MAX_VALUE;
                            }
                            i16 &= -1879048193;
                        } else {
                            i49 = i11;
                        }
                        if (i32 != 0) {
                            i51 = 1;
                        } else {
                            i51 = i12;
                        }
                        if (i35 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i38 != 0) {
                            lVar5 = a.f15370c;
                        } else {
                            lVar5 = lVar2;
                        }
                        if (i42 != 0) {
                            lVar6 = null;
                        } else {
                            lVar6 = lVar3;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                        } else {
                            solidColor = h1Var;
                        }
                        if (i47 != 0) {
                            boolean z211111111114 = z14;
                            qVarB = kotlin.f.f15524a.b();
                            textStyle2 = textStyleA;
                            z18 = z211111111114;
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z19 = z15;
                        } else {
                            h1Var2 = solidColor;
                            z17 = z16;
                            i52 = i49;
                            i53 = i51;
                            textStyle2 = textStyleA;
                            keyboardOptions2 = keyboardOptionsA;
                            zVar3 = zVarA;
                            i54 = i16;
                            z18 = z14;
                            z19 = z15;
                            qVarB = qVar;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                    }
                    ImeOptions imeOptionsG116 = keyboardOptions2.g(z17);
                    androidx.compose.ui.d dVar119 = dVar2;
                    q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar118 = qVarB;
                    boolean z211111111115 = !z17;
                    if (z17) {
                        i55 = 1;
                    } else {
                        i55 = i53;
                    }
                    if (z17) {
                        i56 = 1;
                    } else {
                        i56 = i52;
                    }
                    TextStyle textStyle119 = textStyle2;
                    if ((i54 & 14) == 4) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = z21 | ((i54 & 112) == 32);
                    objI = lVarV.I();
                    if (z22) {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    } else {
                        objI = new b(textFieldValue, lVar);
                        lVarV.B(objI);
                    }
                    int i611111116 = i48 << 9;
                    int i611111117 = ((i54 >> 6) & 7168) | (i54 & 910) | (i611111116 & 57344) | (i611111116 & 458752) | (i611111116 & 3670016) | (i611111116 & 29360128);
                    int i611111118 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                    boolean z211111111116 = z17;
                    l<? super TextLayoutResult, h0> lVar1111110 = lVar5;
                    KeyboardOptions keyboardOptions119 = keyboardOptions2;
                    z0 z0Var118 = z0VarC;
                    u1.l lVar1111111 = lVar6;
                    j.a(textFieldValue, (l) objI, dVar119, textStyle119, z0Var118, lVar1111110, lVar1111111, h1Var2, z211111111115, i56, i55, imeOptionsG116, zVar3, z18, z19, qVar118, lVarV, i611111117, i611111118, 0);
                    if (o.J()) {
                        o.R();
                    }
                    zVar4 = zVar3;
                    lVar7 = lVarV;
                    i57 = i52;
                    i58 = i53;
                    z23 = z211111111116;
                    z0Var2 = z0Var118;
                    z24 = z18;
                    qVar2 = qVar118;
                    lVar8 = lVar1111110;
                    h1Var3 = h1Var2;
                    z25 = z19;
                    keyboardOptions3 = keyboardOptions119;
                    lVar9 = lVar1111111;
                    textStyle3 = textStyle119;
                    dVar3 = dVar119;
                }
                w2VarX = lVar7.x();
                if (w2VarX != null) {
                    w2VarX.a(new C0281c(textFieldValue, lVar, dVar3, z24, z25, textStyle3, keyboardOptions3, zVar4, z23, i57, i58, z0Var2, lVar8, lVar9, h1Var3, qVar2, i13, i14, i15));
                }
            }
            i46 = i44 | 24576;
            i47 = i15 & 32768;
            if (i47 != 0) {
                i46 |= 196608;
            } else if ((i14 & 196608) == 0) {
                i46 |= lVarV.K(qVar) ? 131072 : 65536;
            }
            i48 = i46;
            if ((i16 & 306783379) != 306783378) {
                lVarV.L();
                if ((i13 & 1) != 0) {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = a.f15370c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        boolean z211111111117 = z14;
                        qVarB = kotlin.f.f15524a.b();
                        textStyle2 = textStyleA;
                        z18 = z211111111117;
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z19 = z15;
                    } else {
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z18 = z14;
                        z19 = z15;
                        qVarB = qVar;
                    }
                } else {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = a.f15370c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        boolean z211111111118 = z14;
                        qVarB = kotlin.f.f15524a.b();
                        textStyle2 = textStyleA;
                        z18 = z211111111118;
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z19 = z15;
                    } else {
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z18 = z14;
                        z19 = z15;
                        qVarB = qVar;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                }
                ImeOptions imeOptionsG117 = keyboardOptions2.g(z17);
                androidx.compose.ui.d dVar1110 = dVar2;
                q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar119 = qVarB;
                boolean z211111111119 = !z17;
                if (z17) {
                    i55 = 1;
                } else {
                    i55 = i53;
                }
                if (z17) {
                    i56 = 1;
                } else {
                    i56 = i52;
                }
                TextStyle textStyle1110 = textStyle2;
                if ((i54 & 14) == 4) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                z22 = z21 | ((i54 & 112) == 32);
                objI = lVarV.I();
                if (z22) {
                    objI = new b(textFieldValue, lVar);
                    lVarV.B(objI);
                } else {
                    objI = new b(textFieldValue, lVar);
                    lVarV.B(objI);
                }
                int i611111119 = i48 << 9;
                int i6111111110 = ((i54 >> 6) & 7168) | (i54 & 910) | (i611111119 & 57344) | (i611111119 & 458752) | (i611111119 & 3670016) | (i611111119 & 29360128);
                int i6111111111 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                boolean z2111111111110 = z17;
                l<? super TextLayoutResult, h0> lVar1111112 = lVar5;
                KeyboardOptions keyboardOptions1110 = keyboardOptions2;
                z0 z0Var119 = z0VarC;
                u1.l lVar1111113 = lVar6;
                j.a(textFieldValue, (l) objI, dVar1110, textStyle1110, z0Var119, lVar1111112, lVar1111113, h1Var2, z211111111119, i56, i55, imeOptionsG117, zVar3, z18, z19, qVar119, lVarV, i6111111110, i6111111111, 0);
                if (o.J()) {
                    o.R();
                }
                zVar4 = zVar3;
                lVar7 = lVarV;
                i57 = i52;
                i58 = i53;
                z23 = z2111111111110;
                z0Var2 = z0Var119;
                z24 = z18;
                qVar2 = qVar119;
                lVar8 = lVar1111112;
                h1Var3 = h1Var2;
                z25 = z19;
                keyboardOptions3 = keyboardOptions1110;
                lVar9 = lVar1111113;
                textStyle3 = textStyle1110;
                dVar3 = dVar1110;
            } else {
                lVarV.L();
                if ((i13 & 1) != 0) {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = a.f15370c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        boolean z2111111111111 = z14;
                        qVarB = kotlin.f.f15524a.b();
                        textStyle2 = textStyleA;
                        z18 = z2111111111111;
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z19 = z15;
                    } else {
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z18 = z14;
                        z19 = z15;
                        qVarB = qVar;
                    }
                } else {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = a.f15370c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        boolean z2111111111112 = z14;
                        qVarB = kotlin.f.f15524a.b();
                        textStyle2 = textStyleA;
                        z18 = z2111111111112;
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z19 = z15;
                    } else {
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z18 = z14;
                        z19 = z15;
                        qVarB = qVar;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                }
                ImeOptions imeOptionsG118 = keyboardOptions2.g(z17);
                androidx.compose.ui.d dVar1111 = dVar2;
                q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar1110 = qVarB;
                boolean z2111111111113 = !z17;
                if (z17) {
                    i55 = 1;
                } else {
                    i55 = i53;
                }
                if (z17) {
                    i56 = 1;
                } else {
                    i56 = i52;
                }
                TextStyle textStyle1111 = textStyle2;
                if ((i54 & 14) == 4) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                z22 = z21 | ((i54 & 112) == 32);
                objI = lVarV.I();
                if (z22) {
                    objI = new b(textFieldValue, lVar);
                    lVarV.B(objI);
                } else {
                    objI = new b(textFieldValue, lVar);
                    lVarV.B(objI);
                }
                int i6111111112 = i48 << 9;
                int i6111111113 = ((i54 >> 6) & 7168) | (i54 & 910) | (i6111111112 & 57344) | (i6111111112 & 458752) | (i6111111112 & 3670016) | (i6111111112 & 29360128);
                int i6111111114 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                boolean z2111111111114 = z17;
                l<? super TextLayoutResult, h0> lVar1111114 = lVar5;
                KeyboardOptions keyboardOptions1111 = keyboardOptions2;
                z0 z0Var1110 = z0VarC;
                u1.l lVar1111115 = lVar6;
                j.a(textFieldValue, (l) objI, dVar1111, textStyle1111, z0Var1110, lVar1111114, lVar1111115, h1Var2, z2111111111113, i56, i55, imeOptionsG118, zVar3, z18, z19, qVar1110, lVarV, i6111111113, i6111111114, 0);
                if (o.J()) {
                    o.R();
                }
                zVar4 = zVar3;
                lVar7 = lVarV;
                i57 = i52;
                i58 = i53;
                z23 = z2111111111114;
                z0Var2 = z0Var1110;
                z24 = z18;
                qVar2 = qVar1110;
                lVar8 = lVar1111114;
                h1Var3 = h1Var2;
                z25 = z19;
                keyboardOptions3 = keyboardOptions1111;
                lVar9 = lVar1111115;
                textStyle3 = textStyle1111;
                dVar3 = dVar1111;
            }
            w2VarX = lVar7.x();
            if (w2VarX != null) {
                w2VarX.a(new C0281c(textFieldValue, lVar, dVar3, z24, z25, textStyle3, keyboardOptions3, zVar4, z23, i57, i58, z0Var2, lVar8, lVar9, h1Var3, qVar2, i13, i14, i15));
            }
        }
        i16 |= 24576;
        z15 = z12;
        i23 = i15 & 32;
        if (i23 != 0) {
            i16 |= 196608;
            textStyleA = textStyle;
        } else {
            textStyleA = textStyle;
            if ((i13 & 196608) == 0) {
                if (lVarV.n(textStyleA)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i16 |= i24;
            }
        }
        i25 = i15 & 64;
        if (i25 != 0) {
            i16 |= 1572864;
            keyboardOptionsA = keyboardOptions;
        } else {
            keyboardOptionsA = keyboardOptions;
            if ((i13 & 1572864) == 0) {
                if (lVarV.n(keyboardOptionsA)) {
                    i26 = PKIFailureInfo.badCertTemplate;
                } else {
                    i26 = PKIFailureInfo.signerNotTrusted;
                }
                i16 |= i26;
            }
        }
        i27 = i15 & 128;
        if (i27 != 0) {
            i16 |= 12582912;
            zVar2 = zVar;
        } else {
            zVar2 = zVar;
            if ((i13 & 12582912) == 0) {
                if (lVarV.n(zVar2)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i16 |= i28;
            }
        }
        i29 = i15 & 256;
        if (i29 != 0) {
            i16 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            if (lVarV.p(z13)) {
                i31 = 67108864;
            } else {
                i31 = 33554432;
            }
            i16 |= i31;
        }
        if ((i13 & 805306368) != 0) {
            i16 |= ((i15 & 512) == 0 || !lVarV.r(i11)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
        }
        i32 = i15 & 1024;
        if (i32 != 0) {
            i33 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            if (lVarV.r(i12)) {
                i34 = 4;
            } else {
                i34 = 2;
            }
            i33 = i14 | i34;
        } else {
            i33 = i14;
        }
        i35 = i15 & 2048;
        if (i35 != 0) {
            i33 |= 48;
        } else if ((i14 & 48) != 0) {
            if (lVarV.n(z0Var)) {
                i36 = 32;
            } else {
                i36 = 16;
            }
            i33 |= i36;
        }
        i37 = i33;
        i38 = i15 & 4096;
        if (i38 != 0) {
            i39 = i37 | KyberEngine.KyberPolyBytes;
        } else if ((i14 & KyberEngine.KyberPolyBytes) == 0) {
            if (lVarV.K(lVar2)) {
                i41 = 256;
            } else {
                i41 = 128;
            }
            i39 = i37 | i41;
        } else {
            i39 = i37;
        }
        i42 = i15 & PKIFailureInfo.certRevoked;
        if (i42 != 0) {
            i44 = i39 | 3072;
        } else {
            i43 = i39;
            if ((i14 & 3072) == 0) {
                i44 = i43 | (lVarV.n(lVar3) ? 2048 : 1024);
            } else {
                i44 = i43;
            }
        }
        i45 = i15 & 16384;
        if (i45 != 0) {
            i46 = i44;
            if ((i14 & 24576) == 0) {
                if (lVarV.n(h1Var)) {
                    i21 = 16384;
                }
                i46 |= i21;
            }
            i47 = i15 & 32768;
            if (i47 != 0) {
                i46 |= 196608;
            } else if ((i14 & 196608) == 0) {
                i46 |= lVarV.K(qVar) ? 131072 : 65536;
            }
            i48 = i46;
            if ((i16 & 306783379) != 306783378) {
                lVarV.L();
                if ((i13 & 1) != 0) {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = a.f15370c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        boolean z2111111111115 = z14;
                        qVarB = kotlin.f.f15524a.b();
                        textStyle2 = textStyleA;
                        z18 = z2111111111115;
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z19 = z15;
                    } else {
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z18 = z14;
                        z19 = z15;
                        qVarB = qVar;
                    }
                } else {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = a.f15370c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        boolean z2111111111116 = z14;
                        qVarB = kotlin.f.f15524a.b();
                        textStyle2 = textStyleA;
                        z18 = z2111111111116;
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z19 = z15;
                    } else {
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z18 = z14;
                        z19 = z15;
                        qVarB = qVar;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                }
                ImeOptions imeOptionsG119 = keyboardOptions2.g(z17);
                androidx.compose.ui.d dVar1112 = dVar2;
                q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar1111 = qVarB;
                boolean z2111111111117 = !z17;
                if (z17) {
                    i55 = 1;
                } else {
                    i55 = i53;
                }
                if (z17) {
                    i56 = 1;
                } else {
                    i56 = i52;
                }
                TextStyle textStyle1112 = textStyle2;
                if ((i54 & 14) == 4) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                z22 = z21 | ((i54 & 112) == 32);
                objI = lVarV.I();
                if (z22) {
                    objI = new b(textFieldValue, lVar);
                    lVarV.B(objI);
                } else {
                    objI = new b(textFieldValue, lVar);
                    lVarV.B(objI);
                }
                int i6111111115 = i48 << 9;
                int i6111111116 = ((i54 >> 6) & 7168) | (i54 & 910) | (i6111111115 & 57344) | (i6111111115 & 458752) | (i6111111115 & 3670016) | (i6111111115 & 29360128);
                int i6111111117 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                boolean z2111111111118 = z17;
                l<? super TextLayoutResult, h0> lVar1111116 = lVar5;
                KeyboardOptions keyboardOptions1112 = keyboardOptions2;
                z0 z0Var1111 = z0VarC;
                u1.l lVar1111117 = lVar6;
                j.a(textFieldValue, (l) objI, dVar1112, textStyle1112, z0Var1111, lVar1111116, lVar1111117, h1Var2, z2111111111117, i56, i55, imeOptionsG119, zVar3, z18, z19, qVar1111, lVarV, i6111111116, i6111111117, 0);
                if (o.J()) {
                    o.R();
                }
                zVar4 = zVar3;
                lVar7 = lVarV;
                i57 = i52;
                i58 = i53;
                z23 = z2111111111118;
                z0Var2 = z0Var1111;
                z24 = z18;
                qVar2 = qVar1111;
                lVar8 = lVar1111116;
                h1Var3 = h1Var2;
                z25 = z19;
                keyboardOptions3 = keyboardOptions1112;
                lVar9 = lVar1111117;
                textStyle3 = textStyle1112;
                dVar3 = dVar1112;
            } else {
                lVarV.L();
                if ((i13 & 1) != 0) {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = a.f15370c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        boolean z2111111111119 = z14;
                        qVarB = kotlin.f.f15524a.b();
                        textStyle2 = textStyleA;
                        z18 = z2111111111119;
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z19 = z15;
                    } else {
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z18 = z14;
                        z19 = z15;
                        qVarB = qVar;
                    }
                } else {
                    if (i59 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    }
                    if (i23 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i25 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i27 != 0) {
                        zVarA = z.INSTANCE.a();
                    } else {
                        zVarA = zVar2;
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        if (z16) {
                            i49 = 1;
                        } else {
                            i49 = Integer.MAX_VALUE;
                        }
                        i16 &= -1879048193;
                    } else {
                        i49 = i11;
                    }
                    if (i32 != 0) {
                        i51 = 1;
                    } else {
                        i51 = i12;
                    }
                    if (i35 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i38 != 0) {
                        lVar5 = a.f15370c;
                    } else {
                        lVar5 = lVar2;
                    }
                    if (i42 != 0) {
                        lVar6 = null;
                    } else {
                        lVar6 = lVar3;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                    } else {
                        solidColor = h1Var;
                    }
                    if (i47 != 0) {
                        boolean z21111111111110 = z14;
                        qVarB = kotlin.f.f15524a.b();
                        textStyle2 = textStyleA;
                        z18 = z21111111111110;
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z19 = z15;
                    } else {
                        h1Var2 = solidColor;
                        z17 = z16;
                        i52 = i49;
                        i53 = i51;
                        textStyle2 = textStyleA;
                        keyboardOptions2 = keyboardOptionsA;
                        zVar3 = zVarA;
                        i54 = i16;
                        z18 = z14;
                        z19 = z15;
                        qVarB = qVar;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                }
                ImeOptions imeOptionsG1110 = keyboardOptions2.g(z17);
                androidx.compose.ui.d dVar1113 = dVar2;
                q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar1112 = qVarB;
                boolean z21111111111111 = !z17;
                if (z17) {
                    i55 = 1;
                } else {
                    i55 = i53;
                }
                if (z17) {
                    i56 = 1;
                } else {
                    i56 = i52;
                }
                TextStyle textStyle1113 = textStyle2;
                if ((i54 & 14) == 4) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                z22 = z21 | ((i54 & 112) == 32);
                objI = lVarV.I();
                if (z22) {
                    objI = new b(textFieldValue, lVar);
                    lVarV.B(objI);
                } else {
                    objI = new b(textFieldValue, lVar);
                    lVarV.B(objI);
                }
                int i6111111118 = i48 << 9;
                int i6111111119 = ((i54 >> 6) & 7168) | (i54 & 910) | (i6111111118 & 57344) | (i6111111118 & 458752) | (i6111111118 & 3670016) | (i6111111118 & 29360128);
                int i61111111110 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
                boolean z21111111111112 = z17;
                l<? super TextLayoutResult, h0> lVar1111118 = lVar5;
                KeyboardOptions keyboardOptions1113 = keyboardOptions2;
                z0 z0Var1112 = z0VarC;
                u1.l lVar1111119 = lVar6;
                j.a(textFieldValue, (l) objI, dVar1113, textStyle1113, z0Var1112, lVar1111118, lVar1111119, h1Var2, z21111111111111, i56, i55, imeOptionsG1110, zVar3, z18, z19, qVar1112, lVarV, i6111111119, i61111111110, 0);
                if (o.J()) {
                    o.R();
                }
                zVar4 = zVar3;
                lVar7 = lVarV;
                i57 = i52;
                i58 = i53;
                z23 = z21111111111112;
                z0Var2 = z0Var1112;
                z24 = z18;
                qVar2 = qVar1112;
                lVar8 = lVar1111118;
                h1Var3 = h1Var2;
                z25 = z19;
                keyboardOptions3 = keyboardOptions1113;
                lVar9 = lVar1111119;
                textStyle3 = textStyle1113;
                dVar3 = dVar1113;
            }
            w2VarX = lVar7.x();
            if (w2VarX != null) {
                w2VarX.a(new C0281c(textFieldValue, lVar, dVar3, z24, z25, textStyle3, keyboardOptions3, zVar4, z23, i57, i58, z0Var2, lVar8, lVar9, h1Var3, qVar2, i13, i14, i15));
            }
        }
        i46 = i44 | 24576;
        i47 = i15 & 32768;
        if (i47 != 0) {
            i46 |= 196608;
        } else if ((i14 & 196608) == 0) {
            i46 |= lVarV.K(qVar) ? 131072 : 65536;
        }
        i48 = i46;
        if ((i16 & 306783379) != 306783378) {
            lVarV.L();
            if ((i13 & 1) != 0) {
                if (i59 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if (i19 != 0) {
                    z15 = false;
                }
                if (i23 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i25 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i27 != 0) {
                    zVarA = z.INSTANCE.a();
                } else {
                    zVarA = zVar2;
                }
                if (i29 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if ((i15 & 512) != 0) {
                    if (z16) {
                        i49 = 1;
                    } else {
                        i49 = Integer.MAX_VALUE;
                    }
                    i16 &= -1879048193;
                } else {
                    i49 = i11;
                }
                if (i32 != 0) {
                    i51 = 1;
                } else {
                    i51 = i12;
                }
                if (i35 != 0) {
                    z0VarC = z0.INSTANCE.c();
                } else {
                    z0VarC = z0Var;
                }
                if (i38 != 0) {
                    lVar5 = a.f15370c;
                } else {
                    lVar5 = lVar2;
                }
                if (i42 != 0) {
                    lVar6 = null;
                } else {
                    lVar6 = lVar3;
                }
                if (i45 != 0) {
                    solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                } else {
                    solidColor = h1Var;
                }
                if (i47 != 0) {
                    boolean z21111111111113 = z14;
                    qVarB = kotlin.f.f15524a.b();
                    textStyle2 = textStyleA;
                    z18 = z21111111111113;
                    h1Var2 = solidColor;
                    z17 = z16;
                    i52 = i49;
                    i53 = i51;
                    keyboardOptions2 = keyboardOptionsA;
                    zVar3 = zVarA;
                    i54 = i16;
                    z19 = z15;
                } else {
                    h1Var2 = solidColor;
                    z17 = z16;
                    i52 = i49;
                    i53 = i51;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    zVar3 = zVarA;
                    i54 = i16;
                    z18 = z14;
                    z19 = z15;
                    qVarB = qVar;
                }
            } else {
                if (i59 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if (i19 != 0) {
                    z15 = false;
                }
                if (i23 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i25 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i27 != 0) {
                    zVarA = z.INSTANCE.a();
                } else {
                    zVarA = zVar2;
                }
                if (i29 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if ((i15 & 512) != 0) {
                    if (z16) {
                        i49 = 1;
                    } else {
                        i49 = Integer.MAX_VALUE;
                    }
                    i16 &= -1879048193;
                } else {
                    i49 = i11;
                }
                if (i32 != 0) {
                    i51 = 1;
                } else {
                    i51 = i12;
                }
                if (i35 != 0) {
                    z0VarC = z0.INSTANCE.c();
                } else {
                    z0VarC = z0Var;
                }
                if (i38 != 0) {
                    lVar5 = a.f15370c;
                } else {
                    lVar5 = lVar2;
                }
                if (i42 != 0) {
                    lVar6 = null;
                } else {
                    lVar6 = lVar3;
                }
                if (i45 != 0) {
                    solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                } else {
                    solidColor = h1Var;
                }
                if (i47 != 0) {
                    boolean z21111111111114 = z14;
                    qVarB = kotlin.f.f15524a.b();
                    textStyle2 = textStyleA;
                    z18 = z21111111111114;
                    h1Var2 = solidColor;
                    z17 = z16;
                    i52 = i49;
                    i53 = i51;
                    keyboardOptions2 = keyboardOptionsA;
                    zVar3 = zVarA;
                    i54 = i16;
                    z19 = z15;
                } else {
                    h1Var2 = solidColor;
                    z17 = z16;
                    i52 = i49;
                    i53 = i51;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    zVar3 = zVarA;
                    i54 = i16;
                    z18 = z14;
                    z19 = z15;
                    qVarB = qVar;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
            }
            ImeOptions imeOptionsG1111 = keyboardOptions2.g(z17);
            androidx.compose.ui.d dVar1114 = dVar2;
            q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar1113 = qVarB;
            boolean z21111111111115 = !z17;
            if (z17) {
                i55 = 1;
            } else {
                i55 = i53;
            }
            if (z17) {
                i56 = 1;
            } else {
                i56 = i52;
            }
            TextStyle textStyle1114 = textStyle2;
            if ((i54 & 14) == 4) {
                z21 = true;
            } else {
                z21 = false;
            }
            z22 = z21 | ((i54 & 112) == 32);
            objI = lVarV.I();
            if (z22) {
                objI = new b(textFieldValue, lVar);
                lVarV.B(objI);
            } else {
                objI = new b(textFieldValue, lVar);
                lVarV.B(objI);
            }
            int i61111111111 = i48 << 9;
            int i61111111112 = ((i54 >> 6) & 7168) | (i54 & 910) | (i61111111111 & 57344) | (i61111111111 & 458752) | (i61111111111 & 3670016) | (i61111111111 & 29360128);
            int i61111111113 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
            boolean z21111111111116 = z17;
            l<? super TextLayoutResult, h0> lVar11111110 = lVar5;
            KeyboardOptions keyboardOptions1114 = keyboardOptions2;
            z0 z0Var1113 = z0VarC;
            u1.l lVar11111111 = lVar6;
            j.a(textFieldValue, (l) objI, dVar1114, textStyle1114, z0Var1113, lVar11111110, lVar11111111, h1Var2, z21111111111115, i56, i55, imeOptionsG1111, zVar3, z18, z19, qVar1113, lVarV, i61111111112, i61111111113, 0);
            if (o.J()) {
                o.R();
            }
            zVar4 = zVar3;
            lVar7 = lVarV;
            i57 = i52;
            i58 = i53;
            z23 = z21111111111116;
            z0Var2 = z0Var1113;
            z24 = z18;
            qVar2 = qVar1113;
            lVar8 = lVar11111110;
            h1Var3 = h1Var2;
            z25 = z19;
            keyboardOptions3 = keyboardOptions1114;
            lVar9 = lVar11111111;
            textStyle3 = textStyle1114;
            dVar3 = dVar1114;
        } else {
            lVarV.L();
            if ((i13 & 1) != 0) {
                if (i59 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if (i19 != 0) {
                    z15 = false;
                }
                if (i23 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i25 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i27 != 0) {
                    zVarA = z.INSTANCE.a();
                } else {
                    zVarA = zVar2;
                }
                if (i29 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if ((i15 & 512) != 0) {
                    if (z16) {
                        i49 = 1;
                    } else {
                        i49 = Integer.MAX_VALUE;
                    }
                    i16 &= -1879048193;
                } else {
                    i49 = i11;
                }
                if (i32 != 0) {
                    i51 = 1;
                } else {
                    i51 = i12;
                }
                if (i35 != 0) {
                    z0VarC = z0.INSTANCE.c();
                } else {
                    z0VarC = z0Var;
                }
                if (i38 != 0) {
                    lVar5 = a.f15370c;
                } else {
                    lVar5 = lVar2;
                }
                if (i42 != 0) {
                    lVar6 = null;
                } else {
                    lVar6 = lVar3;
                }
                if (i45 != 0) {
                    solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                } else {
                    solidColor = h1Var;
                }
                if (i47 != 0) {
                    boolean z21111111111117 = z14;
                    qVarB = kotlin.f.f15524a.b();
                    textStyle2 = textStyleA;
                    z18 = z21111111111117;
                    h1Var2 = solidColor;
                    z17 = z16;
                    i52 = i49;
                    i53 = i51;
                    keyboardOptions2 = keyboardOptionsA;
                    zVar3 = zVarA;
                    i54 = i16;
                    z19 = z15;
                } else {
                    h1Var2 = solidColor;
                    z17 = z16;
                    i52 = i49;
                    i53 = i51;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    zVar3 = zVarA;
                    i54 = i16;
                    z18 = z14;
                    z19 = z15;
                    qVarB = qVar;
                }
            } else {
                if (i59 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if (i19 != 0) {
                    z15 = false;
                }
                if (i23 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i25 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i27 != 0) {
                    zVarA = z.INSTANCE.a();
                } else {
                    zVarA = zVar2;
                }
                if (i29 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if ((i15 & 512) != 0) {
                    if (z16) {
                        i49 = 1;
                    } else {
                        i49 = Integer.MAX_VALUE;
                    }
                    i16 &= -1879048193;
                } else {
                    i49 = i11;
                }
                if (i32 != 0) {
                    i51 = 1;
                } else {
                    i51 = i12;
                }
                if (i35 != 0) {
                    z0VarC = z0.INSTANCE.c();
                } else {
                    z0VarC = z0Var;
                }
                if (i38 != 0) {
                    lVar5 = a.f15370c;
                } else {
                    lVar5 = lVar2;
                }
                if (i42 != 0) {
                    lVar6 = null;
                } else {
                    lVar6 = lVar3;
                }
                if (i45 != 0) {
                    solidColor = new SolidColor(k3.p1.INSTANCE.a(), null);
                } else {
                    solidColor = h1Var;
                }
                if (i47 != 0) {
                    boolean z21111111111118 = z14;
                    qVarB = kotlin.f.f15524a.b();
                    textStyle2 = textStyleA;
                    z18 = z21111111111118;
                    h1Var2 = solidColor;
                    z17 = z16;
                    i52 = i49;
                    i53 = i51;
                    keyboardOptions2 = keyboardOptionsA;
                    zVar3 = zVarA;
                    i54 = i16;
                    z19 = z15;
                } else {
                    h1Var2 = solidColor;
                    z17 = z16;
                    i52 = i49;
                    i53 = i51;
                    textStyle2 = textStyleA;
                    keyboardOptions2 = keyboardOptionsA;
                    zVar3 = zVarA;
                    i54 = i16;
                    z18 = z14;
                    z19 = z15;
                    qVarB = qVar;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(1804514146, i54, i48, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
            }
            ImeOptions imeOptionsG1112 = keyboardOptions2.g(z17);
            androidx.compose.ui.d dVar1115 = dVar2;
            q<? super p<? super p020r2.l, ? super Integer, h0>, ? super p020r2.l, ? super Integer, h0> qVar1114 = qVarB;
            boolean z21111111111119 = !z17;
            if (z17) {
                i55 = 1;
            } else {
                i55 = i53;
            }
            if (z17) {
                i56 = 1;
            } else {
                i56 = i52;
            }
            TextStyle textStyle1115 = textStyle2;
            if ((i54 & 14) == 4) {
                z21 = true;
            } else {
                z21 = false;
            }
            z22 = z21 | ((i54 & 112) == 32);
            objI = lVarV.I();
            if (z22) {
                objI = new b(textFieldValue, lVar);
                lVarV.B(objI);
            } else {
                objI = new b(textFieldValue, lVar);
                lVarV.B(objI);
            }
            int i61111111114 = i48 << 9;
            int i61111111115 = ((i54 >> 6) & 7168) | (i54 & 910) | (i61111111114 & 57344) | (i61111111114 & 458752) | (i61111111114 & 3670016) | (i61111111114 & 29360128);
            int i61111111116 = (i54 & 7168) | ((i54 >> 15) & 896) | (57344 & i54) | (i48 & 458752);
            boolean z211111111111110 = z17;
            l<? super TextLayoutResult, h0> lVar11111112 = lVar5;
            KeyboardOptions keyboardOptions1115 = keyboardOptions2;
            z0 z0Var1114 = z0VarC;
            u1.l lVar11111113 = lVar6;
            j.a(textFieldValue, (l) objI, dVar1115, textStyle1115, z0Var1114, lVar11111112, lVar11111113, h1Var2, z21111111111119, i56, i55, imeOptionsG1112, zVar3, z18, z19, qVar1114, lVarV, i61111111115, i61111111116, 0);
            if (o.J()) {
                o.R();
            }
            zVar4 = zVar3;
            lVar7 = lVarV;
            i57 = i52;
            i58 = i53;
            z23 = z211111111111110;
            z0Var2 = z0Var1114;
            z24 = z18;
            qVar2 = qVar1114;
            lVar8 = lVar11111112;
            h1Var3 = h1Var2;
            z25 = z19;
            keyboardOptions3 = keyboardOptions1115;
            lVar9 = lVar11111113;
            textStyle3 = textStyle1115;
            dVar3 = dVar1115;
        }
        w2VarX = lVar7.x();
        if (w2VarX != null) {
            w2VarX.a(new C0281c(textFieldValue, lVar, dVar3, z24, z25, textStyle3, keyboardOptions3, zVar4, z23, i57, i58, z0Var2, lVar8, lVar9, h1Var3, qVar2, i13, i14, i15));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue c(p1<TextFieldValue> p1Var) {
        return p1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(p1<TextFieldValue> p1Var, TextFieldValue textFieldValue) {
        p1Var.setValue(textFieldValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(p1<String> p1Var) {
        return p1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(p1<String> p1Var, String str) {
        p1Var.setValue(str);
    }

    @p013kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements l<TextLayoutResult, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f15370c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(TextLayoutResult textLayoutResult) {
            a(textLayoutResult);
            return h0.f84049a;
        }

        public final void a(TextLayoutResult textLayoutResult) {
        }
    }

    @p013kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends u implements l<TextLayoutResult, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f15392c = new d();

        d() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(TextLayoutResult textLayoutResult) {
            a(textLayoutResult);
            return h0.f84049a;
        }

        public final void a(TextLayoutResult textLayoutResult) {
        }
    }
}
