package ll0;

import java.nio.ByteBuffer;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lll0/a;", "other", "", "maxSize", "a", "(Lll0/a;Lll0/a;I)I", "c", "(Lll0/a;Lll0/a;)I", "writeSize", "Ljn0/h0;", "b", "(Lll0/a;I)V", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    public static final int a(a aVar, a other, int i11) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        p013kotlin.jvm.internal.s.k(other, "other");
        int iMin = Math.min(other.getWritePosition() - other.getReadPosition(), i11);
        if (aVar.getLimit() - aVar.getWritePosition() <= iMin) {
            b(aVar, iMin);
        }
        ByteBuffer memory = aVar.getMemory();
        int writePosition = aVar.getWritePosition();
        aVar.getLimit();
        ByteBuffer memory2 = other.getMemory();
        int readPosition = other.getReadPosition();
        other.getWritePosition();
        jl0.c.c(memory2, memory, readPosition, iMin, writePosition);
        other.c(iMin);
        aVar.a(iMin);
        return iMin;
    }

    private static final void b(a aVar, int i11) {
        if ((aVar.getLimit() - aVar.getWritePosition()) + (aVar.getCapacity() - aVar.getLimit()) < i11) {
            throw new IllegalArgumentException("Can't append buffer: not enough free space at the end");
        }
        if ((aVar.getWritePosition() + i11) - aVar.getLimit() > 0) {
            aVar.m();
        }
    }

    public static final int c(a aVar, a other) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        p013kotlin.jvm.internal.s.k(other, "other");
        int writePosition = other.getWritePosition() - other.getReadPosition();
        int readPosition = aVar.getReadPosition();
        if (readPosition < writePosition) {
            throw new IllegalArgumentException("Not enough space in the beginning to prepend bytes");
        }
        int i11 = readPosition - writePosition;
        jl0.c.c(other.getMemory(), aVar.getMemory(), other.getReadPosition(), writePosition, i11);
        other.c(writePosition);
        aVar.o(i11);
        return writePosition;
    }
}
