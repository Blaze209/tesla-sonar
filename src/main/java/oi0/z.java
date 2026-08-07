package oi0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.util.ArrayList;
import java.util.List;
import mi0.ComponentView;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Loi0/y;", "Loi0/p5;", "uiComponentHelper", "", "Lmi0/a;", "componentViews", "Landroid/view/View;", "children", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;", "config", "a", "(Loi0/y;Loi0/p5;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;)Landroid/view/View;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class z {
    public static final View a(FooterComponent footerComponent, p5 uiComponentHelper, List<ComponentView> componentViews, List<? extends View> children, Footer config) {
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        Double dp6;
        p013kotlin.jvm.internal.s.k(footerComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(componentViews, "componentViews");
        p013kotlin.jvm.internal.s.k(children, "children");
        p013kotlin.jvm.internal.s.k(config, "config");
        Context context = uiComponentHelper.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String();
        ri0.g gVarC = ri0.g.c(LayoutInflater.from(context));
        p013kotlin.jvm.internal.s.j(gVarC, "inflate(...)");
        Integer backgroundColor = config.getBackgroundColor();
        if (backgroundColor != null) {
            gVarC.f108344c.setBackgroundColor(backgroundColor.intValue());
        }
        StyleElements.SizeSet padding = config.getPadding();
        if (padding != null) {
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(yh0.k.f125513b);
            StyleElements.Size left = padding.getLeft();
            int iF = bo0.n.f((left == null || (dp6 = left.getDp()) == null) ? 0 : (int) yh0.h.a(dp6.doubleValue()), dimensionPixelOffset);
            StyleElements.Size right = padding.getRight();
            int iF2 = bo0.n.f((right == null || (dp5 = right.getDp()) == null) ? 0 : (int) yh0.h.a(dp5.doubleValue()), dimensionPixelOffset);
            ConstraintLayout constraintLayout = gVarC.f108345d;
            StyleElements.Size top = padding.getTop();
            int iA = (top == null || (dp4 = top.getDp()) == null) ? 0 : (int) yh0.h.a(dp4.doubleValue());
            StyleElements.Size bottom = padding.getBottom();
            constraintLayout.setPadding(iF, iA, iF2, (bottom == null || (dp3 = bottom.getDp()) == null) ? 0 : (int) yh0.h.a(dp3.doubleValue()));
        }
        StyleElements.SizeSet borderWidth = config.getBorderWidth();
        if (borderWidth != null) {
            View hairline = gVarC.f108347f;
            p013kotlin.jvm.internal.s.j(hairline, "hairline");
            ViewGroup.LayoutParams layoutParams = hairline.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            StyleElements.Size top2 = borderWidth.getTop();
            layoutParams.height = (top2 == null || (dp2 = top2.getDp()) == null) ? 0 : (int) yh0.h.a(dp2.doubleValue());
            hairline.setLayoutParams(layoutParams);
        } else {
            View hairline2 = gVarC.f108347f;
            p013kotlin.jvm.internal.s.j(hairline2, "hairline");
            ViewGroup.LayoutParams layoutParams2 = hairline2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = (int) yh0.h.a(1.0d);
            hairline2.setLayoutParams(layoutParams2);
        }
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.o(gVarC.f108345d);
        ConstraintLayout footerContainerInner = gVarC.f108345d;
        p013kotlin.jvm.internal.s.j(footerContainerInner, "footerContainerInner");
        List<? extends View> list = children;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        for (View view : list) {
            view.setId(View.generateViewId());
            view.setSaveEnabled(false);
            footerContainerInner.addView(view);
            arrayList.add(Integer.valueOf(view.getId()));
        }
        d5.b(footerContainerInner, dVar, componentViews, arrayList, StyleElements.PositionType.CENTER, 0);
        dVar.i(gVarC.f108345d);
        LinearLayout root = gVarC.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        return root;
    }
}
