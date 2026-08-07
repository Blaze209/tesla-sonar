package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class PlaybackException extends Exception implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f39394c = ts.p0.t0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f39395d = ts.p0.t0(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f39396e = ts.p0.t0(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f39397f = ts.p0.t0(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f39398g = ts.p0.t0(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g.a<PlaybackException> f39399h = new g.a() { // from class: com.google.android.exoplayer2.s1
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            return new PlaybackException(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39401b;

    protected PlaybackException(Bundle bundle) {
        this(bundle.getString(f39396e), c(bundle), bundle.getInt(f39394c, 1000), bundle.getLong(f39395d, SystemClock.elapsedRealtime()));
    }

    private static RemoteException a(String str) {
        return new RemoteException(str);
    }

    private static Throwable b(Class<?> cls, String str) {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    private static Throwable c(Bundle bundle) {
        String string = bundle.getString(f39397f);
        String string2 = bundle.getString(f39398g);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, PlaybackException.class.getClassLoader());
            Throwable thB = Throwable.class.isAssignableFrom(cls) ? b(cls, string2) : null;
            return thB == null ? a(string2) : thB;
        } catch (Throwable unused) {
            return a(string2);
        }
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f39394c, this.f39400a);
        bundle.putLong(f39395d, this.f39401b);
        bundle.putString(f39396e, getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(f39397f, cause.getClass().getName());
            bundle.putString(f39398g, cause.getMessage());
        }
        return bundle;
    }

    protected PlaybackException(String str, Throwable th2, int i11, long j11) {
        super(str, th2);
        this.f39400a = i11;
        this.f39401b = j11;
    }
}
