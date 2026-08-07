package com.tradle.react;

import android.util.Base64;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes8.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DatagramSocket f57124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f57125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f57126c = false;

    public interface a {
        void a(RuntimeException runtimeException);

        void c(String str);

        void e(String str, String str2, int i11);
    }

    public c(DatagramSocket datagramSocket, a aVar) {
        this.f57124a = datagramSocket;
        this.f57125b = aVar;
    }

    public void a() {
        this.f57126c = false;
    }

    public boolean isRunning() {
        return this.f57126c;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f57126c = true;
        DatagramPacket datagramPacket = new DatagramPacket(new byte[65535], 65535);
        while (this.f57126c) {
            try {
                this.f57124a.receive(datagramPacket);
                InetAddress address = datagramPacket.getAddress();
                this.f57125b.e(Base64.encodeToString(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength(), 2), address.getHostAddress(), datagramPacket.getPort());
            } catch (IOException e11) {
                a aVar = this.f57125b;
                if (aVar != null) {
                    aVar.c(e11.getMessage());
                }
                this.f57126c = false;
            } catch (RuntimeException e12) {
                a aVar2 = this.f57125b;
                if (aVar2 != null) {
                    aVar2.a(e12);
                }
                this.f57126c = false;
            }
        }
    }
}
