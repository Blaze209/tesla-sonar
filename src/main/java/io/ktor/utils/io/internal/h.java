package io.ktor.utils.io.internal;

import java.nio.ByteBuffer;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Ljava/nio/ByteBuffer;", "a", "Ljava/nio/ByteBuffer;", "()Ljava/nio/ByteBuffer;", "EmptyByteBuffer", "Lio/ktor/utils/io/internal/i;", "b", "Lio/ktor/utils/io/internal/i;", "()Lio/ktor/utils/io/internal/i;", "EmptyCapacity", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ByteBuffer f78766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i f78767b;

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        s.j(byteBufferAllocate, "allocate(0)");
        f78766a = byteBufferAllocate;
        f78767b = new i(0);
    }

    public static final ByteBuffer a() {
        return f78766a;
    }

    public static final i b() {
        return f78767b;
    }
}
