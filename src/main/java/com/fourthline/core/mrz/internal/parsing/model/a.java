package com.fourthline.core.mrz.internal.parsing.model;

import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f24212d;

    public a(String rawDocumentNumber, String cleanedDocumentNumber, String documentNumberChecksum, int i11) {
        s.k(rawDocumentNumber, "rawDocumentNumber");
        s.k(cleanedDocumentNumber, "cleanedDocumentNumber");
        s.k(documentNumberChecksum, "documentNumberChecksum");
        this.f24209a = rawDocumentNumber;
        this.f24210b = cleanedDocumentNumber;
        this.f24211c = documentNumberChecksum;
        this.f24212d = i11;
    }

    public final String a() {
        return this.f24210b;
    }

    public final String b() {
        return this.f24211c;
    }

    public final int c() {
        return this.f24212d;
    }

    public final String d() {
        return this.f24209a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.f(this.f24209a, aVar.f24209a) && s.f(this.f24210b, aVar.f24210b) && s.f(this.f24211c, aVar.f24211c) && this.f24212d == aVar.f24212d;
    }

    public int hashCode() {
        return (((((this.f24209a.hashCode() * 31) + this.f24210b.hashCode()) * 31) + this.f24211c.hashCode()) * 31) + Integer.hashCode(this.f24212d);
    }

    public String toString() {
        return "ParsedDocumentNumber(rawDocumentNumber=" + this.f24209a + ", cleanedDocumentNumber=" + this.f24210b + ", documentNumberChecksum=" + this.f24211c + ", documentNumberChecksumIndex=" + this.f24212d + ")";
    }
}
