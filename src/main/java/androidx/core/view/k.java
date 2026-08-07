package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static void a(int i11, int i12, int i13, Rect rect, Rect rect2, int i14) {
        Gravity.apply(i11, i12, i13, rect, rect2, i14);
    }

    public static int b(int i11, int i12) {
        return Gravity.getAbsoluteGravity(i11, i12);
    }
}
