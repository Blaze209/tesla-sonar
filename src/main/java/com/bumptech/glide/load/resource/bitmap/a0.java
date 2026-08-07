package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class a0 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile byte[] f20769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final gj.b f20774f;

    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public a0(@NonNull InputStream inputStream, @NonNull gj.b bVar) {
        this(inputStream, bVar, 65536);
    }

    private int c(InputStream inputStream, byte[] bArr) throws IOException {
        int i11 = this.f20772d;
        if (i11 != -1) {
            int i12 = this.f20773e - i11;
            int i13 = this.f20771c;
            if (i12 < i13) {
                if (i11 == 0 && i13 > bArr.length && this.f20770b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i13) {
                        i13 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f20774f.c(i13, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f20769a = bArr2;
                    this.f20774f.put(bArr);
                    bArr = bArr2;
                } else if (i11 > 0) {
                    System.arraycopy(bArr, i11, bArr, 0, bArr.length - i11);
                }
                int i14 = this.f20773e - this.f20772d;
                this.f20773e = i14;
                this.f20772d = 0;
                this.f20770b = 0;
                int i15 = inputStream.read(bArr, i14, bArr.length - i14);
                int i16 = this.f20773e;
                if (i15 > 0) {
                    i16 += i15;
                }
                this.f20770b = i16;
                return i15;
            }
        }
        int i17 = inputStream.read(bArr);
        if (i17 > 0) {
            this.f20772d = -1;
            this.f20773e = 0;
            this.f20770b = i17;
        }
        return i17;
    }

    private static IOException o() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f20769a == null || inputStream == null) {
            throw o();
        }
        return (this.f20770b - this.f20773e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f20769a != null) {
            this.f20774f.put(this.f20769a);
            this.f20769a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i11) {
        this.f20771c = Math.max(this.f20771c, i11);
        this.f20772d = this.f20773e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    public synchronized void n() {
        this.f20771c = this.f20769a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f20769a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw o();
        }
        if (this.f20773e >= this.f20770b && c(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f20769a && (bArr = this.f20769a) == null) {
            throw o();
        }
        int i11 = this.f20770b;
        int i12 = this.f20773e;
        if (i11 - i12 <= 0) {
            return -1;
        }
        this.f20773e = i12 + 1;
        return bArr[i12] & 255;
    }

    public synchronized void release() {
        if (this.f20769a != null) {
            this.f20774f.put(this.f20769a);
            this.f20769a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f20769a == null) {
            throw new IOException("Stream is closed");
        }
        int i11 = this.f20772d;
        if (-1 == i11) {
            throw new a("Mark has been invalidated, pos: " + this.f20773e + " markLimit: " + this.f20771c);
        }
        this.f20773e = i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j11) {
        if (j11 < 1) {
            return 0L;
        }
        byte[] bArr = this.f20769a;
        if (bArr == null) {
            throw o();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw o();
        }
        int i11 = this.f20770b;
        int i12 = this.f20773e;
        if (i11 - i12 >= j11) {
            this.f20773e = (int) (((long) i12) + j11);
            return j11;
        }
        long j12 = ((long) i11) - ((long) i12);
        this.f20773e = i11;
        if (this.f20772d == -1 || j11 > this.f20771c) {
            long jSkip = inputStream.skip(j11 - j12);
            if (jSkip > 0) {
                this.f20772d = -1;
            }
            return j12 + jSkip;
        }
        if (c(inputStream, bArr) == -1) {
            return j12;
        }
        int i13 = this.f20770b;
        int i14 = this.f20773e;
        if (i13 - i14 >= j11 - j12) {
            this.f20773e = (int) ((((long) i14) + j11) - j12);
            return j11;
        }
        long j13 = (j12 + ((long) i13)) - ((long) i14);
        this.f20773e = i13;
        return j13;
    }

    a0(@NonNull InputStream inputStream, @NonNull gj.b bVar, int i11) {
        super(inputStream);
        this.f20772d = -1;
        this.f20774f = bVar;
        this.f20769a = (byte[]) bVar.c(i11, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@NonNull byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        byte[] bArr2 = this.f20769a;
        if (bArr2 == null) {
            throw o();
        }
        if (i12 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i15 = this.f20773e;
            int i16 = this.f20770b;
            if (i15 < i16) {
                int i17 = i16 - i15 >= i12 ? i12 : i16 - i15;
                System.arraycopy(bArr2, i15, bArr, i11, i17);
                this.f20773e += i17;
                if (i17 == i12 || inputStream.available() == 0) {
                    return i17;
                }
                i11 += i17;
                i13 = i12 - i17;
            } else {
                i13 = i12;
            }
            while (true) {
                if (this.f20772d == -1 && i13 >= bArr2.length) {
                    i14 = inputStream.read(bArr, i11, i13);
                    if (i14 == -1) {
                        return i13 != i12 ? i12 - i13 : -1;
                    }
                } else {
                    if (c(inputStream, bArr2) == -1) {
                        return i13 != i12 ? i12 - i13 : -1;
                    }
                    if (bArr2 != this.f20769a && (bArr2 = this.f20769a) == null) {
                        throw o();
                    }
                    int i18 = this.f20770b;
                    int i19 = this.f20773e;
                    i14 = i18 - i19 >= i13 ? i13 : i18 - i19;
                    System.arraycopy(bArr2, i19, bArr, i11, i14);
                    this.f20773e += i14;
                }
                i13 -= i14;
                if (i13 == 0) {
                    return i12;
                }
                if (inputStream.available() == 0) {
                    return i12 - i13;
                }
                i11 += i14;
            }
        } else {
            throw o();
        }
    }
}
