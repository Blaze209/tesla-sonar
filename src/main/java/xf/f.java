package xf;

import b4.b0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import w4.r;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Lxf/f;", "Landroidx/compose/ui/d$c;", "Lb4/b0;", "", Snapshot.WIDTH, Snapshot.HEIGHT, "<init>", "(II)V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "n", "I", "getWidth", "()I", "y2", "(I)V", "o", "getHeight", "x2", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f extends androidx.compose.ui.d.c implements b0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int width;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int height;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f123418c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w0 w0Var) {
            super(1);
            this.f123418c = w0Var;
        }

        public final void a(w0.a layout) {
            s.k(layout, "$this$layout");
            w0.a.l(layout, this.f123418c, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public f(int i11, int i12) {
        this.width = i11;
        this.height = i12;
    }

    @Override // b4.b0
    public j0 c(k0 measure, z3.h0 measurable, long j11) {
        long jA;
        s.k(measure, "$this$measure");
        s.k(measurable, "measurable");
        long jF = w4.c.f(j11, w4.s.a(this.width, this.height));
        if (w4.b.k(j11) != Integer.MAX_VALUE || w4.b.l(j11) == Integer.MAX_VALUE) {
            jA = (w4.b.l(j11) != Integer.MAX_VALUE || w4.b.k(j11) == Integer.MAX_VALUE) ? w4.c.a(r.g(jF), r.g(jF), r.f(jF), r.f(jF)) : w4.c.a((r.f(jF) * this.width) / this.height, (r.f(jF) * this.width) / this.height, r.f(jF), r.f(jF));
        } else {
            jA = w4.c.a(r.g(jF), r.g(jF), (r.g(jF) * this.height) / this.width, (r.g(jF) * this.height) / this.width);
        }
        w0 w0VarX0 = measurable.x0(jA);
        return k0.N1(measure, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), null, new a(w0VarX0), 4, null);
    }

    public final void x2(int i11) {
        this.height = i11;
    }

    public final void y2(int i11) {
        this.width = i11;
    }
}
