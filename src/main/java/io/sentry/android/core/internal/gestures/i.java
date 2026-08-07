package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f79454a = new int[2];

    static io.sentry.internal.gestures.b a(SentryAndroidOptions sentryAndroidOptions, View view, float f11, float f12, io.sentry.internal.gestures.b.a aVar) {
        List<io.sentry.internal.gestures.a> gestureTargetLocators = sentryAndroidOptions.getGestureTargetLocators();
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        io.sentry.internal.gestures.b bVar = null;
        while (linkedList.size() > 0) {
            View view2 = (View) linkedList.poll();
            if (d(view2, f11, f12)) {
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                        linkedList.add(viewGroup.getChildAt(i11));
                    }
                }
                for (int i12 = 0; i12 < gestureTargetLocators.size(); i12++) {
                    io.sentry.internal.gestures.b bVarA = gestureTargetLocators.get(i12).a(view2, f11, f12, aVar);
                    if (bVarA != null) {
                        if (aVar == io.sentry.internal.gestures.b.a.CLICKABLE) {
                            bVar = bVarA;
                        } else if (aVar == io.sentry.internal.gestures.b.a.SCROLLABLE) {
                            return bVarA;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public static String b(View view) {
        int id2 = view.getId();
        if (id2 == -1 || c(id2)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id2) : "";
    }

    private static boolean c(int i11) {
        return ((-16777216) & i11) == 0 && (i11 & 16777215) != 0;
    }

    private static boolean d(View view, float f11, float f12) {
        if (view == null) {
            return false;
        }
        int[] iArr = f79454a;
        view.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        return f11 >= ((float) i11) && f11 <= ((float) (i11 + view.getWidth())) && f12 >= ((float) i12) && f12 <= ((float) (i12 + view.getHeight()));
    }
}
