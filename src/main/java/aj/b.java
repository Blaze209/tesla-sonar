package aj;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
class b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f1168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Charset f1169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f1170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1172e;

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
                return new String(((ByteArrayOutputStream) this).buf, 0, i11, b.this.f1169b.name());
            } catch (UnsupportedEncodingException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, PKIFailureInfo.certRevoked, charset);
    }

    private void n() throws IOException {
        InputStream inputStream = this.f1168a;
        byte[] bArr = this.f1170c;
        int i11 = inputStream.read(bArr, 0, bArr.length);
        if (i11 == -1) {
            throw new EOFException();
        }
        this.f1171d = 0;
        this.f1172e = i11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f1168a) {
            try {
                if (this.f1170c != null) {
                    this.f1170c = null;
                    this.f1168a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean o() {
        return this.f1172e == -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public String p() {
        int i11;
        byte[] bArr;
        int i12;
        synchronized (this.f1168a) {
            try {
                if (this.f1170c == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f1171d >= this.f1172e) {
                    n();
                }
                for (int i13 = this.f1171d; i13 != this.f1172e; i13++) {
                    byte[] bArr2 = this.f1170c;
                    if (bArr2[i13] == 10) {
                        int i14 = this.f1171d;
                        if (i13 != i14) {
                            i12 = i13 - 1;
                            if (bArr2[i12] != 13) {
                                i12 = i13;
                            }
                        } else {
                            i12 = i13;
                        }
                        String str = new String(bArr2, i14, i12 - i14, this.f1169b.name());
                        this.f1171d = i13 + 1;
                        return str;
                    }
                }
                a aVar = new a((this.f1172e - this.f1171d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f1170c;
                    int i15 = this.f1171d;
                    aVar.write(bArr3, i15, this.f1172e - i15);
                    this.f1172e = -1;
                    n();
                    i11 = this.f1171d;
                    while (i11 != this.f1172e) {
                        bArr = this.f1170c;
                        if (bArr[i11] == 10) {
                            break loop1;
                        }
                        i11++;
                    }
                }
                int i16 = this.f1171d;
                if (i11 != i16) {
                    aVar.write(bArr, i16, i11 - i16);
                }
                this.f1171d = i11 + 1;
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
        if (!charset.equals(c.f1174a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f1168a = inputStream;
        this.f1169b = charset;
        this.f1170c = new byte[i11];
    }
}
