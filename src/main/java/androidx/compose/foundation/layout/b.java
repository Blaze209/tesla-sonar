package androidx.compose.foundation.layout;

import ezvcard.property.Gender;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import z3.h0;
import z3.j0;
import z3.k0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/b;", "Lb4/b0;", "Landroidx/compose/ui/d$c;", "Lz3/a;", "alignmentLine", "Lw4/h;", "before", "after", "<init>", "(Lz3/a;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "n", "Lz3/a;", "getAlignmentLine", "()Lz3/a;", "y2", "(Lz3/a;)V", "o", Gender.FEMALE, "getBefore-D9Ej5fM", "()F", "z2", "(F)V", "p", "getAfter-D9Ej5fM", "x2", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b extends androidx.compose.ui.d.c implements b4.b0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private z3.a alignmentLine;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float before;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float after;

    public /* synthetic */ b(z3.a aVar, float f11, float f12, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, f11, f12);
    }

    @Override // b4.b0
    public j0 c(k0 k0Var, h0 h0Var, long j11) {
        return a.c(k0Var, this.alignmentLine, this.before, this.after, h0Var, j11);
    }

    public final void x2(float f11) {
        this.after = f11;
    }

    public final void y2(z3.a aVar) {
        this.alignmentLine = aVar;
    }

    public final void z2(float f11) {
        this.before = f11;
    }

    private b(z3.a aVar, float f11, float f12) {
        this.alignmentLine = aVar;
        this.before = f11;
        this.after = f12;
    }
}
