package io.sentry.cache;

import io.sentry.b7;
import io.sentry.q1;
import io.sentry.q7;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes9.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f80352a = Charset.forName("UTF-8");

    static void a(q7 q7Var, String str, String str2) {
        File fileB = b(q7Var, str);
        if (fileB == null) {
            q7Var.getLogger().c(b7.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(fileB, str2);
        q7Var.getLogger().c(b7.DEBUG, "Deleting %s from scope cache", str2);
        if (file.delete()) {
            return;
        }
        q7Var.getLogger().c(b7.INFO, "Failed to delete: %s", file.getAbsolutePath());
    }

    static File b(q7 q7Var, String str) {
        String cacheDirPath = q7Var.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    static <T, R> T c(q7 q7Var, String str, String str2, Class<T> cls, q1<R> q1Var) {
        File fileB = b(q7Var, str);
        if (fileB == null) {
            q7Var.getLogger().c(b7.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(fileB, str2);
        if (file.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f80352a));
                try {
                    T t11 = q1Var == null ? (T) q7Var.getSerializer().c(bufferedReader, cls) : (T) q7Var.getSerializer().d(bufferedReader, cls, q1Var);
                    bufferedReader.close();
                    return t11;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                q7Var.getLogger().b(b7.ERROR, th4, "Error reading entity from scope cache: %s", str2);
            }
        } else {
            q7Var.getLogger().c(b7.DEBUG, "No entry stored for %s", str2);
        }
        return null;
    }

    static <T> void d(q7 q7Var, T t11, String str, String str2) {
        File fileB = b(q7Var, str);
        if (fileB == null) {
            q7Var.getLogger().c(b7.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileB, str2));
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f80352a));
                try {
                    q7Var.getSerializer().a(t11, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            q7Var.getLogger().b(b7.ERROR, th6, "Error persisting entity: %s", str2);
        }
    }
}
