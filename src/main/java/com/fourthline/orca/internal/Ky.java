package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes4.dex */
public final class Ky implements InterfaceC3463kC {
    private final boolean b(String str, String str2) {
        return p013kotlin.jvm.internal.s.f(String.valueOf("JABCDEFGHI".charAt(b(str) % 10)), str2);
    }

    private final boolean c(String str) {
        try {
            if (str.length() < 9) {
                return false;
            }
            String strValueOf = String.valueOf(p013kotlin.text.t.O1(str));
            p013kotlin.jvm.internal.s.i(strValueOf, "null cannot be cast to non-null type java.lang.String");
            Locale locale = Locale.ROOT;
            String upperCase = strValueOf.toUpperCase(locale);
            p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
            String strValueOf2 = String.valueOf(p013kotlin.text.t.Q1(str));
            p013kotlin.jvm.internal.s.i(strValueOf2, "null cannot be cast to non-null type java.lang.String");
            String upperCase2 = strValueOf2.toUpperCase(locale);
            p013kotlin.jvm.internal.s.j(upperCase2, "toUpperCase(...)");
            if (!p013kotlin.jvm.internal.s.f(upperCase, "X") && str.length() > 9) {
                return false;
            }
            if (p013kotlin.jvm.internal.s.f(upperCase, "X") && str.length() > 10) {
                return false;
            }
            String strSubstring = str.substring(1, str.length() - 1);
            p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
            if (Character.isDigit(p013kotlin.text.t.O1(str))) {
                return a(upperCase + strSubstring, upperCase2);
            }
            if (p013kotlin.jvm.internal.s.f(upperCase, "X")) {
                return a(WebrtcBuildVersion.maint_version + strSubstring, upperCase2);
            }
            if (p013kotlin.jvm.internal.s.f(upperCase, "Y")) {
                return a("1" + strSubstring, upperCase2);
            }
            if (p013kotlin.jvm.internal.s.f(upperCase, "Z")) {
                return a("2" + strSubstring, upperCase2);
            }
            if (new p013kotlin.text.q("[ABCDEFGHJUV]").i(upperCase)) {
                return c(strSubstring, upperCase2);
            }
            if (new p013kotlin.text.q("[NPQRSW]").i(upperCase)) {
                return b(strSubstring, upperCase2);
            }
            return false;
        } catch (Exception unused) {
        }
    }

    private final boolean d(String str) {
        int length = str.length();
        return 9 <= length && length < 11;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3463kC
    public EnumC3420jC a(String input) {
        p013kotlin.jvm.internal.s.k(input, "input");
        String strV = p013kotlin.text.t.V(input, "-", "", false, 4, null);
        if (d(strV)) {
            return !c(strV) ? EnumC3420jC.INVALID_FORMAT : EnumC3420jC.SUCCESS;
        }
        return EnumC3420jC.INVALID_LENGTH;
    }

    private final int b(String str) {
        List listP = p013kotlin.collections.v.p(new ArrayList(), new ArrayList());
        int i11 = 0;
        int i12 = 0;
        while (i11 < str.length()) {
            ((List) listP.get(a(i12))).add(Integer.valueOf(p013kotlin.text.a.f(str.charAt(i11))));
            i11++;
            i12++;
        }
        List list = (List) listP.get(0);
        Iterator it = ((List) listP.get(1)).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() + ((Number) it.next()).intValue());
            }
            int iIntValue = ((Number) next).intValue();
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String string = Integer.toString(((Number) it2.next()).intValue() * 2, p013kotlin.text.a.a(10));
                p013kotlin.jvm.internal.s.j(string, "toString(...)");
                arrayList.add(p013kotlin.text.t.L1(string, 1));
            }
            Iterator it3 = p013kotlin.collections.v.A(arrayList).iterator();
            int i13 = 0;
            while (it3.hasNext()) {
                i13 += Integer.parseInt((String) it3.next(), p013kotlin.text.a.a(10));
            }
            int i14 = (iIntValue + i13) % 10;
            if (i14 == 0) {
                return 0;
            }
            return 10 - i14;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    private final boolean a(String str, String str2) {
        return p013kotlin.jvm.internal.s.f(String.valueOf("TRWAGMYFPDXBNJZSQVHLCKE".charAt(Integer.parseInt(str, p013kotlin.text.a.a(10)) % 23)), str2);
    }

    private final int a(int i11) {
        return i11 % 2;
    }

    private final boolean c(String str, String str2) {
        return b(str) == Integer.parseInt(str2, p013kotlin.text.a.a(10));
    }
}
