package t1;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p021s1.p;
import p025y1.a0;
import p025y1.c0;
import p025y1.o;
import w4.t;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a?\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\n*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ly1/c0;", "pagerState", "Ly1/a0;", "pagerSnapDistance", "Lkotlin/Function3;", "", "calculateFinalSnappingBound", "Lt1/i;", "a", "(Ly1/c0;Ly1/a0;Lwn0/q;)Lt1/i;", "", "f", "(Ly1/c0;)Z", "g", "e", "(Ly1/c0;)F", "Lw4/t;", "layoutDirection", "snapPositionalThreshold", "flingVelocity", "lowerBoundOffset", "upperBoundOffset", DateTokenConverter.CONVERTER_KEY, "(Ly1/c0;Lw4/t;FFFF)F", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u00020\b*\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"t1/f$a", "Lt1/i;", "Lt1/j;", "snapPosition", "Lkotlin/Pair;", "", "e", "(Lt1/j;)Lkotlin/Pair;", "", DateTokenConverter.CONVERTER_KEY, "(F)Z", "velocity", "a", "(F)F", "decayOffset", "b", "(FF)F", "Ly1/n;", "c", "()Ly1/n;", "layoutInfo", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0 f112031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q<Float, Float, Float, Float> f112032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a0 f112033c;

        /* JADX WARN: Multi-variable type inference failed */
        a(c0 c0Var, q<? super Float, ? super Float, ? super Float, Float> qVar, a0 a0Var) {
            this.f112031a = c0Var;
            this.f112032b = qVar;
            this.f112033c = a0Var;
        }

        private final Pair<Float, Float> e(j snapPosition) {
            float f11;
            List<p025y1.f> listL = c().l();
            c0 c0Var = this.f112031a;
            int size = listL.size();
            float f12 = Float.NEGATIVE_INFINITY;
            float f13 = Float.POSITIVE_INFINITY;
            int i11 = 0;
            while (true) {
                f11 = BitmapDescriptorFactory.HUE_RED;
                if (i11 >= size) {
                    break;
                }
                p025y1.f fVar = listL.get(i11);
                float fA = k.a(o.a(c()), c().f(), c().getAfterContentPadding(), c().getPageSize(), fVar.getOffset(), fVar.getIndex(), snapPosition, c0Var.F());
                if (fA <= BitmapDescriptorFactory.HUE_RED && fA > f12) {
                    f12 = fA;
                }
                if (fA >= BitmapDescriptorFactory.HUE_RED && fA < f13) {
                    f13 = fA;
                }
                i11++;
            }
            if (f12 == Float.NEGATIVE_INFINITY) {
                f12 = f13;
            }
            if (f13 == Float.POSITIVE_INFINITY) {
                f13 = f12;
            }
            boolean z11 = f.e(this.f112031a) == BitmapDescriptorFactory.HUE_RED;
            if (!this.f112031a.c()) {
                if (z11 || !f.g(this.f112031a)) {
                    f13 = 0.0f;
                } else {
                    f12 = 0.0f;
                    f13 = 0.0f;
                }
            }
            if (this.f112031a.e()) {
                f11 = f12;
            } else if (!z11 && !f.g(this.f112031a)) {
                f13 = 0.0f;
            }
            return x.a(Float.valueOf(f11), Float.valueOf(f13));
        }

        @Override // t1.i
        public float a(float velocity) {
            Pair<Float, Float> pairE = e(this.f112031a.C().getSnapPosition());
            float fFloatValue = pairE.a().floatValue();
            float fFloatValue2 = pairE.b().floatValue();
            float fFloatValue3 = this.f112032b.invoke(Float.valueOf(velocity), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)).floatValue();
            if (fFloatValue3 == fFloatValue || fFloatValue3 == fFloatValue2 || fFloatValue3 == BitmapDescriptorFactory.HUE_RED) {
                return d(fFloatValue3) ? fFloatValue3 : BitmapDescriptorFactory.HUE_RED;
            }
            throw new IllegalStateException(("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0").toString());
        }

        @Override // t1.i
        public float b(float velocity, float decayOffset) {
            int iG = this.f112031a.G() + this.f112031a.I();
            if (iG == 0) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            int firstVisiblePage = velocity < BitmapDescriptorFactory.HUE_RED ? this.f112031a.getFirstVisiblePage() + 1 : this.f112031a.getFirstVisiblePage();
            int iF = n.f(Math.abs((n.n(this.f112033c.a(firstVisiblePage, n.n(((int) (decayOffset / iG)) + firstVisiblePage, 0, this.f112031a.F()), velocity, this.f112031a.G(), this.f112031a.I()), 0, this.f112031a.F()) - firstVisiblePage) * iG) - iG, 0);
            return iF == 0 ? iF : iF * Math.signum(velocity);
        }

        public final p025y1.n c() {
            return this.f112031a.C();
        }

        public final boolean d(float f11) {
            return (f11 == Float.POSITIVE_INFINITY || f11 == Float.NEGATIVE_INFINITY) ? false : true;
        }
    }

    public static final i a(c0 c0Var, a0 a0Var, q<? super Float, ? super Float, ? super Float, Float> qVar) {
        return new a(c0Var, qVar, a0Var);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008e A[RETURN] */
    public static final float d(c0 c0Var, t tVar, float f11, float f12, float f13, float f14) {
        boolean zG;
        if (c0Var.C().getOrientation() == p.Vertical || tVar == t.Ltr) {
            zG = g(c0Var);
        } else {
            zG = !g(c0Var);
        }
        int pageSize = c0Var.C().getPageSize();
        float fE = pageSize == 0 ? 0.0f : e(c0Var) / pageSize;
        float f15 = fE - ((int) fE);
        int iA = e.a(c0Var.getDensity(), f12);
        d.Companion companion = d.INSTANCE;
        if (!d.e(iA, companion.a())) {
            if (!d.e(iA, companion.b())) {
                if (d.e(iA, companion.c())) {
                    return f13;
                }
                return BitmapDescriptorFactory.HUE_RED;
            }
            return f14;
        }
        if (Math.abs(f15) <= f11 ? Math.abs(fE) < Math.abs(c0Var.L()) ? Math.abs(f13) >= Math.abs(f14) : !zG : zG) {
            return f14;
        }
        return f13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(c0 c0Var) {
        return c0Var.C().getOrientation() == p.Horizontal ? j3.g.m(c0Var.S()) : j3.g.n(c0Var.S());
    }

    private static final boolean f(c0 c0Var) {
        return e(c0Var) > BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(c0 c0Var) {
        boolean reverseLayout = c0Var.C().getReverseLayout();
        if (f(c0Var) && reverseLayout) {
            return true;
        }
        return (f(c0Var) || reverseLayout) ? false : true;
    }
}
