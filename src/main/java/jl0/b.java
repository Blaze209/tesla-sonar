package jl0;

import java.nio.ByteBuffer;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Ljl0/b;", "Ljl0/a;", "<init>", "()V", "", "size", "Ljl0/c;", "b", "(I)Ljava/nio/ByteBuffer;", "instance", "Ljn0/h0;", "a", "(Ljava/nio/ByteBuffer;)V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f83979a = new b();

    private b() {
    }

    @Override // jl0.a
    public void a(ByteBuffer instance) {
        s.k(instance, "instance");
    }

    @Override // jl0.a
    public ByteBuffer b(int size) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size);
        s.j(byteBufferAllocate, "allocate(size)");
        return c.b(byteBufferAllocate);
    }
}
