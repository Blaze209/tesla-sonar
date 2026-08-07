package com.tradle.react;

import android.util.Base64;
import com.facebook.react.bridge.Callback;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements c.a, d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f57131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f57132b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f57134d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private DatagramSocket f57136f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ExecutorService f57133c = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f57137g = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<d, Callback> f57135e = new ConcurrentHashMap();

    public interface a {
        void didReceiveData(e eVar, String str, String str2, int i11);

        void didReceiveError(e eVar, String str);
    }

    public interface b {
        void didReceiveException(RuntimeException runtimeException);
    }

    public e(a aVar, b bVar) {
        this.f57131a = aVar;
        this.f57132b = bVar;
    }

    @Override // com.tradle.react.c.a
    public void a(RuntimeException runtimeException) {
        this.f57132b.didReceiveException(runtimeException);
    }

    @Override // com.tradle.react.d.a
    public void b(d dVar, RuntimeException runtimeException) {
        this.f57132b.didReceiveException(runtimeException);
        synchronized (this.f57135e) {
            this.f57135e.remove(dVar);
        }
    }

    @Override // com.tradle.react.c.a
    public void c(String str) {
        this.f57131a.didReceiveError(this, str);
    }

    @Override // com.tradle.react.d.a
    public void d(d dVar, String str) {
        Callback callback;
        synchronized (this.f57135e) {
            callback = this.f57135e.get(dVar);
            this.f57135e.remove(dVar);
        }
        if (callback != null) {
            callback.invoke(com.tradle.react.b.a(com.tradle.react.a.sendError.name(), str));
        }
    }

    @Override // com.tradle.react.c.a
    public void e(String str, String str2, int i11) {
        this.f57131a.didReceiveData(this, str, str2, i11);
    }

    @Override // com.tradle.react.d.a
    public void f(d dVar) {
        Callback callback;
        synchronized (this.f57135e) {
            callback = this.f57135e.get(dVar);
            this.f57135e.remove(dVar);
        }
        if (callback != null) {
            callback.invoke(new Object[0]);
        }
    }

    public void g(String str) throws IOException {
        DatagramSocket datagramSocket = this.f57136f;
        if (datagramSocket == null || !datagramSocket.isBound()) {
            throw new IllegalStateException("Socket is not bound.");
        }
        ((MulticastSocket) this.f57136f).joinGroup(InetAddress.getByName(str));
        this.f57137g = true;
    }

    public void h(Integer num, String str) throws SocketException {
        if (this.f57136f != null || this.f57134d != null) {
            throw new IllegalStateException("Socket is already bound");
        }
        MulticastSocket multicastSocket = new MulticastSocket(str != null ? new InetSocketAddress(InetAddress.getByName(str), num.intValue()) : new InetSocketAddress(num.intValue()));
        this.f57136f = multicastSocket;
        multicastSocket.setReuseAddress(true);
        this.f57134d = new c(this.f57136f, this);
        new Thread(this.f57134d).start();
    }

    public void i() {
        c cVar = this.f57134d;
        if (cVar != null && cVar.isRunning()) {
            this.f57134d.a();
        }
        this.f57133c.shutdownNow();
        DatagramSocket datagramSocket = this.f57136f;
        if (datagramSocket != null && !datagramSocket.isClosed()) {
            this.f57136f.close();
        }
        this.f57136f = null;
        this.f57134d = null;
    }

    public void j(String str) throws IOException {
        ((MulticastSocket) this.f57136f).leaveGroup(InetAddress.getByName(str));
        this.f57137g = false;
    }

    public boolean k() {
        return this.f57137g;
    }

    public void l(String str, Integer num, String str2, Callback callback) {
        DatagramSocket datagramSocket = this.f57136f;
        if (datagramSocket == null || !datagramSocket.isBound()) {
            throw new IllegalStateException("Socket is not bound.");
        }
        d dVar = new d(this.f57136f, this, new InetSocketAddress(InetAddress.getByName(str2), num.intValue()), Base64.decode(str, 2));
        if (callback != null) {
            synchronized (this.f57135e) {
                this.f57135e.put(dVar, callback);
            }
        }
        this.f57133c.submit(dVar);
    }

    public void m(boolean z11) throws SocketException {
        DatagramSocket datagramSocket = this.f57136f;
        if (datagramSocket != null) {
            datagramSocket.setBroadcast(z11);
        }
    }
}
