package androidx.media3.datasource.cache;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import s7.q0;
import s7.t;
import v7.j;

/* JADX INFO: loaded from: classes.dex */
public final class CacheDataSink implements v7.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Cache f9166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f9167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f9169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f9170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private File f9171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private OutputStream f9172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f9174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f9175j;

    public static final class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException iOException) {
            super(iOException);
        }
    }

    public static final class a implements v7.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Cache f9176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f9177b = 5242880;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9178c = 20480;

        @Override // v7.d.a
        public v7.d a() {
            return new CacheDataSink((Cache) s7.a.f(this.f9176a), this.f9177b, this.f9178c);
        }

        public a b(Cache cache) {
            this.f9176a = cache;
            return this;
        }
    }

    public CacheDataSink(Cache cache, long j11, int i11) {
        s7.a.i(j11 > 0 || j11 == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j11 != -1 && j11 < 2097152) {
            t.i("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f9166a = (Cache) s7.a.f(cache);
        this.f9167b = j11 == -1 ? Long.MAX_VALUE : j11;
        this.f9168c = i11;
    }

    private void a() {
        OutputStream outputStream = this.f9172g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            q0.p(this.f9172g);
            this.f9172g = null;
            File file = (File) q0.l(this.f9171f);
            this.f9171f = null;
            this.f9166a.h(file, this.f9173h);
        } catch (Throwable th2) {
            q0.p(this.f9172g);
            this.f9172g = null;
            File file2 = (File) q0.l(this.f9171f);
            this.f9171f = null;
            file2.delete();
            throw th2;
        }
    }

    private void b(j jVar) {
        long j11 = jVar.f118108h;
        this.f9171f = this.f9166a.d((String) q0.l(jVar.f118109i), jVar.f118107g + this.f9174i, j11 != -1 ? Math.min(j11 - this.f9174i, this.f9170e) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f9171f);
        if (this.f9168c > 0) {
            g gVar = this.f9175j;
            if (gVar == null) {
                this.f9175j = new g(fileOutputStream, this.f9168c);
            } else {
                gVar.c(fileOutputStream);
            }
            this.f9172g = this.f9175j;
        } else {
            this.f9172g = fileOutputStream;
        }
        this.f9173h = 0L;
    }

    @Override // v7.d
    public void close() throws CacheDataSinkException {
        if (this.f9169d == null) {
            return;
        }
        try {
            a();
        } catch (IOException e11) {
            throw new CacheDataSinkException(e11);
        }
    }

    @Override // v7.d
    public void j(j jVar) throws CacheDataSinkException {
        s7.a.f(jVar.f118109i);
        if (jVar.f118108h == -1 && jVar.d(2)) {
            this.f9169d = null;
            return;
        }
        this.f9169d = jVar;
        this.f9170e = jVar.d(4) ? this.f9167b : Long.MAX_VALUE;
        this.f9174i = 0L;
        try {
            b(jVar);
        } catch (IOException e11) {
            throw new CacheDataSinkException(e11);
        }
    }

    @Override // v7.d
    public void write(byte[] bArr, int i11, int i12) throws CacheDataSinkException {
        j jVar = this.f9169d;
        if (jVar == null) {
            return;
        }
        int i13 = 0;
        while (i13 < i12) {
            try {
                if (this.f9173h == this.f9170e) {
                    a();
                    b(jVar);
                }
                int iMin = (int) Math.min(i12 - i13, this.f9170e - this.f9173h);
                ((OutputStream) q0.l(this.f9172g)).write(bArr, i11 + i13, iMin);
                i13 += iMin;
                long j11 = iMin;
                this.f9173h += j11;
                this.f9174i += j11;
            } catch (IOException e11) {
                throw new CacheDataSinkException(e11);
            }
        }
    }
}
