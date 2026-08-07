package fv;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
class h implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f66631g = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RandomAccessFile f66632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f66633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f66634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f66635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f66636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f66637f = new byte[16];

    class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f66638a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f66639b;

        a(StringBuilder sb2) {
            this.f66639b = sb2;
        }

        @Override // fv.h.d
        public void a(InputStream inputStream, int i11) {
            if (this.f66638a) {
                this.f66638a = false;
            } else {
                this.f66639b.append(", ");
            }
            this.f66639b.append(i11);
        }
    }

    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final b f66641c = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f66642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f66643b;

        b(int i11, int i12) {
            this.f66642a = i11;
            this.f66643b = i12;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f66642a + ", length = " + this.f66643b + "]";
        }
    }

    private final class c extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f66644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f66645b;

        /* synthetic */ c(h hVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) throws IOException {
            h.b0(bArr, "buffer");
            if ((i11 | i12) < 0 || i12 > bArr.length - i11) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i13 = this.f66645b;
            if (i13 <= 0) {
                return -1;
            }
            if (i12 > i13) {
                i12 = i13;
            }
            h.this.t0(this.f66644a, bArr, i11, i12);
            this.f66644a = h.this.z0(this.f66644a + i12);
            this.f66645b -= i12;
            return i12;
        }

        private c(b bVar) {
            this.f66644a = h.this.z0(bVar.f66642a + 4);
            this.f66645b = bVar.f66643b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f66645b == 0) {
                return -1;
            }
            h.this.f66632a.seek(this.f66644a);
            int i11 = h.this.f66632a.read();
            this.f66644a = h.this.z0(this.f66644a + 1);
            this.f66645b--;
            return i11;
        }
    }

    public interface d {
        void a(InputStream inputStream, int i11);
    }

    public h(File file) throws IOException {
        if (!file.exists()) {
            J(file);
        }
        this.f66632a = c0(file);
        k0();
    }

    private void D0(int i11, int i12, int i13, int i14) throws IOException {
        H0(this.f66637f, i11, i12, i13, i14);
        this.f66632a.seek(0L);
        this.f66632a.write(this.f66637f);
    }

    private static void G0(byte[] bArr, int i11, int i12) {
        bArr[i11] = (byte) (i12 >> 24);
        bArr[i11 + 1] = (byte) (i12 >> 16);
        bArr[i11 + 2] = (byte) (i12 >> 8);
        bArr[i11 + 3] = (byte) i12;
    }

    private void H(int i11) throws IOException {
        int i12 = i11 + 4;
        int iR0 = r0();
        if (iR0 >= i12) {
            return;
        }
        int i13 = this.f66633b;
        do {
            iR0 += i13;
            i13 <<= 1;
        } while (iR0 < i12);
        w0(i13);
        b bVar = this.f66636e;
        int iZ0 = z0(bVar.f66642a + 4 + bVar.f66643b);
        if (iZ0 < this.f66635d.f66642a) {
            FileChannel channel = this.f66632a.getChannel();
            channel.position(this.f66633b);
            long j11 = iZ0 - 4;
            if (channel.transferTo(16L, j11, channel) != j11) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i14 = this.f66636e.f66642a;
        int i15 = this.f66635d.f66642a;
        if (i14 < i15) {
            int i16 = (this.f66633b + i14) - 16;
            D0(i13, this.f66634c, i15, i16);
            this.f66636e = new b(i16, this.f66636e.f66643b);
        } else {
            D0(i13, this.f66634c, i15, i14);
        }
        this.f66633b = i13;
    }

    private static void H0(byte[] bArr, int... iArr) {
        int i11 = 0;
        for (int i12 : iArr) {
            G0(bArr, i11, i12);
            i11 += 4;
        }
    }

    private static void J(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileC0 = c0(file2);
        try {
            randomAccessFileC0.setLength(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
            randomAccessFileC0.seek(0L);
            byte[] bArr = new byte[16];
            H0(bArr, 4096, 0, 0, 0);
            randomAccessFileC0.write(bArr);
            randomAccessFileC0.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th2) {
            randomAccessFileC0.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T b0(T t11, String str) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile c0(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private b e0(int i11) throws IOException {
        if (i11 == 0) {
            return b.f66641c;
        }
        this.f66632a.seek(i11);
        return new b(i11, this.f66632a.readInt());
    }

    private void k0() throws IOException {
        this.f66632a.seek(0L);
        this.f66632a.readFully(this.f66637f);
        int iN0 = n0(this.f66637f, 0);
        this.f66633b = iN0;
        if (iN0 <= this.f66632a.length()) {
            this.f66634c = n0(this.f66637f, 4);
            int iN1 = n0(this.f66637f, 8);
            int iN2 = n0(this.f66637f, 12);
            this.f66635d = e0(iN1);
            this.f66636e = e0(iN2);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f66633b + ", Actual length: " + this.f66632a.length());
    }

    private static int n0(byte[] bArr, int i11) {
        return ((bArr[i11] & 255) << 24) + ((bArr[i11 + 1] & 255) << 16) + ((bArr[i11 + 2] & 255) << 8) + (bArr[i11 + 3] & 255);
    }

    private int r0() {
        return this.f66633b - y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(int i11, byte[] bArr, int i12, int i13) throws IOException {
        int iZ0 = z0(i11);
        int i14 = iZ0 + i13;
        int i15 = this.f66633b;
        if (i14 <= i15) {
            this.f66632a.seek(iZ0);
            this.f66632a.readFully(bArr, i12, i13);
            return;
        }
        int i16 = i15 - iZ0;
        this.f66632a.seek(iZ0);
        this.f66632a.readFully(bArr, i12, i16);
        this.f66632a.seek(16L);
        this.f66632a.readFully(bArr, i12 + i16, i13 - i16);
    }

    private void u0(int i11, byte[] bArr, int i12, int i13) throws IOException {
        int iZ0 = z0(i11);
        int i14 = iZ0 + i13;
        int i15 = this.f66633b;
        if (i14 <= i15) {
            this.f66632a.seek(iZ0);
            this.f66632a.write(bArr, i12, i13);
            return;
        }
        int i16 = i15 - iZ0;
        this.f66632a.seek(iZ0);
        this.f66632a.write(bArr, i12, i16);
        this.f66632a.seek(16L);
        this.f66632a.write(bArr, i12 + i16, i13 - i16);
    }

    private void w0(int i11) throws IOException {
        this.f66632a.setLength(i11);
        this.f66632a.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int z0(int i11) {
        int i12 = this.f66633b;
        return i11 < i12 ? i11 : (i11 + 16) - i12;
    }

    public synchronized void B(byte[] bArr, int i11, int i12) {
        int iZ0;
        try {
            b0(bArr, "buffer");
            if ((i11 | i12) < 0 || i12 > bArr.length - i11) {
                throw new IndexOutOfBoundsException();
            }
            H(i12);
            boolean zT = T();
            if (zT) {
                iZ0 = 16;
            } else {
                b bVar = this.f66636e;
                iZ0 = z0(bVar.f66642a + 4 + bVar.f66643b);
            }
            b bVar2 = new b(iZ0, i12);
            G0(this.f66637f, 0, i12);
            u0(bVar2.f66642a, this.f66637f, 0, 4);
            u0(bVar2.f66642a + 4, bArr, i11, i12);
            D0(this.f66633b, this.f66634c + 1, zT ? bVar2.f66642a : this.f66635d.f66642a, bVar2.f66642a);
            this.f66636e = bVar2;
            this.f66634c++;
            if (zT) {
                this.f66635d = bVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void C() {
        try {
            D0(4096, 0, 0, 0);
            this.f66634c = 0;
            b bVar = b.f66641c;
            this.f66635d = bVar;
            this.f66636e = bVar;
            if (this.f66633b > 4096) {
                w0(4096);
            }
            this.f66633b = 4096;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void I(d dVar) {
        int iZ0 = this.f66635d.f66642a;
        for (int i11 = 0; i11 < this.f66634c; i11++) {
            b bVarE0 = e0(iZ0);
            dVar.a(new c(this, bVarE0, null), bVarE0.f66643b);
            iZ0 = z0(bVarE0.f66642a + 4 + bVarE0.f66643b);
        }
    }

    public synchronized boolean T() {
        return this.f66634c == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f66632a.close();
    }

    public synchronized void s0() {
        try {
            if (T()) {
                throw new NoSuchElementException();
            }
            if (this.f66634c == 1) {
                C();
            } else {
                b bVar = this.f66635d;
                int iZ0 = z0(bVar.f66642a + 4 + bVar.f66643b);
                t0(iZ0, this.f66637f, 0, 4);
                int iN0 = n0(this.f66637f, 0);
                D0(this.f66633b, this.f66634c - 1, iZ0, this.f66636e.f66642a);
                this.f66634c--;
                this.f66635d = new b(iZ0, iN0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void t(byte[] bArr) {
        B(bArr, 0, bArr.length);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f66633b);
        sb2.append(", size=");
        sb2.append(this.f66634c);
        sb2.append(", first=");
        sb2.append(this.f66635d);
        sb2.append(", last=");
        sb2.append(this.f66636e);
        sb2.append(", element lengths=[");
        try {
            I(new a(sb2));
        } catch (IOException e11) {
            f66631g.log(Level.WARNING, "read error", (Throwable) e11);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public int y0() {
        if (this.f66634c == 0) {
            return 16;
        }
        b bVar = this.f66636e;
        int i11 = bVar.f66642a;
        int i12 = this.f66635d.f66642a;
        return i11 >= i12 ? (i11 - i12) + 4 + bVar.f66643b + 16 : (((i11 + 4) + bVar.f66643b) + this.f66633b) - i12;
    }
}
