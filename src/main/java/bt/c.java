package bt;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.internal.r;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f18107a = false;

    public static void a(@NonNull a aVar, @NonNull View view, FrameLayout frameLayout) {
        e(aVar, view, frameLayout);
        if (aVar.l() != null) {
            aVar.l().setForeground(aVar);
        } else {
            if (f18107a) {
                throw new IllegalArgumentException("Trying to reference null customBadgeParent");
            }
            view.getOverlay().add(aVar);
        }
    }

    @NonNull
    public static SparseArray<a> b(Context context, @NonNull r rVar) {
        SparseArray<a> sparseArray = new SparseArray<>(rVar.size());
        for (int i11 = 0; i11 < rVar.size(); i11++) {
            int iKeyAt = rVar.keyAt(i11);
            b.a aVar = (b.a) rVar.valueAt(i11);
            sparseArray.put(iKeyAt, aVar != null ? a.g(context, aVar) : null);
        }
        return sparseArray;
    }

    @NonNull
    public static r c(@NonNull SparseArray<a> sparseArray) {
        r rVar = new r();
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            int iKeyAt = sparseArray.keyAt(i11);
            a aVarValueAt = sparseArray.valueAt(i11);
            rVar.put(iKeyAt, aVarValueAt != null ? aVarValueAt.v() : null);
        }
        return rVar;
    }

    public static void d(a aVar, @NonNull View view) {
        if (aVar == null) {
            return;
        }
        if (f18107a || aVar.l() != null) {
            aVar.l().setForeground(null);
        } else {
            view.getOverlay().remove(aVar);
        }
    }

    public static void e(@NonNull a aVar, @NonNull View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.Z(view, frameLayout);
    }

    public static void f(@NonNull Rect rect, float f11, float f12, float f13, float f14) {
        rect.set((int) (f11 - f13), (int) (f12 - f14), (int) (f11 + f13), (int) (f12 + f14));
    }
}
