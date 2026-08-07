package com.fourthline.core.mrz.internal.transformation;

import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    private static final boolean a(char c11) {
        if ('A' > c11 || c11 >= '[') {
            return '0' <= c11 && c11 < ':';
        }
        return true;
    }

    public static final String b(String str) {
        s.k(str, "<this>");
        return f(j(str));
    }

    public static final String c(String str) {
        s.k(str, "<this>");
        return f(i(str));
    }

    public static final boolean d(String str) {
        s.k(str, "<this>");
        return str.length() > 0 && s.f(String.valueOf(t.Q1(str)), "<");
    }

    public static final String e(String str) {
        s.k(str, "<this>");
        int length = str.length();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            if (a(str.charAt(i11))) {
                break;
            }
            i11++;
        }
        Integer numValueOf = Integer.valueOf(i11);
        if (i11 == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            String strSubstring = str.substring(numValueOf.intValue(), str.length());
            s.j(strSubstring, "substring(...)");
            if (strSubstring != null) {
                return strSubstring;
            }
        }
        int i12 = 0;
        while (true) {
            if (i12 >= str.length()) {
                z11 = true;
                break;
            }
            if (!a(str.charAt(i12))) {
                break;
            }
            i12++;
        }
        return (z11 ? null : Boolean.valueOf(z11)) != null ? "" : str;
    }

    public static final String f(String str) {
        s.k(str, "<this>");
        int length = str.length() - 1;
        if (length < 0) {
            length = -1;
            break;
        }
        while (true) {
            int i11 = length - 1;
            if (a(str.charAt(length))) {
                break;
            }
            if (i11 < 0) {
                length = -1;
                break;
            }
            length = i11;
        }
        Integer numValueOf = Integer.valueOf(length);
        if (length == -1) {
            numValueOf = null;
        }
        boolean z11 = false;
        if (numValueOf != null) {
            String strSubstring = str.substring(0, numValueOf.intValue() + 1);
            s.j(strSubstring, "substring(...)");
            if (strSubstring != null) {
                return strSubstring;
            }
        }
        int i12 = 0;
        while (true) {
            if (i12 >= str.length()) {
                z11 = true;
                break;
            }
            if (!a(str.charAt(i12))) {
                break;
            }
            i12++;
        }
        return (z11 ? null : Boolean.valueOf(z11)) != null ? "" : str;
    }

    public static final String g(String str) {
        s.k(str, "<this>");
        return t.U(t.U(t.U(t.U(t.U(t.U(str, 'b', '6', false, 4, null), '!', 'I', false, 4, null), '|', 'I', false, 4, null), 'i', 'I', false, 4, null), 'g', '9', false, 4, null), 'q', '9', false, 4, null);
    }

    public static final String h(String str) {
        s.k(str, "<this>");
        return t.U(str, 'O', '0', false, 4, null);
    }

    public static final String i(String str) {
        s.k(str, "<this>");
        return t.U(t.U(t.U(t.U(t.U(t.U(t.U(t.U(t.U(t.U(t.U(t.U(t.U(t.U(str, 'O', '0', false, 4, null), 'D', '0', false, 4, null), 'I', '1', false, 4, null), '!', '1', false, 4, null), '|', '1', false, 4, null), 'l', '1', false, 4, null), 'L', '1', false, 4, null), 'i', '1', false, 4, null), 'S', '5', false, 4, null), 'b', '6', false, 4, null), 'G', '6', false, 4, null), 'B', '8', false, 4, null), 'q', '9', false, 4, null), 'g', '9', false, 4, null);
    }

    public static final String j(String str) {
        s.k(str, "<this>");
        return t.U(t.U(t.U(t.U(t.U(t.U(t.U(str, '0', 'O', false, 4, null), '6', 'G', false, 4, null), '5', 'S', false, 4, null), '1', 'I', false, 4, null), '!', 'I', false, 4, null), '|', 'I', false, 4, null), '8', 'B', false, 4, null);
    }

    public static final String a(String str) {
        s.k(str, "<this>");
        return f(g(str));
    }
}
