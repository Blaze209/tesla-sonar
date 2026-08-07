package oi0;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponent;
import java.util.ArrayList;
import java.util.List;
import mi0.ComponentView;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Loi0/p5;", "uiComponentHelper", "", "Lmi0/a;", "componentViews", "Landroid/view/View;", "children", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;Loi0/p5;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack;)Landroidx/constraintlayout/widget/ConstraintLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class l {
    public static final ConstraintLayout b(ClickableStackComponent clickableStackComponent, p5 uiComponentHelper, List<ComponentView> componentViews, List<? extends View> children, ClickableStack config) {
        StyleElements.Axis axisValue;
        StyleElements.Size gapValue;
        Double dp2;
        p013kotlin.jvm.internal.s.k(clickableStackComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(componentViews, "componentViews");
        p013kotlin.jvm.internal.s.k(children, "children");
        p013kotlin.jvm.internal.s.k(config, "config");
        final ri0.e eVarC = ri0.e.c(uiComponentHelper.getLayoutInflater());
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.o(eVarC.getRoot());
        List<? extends View> list = children;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        for (View view : list) {
            view.setId(View.generateViewId());
            view.setSaveEnabled(false);
            eVarC.getRoot().addView(view);
            arrayList.add(Integer.valueOf(view.getId()));
        }
        final ClickableStack.ClickableStackComponentStyle styles = config.getStyles();
        int iA = (int) yh0.h.a((styles == null || (gapValue = styles.getGapValue()) == null || (dp2 = gapValue.getDp()) == null) ? 16.0d : dp2.doubleValue());
        if (styles == null || (axisValue = styles.getAxisValue()) == null) {
            axisValue = StyleElements.Axis.HORIZONTAL;
        }
        if (axisValue == StyleElements.Axis.HORIZONTAL) {
            ConstraintLayout root = eVarC.getRoot();
            p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
            d5.a(root, dVar, componentViews, arrayList, styles != null ? styles.getChildSizesValue() : null, styles != null ? styles.getAlignmentValue() : null, iA);
        } else {
            ConstraintLayout root2 = eVarC.getRoot();
            p013kotlin.jvm.internal.s.j(root2, "getRoot(...)");
            d5.b(root2, dVar, componentViews, arrayList, styles != null ? styles.getAlignmentValue() : null, iA);
        }
        if (styles != null) {
            uiComponentHelper.d(new wn0.a() { // from class: oi0.k
                @Override // wn0.a
                public final Object invoke() {
                    return l.c(eVarC, styles);
                }
            });
        }
        dVar.i(eVarC.getRoot());
        ConstraintLayout root3 = eVarC.getRoot();
        p013kotlin.jvm.internal.s.j(root3, "getRoot(...)");
        return root3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(ri0.e eVar, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle) {
        ConstraintLayout root = eVar.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        ui0.q.b(root, clickableStackComponentStyle);
        return jn0.h0.f84049a;
    }
}
