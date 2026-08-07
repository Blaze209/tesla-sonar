package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f9295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9296l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p7.u f9297m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f9298n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.r.b f9299o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final boolean f9300p;

    private ExoPlaybackException(int i11, Throwable th2, int i12) {
        this(i11, th2, null, i12, null, -1, null, 4, null, false);
    }

    public static ExoPlaybackException k(Throwable th2, String str, int i11, p7.u uVar, int i12, androidx.media3.exoplayer.source.r.b bVar, boolean z11, int i13) {
        if (uVar == null) {
            i12 = 4;
        }
        return new ExoPlaybackException(1, th2, null, i13, str, i11, uVar, i12, bVar, z11);
    }

    public static ExoPlaybackException l(IOException iOException, int i11) {
        return new ExoPlaybackException(0, iOException, i11);
    }

    public static ExoPlaybackException m(RuntimeException runtimeException, int i11) {
        return new ExoPlaybackException(2, runtimeException, i11);
    }

    private static String n(int i11, String str, String str2, int i12, p7.u uVar, int i13) {
        String str3;
        if (i11 == 0) {
            str3 = "Source error";
        } else if (i11 != 1) {
            str3 = i11 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i12 + ", format=" + uVar + ", format_supported=" + s7.q0.k0(i13);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    @Override // androidx.media3.common.PlaybackException
    public boolean c(PlaybackException playbackException) {
        if (!super.c(playbackException)) {
            return false;
        }
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) s7.q0.l(playbackException);
        return this.f9294j == exoPlaybackException.f9294j && Objects.equals(this.f9295k, exoPlaybackException.f9295k) && this.f9296l == exoPlaybackException.f9296l && Objects.equals(this.f9297m, exoPlaybackException.f9297m) && this.f9298n == exoPlaybackException.f9298n && Objects.equals(this.f9299o, exoPlaybackException.f9299o) && this.f9300p == exoPlaybackException.f9300p;
    }

    ExoPlaybackException j(androidx.media3.exoplayer.source.r.b bVar) {
        return new ExoPlaybackException((String) s7.q0.l(getMessage()), getCause(), this.f9018a, this.f9294j, this.f9295k, this.f9296l, this.f9297m, this.f9298n, bVar, this.f9019b, this.f9300p);
    }

    private ExoPlaybackException(int i11, Throwable th2, String str, int i12, String str2, int i13, p7.u uVar, int i14, androidx.media3.exoplayer.source.r.b bVar, boolean z11) {
        this(n(i11, str, str2, i13, uVar, i14), th2, i12, i11, str2, i13, uVar, i14, bVar, SystemClock.elapsedRealtime(), z11);
    }

    private ExoPlaybackException(String str, Throwable th2, int i11, int i12, String str2, int i13, p7.u uVar, int i14, androidx.media3.exoplayer.source.r.b bVar, long j11, boolean z11) {
        super(str, th2, i11, Bundle.EMPTY, j11);
        s7.a.a(!z11 || i12 == 1);
        s7.a.a(th2 != null || i12 == 3);
        this.f9294j = i12;
        this.f9295k = str2;
        this.f9296l = i13;
        this.f9297m = uVar;
        this.f9298n = i14;
        this.f9299o = bVar;
        this.f9300p = z11;
    }
}
