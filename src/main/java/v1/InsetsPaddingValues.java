package v1;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: v1.t, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0010\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Lv1/t;", "Lv1/y;", "Lv1/m0;", "insets", "Lw4/d;", "density", "<init>", "(Lv1/m0;Lw4/d;)V", "Lw4/t;", "layoutDirection", "Lw4/h;", "c", "(Lw4/t;)F", DateTokenConverter.CONVERTER_KEY, "()F", "b", "a", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lv1/m0;", "getInsets", "()Lv1/m0;", "Lw4/d;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class InsetsPaddingValues implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final m0 insets;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final w4.d density;

    public InsetsPaddingValues(m0 m0Var, w4.d dVar) {
        this.insets = m0Var;
        this.density = dVar;
    }

    @Override // v1.y
    /* JADX INFO: renamed from: a */
    public float getBottom() {
        w4.d dVar = this.density;
        return dVar.w(this.insets.b(dVar));
    }

    @Override // v1.y
    public float b(w4.t layoutDirection) {
        w4.d dVar = this.density;
        return dVar.w(this.insets.a(dVar, layoutDirection));
    }

    @Override // v1.y
    public float c(w4.t layoutDirection) {
        w4.d dVar = this.density;
        return dVar.w(this.insets.c(dVar, layoutDirection));
    }

    @Override // v1.y
    /* JADX INFO: renamed from: d */
    public float getTop() {
        w4.d dVar = this.density;
        return dVar.w(this.insets.d(dVar));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsetsPaddingValues)) {
            return false;
        }
        InsetsPaddingValues insetsPaddingValues = (InsetsPaddingValues) other;
        return p013kotlin.jvm.internal.s.f(this.insets, insetsPaddingValues.insets) && p013kotlin.jvm.internal.s.f(this.density, insetsPaddingValues.density);
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.density.hashCode();
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.insets + ", density=" + this.density + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
