package ll0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import io.ktor.utils.io.core.InsufficientSpaceException;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000e\u001a#\u0010\u0012\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lll0/a;", "", "c", "(Lll0/a;)S", "value", "Ljn0/h0;", "f", "(Lll0/a;S)V", "", "destination", "", "offset", "length", "b", "(Lll0/a;[BII)V", "source", "e", "dst", "a", "(Lll0/a;Lll0/a;I)I", "src", DateTokenConverter.CONVERTER_KEY, "(Lll0/a;Lll0/a;I)V", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    public static final int a(a aVar, a dst, int i11) throws EOFException {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        p013kotlin.jvm.internal.s.k(dst, "dst");
        if (i11 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 > dst.getLimit() - dst.getWritePosition()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ByteBuffer memory = aVar.getMemory();
        int readPosition = aVar.getReadPosition();
        if (aVar.getWritePosition() - readPosition >= i11) {
            jl0.c.c(memory, dst.getMemory(), readPosition, i11, dst.getWritePosition());
            dst.a(i11);
            h0 h0Var = h0.f84049a;
            aVar.c(i11);
            return i11;
        }
        throw new EOFException("Not enough bytes to read a buffer content of size " + i11 + CoreConstants.DOT);
    }

    public static final void b(a aVar, byte[] destination, int i11, int i12) throws EOFException {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        p013kotlin.jvm.internal.s.k(destination, "destination");
        ByteBuffer memory = aVar.getMemory();
        int readPosition = aVar.getReadPosition();
        if (aVar.getWritePosition() - readPosition >= i12) {
            jl0.d.b(memory, destination, readPosition, i12, i11);
            h0 h0Var = h0.f84049a;
            aVar.c(i12);
        } else {
            throw new EOFException("Not enough bytes to read a byte array of size " + i12 + CoreConstants.DOT);
        }
    }

    public static final short c(a aVar) throws EOFException {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        ByteBuffer memory = aVar.getMemory();
        int readPosition = aVar.getReadPosition();
        if (aVar.getWritePosition() - readPosition >= 2) {
            Short shValueOf = Short.valueOf(memory.getShort(readPosition));
            aVar.c(2);
            return shValueOf.shortValue();
        }
        throw new EOFException("Not enough bytes to read a short integer of size 2" + CoreConstants.DOT);
    }

    public static final void d(a aVar, a src, int i11) throws InsufficientSpaceException {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        p013kotlin.jvm.internal.s.k(src, "src");
        if (i11 < 0) {
            throw new IllegalArgumentException(("length shouldn't be negative: " + i11).toString());
        }
        if (i11 > src.getWritePosition() - src.getReadPosition()) {
            throw new IllegalArgumentException(("length shouldn't be greater than the source read remaining: " + i11 + " > " + (src.getWritePosition() - src.getReadPosition())).toString());
        }
        if (i11 > aVar.getLimit() - aVar.getWritePosition()) {
            throw new IllegalArgumentException(("length shouldn't be greater than the destination write remaining space: " + i11 + " > " + (aVar.getLimit() - aVar.getWritePosition())).toString());
        }
        ByteBuffer memory = aVar.getMemory();
        int writePosition = aVar.getWritePosition();
        int limit = aVar.getLimit() - writePosition;
        if (limit < i11) {
            throw new InsufficientSpaceException("buffer readable content", i11, limit);
        }
        jl0.c.c(src.getMemory(), memory, src.getReadPosition(), i11, writePosition);
        src.c(i11);
        aVar.a(i11);
    }

    public static final void e(a aVar, byte[] source, int i11, int i12) throws InsufficientSpaceException {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        p013kotlin.jvm.internal.s.k(source, "source");
        ByteBuffer memory = aVar.getMemory();
        int writePosition = aVar.getWritePosition();
        int limit = aVar.getLimit() - writePosition;
        if (limit < i12) {
            throw new InsufficientSpaceException("byte array", i12, limit);
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i11, i12).slice().order(ByteOrder.BIG_ENDIAN);
        p013kotlin.jvm.internal.s.j(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        jl0.c.c(jl0.c.b(byteBufferOrder), memory, 0, i12, writePosition);
        aVar.a(i12);
    }

    public static final void f(a aVar, short s11) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        ByteBuffer memory = aVar.getMemory();
        int writePosition = aVar.getWritePosition();
        int limit = aVar.getLimit() - writePosition;
        if (limit < 2) {
            throw new InsufficientSpaceException("short integer", 2, limit);
        }
        memory.putShort(writePosition, s11);
        aVar.a(2);
    }
}
