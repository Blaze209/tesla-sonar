package com.fourthline.orca.internal;

import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3936vD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DocumentType f36054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DocumentFileSide f36055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f36056d;

    public C3936vD(String issuingCountry, DocumentType documentType, DocumentFileSide documentFileSide, Boolean bool) {
        p013kotlin.jvm.internal.s.k(issuingCountry, "issuingCountry");
        p013kotlin.jvm.internal.s.k(documentType, "documentType");
        this.f36053a = issuingCountry;
        this.f36054b = documentType;
        this.f36055c = documentFileSide;
        this.f36056d = bool;
    }

    public final Boolean a() {
        return this.f36056d;
    }

    public final DocumentFileSide b() {
        return this.f36055c;
    }

    public final DocumentType c() {
        return this.f36054b;
    }

    public final String d() {
        return this.f36053a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3936vD)) {
            return false;
        }
        C3936vD c3936vD = (C3936vD) obj;
        return p013kotlin.jvm.internal.s.f(this.f36053a, c3936vD.f36053a) && this.f36054b == c3936vD.f36054b && this.f36055c == c3936vD.f36055c && p013kotlin.jvm.internal.s.f(this.f36056d, c3936vD.f36056d);
    }

    public int hashCode() {
        int iHashCode = ((this.f36053a.hashCode() * 31) + this.f36054b.hashCode()) * 31;
        DocumentFileSide documentFileSide = this.f36055c;
        int iHashCode2 = (iHashCode + (documentFileSide == null ? 0 : documentFileSide.hashCode())) * 31;
        Boolean bool = this.f36056d;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "ValidationDocumentExpectations(issuingCountry=" + this.f36053a + ", documentType=" + this.f36054b + ", documentSide=" + this.f36055c + ", documentIsAngled=" + this.f36056d + ")";
    }
}
