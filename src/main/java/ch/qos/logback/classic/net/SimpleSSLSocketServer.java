package ch.qos.logback.classic.net;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.net.ssl.ConfigurableSSLServerSocketFactory;
import ch.qos.logback.core.net.ssl.SSLParametersConfiguration;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;

/* JADX INFO: loaded from: classes3.dex */
public class SimpleSSLSocketServer extends SimpleSocketServer {
    private final ServerSocketFactory socketFactory;

    public SimpleSSLSocketServer(LoggerContext loggerContext, int i11) {
        this(loggerContext, i11, SSLContext.getDefault());
    }

    public static void main(String[] strArr) throws Throwable {
        SimpleSocketServer.doMain(SimpleSSLSocketServer.class, strArr);
    }

    @Override // ch.qos.logback.classic.net.SimpleSocketServer
    protected ServerSocketFactory getServerSocketFactory() {
        return this.socketFactory;
    }

    public SimpleSSLSocketServer(LoggerContext loggerContext, int i11, SSLContext sSLContext) {
        super(loggerContext, i11);
        if (sSLContext == null) {
            throw new NullPointerException("SSL context required");
        }
        SSLParametersConfiguration sSLParametersConfiguration = new SSLParametersConfiguration();
        sSLParametersConfiguration.setContext(loggerContext);
        this.socketFactory = new ConfigurableSSLServerSocketFactory(sSLParametersConfiguration, sSLContext.getServerSocketFactory());
    }
}
