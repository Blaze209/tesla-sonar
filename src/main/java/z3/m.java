package z3;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lz3/m;", "Lz3/h0;", "Lz3/q;", "measurable", "Lz3/s;", "minMax", "Lz3/t;", "widthHeight", "<init>", "(Lz3/q;Lz3/s;Lz3/t;)V", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/w0;", "x0", "(J)Lz3/w0;", "", Snapshot.HEIGHT, "s0", "(I)I", "t0", Snapshot.WIDTH, "m0", "V", "a", "Lz3/q;", "getMeasurable", "()Lz3/q;", "b", "Lz3/s;", "c", "Lz3/t;", "", "()Ljava/lang/Object;", "parentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q measurable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s minMax;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t widthHeight;

    public m(q qVar, s sVar, t tVar) {
        this.measurable = qVar;
        this.minMax = sVar;
        this.widthHeight = tVar;
    }

    @Override // z3.q
    public int V(int width) {
        return this.measurable.V(width);
    }

    @Override // z3.q
    public Object c() {
        return this.measurable.c();
    }

    @Override // z3.q
    public int m0(int width) {
        return this.measurable.m0(width);
    }

    @Override // z3.q
    public int s0(int height) {
        return this.measurable.s0(height);
    }

    @Override // z3.q
    public int t0(int height) {
        return this.measurable.t0(height);
    }

    @Override // z3.h0
    public w0 x0(long constraints) {
        if (this.widthHeight == t.Width) {
            return new o(this.minMax == s.Max ? this.measurable.t0(w4.b.k(constraints)) : this.measurable.s0(w4.b.k(constraints)), w4.b.g(constraints) ? w4.b.k(constraints) : 32767);
        }
        return new o(w4.b.h(constraints) ? w4.b.l(constraints) : 32767, this.minMax == s.Max ? this.measurable.V(w4.b.l(constraints)) : this.measurable.m0(w4.b.l(constraints)));
    }
}
