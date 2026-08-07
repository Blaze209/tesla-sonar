package com.google.android.gms.identitycredentials;

import androidx.annotation.NonNull;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/google/android/gms/identitycredentials/CallingAppInfo;", "", "packageName", "", "packageCertificates", "", "", "origin", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getPackageName", "()Ljava/lang/String;", "getPackageCertificates", "()Ljava/util/List;", "getOrigin", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CallingAppInfo {
    private final String origin;
    private final List<byte[]> packageCertificates;
    private final String packageName;

    public CallingAppInfo(@NonNull String packageName, @NonNull List<byte[]> packageCertificates, String str) {
        s.k(packageName, "packageName");
        s.k(packageCertificates, "packageCertificates");
        this.packageName = packageName;
        this.packageCertificates = packageCertificates;
        this.origin = str;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final List<byte[]> getPackageCertificates() {
        return this.packageCertificates;
    }

    public final String getPackageName() {
        return this.packageName;
    }
}
