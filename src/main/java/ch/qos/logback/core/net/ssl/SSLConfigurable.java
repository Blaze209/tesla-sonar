package ch.qos.logback.core.net.ssl;

/* JADX INFO: loaded from: classes3.dex */
public interface SSLConfigurable {
    String[] getDefaultCipherSuites();

    String[] getDefaultProtocols();

    String[] getSupportedCipherSuites();

    String[] getSupportedProtocols();

    void setEnabledCipherSuites(String[] strArr);

    void setEnabledProtocols(String[] strArr);

    void setNeedClientAuth(boolean z11);

    void setWantClientAuth(boolean z11);
}
