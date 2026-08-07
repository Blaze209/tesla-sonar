package io.sentry.cache;

import io.sentry.a7;
import io.sentry.b7;
import io.sentry.e1;
import io.sentry.f8;
import io.sentry.p5;
import io.sentry.p6;
import io.sentry.q7;
import io.sentry.util.y;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
public abstract class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Charset f80347e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected q7 f80348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final io.sentry.util.r<e1> f80349b = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.cache.a
        @Override // io.sentry.util.r.a
        public final Object a() {
            return this.f80346a.f80348a.getSerializer();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final File f80350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f80351d;

    c(q7 q7Var, String str, int i11) {
        y.c(str, "Directory is required.");
        this.f80348a = (q7) y.c(q7Var, "SentryOptions is required.");
        this.f80350c = new File(str);
        this.f80351d = i11;
    }

    private p5 d(p5 p5Var, p6 p6Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<p6> it = p5Var.c().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add(p6Var);
        return new p5(p5Var.b(), arrayList);
    }

    private f8 e(p5 p5Var) {
        for (p6 p6Var : p5Var.c()) {
            if (g(p6Var)) {
                return l(p6Var);
            }
        }
        return null;
    }

    private boolean g(p6 p6Var) {
        if (p6Var == null) {
            return false;
        }
        return p6Var.K().b().equals(a7.Session);
    }

    private boolean h(p5 p5Var) {
        return p5Var.c().iterator().hasNext();
    }

    private boolean i(f8 f8Var) {
        return f8Var.l().equals(f8.b.Ok) && f8Var.j() != null;
    }

    private void j(File file, File[] fileArr) {
        Boolean boolG;
        p6 p6VarG;
        f8 f8VarL;
        p5 p5VarK = k(file);
        if (p5VarK == null || !h(p5VarK)) {
            return;
        }
        this.f80348a.getClientReportRecorder().d(io.sentry.clientreport.f.CACHE_OVERFLOW, p5VarK);
        f8 f8VarE = e(p5VarK);
        if (f8VarE == null || !i(f8VarE) || (boolG = f8VarE.g()) == null || !boolG.booleanValue()) {
            return;
        }
        for (File file2 : fileArr) {
            p5 p5VarK2 = k(file2);
            if (p5VarK2 != null && h(p5VarK2)) {
                Iterator<p6> it = p5VarK2.c().iterator();
                while (true) {
                    p6VarG = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    p6 next = it.next();
                    if (g(next) && (f8VarL = l(next)) != null && i(f8VarL)) {
                        Boolean boolG2 = f8VarL.g();
                        if (boolG2 != null && boolG2.booleanValue()) {
                            this.f80348a.getLogger().c(b7.ERROR, "Session %s has 2 times the init flag.", f8VarE.j());
                            return;
                        }
                        if (f8VarE.j() != null && f8VarE.j().equals(f8VarL.j())) {
                            f8VarL.n();
                            try {
                                p6VarG = p6.G(this.f80349b.a(), f8VarL);
                                it.remove();
                                break;
                            } catch (IOException e11) {
                                this.f80348a.getLogger().b(b7.ERROR, e11, "Failed to create new envelope item for the session %s", f8VarE.j());
                                break;
                            }
                        }
                    }
                }
                if (p6VarG != null) {
                    p5 p5VarD = d(p5VarK2, p6VarG);
                    long jLastModified = file2.lastModified();
                    if (!file2.delete()) {
                        this.f80348a.getLogger().c(b7.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
                    }
                    n(p5VarD, file2, jLastModified);
                    return;
                }
            }
        }
    }

    private p5 k(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                p5 p5VarE = this.f80349b.a().e(bufferedInputStream);
                bufferedInputStream.close();
                return p5VarE;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e11) {
            this.f80348a.getLogger().a(b7.ERROR, "Failed to deserialize the envelope.", e11);
            return null;
        }
    }

    private f8 l(p6 p6Var) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(p6Var.I()), f80347e));
            try {
                f8 f8Var = (f8) this.f80349b.a().c(bufferedReader, f8.class);
                bufferedReader.close();
                return f8Var;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            this.f80348a.getLogger().a(b7.ERROR, "Failed to deserialize the session.", th4);
            return null;
        }
    }

    private void n(p5 p5Var, File file, long j11) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.f80349b.a().b(p5Var, fileOutputStream);
                file.setLastModified(j11);
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
            this.f80348a.getLogger().a(b7.ERROR, "Failed to serialize the new envelope to the disk.", th4);
        }
    }

    private void o(File[] fileArr) {
        if (fileArr.length > 1) {
            Arrays.sort(fileArr, new Comparator() { // from class: io.sentry.cache.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
                }
            });
        }
    }

    protected boolean f() {
        if (this.f80350c.isDirectory() && this.f80350c.canWrite() && this.f80350c.canRead()) {
            return true;
        }
        this.f80348a.getLogger().c(b7.ERROR, "The directory for caching files is inaccessible.: %s", this.f80350c.getAbsolutePath());
        return false;
    }

    protected void m(File[] fileArr) {
        int length = fileArr.length;
        if (length >= this.f80351d) {
            this.f80348a.getLogger().c(b7.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i11 = (length - this.f80351d) + 1;
            o(fileArr);
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArr, i11, length);
            for (int i12 = 0; i12 < i11; i12++) {
                File file = fileArr[i12];
                j(file, fileArr2);
                if (!file.delete()) {
                    this.f80348a.getLogger().c(b7.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
            }
        }
    }
}
