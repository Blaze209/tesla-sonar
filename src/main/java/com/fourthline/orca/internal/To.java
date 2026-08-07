package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class To {
    public static final long a(String str) {
        String strSubstring = str;
        p013kotlin.jvm.internal.s.k(strSubstring, "<this>");
        try {
            if (p013kotlin.text.t.b0(strSubstring, "#", false, 2, null)) {
                strSubstring = strSubstring.substring(1);
                p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
            }
            String strY0 = strSubstring;
            if (strY0.length() == 3) {
                strY0 = p013kotlin.collections.v.y0(p013kotlin.text.t.f1(strY0, new String[]{""}, false, 0, 6, null), "", null, null, 0, null, new wn0.l() { // from class: com.fourthline.orca.internal.hq0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return To.b((String) obj);
                    }
                }, 30, null);
            }
            if (strY0.length() == 6) {
                strY0 = strY0 + "FF";
            }
            String strSubstring2 = strY0.substring(0, 2);
            p013kotlin.jvm.internal.s.j(strSubstring2, "substring(...)");
            Integer numValueOf = Integer.valueOf(strSubstring2, 16);
            String strSubstring3 = strY0.substring(2, 4);
            p013kotlin.jvm.internal.s.j(strSubstring3, "substring(...)");
            Integer numValueOf2 = Integer.valueOf(strSubstring3, 16);
            String strSubstring4 = strY0.substring(4, 6);
            p013kotlin.jvm.internal.s.j(strSubstring4, "substring(...)");
            Integer numValueOf3 = Integer.valueOf(strSubstring4, 16);
            String strSubstring5 = strY0.substring(6, 8);
            p013kotlin.jvm.internal.s.j(strSubstring5, "substring(...)");
            Integer numValueOf4 = Integer.valueOf(strSubstring5, 16);
            p013kotlin.jvm.internal.s.h(numValueOf);
            int iIntValue = numValueOf.intValue();
            p013kotlin.jvm.internal.s.h(numValueOf2);
            int iIntValue2 = numValueOf2.intValue();
            p013kotlin.jvm.internal.s.h(numValueOf3);
            int iIntValue3 = numValueOf3.intValue();
            p013kotlin.jvm.internal.s.h(numValueOf4);
            return k3.r1.c(iIntValue, iIntValue2, iIntValue3, numValueOf4.intValue());
        } catch (Exception unused) {
            return k3.p1.INSTANCE.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence b(String it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return it + it;
    }
}
