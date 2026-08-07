package oi0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Loi0/e;", "Loi0/p5;", "uiComponentHelper", "Landroid/view/View;", "b", "(Loi0/e;Loi0/p5;)Landroid/view/View;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class g {
    public static final View b(BrandingComponent brandingComponent, p5 uiComponentHelper) {
        p013kotlin.jvm.internal.s.k(brandingComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        Context context = uiComponentHelper.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String();
        if (!brandingComponent.getShowBranding()) {
            return null;
        }
        final ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        shapeableImageView.setImageResource(mi0.d.f92154b);
        shapeableImageView.setAdjustViewBounds(true);
        int dimension = (int) context.getResources().getDimension(yh0.k.f125513b);
        shapeableImageView.setPadding(dimension, shapeableImageView.getPaddingTop(), dimension, shapeableImageView.getPaddingBottom());
        uiComponentHelper.d(new wn0.a() { // from class: oi0.f
            @Override // wn0.a
            public final Object invoke() {
                return g.c(shapeableImageView);
            }
        });
        return shapeableImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(ShapeableImageView shapeableImageView) {
        ViewGroup.LayoutParams layoutParams = shapeableImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.G = 1.0f;
        ((ViewGroup.MarginLayoutParams) bVar).width = -2;
        ((ViewGroup.MarginLayoutParams) bVar).height = -2;
        shapeableImageView.setLayoutParams(bVar);
        return jn0.h0.f84049a;
    }
}
