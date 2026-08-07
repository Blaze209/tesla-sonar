package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3026a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30256a;

    public C3026a1(String accountNumber) {
        p013kotlin.jvm.internal.s.k(accountNumber, "accountNumber");
        this.f30256a = accountNumber;
    }

    public final String a() {
        return this.f30256a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3026a1) && p013kotlin.jvm.internal.s.f(this.f30256a, ((C3026a1) obj).f30256a);
    }

    public int hashCode() {
        return this.f30256a.hashCode();
    }

    public String toString() {
        return "BavCaptureResult(accountNumber=" + this.f30256a + ")";
    }
}
