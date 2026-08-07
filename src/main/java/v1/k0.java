package v1;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001c"}, d2 = {"Lv1/k0;", "Lv1/m0;", "first", "second", "<init>", "(Lv1/m0;Lv1/m0;)V", "Lw4/d;", "density", "Lw4/t;", "layoutDirection", "", "c", "(Lw4/d;Lw4/t;)I", DateTokenConverter.CONVERTER_KEY, "(Lw4/d;)I", "a", "b", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Lv1/m0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class k0 implements m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m0 first;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m0 second;

    public k0(m0 m0Var, m0 m0Var2) {
        this.first = m0Var;
        this.second = m0Var2;
    }

    @Override // v1.m0
    public int a(w4.d density, w4.t layoutDirection) {
        return Math.max(this.first.a(density, layoutDirection), this.second.a(density, layoutDirection));
    }

    @Override // v1.m0
    public int b(w4.d density) {
        return Math.max(this.first.b(density), this.second.b(density));
    }

    @Override // v1.m0
    public int c(w4.d density, w4.t layoutDirection) {
        return Math.max(this.first.c(density, layoutDirection), this.second.c(density, layoutDirection));
    }

    @Override // v1.m0
    public int d(w4.d density) {
        return Math.max(this.first.d(density), this.second.d(density));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) other;
        return p013kotlin.jvm.internal.s.f(k0Var.first, this.first) && p013kotlin.jvm.internal.s.f(k0Var.second, this.second);
    }

    public int hashCode() {
        return this.first.hashCode() + (this.second.hashCode() * 31);
    }

    public String toString() {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + this.first + " ∪ " + this.second + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
