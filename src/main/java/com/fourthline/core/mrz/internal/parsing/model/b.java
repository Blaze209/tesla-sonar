package com.fourthline.core.mrz.internal.parsing.model;

import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24215c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String documentNumber, String totalChecksumContent, String totalChecksum) {
        super(null);
        s.k(documentNumber, "documentNumber");
        s.k(totalChecksumContent, "totalChecksumContent");
        s.k(totalChecksum, "totalChecksum");
        this.f24213a = documentNumber;
        this.f24214b = totalChecksumContent;
        this.f24215c = totalChecksum;
    }

    public final String a() {
        return this.f24213a;
    }

    public final String b() {
        return this.f24215c;
    }

    public final String c() {
        return this.f24214b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.f(this.f24213a, bVar.f24213a) && s.f(this.f24214b, bVar.f24214b) && s.f(this.f24215c, bVar.f24215c);
    }

    public int hashCode() {
        return (((this.f24213a.hashCode() * 31) + this.f24214b.hashCode()) * 31) + this.f24215c.hashCode();
    }

    public String toString() {
        return "ParsedIdlMrz(documentNumber=" + this.f24213a + ", totalChecksumContent=" + this.f24214b + ", totalChecksum=" + this.f24215c + ")";
    }
}
