package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f14363b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayoutManager f14364a;

    /* JADX INFO: renamed from: androidx.viewpager2.widget.a$a, reason: collision with other inner class name */
    class C0243a implements Comparator<int[]> {
        C0243a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f14363b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    a(@NonNull LinearLayoutManager linearLayoutManager) {
        this.f14364a = linearLayoutManager;
    }

    private boolean a() {
        int top;
        int i11;
        int bottom;
        int i12;
        int iP = this.f14364a.P();
        if (iP == 0) {
            return true;
        }
        boolean z11 = this.f14364a.r2() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iP, 2);
        for (int i13 = 0; i13 < iP; i13++) {
            View viewO = this.f14364a.O(i13);
            if (viewO == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = viewO.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f14363b;
            int[] iArr2 = iArr[i13];
            if (z11) {
                top = viewO.getLeft();
                i11 = marginLayoutParams.leftMargin;
            } else {
                top = viewO.getTop();
                i11 = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i11;
            int[] iArr3 = iArr[i13];
            if (z11) {
                bottom = viewO.getRight();
                i12 = marginLayoutParams.rightMargin;
            } else {
                bottom = viewO.getBottom();
                i12 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i12;
        }
        Arrays.sort(iArr, new C0243a());
        for (int i14 = 1; i14 < iP; i14++) {
            if (iArr[i14 - 1][1] != iArr[i14][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i15 = iArr4[1];
        int i16 = iArr4[0];
        return i16 <= 0 && iArr[iP - 1][1] >= i15 - i16;
    }

    private boolean b() {
        int iP = this.f14364a.P();
        for (int i11 = 0; i11 < iP; i11++) {
            if (c(this.f14364a.O(i11))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (c(viewGroup.getChildAt(i11))) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean d() {
        return (!a() || this.f14364a.P() <= 1) && b();
    }
}
