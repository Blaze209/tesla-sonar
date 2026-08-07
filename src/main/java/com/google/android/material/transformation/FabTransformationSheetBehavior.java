package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import at.i;
import at.k;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.Map;
import zs.b;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<View, Integer> f43124i;

    public FabTransformationSheetBehavior() {
    }

    private void k0(@NonNull View view, boolean z11) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z11) {
                this.f43124i = new HashMap(childCount);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                boolean z12 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z12) {
                    if (z11) {
                        this.f43124i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        ViewCompat.z0(childAt, 4);
                    } else {
                        Map<View, Integer> map = this.f43124i;
                        if (map != null && map.containsKey(childAt)) {
                            ViewCompat.z0(childAt, this.f43124i.get(childAt).intValue());
                        }
                    }
                }
            }
            if (z11) {
                return;
            }
            this.f43124i = null;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    protected boolean L(@NonNull View view, @NonNull View view2, boolean z11, boolean z12) {
        k0(view2, z11);
        return super.L(view, view2, z11, z12);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @NonNull
    protected FabTransformationBehavior.e i0(Context context, boolean z11) {
        int i11 = z11 ? b.f128554h : b.f128553g;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f43117a = i.d(context, i11);
        eVar.f43118b = new k(17, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
