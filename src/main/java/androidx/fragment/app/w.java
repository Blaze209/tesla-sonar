package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    @NonNull
    @Deprecated
    public Fragment b(@NonNull Context context, @NonNull String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    public abstract View c(int i11);

    public abstract boolean d();
}
