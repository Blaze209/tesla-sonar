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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J#\u0010\u001c\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J#\u0010\u001d\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0019R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R(\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00104\u001a\u00020\u000f*\u0002018BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b2\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lb4/b0;", "Landroidx/compose/ui/d$c;", "Lw4/h;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "<init>", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "Lz3/r;", "Lz3/q;", "", Snapshot.HEIGHT, "B", "(Lz3/r;Lz3/q;I)I", Snapshot.WIDTH, "q", Gender.MALE, "n", Gender.FEMALE, "getMinWidth-D9Ej5fM", "()F", "C2", "(F)V", "o", "getMinHeight-D9Ej5fM", "B2", "p", "getMaxWidth-D9Ej5fM", "A2", "getMaxHeight-D9Ej5fM", "z2", "r", "Z", "getEnforceIncoming", "()Z", "y2", "(Z)V", "Lw4/d;", "x2", "(Lw4/d;)J", "targetConstraints", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class y extends androidx.compose.ui.d.c implements b4.b0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float minWidth;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float minHeight;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float maxWidth;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float maxHeight;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean enforceIncoming;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f4677c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w0 w0Var) {
            super(1);
            this.f4677c = w0Var;
        }

        public final void a(w0.a aVar) {
            w0.a.l(aVar, this.f4677c, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public /* synthetic */ y(float f11, float f12, float f13, float f14, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13, f14, z11);
    }

    private final long x2(w4.d dVar) {
        int iF;
        int iF2;
        float f11 = this.maxWidth;
        w4.h.Companion companion = w4.h.INSTANCE;
        int i11 = 0;
        int iF3 = !w4.h.i(f11, companion.c()) ? bo0.n.f(dVar.i1(this.maxWidth), 0) : Integer.MAX_VALUE;
        int iF4 = !w4.h.i(this.maxHeight, companion.c()) ? bo0.n.f(dVar.i1(this.maxHeight), 0) : Integer.MAX_VALUE;
        if (w4.h.i(this.minWidth, companion.c()) || (iF = bo0.n.f(bo0.n.j(dVar.i1(this.minWidth), iF3), 0)) == Integer.MAX_VALUE) {
            iF = 0;
        }
        if (!w4.h.i(this.minHeight, companion.c()) && (iF2 = bo0.n.f(bo0.n.j(dVar.i1(this.minHeight), iF4), 0)) != Integer.MAX_VALUE) {
            i11 = iF2;
        }
        return w4.c.a(iF, iF3, i11, iF4);
    }

    public final void A2(float f11) {
        this.maxWidth = f11;
    }

    @Override // b4.b0
    public int B(z3.r rVar, z3.q qVar, int i11) {
        long jX2 = x2(rVar);
        return w4.b.j(jX2) ? w4.b.l(jX2) : w4.c.i(jX2, qVar.s0(i11));
    }

    public final void B2(float f11) {
        this.minHeight = f11;
    }

    public final void C2(float f11) {
        this.minWidth = f11;
    }

    @Override // b4.b0
    public int M(z3.r rVar, z3.q qVar, int i11) {
        long jX2 = x2(rVar);
        return w4.b.j(jX2) ? w4.b.l(jX2) : w4.c.i(jX2, qVar.t0(i11));
    }

    @Override // b4.b0
    public j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        long jA;
        long jX2 = x2(k0Var);
        if (this.enforceIncoming) {
            jA = w4.c.g(j11, jX2);
        } else {
            float f11 = this.minWidth;
            w4.h.Companion companion = w4.h.INSTANCE;
            jA = w4.c.a(!w4.h.i(f11, companion.c()) ? w4.b.n(jX2) : bo0.n.j(w4.b.n(j11), w4.b.l(jX2)), !w4.h.i(this.maxWidth, companion.c()) ? w4.b.l(jX2) : bo0.n.f(w4.b.l(j11), w4.b.n(jX2)), !w4.h.i(this.minHeight, companion.c()) ? w4.b.m(jX2) : bo0.n.j(w4.b.m(j11), w4.b.k(jX2)), !w4.h.i(this.maxHeight, companion.c()) ? w4.b.k(jX2) : bo0.n.f(w4.b.k(j11), w4.b.m(jX2)));
        }
        w0 w0VarX0 = h0Var.x0(jA);
        return k0.N1(k0Var, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), null, new a(w0VarX0), 4, null);
    }

    @Override // b4.b0
    public int n(z3.r rVar, z3.q qVar, int i11) {
        long jX2 = x2(rVar);
        return w4.b.i(jX2) ? w4.b.k(jX2) : w4.c.h(jX2, qVar.V(i11));
    }

    @Override // b4.b0
    public int q(z3.r rVar, z3.q qVar, int i11) {
        long jX2 = x2(rVar);
        return w4.b.i(jX2) ? w4.b.k(jX2) : w4.c.h(jX2, qVar.m0(i11));
    }

    public final void y2(boolean z11) {
        this.enforceIncoming = z11;
    }

    public final void z2(float f11) {
        this.maxHeight = f11;
    }

    private y(float f11, float f12, float f13, float f14, boolean z11) {
        this.minWidth = f11;
        this.minHeight = f12;
        this.maxWidth = f13;
        this.maxHeight = f14;
        this.enforceIncoming = z11;
    }
}
