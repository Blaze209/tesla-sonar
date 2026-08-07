package io.sentry.cache;

import io.sentry.ILogger;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.a7;
import io.sentry.b7;
import io.sentry.d1;
import io.sentry.d8;
import io.sentry.f8;
import io.sentry.h0;
import io.sentry.m5;
import io.sentry.p5;
import io.sentry.p6;
import io.sentry.q7;
import io.sentry.util.y;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class f extends c implements g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CountDownLatch f80353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<p5, String> f80354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final io.sentry.util.a f80355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final io.sentry.util.a f80356i;

    public f(q7 q7Var, String str, int i11) {
        super(q7Var, str, i11);
        this.f80354g = new WeakHashMap();
        this.f80355h = new io.sentry.util.a();
        this.f80356i = new io.sentry.util.a();
        this.f80353f = new CountDownLatch(1);
    }

    private void B() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f80348a.getCacheDirPath(), "last_crash"));
            try {
                fileOutputStream.write(io.sentry.l.h(io.sentry.l.d()).getBytes(c.f80347e));
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            this.f80348a.getLogger().a(b7.ERROR, "Error writing the crash marker file to the disk", th4);
        }
    }

    private boolean C(File file, p5 p5Var) {
        if (file.exists()) {
            this.f80348a.getLogger().c(b7.DEBUG, "Overwriting envelope to offline storage: %s", file.getAbsolutePath());
            if (!file.delete()) {
                this.f80348a.getLogger().c(b7.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.f80349b.a().b(p5Var, fileOutputStream);
                fileOutputStream.close();
                return true;
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            this.f80348a.getLogger().b(b7.ERROR, th4, "Error writing Envelope %s to offline storage", file.getAbsolutePath());
            return false;
        }
    }

    private void D(File file, f8 f8Var) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, c.f80347e));
                try {
                    this.f80348a.getLogger().c(b7.DEBUG, "Overwriting session to offline storage: %s", f8Var.j());
                    this.f80349b.a().a(f8Var, bufferedWriter);
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
            this.f80348a.getLogger().b(b7.ERROR, th6, "Error writing Session to offline storage: %s", f8Var.j());
        }
    }

    private File[] q() {
        File[] fileArrListFiles;
        return (!f() || (fileArrListFiles = this.f80350c.listFiles(new FilenameFilter() { // from class: io.sentry.cache.e
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return str.endsWith(".envelope");
            }
        })) == null) ? new File[0] : fileArrListFiles;
    }

    public static g r(q7 q7Var) {
        String cacheDirPath = q7Var.getCacheDirPath();
        int maxCacheItems = q7Var.getMaxCacheItems();
        if (cacheDirPath != null) {
            return new f(q7Var, cacheDirPath, maxCacheItems);
        }
        q7Var.getLogger().c(b7.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
        return io.sentry.transport.s.a();
    }

    public static File t(String str) {
        return new File(str, "session.json");
    }

    private File u(p5 p5Var) {
        String str;
        d1 d1VarA = this.f80355h.a();
        try {
            if (this.f80354g.containsKey(p5Var)) {
                str = this.f80354g.get(p5Var);
            } else {
                String str2 = d8.a() + ".envelope";
                this.f80354g.put(p5Var, str2);
                str = str2;
            }
            File file = new File(this.f80350c.getAbsolutePath(), str);
            if (d1VarA != null) {
                d1VarA.close();
            }
            return file;
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static File v(String str) {
        return new File(str, "previous_session.json");
    }

    private boolean x(p5 p5Var, h0 h0Var) {
        y.c(p5Var, "Envelope is required.");
        m(q());
        File fileT = t(this.f80350c.getAbsolutePath());
        File fileV = v(this.f80350c.getAbsolutePath());
        if (io.sentry.util.n.h(h0Var, io.sentry.hints.l.class) && !fileT.delete()) {
            this.f80348a.getLogger().c(b7.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        if (io.sentry.util.n.h(h0Var, io.sentry.hints.a.class)) {
            y(h0Var);
        }
        if (io.sentry.util.n.h(h0Var, io.sentry.hints.n.class)) {
            w(fileT, fileV);
            z(fileT, p5Var);
            boolean zExists = new File(this.f80348a.getCacheDirPath(), ".sentry-native/last_crash").exists();
            if (!zExists) {
                File file = new File(this.f80348a.getCacheDirPath(), "last_crash");
                if (file.exists()) {
                    this.f80348a.getLogger().c(b7.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file.delete()) {
                        this.f80348a.getLogger().c(b7.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                    }
                    zExists = true;
                }
            }
            m5.a().c(zExists);
            s();
        }
        File fileU = u(p5Var);
        if (fileU.exists()) {
            this.f80348a.getLogger().c(b7.WARNING, "Not adding Envelope to offline storage because it already exists: %s", fileU.getAbsolutePath());
            return true;
        }
        this.f80348a.getLogger().c(b7.DEBUG, "Adding Envelope to offline storage: %s", fileU.getAbsolutePath());
        boolean zC = C(fileU, p5Var);
        if (io.sentry.util.n.h(h0Var, UncaughtExceptionHandlerIntegration.a.class)) {
            B();
        }
        return zC;
    }

    private void y(h0 h0Var) {
        Date dateE;
        Object objG = io.sentry.util.n.g(h0Var);
        if (objG instanceof io.sentry.hints.a) {
            File fileV = v(this.f80350c.getAbsolutePath());
            if (!fileV.exists()) {
                this.f80348a.getLogger().c(b7.DEBUG, "No previous session file to end.", new Object[0]);
                return;
            }
            ILogger logger = this.f80348a.getLogger();
            b7 b7Var = b7.WARNING;
            logger.c(b7Var, "Previous session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileV), c.f80347e));
                try {
                    f8 f8Var = (f8) this.f80349b.a().c(bufferedReader, f8.class);
                    if (f8Var != null) {
                        io.sentry.hints.a aVar = (io.sentry.hints.a) objG;
                        Long lB = aVar.b();
                        if (lB != null) {
                            dateE = io.sentry.l.e(lB.longValue());
                            Date dateK = f8Var.k();
                            if (dateK == null || dateE.before(dateK)) {
                                this.f80348a.getLogger().c(b7Var, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                            }
                        } else {
                            dateE = null;
                        }
                        f8Var.q(f8.b.Abnormal, null, true, aVar.d());
                        f8Var.d(dateE);
                        D(fileV, f8Var);
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
                this.f80348a.getLogger().a(b7.ERROR, "Error processing previous session.", th4);
            }
        }
    }

    private void z(File file, p5 p5Var) {
        Iterable<p6> iterableC = p5Var.c();
        if (!iterableC.iterator().hasNext()) {
            this.f80348a.getLogger().c(b7.INFO, "Current envelope %s is empty", file.getAbsolutePath());
            return;
        }
        p6 next = iterableC.iterator().next();
        if (!a7.Session.equals(next.K().b())) {
            this.f80348a.getLogger().c(b7.INFO, "Current envelope has a different envelope type %s", next.K().b());
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(next.I()), c.f80347e));
            try {
                f8 f8Var = (f8) this.f80349b.a().c(bufferedReader, f8.class);
                if (f8Var == null) {
                    this.f80348a.getLogger().c(b7.ERROR, "Item of type %s returned null by the parser.", next.K().b());
                } else {
                    D(file, f8Var);
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
            this.f80348a.getLogger().a(b7.ERROR, "Item failed to process.", th4);
        }
    }

    public boolean A() {
        try {
            return this.f80353f.await(this.f80348a.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f80348a.getLogger().c(b7.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    @Override // io.sentry.cache.g
    public void M1(p5 p5Var) {
        y.c(p5Var, "Envelope is required.");
        File fileU = u(p5Var);
        if (fileU.delete()) {
            this.f80348a.getLogger().c(b7.DEBUG, "Discarding envelope from cache: %s", fileU.getAbsolutePath());
        } else {
            this.f80348a.getLogger().c(b7.DEBUG, "Envelope was not cached or could not be deleted: %s", fileU.getAbsolutePath());
        }
    }

    public void W2(p5 p5Var, h0 h0Var) {
        x(p5Var, h0Var);
    }

    public boolean f3(p5 p5Var, h0 h0Var) {
        return x(p5Var, h0Var);
    }

    @Override // java.lang.Iterable
    public Iterator<p5> iterator() {
        File[] fileArrQ = q();
        ArrayList arrayList = new ArrayList(fileArrQ.length);
        for (File file : fileArrQ) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(this.f80349b.a().e(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                this.f80348a.getLogger().c(b7.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e11) {
                this.f80348a.getLogger().a(b7.ERROR, String.format("Error while reading cached envelope from file %s", file.getAbsolutePath()), e11);
            }
        }
        return arrayList.iterator();
    }

    public void s() {
        this.f80353f.countDown();
    }

    public void w(File file, File file2) {
        d1 d1VarA = this.f80356i.a();
        try {
            if (file2.exists()) {
                this.f80348a.getLogger().c(b7.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);
                if (!file2.delete()) {
                    this.f80348a.getLogger().c(b7.WARNING, "Unable to delete previous session file: %s", file2);
                }
            }
            if (file.exists()) {
                this.f80348a.getLogger().c(b7.INFO, "Moving current session to previous session.", new Object[0]);
                try {
                    if (!file.renameTo(file2)) {
                        this.f80348a.getLogger().c(b7.WARNING, "Unable to move current session to previous session.", new Object[0]);
                    }
                } catch (Throwable th2) {
                    this.f80348a.getLogger().a(b7.ERROR, "Error moving current session to previous session.", th2);
                }
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
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
}
