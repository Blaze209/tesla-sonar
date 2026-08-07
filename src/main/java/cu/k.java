package cu;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
final class k extends j {
    k(l lVar, TaskCompletionSource taskCompletionSource, String str) {
        super(lVar, new du.i("OnRequestInstallCallback"), taskCompletionSource);
    }

    @Override // cu.j, du.h
    public final void zzb(Bundle bundle) {
        super.zzb(bundle);
        this.f59184o.trySetResult(new d((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
