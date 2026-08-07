package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f45042b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static i f45043c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yu.n f45044a;

    private i() {
    }

    @NonNull
    @KeepForSdk
    public static i c() {
        i iVar;
        synchronized (f45042b) {
            Preconditions.checkState(f45043c != null, "MlKitContext has not been initialized");
            iVar = (i) Preconditions.checkNotNull(f45043c);
        }
        return iVar;
    }

    @NonNull
    public static i d(@NonNull Context context) {
        i iVarE;
        synchronized (f45042b) {
            iVarE = e(context, TaskExecutors.MAIN_THREAD);
        }
        return iVarE;
    }

    @NonNull
    public static i e(@NonNull Context context, @NonNull Executor executor) {
        i iVar;
        synchronized (f45042b) {
            Preconditions.checkState(f45043c == null, "MlKitContext is already initialized");
            i iVar2 = new i();
            f45043c = iVar2;
            Context contextF = f(context);
            yu.n nVarE = yu.n.m(executor).d(yu.f.c(contextF, MlKitComponentDiscoveryService.class).b()).b(yu.c.q(contextF, Context.class, new Class[0])).b(yu.c.q(iVar2, i.class, new Class[0])).e();
            iVar2.f45044a = nVarE;
            nVarE.p(true);
            iVar = f45043c;
        }
        return iVar;
    }

    private static Context f(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    @NonNull
    @KeepForSdk
    public <T> T a(@NonNull Class<T> cls) {
        Preconditions.checkState(f45043c == this, "MlKitContext has been deleted");
        Preconditions.checkNotNull(this.f45044a);
        return (T) this.f45044a.a(cls);
    }

    @NonNull
    @KeepForSdk
    public Context b() {
        return (Context) a(Context.class);
    }
}
