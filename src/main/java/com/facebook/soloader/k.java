package com.facebook.soloader;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends f0 {

    private final class a extends f0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b[] f23952a;

        /* JADX WARN: Bottom block not found for handler: all -> 0x0107 */
        /* JADX WARN: Code duplicated, block: B:6:0x004c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        a(com.facebook.soloader.f0 r20) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 316
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.k.a.<init>(com.facebook.soloader.k, com.facebook.soloader.f0):void");
        }

        @Override // com.facebook.soloader.f0.e
        public f0.c[] n() {
            return this.f23952a;
        }

        @Override // com.facebook.soloader.f0.e
        public void o(File file) throws IOException {
            byte[] bArr = new byte[32768];
            for (b bVar : this.f23952a) {
                FileInputStream fileInputStream = new FileInputStream(bVar.f23954c);
                try {
                    f0.d dVar = new f0.d(bVar, fileInputStream);
                    fileInputStream = null;
                    try {
                        c(dVar, bArr, file);
                        dVar.close();
                    } catch (Throwable th2) {
                        try {
                            dVar.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th4;
                }
            }
        }
    }

    private static final class b extends f0.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final File f23954c;

        b(String str, String str2, File file) {
            super(str, str2);
            this.f23954c = file;
        }
    }

    public k(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.soloader.f, com.facebook.soloader.d0
    public String c() {
        return "ExoSoSource";
    }

    @Override // com.facebook.soloader.f0
    protected f0.e q() {
        return new a(this);
    }
}
