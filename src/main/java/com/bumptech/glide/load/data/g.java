package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends FilterInputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f20533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f20534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f20535e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f20536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20537b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f20533c = bArr;
        int length = bArr.length;
        f20534d = length;
        f20535e = length + 2;
    }

    public g(InputStream inputStream, int i11) {
        super(inputStream);
        if (i11 >= -1 && i11 <= 8) {
            this.f20536a = (byte) i11;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i11);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i11;
        int i12;
        int i13 = this.f20537b;
        if (i13 < 2 || i13 > (i12 = f20535e)) {
            i11 = super.read();
        } else {
            i11 = i13 == i12 ? this.f20536a : f20533c[i13 - 2] & 255;
        }
        if (i11 != -1) {
            this.f20537b++;
        }
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j11) throws IOException {
        long jSkip = super.skip(j11);
        if (jSkip > 0) {
            this.f20537b = (int) (((long) this.f20537b) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i11, int i12) throws IOException {
        int i13;
        int i14 = this.f20537b;
        int i15 = f20535e;
        if (i14 > i15) {
            i13 = super.read(bArr, i11, i12);
        } else if (i14 == i15) {
            bArr[i11] = this.f20536a;
            i13 = 1;
        } else if (i14 < 2) {
            i13 = super.read(bArr, i11, 2 - i14);
        } else {
            int iMin = Math.min(i15 - i14, i12);
            System.arraycopy(f20533c, this.f20537b - 2, bArr, i11, iMin);
            i13 = iMin;
        }
        if (i13 > 0) {
            this.f20537b += i13;
        }
        return i13;
    }
}
