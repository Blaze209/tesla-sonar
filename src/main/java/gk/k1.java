package gk;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
@ro0.p
public final class k1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g1 f69081i = new g1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f69084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f69085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f69086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f69087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f69088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f69089h;

    public /* synthetic */ k1(int i11, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7) {
        if ((i11 & 1) == 0) {
            this.f69082a = null;
        } else {
            this.f69082a = str;
        }
        if ((i11 & 2) == 0) {
            this.f69083b = null;
        } else {
            this.f69083b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f69084c = null;
        } else {
            this.f69084c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f69085d = null;
        } else {
            this.f69085d = str4;
        }
        if ((i11 & 16) == 0) {
            this.f69086e = null;
        } else {
            this.f69086e = str5;
        }
        if ((i11 & 32) == 0) {
            this.f69087f = null;
        } else {
            this.f69087f = str6;
        }
        if ((i11 & 64) == 0) {
            this.f69088g = null;
        } else {
            this.f69088g = num;
        }
        if ((i11 & 128) == 0) {
            this.f69089h = null;
        } else {
            this.f69089h = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return p013kotlin.jvm.internal.s.f(this.f69082a, k1Var.f69082a) && p013kotlin.jvm.internal.s.f(this.f69083b, k1Var.f69083b) && p013kotlin.jvm.internal.s.f(this.f69084c, k1Var.f69084c) && p013kotlin.jvm.internal.s.f(this.f69085d, k1Var.f69085d) && p013kotlin.jvm.internal.s.f(this.f69086e, k1Var.f69086e) && p013kotlin.jvm.internal.s.f(this.f69087f, k1Var.f69087f) && p013kotlin.jvm.internal.s.f(this.f69088g, k1Var.f69088g) && p013kotlin.jvm.internal.s.f(this.f69089h, k1Var.f69089h);
    }

    public final int hashCode() {
        String str = this.f69082a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f69083b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f69084c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f69085d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f69086e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f69087f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.f69088g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.f69089h;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        return "LogErrorDto(name=" + this.f69082a + ", level=" + this.f69083b + ", file=" + this.f69084c + ", message=" + this.f69085d + ", function=" + this.f69086e + ", raw=" + this.f69087f + ", line=" + this.f69088g + ", code=" + this.f69089h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public k1(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7) {
        this.f69082a = str;
        this.f69083b = str2;
        this.f69084c = str3;
        this.f69085d = str4;
        this.f69086e = str5;
        this.f69087f = str6;
        this.f69088g = num;
        this.f69089h = str7;
    }

    public /* synthetic */ k1(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, int i11) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : num, (i11 & 128) != 0 ? null : str7);
    }
}
