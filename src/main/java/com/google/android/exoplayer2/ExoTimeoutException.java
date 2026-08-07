package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ExoTimeoutException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39388a;

    public ExoTimeoutException(int i11) {
        super(a(i11));
        this.f39388a = i11;
    }

    private static String a(int i11) {
        if (i11 == 1) {
            return "Player release timed out.";
        }
        if (i11 != 2) {
            return i11 != 3 ? "Undefined timeout." : "Detaching surface timed out.";
        }
        return "Setting foreground mode timed out.";
    }
}
