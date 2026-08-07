package com.plaid.internal;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: renamed from: com.plaid.internal.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4433h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47710b;

    public C4433h4(int i11, String str) {
        this.f47709a = i11;
        this.f47710b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4433h4)) {
            return false;
        }
        C4433h4 c4433h4 = (C4433h4) obj;
        return this.f47709a == c4433h4.f47709a && p013kotlin.jvm.internal.s.f(this.f47710b, c4433h4.f47710b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f47709a) * 31;
        String str = this.f47710b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NetworkRequestResult(status=" + this.f47709a + ", message=" + this.f47710b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
