package p016o2;

import androidx.compose.ui.d;
import b4.b0;
import b4.h;
import b4.i;
import bo0.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import wn0.l;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Lo2/u;", "Landroidx/compose/ui/d$c;", "Lb4/h;", "Lb4/b0;", "<init>", "()V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u extends d.c implements h, b0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f96161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w0 f96162d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f96163e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, w0 w0Var, int i12) {
            super(1);
            this.f96161c = i11;
            this.f96162d = w0Var;
            this.f96163e = i12;
        }

        public final void a(w0.a aVar) {
            w0.a.h(aVar, this.f96162d, yn0.a.d((this.f96161c - this.f96162d.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String()) / 2.0f), yn0.a.d((this.f96163e - this.f96162d.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String()) / 2.0f), BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    @Override // b4.b0
    public j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        float f11 = 0;
        float fG = w4.h.g(n.e(((w4.h) i.a(this, s.a())).getValue(), w4.h.g(f11)));
        w0 w0VarX0 = h0Var.x0(j11);
        boolean z11 = getIsAttached() && !Float.isNaN(fG) && w4.h.f(fG, w4.h.g(f11)) > 0;
        int iI1 = Float.isNaN(fG) ? 0 : k0Var.i1(fG);
        int iMax = z11 ? Math.max(w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), iI1) : w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
        int iMax2 = z11 ? Math.max(w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), iI1) : w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
        return k0.N1(k0Var, iMax, iMax2, null, new a(iMax, w0VarX0, iMax2), 4, null);
    }
}
