package com.facebook.common.memory;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface PooledByteBuffer extends Closeable {

    public static class ClosedException extends RuntimeException {
        public ClosedException() {
            super("Invalid bytebuf. Already closed");
        }
    }

    int M(int i11, byte[] bArr, int i12, int i13);

    byte Q(int i11);

    ByteBuffer g();

    long getNativePtr();

    boolean isClosed();

    int size();
}
