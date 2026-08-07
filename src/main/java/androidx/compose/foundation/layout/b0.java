package androidx.compose.foundation.layout;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0014\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R4\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/foundation/layout/b0;", "Lb4/b0;", "Landroidx/compose/ui/d$c;", "Lv1/m;", "direction", "", "unbounded", "Lkotlin/Function2;", "Lw4/r;", "Lw4/t;", "Lw4/n;", "alignmentCallback", "<init>", "(Lv1/m;ZLwn0/p;)V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "n", "Lv1/m;", "getDirection", "()Lv1/m;", "z2", "(Lv1/m;)V", "o", "Z", "getUnbounded", "()Z", "A2", "(Z)V", "p", "Lwn0/p;", "x2", "()Lwn0/p;", "y2", "(Lwn0/p;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b0 extends androidx.compose.ui.d.c implements b4.b0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private v1.m direction;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean unbounded;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private wn0.p<? super w4.r, ? super w4.t, w4.n> alignmentCallback;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f4550d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w0 f4551e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f4552f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ k0 f4553g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, w0 w0Var, int i12, k0 k0Var) {
            super(1);
            this.f4550d = i11;
            this.f4551e = w0Var;
            this.f4552f = i12;
            this.f4553g = k0Var;
        }

        public final void a(w0.a aVar) {
            w0.a.j(aVar, this.f4551e, b0.this.x2().invoke(w4.r.b(w4.s.a(this.f4550d - this.f4551e.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), this.f4552f - this.f4551e.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String())), this.f4553g.getLayoutDirection()).getPackedValue(), BitmapDescriptorFactory.HUE_RED, 2, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public b0(v1.m mVar, boolean z11, wn0.p<? super w4.r, ? super w4.t, w4.n> pVar) {
        this.direction = mVar;
        this.unbounded = z11;
        this.alignmentCallback = pVar;
    }

    public final void A2(boolean z11) {
        this.unbounded = z11;
    }

    @Override // b4.b0
    public j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        v1.m mVar = this.direction;
        v1.m mVar2 = v1.m.Vertical;
        int iN = mVar != mVar2 ? 0 : w4.b.n(j11);
        v1.m mVar3 = this.direction;
        v1.m mVar4 = v1.m.Horizontal;
        w0 w0VarX0 = h0Var.x0(w4.c.a(iN, (this.direction == mVar2 || !this.unbounded) ? w4.b.l(j11) : Integer.MAX_VALUE, mVar3 == mVar4 ? w4.b.m(j11) : 0, (this.direction == mVar4 || !this.unbounded) ? w4.b.k(j11) : Integer.MAX_VALUE));
        int iN2 = bo0.n.n(w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w4.b.n(j11), w4.b.l(j11));
        int iN3 = bo0.n.n(w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), w4.b.m(j11), w4.b.k(j11));
        return k0.N1(k0Var, iN2, iN3, null, new a(iN2, w0VarX0, iN3, k0Var), 4, null);
    }

    public final wn0.p<w4.r, w4.t, w4.n> x2() {
        return this.alignmentCallback;
    }

    public final void y2(wn0.p<? super w4.r, ? super w4.t, w4.n> pVar) {
        this.alignmentCallback = pVar;
    }

    public final void z2(v1.m mVar) {
        this.direction = mVar;
    }
}
