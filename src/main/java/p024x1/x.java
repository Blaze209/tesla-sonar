package p024x1;

import j3.m;
import j3.n;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import w4.h;
import w4.i;
import w4.k;
import w4.v;
import w4.w;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\u000b*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b*\u00020\u0002H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u000b*\u00020\u0010H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\n*\u00020\u0010H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\n*\u00020\u000bH\u0017ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0016\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u0016*\u00020\u0017H\u0017ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0019\u0082\u0001\u0001\u001bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Lx1/x;", "Lz3/k0;", "", "index", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "", "Lz3/w0;", "c0", "(IJ)Ljava/util/List;", "Lw4/v;", "Lw4/h;", "p", "(J)F", "w", "(I)F", "", "x", "(F)F", "s", "(F)J", "E", "Lw4/k;", "Lj3/m;", "C", "(J)J", "o", "Lx1/y;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface x extends k0 {
    @Override // w4.d
    default long C(long j11) {
        return j11 != 9205357640488583168L ? n.a(O1(k.h(j11)), O1(k.g(j11))) : m.INSTANCE.a();
    }

    @Override // w4.l
    default long E(float f11) {
        return w.g(f11 / getFontScale());
    }

    List<w0> c0(int index, long constraints);

    @Override // w4.d
    default long o(long j11) {
        return j11 != 9205357640488583168L ? i.b(x(m.k(j11)), x(m.i(j11))) : k.INSTANCE.a();
    }

    @Override // w4.l
    default float p(long j11) {
        if (w4.x.g(v.g(j11), w4.x.INSTANCE.b())) {
            return h.g(v.h(j11) * getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // w4.d
    default long s(float f11) {
        return w.g(f11 / (getFontScale() * getDensity()));
    }

    @Override // w4.d
    default float w(int i11) {
        return h.g(i11 / getDensity());
    }

    @Override // w4.d
    default float x(float f11) {
        return h.g(f11 / getDensity());
    }
}
