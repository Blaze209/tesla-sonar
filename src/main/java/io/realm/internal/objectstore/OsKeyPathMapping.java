package io.realm.internal.objectstore;

import io.realm.internal.g;
import io.realm.internal.h;

/* JADX INFO: loaded from: classes9.dex */
public class OsKeyPathMapping implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f79101b = nativeGetFinalizerMethodPtr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f79102a;

    public OsKeyPathMapping(long j11) {
        this.f79102a = -1L;
        this.f79102a = nativeCreateMapping(j11);
        g.f79082c.a(this);
    }

    private static native long nativeCreateMapping(long j11);

    private static native long nativeGetFinalizerMethodPtr();

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f79101b;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f79102a;
    }
}
