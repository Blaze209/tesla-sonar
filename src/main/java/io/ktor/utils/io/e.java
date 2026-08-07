package io.ktor.utils.io;

import java.nio.ByteBuffer;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "autoFlush", "Lio/ktor/utils/io/c;", "a", "(Z)Lio/ktor/utils/io/c;", "", "content", "", "offset", "length", "Lio/ktor/utils/io/g;", "c", "([BII)Lio/ktor/utils/io/g;", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {
    public static final c a(boolean z11) {
        return new ByteBufferChannel(z11, null, 0, 6, null);
    }

    public static /* synthetic */ c b(boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return a(z11);
    }

    public static final g c(byte[] content, int i11, int i12) {
        p013kotlin.jvm.internal.s.k(content, "content");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(content, i11, i12);
        p013kotlin.jvm.internal.s.j(byteBufferWrap, "wrap(content, offset, length)");
        return new ByteBufferChannel(byteBufferWrap);
    }
}
