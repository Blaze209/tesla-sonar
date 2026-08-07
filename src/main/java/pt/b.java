package pt;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class b {
    public static TypedValue a(@NonNull Context context, int i11) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i11, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(@NonNull Context context, int i11, boolean z11) {
        TypedValue typedValueA = a(context, i11);
        if (typedValueA == null || typedValueA.type != 18) {
            return z11;
        }
        return typedValueA.data != 0;
    }

    public static int c(@NonNull Context context, int i11, int i12) {
        TypedValue typedValueA = a(context, i11);
        return (typedValueA == null || typedValueA.type != 16) ? i12 : typedValueA.data;
    }

    public static int d(@NonNull Context context, int i11, @NonNull String str) {
        return e(context, i11, str).data;
    }

    @NonNull
    public static TypedValue e(@NonNull Context context, int i11, @NonNull String str) {
        TypedValue typedValueA = a(context, i11);
        if (typedValueA != null) {
            return typedValueA;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i11)));
    }

    @NonNull
    public static TypedValue f(@NonNull View view, int i11) {
        return e(view.getContext(), i11, view.getClass().getCanonicalName());
    }
}
