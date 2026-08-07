package com.tradle.react;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;

/* JADX INFO: loaded from: classes8.dex */
public class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DatagramSocket f57127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<a> f57128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SocketAddress f57129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f57130d;

    public interface a {
        void b(d dVar, RuntimeException runtimeException);

        void d(d dVar, String str);

        void f(d dVar);
    }

    public d(DatagramSocket datagramSocket, a aVar, SocketAddress socketAddress, byte[] bArr) {
        this.f57127a = datagramSocket;
        this.f57128b = new WeakReference<>(aVar);
        this.f57129c = socketAddress;
        this.f57130d = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar = this.f57128b.get();
        try {
            DatagramSocket datagramSocket = this.f57127a;
            if (datagramSocket == null) {
                return;
            }
            byte[] bArr = this.f57130d;
            datagramSocket.send(new DatagramPacket(bArr, bArr.length, this.f57129c));
            if (aVar != null) {
                aVar.f(this);
            }
        } catch (IOException e11) {
            if (aVar != null) {
                aVar.d(this, e11.getMessage());
            }
        } catch (RuntimeException e12) {
            if (aVar != null) {
                aVar.b(this, e12);
            }
        }
    }
}
