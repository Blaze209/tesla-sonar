package com.fourthline.orca.internal;

import com.fourthline.core.DocumentFileSide;

/* JADX INFO: renamed from: com.fourthline.orca.internal.s4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C3798s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentFileSide f35199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f35200b;

    public C3798s4(DocumentFileSide documentFileSide, boolean z11) {
        p013kotlin.jvm.internal.s.k(documentFileSide, "documentFileSide");
        this.f35199a = documentFileSide;
        this.f35200b = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3798s4)) {
            return false;
        }
        C3798s4 c3798s4 = (C3798s4) obj;
        return this.f35199a == c3798s4.f35199a && this.f35200b == c3798s4.f35200b;
    }

    public int hashCode() {
        return (this.f35199a.hashCode() * 31) + Boolean.hashCode(this.f35200b);
    }

    public String toString() {
        return "CompleteFileSide(documentFileSide=" + this.f35199a + ", isAngled=" + this.f35200b + ")";
    }
}
