package p025y1;

import androidx.compose.ui.platform.z0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.r;
import p013kotlin.jvm.internal.u;
import p019p1.f2;
import p019p1.i;
import p019p1.j;
import p019p1.z;
import p020r2.l;
import p020r2.o;
import p021s1.b0;
import p021s1.p;
import t1.f;
import t1.h;
import w4.d;
import w4.t;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0003\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ly1/k;", "", "<init>", "()V", "Ly1/c0;", "state", "Ly1/a0;", "pagerSnapDistance", "Lp1/z;", "", "decayAnimationSpec", "Lp1/i;", "snapAnimationSpec", "snapPositionalThreshold", "Ls1/b0;", "a", "(Ly1/c0;Ly1/a0;Lp1/z;Lp1/i;FLr2/l;II)Ls1/b0;", "Ls1/p;", "orientation", "Lu3/a;", "b", "(Ly1/c0;Ls1/p;Lr2/l;I)Lu3/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f124534a = new k();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0005\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "flingVelocity", "lowerBound", "upperBound", "a", "(FFF)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements q<Float, Float, Float, Float> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f124535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ t f124536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f124537e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c0 c0Var, t tVar, float f11) {
            super(3);
            this.f124535c = c0Var;
            this.f124536d = tVar;
            this.f124537e = f11;
        }

        public final Float a(float f11, float f12, float f13) {
            return Float.valueOf(f.d(this.f124535c, this.f124536d, this.f124537e, f11, f12, f13));
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Float invoke(Float f11, Float f12, Float f13) {
            return a(f11.floatValue(), f12.floatValue(), f13.floatValue());
        }
    }

    private k() {
    }

    public final b0 a(c0 c0Var, a0 a0Var, z<Float> zVar, i<Float> iVar, float f11, l lVar, int i11, int i12) {
        boolean z11 = true;
        if ((i12 & 2) != 0) {
            a0Var = a0.INSTANCE.a(1);
        }
        if ((i12 & 4) != 0) {
            zVar = p015o1.z.b(lVar, 0);
        }
        if ((i12 & 8) != 0) {
            iVar = j.j(BitmapDescriptorFactory.HUE_RED, 400.0f, Float.valueOf(f2.b(r.f86532a)), 1, null);
        }
        if ((i12 & 16) != 0) {
            f11 = 0.5f;
        }
        if (o.J()) {
            o.S(1559769181, i11, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:301)");
        }
        if (BitmapDescriptorFactory.HUE_RED > f11 || f11 > 1.0f) {
            throw new IllegalArgumentException(("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f11).toString());
        }
        Object obj = (d) lVar.U(z0.g());
        t tVar = (t) lVar.U(z0.m());
        boolean zN = ((((i11 & 14) ^ 6) > 4 && lVar.n(c0Var)) || (i11 & 6) == 4) | lVar.n(zVar) | lVar.n(iVar);
        if ((((i11 & 112) ^ 48) <= 32 || !lVar.n(a0Var)) && (i11 & 48) != 32) {
            z11 = false;
        }
        boolean zN2 = zN | z11 | lVar.n(obj) | lVar.n(tVar);
        Object objI = lVar.I();
        if (zN2 || objI == l.INSTANCE.a()) {
            objI = h.l(f.a(c0Var, a0Var, new a(c0Var, tVar, f11)), zVar, iVar);
            lVar.B(objI);
        }
        b0 b0Var = (b0) objI;
        if (o.J()) {
            o.R();
        }
        return b0Var;
    }

    public final u3.a b(c0 c0Var, p pVar, l lVar, int i11) {
        if (o.J()) {
            o.S(877583120, i11, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:350)");
        }
        boolean z11 = ((((i11 & 14) ^ 6) > 4 && lVar.n(c0Var)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && lVar.n(pVar)) || (i11 & 48) == 32);
        Object objI = lVar.I();
        if (z11 || objI == l.INSTANCE.a()) {
            objI = new p025y1.a(c0Var, pVar);
            lVar.B(objI);
        }
        p025y1.a aVar = (p025y1.a) objI;
        if (o.J()) {
            o.R();
        }
        return aVar;
    }
}
