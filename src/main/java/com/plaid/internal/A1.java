package com.plaid.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class A1 extends X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f46198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46199d;

    public A1(String message, Map<String, String> data, int i11) {
        p013kotlin.jvm.internal.s.k(message, "message");
        p013kotlin.jvm.internal.s.k(data, "data");
        this.f46197b = message;
        this.f46198c = data;
        this.f46199d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A1)) {
            return false;
        }
        A1 a11 = (A1) obj;
        return p013kotlin.jvm.internal.s.f(this.f46197b, a11.f46197b) && p013kotlin.jvm.internal.s.f(this.f46198c, a11.f46198c) && this.f46199d == a11.f46199d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f46199d) + ((this.f46198c.hashCode() + (this.f46197b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InformationBreadCrumb(message=" + this.f46197b + ", data=" + this.f46198c + ", logLevel=" + this.f46199d + ")";
    }
}
