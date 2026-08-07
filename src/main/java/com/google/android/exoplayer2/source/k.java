package com.google.android.exoplayer2.source;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class k implements ss.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ss.i f40477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f40479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f40480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40481e;

    public interface a {
        void c(ts.d0 d0Var);
    }

    public k(ss.i iVar, int i11, a aVar) {
        ts.a.a(i11 > 0);
        this.f40477a = iVar;
        this.f40478b = i11;
        this.f40479c = aVar;
        this.f40480d = new byte[1];
        this.f40481e = i11;
    }

    private boolean n() {
        if (this.f40477a.read(this.f40480d, 0, 1) == -1) {
            return false;
        }
        int i11 = (this.f40480d[0] & 255) << 4;
        if (i11 == 0) {
            return true;
        }
        byte[] bArr = new byte[i11];
        int i12 = i11;
        int i13 = 0;
        while (i12 > 0) {
            int i14 = this.f40477a.read(bArr, i13, i12);
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
            this.f40479c.c(new ts.d0(bArr, i11));
        }
        return true;
    }

    @Override // ss.i
    public Map<String, List<String>> b() {
        return this.f40477a.b();
    }

    @Override // ss.i
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // ss.i
    public Uri getUri() {
        return this.f40477a.getUri();
    }

    @Override // ss.i
    public long j(ss.l lVar) {
        throw new UnsupportedOperationException();
    }

    @Override // ss.i
    public void m(ss.z zVar) {
        ts.a.e(zVar);
        this.f40477a.m(zVar);
    }

    @Override // ss.g
    public int read(byte[] bArr, int i11, int i12) {
        if (this.f40481e == 0) {
            if (!n()) {
                return -1;
            }
            this.f40481e = this.f40478b;
        }
        int i13 = this.f40477a.read(bArr, i11, Math.min(this.f40481e, i12));
        if (i13 != -1) {
            this.f40481e -= i13;
        }
        return i13;
    }
}
