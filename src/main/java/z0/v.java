package z0;

import android.net.Uri;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    @NonNull
    static v b(@NonNull Uri uri) {
        u5.h.h(uri, "OutputUri cannot be null.");
        return new h(uri);
    }

    @NonNull
    public abstract Uri a();
}
