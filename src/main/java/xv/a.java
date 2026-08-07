package xv;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public interface a {

    /* JADX INFO: renamed from: xv.a$a, reason: collision with other inner class name */
    @KeepForSdk
    public interface InterfaceC2685a {
    }

    @KeepForSdk
    void a(@NonNull String str, @NonNull String str2);

    @KeepForSdk
    void b(InterfaceC2685a interfaceC2685a);

    @NonNull
    @KeepForSdk
    Task<String> c();

    @KeepForSdk
    String getToken();
}
