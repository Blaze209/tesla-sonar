package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.cw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C3148cw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f31025b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31026a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.cw$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3148cw(String otp) {
        p013kotlin.jvm.internal.s.k(otp, "otp");
        this.f31026a = otp;
    }

    public final String a() {
        return this.f31026a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3148cw) && p013kotlin.jvm.internal.s.f(this.f31026a, ((C3148cw) obj).f31026a);
    }

    public int hashCode() {
        return this.f31026a.hashCode();
    }

    public String toString() {
        return "QesUserConfirmationRequest(otp=" + this.f31026a + ")";
    }
}
