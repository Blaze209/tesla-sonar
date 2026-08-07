package io.sentry.util;

import io.sentry.ILogger;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    @FunctionalInterface
    public interface a<T> {
        void accept(T t11);
    }

    @FunctionalInterface
    public interface b {
        void a(Object obj, Class<?> cls);
    }

    @FunctionalInterface
    public interface c<T> {
        void accept(T t11);
    }

    public static /* synthetic */ void c(Object obj, Class cls) {
    }

    public static /* synthetic */ void d(Object obj) {
    }

    public static io.sentry.h0 e(Object obj) {
        io.sentry.h0 h0Var = new io.sentry.h0();
        p(h0Var, obj);
        return h0Var;
    }

    public static io.sentry.hints.h f(io.sentry.h0 h0Var) {
        return (io.sentry.hints.h) h0Var.d("sentry:eventDropReason", io.sentry.hints.h.class);
    }

    public static Object g(io.sentry.h0 h0Var) {
        return h0Var.c("sentry:typeCheckHint");
    }

    public static boolean h(io.sentry.h0 h0Var, Class<?> cls) {
        return cls.isInstance(g(h0Var));
    }

    public static boolean i(io.sentry.h0 h0Var) {
        return Boolean.TRUE.equals(h0Var.d("sentry:isFromHybridSdk", Boolean.class));
    }

    public static <T> void j(io.sentry.h0 h0Var, Class<T> cls, final c<Object> cVar) {
        l(h0Var, cls, new a() { // from class: io.sentry.util.l
            @Override // io.sentry.util.n.a
            public final void accept(Object obj) {
                n.d(obj);
            }
        }, new b() { // from class: io.sentry.util.m
            @Override // io.sentry.util.n.b
            public final void a(Object obj, Class cls2) {
                cVar.accept(obj);
            }
        });
    }

    public static <T> void k(io.sentry.h0 h0Var, Class<T> cls, a<T> aVar) {
        l(h0Var, cls, aVar, new b() { // from class: io.sentry.util.j
            @Override // io.sentry.util.n.b
            public final void a(Object obj, Class cls2) {
                n.c(obj, cls2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void l(io.sentry.h0 h0Var, Class<T> cls, a<T> aVar, b bVar) {
        Object objG = g(h0Var);
        if (!h(h0Var, cls) || objG == null) {
            bVar.a(objG, cls);
        } else {
            aVar.accept(objG);
        }
    }

    public static <T> void m(io.sentry.h0 h0Var, Class<T> cls, final ILogger iLogger, a<T> aVar) {
        l(h0Var, cls, aVar, new b() { // from class: io.sentry.util.k
            @Override // io.sentry.util.n.b
            public final void a(Object obj, Class cls2) {
                v.a(cls2, obj, iLogger);
            }
        });
    }

    public static void n(io.sentry.h0 h0Var, io.sentry.hints.h hVar) {
        h0Var.k("sentry:eventDropReason", hVar);
    }

    public static void o(io.sentry.h0 h0Var, String str) {
        if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
            h0Var.k("sentry:isFromHybridSdk", Boolean.TRUE);
        }
    }

    public static void p(io.sentry.h0 h0Var, Object obj) {
        h0Var.k("sentry:typeCheckHint", obj);
    }

    public static boolean q(io.sentry.h0 h0Var) {
        return !(h(h0Var, io.sentry.hints.e.class) || h(h0Var, io.sentry.hints.c.class)) || h(h0Var, io.sentry.hints.b.class);
    }
}
