package xl0;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f123708a;

    public b(float f11) {
        this.f123708a = f11;
    }

    @NonNull
    public static b a(@NonNull Context context) {
        return new b(context.getResources().getDisplayMetrics().density);
    }

    public int b(int i11) {
        return (int) ((i11 * this.f123708a) + 0.5f);
    }
}
