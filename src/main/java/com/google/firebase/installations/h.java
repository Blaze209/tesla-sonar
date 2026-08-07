package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f44178b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f44179c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static h f44180d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dw.a f44181a;

    private h(dw.a aVar) {
        this.f44181a = aVar;
    }

    public static h c() {
        return d(dw.b.a());
    }

    public static h d(dw.a aVar) {
        if (f44180d == null) {
            f44180d = new h(aVar);
        }
        return f44180d;
    }

    static boolean g(String str) {
        return f44179c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f44181a.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(@NonNull bw.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f44178b;
    }
}
