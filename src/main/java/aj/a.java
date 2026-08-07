package aj;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import ch.qos.logback.core.CoreConstants;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f1136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f1137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f1138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f1139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f1140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f1141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f1142g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Writer f1144i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1146k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f1143h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final LinkedHashMap<String, d> f1145j = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f1147l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ThreadPoolExecutor f1148m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Callable<Void> f1149n = new CallableC0044a();

    /* JADX INFO: renamed from: aj.a$a, reason: collision with other inner class name */
    class CallableC0044a implements Callable<Void> {
        CallableC0044a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (a.this) {
                try {
                    if (a.this.f1144i == null) {
                        return null;
                    }
                    a.this.H0();
                    if (a.this.s0()) {
                        a.this.z0();
                        a.this.f1146k = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static final class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ b(CallableC0044a callableC0044a) {
            this();
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f1151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f1152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f1153c;

        /* synthetic */ c(a aVar, d dVar, CallableC0044a callableC0044a) {
            this(dVar);
        }

        public void a() {
            a.this.T(this, false);
        }

        public void b() {
            if (this.f1153c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            a.this.T(this, true);
            this.f1153c = true;
        }

        public File f(int i11) {
            File fileK;
            synchronized (a.this) {
                try {
                    if (this.f1151a.f1160f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f1151a.f1159e) {
                        this.f1152b[i11] = true;
                    }
                    fileK = this.f1151a.k(i11);
                    a.this.f1136a.mkdirs();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fileK;
        }

        private c(d dVar) {
            this.f1151a = dVar;
            this.f1152b = dVar.f1159e ? null : new boolean[a.this.f1142g];
        }
    }

    private final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f1156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        File[] f1157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        File[] f1158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f1159e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c f1160f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f1161g;

        /* synthetic */ d(a aVar, String str, CallableC0044a callableC0044a) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != a.this.f1142g) {
                throw m(strArr);
            }
            for (int i11 = 0; i11 < strArr.length; i11++) {
                try {
                    this.f1156b[i11] = Long.parseLong(strArr[i11]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i11) {
            return this.f1157c[i11];
        }

        public File k(int i11) {
            return this.f1158d[i11];
        }

        public String l() {
            StringBuilder sb2 = new StringBuilder();
            for (long j11 : this.f1156b) {
                sb2.append(' ');
                sb2.append(j11);
            }
            return sb2.toString();
        }

        private d(String str) {
            this.f1155a = str;
            this.f1156b = new long[a.this.f1142g];
            this.f1157c = new File[a.this.f1142g];
            this.f1158d = new File[a.this.f1142g];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(CoreConstants.DOT);
            int length = sb2.length();
            for (int i11 = 0; i11 < a.this.f1142g; i11++) {
                sb2.append(i11);
                this.f1157c[i11] = new File(a.this.f1136a, sb2.toString());
                sb2.append(".tmp");
                this.f1158d[i11] = new File(a.this.f1136a, sb2.toString());
                sb2.setLength(length);
            }
        }
    }

    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f1164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long[] f1165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final File[] f1166d;

        /* synthetic */ e(a aVar, String str, long j11, File[] fileArr, long[] jArr, CallableC0044a callableC0044a) {
            this(str, j11, fileArr, jArr);
        }

        public File a(int i11) {
            return this.f1166d[i11];
        }

        private e(String str, long j11, File[] fileArr, long[] jArr) {
            this.f1163a = str;
            this.f1164b = j11;
            this.f1166d = fileArr;
            this.f1165c = jArr;
        }
    }

    private a(File file, int i11, int i12, long j11) {
        this.f1136a = file;
        this.f1140e = i11;
        this.f1137b = new File(file, "journal");
        this.f1138c = new File(file, "journal.tmp");
        this.f1139d = new File(file, "journal.bkp");
        this.f1142g = i12;
        this.f1141f = j11;
    }

    private static void G0(File file, File file2, boolean z11) throws IOException {
        if (z11) {
            c0(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0() {
        while (this.f1143h > this.f1141f) {
            D0(this.f1145j.entrySet().iterator().next().getKey());
        }
    }

    private void I() {
        if (this.f1144i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @TargetApi(26)
    private static void J(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void T(c cVar, boolean z11) {
        d dVar = cVar.f1151a;
        if (dVar.f1160f != cVar) {
            throw new IllegalStateException();
        }
        if (z11 && !dVar.f1159e) {
            for (int i11 = 0; i11 < this.f1142g; i11++) {
                if (!cVar.f1152b[i11]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!dVar.k(i11).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i12 = 0; i12 < this.f1142g; i12++) {
            File fileK = dVar.k(i12);
            if (!z11) {
                c0(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i12);
                fileK.renameTo(fileJ);
                long j11 = dVar.f1156b[i12];
                long length = fileJ.length();
                dVar.f1156b[i12] = length;
                this.f1143h = (this.f1143h - j11) + length;
            }
        }
        this.f1146k++;
        dVar.f1160f = null;
        if (dVar.f1159e || z11) {
            dVar.f1159e = true;
            this.f1144i.append((CharSequence) "CLEAN");
            this.f1144i.append(' ');
            this.f1144i.append((CharSequence) dVar.f1155a);
            this.f1144i.append((CharSequence) dVar.l());
            this.f1144i.append('\n');
            if (z11) {
                long j12 = this.f1147l;
                this.f1147l = 1 + j12;
                dVar.f1161g = j12;
            }
        } else {
            this.f1145j.remove(dVar.f1155a);
            this.f1144i.append((CharSequence) "REMOVE");
            this.f1144i.append(' ');
            this.f1144i.append((CharSequence) dVar.f1155a);
            this.f1144i.append('\n');
        }
        n0(this.f1144i);
        if (this.f1143h > this.f1141f || s0()) {
            this.f1148m.submit(this.f1149n);
        }
    }

    private static void c0(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private synchronized c k0(String str, long j11) {
        I();
        d dVar = this.f1145j.get(str);
        CallableC0044a callableC0044a = null;
        if (j11 != -1 && (dVar == null || dVar.f1161g != j11)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, callableC0044a);
            this.f1145j.put(str, dVar);
        } else if (dVar.f1160f != null) {
            return null;
        }
        c cVar = new c(this, dVar, callableC0044a);
        dVar.f1160f = cVar;
        this.f1144i.append((CharSequence) "DIRTY");
        this.f1144i.append(' ');
        this.f1144i.append((CharSequence) str);
        this.f1144i.append('\n');
        n0(this.f1144i);
        return cVar;
    }

    @TargetApi(26)
    private static void n0(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean s0() {
        int i11 = this.f1146k;
        return i11 >= 2000 && i11 >= this.f1145j.size();
    }

    public static a t0(File file, int i11, int i12, long j11) throws IOException {
        if (j11 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i12 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                G0(file2, file3, false);
            }
        }
        a aVar = new a(file, i11, i12, j11);
        if (aVar.f1137b.exists()) {
            try {
                aVar.w0();
                aVar.u0();
                return aVar;
            } catch (IOException e11) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e11.getMessage() + ", removing");
                aVar.b0();
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i11, i12, j11);
        aVar2.z0();
        return aVar2;
    }

    private void u0() throws IOException {
        c0(this.f1138c);
        Iterator<d> it = this.f1145j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i11 = 0;
            if (next.f1160f == null) {
                while (i11 < this.f1142g) {
                    this.f1143h += next.f1156b[i11];
                    i11++;
                }
            } else {
                next.f1160f = null;
                while (i11 < this.f1142g) {
                    c0(next.j(i11));
                    c0(next.k(i11));
                    i11++;
                }
                it.remove();
            }
        }
    }

    private void w0() {
        aj.b bVar = new aj.b(new FileInputStream(this.f1137b), aj.c.f1174a);
        try {
            String strP = bVar.p();
            String strP2 = bVar.p();
            String strP3 = bVar.p();
            String strP4 = bVar.p();
            String strP5 = bVar.p();
            if (!"libcore.io.DiskLruCache".equals(strP) || !"1".equals(strP2) || !Integer.toString(this.f1140e).equals(strP3) || !Integer.toString(this.f1142g).equals(strP4) || !"".equals(strP5)) {
                throw new IOException("unexpected journal header: [" + strP + ", " + strP2 + ", " + strP4 + ", " + strP5 + "]");
            }
            int i11 = 0;
            while (true) {
                try {
                    y0(bVar.p());
                    i11++;
                } catch (EOFException unused) {
                    this.f1146k = i11 - this.f1145j.size();
                    if (bVar.o()) {
                        z0();
                    } else {
                        this.f1144i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f1137b, true), aj.c.f1174a));
                    }
                    aj.c.a(bVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            aj.c.a(bVar);
            throw th2;
        }
    }

    private void y0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i11 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i11);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i11);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f1145j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i11, iIndexOf2);
        }
        d dVar = this.f1145j.get(strSubstring);
        CallableC0044a callableC0044a = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, callableC0044a);
            this.f1145j.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f1159e = true;
            dVar.f1160f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f1160f = new c(this, dVar, callableC0044a);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void z0() {
        try {
            Writer writer = this.f1144i;
            if (writer != null) {
                J(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f1138c), aj.c.f1174a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f1140e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f1142g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f1145j.values()) {
                    if (dVar.f1160f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f1155a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f1155a + dVar.l() + '\n');
                    }
                }
                J(bufferedWriter);
                if (this.f1137b.exists()) {
                    G0(this.f1137b, this.f1139d, true);
                }
                G0(this.f1138c, this.f1137b, false);
                this.f1139d.delete();
                this.f1144i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f1137b, true), aj.c.f1174a));
            } catch (Throwable th2) {
                J(bufferedWriter);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized boolean D0(String str) {
        try {
            I();
            d dVar = this.f1145j.get(str);
            if (dVar != null && dVar.f1160f == null) {
                for (int i11 = 0; i11 < this.f1142g; i11++) {
                    File fileJ = dVar.j(i11);
                    if (fileJ.exists() && !fileJ.delete()) {
                        throw new IOException("failed to delete " + fileJ);
                    }
                    this.f1143h -= dVar.f1156b[i11];
                    dVar.f1156b[i11] = 0;
                }
                this.f1146k++;
                this.f1144i.append((CharSequence) "REMOVE");
                this.f1144i.append(' ');
                this.f1144i.append((CharSequence) str);
                this.f1144i.append('\n');
                this.f1145j.remove(str);
                if (s0()) {
                    this.f1148m.submit(this.f1149n);
                }
                return true;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void b0() throws IOException {
        close();
        aj.c.b(this.f1136a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f1144i == null) {
                return;
            }
            for (d dVar : new ArrayList(this.f1145j.values())) {
                if (dVar.f1160f != null) {
                    dVar.f1160f.a();
                }
            }
            H0();
            J(this.f1144i);
            this.f1144i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public c e0(String str) {
        return k0(str, -1L);
    }

    public synchronized e r0(String str) throws Throwable {
        Throwable th2;
        try {
            try {
                I();
                d dVar = this.f1145j.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f1159e) {
                    return null;
                }
                for (File file : dVar.f1157c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                this.f1146k++;
                this.f1144i.append((CharSequence) "READ");
                this.f1144i.append(' ');
                this.f1144i.append((CharSequence) str);
                this.f1144i.append('\n');
                if (s0()) {
                    this.f1148m.submit(this.f1149n);
                }
                return new e(this, str, dVar.f1161g, dVar.f1157c, dVar.f1156b, null);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
        }
        throw th2;
    }
}
