package com.plaid.internal;

import java.util.Map;

/* JADX INFO: renamed from: com.plaid.internal.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4406e4 extends X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f47636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47637d;

    public C4406e4(Map data, String message) {
        p013kotlin.jvm.internal.s.k(message, "message");
        p013kotlin.jvm.internal.s.k(data, "data");
        this.f47635b = message;
        this.f47636c = data;
        this.f47637d = 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4406e4)) {
            return false;
        }
        C4406e4 c4406e4 = (C4406e4) obj;
        return p013kotlin.jvm.internal.s.f(this.f47635b, c4406e4.f47635b) && p013kotlin.jvm.internal.s.f(this.f47636c, c4406e4.f47636c);
    }

    public final int hashCode() {
        return this.f47636c.hashCode() + (this.f47635b.hashCode() * 31);
    }

    public final String toString() {
        return "NavigationBreadCrumb(message=" + this.f47635b + ", data=" + this.f47636c + ")";
    }
}
