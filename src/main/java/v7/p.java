package v7;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p implements androidx.media3.datasource.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.a f118133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f118134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f118135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f118136d;

    public p(androidx.media3.datasource.a aVar, d dVar) {
        this.f118133a = (androidx.media3.datasource.a) s7.a.f(aVar);
        this.f118134b = (d) s7.a.f(dVar);
    }

    @Override // androidx.media3.datasource.a
    public Map<String, List<String>> b() {
        return this.f118133a.b();
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        try {
            this.f118133a.close();
        } finally {
            if (this.f118135c) {
                this.f118135c = false;
                this.f118134b.close();
            }
        }
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        return this.f118133a.getUri();
    }

    @Override // androidx.media3.datasource.a
    public long j(j jVar) {
        long j11 = this.f118133a.j(jVar);
        this.f118136d = j11;
        if (j11 == 0) {
            return 0L;
        }
        if (jVar.f118108h == -1 && j11 != -1) {
            jVar = jVar.f(0L, j11);
        }
        this.f118135c = true;
        this.f118134b.j(jVar);
        return this.f118136d;
    }

    @Override // androidx.media3.datasource.a
    public void n(q qVar) {
        s7.a.f(qVar);
        this.f118133a.n(qVar);
    }

    @Override // p7.j
    public int read(byte[] bArr, int i11, int i12) {
        if (this.f118136d == 0) {
            return -1;
        }
        int i13 = this.f118133a.read(bArr, i11, i12);
        if (i13 > 0) {
            this.f118134b.write(bArr, i11, i13);
            long j11 = this.f118136d;
            if (j11 != -1) {
                this.f118136d = j11 - ((long) i13);
            }
        }
        return i13;
    }
}
