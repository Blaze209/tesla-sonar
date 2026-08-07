package q1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J#\u0010\u001a\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u0017J#\u0010\u001b\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Lq1/v0;", "Lb4/b0;", "Landroidx/compose/ui/d$c;", "Landroidx/compose/foundation/o;", "scrollerState", "", "isReversed", "isVertical", "<init>", "(Landroidx/compose/foundation/o;ZZ)V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "Lz3/r;", "Lz3/q;", "", Snapshot.HEIGHT, "B", "(Lz3/r;Lz3/q;I)I", Snapshot.WIDTH, "q", Gender.MALE, "n", "Landroidx/compose/foundation/o;", "x2", "()Landroidx/compose/foundation/o;", "B2", "(Landroidx/compose/foundation/o;)V", "o", "Z", "y2", "()Z", "A2", "(Z)V", "p", "z2", "C2", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v0 extends androidx.compose.ui.d.c implements b4.b0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.foundation.o scrollerState;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean isReversed;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isVertical;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, jn0.h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f104353d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w0 f104354e;

        /* JADX INFO: renamed from: q1.v0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class C2208a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ w0 f104355c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f104356d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f104357e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2208a(w0 w0Var, int i11, int i12) {
                super(1);
                this.f104355c = w0Var;
                this.f104356d = i11;
                this.f104357e = i12;
            }

            public final void a(w0.a aVar) {
                w0.a.p(aVar, this.f104355c, this.f104356d, this.f104357e, BitmapDescriptorFactory.HUE_RED, null, 12, null);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(w0.a aVar) {
                a(aVar);
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, w0 w0Var) {
            super(1);
            this.f104353d = i11;
            this.f104354e = w0Var;
        }

        public final void a(w0.a aVar) {
            int iN = bo0.n.n(v0.this.getScrollerState().m(), 0, this.f104353d);
            int i11 = v0.this.getIsReversed() ? iN - this.f104353d : -iN;
            aVar.A(new C2208a(this.f104354e, v0.this.getIsVertical() ? 0 : i11, v0.this.getIsVertical() ? i11 : 0));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w0.a aVar) {
            a(aVar);
            return jn0.h0.f84049a;
        }
    }

    public v0(androidx.compose.foundation.o oVar, boolean z11, boolean z12) {
        this.scrollerState = oVar;
        this.isReversed = z11;
        this.isVertical = z12;
    }

    public final void A2(boolean z11) {
        this.isReversed = z11;
    }

    @Override // b4.b0
    public int B(z3.r rVar, z3.q qVar, int i11) {
        return this.isVertical ? qVar.s0(Integer.MAX_VALUE) : qVar.s0(i11);
    }

    public final void B2(androidx.compose.foundation.o oVar) {
        this.scrollerState = oVar;
    }

    public final void C2(boolean z11) {
        this.isVertical = z11;
    }

    @Override // b4.b0
    public int M(z3.r rVar, z3.q qVar, int i11) {
        return this.isVertical ? qVar.t0(Integer.MAX_VALUE) : qVar.t0(i11);
    }

    @Override // b4.b0
    public z3.j0 c(z3.k0 k0Var, z3.h0 h0Var, long j11) {
        j.a(j11, this.isVertical ? p021s1.p.Vertical : p021s1.p.Horizontal);
        w0 w0VarX0 = h0Var.x0(w4.b.d(j11, 0, this.isVertical ? w4.b.l(j11) : Integer.MAX_VALUE, 0, this.isVertical ? Integer.MAX_VALUE : w4.b.k(j11), 5, null));
        int iJ = bo0.n.j(w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w4.b.l(j11));
        int iJ2 = bo0.n.j(w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), w4.b.k(j11));
        int i11 = w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() - iJ2;
        int i12 = w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() - iJ;
        if (!this.isVertical) {
            i11 = i12;
        }
        this.scrollerState.o(i11);
        this.scrollerState.q(this.isVertical ? iJ2 : iJ);
        return z3.k0.N1(k0Var, iJ, iJ2, null, new a(i11, w0VarX0), 4, null);
    }

    @Override // b4.b0
    public int n(z3.r rVar, z3.q qVar, int i11) {
        return this.isVertical ? qVar.V(i11) : qVar.V(Integer.MAX_VALUE);
    }

    @Override // b4.b0
    public int q(z3.r rVar, z3.q qVar, int i11) {
        return this.isVertical ? qVar.m0(i11) : qVar.m0(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: x2, reason: from getter */
    public final androidx.compose.foundation.o getScrollerState() {
        return this.scrollerState;
    }

    /* JADX INFO: renamed from: y2, reason: from getter */
    public final boolean getIsReversed() {
        return this.isReversed;
    }

    /* JADX INFO: renamed from: z2, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }
}
