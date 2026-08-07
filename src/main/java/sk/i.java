package sk;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class i extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final PooledByteBuffer f111328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f111329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f111330c;

    public i(PooledByteBuffer pooledByteBuffer) {
        pk.k.b(Boolean.valueOf(!pooledByteBuffer.isClosed()));
        this.f111328a = (PooledByteBuffer) pk.k.g(pooledByteBuffer);
        this.f111329b = 0;
        this.f111330c = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f111328a.size() - this.f111329b;
    }

    @Override // java.io.InputStream
    public void mark(int i11) {
        this.f111330c = this.f111329b;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        PooledByteBuffer pooledByteBuffer = this.f111328a;
        int i11 = this.f111329b;
        this.f111329b = i11 + 1;
        return pooledByteBuffer.Q(i11) & 255;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f111329b = this.f111330c;
    }

    @Override // java.io.InputStream
    public long skip(long j11) {
        pk.k.b(Boolean.valueOf(j11 >= 0));
        int iMin = Math.min((int) j11, available());
        this.f111329b += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        if (i11 >= 0 && i12 >= 0 && i11 + i12 <= bArr.length) {
            int iAvailable = available();
            if (iAvailable <= 0) {
                return -1;
            }
            if (i12 <= 0) {
                return 0;
            }
            int iMin = Math.min(iAvailable, i12);
            this.f111328a.M(this.f111329b, bArr, i11, iMin);
            this.f111329b += iMin;
            return iMin;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i11 + "; regionLength=" + i12);
    }
}
