package z10;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u000e\u0010\u0016J\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u000e\u0010\u0017J/\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u000e\u0010\u001bJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u000e\u0010\u001cJ/\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u000e\u0010\u001fR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010#\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lz10/i;", "Ljavax/net/ssl/SSLSocketFactory;", "", "", "versions", "<init>", "([Ljava/lang/String;)V", "Ljava/net/Socket;", "socket", "a", "(Ljava/net/Socket;)Ljava/net/Socket;", "getDefaultCipherSuites", "()[Ljava/lang/String;", "getSupportedCipherSuites", "createSocket", "()Ljava/net/Socket;", "s", "host", "", "port", "", "autoClose", "(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;", "(Ljava/lang/String;I)Ljava/net/Socket;", "Ljava/net/InetAddress;", "localHost", "localPort", "(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;", "(Ljava/net/InetAddress;I)Ljava/net/Socket;", PlaceTypes.ADDRESS, "localAddress", "(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;", "[Ljava/lang/String;", "b", "Ljavax/net/ssl/SSLSocketFactory;", "internalSSLSocketFactory", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String[] versions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SSLSocketFactory internalSSLSocketFactory;

    public i(String[] versions) throws NoSuchAlgorithmException, KeyManagementException {
        s.k(versions, "versions");
        this.versions = versions;
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        s.j(socketFactory, "context.socketFactory");
        this.internalSSLSocketFactory = socketFactory;
    }

    private final Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(this.versions);
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        Socket socketCreateSocket = this.internalSSLSocketFactory.createSocket();
        s.j(socketCreateSocket, "internalSSLSocketFactory.createSocket()");
        return a(socketCreateSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.internalSSLSocketFactory.getDefaultCipherSuites();
        s.j(defaultCipherSuites, "internalSSLSocketFactory.defaultCipherSuites");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.internalSSLSocketFactory.getSupportedCipherSuites();
        s.j(supportedCipherSuites, "internalSSLSocketFactory.supportedCipherSuites");
        return supportedCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket s11, String host, int port, boolean autoClose) throws IOException {
        s.k(s11, "s");
        s.k(host, "host");
        Socket socketCreateSocket = this.internalSSLSocketFactory.createSocket(s11, host, port, autoClose);
        s.j(socketCreateSocket, "internalSSLSocketFactory…s, host, port, autoClose)");
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int port) throws IOException {
        s.k(host, "host");
        Socket socketCreateSocket = this.internalSSLSocketFactory.createSocket(host, port);
        s.j(socketCreateSocket, "internalSSLSocketFactory.createSocket(host, port)");
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int port, InetAddress localHost, int localPort) throws IOException {
        s.k(host, "host");
        s.k(localHost, "localHost");
        Socket socketCreateSocket = this.internalSSLSocketFactory.createSocket(host, port, localHost, localPort);
        s.j(socketCreateSocket, "internalSSLSocketFactory…  localPort\n            )");
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress host, int port) throws IOException {
        s.k(host, "host");
        Socket socketCreateSocket = this.internalSSLSocketFactory.createSocket(host, port);
        s.j(socketCreateSocket, "internalSSLSocketFactory.createSocket(host, port)");
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress address, int port, InetAddress localAddress, int localPort) throws IOException {
        s.k(address, "address");
        s.k(localAddress, "localAddress");
        Socket socketCreateSocket = this.internalSSLSocketFactory.createSocket(address, port, localAddress, localPort);
        s.j(socketCreateSocket, "internalSSLSocketFactory…  localPort\n            )");
        return a(socketCreateSocket);
    }
}
