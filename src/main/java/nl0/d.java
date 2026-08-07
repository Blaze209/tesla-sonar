package nl0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lnl0/d;", "Lnl0/c;", "Ljava/nio/ByteBuffer;", "", "capacity", "bufferSize", "<init>", "(II)V", "b0", "()Ljava/nio/ByteBuffer;", "instance", "T", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "Ljn0/h0;", "c0", "(Ljava/nio/ByteBuffer;)V", "h", "I", "getBufferSize", "()I", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends c<ByteBuffer> {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int bufferSize;

    public d(int i11, int i12) {
        super(i11);
        this.bufferSize = i12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nl0.c
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public ByteBuffer o(ByteBuffer instance) {
        s.k(instance, "instance");
        instance.clear();
        instance.order(ByteOrder.BIG_ENDIAN);
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nl0.c
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public ByteBuffer B() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.bufferSize);
        s.h(byteBufferAllocateDirect);
        return byteBufferAllocateDirect;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nl0.c
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void J(ByteBuffer instance) {
        s.k(instance, "instance");
        if (instance.capacity() != this.bufferSize) {
            throw new IllegalStateException("Check failed.");
        }
        if (!instance.isDirect()) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
