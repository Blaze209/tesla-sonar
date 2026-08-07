package androidx.compose.material;

import b4.b0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p009i2.j0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.u;
import w4.r;
import w4.s;
import wn0.l;
import wn0.p;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012*\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0018\u001a\u00020\u0017*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fRF\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/material/b;", "T", "Landroidx/compose/ui/d$c;", "Lb4/b0;", "Li2/c;", "state", "Lkotlin/Function2;", "Lw4/r;", "Lw4/b;", "Lkotlin/Pair;", "Li2/j0;", "anchors", "Ls1/p;", "orientation", "<init>", "(Li2/c;Lwn0/p;Ls1/p;)V", "Ljn0/h0;", "i2", "()V", "Lz3/k0;", "Lz3/h0;", "measurable", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "n", "Li2/c;", "y2", "()Li2/c;", "B2", "(Li2/c;)V", "o", "Lwn0/p;", "getAnchors", "()Lwn0/p;", "z2", "(Lwn0/p;)V", "p", "Ls1/p;", "x2", "()Ls1/p;", "A2", "(Ls1/p;)V", "", "q", "Z", "didLookahead", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b<T> extends androidx.compose.ui.d.c implements b0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private p009i2.c<T> state;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private p<? super r, ? super w4.b, ? extends Pair<? extends j0<T>, ? extends T>> anchors;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private p021s1.p orientation;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean didLookahead;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f5054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b<T> f5055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w0 f5056e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k0 k0Var, b<T> bVar, w0 w0Var) {
            super(1);
            this.f5054c = k0Var;
            this.f5055d = bVar;
            this.f5056e = w0Var;
        }

        public final void a(w0.a aVar) {
            float fE = this.f5054c.d1() ? this.f5055d.y2().o().e(this.f5055d.y2().x()) : this.f5055d.y2().A();
            float f11 = this.f5055d.getOrientation() == p021s1.p.Horizontal ? fE : 0.0f;
            if (this.f5055d.getOrientation() != p021s1.p.Vertical) {
                fE = 0.0f;
            }
            w0.a.h(aVar, this.f5056e, yn0.a.d(f11), yn0.a.d(fE), BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public b(p009i2.c<T> cVar, p<? super r, ? super w4.b, ? extends Pair<? extends j0<T>, ? extends T>> pVar, p021s1.p pVar2) {
        this.state = cVar;
        this.anchors = pVar;
        this.orientation = pVar2;
    }

    public final void A2(p021s1.p pVar) {
        this.orientation = pVar;
    }

    public final void B2(p009i2.c<T> cVar) {
        this.state = cVar;
    }

    @Override // b4.b0
    public z3.j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        w0 w0VarX0 = h0Var.x0(j11);
        if (!k0Var.d1() || !this.didLookahead) {
            Pair<? extends j0<T>, ? extends T> pairInvoke = this.anchors.invoke(r.b(s.a(w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String())), w4.b.a(j11));
            this.state.I(pairInvoke.e(), pairInvoke.f());
        }
        this.didLookahead = k0Var.d1() || this.didLookahead;
        return k0.N1(k0Var, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), null, new a(k0Var, this, w0VarX0), 4, null);
    }

    @Override // androidx.compose.ui.d.c
    public void i2() {
        this.didLookahead = false;
    }

    /* JADX INFO: renamed from: x2, reason: from getter */
    public final p021s1.p getOrientation() {
        return this.orientation;
    }

    public final p009i2.c<T> y2() {
        return this.state;
    }

    public final void z2(p<? super r, ? super w4.b, ? extends Pair<? extends j0<T>, ? extends T>> pVar) {
        this.anchors = pVar;
    }
}
