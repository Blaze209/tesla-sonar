package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokio/q0;", "Lokio/f;", "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", "Ljava/io/IOException;", "cause", "newTimeoutException", "(Ljava/io/IOException;)Ljava/io/IOException;", "Ljn0/h0;", "timedOut", "()V", "a", "Ljava/net/Socket;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class q0 extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Socket socket;

    public q0(Socket socket) {
        p013kotlin.jvm.internal.s.k(socket, "socket");
        this.socket = socket;
    }

    @Override // okio.f
    protected IOException newTimeoutException(IOException cause) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (cause != null) {
            socketTimeoutException.initCause(cause);
        }
        return socketTimeoutException;
    }

    @Override // okio.f
    protected void timedOut() {
        try {
            this.socket.close();
        } catch (AssertionError e11) {
            if (!c0.e(e11)) {
                throw e11;
            }
            d0.f97910a.log(Level.WARNING, "Failed to close timed out socket " + this.socket, (Throwable) e11);
        } catch (Exception e12) {
            d0.f97910a.log(Level.WARNING, "Failed to close timed out socket " + this.socket, (Throwable) e12);
        }
    }
}
