package ll0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.EOFException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0003*\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\b2\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u00020\u000e*\u00020\b2\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u001b\u0010\u0012\u001a\u00020\u000e*\u00020\b2\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u001b\u0010\u0014\u001a\u00020\u000e*\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"", "count", "readRemaining", "", "b", "(II)Ljava/lang/Void;", "writeRemaining", "a", "Lll0/a;", "startGap", "h", "(Lll0/a;I)Ljava/lang/Void;", "g", "endGap", "Ljn0/h0;", "c", "(Lll0/a;I)V", "e", DateTokenConverter.CONVERTER_KEY, "size", "f", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {
    public static final Void a(int i11, int i12) {
        throw new EOFException("Unable to discard " + i11 + " bytes: only " + i12 + " available for writing");
    }

    public static final Void b(int i11, int i12) {
        throw new EOFException("Unable to discard " + i11 + " bytes: only " + i12 + " available for reading");
    }

    public static final void c(a aVar, int i11) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        throw new IllegalArgumentException("End gap " + i11 + " is too big: capacity is " + aVar.getCapacity());
    }

    public static final void d(a aVar, int i11) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        throw new IllegalArgumentException("Unable to reserve end gap " + i11 + ": there are already " + (aVar.getWritePosition() - aVar.getReadPosition()) + " content bytes at offset " + aVar.getReadPosition());
    }

    public static final void e(a aVar, int i11) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        throw new IllegalArgumentException("End gap " + i11 + " is too big: there are already " + aVar.getStartGap() + " bytes reserved in the beginning");
    }

    public static final void f(a aVar, int i11) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        aVar.o(aVar.getReadPosition() - i11);
    }

    public static final Void g(a aVar, int i11) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        throw new IllegalStateException("Unable to reserve " + i11 + " start gap: there are already " + (aVar.getWritePosition() - aVar.getReadPosition()) + " content bytes starting at offset " + aVar.getReadPosition());
    }

    public static final Void h(a aVar, int i11) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        if (i11 > aVar.getCapacity()) {
            throw new IllegalArgumentException("Start gap " + i11 + " is bigger than the capacity " + aVar.getCapacity());
        }
        throw new IllegalStateException("Unable to reserve " + i11 + " start gap: there are already " + (aVar.getCapacity() - aVar.getLimit()) + " bytes reserved in the end");
    }
}
