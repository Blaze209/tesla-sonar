package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes5.dex */
class i0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final File f43985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final String f43986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final String f43987c;

    i0(@NonNull String str, @NonNull String str2, @NonNull File file) {
        this.f43986b = str;
        this.f43987c = str2;
        this.f43985a = file;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private byte[] c() {
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        try {
            InputStream inputStreamF = f();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (inputStreamF == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (inputStreamF != null) {
                            inputStreamF.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int i11 = inputStreamF.read(bArr);
                            if (i11 <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                inputStreamF.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, i11);
                        } catch (Throwable th2) {
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    byteArrayOutputStream.close();
                    throw th5;
                }
            } catch (Throwable th6) {
                if (inputStreamF != null) {
                    try {
                        inputStreamF.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
            if (inputStreamF != null) {
                inputStreamF.close();
            }
            throw th6;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.common.n0
    @NonNull
    public String a() {
        return this.f43987c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.n0
    public gv.f0.d.b b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return gv.f0.d.b.a().b(bArrC).c(this.f43986b).a();
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.n0
    public InputStream f() {
        if (this.f43985a.exists() && this.f43985a.isFile()) {
            try {
                return new FileInputStream(this.f43985a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
