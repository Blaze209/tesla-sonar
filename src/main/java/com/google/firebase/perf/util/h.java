package com.google.firebase.perf.util;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public class h implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    private final Handler f44552a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<View> f44553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f44554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f44555d;

    private h(View view, Runnable runnable, Runnable runnable2) {
        this.f44553b = new AtomicReference<>(view);
        this.f44554c = runnable;
        this.f44555d = runnable2;
    }

    public static void a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new h(view, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View andSet = this.f44553b.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f44552a.post(this.f44554c);
        this.f44552a.postAtFrontOfQueue(this.f44555d);
        return true;
    }
}
