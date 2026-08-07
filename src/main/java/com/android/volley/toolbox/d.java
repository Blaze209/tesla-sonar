package com.android.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class d implements com.android.volley.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, a> f20237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f20238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f20239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20240d;

    public interface c {
        File get();
    }

    public d(c cVar, int i11) {
        this.f20237a = new LinkedHashMap(16, 0.75f, true);
        this.f20238b = 0L;
        this.f20239c = cVar;
        this.f20240d = i11;
    }

    private String f(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    private void g() {
        if (this.f20239c.get().exists()) {
            return;
        }
        com.android.volley.n.b("Re-initializing cache after external clearing.", new Object[0]);
        this.f20237a.clear();
        this.f20238b = 0L;
        initialize();
    }

    private void h() {
        if (this.f20238b < this.f20240d) {
            return;
        }
        int i11 = 0;
        if (com.android.volley.n.f20216b) {
            com.android.volley.n.e("Pruning old cache entries.", new Object[0]);
        }
        long j11 = this.f20238b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, a>> it = this.f20237a.entrySet().iterator();
        while (it.hasNext()) {
            a value = it.next().getValue();
            if (e(value.f20242b).delete()) {
                this.f20238b -= value.f20241a;
            } else {
                String str = value.f20242b;
                com.android.volley.n.b("Could not delete cache entry for key=%s, filename=%s", str, f(str));
            }
            it.remove();
            i11++;
            if (this.f20238b < this.f20240d * 0.9f) {
                break;
            }
        }
        if (com.android.volley.n.f20216b) {
            com.android.volley.n.e("pruned %d files, %d bytes, %d ms", Integer.valueOf(i11), Long.valueOf(this.f20238b - j11), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    private void i(String str, a aVar) {
        if (this.f20237a.containsKey(str)) {
            this.f20238b += aVar.f20241a - this.f20237a.get(str).f20241a;
        } else {
            this.f20238b += aVar.f20241a;
        }
        this.f20237a.put(str, aVar);
    }

    private static int j(InputStream inputStream) throws IOException {
        int i11 = inputStream.read();
        if (i11 != -1) {
            return i11;
        }
        throw new EOFException();
    }

    static List<com.android.volley.e> k(b bVar) throws IOException {
        int iL = l(bVar);
        if (iL < 0) {
            throw new IOException("readHeaderList size=" + iL);
        }
        List<com.android.volley.e> arrayList = iL == 0 ? Collections.EMPTY_LIST : new ArrayList<>();
        for (int i11 = 0; i11 < iL; i11++) {
            arrayList.add(new com.android.volley.e(n(bVar).intern(), n(bVar).intern()));
        }
        return arrayList;
    }

    static int l(InputStream inputStream) {
        return (j(inputStream) << 24) | j(inputStream) | (j(inputStream) << 8) | (j(inputStream) << 16);
    }

    static long m(InputStream inputStream) {
        return (((long) j(inputStream)) & 255) | ((((long) j(inputStream)) & 255) << 8) | ((((long) j(inputStream)) & 255) << 16) | ((((long) j(inputStream)) & 255) << 24) | ((((long) j(inputStream)) & 255) << 32) | ((((long) j(inputStream)) & 255) << 40) | ((((long) j(inputStream)) & 255) << 48) | ((255 & ((long) j(inputStream))) << 56);
    }

    static String n(b bVar) {
        return new String(q(bVar, m(bVar)), "UTF-8");
    }

    private void p(String str) {
        a aVarRemove = this.f20237a.remove(str);
        if (aVarRemove != null) {
            this.f20238b -= aVarRemove.f20241a;
        }
    }

    static byte[] q(b bVar, long j11) throws IOException {
        long jC = bVar.c();
        if (j11 >= 0 && j11 <= jC) {
            int i11 = (int) j11;
            if (i11 == j11) {
                byte[] bArr = new byte[i11];
                new DataInputStream(bVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j11 + ", maxLength=" + jC);
    }

    static void r(List<com.android.volley.e> list, OutputStream outputStream) throws IOException {
        if (list == null) {
            s(outputStream, 0);
            return;
        }
        s(outputStream, list.size());
        for (com.android.volley.e eVar : list) {
            u(outputStream, eVar.a());
            u(outputStream, eVar.b());
        }
    }

    static void s(OutputStream outputStream, int i11) throws IOException {
        outputStream.write(i11 & 255);
        outputStream.write((i11 >> 8) & 255);
        outputStream.write((i11 >> 16) & 255);
        outputStream.write((i11 >> 24) & 255);
    }

    static void t(OutputStream outputStream, long j11) throws IOException {
        outputStream.write((byte) j11);
        outputStream.write((byte) (j11 >>> 8));
        outputStream.write((byte) (j11 >>> 16));
        outputStream.write((byte) (j11 >>> 24));
        outputStream.write((byte) (j11 >>> 32));
        outputStream.write((byte) (j11 >>> 40));
        outputStream.write((byte) (j11 >>> 48));
        outputStream.write((byte) (j11 >>> 56));
    }

    static void u(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        t(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // com.android.volley.a
    public synchronized void a(String str, boolean z11) {
        try {
            com.android.volley.a.C0410a c0410a = get(str);
            if (c0410a != null) {
                c0410a.f20162f = 0L;
                if (z11) {
                    c0410a.f20161e = 0L;
                }
                b(str, c0410a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.android.volley.a
    public synchronized void b(String str, com.android.volley.a.C0410a c0410a) {
        long j11 = this.f20238b;
        byte[] bArr = c0410a.f20157a;
        long length = j11 + ((long) bArr.length);
        int i11 = this.f20240d;
        if (length > i11 && bArr.length > i11 * 0.9f) {
            return;
        }
        File fileE = e(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(d(fileE));
            a aVar = new a(str, c0410a);
            if (!aVar.d(bufferedOutputStream)) {
                bufferedOutputStream.close();
                com.android.volley.n.b("Failed to write header for %s", fileE.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(c0410a.f20157a);
            bufferedOutputStream.close();
            aVar.f20241a = fileE.length();
            i(str, aVar);
            h();
        } catch (IOException unused) {
            if (!fileE.delete()) {
                com.android.volley.n.b("Could not clean up file %s", fileE.getAbsolutePath());
            }
            g();
        }
    }

    InputStream c(File file) {
        return new FileInputStream(file);
    }

    OutputStream d(File file) {
        return new FileOutputStream(file);
    }

    public File e(String str) {
        return new File(this.f20239c.get(), f(str));
    }

    @Override // com.android.volley.a
    public synchronized com.android.volley.a.C0410a get(String str) {
        a aVar = this.f20237a.get(str);
        if (aVar == null) {
            return null;
        }
        File fileE = e(str);
        try {
            b bVar = new b(new BufferedInputStream(c(fileE)), fileE.length());
            try {
                a aVarB = a.b(bVar);
                if (TextUtils.equals(str, aVarB.f20242b)) {
                    com.android.volley.a.C0410a c0410aC = aVar.c(q(bVar, bVar.c()));
                    bVar.close();
                    return c0410aC;
                }
                com.android.volley.n.b("%s: key=%s, found=%s", fileE.getAbsolutePath(), str, aVarB.f20242b);
                p(str);
                bVar.close();
                return null;
            } catch (Throwable th2) {
                bVar.close();
                throw th2;
            }
        } catch (IOException e11) {
            com.android.volley.n.b("%s: %s", fileE.getAbsolutePath(), e11.toString());
            o(str);
            return null;
        }
    }

    @Override // com.android.volley.a
    public synchronized void initialize() {
        try {
            File file = this.f20239c.get();
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    com.android.volley.n.c("Unable to create cache dir %s", file.getAbsolutePath());
                }
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                try {
                    long length = file2.length();
                    b bVar = new b(new BufferedInputStream(c(file2)), length);
                    try {
                        a aVarB = a.b(bVar);
                        aVarB.f20241a = length;
                        i(aVarB.f20242b, aVarB);
                        bVar.close();
                    } catch (Throwable th2) {
                        bVar.close();
                        throw th2;
                    }
                } catch (IOException unused) {
                    file2.delete();
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized void o(String str) {
        boolean zDelete = e(str).delete();
        p(str);
        if (!zDelete) {
            com.android.volley.n.b("Could not delete cache entry for key=%s, filename=%s", str, f(str));
        }
    }

    static class b extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f20249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f20250b;

        b(InputStream inputStream, long j11) {
            super(inputStream);
            this.f20249a = j11;
        }

        long c() {
            return this.f20249a - this.f20250b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i11 = super.read();
            if (i11 != -1) {
                this.f20250b++;
            }
            return i11;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) throws IOException {
            int i13 = super.read(bArr, i11, i12);
            if (i13 != -1) {
                this.f20250b += (long) i13;
            }
            return i13;
        }
    }

    public d(c cVar) {
        this(cVar, 5242880);
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f20241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f20242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f20243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f20244d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f20245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final long f20246f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final long f20247g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final List<com.android.volley.e> f20248h;

        private a(String str, String str2, long j11, long j12, long j13, long j14, List<com.android.volley.e> list) {
            this.f20242b = str;
            this.f20243c = "".equals(str2) ? null : str2;
            this.f20244d = j11;
            this.f20245e = j12;
            this.f20246f = j13;
            this.f20247g = j14;
            this.f20248h = list;
        }

        private static List<com.android.volley.e> a(com.android.volley.a.C0410a c0410a) {
            List<com.android.volley.e> list = c0410a.f20164h;
            return list != null ? list : e.h(c0410a.f20163g);
        }

        static a b(b bVar) throws IOException {
            if (d.l(bVar) == 538247942) {
                return new a(d.n(bVar), d.n(bVar), d.m(bVar), d.m(bVar), d.m(bVar), d.m(bVar), d.k(bVar));
            }
            throw new IOException();
        }

        com.android.volley.a.C0410a c(byte[] bArr) {
            com.android.volley.a.C0410a c0410a = new com.android.volley.a.C0410a();
            c0410a.f20157a = bArr;
            c0410a.f20158b = this.f20243c;
            c0410a.f20159c = this.f20244d;
            c0410a.f20160d = this.f20245e;
            c0410a.f20161e = this.f20246f;
            c0410a.f20162f = this.f20247g;
            c0410a.f20163g = e.i(this.f20248h);
            c0410a.f20164h = Collections.unmodifiableList(this.f20248h);
            return c0410a;
        }

        boolean d(OutputStream outputStream) {
            try {
                d.s(outputStream, 538247942);
                d.u(outputStream, this.f20242b);
                String str = this.f20243c;
                if (str == null) {
                    str = "";
                }
                d.u(outputStream, str);
                d.t(outputStream, this.f20244d);
                d.t(outputStream, this.f20245e);
                d.t(outputStream, this.f20246f);
                d.t(outputStream, this.f20247g);
                d.r(this.f20248h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e11) {
                com.android.volley.n.b("%s", e11.toString());
                return false;
            }
        }

        a(String str, com.android.volley.a.C0410a c0410a) {
            this(str, c0410a.f20158b, c0410a.f20159c, c0410a.f20160d, c0410a.f20161e, c0410a.f20162f, a(c0410a));
        }
    }
}
