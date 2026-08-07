package androidx.room;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/room/q0;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ljava/lang/Runnable;", "command", "Ljn0/h0;", "execute", "(Ljava/lang/Runnable;)V", DateTokenConverter.CONVERTER_KEY, "()V", "a", "Ljava/util/concurrent/Executor;", "Ljava/util/ArrayDeque;", "b", "Ljava/util/ArrayDeque;", "tasks", "c", "Ljava/lang/Runnable;", "active", "", "Ljava/lang/Object;", "syncLock", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Executor executor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<Runnable> tasks;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Runnable active;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object syncLock;

    public q0(Executor executor) {
        p013kotlin.jvm.internal.s.k(executor, "executor");
        this.executor = executor;
        this.tasks = new ArrayDeque<>();
        this.syncLock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Runnable runnable, q0 q0Var) {
        try {
            runnable.run();
        } finally {
            q0Var.d();
        }
    }

    public final void d() {
        synchronized (this.syncLock) {
            try {
                Runnable runnablePoll = this.tasks.poll();
                Runnable runnable = runnablePoll;
                this.active = runnable;
                if (runnablePoll != null) {
                    this.executor.execute(runnable);
                }
                jn0.h0 h0Var = jn0.h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable command) {
        p013kotlin.jvm.internal.s.k(command, "command");
        synchronized (this.syncLock) {
            try {
                this.tasks.offer(new Runnable() { // from class: androidx.room.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        q0.b(command, this);
                    }
                });
                if (this.active == null) {
                    d();
                }
                jn0.h0 h0Var = jn0.h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
