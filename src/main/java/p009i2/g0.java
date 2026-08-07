package p009i2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import k3.p1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p015o1.u;
import p020r2.l;
import p020r2.n3;
import p020r2.o;
import p020r2.y3;
import u1.f;
import u1.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b\"\u0010#J%\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0017¢\u0006\u0004\b$\u0010\u001fJ-\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b%\u0010#J-\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b&\u0010#J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b)\u0010(J-\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b+\u0010#J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b,\u0010(J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001aH\u0017¢\u0006\u0004\b-\u0010(J\u001a\u00100\u001a\u00020\u001a2\b\u0010/\u001a\u0004\u0018\u00010.H\u0096\u0002¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b'\u00105R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u00105R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u00105R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u00105R\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u00105R\u001a\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u00105R\u001a\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b-\u00105R\u001a\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u00105R\u001a\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b)\u00105R\u001a\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u00105R\u001a\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u00105R\u001a\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b7\u00105R\u001a\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b8\u00105R\u001a\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b9\u00105R\u001a\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b:\u00105R\u001a\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b;\u00105R\u001a\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b<\u00105R\u001a\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b=\u00105R\u001a\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b>\u00105R\u001a\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b?\u00105R\u001a\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b@\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B²\u0006\f\u0010A\u001a\u00020\u001a8\nX\u008a\u0084\u0002²\u0006\f\u0010A\u001a\u00020\u001a8\nX\u008a\u0084\u0002"}, d2 = {"Li2/g0;", "Li2/n2;", "Lk3/p1;", "textColor", "disabledTextColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "errorIndicatorColor", "disabledIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "backgroundColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "<init>", "(JJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "isError", "Lr2/y3;", DateTokenConverter.CONVERTER_KEY, "(ZZLr2/l;I)Lr2/y3;", "Lu1/j;", "interactionSource", "b", "(ZZLu1/j;Lr2/l;I)Lr2/y3;", "e", "f", "c", "a", "(ZLr2/l;I)Lr2/y3;", IntegerTokenConverter.CONVERTER_KEY, AnalyticsAttribute.Error, "j", "h", "g", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "focused", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class g0 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long textColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long disabledTextColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long cursorColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long errorCursorColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long focusedIndicatorColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedIndicatorColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long errorIndicatorColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long disabledIndicatorColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long leadingIconColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long disabledLeadingIconColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long errorLeadingIconColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long trailingIconColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long disabledTrailingIconColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long errorTrailingIconColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long backgroundColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final long focusedLabelColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedLabelColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final long disabledLabelColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final long errorLabelColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long placeholderColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final long disabledPlaceholderColor;

    public /* synthetic */ g0(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, j24, j25, j26, j27, j28, j29, j31, j32, j33);
    }

    private static final boolean k(y3<Boolean> y3Var) {
        return y3Var.getValue().booleanValue();
    }

    private static final boolean l(y3<Boolean> y3Var) {
        return y3Var.getValue().booleanValue();
    }

    @Override // p009i2.n2
    public y3<p1> a(boolean z11, l lVar, int i11) {
        lVar.o(-1423938813);
        if (o.J()) {
            o.S(-1423938813, i11, -1, "androidx.compose.material.DefaultTextFieldColors.backgroundColor (TextFieldDefaults.kt:881)");
        }
        y3<p1> y3VarO = n3.o(p1.l(this.backgroundColor), lVar, 0);
        if (o.J()) {
            o.R();
        }
        lVar.l();
        return y3VarO;
    }

    @Override // p009i2.n2
    public y3<p1> b(boolean z11, boolean z12, j jVar, l lVar, int i11) {
        long j11;
        lVar.o(-1519634405);
        if (o.J()) {
            o.S(-1519634405, i11, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:822)");
        }
        if (z11) {
            j11 = z12 ? this.errorLeadingIconColor : this.leadingIconColor;
        } else {
            j11 = this.disabledLeadingIconColor;
        }
        y3<p1> y3VarO = n3.o(p1.l(j11), lVar, 0);
        if (o.J()) {
            o.R();
        }
        lVar.l();
        return y3VarO;
    }

    @Override // p009i2.n2
    public y3<p1> c(boolean z11, boolean z12, j jVar, l lVar, int i11) {
        long j11;
        l lVar2;
        y3<p1> y3VarO;
        lVar.o(998675979);
        if (o.J()) {
            o.S(998675979, i11, -1, "androidx.compose.material.DefaultTextFieldColors.indicatorColor (TextFieldDefaults.kt:864)");
        }
        y3<Boolean> y3VarA = f.a(jVar, lVar, (i11 >> 6) & 14);
        if (!z11) {
            j11 = this.disabledIndicatorColor;
        } else if (z12) {
            j11 = this.errorIndicatorColor;
        } else {
            j11 = k(y3VarA) ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
        }
        long j12 = j11;
        if (z11) {
            lVar.o(1613846559);
            lVar2 = lVar;
            y3VarO = u.a(j12, p019p1.j.l(150, 0, null, 6, null), null, null, lVar2, 48, 12);
            lVar2.l();
        } else {
            lVar2 = lVar;
            lVar2.o(1613949417);
            y3VarO = n3.o(p1.l(j12), lVar2, 0);
            lVar2.l();
        }
        if (o.J()) {
            o.R();
        }
        lVar2.l();
        return y3VarO;
    }

    @Override // p009i2.n2
    public y3<p1> d(boolean z11, boolean z12, l lVar, int i11) {
        long j11;
        lVar.o(1016171324);
        if (o.J()) {
            o.S(1016171324, i11, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:807)");
        }
        if (z11) {
            j11 = z12 ? this.errorLeadingIconColor : this.leadingIconColor;
        } else {
            j11 = this.disabledLeadingIconColor;
        }
        y3<p1> y3VarO = n3.o(p1.l(j11), lVar, 0);
        if (o.J()) {
            o.R();
        }
        lVar.l();
        return y3VarO;
    }

    @Override // p009i2.n2
    public y3<p1> e(boolean z11, boolean z12, l lVar, int i11) {
        long j11;
        lVar.o(225259054);
        if (o.J()) {
            o.S(225259054, i11, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:834)");
        }
        if (z11) {
            j11 = z12 ? this.errorTrailingIconColor : this.trailingIconColor;
        } else {
            j11 = this.disabledTrailingIconColor;
        }
        y3<p1> y3VarO = n3.o(p1.l(j11), lVar, 0);
        if (o.J()) {
            o.R();
        }
        lVar.l();
        return y3VarO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || g0.class != other.getClass()) {
            return false;
        }
        g0 g0Var = (g0) other;
        return p1.r(this.textColor, g0Var.textColor) && p1.r(this.disabledTextColor, g0Var.disabledTextColor) && p1.r(this.cursorColor, g0Var.cursorColor) && p1.r(this.errorCursorColor, g0Var.errorCursorColor) && p1.r(this.focusedIndicatorColor, g0Var.focusedIndicatorColor) && p1.r(this.unfocusedIndicatorColor, g0Var.unfocusedIndicatorColor) && p1.r(this.errorIndicatorColor, g0Var.errorIndicatorColor) && p1.r(this.disabledIndicatorColor, g0Var.disabledIndicatorColor) && p1.r(this.leadingIconColor, g0Var.leadingIconColor) && p1.r(this.disabledLeadingIconColor, g0Var.disabledLeadingIconColor) && p1.r(this.errorLeadingIconColor, g0Var.errorLeadingIconColor) && p1.r(this.trailingIconColor, g0Var.trailingIconColor) && p1.r(this.disabledTrailingIconColor, g0Var.disabledTrailingIconColor) && p1.r(this.errorTrailingIconColor, g0Var.errorTrailingIconColor) && p1.r(this.backgroundColor, g0Var.backgroundColor) && p1.r(this.focusedLabelColor, g0Var.focusedLabelColor) && p1.r(this.unfocusedLabelColor, g0Var.unfocusedLabelColor) && p1.r(this.disabledLabelColor, g0Var.disabledLabelColor) && p1.r(this.errorLabelColor, g0Var.errorLabelColor) && p1.r(this.placeholderColor, g0Var.placeholderColor) && p1.r(this.disabledPlaceholderColor, g0Var.disabledPlaceholderColor);
    }

    @Override // p009i2.n2
    public y3<p1> f(boolean z11, boolean z12, j jVar, l lVar, int i11) {
        long j11;
        lVar.o(1383318157);
        if (o.J()) {
            o.S(1383318157, i11, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:849)");
        }
        if (z11) {
            j11 = z12 ? this.errorTrailingIconColor : this.trailingIconColor;
        } else {
            j11 = this.disabledTrailingIconColor;
        }
        y3<p1> y3VarO = n3.o(p1.l(j11), lVar, 0);
        if (o.J()) {
            o.R();
        }
        lVar.l();
        return y3VarO;
    }

    @Override // p009i2.n2
    public y3<p1> g(boolean z11, l lVar, int i11) {
        lVar.o(-1446422485);
        if (o.J()) {
            o.S(-1446422485, i11, -1, "androidx.compose.material.DefaultTextFieldColors.cursorColor (TextFieldDefaults.kt:913)");
        }
        y3<p1> y3VarO = n3.o(p1.l(z11 ? this.errorCursorColor : this.cursorColor), lVar, 0);
        if (o.J()) {
            o.R();
        }
        lVar.l();
        return y3VarO;
    }

    @Override // p009i2.n2
    public y3<p1> h(boolean z11, l lVar, int i11) {
        lVar.o(9804418);
        if (o.J()) {
            o.S(9804418, i11, -1, "androidx.compose.material.DefaultTextFieldColors.textColor (TextFieldDefaults.kt:908)");
        }
        y3<p1> y3VarO = n3.o(p1.l(z11 ? this.textColor : this.disabledTextColor), lVar, 0);
        if (o.J()) {
            o.R();
        }
        lVar.l();
        return y3VarO;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((p1.x(this.textColor) * 31) + p1.x(this.disabledTextColor)) * 31) + p1.x(this.cursorColor)) * 31) + p1.x(this.errorCursorColor)) * 31) + p1.x(this.focusedIndicatorColor)) * 31) + p1.x(this.unfocusedIndicatorColor)) * 31) + p1.x(this.errorIndicatorColor)) * 31) + p1.x(this.disabledIndicatorColor)) * 31) + p1.x(this.leadingIconColor)) * 31) + p1.x(this.disabledLeadingIconColor)) * 31) + p1.x(this.errorLeadingIconColor)) * 31) + p1.x(this.trailingIconColor)) * 31) + p1.x(this.disabledTrailingIconColor)) * 31) + p1.x(this.errorTrailingIconColor)) * 31) + p1.x(this.backgroundColor)) * 31) + p1.x(this.focusedLabelColor)) * 31) + p1.x(this.unfocusedLabelColor)) * 31) + p1.x(this.disabledLabelColor)) * 31) + p1.x(this.errorLabelColor)) * 31) + p1.x(this.placeholderColor)) * 31) + p1.x(this.disabledPlaceholderColor);
    }

    @Override // p009i2.n2
    public y3<p1> i(boolean z11, l lVar, int i11) {
        lVar.o(264799724);
        if (o.J()) {
            o.S(264799724, i11, -1, "androidx.compose.material.DefaultTextFieldColors.placeholderColor (TextFieldDefaults.kt:886)");
        }
        y3<p1> y3VarO = n3.o(p1.l(z11 ? this.placeholderColor : this.disabledPlaceholderColor), lVar, 0);
        if (o.J()) {
            o.R();
        }
        lVar.l();
        return y3VarO;
    }

    @Override // p009i2.n2
    public y3<p1> j(boolean z11, boolean z12, j jVar, l lVar, int i11) {
        long j11;
        lVar.o(727091888);
        if (o.J()) {
            o.S(727091888, i11, -1, "androidx.compose.material.DefaultTextFieldColors.labelColor (TextFieldDefaults.kt:895)");
        }
        y3<Boolean> y3VarA = f.a(jVar, lVar, (i11 >> 6) & 14);
        if (!z11) {
            j11 = this.disabledLabelColor;
        } else if (z12) {
            j11 = this.errorLabelColor;
        } else {
            j11 = l(y3VarA) ? this.focusedLabelColor : this.unfocusedLabelColor;
        }
        y3<p1> y3VarO = n3.o(p1.l(j11), lVar, 0);
        if (o.J()) {
            o.R();
        }
        lVar.l();
        return y3VarO;
    }

    private g0(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33) {
        this.textColor = j11;
        this.disabledTextColor = j12;
        this.cursorColor = j13;
        this.errorCursorColor = j14;
        this.focusedIndicatorColor = j15;
        this.unfocusedIndicatorColor = j16;
        this.errorIndicatorColor = j17;
        this.disabledIndicatorColor = j18;
        this.leadingIconColor = j19;
        this.disabledLeadingIconColor = j21;
        this.errorLeadingIconColor = j22;
        this.trailingIconColor = j23;
        this.disabledTrailingIconColor = j24;
        this.errorTrailingIconColor = j25;
        this.backgroundColor = j26;
        this.focusedLabelColor = j27;
        this.unfocusedLabelColor = j28;
        this.disabledLabelColor = j29;
        this.errorLabelColor = j31;
        this.placeholderColor = j32;
        this.disabledPlaceholderColor = j33;
    }
}
