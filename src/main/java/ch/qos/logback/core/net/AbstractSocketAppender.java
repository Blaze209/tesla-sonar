package ch.qos.logback.core.net;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.spi.PreSerializationTransformer;
import ch.qos.logback.core.util.CloseUtil;
import ch.qos.logback.core.util.Duration;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractSocketAppender<E> extends AppenderBase<E> implements SocketConnector.ExceptionHandler {
    private static final int DEFAULT_ACCEPT_CONNECTION_DELAY = 5000;
    private static final int DEFAULT_EVENT_DELAY_TIMEOUT = 100;
    public static final int DEFAULT_PORT = 4560;
    public static final int DEFAULT_QUEUE_SIZE = 128;
    public static final int DEFAULT_RECONNECTION_DELAY = 30000;
    private int acceptConnectionTimeout;
    private InetAddress address;
    private SocketConnector connector;
    private BlockingDeque<E> deque;
    private Duration eventDelayLimit;
    private final ObjectWriterFactory objectWriterFactory;
    private String peerId;
    private int port;
    private final QueueFactory queueFactory;
    private int queueSize;
    private Duration reconnectionDelay;
    private String remoteHost;
    private volatile Socket socket;
    private Future<?> task;

    protected AbstractSocketAppender() {
        this(new QueueFactory(), new ObjectWriterFactory());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectSocketAndDispatchEvents() {
        StringBuilder sb2;
        while (socketConnectionCouldBeEstablished()) {
            try {
                try {
                    try {
                        ObjectWriter objectWriterCreateObjectWriterForSocket = createObjectWriterForSocket();
                        addInfo(this.peerId + "connection established");
                        dispatchEvents(objectWriterCreateObjectWriterForSocket);
                        CloseUtil.closeQuietly(this.socket);
                        this.socket = null;
                        sb2 = new StringBuilder();
                        sb2.append(this.peerId);
                        sb2.append("connection closed");
                    } catch (IOException e11) {
                        addInfo(this.peerId + "connection failed: " + e11);
                        CloseUtil.closeQuietly(this.socket);
                        this.socket = null;
                        sb2 = new StringBuilder();
                        sb2.append(this.peerId);
                        sb2.append("connection closed");
                    }
                    addInfo(sb2.toString());
                } catch (Throwable th2) {
                    CloseUtil.closeQuietly(this.socket);
                    this.socket = null;
                    addInfo(this.peerId + "connection closed");
                    throw th2;
                }
            } catch (InterruptedException unused) {
            }
        }
        addInfo("shutting down");
    }

    private SocketConnector createConnector(InetAddress inetAddress, int i11, int i12, long j11) {
        SocketConnector socketConnectorNewConnector = newConnector(inetAddress, i11, i12, j11);
        socketConnectorNewConnector.setExceptionHandler(this);
        socketConnectorNewConnector.setSocketFactory(getSocketFactory());
        return socketConnectorNewConnector;
    }

    private ObjectWriter createObjectWriterForSocket() throws SocketException {
        this.socket.setSoTimeout(this.acceptConnectionTimeout);
        AutoFlushingObjectWriter autoFlushingObjectWriterNewAutoFlushingObjectWriter = this.objectWriterFactory.newAutoFlushingObjectWriter(this.socket.getOutputStream());
        this.socket.setSoTimeout(0);
        return autoFlushingObjectWriterNewAutoFlushingObjectWriter;
    }

    private void dispatchEvents(ObjectWriter objectWriter) throws InterruptedException, IOException {
        while (true) {
            E eTakeFirst = this.deque.takeFirst();
            postProcessEvent(eTakeFirst);
            try {
                objectWriter.write(getPST().transform(eTakeFirst));
            } catch (IOException e11) {
                tryReAddingEventToFrontOfQueue(eTakeFirst);
                throw e11;
            }
        }
    }

    private boolean socketConnectionCouldBeEstablished() {
        Socket socketCall = this.connector.call();
        this.socket = socketCall;
        return socketCall != null;
    }

    private void tryReAddingEventToFrontOfQueue(E e11) {
        if (this.deque.offerFirst(e11)) {
            return;
        }
        addInfo("Dropping event due to socket connection error and maxed out deque capacity");
    }

    @Override // ch.qos.logback.core.AppenderBase
    protected void append(E e11) {
        if (e11 == null || !isStarted()) {
            return;
        }
        try {
            if (this.deque.offer(e11, this.eventDelayLimit.getMilliseconds(), TimeUnit.MILLISECONDS)) {
                return;
            }
            addInfo("Dropping event due to timeout limit of [" + this.eventDelayLimit + "] being exceeded");
        } catch (InterruptedException e12) {
            addError("Interrupted while appending event to SocketAppender", e12);
        }
    }

    @Override // ch.qos.logback.core.net.SocketConnector.ExceptionHandler
    public void connectionFailed(SocketConnector socketConnector, Exception exc) {
        StringBuilder sb2;
        String string;
        if (exc instanceof InterruptedException) {
            string = "connector interrupted";
        } else {
            if (exc instanceof ConnectException) {
                sb2 = new StringBuilder();
                sb2.append(this.peerId);
                sb2.append("connection refused");
            } else {
                sb2 = new StringBuilder();
                sb2.append(this.peerId);
                sb2.append(exc);
            }
            string = sb2.toString();
        }
        addInfo(string);
    }

    public Duration getEventDelayLimit() {
        return this.eventDelayLimit;
    }

    protected abstract PreSerializationTransformer<E> getPST();

    public int getPort() {
        return this.port;
    }

    public int getQueueSize() {
        return this.queueSize;
    }

    public Duration getReconnectionDelay() {
        return this.reconnectionDelay;
    }

    public String getRemoteHost() {
        return this.remoteHost;
    }

    protected SocketFactory getSocketFactory() {
        return SocketFactory.getDefault();
    }

    protected SocketConnector newConnector(InetAddress inetAddress, int i11, long j11, long j12) {
        return new DefaultSocketConnector(inetAddress, i11, j11, j12);
    }

    protected abstract void postProcessEvent(E e11);

    void setAcceptConnectionTimeout(int i11) {
        this.acceptConnectionTimeout = i11;
    }

    public void setEventDelayLimit(Duration duration) {
        this.eventDelayLimit = duration;
    }

    public void setPort(int i11) {
        this.port = i11;
    }

    public void setQueueSize(int i11) {
        this.queueSize = i11;
    }

    public void setReconnectionDelay(Duration duration) {
        this.reconnectionDelay = duration;
    }

    public void setRemoteHost(String str) {
        this.remoteHost = str;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        int i11;
        if (!isStarted()) {
            if (this.port <= 0) {
                addError("No port was configured for appender" + this.name + " For more information, please visit http://logback.qos.ch/codes.html#socket_no_port");
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (this.remoteHost == null) {
                i11++;
                addError("No remote host was configured for appender" + this.name + " For more information, please visit http://logback.qos.ch/codes.html#socket_no_host");
            }
            if (this.queueSize == 0) {
                addWarn("Queue size of zero is deprecated, use a size of one to indicate synchronous processing");
            }
            if (this.queueSize < 0) {
                i11++;
                addError("Queue size must be greater than zero");
            }
            if (i11 == 0) {
                try {
                    this.address = InetAddress.getByName(this.remoteHost);
                } catch (UnknownHostException unused) {
                    addError("unknown host: " + this.remoteHost);
                    i11++;
                }
            }
            if (i11 == 0) {
                this.deque = this.queueFactory.newLinkedBlockingDeque(this.queueSize);
                this.peerId = "remote peer " + this.remoteHost + ":" + this.port + ": ";
                this.connector = createConnector(this.address, this.port, 0, this.reconnectionDelay.getMilliseconds());
                this.task = getContext().getScheduledExecutorService().submit(new Runnable() { // from class: ch.qos.logback.core.net.AbstractSocketAppender.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractSocketAppender.this.connectSocketAndDispatchEvents();
                    }
                });
                super.start();
            }
        }
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        if (isStarted()) {
            CloseUtil.closeQuietly(this.socket);
            this.task.cancel(true);
            super.stop();
        }
    }

    AbstractSocketAppender(QueueFactory queueFactory, ObjectWriterFactory objectWriterFactory) {
        this.port = DEFAULT_PORT;
        this.reconnectionDelay = new Duration(30000L);
        this.queueSize = 128;
        this.acceptConnectionTimeout = 5000;
        this.eventDelayLimit = new Duration(100L);
        this.objectWriterFactory = objectWriterFactory;
        this.queueFactory = queueFactory;
    }
}
