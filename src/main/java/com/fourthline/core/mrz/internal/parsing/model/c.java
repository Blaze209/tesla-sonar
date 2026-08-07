package com.fourthline.core.mrz.internal.parsing.model;

import java.util.Date;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f24219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f24220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f24221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f24222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Date f24223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f24224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Date f24225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f24226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f24227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f24228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f24229n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f24230o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f24231p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f24232q;

    public /* synthetic */ c(String str, String str2, String str3, a aVar, List list, List list2, String str4, Date date, String str5, Date date2, String str6, String str7, boolean z11, String str8, String str9, String str10, String str11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, aVar, (i11 & 16) != 0 ? v.m() : list, (i11 & 32) != 0 ? v.m() : list2, str4, date, str5, date2, str6, (i11 & 2048) != 0 ? null : str7, (i11 & 4096) != 0 ? false : z11, (i11 & PKIFailureInfo.certRevoked) != 0 ? "" : str8, (i11 & 16384) != 0 ? "" : str9, (32768 & i11) != 0 ? "" : str10, (i11 & 65536) != 0 ? "" : str11);
    }

    public final c a(String documentCode, String issuingCountry, String nationality, a documentNumber, List firstNames, List lastNames, String birthDateString, Date date, String expirationDateString, Date date2, String gender, String str, boolean z11, String birthDateChecksum, String expirationDateChecksum, String totalChecksum, String totalChecksumContent) {
        s.k(documentCode, "documentCode");
        s.k(issuingCountry, "issuingCountry");
        s.k(nationality, "nationality");
        s.k(documentNumber, "documentNumber");
        s.k(firstNames, "firstNames");
        s.k(lastNames, "lastNames");
        s.k(birthDateString, "birthDateString");
        s.k(expirationDateString, "expirationDateString");
        s.k(gender, "gender");
        s.k(birthDateChecksum, "birthDateChecksum");
        s.k(expirationDateChecksum, "expirationDateChecksum");
        s.k(totalChecksum, "totalChecksum");
        s.k(totalChecksumContent, "totalChecksumContent");
        return new c(documentCode, issuingCountry, nationality, documentNumber, firstNames, lastNames, birthDateString, date, expirationDateString, date2, gender, str, z11, birthDateChecksum, expirationDateChecksum, totalChecksum, totalChecksumContent);
    }

    public final String b() {
        return this.f24229n;
    }

    public final String c() {
        return this.f24222g;
    }

    public final String d() {
        return this.f24216a;
    }

    public final a e() {
        return this.f24219d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.f(this.f24216a, cVar.f24216a) && s.f(this.f24217b, cVar.f24217b) && s.f(this.f24218c, cVar.f24218c) && s.f(this.f24219d, cVar.f24219d) && s.f(this.f24220e, cVar.f24220e) && s.f(this.f24221f, cVar.f24221f) && s.f(this.f24222g, cVar.f24222g) && s.f(this.f24223h, cVar.f24223h) && s.f(this.f24224i, cVar.f24224i) && s.f(this.f24225j, cVar.f24225j) && s.f(this.f24226k, cVar.f24226k) && s.f(this.f24227l, cVar.f24227l) && this.f24228m == cVar.f24228m && s.f(this.f24229n, cVar.f24229n) && s.f(this.f24230o, cVar.f24230o) && s.f(this.f24231p, cVar.f24231p) && s.f(this.f24232q, cVar.f24232q);
    }

    public final Date f() {
        return this.f24225j;
    }

    public final String g() {
        return this.f24230o;
    }

    public final String h() {
        return this.f24224i;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.f24216a.hashCode() * 31) + this.f24217b.hashCode()) * 31) + this.f24218c.hashCode()) * 31) + this.f24219d.hashCode()) * 31) + this.f24220e.hashCode()) * 31) + this.f24221f.hashCode()) * 31) + this.f24222g.hashCode()) * 31;
        Date date = this.f24223h;
        int iHashCode2 = (((iHashCode + (date == null ? 0 : date.hashCode())) * 31) + this.f24224i.hashCode()) * 31;
        Date date2 = this.f24225j;
        int iHashCode3 = (((iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31) + this.f24226k.hashCode()) * 31;
        String str = this.f24227l;
        return ((((((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f24228m)) * 31) + this.f24229n.hashCode()) * 31) + this.f24230o.hashCode()) * 31) + this.f24231p.hashCode()) * 31) + this.f24232q.hashCode();
    }

    public final List i() {
        return this.f24220e;
    }

    public final String j() {
        return this.f24226k;
    }

    public final String k() {
        return this.f24217b;
    }

    public final List l() {
        return this.f24221f;
    }

    public final String m() {
        return this.f24218c;
    }

    public final String n() {
        return this.f24227l;
    }

    public final String o() {
        return this.f24231p;
    }

    public final String p() {
        return this.f24232q;
    }

    public final boolean q() {
        return this.f24228m;
    }

    public String toString() {
        return "ParsedMrtdMrz(documentCode=" + this.f24216a + ", issuingCountry=" + this.f24217b + ", nationality=" + this.f24218c + ", documentNumber=" + this.f24219d + ", firstNames=" + this.f24220e + ", lastNames=" + this.f24221f + ", birthDateString=" + this.f24222g + ", birthDate=" + this.f24223h + ", expirationDateString=" + this.f24224i + ", expirationDate=" + this.f24225j + ", gender=" + this.f24226k + ", optionalData=" + this.f24227l + ", isNameTruncated=" + this.f24228m + ", birthDateChecksum=" + this.f24229n + ", expirationDateChecksum=" + this.f24230o + ", totalChecksum=" + this.f24231p + ", totalChecksumContent=" + this.f24232q + ")";
    }

    public static /* synthetic */ c a(c cVar, String str, String str2, String str3, a aVar, List list, List list2, String str4, Date date, String str5, Date date2, String str6, String str7, boolean z11, String str8, String str9, String str10, String str11, int i11, Object obj) {
        String str12;
        String str13;
        String str14 = (i11 & 1) != 0 ? cVar.f24216a : str;
        String str15 = (i11 & 2) != 0 ? cVar.f24217b : str2;
        String str16 = (i11 & 4) != 0 ? cVar.f24218c : str3;
        a aVar2 = (i11 & 8) != 0 ? cVar.f24219d : aVar;
        List list3 = (i11 & 16) != 0 ? cVar.f24220e : list;
        List list4 = (i11 & 32) != 0 ? cVar.f24221f : list2;
        String str17 = (i11 & 64) != 0 ? cVar.f24222g : str4;
        Date date3 = (i11 & 128) != 0 ? cVar.f24223h : date;
        String str18 = (i11 & 256) != 0 ? cVar.f24224i : str5;
        Date date4 = (i11 & 512) != 0 ? cVar.f24225j : date2;
        String str19 = (i11 & 1024) != 0 ? cVar.f24226k : str6;
        String str20 = (i11 & 2048) != 0 ? cVar.f24227l : str7;
        boolean z12 = (i11 & 4096) != 0 ? cVar.f24228m : z11;
        String str21 = (i11 & PKIFailureInfo.certRevoked) != 0 ? cVar.f24229n : str8;
        String str22 = str14;
        String str23 = (i11 & 16384) != 0 ? cVar.f24230o : str9;
        String str24 = (i11 & 32768) != 0 ? cVar.f24231p : str10;
        if ((i11 & 65536) != 0) {
            str13 = str24;
            str12 = cVar.f24232q;
        } else {
            str12 = str11;
            str13 = str24;
        }
        return cVar.a(str22, str15, str16, aVar2, list3, list4, str17, date3, str18, date4, str19, str20, z12, str21, str23, str13, str12);
    }

    public final Date a() {
        return this.f24223h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String documentCode, String issuingCountry, String nationality, a documentNumber, List firstNames, List lastNames, String birthDateString, Date date, String expirationDateString, Date date2, String gender, String str, boolean z11, String birthDateChecksum, String expirationDateChecksum, String totalChecksum, String totalChecksumContent) {
        super(null);
        s.k(documentCode, "documentCode");
        s.k(issuingCountry, "issuingCountry");
        s.k(nationality, "nationality");
        s.k(documentNumber, "documentNumber");
        s.k(firstNames, "firstNames");
        s.k(lastNames, "lastNames");
        s.k(birthDateString, "birthDateString");
        s.k(expirationDateString, "expirationDateString");
        s.k(gender, "gender");
        s.k(birthDateChecksum, "birthDateChecksum");
        s.k(expirationDateChecksum, "expirationDateChecksum");
        s.k(totalChecksum, "totalChecksum");
        s.k(totalChecksumContent, "totalChecksumContent");
        this.f24216a = documentCode;
        this.f24217b = issuingCountry;
        this.f24218c = nationality;
        this.f24219d = documentNumber;
        this.f24220e = firstNames;
        this.f24221f = lastNames;
        this.f24222g = birthDateString;
        this.f24223h = date;
        this.f24224i = expirationDateString;
        this.f24225j = date2;
        this.f24226k = gender;
        this.f24227l = str;
        this.f24228m = z11;
        this.f24229n = birthDateChecksum;
        this.f24230o = expirationDateChecksum;
        this.f24231p = totalChecksum;
        this.f24232q = totalChecksumContent;
    }
}
