package net.time4j.calendar;

import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements Comparable<h>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final net.time4j.engine.c<Character> f94062a = net.time4j.format.a.e("LEAP_MONTH_INDICATOR", Character.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f94063b = net.time4j.format.a.e("LEAP_MONTH_IS_TRAILING", Boolean.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h[] f94064c;
    private static final long serialVersionUID = 7544059597266533279L;
    private final int index;
    private final boolean leap;

    static {
        h[] hVarArr = new h[24];
        for (int i11 = 0; i11 < 12; i11++) {
            hVarArr[i11] = new h(i11, false);
            hVarArr[i11 + 12] = new h(i11, true);
        }
        f94064c = hVarArr;
    }

    private h(int i11, boolean z11) {
        this.index = i11;
        this.leap = z11;
    }

    public static h d(int i11) {
        if (i11 >= 1 && i11 <= 12) {
            return f94064c[i11 - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i11);
    }

    private Object readResolve() throws StreamCorruptedException {
        try {
            return f94064c[this.index + (this.leap ? 12 : 0)];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new StreamCorruptedException();
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        int i11 = this.index;
        int i12 = hVar.index;
        if (i11 < i12) {
            return -1;
        }
        if (i11 > i12) {
            return 1;
        }
        if (this.leap) {
            return !hVar.leap ? 1 : 0;
        }
        return hVar.leap ? -1 : 0;
    }

    String b(Locale locale, net.time4j.format.j jVar, net.time4j.engine.d dVar) {
        StringBuilder sb2;
        Map<String, String> mapM = net.time4j.format.b.c("generic", locale).m();
        String strA = dp0.b.a(jVar, ((Character) dVar.b(net.time4j.format.a.f94182m, Character.valueOf(jVar.getDigits().charAt(0)))).charValue(), getNumber());
        if (!this.leap) {
            return strA;
        }
        boolean zBooleanValue = ((Boolean) dVar.b(f94063b, Boolean.valueOf("R".equals(mapM.get("leap-alignment"))))).booleanValue();
        char cCharValue = ((Character) dVar.b(f94062a, Character.valueOf(mapM.get("leap-indicator").charAt(0)))).charValue();
        if (zBooleanValue) {
            sb2 = new StringBuilder();
            sb2.append(strA);
            sb2.append(cCharValue);
        } else {
            sb2 = new StringBuilder();
            sb2.append(cCharValue);
            sb2.append(strA);
        }
        return sb2.toString();
    }

    public boolean c() {
        return this.leap;
    }

    public h e() {
        return f94064c[this.index + 12];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.index == hVar.index && this.leap == hVar.leap) {
                return true;
            }
        }
        return false;
    }

    public int getNumber() {
        return this.index + 1;
    }

    public int hashCode() {
        return this.index + (this.leap ? 12 : 0);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.index + 1);
        if (!this.leap) {
            return strValueOf;
        }
        return Marker.ANY_MARKER + strValueOf;
    }
}
