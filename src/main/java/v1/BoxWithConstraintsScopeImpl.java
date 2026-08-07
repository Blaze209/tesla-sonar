package v1;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: v1.f, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\f\u001a\u00020\t*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000e\u001a\u00020\t*\u00020\tH\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR \u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010\"\u001a\u00020\u001f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\u00020\u001f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b#\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Lv1/f;", "Lv1/e;", "Lv1/c;", "Lw4/d;", "density", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "<init>", "(Lw4/d;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/d;", "Ld3/c;", "alignment", "a", "(Landroidx/compose/ui/d;Ld3/c;)Landroidx/compose/ui/d;", "e", "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lw4/d;", "b", "J", "()J", "Lw4/h;", "c", "()F", "maxWidth", DateTokenConverter.CONVERTER_KEY, "maxHeight", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class BoxWithConstraintsScopeImpl implements e, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final w4.d density;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long constraints;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ androidx.compose.foundation.layout.i f117487c;

    public /* synthetic */ BoxWithConstraintsScopeImpl(w4.d dVar, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j11);
    }

    @Override // v1.c
    public androidx.compose.ui.d a(androidx.compose.ui.d dVar, d3.c cVar) {
        return this.f117487c.a(dVar, cVar);
    }

    @Override // v1.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public long getConstraints() {
        return this.constraints;
    }

    @Override // v1.e
    public float c() {
        return w4.b.h(getConstraints()) ? this.density.w(w4.b.l(getConstraints())) : w4.h.INSTANCE.b();
    }

    @Override // v1.e
    public float d() {
        return w4.b.g(getConstraints()) ? this.density.w(w4.b.k(getConstraints())) : w4.h.INSTANCE.b();
    }

    @Override // v1.c
    public androidx.compose.ui.d e(androidx.compose.ui.d dVar) {
        return this.f117487c.e(dVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) other;
        return p013kotlin.jvm.internal.s.f(this.density, boxWithConstraintsScopeImpl.density) && w4.b.f(this.constraints, boxWithConstraintsScopeImpl.constraints);
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + w4.b.o(this.constraints);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + ((Object) w4.b.q(this.constraints)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private BoxWithConstraintsScopeImpl(w4.d dVar, long j11) {
        this.density = dVar;
        this.constraints = j11;
        this.f117487c = androidx.compose.foundation.layout.i.f4585a;
    }
}
