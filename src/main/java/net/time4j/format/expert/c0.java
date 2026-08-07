package net.time4j.format.expert;

import java.io.IOException;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
enum c0 implements h<net.time4j.tz.k> {
    INSTANCE;

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<net.time4j.tz.k> getElement() {
        return b0.TIMEZONE_ID;
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.h
    public void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        char cCharAt;
        char cCharAt2;
        int length = charSequence.length();
        int iF = sVar.f();
        if (iF >= length) {
            sVar.k(iF, "Missing timezone name.");
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = iF;
        while (i11 < length && (((cCharAt2 = charSequence.charAt(i11)) >= 'a' && cCharAt2 <= 'z') || ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || cCharAt2 == '-' || cCharAt2 == '_' || cCharAt2 == '/'))) {
            sb2.append(cCharAt2);
            i11++;
        }
        if (!Character.isLetter(sb2.charAt(sb2.length() - 1))) {
            sb2.deleteCharAt(sb2.length() - 1);
            i11--;
        }
        String string = sb2.toString();
        if (string.isEmpty()) {
            sVar.k(iF, "Missing valid timezone id.");
            return;
        }
        if (string.startsWith("Etc/GMT")) {
            sVar.k(iF, "Inverse Etc/GMT-Offsets are not supported, use UTC-Offsets instead.");
            return;
        }
        if (string.equals("Z")) {
            tVar.F(b0.TIMEZONE_OFFSET, net.time4j.tz.p.f94822k);
            sVar.l(i11);
            return;
        }
        if (string.equals("UTC") || string.equals("GMT") || string.equals("UT")) {
            if (length <= i11 || !((cCharAt = charSequence.charAt(i11)) == '+' || cCharAt == '-')) {
                tVar.F(b0.TIMEZONE_OFFSET, net.time4j.tz.p.f94822k);
                sVar.l(i11);
                return;
            } else {
                sVar.l(i11);
                e0.f94295f.parse(charSequence, sVar, dVar, tVar, z11);
                return;
            }
        }
        List<net.time4j.tz.k> listU = net.time4j.tz.l.u("INCLUDE_ALIAS");
        int size = listU.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            net.time4j.tz.k kVar = listU.get(i13);
            int iCompareTo = kVar.a().compareTo(string);
            if (iCompareTo < 0) {
                i12 = i13 + 1;
            } else {
                if (iCompareTo <= 0) {
                    tVar.F(b0.TIMEZONE_ID, kVar);
                    sVar.l(i11);
                    return;
                }
                size = i13 - 1;
            }
        }
        sVar.k(iF, "Cannot parse to timezone id: " + string);
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) throws IOException {
        if (!oVar.j()) {
            throw new IllegalArgumentException("Cannot extract timezone id from: " + oVar);
        }
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        String strA = oVar.g().a();
        appendable.append(strA);
        int length2 = strA.length();
        if (length != -1 && length2 > 0 && set != null) {
            set.add(new g(b0.TIMEZONE_ID, length, length + length2));
        }
        return length2;
    }

    @Override // net.time4j.format.expert.h
    public h<net.time4j.tz.k> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        return INSTANCE;
    }

    @Override // net.time4j.format.expert.h
    public h<net.time4j.tz.k> withElement(net.time4j.engine.p<net.time4j.tz.k> pVar) {
        return INSTANCE;
    }
}
