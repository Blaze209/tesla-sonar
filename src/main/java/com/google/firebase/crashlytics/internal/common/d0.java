package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
class d0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f43951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lv.j f43952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f43953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bv.a f43954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f43955e = new AtomicBoolean(false);

    interface a {
        void a(lv.j jVar, Thread thread, Throwable th2);
    }

    public d0(a aVar, lv.j jVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, bv.a aVar2) {
        this.f43951a = aVar;
        this.f43952b = jVar;
        this.f43953c = uncaughtExceptionHandler;
        this.f43954d = aVar2;
    }

    private boolean b(Thread thread, Throwable th2) {
        if (thread == null) {
            bv.g.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th2 == null) {
            bv.g.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f43954d.c()) {
            return true;
        }
        bv.g.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    boolean a() {
        return this.f43955e.get();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:577)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:603)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        this.f43955e.set(true);
        try {
            try {
                if (b(thread, th2)) {
                    this.f43951a.a(this.f43952b, thread, th2);
                } else {
                    bv.g.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
                if (this.f43953c != null) {
                    bv.g.f().b("Completed exception processing. Invoking default exception handler.");
                    this.f43953c.uncaughtException(thread, th2);
                } else {
                    bv.g.f().b("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
            } catch (Exception e11) {
                bv.g.f().e("An error occurred in the uncaught exception handler", e11);
                if (this.f43953c == null) {
                    bv.g.f().b("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
            }
            this.f43955e.set(false);
        } catch (Throwable th3) {
            if (this.f43953c != null) {
                bv.g.f().b("Completed exception processing. Invoking default exception handler.");
                this.f43953c.uncaughtException(thread, th2);
            } else {
                bv.g.f().b("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f43955e.set(false);
            throw th3;
        }
    }
}
