package androidx.compose.foundation.layout;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J#\u0010\u0018\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J#\u0010\u0019\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0015R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/layout/z;", "Lb4/b0;", "Landroidx/compose/ui/d$c;", "Lw4/h;", "minWidth", "minHeight", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "Lz3/r;", "Lz3/q;", "", Snapshot.HEIGHT, "B", "(Lz3/r;Lz3/q;I)I", Gender.MALE, Snapshot.WIDTH, "q", "n", Gender.FEMALE, "getMinWidth-D9Ej5fM", "()F", "y2", "(F)V", "o", "getMinHeight-D9Ej5fM", "x2", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class z extends androidx.compose.ui.d.c implements b4.b0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float minWidth;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float minHeight;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f4680c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w0 w0Var) {
            super(1);
            this.f4680c = w0Var;
        }

        public final void a(w0.a aVar) {
            w0.a.l(aVar, this.f4680c, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public /* synthetic */ z(float f11, float f12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12);
    }

    @Override // b4.b0
    public int B(z3.r rVar, z3.q qVar, int i11) {
        return bo0.n.f(qVar.s0(i11), !w4.h.i(this.minWidth, w4.h.INSTANCE.c()) ? rVar.i1(this.minWidth) : 0);
    }

    @Override // b4.b0
    public int M(z3.r rVar, z3.q qVar, int i11) {
        return bo0.n.f(qVar.t0(i11), !w4.h.i(this.minWidth, w4.h.INSTANCE.c()) ? rVar.i1(this.minWidth) : 0);
    }

    @Override // b4.b0
    public j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        float f11 = this.minWidth;
        w4.h.Companion companion = w4.h.INSTANCE;
        w0 w0VarX0 = h0Var.x0(w4.c.a((w4.h.i(f11, companion.c()) || w4.b.n(j11) != 0) ? w4.b.n(j11) : bo0.n.f(bo0.n.j(k0Var.i1(this.minWidth), w4.b.l(j11)), 0), w4.b.l(j11), (w4.h.i(this.minHeight, companion.c()) || w4.b.m(j11) != 0) ? w4.b.m(j11) : bo0.n.f(bo0.n.j(k0Var.i1(this.minHeight), w4.b.k(j11)), 0), w4.b.k(j11)));
        return k0.N1(k0Var, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), null, new a(w0VarX0), 4, null);
    }

    @Override // b4.b0
    public int n(z3.r rVar, z3.q qVar, int i11) {
        return bo0.n.f(qVar.V(i11), !w4.h.i(this.minHeight, w4.h.INSTANCE.c()) ? rVar.i1(this.minHeight) : 0);
    }

    @Override // b4.b0
    public int q(z3.r rVar, z3.q qVar, int i11) {
        return bo0.n.f(qVar.m0(i11), !w4.h.i(this.minHeight, w4.h.INSTANCE.c()) ? rVar.i1(this.minHeight) : 0);
    }

    public final void x2(float f11) {
        this.minHeight = f11;
    }

    public final void y2(float f11) {
        this.minWidth = f11;
    }

    private z(float f11, float f12) {
        this.minWidth = f11;
        this.minHeight = f12;
    }
}
