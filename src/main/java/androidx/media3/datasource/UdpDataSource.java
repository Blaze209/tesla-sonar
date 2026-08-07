package androidx.media3.datasource;

import android.net.Uri;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import v7.j;

/* JADX INFO: loaded from: classes.dex */
public final class UdpDataSource extends v7.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f9138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f9139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final DatagramPacket f9140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Uri f9141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private DatagramSocket f9142i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MulticastSocket f9143j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InetAddress f9144k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f9145l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f9146m;

    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable th2, int i11) {
            super(th2, i11);
        }
    }

    public UdpDataSource() {
        this(2000);
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        this.f9141h = null;
        MulticastSocket multicastSocket = this.f9143j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) s7.a.f(this.f9144k));
            } catch (IOException unused) {
            }
            this.f9143j = null;
        }
        DatagramSocket datagramSocket = this.f9142i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f9142i = null;
        }
        this.f9144k = null;
        this.f9146m = 0;
        if (this.f9145l) {
            this.f9145l = false;
            p();
        }
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        return this.f9141h;
    }

    @Override // androidx.media3.datasource.a
    public long j(j jVar) throws UdpDataSourceException {
        Uri uri = jVar.f118101a;
        this.f9141h = uri;
        String str = (String) s7.a.f(uri.getHost());
        int port = this.f9141h.getPort();
        q(jVar);
        try {
            this.f9144k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f9144k, port);
            if (this.f9144k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f9143j = multicastSocket;
                multicastSocket.joinGroup(this.f9144k);
                this.f9142i = this.f9143j;
            } else {
                this.f9142i = new DatagramSocket(inetSocketAddress);
            }
            this.f9142i.setSoTimeout(this.f9138e);
            this.f9145l = true;
            r(jVar);
            return -1L;
        } catch (IOException e11) {
            throw new UdpDataSourceException(e11, 2001);
        } catch (SecurityException e12) {
            throw new UdpDataSourceException(e12, 2006);
        }
    }

    @Override // p7.j
    public int read(byte[] bArr, int i11, int i12) throws UdpDataSourceException {
        if (i12 == 0) {
            return 0;
        }
        if (this.f9146m == 0) {
            try {
                ((DatagramSocket) s7.a.f(this.f9142i)).receive(this.f9140g);
                int length = this.f9140g.getLength();
                this.f9146m = length;
                o(length);
            } catch (SocketTimeoutException e11) {
                throw new UdpDataSourceException(e11, 2002);
            } catch (IOException e12) {
                throw new UdpDataSourceException(e12, 2001);
            }
        }
        int length2 = this.f9140g.getLength();
        int i13 = this.f9146m;
        int iMin = Math.min(i13, i12);
        System.arraycopy(this.f9139f, length2 - i13, bArr, i11, iMin);
        this.f9146m -= iMin;
        return iMin;
    }

    public UdpDataSource(int i11) {
        this(i11, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED);
    }

    public UdpDataSource(int i11, int i12) {
        super(true);
        this.f9138e = i12;
        byte[] bArr = new byte[i11];
        this.f9139f = bArr;
        this.f9140g = new DatagramPacket(bArr, 0, i11);
    }
}
