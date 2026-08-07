package expo.modules.fetch;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lexpo/modules/fetch/ResponseSink;", "", "<init>", "()V", "", "data", "Ljn0/h0;", "appendBufferBody$expo_release", "([B)V", "appendBufferBody", "finalize", "()[B", "", "bodyQueue", "Ljava/util/List;", "", "isFinalized", "Z", "value", "bodyUsed", "getBodyUsed", "()Z", "expo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResponseSink {
    private final List<byte[]> bodyQueue = new ArrayList();
    private boolean bodyUsed;
    private boolean isFinalized;

    public final void appendBufferBody$expo_release(byte[] data) {
        s.k(data, "data");
        this.bodyUsed = true;
        this.bodyQueue.add(data);
    }

    public final byte[] finalize() {
        Iterator<T> it = this.bodyQueue.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((byte[]) it.next()).length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        Iterator<byte[]> it2 = this.bodyQueue.iterator();
        while (it2.hasNext()) {
            byteBufferAllocate.put(it2.next());
        }
        this.bodyQueue.clear();
        this.bodyUsed = true;
        this.isFinalized = true;
        byte[] bArrArray = byteBufferAllocate.array();
        s.j(bArrArray, "array(...)");
        return bArrArray;
    }

    public final boolean getBodyUsed() {
        return this.bodyUsed;
    }
}
