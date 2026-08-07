package com.google.protobuf;

import java.nio.Buffer;

/* JADX INFO: loaded from: classes6.dex */
final class Java8Compatibility {
    private Java8Compatibility() {
    }

    static void clear(Buffer buffer) {
        buffer.clear();
    }

    static void flip(Buffer buffer) {
        buffer.flip();
    }

    static void limit(Buffer buffer, int i11) {
        buffer.limit(i11);
    }

    static void mark(Buffer buffer) {
        buffer.mark();
    }

    static void position(Buffer buffer, int i11) {
        buffer.position(i11);
    }

    static void reset(Buffer buffer) {
        buffer.reset();
    }
}
