package ch.qos.logback.classic.net.server;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.HardenedObjectInputStream;
import ch.qos.logback.core.util.CloseUtil;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes3.dex */
class RemoteAppenderStreamClient implements RemoteAppenderClient {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f19335id;
    private final InputStream inputStream;

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    private LoggerContext f19336lc;
    private Logger logger;
    private final Socket socket;

    public RemoteAppenderStreamClient(String str, InputStream inputStream) {
        this.f19335id = str;
        this.socket = null;
        this.inputStream = inputStream;
    }

    private HardenedObjectInputStream createObjectInputStream() {
        return this.inputStream != null ? new HardenedLoggingEventInputStream(this.inputStream) : new HardenedLoggingEventInputStream(this.socket.getInputStream());
    }

    @Override // ch.qos.logback.core.net.server.Client, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Socket socket = this.socket;
        if (socket == null) {
            return;
        }
        CloseUtil.closeQuietly(socket);
    }

    @Override // java.lang.Runnable
    public void run() {
        Logger logger;
        StringBuilder sb2;
        this.logger.info(this + ": connected");
        HardenedObjectInputStream hardenedObjectInputStreamCreateObjectInputStream = null;
        try {
            try {
                try {
                    hardenedObjectInputStreamCreateObjectInputStream = createObjectInputStream();
                    while (true) {
                        ILoggingEvent iLoggingEvent = (ILoggingEvent) hardenedObjectInputStreamCreateObjectInputStream.readObject();
                        Logger logger2 = this.f19336lc.getLogger(iLoggingEvent.getLoggerName());
                        if (logger2.isEnabledFor(iLoggingEvent.getLevel())) {
                            logger2.callAppenders(iLoggingEvent);
                        }
                    }
                } catch (EOFException unused) {
                    if (hardenedObjectInputStreamCreateObjectInputStream != null) {
                        CloseUtil.closeQuietly(hardenedObjectInputStreamCreateObjectInputStream);
                    }
                    close();
                    logger = this.logger;
                    sb2 = new StringBuilder();
                    sb2.append(this);
                    sb2.append(": connection closed");
                    logger.info(sb2.toString());
                } catch (ClassNotFoundException unused2) {
                    this.logger.error(this + ": unknown event class");
                    if (hardenedObjectInputStreamCreateObjectInputStream != null) {
                        CloseUtil.closeQuietly(hardenedObjectInputStreamCreateObjectInputStream);
                    }
                    close();
                    logger = this.logger;
                    sb2 = new StringBuilder();
                    sb2.append(this);
                    sb2.append(": connection closed");
                    logger.info(sb2.toString());
                }
            } catch (IOException e11) {
                this.logger.info(this + ": " + e11);
                if (hardenedObjectInputStreamCreateObjectInputStream != null) {
                    CloseUtil.closeQuietly(hardenedObjectInputStreamCreateObjectInputStream);
                }
                close();
                logger = this.logger;
                sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(": connection closed");
                logger.info(sb2.toString());
            } catch (RuntimeException e12) {
                this.logger.error(this + ": " + e12);
                if (hardenedObjectInputStreamCreateObjectInputStream != null) {
                    CloseUtil.closeQuietly(hardenedObjectInputStreamCreateObjectInputStream);
                }
                close();
                logger = this.logger;
                sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(": connection closed");
                logger.info(sb2.toString());
            }
        } catch (Throwable th2) {
            if (hardenedObjectInputStreamCreateObjectInputStream != null) {
                CloseUtil.closeQuietly(hardenedObjectInputStreamCreateObjectInputStream);
            }
            close();
            this.logger.info(this + ": connection closed");
            throw th2;
        }
    }

    @Override // ch.qos.logback.classic.net.server.RemoteAppenderClient
    public void setLoggerContext(LoggerContext loggerContext) {
        this.f19336lc = loggerContext;
        this.logger = loggerContext.getLogger(getClass().getPackage().getName());
    }

    public String toString() {
        return "client " + this.f19335id;
    }

    public RemoteAppenderStreamClient(String str, Socket socket) {
        this.f19335id = str;
        this.socket = socket;
        this.inputStream = null;
    }
}
