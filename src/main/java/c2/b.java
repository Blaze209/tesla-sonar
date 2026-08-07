package c2;

import b4.b0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import wn0.l;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Lc2/b;", "Lc2/a;", "Lb4/b0;", "Lkotlin/Function0;", "", "onHandwritingSlopExceeded", "<init>", "(Lwn0/a;)V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "R1", "()Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b extends c2.a implements b0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f18581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f18582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f18583e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w0 w0Var, int i11, int i12) {
            super(1);
            this.f18581c = w0Var;
            this.f18582d = i11;
            this.f18583e = i12;
        }

        public final void a(w0.a aVar) {
            w0.a.h(aVar, this.f18581c, -this.f18582d, -this.f18583e, BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public b(wn0.a<Boolean> aVar) {
        super(aVar);
    }

    @Override // b4.p1
    public boolean R1() {
        return true;
    }

    @Override // b4.b0
    public j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        int iI1 = k0Var.i1(androidx.compose.foundation.text.handwriting.a.b());
        int iI2 = k0Var.i1(androidx.compose.foundation.text.handwriting.a.a());
        int i11 = iI2 * 2;
        int i12 = iI1 * 2;
        w0 w0VarX0 = h0Var.x0(w4.c.o(j11, i11, i12));
        return k0.N1(k0Var, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() - i11, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() - i12, null, new a(w0VarX0, iI2, iI1), 4, null);
    }
}
