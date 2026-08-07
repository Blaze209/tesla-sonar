package androidx.media3.exoplayer.source;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class n implements androidx.media3.datasource.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.a f11076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f11078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f11079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11080e;

    public interface a {
        void c(s7.c0 c0Var);
    }

    public n(androidx.media3.datasource.a aVar, int i11, a aVar2) {
        s7.a.a(i11 > 0);
        this.f11076a = aVar;
        this.f11077b = i11;
        this.f11078c = aVar2;
        this.f11079d = new byte[1];
        this.f11080e = i11;
    }

    private boolean o() {
        if (this.f11076a.read(this.f11079d, 0, 1) == -1) {
            return false;
        }
        int i11 = (this.f11079d[0] & 255) << 4;
        if (i11 == 0) {
            return true;
        }
        byte[] bArr = new byte[i11];
        int i12 = i11;
        int i13 = 0;
        while (i12 > 0) {
            int i14 = this.f11076a.read(bArr, i13, i12);
            if (i14 == -1) {
                return false;
            }
            i13 += i14;
            i12 -= i14;
        }
        while (i11 > 0 && bArr[i11 - 1] == 0) {
            i11--;
        }
        if (i11 > 0) {
            this.f11078c.c(new s7.c0(bArr, i11));
        }
        return true;
    }

    @Override // androidx.media3.datasource.a
    public Map<String, List<String>> b() {
        return this.f11076a.b();
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        return this.f11076a.getUri();
    }

    @Override // androidx.media3.datasource.a
    public long j(v7.j jVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.a
    public void n(v7.q qVar) {
        s7.a.f(qVar);
        this.f11076a.n(qVar);
    }

    @Override // p7.j
    public int read(byte[] bArr, int i11, int i12) {
        if (this.f11080e == 0) {
            if (!o()) {
                return -1;
            }
            this.f11080e = this.f11077b;
        }
        int i13 = this.f11076a.read(bArr, i11, Math.min(this.f11080e, i12));
        if (i13 != -1) {
            this.f11080e -= i13;
        }
        return i13;
    }
}
