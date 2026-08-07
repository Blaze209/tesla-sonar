package gb;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public class b {
    public static <T extends View> T a(View view, int i11) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            T t11 = (T) viewGroup.getChildAt(i12).findViewById(i11);
            if (t11 != null) {
                return t11;
            }
        }
        return null;
    }
}
