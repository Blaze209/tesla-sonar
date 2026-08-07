package t8;

import android.os.SystemClock;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f112876a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f112877b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f112878c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f112879d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f112880e = "time.android.com";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f112881f = 1000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static long f112882g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f112883h = -9223372036854775807L;

    public interface b {
        void a(IOException iOException);

        void d();
    }

    private static void h(byte b11, byte b12, int i11, long j11) throws IOException {
        if (b11 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b12 != 4 && b12 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b12));
        }
        if (i11 != 0 && i11 <= 15) {
            if (j11 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i11);
        }
    }

    public static long i() {
        long j11;
        synchronized (f112877b) {
            try {
                j11 = f112878c ? f112879d : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j11;
    }

    public static String j() {
        String str;
        synchronized (f112877b) {
            str = f112880e;
        }
        return str;
    }

    public static int k() {
        int i11;
        synchronized (f112877b) {
            i11 = f112881f;
        }
        return i11;
    }

    public static void l(Loader loader, b bVar) {
        if (m()) {
            if (bVar != null) {
                bVar.d();
            }
        } else {
            if (loader == null) {
                loader = new Loader("SntpClient");
            }
            loader.n(new d(), new C2409c(bVar), 1);
        }
    }

    public static boolean m() {
        boolean z11;
        synchronized (f112877b) {
            try {
                if (f112883h != -9223372036854775807L && f112882g != -9223372036854775807L) {
                    f112878c = f112878c && SystemClock.elapsedRealtime() - f112883h < f112882g;
                }
                z11 = f112878c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long n() {
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(k());
            InetAddress[] allByName = InetAddress.getAllByName(j());
            int length = allByName.length;
            SocketTimeoutException socketTimeoutException = null;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, allByName[i11], 123);
                bArr[0] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                q(bArr, 40, jCurrentTimeMillis);
                datagramSocket.send(datagramPacket);
                try {
                    datagramSocket.receive(new DatagramPacket(bArr, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j11 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
                    byte b11 = bArr[0];
                    int i13 = bArr[1] & 255;
                    long jP = p(bArr, 24);
                    long jP2 = p(bArr, 32);
                    long jP3 = p(bArr, 40);
                    h((byte) ((b11 >> 6) & 3), (byte) (b11 & 7), i13, jP3);
                    long j12 = (j11 + (((jP2 - jP) + (jP3 - j11)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j12;
                } catch (SocketTimeoutException e11) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException = e11;
                    } else {
                        socketTimeoutException.addSuppressed(e11);
                    }
                    int i14 = i12 + 1;
                    if (i12 >= 10) {
                        throw ((SocketTimeoutException) s7.a.f(socketTimeoutException));
                    }
                    i11++;
                    i12 = i14;
                }
            }
            throw ((SocketTimeoutException) s7.a.f(socketTimeoutException));
        } catch (Throwable th2) {
            try {
                datagramSocket.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    private static long o(byte[] bArr, int i11) {
        int i12 = bArr[i11];
        int i13 = bArr[i11 + 1];
        int i14 = bArr[i11 + 2];
        int i15 = bArr[i11 + 3];
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        if ((i15 & 128) == 128) {
            i15 = (i15 & 127) + 128;
        }
        return (((long) i12) << 24) + (((long) i13) << 16) + (((long) i14) << 8) + ((long) i15);
    }

    private static long p(byte[] bArr, int i11) {
        long jO = o(bArr, i11);
        long jO2 = o(bArr, i11 + 4);
        if (jO == 0 && jO2 == 0) {
            return 0L;
        }
        return ((jO - 2208988800L) * 1000) + ((jO2 * 1000) / 4294967296L);
    }

    private static void q(byte[] bArr, int i11, long j11) {
        if (j11 == 0) {
            Arrays.fill(bArr, i11, i11 + 8, (byte) 0);
            return;
        }
        long j12 = j11 / 1000;
        long j13 = j11 - (j12 * 1000);
        long j14 = j12 + 2208988800L;
        bArr[i11] = (byte) (j14 >> 24);
        bArr[i11 + 1] = (byte) (j14 >> 16);
        bArr[i11 + 2] = (byte) (j14 >> 8);
        bArr[i11 + 3] = (byte) j14;
        long j15 = (j13 * 4294967296L) / 1000;
        bArr[i11 + 4] = (byte) (j15 >> 24);
        bArr[i11 + 5] = (byte) (j15 >> 16);
        bArr[i11 + 6] = (byte) (j15 >> 8);
        bArr[i11 + 7] = (byte) (Math.random() * 255.0d);
    }

    private static final class d implements Loader.e {
        private d() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void a() {
            synchronized (c.f112876a) {
                synchronized (c.f112877b) {
                    if (c.f112878c) {
                        return;
                    }
                    long jN = c.n();
                    synchronized (c.f112877b) {
                        long unused = c.f112883h = SystemClock.elapsedRealtime();
                        long unused2 = c.f112879d = jN;
                        boolean unused3 = c.f112878c = true;
                    }
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void b() {
        }
    }

    /* JADX INFO: renamed from: t8.c$c, reason: collision with other inner class name */
    private static final class C2409c implements Loader.b<Loader.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f112884a;

        public C2409c(b bVar) {
            this.f112884a = bVar;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        public Loader.c p(Loader.e eVar, long j11, long j12, IOException iOException, int i11) {
            b bVar = this.f112884a;
            if (bVar != null) {
                bVar.a(iOException);
            }
            return Loader.f11137f;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        public void v(Loader.e eVar, long j11, long j12) {
            if (this.f112884a != null) {
                if (c.m()) {
                    this.f112884a.d();
                } else {
                    this.f112884a.a(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        public void s(Loader.e eVar, long j11, long j12, boolean z11) {
        }
    }
}
