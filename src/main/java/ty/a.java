package ty;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final Pattern f115165o = Pattern.compile("[a-z0-9_-]{1,64}");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final OutputStream f115166p = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f115167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f115168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f115169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f115170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f115171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f115172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f115173g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Writer f115175i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f115177k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f115174h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final LinkedHashMap<String, d> f115176j = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f115178l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ThreadPoolExecutor f115179m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Callable<Void> f115180n = new CallableC2462a();

    /* JADX INFO: renamed from: ty.a$a, reason: collision with other inner class name */
    class CallableC2462a implements Callable<Void> {
        CallableC2462a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (a.this) {
                try {
                    if (a.this.f115175i == null) {
                        return null;
                    }
                    a.this.G0();
                    if (a.this.r0()) {
                        a.this.y0();
                        a.this.f115177k = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f115182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f115183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f115184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f115185d;

        /* JADX INFO: renamed from: ty.a$c$a, reason: collision with other inner class name */
        private class C2463a extends FilterOutputStream {
            /* synthetic */ C2463a(c cVar, OutputStream outputStream, CallableC2462a callableC2462a) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    c.this.f115184c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    c.this.f115184c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i11) {
                try {
                    ((FilterOutputStream) this).out.write(i11);
                } catch (IOException unused) {
                    c.this.f115184c = true;
                }
            }

            private C2463a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i11, int i12) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i11, i12);
                } catch (IOException unused) {
                    c.this.f115184c = true;
                }
            }
        }

        /* synthetic */ c(a aVar, d dVar, CallableC2462a callableC2462a) {
            this(dVar);
        }

        public void a() {
            a.this.T(this, false);
        }

        public void e() {
            if (this.f115184c) {
                a.this.T(this, false);
                a.this.z0(this.f115182a.f115188a);
            } else {
                a.this.T(this, true);
            }
            this.f115185d = true;
        }

        public OutputStream f(int i11) {
            FileOutputStream fileOutputStream;
            C2463a c2463a;
            synchronized (a.this) {
                try {
                    if (this.f115182a.f115191d != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f115182a.f115190c) {
                        this.f115183b[i11] = true;
                    }
                    File fileK = this.f115182a.k(i11);
                    try {
                        fileOutputStream = new FileOutputStream(fileK);
                    } catch (FileNotFoundException unused) {
                        a.this.f115167a.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(fileK);
                        } catch (FileNotFoundException unused2) {
                            return a.f115166p;
                        }
                    }
                    c2463a = new C2463a(this, fileOutputStream, null);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c2463a;
        }

        private c(d dVar) {
            this.f115182a = dVar;
            this.f115183b = dVar.f115190c ? null : new boolean[a.this.f115173g];
        }
    }

    private final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f115188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f115189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f115190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f115191d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f115192e;

        /* synthetic */ d(a aVar, String str, CallableC2462a callableC2462a) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != a.this.f115173g) {
                throw m(strArr);
            }
            for (int i11 = 0; i11 < strArr.length; i11++) {
                try {
                    this.f115189b[i11] = Long.parseLong(strArr[i11]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i11) {
            return new File(a.this.f115167a, this.f115188a + "." + i11);
        }

        public File k(int i11) {
            return new File(a.this.f115167a, this.f115188a + "." + i11 + ".tmp");
        }

        public String l() {
            StringBuilder sb2 = new StringBuilder();
            for (long j11 : this.f115189b) {
                sb2.append(' ');
                sb2.append(j11);
            }
            return sb2.toString();
        }

        private d(String str) {
            this.f115188a = str;
            this.f115189b = new long[a.this.f115173g];
        }
    }

    public final class e implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f115194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f115195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InputStream[] f115196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long[] f115197d;

        /* synthetic */ e(a aVar, String str, long j11, InputStream[] inputStreamArr, long[] jArr, CallableC2462a callableC2462a) {
            this(str, j11, inputStreamArr, jArr);
        }

        public InputStream c(int i11) {
            return this.f115196c[i11];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f115196c) {
                ty.c.a(inputStream);
            }
        }

        private e(String str, long j11, InputStream[] inputStreamArr, long[] jArr) {
            this.f115194a = str;
            this.f115195b = j11;
            this.f115196c = inputStreamArr;
            this.f115197d = jArr;
        }
    }

    private a(File file, int i11, int i12, long j11) {
        this.f115167a = file;
        this.f115171e = i11;
        this.f115168b = new File(file, "journal");
        this.f115169c = new File(file, "journal.tmp");
        this.f115170d = new File(file, "journal.bkp");
        this.f115173g = i12;
        this.f115172f = j11;
    }

    private static void D0(File file, File file2, boolean z11) throws IOException {
        if (z11) {
            c0(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0() {
        while (this.f115174h > this.f115172f) {
            z0(this.f115176j.entrySet().iterator().next().getKey());
        }
    }

    private void H0(String str) {
        if (f115165o.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
    }

    private void J() {
        if (this.f115175i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void T(c cVar, boolean z11) {
        d dVar = cVar.f115182a;
        if (dVar.f115191d != cVar) {
            throw new IllegalStateException();
        }
        if (z11 && !dVar.f115190c) {
            for (int i11 = 0; i11 < this.f115173g; i11++) {
                if (!cVar.f115183b[i11]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!dVar.k(i11).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i12 = 0; i12 < this.f115173g; i12++) {
            File fileK = dVar.k(i12);
            if (!z11) {
                c0(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i12);
                fileK.renameTo(fileJ);
                long j11 = dVar.f115189b[i12];
                long length = fileJ.length();
                dVar.f115189b[i12] = length;
                this.f115174h = (this.f115174h - j11) + length;
            }
        }
        this.f115177k++;
        dVar.f115191d = null;
        if (dVar.f115190c || z11) {
            dVar.f115190c = true;
            this.f115175i.write("CLEAN " + dVar.f115188a + dVar.l() + '\n');
            if (z11) {
                long j12 = this.f115178l;
                this.f115178l = 1 + j12;
                dVar.f115192e = j12;
            }
        } else {
            this.f115176j.remove(dVar.f115188a);
            this.f115175i.write("REMOVE " + dVar.f115188a + '\n');
        }
        this.f115175i.flush();
        if (this.f115174h > this.f115172f || r0()) {
            this.f115179m.submit(this.f115180n);
        }
    }

    private static void c0(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private synchronized c k0(String str, long j11) {
        J();
        H0(str);
        d dVar = this.f115176j.get(str);
        CallableC2462a callableC2462a = null;
        if (j11 != -1 && (dVar == null || dVar.f115192e != j11)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, callableC2462a);
            this.f115176j.put(str, dVar);
        } else if (dVar.f115191d != null) {
            return null;
        }
        c cVar = new c(this, dVar, callableC2462a);
        dVar.f115191d = cVar;
        this.f115175i.write("DIRTY " + str + '\n');
        this.f115175i.flush();
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r0() {
        int i11 = this.f115177k;
        return i11 >= 2000 && i11 >= this.f115176j.size();
    }

    public static a s0(File file, int i11, int i12, long j11) throws IOException {
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
                D0(file2, file3, false);
            }
        }
        a aVar = new a(file, i11, i12, j11);
        if (aVar.f115168b.exists()) {
            try {
                aVar.u0();
                aVar.t0();
                aVar.f115175i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(aVar.f115168b, true), ty.c.f115205a));
                return aVar;
            } catch (IOException e11) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e11.getMessage() + ", removing");
                aVar.b0();
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i11, i12, j11);
        aVar2.y0();
        return aVar2;
    }

    private void t0() throws IOException {
        c0(this.f115169c);
        Iterator<d> it = this.f115176j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i11 = 0;
            if (next.f115191d == null) {
                while (i11 < this.f115173g) {
                    this.f115174h += next.f115189b[i11];
                    i11++;
                }
            } else {
                next.f115191d = null;
                while (i11 < this.f115173g) {
                    c0(next.j(i11));
                    c0(next.k(i11));
                    i11++;
                }
                it.remove();
            }
        }
    }

    private void u0() {
        ty.b bVar = new ty.b(new FileInputStream(this.f115168b), ty.c.f115205a);
        try {
            String strO = bVar.o();
            String strO2 = bVar.o();
            String strO3 = bVar.o();
            String strO4 = bVar.o();
            String strO5 = bVar.o();
            if (!"libcore.io.DiskLruCache".equals(strO) || !"1".equals(strO2) || !Integer.toString(this.f115171e).equals(strO3) || !Integer.toString(this.f115173g).equals(strO4) || !"".equals(strO5)) {
                throw new IOException("unexpected journal header: [" + strO + ", " + strO2 + ", " + strO4 + ", " + strO5 + "]");
            }
            int i11 = 0;
            while (true) {
                try {
                    w0(bVar.o());
                    i11++;
                } catch (EOFException unused) {
                    this.f115177k = i11 - this.f115176j.size();
                    ty.c.a(bVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            ty.c.a(bVar);
            throw th2;
        }
    }

    private void w0(String str) throws IOException {
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
                this.f115176j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i11, iIndexOf2);
        }
        d dVar = this.f115176j.get(strSubstring);
        CallableC2462a callableC2462a = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, callableC2462a);
            this.f115176j.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f115190c = true;
            dVar.f115191d = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f115191d = new c(this, dVar, callableC2462a);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void y0() {
        try {
            Writer writer = this.f115175i;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f115169c), ty.c.f115205a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f115171e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f115173g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f115176j.values()) {
                    if (dVar.f115191d != null) {
                        bufferedWriter.write("DIRTY " + dVar.f115188a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f115188a + dVar.l() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.f115168b.exists()) {
                    D0(this.f115168b, this.f115170d, true);
                }
                D0(this.f115169c, this.f115168b, false);
                this.f115170d.delete();
                this.f115175i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f115168b, true), ty.c.f115205a));
            } catch (Throwable th2) {
                bufferedWriter.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public void b0() throws IOException {
        close();
        ty.c.b(this.f115167a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f115175i == null) {
                return;
            }
            for (d dVar : new ArrayList(this.f115176j.values())) {
                if (dVar.f115191d != null) {
                    dVar.f115191d.a();
                }
            }
            G0();
            this.f115175i.close();
            this.f115175i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public c e0(String str) {
        return k0(str, -1L);
    }

    public synchronized void flush() {
        J();
        G0();
        this.f115175i.flush();
    }

    public synchronized e n0(String str) throws Throwable {
        Throwable th2;
        InputStream inputStream;
        try {
            J();
            H0(str);
            d dVar = this.f115176j.get(str);
            if (dVar == null) {
                return null;
            }
            if (!dVar.f115190c) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[this.f115173g];
            for (int i11 = 0; i11 < this.f115173g; i11++) {
                try {
                    try {
                        try {
                            inputStreamArr[i11] = new FileInputStream(dVar.j(i11));
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    } catch (FileNotFoundException unused) {
                        for (int i12 = 0; i12 < this.f115173g && (inputStream = inputStreamArr[i12]) != null; i12++) {
                            ty.c.a(inputStream);
                        }
                        return null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                }
            }
            this.f115177k++;
            this.f115175i.append((CharSequence) ("READ " + str + '\n'));
            if (r0()) {
                this.f115179m.submit(this.f115180n);
            }
            return new e(this, str, dVar.f115192e, inputStreamArr, dVar.f115189b, null);
        } catch (Throwable th5) {
            th = th5;
        }
        th2 = th;
        throw th2;
    }

    public synchronized boolean z0(String str) {
        try {
            J();
            H0(str);
            d dVar = this.f115176j.get(str);
            if (dVar != null && dVar.f115191d == null) {
                for (int i11 = 0; i11 < this.f115173g; i11++) {
                    File fileJ = dVar.j(i11);
                    if (fileJ.exists() && !fileJ.delete()) {
                        throw new IOException("failed to delete " + fileJ);
                    }
                    this.f115174h -= dVar.f115189b[i11];
                    dVar.f115189b[i11] = 0;
                }
                this.f115177k++;
                this.f115175i.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f115176j.remove(str);
                if (r0()) {
                    this.f115179m.submit(this.f115180n);
                }
                return true;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    static class b extends OutputStream {
        b() {
        }

        @Override // java.io.OutputStream
        public void write(int i11) {
        }
    }
}
