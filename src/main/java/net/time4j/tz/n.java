package net.time4j.tz;

import j$.util.DesugarTimeZone;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
final class n implements o, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, n> f94811c = new HashMap();
    private static final long serialVersionUID = 1790434289322009750L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient b f94812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient g f94813b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94814a;

        static {
            int[] iArr = new int[b.values().length];
            f94814a = iArr;
            try {
                iArr[b.PUSH_FORWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94814a[b.NEXT_VALID_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94814a[b.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        for (b bVar : b.values()) {
            for (g gVar : g.values()) {
                f94811c.put(Integer.valueOf((bVar.ordinal() * 2) + gVar.ordinal()), new n(bVar, gVar));
            }
        }
    }

    private n(b bVar, g gVar) {
        this.f94812a = bVar;
        this.f94813b = gVar;
    }

    static n d(b bVar, g gVar) {
        return f94811c.get(Integer.valueOf((bVar.ordinal() * 2) + gVar.ordinal()));
    }

    private static void e(net.time4j.base.a aVar, net.time4j.base.g gVar, l lVar) {
        throw new IllegalArgumentException("Invalid local timestamp due to timezone transition: local-date=" + aVar + ", local-time=" + gVar + " [" + lVar.z().a() + "]");
    }

    private static long f(int i11, int i12, int i13, int i14, int i15, int i16) {
        return net.time4j.base.c.i(net.time4j.base.c.m(net.time4j.base.b.j(i11, i12, i13), 40587L), 86400L) + ((long) ((i14 * 3600) + (i15 * 60) + i16));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 13);
    }

    @Override // net.time4j.tz.o
    public long a(net.time4j.base.a aVar, net.time4j.base.g gVar, l lVar) {
        int i11;
        int i12;
        long jF;
        int iJ;
        long jF2;
        int i13;
        b bVar;
        int iB = aVar.b();
        int iR = aVar.r();
        int iF = aVar.f();
        int iC = gVar.c();
        int iE = gVar.e();
        int iD = gVar.d();
        m mVarY = lVar.y();
        if (mVarY == null && this.f94813b == g.LATER_OFFSET && ((bVar = this.f94812a) == b.PUSH_FORWARD || bVar == b.ABORT)) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone(lVar.z().a()));
            gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(iB, iR - 1, iF, iC, iE, iD);
            int i14 = gregorianCalendar.get(1);
            int i15 = gregorianCalendar.get(2) + 1;
            int i16 = gregorianCalendar.get(5);
            int i17 = gregorianCalendar.get(11);
            int i18 = gregorianCalendar.get(12);
            int i19 = gregorianCalendar.get(13);
            if (this.f94812a == b.ABORT && (iB != i14 || iR != i15 || iF != i16 || iC != i17 || iE != i18 || iD != i19)) {
                e(aVar, gVar, lVar);
            }
            jF = f(i14, i15, i16, i17, i18, i19);
            iJ = lVar.A(aVar, gVar).j();
        } else {
            if (mVarY == null) {
                throw new UnsupportedOperationException("Timezone provider does not expose its transition history.");
            }
            q qVarC = mVarY.c(aVar, gVar);
            if (qVarC != null) {
                if (qVarC.j()) {
                    int i21 = a.f94814a[this.f94812a.ordinal()];
                    if (i21 == 1) {
                        jF2 = f(iB, iR, iF, iC, iE, iD) + ((long) qVarC.g());
                        i13 = qVarC.i();
                    } else {
                        if (i21 == 2) {
                            return qVarC.e();
                        }
                        if (i21 != 3) {
                            throw new UnsupportedOperationException(this.f94812a.name());
                        }
                        e(aVar, gVar, lVar);
                    }
                } else {
                    i12 = iR;
                    if (qVarC.k()) {
                        jF2 = f(iB, i12, iF, i11, iE, iD);
                        i13 = qVarC.i();
                        if (this.f94813b == g.EARLIER_OFFSET) {
                            i11 = iC;
                            i13 = qVarC.f();
                        }
                    }
                    i11 = iC;
                    jF = f(iB, i12, iF, i11, iE, iD);
                    iJ = mVarY.e(aVar, gVar).get(0).j();
                }
                i11 = iC;
                return jF2 - ((long) i13);
            }
            i11 = iC;
            i12 = iR;
            i11 = iC;
            jF = f(iB, i12, iF, i11, iE, iD);
            iJ = mVarY.e(aVar, gVar).get(0).j();
        }
        return jF - ((long) iJ);
    }

    @Override // net.time4j.tz.o
    public o b(g gVar) {
        return gVar == this.f94813b ? this : this.f94812a.and(gVar);
    }

    int c() {
        return (this.f94812a.ordinal() * 2) + this.f94813b.ordinal();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(n.class.getName());
        sb2.append(":[gap=");
        sb2.append(this.f94812a);
        sb2.append(",overlap=");
        sb2.append(this.f94813b);
        sb2.append(']');
        return sb2.toString();
    }
}
