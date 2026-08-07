package androidx.media3.common;

import p7.r0;

/* JADX INFO: loaded from: classes.dex */
public final class IllegalSeekPositionException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f9007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9009c;

    public IllegalSeekPositionException(r0 r0Var, int i11, long j11) {
        this.f9007a = r0Var;
        this.f9008b = i11;
        this.f9009c = j11;
    }
}
