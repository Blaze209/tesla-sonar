package net.time4j.calendar;

import java.util.Collections;
import java.util.Map;
import net.time4j.engine.q;
import net.time4j.engine.y;
import net.time4j.engine.z;

/* JADX INFO: loaded from: classes9.dex */
final class n<T extends net.time4j.engine.q<T>> implements y<T, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, ? extends net.time4j.engine.k<T>> f94068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final net.time4j.engine.p<Integer> f94069b;

    n(net.time4j.engine.k<T> kVar, net.time4j.engine.p<Integer> pVar) {
        this.f94068a = Collections.singletonMap("calendrical", kVar);
        this.f94069b = pVar;
    }

    private net.time4j.engine.k<T> c(T t11) {
        return t11 instanceof net.time4j.engine.l ? this.f94068a.get(((net.time4j.engine.l) net.time4j.engine.l.class.cast(t11)).q()) : this.f94068a.get("calendrical");
    }

    private static Integer j(long j11) {
        long j12;
        long jF = net.time4j.base.c.f(z.MODIFIED_JULIAN_DATE.transform(j11, z.UTC), 678881L);
        long jB = net.time4j.base.c.b(jF, 146097);
        int iD = net.time4j.base.c.d(jF, 146097);
        if (iD == 146096) {
            j12 = (jB + 1) * 400;
        } else {
            int i11 = iD / 36524;
            int i12 = iD % 36524;
            int i13 = i12 / 1461;
            int i14 = i12 % 1461;
            if (i14 == 1460) {
                j12 = (jB * 400) + ((long) (i11 * 100)) + ((long) ((i13 + 1) * 4));
            } else {
                j12 = (jB * 400) + ((long) (i11 * 100)) + ((long) (i13 * 4)) + ((long) (i14 / 365));
                if (((((i14 % 365) + 31) * 5) / 153) + 2 > 12) {
                    j12++;
                }
            }
        }
        return Integer.valueOf(net.time4j.base.c.g(j12));
    }

    @Override // net.time4j.engine.y
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public net.time4j.engine.p<?> getChildAtCeiling(T t11) {
        return null;
    }

    @Override // net.time4j.engine.y
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public net.time4j.engine.p<?> getChildAtFloor(T t11) {
        return null;
    }

    @Override // net.time4j.engine.y
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Integer getMaximum(T t11) {
        net.time4j.engine.k<T> kVarC = c(t11);
        return j(kVarC.transform(((net.time4j.engine.q) kVarC.b(kVarC.a())).z(this.f94069b, 1)));
    }

    @Override // net.time4j.engine.y
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Integer getMinimum(T t11) {
        net.time4j.engine.k<T> kVarC = c(t11);
        return j(kVarC.transform(((net.time4j.engine.q) kVarC.b(kVarC.c())).z(this.f94069b, 1)));
    }

    @Override // net.time4j.engine.y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Integer getValue(T t11) {
        return j(c(t11).transform(t11.z(this.f94069b, 1)));
    }

    @Override // net.time4j.engine.y
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean isValid(T t11, Integer num) {
        return getValue(t11).equals(num);
    }

    @Override // net.time4j.engine.y
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public T withValue(T t11, Integer num, boolean z11) {
        if (isValid(t11, num)) {
            return t11;
        }
        throw new IllegalArgumentException("The related gregorian year is read-only.");
    }
}
