package jl0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\f\u001a#\u0010\u000e\u001a\u00020\n*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Ljl0/c;", "", "destination", "", "offset", "length", "destinationOffset", "Ljn0/h0;", "b", "(Ljava/nio/ByteBuffer;[BIII)V", "Ljava/nio/ByteBuffer;", "a", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)V", "c", DateTokenConverter.CONVERTER_KEY, "(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {
    public static final void a(ByteBuffer copyTo, ByteBuffer destination, int i11) {
        s.k(copyTo, "$this$copyTo");
        s.k(destination, "destination");
        int iRemaining = destination.remaining();
        if (copyTo.hasArray() && !copyTo.isReadOnly() && destination.hasArray() && !destination.isReadOnly()) {
            int iPosition = destination.position();
            System.arraycopy(copyTo.array(), copyTo.arrayOffset() + i11, destination.array(), destination.arrayOffset() + iPosition, iRemaining);
            destination.position(iPosition + iRemaining);
        } else {
            ByteBuffer byteBufferDuplicate = copyTo.duplicate();
            byteBufferDuplicate.limit(iRemaining + i11);
            byteBufferDuplicate.position(i11);
            destination.put(byteBufferDuplicate);
        }
    }

    public static final void b(ByteBuffer copyTo, byte[] destination, int i11, int i12, int i13) {
        s.k(copyTo, "$this$copyTo");
        s.k(destination, "destination");
        if (!copyTo.hasArray() || copyTo.isReadOnly()) {
            copyTo.duplicate().get(destination, i13, i12);
        } else {
            System.arraycopy(copyTo.array(), copyTo.arrayOffset() + i11, destination, i13, i12);
        }
    }

    public static final void c(ByteBuffer copyTo, ByteBuffer destination, int i11) {
        s.k(copyTo, "$this$copyTo");
        s.k(destination, "destination");
        if (!copyTo.hasArray() || copyTo.isReadOnly()) {
            d(destination, i11, copyTo.remaining()).put(copyTo);
            return;
        }
        byte[] bArrArray = copyTo.array();
        s.j(bArrArray, "array()");
        int iArrayOffset = copyTo.arrayOffset() + copyTo.position();
        int iRemaining = copyTo.remaining();
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArrArray, iArrayOffset, iRemaining).slice().order(ByteOrder.BIG_ENDIAN);
        s.j(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        c.c(c.b(byteBufferOrder), destination, 0, iRemaining, i11);
        copyTo.position(copyTo.limit());
    }

    public static final ByteBuffer d(ByteBuffer byteBuffer, int i11, int i12) {
        s.k(byteBuffer, "<this>");
        ByteBuffer myDuplicate$lambda$1 = byteBuffer.duplicate();
        s.j(myDuplicate$lambda$1, "myDuplicate$lambda$1");
        myDuplicate$lambda$1.position(i11);
        myDuplicate$lambda$1.limit(i11 + i12);
        ByteBuffer mySlice$lambda$2 = myDuplicate$lambda$1.slice();
        s.j(mySlice$lambda$2, "mySlice$lambda$2");
        return mySlice$lambda$2;
    }
}
