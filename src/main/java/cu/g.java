package cu;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"RestrictedApi"})
public final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f59179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f59180b = new Handler(Looper.getMainLooper());

    g(l lVar) {
        this.f59179a = lVar;
    }

    @Override // cu.b
    @NonNull
    public final Task<Void> a(@NonNull Activity activity, @NonNull a aVar) {
        if (aVar.b()) {
            return Tasks.forResult(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", aVar.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new f(this, this.f59180b, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }

    @Override // cu.b
    @NonNull
    public final Task<a> b() {
        return this.f59179a.a();
    }
}
