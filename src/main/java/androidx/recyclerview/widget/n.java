package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final m f13560a = new n();

    n() {
    }

    private static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f11 = BitmapDescriptorFactory.HUE_RED;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            if (childAt != view) {
                float fV = ViewCompat.v(childAt);
                if (fV > f11) {
                    f11 = fV;
                }
            }
        }
        return f11;
    }

    @Override // androidx.recyclerview.widget.m
    public void a(@NonNull View view) {
    }

    @Override // androidx.recyclerview.widget.m
    public void b(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull View view, float f11, float f12, int i11, boolean z11) {
        if (z11 && view.getTag(qa.c.f105276a) == null) {
            Float fValueOf = Float.valueOf(ViewCompat.v(view));
            ViewCompat.x0(view, e(recyclerView, view) + 1.0f);
            view.setTag(qa.c.f105276a, fValueOf);
        }
        view.setTranslationX(f11);
        view.setTranslationY(f12);
    }

    @Override // androidx.recyclerview.widget.m
    public void c(@NonNull View view) {
        Object tag = view.getTag(qa.c.f105276a);
        if (tag instanceof Float) {
            ViewCompat.x0(view, ((Float) tag).floatValue());
        }
        view.setTag(qa.c.f105276a, null);
        view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // androidx.recyclerview.widget.m
    public void d(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull View view, float f11, float f12, int i11, boolean z11) {
    }
}
