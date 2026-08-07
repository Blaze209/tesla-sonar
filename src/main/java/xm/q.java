package xm;

import ezvcard.property.Gender;
import java.nio.ByteBuffer;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\bH&¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u0004\u0018\u00010 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001e¨\u0006&"}, d2 = {"Lxm/q;", "", "Ljn0/h0;", "close", "()V", "", "isClosed", "()Z", "", "memoryOffset", "", "byteArray", "byteArrayOffset", "count", "n", "(I[BII)I", Gender.MALE, "offset", "", "Q", "(I)B", "other", "otherOffset", "o", "(ILxm/q;II)V", "getSize", "()I", "size", "", "getNativePtr", "()J", "nativePtr", "Ljava/nio/ByteBuffer;", "g", "()Ljava/nio/ByteBuffer;", "byteBuffer", "c", "uniqueId", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface q {
    int M(int memoryOffset, byte[] byteArray, int byteArrayOffset, int count);

    byte Q(int offset);

    long c();

    void close();

    ByteBuffer g();

    long getNativePtr();

    int getSize();

    boolean isClosed();

    int n(int memoryOffset, byte[] byteArray, int byteArrayOffset, int count);

    void o(int offset, q other, int otherOffset, int count);
}
