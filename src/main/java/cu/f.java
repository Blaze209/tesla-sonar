package cu;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
final class f extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f59178a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f59178a = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i11, Bundle bundle) {
        this.f59178a.trySetResult(null);
    }
}
