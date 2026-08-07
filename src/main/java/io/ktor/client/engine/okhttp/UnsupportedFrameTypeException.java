package io.ktor.client.engine.okhttp;

import kotlinx.coroutines.CopyableThrowable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import pl0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/client/engine/okhttp/UnsupportedFrameTypeException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "Lkotlinx/coroutines/CopyableThrowable;", "Lpl0/b;", "frame", "<init>", "(Lpl0/b;)V", "a", "()Lio/ktor/client/engine/okhttp/UnsupportedFrameTypeException;", "Lpl0/b;", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UnsupportedFrameTypeException extends IllegalArgumentException implements CopyableThrowable<UnsupportedFrameTypeException> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b frame;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedFrameTypeException(b frame) {
        super("Unsupported frame type: " + frame);
        s.k(frame, "frame");
        this.frame = frame;
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public UnsupportedFrameTypeException createCopy() {
        UnsupportedFrameTypeException unsupportedFrameTypeException = new UnsupportedFrameTypeException(this.frame);
        unsupportedFrameTypeException.initCause(this);
        return unsupportedFrameTypeException;
    }
}
