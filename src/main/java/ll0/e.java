package ll0;

import io.ktor.utils.io.core.InsufficientSpaceException;
import java.nio.ByteBuffer;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lll0/a;", "Ljava/nio/ByteBuffer;", "source", "Ljn0/h0;", "a", "(Lll0/a;Ljava/nio/ByteBuffer;)V", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {
    public static final void a(a aVar, ByteBuffer source) throws InsufficientSpaceException {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        p013kotlin.jvm.internal.s.k(source, "source");
        int iRemaining = source.remaining();
        ByteBuffer memory = aVar.getMemory();
        int writePosition = aVar.getWritePosition();
        int limit = aVar.getLimit() - writePosition;
        if (limit < iRemaining) {
            throw new InsufficientSpaceException("buffer content", iRemaining, limit);
        }
        jl0.d.c(source, memory, writePosition);
        aVar.a(iRemaining);
    }
}
