package vk;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class b extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f119528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f119529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f119530c;

    public b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        inputStream.getClass();
        bArr.getClass();
        this.f119528a = bArr;
    }

    private int c() {
        int i11 = this.f119529b;
        byte[] bArr = this.f119528a;
        if (i11 >= bArr.length) {
            return -1;
        }
        this.f119529b = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i11) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i11);
            this.f119530c = this.f119529b;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i11 = ((FilterInputStream) this).in.read();
        return i11 != -1 ? i11 : c();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        ((FilterInputStream) this).in.reset();
        this.f119529b = this.f119530c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = ((FilterInputStream) this).in.read(bArr, i11, i12);
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        if (i12 == 0) {
            return 0;
        }
        while (i14 < i12) {
            int iC = c();
            if (iC == -1) {
                break;
            }
            bArr[i11 + i14] = (byte) iC;
            i14++;
        }
        if (i14 > 0) {
            return i14;
        }
        return -1;
    }
}
