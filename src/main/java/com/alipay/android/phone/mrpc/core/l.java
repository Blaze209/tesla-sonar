package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class l implements ad {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static l f20005b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ThreadFactory f20006i = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f20007a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ThreadPoolExecutor f20008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f20009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f20010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f20011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f20012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f20013h;

    public l(Context context) {
        this.f20007a = context;
        e();
    }

    private void e() {
        this.f20009d = b.a("android");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 11, 3L, TimeUnit.SECONDS, new ArrayBlockingQueue(20), f20006i, new ThreadPoolExecutor.CallerRunsPolicy());
        this.f20008c = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        CookieSyncManager.createInstance(this.f20007a);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    public b a() {
        return this.f20009d;
    }

    public long b() {
        long j11 = this.f20012g;
        if (j11 == 0) {
            return 0L;
        }
        return ((this.f20010e * 1000) / j11) >> 10;
    }

    public long c() {
        int i11 = this.f20013h;
        if (i11 == 0) {
            return 0L;
        }
        return this.f20011f / ((long) i11);
    }

    public String d() {
        return String.format("HttpManager" + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times", Integer.valueOf(this.f20008c.getActiveCount()), Long.valueOf(this.f20008c.getCompletedTaskCount()), Long.valueOf(this.f20008c.getTaskCount()), Long.valueOf(b()), Long.valueOf(c()), Long.valueOf(this.f20010e), Long.valueOf(this.f20011f), Long.valueOf(this.f20012g), Integer.valueOf(this.f20013h));
    }

    public static final l a(Context context) {
        l lVar = f20005b;
        return lVar != null ? lVar : b(context);
    }

    private static final synchronized l b(Context context) {
        l lVar = f20005b;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(context);
        f20005b = lVar2;
        return lVar2;
    }

    public void c(long j11) {
        this.f20012g += j11;
    }

    public q a(o oVar) {
        return new q(this, oVar);
    }

    public void b(long j11) {
        this.f20011f += j11;
        this.f20013h++;
    }

    @Override // com.alipay.android.phone.mrpc.core.ad
    public Future<v> a(u uVar) {
        if (!(uVar instanceof o)) {
            throw new RuntimeException("request send error.");
        }
        if (s.a(this.f20007a)) {
            Log.i("HttpManager", d());
        }
        FutureTask<v> futureTaskA = a(a((o) uVar));
        this.f20008c.execute(futureTaskA);
        return futureTaskA;
    }

    private FutureTask<v> a(q qVar) {
        return new m(this, qVar, qVar);
    }

    public void a(long j11) {
        this.f20010e += j11;
    }
}
