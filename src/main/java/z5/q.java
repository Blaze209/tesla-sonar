package z5;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: loaded from: classes.dex */
public class q {
    @Deprecated
    public static void a(AccessibilityRecord accessibilityRecord, int i11) {
        accessibilityRecord.setMaxScrollX(i11);
    }

    @Deprecated
    public static void b(AccessibilityRecord accessibilityRecord, int i11) {
        accessibilityRecord.setMaxScrollY(i11);
    }

    @Deprecated
    public static void c(AccessibilityRecord accessibilityRecord, View view, int i11) {
        accessibilityRecord.setSource(view, i11);
    }
}
