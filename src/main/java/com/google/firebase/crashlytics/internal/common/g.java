package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes5.dex */
class g implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f43969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final String f43970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final String f43971c;

    g(@NonNull String str, @NonNull String str2, byte[] bArr) {
        this.f43970b = str;
        this.f43971c = str2;
        this.f43969a = bArr;
    }

    private byte[] c() {
        if (d()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f43969a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th2) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean d() {
        byte[] bArr = this.f43969a;
        return bArr == null || bArr.length == 0;
    }

    @Override // com.google.firebase.crashlytics.internal.common.n0
    @NonNull
    public String a() {
        return this.f43971c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.n0
    public gv.f0.d.b b() {
        byte[] bArrC = c();
        if (bArrC == null) {
            return null;
        }
        return gv.f0.d.b.a().b(bArrC).c(this.f43970b).a();
    }

    @Override // com.google.firebase.crashlytics.internal.common.n0
    public InputStream f() {
        if (d()) {
            return null;
        }
        return new ByteArrayInputStream(this.f43969a);
    }
}
