package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4023xD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f36694d;

    public C4023xD(String str, String str2, String str3, String str4) {
        this.f36691a = str;
        this.f36692b = str2;
        this.f36693c = str3;
        this.f36694d = str4;
    }

    public final String a() {
        return this.f36694d;
    }

    public final String b() {
        return this.f36692b;
    }

    public final String c() {
        return this.f36691a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4023xD)) {
            return false;
        }
        C4023xD c4023xD = (C4023xD) obj;
        return p013kotlin.jvm.internal.s.f(this.f36691a, c4023xD.f36691a) && p013kotlin.jvm.internal.s.f(this.f36692b, c4023xD.f36692b) && p013kotlin.jvm.internal.s.f(this.f36693c, c4023xD.f36693c) && p013kotlin.jvm.internal.s.f(this.f36694d, c4023xD.f36694d);
    }

    public int hashCode() {
        String str = this.f36691a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f36692b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f36693c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f36694d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "ValidationDocumentRecognitionData(issuingCountry=" + this.f36691a + ", documentType=" + this.f36692b + ", documentModel=" + this.f36693c + ", documentSide=" + this.f36694d + ")";
    }

    public /* synthetic */ C4023xD(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
    }
}
