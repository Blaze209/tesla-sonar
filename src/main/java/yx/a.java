package yx;

import android.app.Activity;
import android.content.IntentSender;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes5.dex */
public interface a extends OptionalModuleApi {
    @NonNull
    Task<IntentSender> c(@NonNull Activity activity);
}
