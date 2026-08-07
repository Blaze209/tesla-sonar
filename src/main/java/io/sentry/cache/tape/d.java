package io.sentry.cache.tape;

import ch.qos.logback.core.CoreConstants;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements Closeable, Iterable<byte[]> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f80388m = new byte[4096];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    RandomAccessFile f80389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final File f80390b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f80392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f80393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    b f80394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f80395g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f80398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f80399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f80400l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f80391c = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f80396h = new byte[32];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f80397i = 0;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final File f80401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f80402b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f80403c = -1;

        public a(File file) {
            if (file == null) {
                throw new NullPointerException("file == null");
            }
            this.f80401a = file;
        }

        public d a() throws IOException {
            RandomAccessFile randomAccessFileC = d.C(this.f80401a);
            try {
                return new d(this.f80401a, randomAccessFileC, this.f80402b, this.f80403c);
            } catch (Throwable th2) {
                randomAccessFileC.close();
                throw th2;
            }
        }

        public a b(int i11) {
            this.f80403c = i11;
            return this;
        }
    }

    static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final b f80404c = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f80405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f80406b;

        b(long j11, int i11) {
            this.f80405a = j11;
            this.f80406b = i11;
        }

        public String toString() {
            return b.class.getSimpleName() + "[position=" + this.f80405a + ", length=" + this.f80406b + "]";
        }
    }

    private final class c implements Iterator<byte[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f80407a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f80408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f80409c;

        c() {
            this.f80408b = d.this.f80394f.f80405a;
            this.f80409c = d.this.f80397i;
        }

        private void a() {
            if (d.this.f80397i != this.f80409c) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public byte[] next() {
            if (d.this.f80400l) {
                throw new IllegalStateException("closed");
            }
            a();
            if (d.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            int i11 = this.f80407a;
            d dVar = d.this;
            if (i11 >= dVar.f80393e) {
                throw new NoSuchElementException();
            }
            try {
                try {
                    b bVarJ = dVar.J(this.f80408b);
                    byte[] bArr = new byte[bVarJ.f80406b];
                    long jG0 = d.this.G0(bVarJ.f80405a + 4);
                    this.f80408b = jG0;
                    if (!d.this.u0(jG0, bArr, 0, bVarJ.f80406b)) {
                        this.f80407a = d.this.f80393e;
                        return d.f80388m;
                    }
                    this.f80408b = d.this.G0(bVarJ.f80405a + 4 + ((long) bVarJ.f80406b));
                    this.f80407a++;
                    return bArr;
                } catch (IOException e11) {
                    throw ((Error) d.B(e11));
                }
            } catch (IOException e12) {
                throw ((Error) d.B(e12));
            } catch (OutOfMemoryError unused) {
                d.this.s0();
                this.f80407a = d.this.f80393e;
                return d.f80388m;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (d.this.f80400l) {
                throw new IllegalStateException("closed");
            }
            a();
            return this.f80407a != d.this.f80393e;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            if (d.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.f80407a != 1) {
                throw new UnsupportedOperationException("Removal is only permitted from the head.");
            }
            try {
                d.this.n0();
                this.f80409c = d.this.f80397i;
                this.f80407a--;
            } catch (IOException e11) {
                throw ((Error) d.B(e11));
            }
        }
    }

    d(File file, RandomAccessFile randomAccessFile, boolean z11, int i11) throws IOException {
        this.f80390b = file;
        this.f80389a = randomAccessFile;
        this.f80398j = z11;
        this.f80399k = i11;
        T();
    }

    static RandomAccessFile C(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFileI = I(file2);
            try {
                randomAccessFileI.setLength(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
                randomAccessFileI.seek(0L);
                randomAccessFileI.writeInt(-2147483647);
                randomAccessFileI.writeLong(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
                randomAccessFileI.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFileI.close();
                throw th2;
            }
        }
        return I(file);
    }

    private long D0() {
        if (this.f80393e == 0) {
            return 32L;
        }
        b bVar = this.f80395g;
        long j11 = bVar.f80405a;
        long j12 = this.f80394f.f80405a;
        return j11 >= j12 ? (j11 - j12) + 4 + ((long) bVar.f80406b) + 32 : (((j11 + 4) + ((long) bVar.f80406b)) + this.f80392d) - j12;
    }

    private void H0(long j11, int i11, long j12, long j13) throws IOException {
        this.f80389a.seek(0L);
        J0(this.f80396h, 0, -2147483647);
        K0(this.f80396h, 4, j11);
        J0(this.f80396h, 12, i11);
        K0(this.f80396h, 16, j12);
        K0(this.f80396h, 24, j13);
        this.f80389a.write(this.f80396h, 0, 32);
    }

    private static RandomAccessFile I(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private static void J0(byte[] bArr, int i11, int i12) {
        bArr[i11] = (byte) (i12 >> 24);
        bArr[i11 + 1] = (byte) (i12 >> 16);
        bArr[i11 + 2] = (byte) (i12 >> 8);
        bArr[i11 + 3] = (byte) i12;
    }

    private static void K0(byte[] bArr, int i11, long j11) {
        bArr[i11] = (byte) (j11 >> 56);
        bArr[i11 + 1] = (byte) (j11 >> 48);
        bArr[i11 + 2] = (byte) (j11 >> 40);
        bArr[i11 + 3] = (byte) (j11 >> 32);
        bArr[i11 + 4] = (byte) (j11 >> 24);
        bArr[i11 + 5] = (byte) (j11 >> 16);
        bArr[i11 + 6] = (byte) (j11 >> 8);
        bArr[i11 + 7] = (byte) j11;
    }

    private void T() throws IOException {
        this.f80389a.seek(0L);
        this.f80389a.readFully(this.f80396h);
        this.f80392d = e0(this.f80396h, 4);
        this.f80393e = c0(this.f80396h, 12);
        long jE0 = e0(this.f80396h, 16);
        long jE1 = e0(this.f80396h, 24);
        if (this.f80392d > this.f80389a.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f80392d + ", Actual length: " + this.f80389a.length());
        }
        if (this.f80392d > 32) {
            this.f80394f = J(jE0);
            this.f80395g = J(jE1);
        } else {
            throw new IOException("File is corrupt; length stored in header (" + this.f80392d + ") is invalid.");
        }
    }

    private static int c0(byte[] bArr, int i11) {
        return ((bArr[i11] & 255) << 24) + ((bArr[i11 + 1] & 255) << 16) + ((bArr[i11 + 2] & 255) << 8) + (bArr[i11 + 3] & 255);
    }

    private static long e0(byte[] bArr, int i11) {
        return ((((long) bArr[i11]) & 255) << 56) + ((((long) bArr[i11 + 1]) & 255) << 48) + ((((long) bArr[i11 + 2]) & 255) << 40) + ((((long) bArr[i11 + 3]) & 255) << 32) + ((((long) bArr[i11 + 4]) & 255) << 24) + ((((long) bArr[i11 + 5]) & 255) << 16) + ((((long) bArr[i11 + 6]) & 255) << 8) + (((long) bArr[i11 + 7]) & 255);
    }

    private long k0() {
        return this.f80392d - D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0() throws IOException {
        this.f80389a.close();
        this.f80390b.delete();
        this.f80389a = C(this.f80390b);
        T();
    }

    private void t(long j11) throws IOException {
        long j12;
        long j13;
        long j14 = j11 + 4;
        long jK0 = k0();
        if (jK0 >= j14) {
            return;
        }
        long j15 = this.f80392d;
        do {
            jK0 += j15;
            j15 <<= 1;
        } while (jK0 < j14);
        z0(j15);
        b bVar = this.f80395g;
        long jG0 = G0(bVar.f80405a + 4 + ((long) bVar.f80406b));
        if (jG0 <= this.f80394f.f80405a) {
            FileChannel channel = this.f80389a.getChannel();
            channel.position(this.f80392d);
            j12 = jG0 - 32;
            if (channel.transferTo(32L, j12, channel) != j12) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        } else {
            j12 = 0;
        }
        long j16 = this.f80395g.f80405a;
        long j17 = this.f80394f.f80405a;
        if (j16 < j17) {
            long j18 = (this.f80392d + j16) - 32;
            H0(j15, this.f80393e, j17, j18);
            this.f80395g = new b(j18, this.f80395g.f80406b);
            j13 = j15;
        } else {
            H0(j15, this.f80393e, j17, j16);
            j13 = j15;
        }
        this.f80392d = j13;
        if (this.f80398j) {
            t0(32L, j12);
        }
    }

    private void t0(long j11, long j12) throws IOException {
        long j13 = j11;
        while (j12 > 0) {
            byte[] bArr = f80388m;
            int iMin = (int) Math.min(j12, bArr.length);
            y0(j13, bArr, 0, iMin);
            long j14 = iMin;
            j12 -= j14;
            j13 += j14;
        }
    }

    private void y0(long j11, byte[] bArr, int i11, int i12) throws IOException {
        long jG0 = G0(j11);
        long j12 = ((long) i12) + jG0;
        long j13 = this.f80392d;
        if (j12 <= j13) {
            this.f80389a.seek(jG0);
            this.f80389a.write(bArr, i11, i12);
            return;
        }
        int i13 = (int) (j13 - jG0);
        this.f80389a.seek(jG0);
        this.f80389a.write(bArr, i11, i13);
        this.f80389a.seek(32L);
        this.f80389a.write(bArr, i11 + i13, i12 - i13);
    }

    private void z0(long j11) throws IOException {
        this.f80389a.setLength(j11);
        this.f80389a.getChannel().force(true);
    }

    long G0(long j11) {
        long j12 = this.f80392d;
        return j11 < j12 ? j11 : (j11 + 32) - j12;
    }

    public boolean H() {
        return this.f80399k != -1 && size() == this.f80399k;
    }

    b J(long j11) {
        if (j11 == 0) {
            return b.f80404c;
        }
        return !u0(j11, this.f80396h, 0, 4) ? b.f80404c : new b(j11, c0(this.f80396h, 0));
    }

    public void clear() throws IOException {
        if (this.f80400l) {
            throw new IllegalStateException("closed");
        }
        H0(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, 0, 0L, 0L);
        if (this.f80398j) {
            this.f80389a.seek(32L);
            this.f80389a.write(f80388m, 0, 4064);
        }
        this.f80393e = 0;
        b bVar = b.f80404c;
        this.f80394f = bVar;
        this.f80395g = bVar;
        if (this.f80392d > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
            z0(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
        }
        this.f80392d = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
        this.f80397i++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f80400l = true;
        this.f80389a.close();
    }

    public boolean isEmpty() {
        return this.f80393e == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<byte[]> iterator() {
        return new c();
    }

    public void n0() throws IOException {
        r0(1);
    }

    public void p(byte[] bArr, int i11, int i12) throws IOException {
        long jG0;
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        if ((i11 | i12) < 0 || i12 > bArr.length - i11) {
            throw new IndexOutOfBoundsException();
        }
        if (this.f80400l) {
            throw new IllegalStateException("closed");
        }
        if (H()) {
            n0();
        }
        t(i12);
        boolean zIsEmpty = isEmpty();
        if (zIsEmpty) {
            jG0 = 32;
        } else {
            b bVar = this.f80395g;
            jG0 = G0(bVar.f80405a + 4 + ((long) bVar.f80406b));
        }
        b bVar2 = new b(jG0, i12);
        J0(this.f80396h, 0, i12);
        y0(bVar2.f80405a, this.f80396h, 0, 4);
        y0(bVar2.f80405a + 4, bArr, i11, i12);
        H0(this.f80392d, this.f80393e + 1, zIsEmpty ? bVar2.f80405a : this.f80394f.f80405a, bVar2.f80405a);
        this.f80395g = bVar2;
        this.f80393e++;
        this.f80397i++;
        if (zIsEmpty) {
            this.f80394f = bVar2;
        }
    }

    public void r0(int i11) throws IOException {
        if (i11 < 0) {
            throw new IllegalArgumentException("Cannot remove negative (" + i11 + ") number of elements.");
        }
        if (i11 == 0) {
            return;
        }
        if (i11 == this.f80393e) {
            clear();
            return;
        }
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (i11 > this.f80393e) {
            throw new IllegalArgumentException("Cannot remove more elements (" + i11 + ") than present in queue (" + this.f80393e + ").");
        }
        b bVar = this.f80394f;
        long j11 = bVar.f80405a;
        int iC0 = bVar.f80406b;
        long j12 = 0;
        int i12 = 0;
        long j13 = j11;
        while (i12 < i11) {
            j12 += (long) (iC0 + 4);
            long jG0 = G0(j13 + 4 + ((long) iC0));
            if (!u0(jG0, this.f80396h, 0, 4)) {
                return;
            }
            iC0 = c0(this.f80396h, 0);
            i12++;
            j13 = jG0;
        }
        H0(this.f80392d, this.f80393e - i11, j13, this.f80395g.f80405a);
        this.f80393e -= i11;
        this.f80397i++;
        this.f80394f = new b(j13, iC0);
        if (this.f80398j) {
            t0(j11, j12);
        }
    }

    public int size() {
        return this.f80393e;
    }

    public String toString() {
        return "QueueFile{file=" + this.f80390b + ", zero=" + this.f80398j + ", length=" + this.f80392d + ", size=" + this.f80393e + ", first=" + this.f80394f + ", last=" + this.f80395g + CoreConstants.CURLY_RIGHT;
    }

    boolean u0(long j11, byte[] bArr, int i11, int i12) throws IOException {
        try {
            long jG0 = G0(j11);
            long j12 = ((long) i12) + jG0;
            long j13 = this.f80392d;
            if (j12 <= j13) {
                this.f80389a.seek(jG0);
                this.f80389a.readFully(bArr, i11, i12);
                return true;
            }
            int i13 = (int) (j13 - jG0);
            this.f80389a.seek(jG0);
            this.f80389a.readFully(bArr, i11, i13);
            this.f80389a.seek(32L);
            this.f80389a.readFully(bArr, i11 + i13, i12 - i13);
            return true;
        } catch (EOFException unused) {
            s0();
            return false;
        } catch (IOException e11) {
            throw e11;
        } catch (Throwable unused2) {
            s0();
            return false;
        }
    }

    static <T extends Throwable> T B(Throwable th2) throws Throwable {
        throw th2;
    }
}
