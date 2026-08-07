package cu;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import du.t;

/* JADX INFO: loaded from: classes5.dex */
class j extends du.g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final du.i f59183n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final TaskCompletionSource f59184o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final /* synthetic */ l f59185p;

    j(l lVar, du.i iVar, TaskCompletionSource taskCompletionSource) {
        this.f59185p = lVar;
        this.f59183n = iVar;
        this.f59184o = taskCompletionSource;
    }

    @Override // du.h
    public void zzb(Bundle bundle) {
        t tVar = this.f59185p.f59187a;
        if (tVar != null) {
            tVar.u(this.f59184o);
        }
        this.f59183n.c("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
