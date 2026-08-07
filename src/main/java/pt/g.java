package pt;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class g {
    public static Typeface a(@NonNull Context context, @NonNull Typeface typeface) {
        return b(context.getResources().getConfiguration(), typeface);
    }

    public static Typeface b(@NonNull Configuration configuration, @NonNull Typeface typeface) {
        int i11;
        if (Build.VERSION.SDK_INT < 31 || (i11 = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i11 == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, o5.a.b(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
