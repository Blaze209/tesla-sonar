package io.sentry.android.core;

import android.content.Context;
import io.sentry.d8;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes9.dex */
final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f79746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f79747b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final io.sentry.util.a f79748c = new io.sentry.util.a();

    public static String a(Context context) {
        io.sentry.d1 d1VarA = f79748c.a();
        try {
            if (f79746a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    if (!file.exists()) {
                        String strC = c(file);
                        f79746a = strC;
                        if (d1VarA != null) {
                            d1VarA.close();
                        }
                        return strC;
                    }
                    f79746a = b(file);
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            }
            String str = f79746a;
            if (d1VarA != null) {
                d1VarA.close();
            }
            return str;
        } catch (Throwable th3) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    static String b(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, f79747b);
            randomAccessFile.close();
            return str;
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static String c(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            String strA = d8.a();
            fileOutputStream.write(strA.getBytes(f79747b));
            fileOutputStream.flush();
            fileOutputStream.close();
            return strA;
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
