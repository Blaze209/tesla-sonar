package io.sentry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
final class p3 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f80818c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f80819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z0 f80820b;

    p3(q7 q7Var, z0 z0Var) {
        this.f80819a = q7Var;
        this.f80820b = z0Var;
    }

    private Date a(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f80818c));
            try {
                String line = bufferedReader.readLine();
                this.f80819a.getLogger().c(b7.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateF = l.f(line);
                bufferedReader.close();
                return dateF;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e11) {
            this.f80819a.getLogger().a(b7.ERROR, "Error reading the crash marker file.", e11);
            return null;
        } catch (IllegalArgumentException e12) {
            this.f80819a.getLogger().b(b7.ERROR, e12, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String cacheDirPath = this.f80819a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f80819a.getLogger().c(b7.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        if (!this.f80819a.isEnableAutoSessionTracking()) {
            this.f80819a.getLogger().c(b7.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
            return;
        }
        io.sentry.cache.g envelopeDiskCache = this.f80819a.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.f) && !((io.sentry.cache.f) envelopeDiskCache).A()) {
            this.f80819a.getLogger().c(b7.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        File fileV = io.sentry.cache.f.v(cacheDirPath);
        e1 serializer = this.f80819a.getSerializer();
        if (fileV.exists()) {
            this.f80819a.getLogger().c(b7.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileV), f80818c));
                try {
                    f8 f8Var = (f8) serializer.c(bufferedReader, f8.class);
                    if (f8Var == null) {
                        this.f80819a.getLogger().c(b7.ERROR, "Stream from path %s resulted in a null envelope.", fileV.getAbsolutePath());
                    } else {
                        File file = new File(this.f80819a.getCacheDirPath(), ".sentry-native/last_crash");
                        Date date = null;
                        if (file.exists()) {
                            this.f80819a.getLogger().c(b7.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            Date dateA = a(file);
                            if (!file.delete()) {
                                this.f80819a.getLogger().c(b7.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                            }
                            f8Var.p(f8.b.Crashed, null, true);
                            date = dateA;
                        }
                        if (f8Var.f() == null) {
                            f8Var.d(date);
                        }
                        this.f80820b.u(p5.a(serializer, f8Var, this.f80819a.getSdkVersion()));
                    }
                    bufferedReader.close();
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                this.f80819a.getLogger().a(b7.ERROR, "Error processing previous session.", th4);
            }
            if (fileV.delete()) {
                return;
            }
            this.f80819a.getLogger().c(b7.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
