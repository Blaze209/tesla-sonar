package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f14080a = true;

    static class a {
        static int a(ViewGroup viewGroup, int i11) {
            return viewGroup.getChildDrawingOrder(i11);
        }

        static void b(ViewGroup viewGroup, boolean z11) {
            viewGroup.suppressLayout(z11);
        }
    }

    @SuppressLint({"NewApi"})
    private static void a(@NonNull ViewGroup viewGroup, boolean z11) {
        if (f14080a) {
            try {
                a.b(viewGroup, z11);
            } catch (NoSuchMethodError unused) {
                f14080a = false;
            }
        }
    }

    static void b(@NonNull ViewGroup viewGroup, boolean z11) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(viewGroup, z11);
        } else {
            a(viewGroup, z11);
        }
    }
}
