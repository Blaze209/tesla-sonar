package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class IllegalSeekPositionException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f39389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39391c;

    public IllegalSeekPositionException(f2 f2Var, int i11, long j11) {
        this.f39389a = f2Var;
        this.f39390b = i11;
        this.f39391c = j11;
    }
}
