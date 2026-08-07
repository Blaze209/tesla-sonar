package net.time4j.history;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements Comparable<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f94599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f94600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f94601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f94602d;

    h(j jVar, int i11, int i12, int i13) {
        this.f94599a = jVar;
        this.f94600b = i11;
        this.f94601c = i12;
        this.f94602d = i13;
    }

    public static h g(j jVar, int i11, int i12, int i13) {
        return h(jVar, i11, i12, i13, p.DUAL_DATING, o.f94610d);
    }

    public static h h(j jVar, int i11, int i12, int i13, p pVar, o oVar) {
        j jVar2;
        int i14;
        int i15;
        if (jVar == null) {
            throw new NullPointerException("Missing historic era.");
        }
        if (i13 < 1 || i13 > 31) {
            throw new IllegalArgumentException("Day of month out of range: " + i(jVar, i11, i12, i13));
        }
        if (i12 < 1 || i12 > 12) {
            throw new IllegalArgumentException("Month out of range: " + i(jVar, i11, i12, i13));
        }
        if (jVar == j.BYZANTINE) {
            if (i11 < 0 || (i11 == 0 && i12 < 9)) {
                throw new IllegalArgumentException("Before creation of the world: " + i(jVar, i11, i12, i13));
            }
        } else if (i11 < 1) {
            throw new IllegalArgumentException("Year of era must be positive: " + i(jVar, i11, i12, i13));
        }
        if (pVar.equals(p.DUAL_DATING)) {
            jVar2 = jVar;
            i14 = i12;
            i15 = i13;
        } else {
            jVar2 = jVar;
            i14 = i12;
            i15 = i13;
            i11 = oVar.f(jVar, i11).standardYear(pVar == p.AFTER_NEW_YEAR, oVar, jVar2, i11, i14, i15);
        }
        return new h(jVar2, i11, i14, i15);
    }

    private static String i(j jVar, int i11, int i12, int i13) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jVar);
        sb2.append(CoreConstants.DASH_CHAR);
        String strValueOf = String.valueOf(i11);
        for (int length = 4 - strValueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(strValueOf);
        sb2.append(CoreConstants.DASH_CHAR);
        if (i12 < 10) {
            sb2.append('0');
        }
        sb2.append(i12);
        sb2.append(CoreConstants.DASH_CHAR);
        if (i13 < 10) {
            sb2.append('0');
        }
        sb2.append(i13);
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        int iAnnoDomini = this.f94599a.annoDomini(this.f94600b);
        int iAnnoDomini2 = hVar.f94599a.annoDomini(hVar.f94600b);
        if (iAnnoDomini < iAnnoDomini2) {
            return -1;
        }
        if (iAnnoDomini > iAnnoDomini2) {
            return 1;
        }
        int iD = d() - hVar.d();
        if (iD == 0) {
            iD = b() - hVar.b();
        }
        if (iD < 0) {
            return -1;
        }
        return iD > 0 ? 1 : 0;
    }

    public int b() {
        return this.f94602d;
    }

    public j c() {
        return this.f94599a;
    }

    public int d() {
        return this.f94601c;
    }

    public int e() {
        return this.f94600b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f94599a == hVar.f94599a && this.f94600b == hVar.f94600b && this.f94601c == hVar.f94601c && this.f94602d == hVar.f94602d) {
                return true;
            }
        }
        return false;
    }

    public int f(o oVar) {
        return oVar.c(this);
    }

    public int hashCode() {
        int i11 = (this.f94600b * 1000) + (this.f94601c * 32) + this.f94602d;
        return this.f94599a == j.AD ? i11 : -i11;
    }

    public String toString() {
        return i(this.f94599a, this.f94600b, this.f94601c, this.f94602d);
    }
}
