package ll0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000f\u001a\u00020\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ljava/nio/ByteBuffer;", "buffer", "Lnl0/f;", "Lml0/a;", "pool", "a", "(Ljava/nio/ByteBuffer;Lnl0/f;)Lml0/a;", "child", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lml0/a;Ljava/nio/ByteBuffer;)V", "Lll0/a;", "dst", "", "length", "c", "(Lll0/a;Ljava/nio/ByteBuffer;I)V", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {
    public static final ml0.a a(ByteBuffer buffer, nl0.f<ml0.a> fVar) {
        p013kotlin.jvm.internal.s.k(buffer, "buffer");
        jl0.c.Companion companion = jl0.c.INSTANCE;
        ByteBuffer byteBufferOrder = buffer.slice().order(ByteOrder.BIG_ENDIAN);
        p013kotlin.jvm.internal.s.j(byteBufferOrder, "buffer.slice().order(ByteOrder.BIG_ENDIAN)");
        return new ml0.a(jl0.c.b(byteBufferOrder), null, fVar, null);
    }

    public static /* synthetic */ ml0.a b(ByteBuffer byteBuffer, nl0.f fVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fVar = null;
        }
        return a(byteBuffer, fVar);
    }

    public static final void c(a aVar, ByteBuffer dst, int i11) throws EOFException {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        p013kotlin.jvm.internal.s.k(dst, "dst");
        ByteBuffer memory = aVar.getMemory();
        int readPosition = aVar.getReadPosition();
        if (aVar.getWritePosition() - readPosition < i11) {
            throw new EOFException("Not enough bytes to read a buffer content of size " + i11 + CoreConstants.DOT);
        }
        int iLimit = dst.limit();
        try {
            dst.limit(dst.position() + i11);
            jl0.d.a(memory, dst, readPosition);
            dst.limit(iLimit);
            h0 h0Var = h0.f84049a;
            aVar.c(i11);
        } catch (Throwable th2) {
            dst.limit(iLimit);
            throw th2;
        }
    }

    public static final void d(ml0.a aVar, ByteBuffer child) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        p013kotlin.jvm.internal.s.k(child, "child");
        aVar.u(child.limit());
        aVar.b(child.position());
    }
}
