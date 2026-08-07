package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import yu.a0;
import yu.t;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final t<ScheduledExecutorService> f43870a = new t<>(new yv.b() { // from class: zu.a
        @Override // yv.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final t<ScheduledExecutorService> f43871b = new t<>(new yv.b() { // from class: zu.b
        @Override // yv.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.l())));
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final t<ScheduledExecutorService> f43872c = new t<>(new yv.b() { // from class: zu.c
        @Override // yv.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final t<ScheduledExecutorService> f43873d = new t<>(new yv.b() { // from class: zu.d
        @Override // yv.b
        public final Object get() {
            return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
        }
    });

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i11 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i11 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i11) {
        return new b(str, i11, null);
    }

    private static ThreadFactory k(String str, int i11, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i11, threadPolicy);
    }

    private static StrictMode.ThreadPolicy l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledExecutorService m(ExecutorService executorService) {
        return new o(executorService, f43873d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<yu.c<?>> getComponents() {
        return Arrays.asList(yu.c.f(a0.a(xu.a.class, ScheduledExecutorService.class), a0.a(xu.a.class, ExecutorService.class), a0.a(xu.a.class, Executor.class)).f(new yu.g() { // from class: zu.e
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return ExecutorsRegistrar.f43870a.get();
            }
        }).d(), yu.c.f(a0.a(xu.b.class, ScheduledExecutorService.class), a0.a(xu.b.class, ExecutorService.class), a0.a(xu.b.class, Executor.class)).f(new yu.g() { // from class: zu.f
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return ExecutorsRegistrar.f43872c.get();
            }
        }).d(), yu.c.f(a0.a(xu.c.class, ScheduledExecutorService.class), a0.a(xu.c.class, ExecutorService.class), a0.a(xu.c.class, Executor.class)).f(new yu.g() { // from class: zu.g
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return ExecutorsRegistrar.f43871b.get();
            }
        }).d(), yu.c.e(a0.a(xu.d.class, Executor.class)).f(new yu.g() { // from class: zu.h
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return k.INSTANCE;
            }
        }).d());
    }
}
