package v7;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o implements androidx.media3.datasource.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.a f118129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f118130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f118131c = Uri.EMPTY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, List<String>> f118132d = Collections.EMPTY_MAP;

    public o(androidx.media3.datasource.a aVar) {
        this.f118129a = (androidx.media3.datasource.a) s7.a.f(aVar);
    }

    @Override // androidx.media3.datasource.a
    public Map<String, List<String>> b() {
        return this.f118129a.b();
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        this.f118129a.close();
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        return this.f118129a.getUri();
    }

    @Override // androidx.media3.datasource.a
    public long j(j jVar) {
        this.f118131c = jVar.f118101a;
        this.f118132d = Collections.EMPTY_MAP;
        try {
            return this.f118129a.j(jVar);
        } finally {
            Uri uri = getUri();
            if (uri != null) {
                this.f118131c = uri;
            }
            this.f118132d = b();
        }
    }

    @Override // androidx.media3.datasource.a
    public void n(q qVar) {
        s7.a.f(qVar);
        this.f118129a.n(qVar);
    }

    public long o() {
        return this.f118130b;
    }

    public Uri p() {
        return this.f118131c;
    }

    public Map<String, List<String>> q() {
        return this.f118132d;
    }

    public void r() {
        this.f118130b = 0L;
    }

    @Override // p7.j
    public int read(byte[] bArr, int i11, int i12) {
        int i13 = this.f118129a.read(bArr, i11, i12);
        if (i13 != -1) {
            this.f118130b += (long) i13;
        }
        return i13;
    }
}
