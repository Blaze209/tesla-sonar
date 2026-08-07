package com.fourthline.orca.internal;

import com.fourthline.core.Gender;
import java.util.Date;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Lp implements Jp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f26837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f26838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f26839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Gender f26840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f26841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f26842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f26843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Date f26844h;

    public Lp(String str, String str2, String str3, Gender gender, String str4, String str5, String str6, Date date) {
        this.f26837a = str;
        this.f26838b = str2;
        this.f26839c = str3;
        this.f26840d = gender;
        this.f26841e = str4;
        this.f26842f = str5;
        this.f26843g = str6;
        this.f26844h = date;
    }

    @Override // com.fourthline.orca.internal.Jp
    public String a() {
        return this.f26837a;
    }

    public void b(String str) {
        this.f26837a = str;
    }

    @Override // com.fourthline.orca.internal.Jp
    public String c() {
        return this.f26839c;
    }

    @Override // com.fourthline.orca.internal.Jp
    public Gender d() {
        return this.f26840d;
    }

    @Override // com.fourthline.orca.internal.Jp
    public boolean e() {
        return Jp.a.c(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lp)) {
            return false;
        }
        Lp lp2 = (Lp) obj;
        return p013kotlin.jvm.internal.s.f(this.f26837a, lp2.f26837a) && p013kotlin.jvm.internal.s.f(this.f26838b, lp2.f26838b) && p013kotlin.jvm.internal.s.f(this.f26839c, lp2.f26839c) && this.f26840d == lp2.f26840d && p013kotlin.jvm.internal.s.f(this.f26841e, lp2.f26841e) && p013kotlin.jvm.internal.s.f(this.f26842f, lp2.f26842f) && p013kotlin.jvm.internal.s.f(this.f26843g, lp2.f26843g) && p013kotlin.jvm.internal.s.f(this.f26844h, lp2.f26844h);
    }

    @Override // com.fourthline.orca.internal.Jp
    public boolean f() {
        return Jp.a.e(this);
    }

    @Override // com.fourthline.orca.internal.Jp
    public String g() {
        return this.f26842f;
    }

    @Override // com.fourthline.orca.internal.Jp
    public String h() {
        return this.f26841e;
    }

    public int hashCode() {
        String str = this.f26837a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26838b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26839c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Gender gender = this.f26840d;
        int iHashCode4 = (iHashCode3 + (gender == null ? 0 : gender.hashCode())) * 31;
        String str4 = this.f26841e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f26842f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f26843g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Date date = this.f26844h;
        return iHashCode7 + (date != null ? date.hashCode() : 0);
    }

    @Override // com.fourthline.orca.internal.Jp
    public boolean i() {
        return Jp.a.h(this);
    }

    @Override // com.fourthline.orca.internal.Jp
    public boolean j() {
        return Jp.a.d(this);
    }

    @Override // com.fourthline.orca.internal.Jp
    public String k() {
        return this.f26843g;
    }

    @Override // com.fourthline.orca.internal.Jp
    public boolean l() {
        return Jp.a.b(this);
    }

    @Override // com.fourthline.orca.internal.Jp
    public String m() {
        return this.f26838b;
    }

    public String toString() {
        return "PersonBundleData(firstName=" + this.f26837a + ", middleName=" + this.f26838b + ", lastName=" + this.f26839c + ", gender=" + this.f26840d + ", nationalityCode=" + this.f26841e + ", birthCountryCode=" + this.f26842f + ", birthPlace=" + this.f26843g + ", birthDate=" + this.f26844h + ")";
    }

    public void a(Gender gender) {
        this.f26840d = gender;
    }

    @Override // com.fourthline.orca.internal.Jp
    public Date b() {
        return this.f26844h;
    }

    public void c(String str) {
        this.f26839c = str;
    }

    public void d(String str) {
        this.f26841e = str;
    }

    public void a(String str) {
        this.f26843g = str;
    }

    public void a(Date date) {
        this.f26844h = date;
    }

    public /* synthetic */ Lp(String str, String str2, String str3, Gender gender, String str4, String str5, String str6, Date date, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : gender, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : date);
    }
}
