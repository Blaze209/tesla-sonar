package k3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aN\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aN\u0010\u0012\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u0013\u0010\u001b\u001a\u00020\u0015*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\u0018*\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lm3/f;", "Lk3/p3;", "outline", "Lk3/p1;", "color", "", "alpha", "Lm3/g;", "style", "Lk3/q1;", "colorFilter", "Lk3/b1;", "blendMode", "Ljn0/h0;", "c", "(Lm3/f;Lk3/p3;JFLm3/g;Lk3/q1;I)V", "Lk3/h1;", "brush", "a", "(Lm3/f;Lk3/p3;Lk3/h1;FLm3/g;Lk3/q1;I)V", "Lj3/i;", "Lj3/g;", "g", "(Lj3/i;)J", "Lj3/m;", "e", "Lj3/k;", "h", "(Lj3/k;)J", "f", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q3 {
    public static final void a(m3.f fVar, p3 p3Var, h1 h1Var, float f11, m3.g gVar, q1 q1Var, int i11) {
        if (p3Var instanceof p3.b) {
            j3.i iVarB = ((p3.b) p3Var).b();
            fVar.h0(h1Var, g(iVarB), e(iVarB), f11, gVar, q1Var, i11);
            return;
        }
        if (!(p3Var instanceof p3.c)) {
            if (!(p3Var instanceof p3.a)) {
                throw new NoWhenBranchMatchedException();
            }
            fVar.E1(((p3.a) p3Var).getPath(), h1Var, f11, gVar, q1Var, i11);
            return;
        }
        p3.c cVar = (p3.c) p3Var;
        t3 roundRectPath = cVar.getRoundRectPath();
        if (roundRectPath != null) {
            fVar.E1(roundRectPath, h1Var, f11, gVar, q1Var, i11);
            return;
        }
        j3.k roundRect = cVar.getRoundRect();
        fVar.W0(h1Var, h(roundRect), f(roundRect), j3.b.b(j3.a.d(roundRect.getBottomLeftCornerRadius()), BitmapDescriptorFactory.HUE_RED, 2, null), f11, gVar, q1Var, i11);
    }

    public static /* synthetic */ void b(m3.f fVar, p3 p3Var, h1 h1Var, float f11, m3.g gVar, q1 q1Var, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            f11 = 1.0f;
        }
        float f12 = f11;
        if ((i12 & 8) != 0) {
            gVar = m3.j.f90966a;
        }
        m3.g gVar2 = gVar;
        if ((i12 & 16) != 0) {
            q1Var = null;
        }
        q1 q1Var2 = q1Var;
        if ((i12 & 32) != 0) {
            i11 = m3.f.INSTANCE.a();
        }
        a(fVar, p3Var, h1Var, f12, gVar2, q1Var2, i11);
    }

    public static final void c(m3.f fVar, p3 p3Var, long j11, float f11, m3.g gVar, q1 q1Var, int i11) {
        if (p3Var instanceof p3.b) {
            j3.i iVarB = ((p3.b) p3Var).b();
            fVar.w0(j11, g(iVarB), e(iVarB), f11, gVar, q1Var, i11);
            return;
        }
        if (!(p3Var instanceof p3.c)) {
            if (!(p3Var instanceof p3.a)) {
                throw new NoWhenBranchMatchedException();
            }
            fVar.e0(((p3.a) p3Var).getPath(), j11, f11, gVar, q1Var, i11);
            return;
        }
        p3.c cVar = (p3.c) p3Var;
        t3 roundRectPath = cVar.getRoundRectPath();
        if (roundRectPath != null) {
            fVar.e0(roundRectPath, j11, f11, gVar, q1Var, i11);
            return;
        }
        j3.k roundRect = cVar.getRoundRect();
        fVar.A1(j11, h(roundRect), f(roundRect), j3.b.b(j3.a.d(roundRect.getBottomLeftCornerRadius()), BitmapDescriptorFactory.HUE_RED, 2, null), gVar, f11, q1Var, i11);
    }

    public static /* synthetic */ void d(m3.f fVar, p3 p3Var, long j11, float f11, m3.g gVar, q1 q1Var, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            f11 = 1.0f;
        }
        float f12 = f11;
        if ((i12 & 8) != 0) {
            gVar = m3.j.f90966a;
        }
        m3.g gVar2 = gVar;
        if ((i12 & 16) != 0) {
            q1Var = null;
        }
        c(fVar, p3Var, j11, f12, gVar2, q1Var, (i12 & 32) != 0 ? m3.f.INSTANCE.a() : i11);
    }

    private static final long e(j3.i iVar) {
        return j3.n.a(iVar.o(), iVar.h());
    }

    private static final long f(j3.k kVar) {
        return j3.n.a(kVar.j(), kVar.d());
    }

    private static final long g(j3.i iVar) {
        return j3.h.a(iVar.getLeft(), iVar.getTop());
    }

    private static final long h(j3.k kVar) {
        return j3.h.a(kVar.getLeft(), kVar.getTop());
    }
}
