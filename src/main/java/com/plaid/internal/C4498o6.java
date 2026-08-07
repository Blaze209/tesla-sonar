package com.plaid.internal;

/* JADX INFO: renamed from: com.plaid.internal.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4498o6 extends AbstractC4366c7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47992a;

    public C4498o6(String verificationId) {
        p013kotlin.jvm.internal.s.k(verificationId, "verificationId");
        this.f47992a = verificationId;
    }

    public final String a() {
        return this.f47992a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4498o6) && p013kotlin.jvm.internal.s.f(this.f47992a, ((C4498o6) obj).f47992a);
    }

    public final int hashCode() {
        return this.f47992a.hashCode();
    }

    public final String toString() {
        return "ProveSnaSessionInfo(verificationId=" + this.f47992a + ")";
    }
}
