package net.time4j.tz;

import ch.qos.logback.core.CoreConstants;
import j$.util.DesugarTimeZone;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
final class h extends l {
    private static final long serialVersionUID = -8432968264242113551L;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final k f94752id;
    private final boolean strict;

    /* JADX INFO: renamed from: tz, reason: collision with root package name */
    private final TimeZone f94753tz;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final transient p f94754v;

    h() {
        this.f94752id = null;
        this.f94753tz = null;
        this.strict = false;
        this.f94754v = null;
    }

    static TimeZone R(String str) {
        if (str.equals("Z")) {
            return DesugarTimeZone.getTimeZone("GMT+00:00");
        }
        if (str.startsWith("UTC")) {
            return DesugarTimeZone.getTimeZone("GMT" + str.substring(3));
        }
        if (!str.startsWith("UT")) {
            return DesugarTimeZone.getTimeZone(str);
        }
        return DesugarTimeZone.getTimeZone("GMT" + str.substring(2));
    }

    private static p S(int i11) {
        return p.p(net.time4j.base.c.a(i11, 1000));
    }

    private Object readResolve() {
        k kVar = this.f94752id;
        return kVar == null ? new h() : new h(kVar, this.f94753tz, this.strict);
    }

    @Override // net.time4j.tz.l
    public p A(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        int iG;
        int i11;
        int i12;
        p pVar = this.f94754v;
        if (pVar != null) {
            return pVar;
        }
        int iB = aVar.b();
        int iR = aVar.r();
        int iF = aVar.f();
        if (gVar.c() == 24) {
            long jL = net.time4j.base.b.l(net.time4j.base.c.f(net.time4j.base.b.k(aVar), 1L));
            int i13 = net.time4j.base.b.i(jL);
            int iH = net.time4j.base.b.h(jL);
            iG = net.time4j.base.b.g(jL);
            iR = iH;
            iB = i13;
        } else {
            iG = iF;
        }
        if (iB > 0) {
            i12 = iB;
            i11 = 1;
        } else {
            i11 = 0;
            i12 = 1 - iB;
        }
        int iC = net.time4j.base.b.c(iB, iR, iG) + 1;
        return S((this.f94752id == null ? TimeZone.getDefault() : this.f94753tz).getOffset(i11, i12, iR - 1, iG, iC == 8 ? 1 : iC, gVar.c() != 24 ? (((gVar.c() * 3600) + (gVar.e() * 60) + gVar.d()) * 1000) + (gVar.a() / 1000000) : 0));
    }

    @Override // net.time4j.tz.l
    public p B(net.time4j.base.f fVar) {
        TimeZone timeZone;
        if (this.f94752id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            p pVar = this.f94754v;
            if (pVar != null) {
                return pVar;
            }
            timeZone = this.f94753tz;
        }
        return S(timeZone.getOffset(fVar.l() * 1000));
    }

    @Override // net.time4j.tz.l
    public o E() {
        return this.strict ? l.f94762e : l.f94761d;
    }

    @Override // net.time4j.tz.l
    public boolean I(net.time4j.base.f fVar) {
        if (this.f94754v != null) {
            return false;
        }
        return (this.f94752id == null ? TimeZone.getDefault() : this.f94753tz).inDaylightTime(new Date(fVar.l() * 1000));
    }

    @Override // net.time4j.tz.l
    public boolean J() {
        return this.f94754v != null;
    }

    @Override // net.time4j.tz.l
    public boolean K(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        if (this.f94754v != null) {
            return false;
        }
        int iB = aVar.b();
        int iR = aVar.r();
        int iF = aVar.f();
        int iC = gVar.c();
        int iE = gVar.e();
        int iD = gVar.d();
        int iA = gVar.a() / 1000000;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(this.f94752id == null ? TimeZone.getDefault() : this.f94753tz);
        gregorianCalendar.set(14, iA);
        gregorianCalendar.set(iB, iR - 1, iF, iC, iE, iD);
        return (gregorianCalendar.get(1) == iB && gregorianCalendar.get(2) + 1 == iR && gregorianCalendar.get(5) == iF && gregorianCalendar.get(11) == iC && gregorianCalendar.get(12) == iE && gregorianCalendar.get(13) == iD && gregorianCalendar.get(14) == iA) ? false : true;
    }

    @Override // net.time4j.tz.l
    public l Q(o oVar) {
        if (this.f94752id == null || E() == oVar) {
            return this;
        }
        if (oVar == l.f94761d) {
            return new h(this.f94752id, this.f94753tz, false);
        }
        if (oVar == l.f94762e) {
            return new h(this.f94752id, this.f94753tz, true);
        }
        throw new UnsupportedOperationException(oVar.toString());
    }

    boolean T() {
        return (this.f94752id == null ? TimeZone.getDefault() : this.f94753tz).getID().equals("GMT");
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f94752id == null) {
                return hVar.f94752id == null;
            }
            if (this.f94753tz.equals(hVar.f94753tz) && this.strict == hVar.strict) {
                p pVar = this.f94754v;
                if (pVar == null) {
                    return hVar.f94754v == null;
                }
                return pVar.equals(hVar.f94754v);
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f94752id == null) {
            return 0;
        }
        return this.f94753tz.hashCode();
    }

    public String toString() {
        TimeZone timeZone = this.f94752id == null ? TimeZone.getDefault() : this.f94753tz;
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append('[');
        sb2.append(h.class.getName());
        sb2.append(CoreConstants.COLON_CHAR);
        sb2.append(timeZone);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.tz.l
    public String w(d dVar, Locale locale) {
        return (this.f94752id == null ? TimeZone.getDefault() : this.f94753tz).getDisplayName(dVar.isDaylightSaving(), !dVar.isAbbreviation() ? 1 : 0, locale);
    }

    @Override // net.time4j.tz.l
    public m y() {
        p pVar = this.f94754v;
        if (pVar == null) {
            return null;
        }
        return pVar.k();
    }

    @Override // net.time4j.tz.l
    public k z() {
        k kVar = this.f94752id;
        return kVar == null ? new e(TimeZone.getDefault().getID()) : kVar;
    }

    h(k kVar) {
        this(kVar, TimeZone.getDefault(), false);
    }

    h(k kVar, String str) {
        this(kVar, R(str), false);
    }

    private h(k kVar, TimeZone timeZone, boolean z11) {
        this.f94752id = kVar;
        TimeZone timeZone2 = (TimeZone) timeZone.clone();
        this.f94753tz = timeZone2;
        this.strict = z11;
        if (timeZone2.useDaylightTime()) {
            this.f94754v = null;
            return;
        }
        String id2 = timeZone2.getID();
        if (!id2.startsWith("GMT") && !id2.startsWith("Etc/") && !id2.equals("Greenwich") && !id2.equals("UCT") && !id2.equals("UTC") && !id2.equals("Universal") && !id2.equals("Zulu")) {
            this.f94754v = null;
        } else {
            this.f94754v = S(timeZone2.getOffset(System.currentTimeMillis()));
        }
    }
}
