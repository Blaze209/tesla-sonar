package p009i2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import k3.p1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.l;
import p020r2.n3;
import p020r2.o;
import p020r2.y3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000e\u0010\rJ\u001a\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Li2/a0;", "Li2/i;", "Lk3/p1;", "backgroundColor", "contentColor", "disabledBackgroundColor", "disabledContentColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Lr2/y3;", "a", "(ZLr2/l;I)Lr2/y3;", "b", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "c", DateTokenConverter.CONVERTER_KEY, "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class a0 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long backgroundColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long contentColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long disabledBackgroundColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long disabledContentColor;

    public /* synthetic */ a0(long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14);
    }

    @Override // p009i2.i
    public y3<p1> a(boolean z11, l lVar, int i11) {
        lVar.o(-655254499);
        if (o.J()) {
            o.S(-655254499, i11, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:587)");
        }
        y3<p1> y3VarO = n3.o(p1.l(z11 ? this.backgroundColor : this.disabledBackgroundColor), lVar, 0);
        if (o.J()) {
            o.R();
        }
        lVar.l();
        return y3VarO;
    }

    @Override // p009i2.i
    public y3<p1> b(boolean z11, l lVar, int i11) {
        lVar.o(-2133647540);
        if (o.J()) {
            o.S(-2133647540, i11, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:592)");
        }
        y3<p1> y3VarO = n3.o(p1.l(z11 ? this.contentColor : this.disabledContentColor), lVar, 0);
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
        if (other == null || a0.class != other.getClass()) {
            return false;
        }
        a0 a0Var = (a0) other;
        return p1.r(this.backgroundColor, a0Var.backgroundColor) && p1.r(this.contentColor, a0Var.contentColor) && p1.r(this.disabledBackgroundColor, a0Var.disabledBackgroundColor) && p1.r(this.disabledContentColor, a0Var.disabledContentColor);
    }

    public int hashCode() {
        return (((((p1.x(this.backgroundColor) * 31) + p1.x(this.contentColor)) * 31) + p1.x(this.disabledBackgroundColor)) * 31) + p1.x(this.disabledContentColor);
    }

    private a0(long j11, long j12, long j13, long j14) {
        this.backgroundColor = j11;
        this.contentColor = j12;
        this.disabledBackgroundColor = j13;
        this.disabledContentColor = j14;
    }
}
