package com.fourthline.orca.internal;

import java.util.Locale;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class F4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f25731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25732b;

    public F4(String str, String str2) {
        this.f25731a = str;
        this.f25732b = str2;
    }

    public final String a() {
        return this.f25731a;
    }

    public final void b(String str) {
        this.f25731a = str;
    }

    public final String c() {
        return this.f25732b;
    }

    public final boolean d() {
        String str = this.f25732b;
        if (str != null) {
            return a(str);
        }
        return false;
    }

    public final boolean e() {
        return b() && d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F4)) {
            return false;
        }
        F4 f11 = (F4) obj;
        return p013kotlin.jvm.internal.s.f(this.f25731a, f11.f25731a) && p013kotlin.jvm.internal.s.f(this.f25732b, f11.f25732b);
    }

    public int hashCode() {
        String str = this.f25731a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25732b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ContactBundle(email=" + this.f25731a + ", mobile=" + this.f25732b + ")";
    }

    private final boolean a(String str) {
        return !p013kotlin.text.t.y0(str) && new p013kotlin.text.q("^\\+?[0-9 ]*$").i(str);
    }

    public final boolean b() {
        String str = this.f25731a;
        if (str == null) {
            return false;
        }
        Locale ROOT = Locale.ROOT;
        p013kotlin.jvm.internal.s.j(ROOT, "ROOT");
        String lowerCase = str.toLowerCase(ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        return lowerCase != null && new p013kotlin.text.q("[_\\-a-zA-Z0-9.+]+@[a-zA-Z0-9](\\.?[\\-a-zA-Z0-9]*[a-zA-Z0-9])*").i(lowerCase) && lowerCase.length() <= 254;
    }

    public final void c(String str) {
        this.f25732b = str;
    }

    public /* synthetic */ F4(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
