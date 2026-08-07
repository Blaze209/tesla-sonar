package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes5.dex */
class o0 {
    private static void a(InputStream inputStream, @NonNull File file) throws Throwable {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i11 = inputStream.read(bArr);
                    if (i11 <= 0) {
                        gZIPOutputStream2.finish();
                        i.g(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i11);
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    i.g(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    static void b(File file, List<n0> list) {
        for (n0 n0Var : list) {
            InputStream inputStreamF = null;
            try {
                inputStreamF = n0Var.f();
                if (inputStreamF != null) {
                    a(inputStreamF, new File(file, n0Var.a()));
                }
            } catch (IOException unused) {
            } finally {
                i.g(null);
            }
        }
    }
}
