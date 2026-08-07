package com.fourthline.orca.internal;

import java.util.Date;

/* JADX INFO: renamed from: com.fourthline.orca.internal.e8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3203e8 implements OD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Date f31352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Date f31353c;

    public C3203e8(String str, Date date, Date date2) {
        this.f31351a = str;
        this.f31352b = date;
        this.f31353c = date2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3203e8)) {
            return false;
        }
        C3203e8 c3203e8 = (C3203e8) obj;
        return p013kotlin.jvm.internal.s.f(this.f31351a, c3203e8.f31351a) && p013kotlin.jvm.internal.s.f(this.f31352b, c3203e8.f31352b) && p013kotlin.jvm.internal.s.f(this.f31353c, c3203e8.f31353c);
    }

    public int hashCode() {
        String str = this.f31351a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Date date = this.f31352b;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f31353c;
        return iHashCode2 + (date2 != null ? date2.hashCode() : 0);
    }

    public String toString() {
        return "Result(documentNumber=" + this.f31351a + ", expirationDate=" + this.f31352b + ", birthDate=" + this.f31353c + ")";
    }
}
