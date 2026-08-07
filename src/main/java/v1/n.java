package v1;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001c"}, d2 = {"Lv1/n;", "Lv1/m0;", "included", "excluded", "<init>", "(Lv1/m0;Lv1/m0;)V", "Lw4/d;", "density", "Lw4/t;", "layoutDirection", "", "c", "(Lw4/d;Lw4/t;)I", DateTokenConverter.CONVERTER_KEY, "(Lw4/d;)I", "a", "b", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lv1/m0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class n implements m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m0 included;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m0 excluded;

    public n(m0 m0Var, m0 m0Var2) {
        this.included = m0Var;
        this.excluded = m0Var2;
    }

    @Override // v1.m0
    public int a(w4.d density, w4.t layoutDirection) {
        return bo0.n.f(this.included.a(density, layoutDirection) - this.excluded.a(density, layoutDirection), 0);
    }

    @Override // v1.m0
    public int b(w4.d density) {
        return bo0.n.f(this.included.b(density) - this.excluded.b(density), 0);
    }

    @Override // v1.m0
    public int c(w4.d density, w4.t layoutDirection) {
        return bo0.n.f(this.included.c(density, layoutDirection) - this.excluded.c(density, layoutDirection), 0);
    }

    @Override // v1.m0
    public int d(w4.d density) {
        return bo0.n.f(this.included.d(density) - this.excluded.d(density), 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof n)) {
            return false;
        }
        n nVar = (n) other;
        return p013kotlin.jvm.internal.s.f(nVar.included, this.included) && p013kotlin.jvm.internal.s.f(nVar.excluded, this.excluded);
    }

    public int hashCode() {
        return (this.included.hashCode() * 31) + this.excluded.hashCode();
    }

    public String toString() {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + this.included + " - " + this.excluded + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
