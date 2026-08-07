package io.ktor.websocket;

import io.ktor.util.internal.a;
import kotlinx.coroutines.CopyableThrowable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\f¨\u0006\u000f"}, d2 = {"Lio/ktor/websocket/ProtocolViolationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlinx/coroutines/CopyableThrowable;", "", "violation", "<init>", "(Ljava/lang/String;)V", "a", "()Lio/ktor/websocket/ProtocolViolationException;", "Ljava/lang/String;", "getViolation", "()Ljava/lang/String;", "getMessage", "message", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProtocolViolationException extends Exception implements CopyableThrowable<ProtocolViolationException> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String violation;

    public ProtocolViolationException(String violation) {
        s.k(violation, "violation");
        this.violation = violation;
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ProtocolViolationException createCopy() {
        ProtocolViolationException protocolViolationException = new ProtocolViolationException(this.violation);
        a.a(protocolViolationException, this);
        return protocolViolationException;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Received illegal frame: " + this.violation;
    }
}
