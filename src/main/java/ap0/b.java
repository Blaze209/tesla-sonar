package ap0;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public class b extends InputStream {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f14831f = Logger.getLogger("net.sf.scuba.tlv");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f14832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DataInputStream f14833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f14835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f14836e;

    public b(InputStream inputStream) {
        this.f14834c = 0;
        try {
            if ((inputStream instanceof BufferedInputStream) || (inputStream instanceof ByteArrayInputStream)) {
                this.f14834c = inputStream.available();
            }
        } catch (IOException e11) {
            f14831f.log(Level.WARNING, "Exception reading from stream", (Throwable) e11);
        }
        this.f14832a = inputStream;
        this.f14833b = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.f14835d = new a();
        this.f14836e = null;
    }

    private long t() {
        if (this.f14835d.f() || this.f14835d.e()) {
            return 0L;
        }
        return skip(this.f14835d.d());
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f14833b.available();
    }

    public int c() throws IOException {
        if (!this.f14835d.e()) {
            throw new IllegalStateException("Not at start of length");
        }
        int unsignedByte = this.f14833b.readUnsignedByte();
        int i11 = 1;
        if ((unsignedByte & 128) != 0) {
            int i12 = unsignedByte & 127;
            int unsignedByte2 = 0;
            int i13 = 1;
            for (int i14 = 0; i14 < i12; i14++) {
                i13++;
                unsignedByte2 = (unsignedByte2 << 8) | this.f14833b.readUnsignedByte();
            }
            unsignedByte = unsignedByte2;
            i11 = i13;
        }
        this.f14835d.h(unsignedByte, i11);
        return unsignedByte;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14833b.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i11) {
        this.f14833b.mark(i11);
        this.f14836e = new a(this.f14835d);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f14833b.markSupported();
    }

    public int n() throws IOException {
        if (!this.f14835d.f() && !this.f14835d.g()) {
            throw new IllegalStateException("Not at start of tag");
        }
        int unsignedByte = this.f14833b.readUnsignedByte();
        int i11 = 1;
        while (true) {
            if (unsignedByte != 0 && unsignedByte != 255) {
                break;
            }
            unsignedByte = this.f14833b.readUnsignedByte();
            i11++;
        }
        if ((unsignedByte & 31) == 31) {
            int unsignedByte2 = this.f14833b.readUnsignedByte();
            while (true) {
                i11++;
                if ((unsignedByte2 & 128) != 128) {
                    break;
                }
                unsignedByte = (unsignedByte << 8) | (unsignedByte2 & 127);
                unsignedByte2 = this.f14833b.readUnsignedByte();
            }
            unsignedByte = (unsignedByte << 8) | (unsignedByte2 & 127);
        }
        this.f14835d.i(unsignedByte, i11);
        return unsignedByte;
    }

    public byte[] o() throws IOException {
        if (!this.f14835d.g()) {
            throw new IllegalStateException("Not yet processing value!");
        }
        int iB = this.f14835d.b();
        byte[] bArr = new byte[iB];
        this.f14833b.readFully(bArr);
        this.f14835d.j(iB);
        return bArr;
    }

    public void p(int i11) throws IOException {
        while (true) {
            if (!this.f14835d.f()) {
                if (this.f14835d.e()) {
                    c();
                    if (e.f(this.f14835d.c())) {
                        t();
                    }
                } else if (e.f(this.f14835d.c())) {
                    t();
                }
            }
            int iN = n();
            if (iN == i11) {
                return;
            }
            if (e.f(iN)) {
                if (((int) t()) < c()) {
                    return;
                }
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i11 = this.f14833b.read();
        if (i11 < 0) {
            return -1;
        }
        this.f14835d.j(1);
        return i11;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        if (!markSupported()) {
            throw new IOException("mark/reset not supported");
        }
        this.f14833b.reset();
        this.f14835d = this.f14836e;
        this.f14836e = null;
    }

    @Override // java.io.InputStream
    public long skip(long j11) throws IOException {
        if (j11 <= 0) {
            return 0L;
        }
        long jSkip = this.f14833b.skip(j11);
        this.f14835d.j((int) jSkip);
        return jSkip;
    }

    public String toString() {
        return this.f14835d.toString();
    }
}
