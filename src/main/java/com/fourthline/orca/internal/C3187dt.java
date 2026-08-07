package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.dt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3187dt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31238b;

    public C3187dt(String str, String str2) {
        this.f31237a = str;
        this.f31238b = str2;
    }

    public final String a() {
        return this.f31237a;
    }

    public final String b() {
        return this.f31238b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3187dt)) {
            return false;
        }
        C3187dt c3187dt = (C3187dt) obj;
        return p013kotlin.jvm.internal.s.f(this.f31237a, c3187dt.f31237a) && p013kotlin.jvm.internal.s.f(this.f31238b, c3187dt.f31238b);
    }

    public int hashCode() {
        String str = this.f31237a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f31238b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "QesActivePdfBundle(activePdfPath=" + this.f31237a + ", activePdfTitle=" + this.f31238b + ")";
    }

    public final void a(String str) {
        this.f31237a = str;
    }

    public final void b(String str) {
        this.f31238b = str;
    }

    public /* synthetic */ C3187dt(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
