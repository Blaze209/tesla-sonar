package androidx.work;

import android.content.Context;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/work/i;", "Landroidx/work/y0;", "<init>", "()V", "Landroid/content/Context;", "appContext", "", "workerClassName", "Landroidx/work/WorkerParameters;", "workerParameters", "", "e", "(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Ljava/lang/Void;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f14545a = new i();

    private i() {
    }

    @Override // androidx.work.y0
    public /* bridge */ /* synthetic */ y a(Context context, String str, WorkerParameters workerParameters) {
        return (y) e(context, str, workerParameters);
    }

    public Void e(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        p013kotlin.jvm.internal.s.k(appContext, "appContext");
        p013kotlin.jvm.internal.s.k(workerClassName, "workerClassName");
        p013kotlin.jvm.internal.s.k(workerParameters, "workerParameters");
        return null;
    }
}
