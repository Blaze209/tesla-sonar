package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ExoPlaybackException extends PlaybackException {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final g.a<ExoPlaybackException> f39374p = new g.a() { // from class: br.h
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return ExoPlaybackException.d(bundle);
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f39375q = ts.p0.t0(1001);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f39376r = ts.p0.t0(1002);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f39377s = ts.p0.t0(1003);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f39378t = ts.p0.t0(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f39379u = ts.p0.t0(1005);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f39380v = ts.p0.t0(1006);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f39381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f39382j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f39383k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u0 f39384l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f39385m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final es.j f39386n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f39387o;

    private ExoPlaybackException(int i11, Throwable th2, int i12) {
        this(i11, th2, null, i12, null, -1, null, 4, false);
    }

    public static /* synthetic */ ExoPlaybackException d(Bundle bundle) {
        return new ExoPlaybackException(bundle);
    }

    public static ExoPlaybackException f(Throwable th2, String str, int i11, u0 u0Var, int i12, boolean z11, int i13) {
        if (u0Var == null) {
            i12 = 4;
        }
        return new ExoPlaybackException(1, th2, null, i13, str, i11, u0Var, i12, z11);
    }

    public static ExoPlaybackException g(IOException iOException, int i11) {
        return new ExoPlaybackException(0, iOException, i11);
    }

    @Deprecated
    public static ExoPlaybackException h(RuntimeException runtimeException) {
        return i(runtimeException, 1000);
    }

    public static ExoPlaybackException i(RuntimeException runtimeException, int i11) {
        return new ExoPlaybackException(2, runtimeException, i11);
    }

    private static String j(int i11, String str, String str2, int i12, u0 u0Var, int i13) {
        String str3;
        if (i11 == 0) {
            str3 = "Source error";
        } else if (i11 != 1) {
            str3 = i11 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i12 + ", format=" + u0Var + ", format_supported=" + ts.p0.U(i13);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    ExoPlaybackException e(es.j jVar) {
        return new ExoPlaybackException((String) ts.p0.j(getMessage()), getCause(), this.f39400a, this.f39381i, this.f39382j, this.f39383k, this.f39384l, this.f39385m, jVar, this.f39401b, this.f39387o);
    }

    @Override // com.google.android.exoplayer2.PlaybackException, com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putInt(f39375q, this.f39381i);
        bundle.putString(f39376r, this.f39382j);
        bundle.putInt(f39377s, this.f39383k);
        u0 u0Var = this.f39384l;
        if (u0Var != null) {
            bundle.putBundle(f39378t, u0Var.toBundle());
        }
        bundle.putInt(f39379u, this.f39385m);
        bundle.putBoolean(f39380v, this.f39387o);
        return bundle;
    }

    private ExoPlaybackException(int i11, Throwable th2, String str, int i12, String str2, int i13, u0 u0Var, int i14, boolean z11) {
        this(j(i11, str, str2, i13, u0Var, i14), th2, i12, i11, str2, i13, u0Var, i14, null, SystemClock.elapsedRealtime(), z11);
    }

    private ExoPlaybackException(Bundle bundle) {
        super(bundle);
        this.f39381i = bundle.getInt(f39375q, 2);
        this.f39382j = bundle.getString(f39376r);
        this.f39383k = bundle.getInt(f39377s, -1);
        Bundle bundle2 = bundle.getBundle(f39378t);
        this.f39384l = bundle2 == null ? null : (u0) u0.f40700p0.a(bundle2);
        this.f39385m = bundle.getInt(f39379u, 4);
        this.f39387o = bundle.getBoolean(f39380v, false);
        this.f39386n = null;
    }

    private ExoPlaybackException(String str, Throwable th2, int i11, int i12, String str2, int i13, u0 u0Var, int i14, es.j jVar, long j11, boolean z11) {
        super(str, th2, i11, j11);
        ts.a.a(!z11 || i12 == 1);
        ts.a.a(th2 != null || i12 == 3);
        this.f39381i = i12;
        this.f39382j = str2;
        this.f39383k = i13;
        this.f39384l = u0Var;
        this.f39385m = i14;
        this.f39386n = jVar;
        this.f39387o = z11;
    }
}
