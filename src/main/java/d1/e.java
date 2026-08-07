package d1;

import android.content.Context;
import android.media.AudioRecord;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static void a(@NonNull AudioRecord.Builder builder, @NonNull Context context) {
        builder.setContext(context);
    }
}
