package jl0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0010ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Ljl0/c;", "", "Ljava/nio/ByteBuffer;", "buffer", "b", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "", "offset", "length", "e", "(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;", "destination", "destinationOffset", "Ljn0/h0;", "c", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;III)V", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;JJJ)V", "a", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ByteBuffer f83981b;

    /* JADX INFO: renamed from: jl0.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Ljl0/c$a;", "", "<init>", "()V", "Ljl0/c;", "Empty", "Ljava/nio/ByteBuffer;", "a", "()Ljava/nio/ByteBuffer;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ByteBuffer a() {
            return c.f83981b;
        }

        private Companion() {
        }
    }

    static {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(0).order(ByteOrder.BIG_ENDIAN);
        s.j(byteBufferOrder, "allocate(0).order(ByteOrder.BIG_ENDIAN)");
        f83981b = b(byteBufferOrder);
    }

    public static ByteBuffer b(ByteBuffer buffer) {
        s.k(buffer, "buffer");
        return buffer;
    }

    public static final void c(ByteBuffer byteBuffer, ByteBuffer destination, int i11, int i12, int i13) {
        s.k(destination, "destination");
        if (byteBuffer.hasArray() && destination.hasArray() && !byteBuffer.isReadOnly() && !destination.isReadOnly()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i11, destination.array(), destination.arrayOffset() + i13, i12);
            return;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i11);
        byteBufferDuplicate.limit(i11 + i12);
        ByteBuffer byteBufferDuplicate2 = destination.duplicate();
        byteBufferDuplicate2.position(i13);
        byteBufferDuplicate2.put(byteBufferDuplicate);
    }

    public static final void d(ByteBuffer byteBuffer, ByteBuffer destination, long j11, long j12, long j13) {
        s.k(destination, "destination");
        if (j11 >= 2147483647L) {
            ml0.d.a(j11, "offset");
            throw new KotlinNothingValueException();
        }
        int i11 = (int) j11;
        if (j12 >= 2147483647L) {
            ml0.d.a(j12, "length");
            throw new KotlinNothingValueException();
        }
        int i12 = (int) j12;
        if (j13 < 2147483647L) {
            c(byteBuffer, destination, i11, i12, (int) j13);
        } else {
            ml0.d.a(j13, "destinationOffset");
            throw new KotlinNothingValueException();
        }
    }

    public static final ByteBuffer e(ByteBuffer byteBuffer, int i11, int i12) {
        return b(d.d(byteBuffer, i11, i12));
    }
}
