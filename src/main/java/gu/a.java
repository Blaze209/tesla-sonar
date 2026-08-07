package gu;

import android.app.PendingIntent;
import android.os.Bundle;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    public static a j(Bundle bundle) {
        return new c(bundle.getInt("session_id"), bundle.getInt(PermissionsResponse.STATUS_KEY), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public abstract long a();

    public abstract int b();

    @Deprecated
    public abstract PendingIntent c();

    public abstract int d();

    public abstract int e();

    public abstract long f();

    abstract List g();

    abstract List h();

    abstract List i();
}
