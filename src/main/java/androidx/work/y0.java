package androidx.work;

import android.content.Context;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/work/y0;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "", "workerClassName", "Landroidx/work/WorkerParameters;", "workerParameters", "Landroidx/work/y;", "a", "(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/y;", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class y0 {
    private static final y c(Context context, String str, WorkerParameters workerParameters) {
        try {
            y yVarNewInstance = d(str).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            p013kotlin.jvm.internal.s.h(yVarNewInstance);
            return yVarNewInstance;
        } catch (Throwable th2) {
            z.e().d(z0.f14794a, "Could not instantiate " + str, th2);
            throw th2;
        }
    }

    private static final Class<? extends y> d(String str) {
        try {
            Class clsAsSubclass = Class.forName(str).asSubclass(y.class);
            p013kotlin.jvm.internal.s.h(clsAsSubclass);
            return clsAsSubclass;
        } catch (Throwable th2) {
            z.e().d(z0.f14794a, "Invalid class: " + str, th2);
            throw th2;
        }
    }

    public abstract y a(Context appContext, String workerClassName, WorkerParameters workerParameters);

    public final y b(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        p013kotlin.jvm.internal.s.k(appContext, "appContext");
        p013kotlin.jvm.internal.s.k(workerClassName, "workerClassName");
        p013kotlin.jvm.internal.s.k(workerParameters, "workerParameters");
        y yVarA = a(appContext, workerClassName, workerParameters);
        if (yVarA == null) {
            yVarA = c(appContext, workerClassName, workerParameters);
        }
        if (!yVarA.isUsed()) {
            return yVarA;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
