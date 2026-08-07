package pl;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: pl.a$a, reason: collision with other inner class name */
    public static class C2191a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f103167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f103168b;
    }

    private static boolean a(int i11) {
        return i11 == 0 || i11 == -2;
    }

    public static void b(C2191a c2191a, float f11, ViewGroup.LayoutParams layoutParams, int i11, int i12) {
        if (f11 <= BitmapDescriptorFactory.HUE_RED || layoutParams == null) {
            return;
        }
        if (a(layoutParams.height)) {
            c2191a.f103168b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c2191a.f103167a) - i11) / f11) + i12), c2191a.f103168b), 1073741824);
        } else if (a(layoutParams.width)) {
            c2191a.f103167a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c2191a.f103168b) - i12) * f11) + i11), c2191a.f103167a), 1073741824);
        }
    }
}
