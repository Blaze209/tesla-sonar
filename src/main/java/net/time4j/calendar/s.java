package net.time4j.calendar;

import net.time4j.engine.g;
import net.time4j.engine.y;
import net.time4j.x0;
import net.time4j.z0;

/* JADX INFO: loaded from: classes9.dex */
class s<D extends net.time4j.engine.g> implements y<D, x0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0 f94095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final net.time4j.engine.s<D, net.time4j.engine.k<D>> f94096b;

    s(z0 z0Var, net.time4j.engine.s<D, net.time4j.engine.k<D>> sVar) {
        this.f94095a = z0Var;
        this.f94096b = sVar;
    }

    private static x0 h(long j11) {
        return x0.valueOf(net.time4j.base.c.d(j11 + 5, 7) + 1);
    }

    @Override // net.time4j.engine.y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public net.time4j.engine.p<?> getChildAtCeiling(D d11) {
        return null;
    }

    @Override // net.time4j.engine.y
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public net.time4j.engine.p<?> getChildAtFloor(D d11) {
        return null;
    }

    @Override // net.time4j.engine.y
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public x0 getMaximum(D d11) {
        net.time4j.engine.k<D> kVarApply = this.f94096b.apply(d11);
        return (d11.h() + 7) - ((long) getValue(d11).getValue(this.f94095a)) > kVarApply.a() ? h(kVarApply.a()) : this.f94095a.f().roll(6);
    }

    @Override // net.time4j.engine.y
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public x0 getMinimum(D d11) {
        net.time4j.engine.k<D> kVarApply = this.f94096b.apply(d11);
        return (d11.h() + 1) - ((long) getValue(d11).getValue(this.f94095a)) < kVarApply.c() ? h(kVarApply.c()) : this.f94095a.f();
    }

    @Override // net.time4j.engine.y
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public x0 getValue(D d11) {
        return h(d11.h());
    }

    @Override // net.time4j.engine.y
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean isValid(D d11, x0 x0Var) {
        if (x0Var == null) {
            return false;
        }
        long jH = (d11.h() + ((long) x0Var.getValue(this.f94095a))) - ((long) getValue(d11).getValue(this.f94095a));
        net.time4j.engine.k<D> kVarApply = this.f94096b.apply(d11);
        return jH >= kVarApply.c() && jH <= kVarApply.a();
    }

    @Override // net.time4j.engine.y
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public D withValue(D d11, x0 x0Var, boolean z11) {
        if (x0Var == null) {
            throw new IllegalArgumentException("Missing weekday.");
        }
        int value = getValue(d11).getValue(this.f94095a);
        long jH = (d11.h() + ((long) x0Var.getValue(this.f94095a))) - ((long) value);
        net.time4j.engine.k<D> kVarApply = this.f94096b.apply(d11);
        if (jH < kVarApply.c() || jH > kVarApply.a()) {
            throw new IllegalArgumentException("New day out of supported range.");
        }
        return kVarApply.b(jH);
    }
}
