package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class c extends l0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f43950c;

    c(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f43948a = str;
        this.f43949b = str2;
        this.f43950c = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.common.l0.a
    @NonNull
    public String c() {
        return this.f43948a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.l0.a
    public String d() {
        return this.f43950c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.l0.a
    public String e() {
        return this.f43949b;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l0.a) {
            l0.a aVar = (l0.a) obj;
            if (this.f43948a.equals(aVar.c()) && ((str = this.f43949b) != null ? str.equals(aVar.e()) : aVar.e() == null) && ((str2 = this.f43950c) != null ? str2.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f43948a.hashCode() ^ 1000003) * 1000003;
        String str = this.f43949b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f43950c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f43948a + ", firebaseInstallationId=" + this.f43949b + ", firebaseAuthenticationToken=" + this.f43950c + "}";
    }
}
