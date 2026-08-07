package cu;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class c {
    @NonNull
    public static b a(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new g(new l(context));
    }
}
