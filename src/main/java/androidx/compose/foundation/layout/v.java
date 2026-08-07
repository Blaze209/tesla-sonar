package androidx.compose.foundation.layout;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/layout/v;", "Lb4/b0;", "Landroidx/compose/ui/d$c;", "Lv1/y;", "paddingValues", "<init>", "(Lv1/y;)V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "n", "Lv1/y;", "x2", "()Lv1/y;", "y2", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class v extends androidx.compose.ui.d.c implements b4.b0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private v1.y paddingValues;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f4639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k0 f4640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ v f4641e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w0 w0Var, k0 k0Var, v vVar) {
            super(1);
            this.f4639c = w0Var;
            this.f4640d = k0Var;
            this.f4641e = vVar;
        }

        public final void a(w0.a aVar) {
            w0.a.h(aVar, this.f4639c, this.f4640d.i1(this.f4641e.getPaddingValues().c(this.f4640d.getLayoutDirection())), this.f4640d.i1(this.f4641e.getPaddingValues().getTop()), BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public v(v1.y yVar) {
        this.paddingValues = yVar;
    }

    @Override // b4.b0
    public j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        float f11 = 0;
        if (w4.h.f(this.paddingValues.c(k0Var.getLayoutDirection()), w4.h.g(f11)) < 0 || w4.h.f(this.paddingValues.getTop(), w4.h.g(f11)) < 0 || w4.h.f(this.paddingValues.b(k0Var.getLayoutDirection()), w4.h.g(f11)) < 0 || w4.h.f(this.paddingValues.getBottom(), w4.h.g(f11)) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int iI1 = k0Var.i1(this.paddingValues.c(k0Var.getLayoutDirection())) + k0Var.i1(this.paddingValues.b(k0Var.getLayoutDirection()));
        int iI2 = k0Var.i1(this.paddingValues.getTop()) + k0Var.i1(this.paddingValues.getBottom());
        w0 w0VarX0 = h0Var.x0(w4.c.o(j11, -iI1, -iI2));
        return k0.N1(k0Var, w4.c.i(j11, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() + iI1), w4.c.h(j11, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() + iI2), null, new a(w0VarX0, k0Var, this), 4, null);
    }

    /* JADX INFO: renamed from: x2, reason: from getter */
    public final v1.y getPaddingValues() {
        return this.paddingValues;
    }

    public final void y2(v1.y yVar) {
        this.paddingValues = yVar;
    }
}
