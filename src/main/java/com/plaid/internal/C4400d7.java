package com.plaid.internal;

import android.net.Network;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import javax.net.SocketFactory;

/* JADX INFO: renamed from: com.plaid.internal.d7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4400d7 implements InterfaceC4519r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4572x0 f47622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4424g4 f47623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47624c;

    public C4400d7(C4424g4 c4424g4) {
        W3 w11 = Z3.f46846a;
        this.f47622a = new C4572x0("socket-http-client");
        this.f47624c = 0;
        this.f47623b = c4424g4;
    }

    @Override // com.plaid.internal.InterfaceC4519r1
    public final InterfaceC4519r1.b a(InterfaceC4519r1.a aVar) throws Throwable {
        boolean zEquals;
        Socket socket;
        OutputStream outputStream;
        C4537t1 c4537t1;
        C4572x0 c4572x0 = this.f47622a;
        StringBuilder sb2 = new StringBuilder("request ");
        sb2.append(aVar.f48079b ? "POST" : "GET");
        sb2.append(" ");
        sb2.append(aVar.f48078a);
        W3 w11 = W3.DEBUG;
        c4572x0.a(w11, sb2.toString(), new Object[0]);
        try {
            zEquals = new URL(aVar.f48078a).getProtocol().equals("https");
        } catch (MalformedURLException unused) {
            zEquals = false;
        }
        if (zEquals) {
            throw new IOException("https not supported by this httpclient");
        }
        int i11 = aVar.f48080c;
        if (i11 <= -1) {
            i11 = this.f47624c;
        }
        try {
            URL url = new URL(aVar.f48078a);
            Network network = this.f47623b.f47680a;
            InetAddress byName = network.getByName(url.getHost());
            this.f47622a.a(w11, "host " + url.getHost() + " resolved to " + byName, new Object[0]);
            SocketFactory socketFactory = network.getSocketFactory();
            int port = url.getPort();
            if (port == -1) {
                port = url.getDefaultPort();
            }
            Socket socketCreateSocket = socketFactory.createSocket(byName, port);
            try {
                socketCreateSocket.setSoTimeout(i11);
                OutputStream outputStream2 = socketCreateSocket.getOutputStream();
                try {
                    if (aVar.f48079b) {
                        c4537t1 = new C4537t1(url, "POST");
                        C4403e1 c4403e1 = C4403e1.f47632c;
                        c4537t1.f48118c.put("accept".toLowerCase(), (String) c4403e1.a("http.accept.post", "application/json", String.class));
                        c4537t1.f48118c.put("accept".toLowerCase(), (String) c4403e1.a("http.accept.post", "application/json", String.class));
                        c4537t1.f48121f = aVar.f48081d;
                        c4537t1.f48122g = !c4403e1.a("http.no-gzip");
                    } else {
                        c4537t1 = new C4537t1(url, "GET");
                        c4537t1.f48118c.put("accept".toLowerCase(), (String) C4403e1.f47632c.a("http.accept.get", "application/json, */*", String.class));
                    }
                    if (!C4403e1.f47632c.a("http.no-user-agent")) {
                        StringBuilder sb3 = new StringBuilder("Prove SDK;version=2.9.1;os=Android ");
                        sb3.append(Build.VERSION.RELEASE);
                        sb3.append(";device=");
                        String str = Build.MANUFACTURER;
                        String str2 = Build.MODEL;
                        if (!str2.toLowerCase().startsWith(str.toLowerCase())) {
                            str2 = str + " " + str2;
                        }
                        sb3.append(str2);
                        c4537t1.f48118c.put("user-agent".toLowerCase(), sb3.toString());
                    }
                    c4537t1.a(outputStream2);
                    InputStream inputStream = socketCreateSocket.getInputStream();
                    C4546u1 c4546u1A = C4546u1.a(inputStream);
                    inputStream.close();
                    InterfaceC4519r1.b bVar = new InterfaceC4519r1.b(c4546u1A.f48149a, c4546u1A.f48150b, c4546u1A.f48152d, c4546u1A.f48151c);
                    AbstractC4555v1.a(outputStream2);
                    AbstractC4555v1.a(socketCreateSocket);
                    return bVar;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = outputStream2;
                    socket = socketCreateSocket;
                    AbstractC4555v1.a(outputStream);
                    AbstractC4555v1.a(socket);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                socket = socketCreateSocket;
                outputStream = null;
                AbstractC4555v1.a(outputStream);
                AbstractC4555v1.a(socket);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            socket = null;
        }
    }

    @Override // com.plaid.internal.InterfaceC4519r1
    public final EnumC4589z isConnected() {
        return null;
    }

    @Override // com.plaid.internal.InterfaceC4519r1
    public final void a() {
        try {
            C4424g4 c4424g4 = this.f47623b;
            if (c4424g4.f47683d) {
                return;
            }
            c4424g4.f47683d = true;
            c4424g4.f47681b.run();
        } catch (Exception e11) {
            this.f47622a.a(e11, "couldn't release the network");
        }
    }
}
