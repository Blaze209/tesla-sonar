package com.plaid.internal;

/* JADX INFO: renamed from: com.plaid.internal.p7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4508p7 extends AbstractC4366c7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48042b;

    public C4508p7(String verificationId, String redirectUri) {
        p013kotlin.jvm.internal.s.k(verificationId, "verificationId");
        p013kotlin.jvm.internal.s.k(redirectUri, "redirectUri");
        this.f48041a = verificationId;
        this.f48042b = redirectUri;
    }

    public final String a() {
        return this.f48042b;
    }

    public final String b() {
        return this.f48041a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4508p7)) {
            return false;
        }
        C4508p7 c4508p7 = (C4508p7) obj;
        return p013kotlin.jvm.internal.s.f(this.f48041a, c4508p7.f48041a) && p013kotlin.jvm.internal.s.f(this.f48042b, c4508p7.f48042b);
    }

    public final int hashCode() {
        return this.f48042b.hashCode() + (this.f48041a.hashCode() * 31);
    }

    public final String toString() {
        return "TwilioSnaSessionInfo(verificationId=" + this.f48041a + ", redirectUri=" + this.f48042b + ")";
    }
}
