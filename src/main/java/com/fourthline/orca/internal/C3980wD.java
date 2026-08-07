package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.wD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3980wD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f36389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f36390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f36391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f36392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f36393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f36394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f36395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f36396k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f36397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f36398m;

    public C3980wD(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.f36386a = str;
        this.f36387b = str2;
        this.f36388c = str3;
        this.f36389d = str4;
        this.f36390e = str5;
        this.f36391f = str6;
        this.f36392g = str7;
        this.f36393h = str8;
        this.f36394i = str9;
        this.f36395j = str10;
        this.f36396k = str11;
        this.f36397l = str12;
        this.f36398m = str13;
    }

    public final String a() {
        return this.f36394i;
    }

    public final String b() {
        return this.f36393h;
    }

    public final String c() {
        return this.f36390e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3980wD)) {
            return false;
        }
        C3980wD c3980wD = (C3980wD) obj;
        return p013kotlin.jvm.internal.s.f(this.f36386a, c3980wD.f36386a) && p013kotlin.jvm.internal.s.f(this.f36387b, c3980wD.f36387b) && p013kotlin.jvm.internal.s.f(this.f36388c, c3980wD.f36388c) && p013kotlin.jvm.internal.s.f(this.f36389d, c3980wD.f36389d) && p013kotlin.jvm.internal.s.f(this.f36390e, c3980wD.f36390e) && p013kotlin.jvm.internal.s.f(this.f36391f, c3980wD.f36391f) && p013kotlin.jvm.internal.s.f(this.f36392g, c3980wD.f36392g) && p013kotlin.jvm.internal.s.f(this.f36393h, c3980wD.f36393h) && p013kotlin.jvm.internal.s.f(this.f36394i, c3980wD.f36394i) && p013kotlin.jvm.internal.s.f(this.f36395j, c3980wD.f36395j) && p013kotlin.jvm.internal.s.f(this.f36396k, c3980wD.f36396k) && p013kotlin.jvm.internal.s.f(this.f36397l, c3980wD.f36397l) && p013kotlin.jvm.internal.s.f(this.f36398m, c3980wD.f36398m);
    }

    public int hashCode() {
        String str = this.f36386a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f36387b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f36388c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f36389d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f36390e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f36391f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f36392g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f36393h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f36394i;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f36395j;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f36396k;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f36397l;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f36398m;
        return iHashCode12 + (str13 != null ? str13.hashCode() : 0);
    }

    public String toString() {
        return "ValidationDocumentIdData(firstName=" + this.f36386a + ", lastName=" + this.f36387b + ", initials=" + this.f36388c + ", gender=" + this.f36389d + ", nationality=" + this.f36390e + ", issuingCountry=" + this.f36391f + ", issueDate=" + this.f36392g + ", expirationDate=" + this.f36393h + ", dateOfBirth=" + this.f36394i + ", birthPlace=" + this.f36395j + ", documentNumber=" + this.f36396k + ", documentType=" + this.f36397l + ", taxIdentificationNumber=" + this.f36398m + ")";
    }
}
