package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalQuery;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class s implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Map.Entry f82136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Map.Entry f82137d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemporalQuery f82138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82139b;

    public m a(u uVar) {
        Set<String> set = j$.time.zone.i.f82276d;
        int size = set.size();
        Map.Entry simpleImmutableEntry = uVar.f82146b ? f82136c : f82137d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = uVar.f82146b ? f82136c : f82137d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        Integer numValueOf = Integer.valueOf(size);
                        m mVar = uVar.f82146b ? new m("", null, null) : new l("", null, null);
                        for (String str : set) {
                            mVar.a(str, str);
                        }
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(numValueOf, mVar);
                        if (uVar.f82146b) {
                            f82136c = simpleImmutableEntry;
                        } else {
                            f82137d = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (m) simpleImmutableEntry.getValue();
    }

    public s(TemporalQuery temporalQuery, String str) {
        this.f82138a = temporalQuery;
        this.f82139b = str;
    }

    @Override // j$.time.format.e
    public boolean s(w wVar, StringBuilder sb2) {
        ZoneId zoneId = (ZoneId) wVar.b(this.f82138a);
        if (zoneId == null) {
            return false;
        }
        sb2.append(zoneId.m());
        return true;
    }

    @Override // j$.time.format.e
    public final int w(u uVar, CharSequence charSequence, int i11) {
        int i12;
        int length = charSequence.length();
        if (i11 > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == length) {
            return ~i11;
        }
        char cCharAt = charSequence.charAt(i11);
        if (cCharAt == '+' || cCharAt == '-') {
            return b(uVar, charSequence, i11, i11, j.f82109e);
        }
        int i13 = i11 + 2;
        if (length >= i13) {
            char cCharAt2 = charSequence.charAt(i11 + 1);
            if (uVar.a(cCharAt, 'U') && uVar.a(cCharAt2, 'T')) {
                int i14 = i11 + 3;
                if (length >= i14 && uVar.a(charSequence.charAt(i13), 'C')) {
                    return b(uVar, charSequence, i11, i14, j.f82110f);
                }
                return b(uVar, charSequence, i11, i13, j.f82110f);
            }
            if (uVar.a(cCharAt, 'G') && length >= (i12 = i11 + 3) && uVar.a(cCharAt2, 'M') && uVar.a(charSequence.charAt(i13), 'T')) {
                int i15 = i11 + 4;
                if (length >= i15 && uVar.a(charSequence.charAt(i12), '0')) {
                    uVar.e(ZoneId.of("GMT0"));
                    return i15;
                }
                return b(uVar, charSequence, i11, i12, j.f82110f);
            }
        }
        m mVarA = a(uVar);
        ParsePosition parsePosition = new ParsePosition(i11);
        String strC = mVarA.c(charSequence, parsePosition);
        if (strC == null) {
            if (!uVar.a(cCharAt, 'Z')) {
                return ~i11;
            }
            uVar.e(ZoneOffset.UTC);
            return i11 + 1;
        }
        uVar.e(ZoneId.of(strC));
        return parsePosition.getIndex();
    }

    public static int b(u uVar, CharSequence charSequence, int i11, int i12, j jVar) {
        String upperCase = charSequence.subSequence(i11, i12).toString().toUpperCase();
        if (i12 >= charSequence.length()) {
            uVar.e(ZoneId.of(upperCase));
            return i12;
        }
        if (charSequence.charAt(i12) != '0' && !uVar.a(charSequence.charAt(i12), 'Z')) {
            u uVar2 = new u(uVar.f82145a);
            uVar2.f82146b = uVar.f82146b;
            uVar2.f82147c = uVar.f82147c;
            int iW = jVar.w(uVar2, charSequence, i12);
            try {
                if (iW < 0) {
                    if (jVar == j.f82109e) {
                        return ~i11;
                    }
                    uVar.e(ZoneId.of(upperCase));
                    return i12;
                }
                uVar.e(ZoneId.B(upperCase, ZoneOffset.ofTotalSeconds((int) uVar2.d(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
                return iW;
            } catch (DateTimeException unused) {
                return ~i11;
            }
        }
        uVar.e(ZoneId.of(upperCase));
        return i12;
    }

    public final String toString() {
        return this.f82139b;
    }
}
