package com.fourthline.orca.internal;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class SA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f27736a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f27738c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f27737b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Xn f27739d = new Xn();

    public SA(String str) {
        String strTrim = str.trim();
        this.f27736a = strTrim;
        this.f27738c = strTrim.length();
    }

    boolean a(int i11) {
        return i11 == 10 || i11 == 13;
    }

    boolean b(int i11) {
        return i11 == 32 || i11 == 10 || i11 == 13 || i11 == 9;
    }

    public boolean c() {
        return this.f27737b == this.f27738c;
    }

    boolean d() {
        int i11 = this.f27737b;
        if (i11 == this.f27738c) {
            return false;
        }
        char cCharAt = this.f27736a.charAt(i11);
        if (cCharAt < 'a' || cCharAt > 'z') {
            return cCharAt >= 'A' && cCharAt <= 'Z';
        }
        return true;
    }

    Integer e() {
        int i11 = this.f27737b;
        if (i11 == this.f27738c) {
            return null;
        }
        String str = this.f27736a;
        this.f27737b = i11 + 1;
        return Integer.valueOf(str.charAt(i11));
    }

    Boolean f() {
        int i11 = this.f27737b;
        if (i11 == this.f27738c) {
            return null;
        }
        char cCharAt = this.f27736a.charAt(i11);
        if (cCharAt != '0' && cCharAt != '1') {
            return null;
        }
        this.f27737b++;
        return Boolean.valueOf(cCharAt == '1');
    }

    public float g() {
        float fA = this.f27739d.a(this.f27736a, this.f27737b, this.f27738c);
        if (!Float.isNaN(fA)) {
            this.f27737b = this.f27739d.a();
        }
        return fA;
    }

    String h() {
        if (c()) {
            return null;
        }
        int i11 = this.f27737b;
        int iCharAt = this.f27736a.charAt(i11);
        while (true) {
            if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                break;
            }
            iCharAt = a();
        }
        int i12 = this.f27737b;
        while (b(iCharAt)) {
            iCharAt = a();
        }
        if (iCharAt == 40) {
            this.f27737b++;
            return this.f27736a.substring(i11, i12);
        }
        this.f27737b = i11;
        return null;
    }

    Vw.C2994q i() {
        float fG = g();
        if (Float.isNaN(fG)) {
            return null;
        }
        Vw.d0 d0VarL = l();
        return d0VarL == null ? new Vw.C2994q(fG, Vw.d0.px) : new Vw.C2994q(fG, d0VarL);
    }

    public String j() {
        if (c()) {
            return null;
        }
        int i11 = this.f27737b;
        char cCharAt = this.f27736a.charAt(i11);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        int iA = a();
        while (iA != -1 && iA != cCharAt) {
            iA = a();
        }
        if (iA == -1) {
            this.f27737b = i11;
            return null;
        }
        int i12 = this.f27737b;
        this.f27737b = i12 + 1;
        return this.f27736a.substring(i11 + 1, i12);
    }

    public String k() {
        return a(' ', false);
    }

    Vw.d0 l() {
        if (c()) {
            return null;
        }
        if (this.f27736a.charAt(this.f27737b) == '%') {
            this.f27737b++;
            return Vw.d0.percent;
        }
        int i11 = this.f27737b;
        if (i11 > this.f27738c - 2) {
            return null;
        }
        try {
            Vw.d0 d0VarValueOf = Vw.d0.valueOf(this.f27736a.substring(i11, i11 + 2).toLowerCase(Locale.US));
            this.f27737b += 2;
            return d0VarValueOf;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String m() {
        if (c()) {
            return null;
        }
        int i11 = this.f27737b;
        char cCharAt = this.f27736a.charAt(i11);
        if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
            this.f27737b = i11;
            return null;
        }
        int iA = a();
        while (true) {
            if ((iA < 65 || iA > 90) && (iA < 97 || iA > 122)) {
                break;
            }
            iA = a();
        }
        return this.f27736a.substring(i11, this.f27737b);
    }

    float n() {
        p();
        float fA = this.f27739d.a(this.f27736a, this.f27737b, this.f27738c);
        if (!Float.isNaN(fA)) {
            this.f27737b = this.f27739d.a();
        }
        return fA;
    }

    String o() {
        if (c()) {
            return null;
        }
        int i11 = this.f27737b;
        this.f27737b = this.f27738c;
        return this.f27736a.substring(i11);
    }

    public boolean p() {
        q();
        int i11 = this.f27737b;
        if (i11 == this.f27738c || this.f27736a.charAt(i11) != ',') {
            return false;
        }
        this.f27737b++;
        q();
        return true;
    }

    public void q() {
        while (true) {
            int i11 = this.f27737b;
            if (i11 >= this.f27738c || !b((int) this.f27736a.charAt(i11))) {
                return;
            } else {
                this.f27737b++;
            }
        }
    }

    float a(float f11) {
        if (Float.isNaN(f11)) {
            return Float.NaN;
        }
        p();
        return g();
    }

    public String b(char c11) {
        return a(c11, false);
    }

    String c(char c11) {
        return a(c11, true);
    }

    String b() {
        int i11 = this.f27737b;
        while (!c() && !b((int) this.f27736a.charAt(this.f27737b))) {
            this.f27737b++;
        }
        String strSubstring = this.f27736a.substring(i11, this.f27737b);
        this.f27737b = i11;
        return strSubstring;
    }

    float a(Boolean bool) {
        if (bool == null) {
            return Float.NaN;
        }
        p();
        return g();
    }

    Integer a(boolean z11) {
        Yh yhA = Yh.a(this.f27736a, this.f27737b, this.f27738c, z11);
        if (yhA == null) {
            return null;
        }
        this.f27737b = yhA.a();
        return Integer.valueOf(yhA.b());
    }

    Boolean a(Object obj) {
        if (obj == null) {
            return null;
        }
        p();
        return f();
    }

    public boolean a(char c11) {
        int i11 = this.f27737b;
        boolean z11 = i11 < this.f27738c && this.f27736a.charAt(i11) == c11;
        if (z11) {
            this.f27737b++;
        }
        return z11;
    }

    public boolean a(String str) {
        int length = str.length();
        int i11 = this.f27737b;
        boolean z11 = i11 <= this.f27738c - length && this.f27736a.substring(i11, i11 + length).equals(str);
        if (z11) {
            this.f27737b += length;
        }
        return z11;
    }

    int a() {
        int i11 = this.f27737b;
        int i12 = this.f27738c;
        if (i11 == i12) {
            return -1;
        }
        int i13 = i11 + 1;
        this.f27737b = i13;
        if (i13 < i12) {
            return this.f27736a.charAt(i13);
        }
        return -1;
    }

    String a(char c11, boolean z11) {
        if (c()) {
            return null;
        }
        char cCharAt = this.f27736a.charAt(this.f27737b);
        if ((!z11 && b((int) cCharAt)) || cCharAt == c11) {
            return null;
        }
        int i11 = this.f27737b;
        int iA = a();
        while (iA != -1 && iA != c11 && (z11 || !b(iA))) {
            iA = a();
        }
        return this.f27736a.substring(i11, this.f27737b);
    }
}
