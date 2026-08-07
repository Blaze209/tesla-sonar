package com.facebook.imagepipeline.producers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/facebook/imagepipeline/producers/m1;", "Lcom/facebook/imagepipeline/producers/l1;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ljava/lang/Runnable;", "runnable", "Ljn0/h0;", "b", "(Ljava/lang/Runnable;)V", "a", "Ljava/util/concurrent/Executor;", "", "Z", "queueing", "Ljava/util/Deque;", "c", "Ljava/util/Deque;", "runnableList", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m1 implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Executor executor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean queueing;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Deque<Runnable> runnableList;

    public m1(Executor executor) {
        p013kotlin.jvm.internal.s.k(executor, "executor");
        this.executor = executor;
        this.runnableList = new ArrayDeque();
    }

    @Override // com.facebook.imagepipeline.producers.l1
    public synchronized void a(Runnable runnable) {
        p013kotlin.jvm.internal.s.k(runnable, "runnable");
        this.runnableList.remove(runnable);
    }

    @Override // com.facebook.imagepipeline.producers.l1
    public synchronized void b(Runnable runnable) {
        try {
            p013kotlin.jvm.internal.s.k(runnable, "runnable");
            if (this.queueing) {
                this.runnableList.add(runnable);
            } else {
                this.executor.execute(runnable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
