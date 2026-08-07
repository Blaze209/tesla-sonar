package w4;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\u00020\u0003*\u00020\tH\u0017ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\u0006*\u00020\tH\u0017ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u0002*\u00020\u0006H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u0002*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0005J\u0019\u0010\u0011\u001a\u00020\t*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u0013*\u00020\u0014H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lw4/d;", "Lw4/l;", "Lw4/h;", "", "O1", "(F)F", "", "i1", "(F)I", "Lw4/v;", "m1", "(J)F", "Q1", "(J)I", "w", "(I)F", "x", "s", "(F)J", "Lw4/k;", "Lj3/m;", "C", "(J)J", "o", "getDensity", "()F", "getDensity$annotations", "()V", "density", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface d extends l {
    default long C(long j11) {
        return j11 != 9205357640488583168L ? j3.n.a(O1(k.h(j11)), O1(k.g(j11))) : j3.m.INSTANCE.a();
    }

    default float O1(float f11) {
        return f11 * getDensity();
    }

    default int Q1(long j11) {
        return Math.round(m1(j11));
    }

    float getDensity();

    default int i1(float f11) {
        float fO1 = O1(f11);
        if (Float.isInfinite(fO1)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fO1);
    }

    default float m1(long j11) {
        if (x.g(v.g(j11), x.INSTANCE.b())) {
            return O1(p(j11));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    default long o(long j11) {
        return j11 != 9205357640488583168L ? i.b(x(j3.m.k(j11)), x(j3.m.i(j11))) : k.INSTANCE.a();
    }

    default long s(float f11) {
        return E(x(f11));
    }

    default float w(int i11) {
        return h.g(i11 / getDensity());
    }

    default float x(float f11) {
        return h.g(f11 / getDensity());
    }
}
