package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import ss.e;
import ss.l;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class UdpDataSource extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f41067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f41068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final DatagramPacket f41069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Uri f41070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private DatagramSocket f41071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MulticastSocket f41072j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InetAddress f41073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f41074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f41075m;

    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable th2, int i11) {
            super(th2, i11);
        }
    }

    public UdpDataSource() {
        this(2000);
    }

    @Override // ss.i
    public void close() {
        this.f41070h = null;
        MulticastSocket multicastSocket = this.f41072j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) ts.a.e(this.f41073k));
            } catch (IOException unused) {
            }
            this.f41072j = null;
        }
        DatagramSocket datagramSocket = this.f41071i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f41071i = null;
        }
        this.f41073k = null;
        this.f41075m = 0;
        if (this.f41074l) {
            this.f41074l = false;
            o();
        }
    }

    @Override // ss.i
    public Uri getUri() {
        return this.f41070h;
    }

    @Override // ss.i
    public long j(l lVar) throws UdpDataSourceException {
        Uri uri = lVar.f111661a;
        this.f41070h = uri;
        String str = (String) ts.a.e(uri.getHost());
        int port = this.f41070h.getPort();
        p(lVar);
        try {
            this.f41073k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f41073k, port);
            if (this.f41073k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f41072j = multicastSocket;
                multicastSocket.joinGroup(this.f41073k);
                this.f41071i = this.f41072j;
            } else {
                this.f41071i = new DatagramSocket(inetSocketAddress);
            }
            this.f41071i.setSoTimeout(this.f41067e);
            this.f41074l = true;
            q(lVar);
            return -1L;
        } catch (IOException e11) {
            throw new UdpDataSourceException(e11, 2001);
        } catch (SecurityException e12) {
            throw new UdpDataSourceException(e12, 2006);
        }
    }

    @Override // ss.g
    public int read(byte[] bArr, int i11, int i12) throws UdpDataSourceException {
        if (i12 == 0) {
            return 0;
        }
        if (this.f41075m == 0) {
            try {
                ((DatagramSocket) ts.a.e(this.f41071i)).receive(this.f41069g);
                int length = this.f41069g.getLength();
                this.f41075m = length;
                n(length);
            } catch (SocketTimeoutException e11) {
                throw new UdpDataSourceException(e11, 2002);
            } catch (IOException e12) {
                throw new UdpDataSourceException(e12, 2001);
            }
        }
        int length2 = this.f41069g.getLength();
        int i13 = this.f41075m;
        int iMin = Math.min(i13, i12);
        System.arraycopy(this.f41068f, length2 - i13, bArr, i11, iMin);
        this.f41075m -= iMin;
        return iMin;
    }

    public UdpDataSource(int i11) {
        this(i11, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED);
    }

    public UdpDataSource(int i11, int i12) {
        super(true);
        this.f41067e = i12;
        byte[] bArr = new byte[i11];
        this.f41068f = bArr;
        this.f41069g = new DatagramPacket(bArr, 0, i11);
    }
}
