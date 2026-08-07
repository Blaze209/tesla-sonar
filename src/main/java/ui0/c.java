package ui0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroid/view/ViewGroup;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Landroid/view/View;", "innerView", "Landroid/graphics/Rect;", "viewBuiltInPadding", "Ljn0/h0;", "b", "(Landroid/view/ViewGroup;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Landroid/view/View;Landroid/graphics/Rect;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "cornerRadius", "Landroid/graphics/drawable/GradientDrawable;", DateTokenConverter.CONVERTER_KEY, "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;)Landroid/graphics/drawable/GradientDrawable;", "Landroid/graphics/drawable/Drawable;", "backgroundImage", "e", "(Landroid/view/ViewGroup;Landroid/graphics/drawable/Drawable;)V", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    public static final void b(ViewGroup viewGroup, StepStyle stepStyle, View innerView, Rect rect) {
        int iD;
        StyleElements.SizeSet modalPaddingValue;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        Integer backgroundColorValue;
        p013kotlin.jvm.internal.s.k(viewGroup, "<this>");
        p013kotlin.jvm.internal.s.k(innerView, "innerView");
        if (stepStyle == null || (backgroundColorValue = stepStyle.getBackgroundColorValue()) == null) {
            Context context = viewGroup.getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            iD = yh0.s.d(context, zs.c.f128599w, null, false, 6, null);
        } else {
            iD = backgroundColorValue.intValue();
        }
        viewGroup.setBackgroundTintList(ColorStateList.valueOf(iD));
        if (stepStyle != null) {
            Context context2 = viewGroup.getContext();
            p013kotlin.jvm.internal.s.j(context2, "getContext(...)");
            Drawable drawableA = wi0.c.a(stepStyle, context2);
            if (drawableA != null) {
                e(viewGroup, drawableA);
            }
        }
        if (stepStyle != null && (modalPaddingValue = stepStyle.getModalPaddingValue()) != null) {
            StyleElements.Size left = modalPaddingValue.getLeft();
            if (left == null || (dp5 = left.getDp()) == null) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(((int) yh0.h.a(dp5.doubleValue())) - (rect != null ? rect.left : 0));
            }
            StyleElements.Size top = modalPaddingValue.getTop();
            if (top == null || (dp4 = top.getDp()) == null) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(((int) yh0.h.a(dp4.doubleValue())) - (rect != null ? rect.top : 0));
            }
            StyleElements.Size right = modalPaddingValue.getRight();
            if (right == null || (dp3 = right.getDp()) == null) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(((int) yh0.h.a(dp3.doubleValue())) - (rect != null ? rect.right : 0));
            }
            StyleElements.Size bottom = modalPaddingValue.getBottom();
            if (bottom == null || (dp2 = bottom.getDp()) == null) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(((int) yh0.h.a(dp2.doubleValue())) - (rect != null ? rect.bottom : 0));
            }
            innerView.setPadding(numValueOf != null ? numValueOf.intValue() : viewGroup.getPaddingLeft(), numValueOf2 != null ? numValueOf2.intValue() : viewGroup.getPaddingTop(), numValueOf3 != null ? numValueOf3.intValue() : viewGroup.getPaddingRight(), numValueOf4 != null ? numValueOf4.intValue() : viewGroup.getPaddingBottom());
        }
        viewGroup.setBackground(d(stepStyle != null ? stepStyle.getModalBorderRadiusValue() : null));
    }

    public static /* synthetic */ void c(ViewGroup viewGroup, StepStyle stepStyle, View view, Rect rect, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            view = viewGroup;
        }
        if ((i11 & 4) != 0) {
            rect = null;
        }
        b(viewGroup, stepStyle, view, rect);
    }

    private static final GradientDrawable d(StyleElements.Size size) {
        Double dp2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        float fA = (float) yh0.h.a((size == null || (dp2 = size.getDp()) == null) ? 12.0d : dp2.doubleValue());
        gradientDrawable.setCornerRadii(new float[]{fA, fA, fA, fA, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED});
        gradientDrawable.setColor(ColorStateList.valueOf(-1));
        return gradientDrawable;
    }

    private static final void e(ViewGroup viewGroup, Drawable drawable) {
        ho0.i iVarH = ho0.l.H(s0.a(viewGroup), new wn0.l() { // from class: ui0.b
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(c.f((View) obj));
            }
        });
        if (ho0.l.y(iVarH)) {
            ((View) ho0.l.L(iVarH)).setBackground(drawable);
            return;
        }
        Context context = viewGroup.getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        View aVar = new a(context);
        aVar.setBackground(drawable);
        viewGroup.addView(aVar, 0);
        ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
        bVar.f6922t = viewGroup.getId();
        bVar.f6926v = viewGroup.getId();
        bVar.f6900i = viewGroup.getId();
        bVar.f6906l = viewGroup.getId();
        aVar.setLayoutParams(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(View it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return it instanceof a;
    }
}
