package androidx.work;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/work/x0;", "", "", "workerClassName", "Landroidx/work/WorkerParameters;", "workerParameters", "", "throwable", "<init>", "(Ljava/lang/String;Landroidx/work/WorkerParameters;Ljava/lang/Throwable;)V", "a", "Ljava/lang/String;", "getWorkerClassName", "()Ljava/lang/String;", "b", "Landroidx/work/WorkerParameters;", "getWorkerParameters", "()Landroidx/work/WorkerParameters;", "c", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String workerClassName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final WorkerParameters workerParameters;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Throwable throwable;

    public x0(String workerClassName, WorkerParameters workerParameters, Throwable throwable) {
        p013kotlin.jvm.internal.s.k(workerClassName, "workerClassName");
        p013kotlin.jvm.internal.s.k(workerParameters, "workerParameters");
        p013kotlin.jvm.internal.s.k(throwable, "throwable");
        this.workerClassName = workerClassName;
        this.workerParameters = workerParameters;
        this.throwable = throwable;
    }
}
