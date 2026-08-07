package ty;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes6.dex */
class b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f115199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Charset f115200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f115201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f115202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f115203e;

    class a extends ByteArrayOutputStream {
        a(int i11) {
            super(i11);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i11 = ((ByteArrayOutputStream) this).count;
            if (i11 > 0 && ((ByteArrayOutputStream) this).buf[i11 - 1] == 13) {
                i11--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i11, b.this.f115200b.name());
            } catch (UnsupportedEncodingException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, PKIFailureInfo.certRevoked, charset);
    }

    private void n() throws IOException {
        InputStream inputStream = this.f115199a;
        byte[] bArr = this.f115201c;
        int i11 = inputStream.read(bArr, 0, bArr.length);
        if (i11 == -1) {
            throw new EOFException();
        }
        this.f115202d = 0;
        this.f115203e = i11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f115199a) {
            try {
                if (this.f115201c != null) {
                    this.f115201c = null;
                    this.f115199a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public String o() {
        int i11;
        byte[] bArr;
        int i12;
        synchronized (this.f115199a) {
            try {
                if (this.f115201c == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f115202d >= this.f115203e) {
                    n();
                }
                for (int i13 = this.f115202d; i13 != this.f115203e; i13++) {
                    byte[] bArr2 = this.f115201c;
                    if (bArr2[i13] == 10) {
                        int i14 = this.f115202d;
                        if (i13 != i14) {
                            i12 = i13 - 1;
                            if (bArr2[i12] != 13) {
                                i12 = i13;
                            }
                        } else {
                            i12 = i13;
                        }
                        String str = new String(bArr2, i14, i12 - i14, this.f115200b.name());
                        this.f115202d = i13 + 1;
                        return str;
                    }
                }
                a aVar = new a((this.f115203e - this.f115202d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f115201c;
                    int i15 = this.f115202d;
                    aVar.write(bArr3, i15, this.f115203e - i15);
                    this.f115203e = -1;
                    n();
                    i11 = this.f115202d;
                    while (i11 != this.f115203e) {
                        bArr = this.f115201c;
                        if (bArr[i11] == 10) {
                            break loop1;
                        }
                        i11++;
                    }
                }
                int i16 = this.f115202d;
                if (i11 != i16) {
                    aVar.write(bArr, i16, i11 - i16);
                }
                this.f115202d = i11 + 1;
                return aVar.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(InputStream inputStream, int i11, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(c.f115205a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f115199a = inputStream;
        this.f115200b = charset;
        this.f115201c = new byte[i11];
    }
}
