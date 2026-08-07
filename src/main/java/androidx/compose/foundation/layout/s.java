package androidx.compose.foundation.layout;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/s;", "Lb4/b0;", "Landroidx/compose/ui/d$c;", "Lkotlin/Function1;", "Lw4/d;", "Lw4/n;", "offset", "", "rtlAware", "<init>", "(Lwn0/l;Z)V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "n", "Lwn0/l;", "x2", "()Lwn0/l;", "z2", "(Lwn0/l;)V", "o", "Z", "y2", "()Z", "A2", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class s extends androidx.compose.ui.d.c implements b4.b0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super w4.d, w4.n> offset;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean rtlAware;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k0 f4620d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w0 f4621e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k0 k0Var, w0 w0Var) {
            super(1);
            this.f4620d = k0Var;
            this.f4621e = w0Var;
        }

        public final void a(w0.a aVar) {
            long packedValue = s.this.x2().invoke(this.f4620d).getPackedValue();
            if (s.this.getRtlAware()) {
                w0.a.p(aVar, this.f4621e, w4.n.h(packedValue), w4.n.i(packedValue), BitmapDescriptorFactory.HUE_RED, null, 12, null);
            } else {
                w0.a.v(aVar, this.f4621e, w4.n.h(packedValue), w4.n.i(packedValue), BitmapDescriptorFactory.HUE_RED, null, 12, null);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public s(wn0.l<? super w4.d, w4.n> lVar, boolean z11) {
        this.offset = lVar;
        this.rtlAware = z11;
    }

    public final void A2(boolean z11) {
        this.rtlAware = z11;
    }

    @Override // b4.b0
    public j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        w0 w0VarX0 = h0Var.x0(j11);
        return k0.N1(k0Var, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), null, new a(k0Var, w0VarX0), 4, null);
    }

    public final wn0.l<w4.d, w4.n> x2() {
        return this.offset;
    }

    /* JADX INFO: renamed from: y2, reason: from getter */
    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    public final void z2(wn0.l<? super w4.d, w4.n> lVar) {
        this.offset = lVar;
    }
}
