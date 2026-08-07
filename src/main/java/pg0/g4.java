package pg0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/content/Context;", "Lpg0/g5$d;", "overlay", "Lpg0/j4;", "b", "(Landroid/content/Context;Lpg0/g5$d;)Lpg0/j4;", "", "attr", "Landroid/graphics/drawable/GradientDrawable;", "a", "(Landroid/content/Context;I)Landroid/graphics/drawable/GradientDrawable;", "government-id_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class g4 {
    public static final GradientDrawable a(Context context, int i11) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        float dimension = context.getResources().getDimension(qh0.c.f105540b);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(qh0.c.f105541c);
        int color = androidx.core.content.b.getColor(context, qh0.b.f105538c);
        Integer numF = yh0.s.f(context, i11, null, false, 6, null);
        if (numF != null) {
            int iIntValue = numF.intValue();
            int[] Pi2IdFrame = qh0.g.f105575a;
            p013kotlin.jvm.internal.s.j(Pi2IdFrame, "Pi2IdFrame");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, Pi2IdFrame);
            dimension = typedArrayObtainStyledAttributes.getDimension(qh0.g.f105576b, dimension);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(qh0.g.f105578d, dimensionPixelSize);
            color = typedArrayObtainStyledAttributes.getColor(qh0.g.f105577c, color);
            typedArrayObtainStyledAttributes.recycle();
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setStroke(dimensionPixelSize, color);
        return gradientDrawable;
    }

    public static final OverlayAssets b(Context context, g5.d overlay) {
        int resourceId;
        int resourceId2;
        int i11;
        p013kotlin.jvm.internal.s.k(context, "<this>");
        p013kotlin.jvm.internal.s.k(overlay, "overlay");
        g5.d.e eVar = g5.d.e.f102498a;
        if (p013kotlin.jvm.internal.s.f(overlay, eVar)) {
            resourceId = p4.f102847c;
        } else if (p013kotlin.jvm.internal.s.f(overlay, g5.d.a.f102493a)) {
            resourceId = p4.f102845a;
        } else {
            if (!p013kotlin.jvm.internal.s.f(overlay, g5.d.b.f102494a) && !(overlay instanceof g5.d.c) && !p013kotlin.jvm.internal.s.f(overlay, g5.d.C2178d.f102497a) && !p013kotlin.jvm.internal.s.f(overlay, g5.d.f.f102499a)) {
                throw new NoWhenBranchMatchedException();
            }
            resourceId = p4.f102846b;
        }
        if (p013kotlin.jvm.internal.s.f(overlay, eVar)) {
            resourceId2 = m4.f102590j;
        } else if (p013kotlin.jvm.internal.s.f(overlay, g5.d.a.f102493a)) {
            resourceId2 = m4.f102581a;
        } else if (p013kotlin.jvm.internal.s.f(overlay, g5.d.f.f102499a)) {
            resourceId2 = m4.f102582b;
        } else if (p013kotlin.jvm.internal.s.f(overlay, g5.d.b.f102494a)) {
            resourceId2 = m4.f102586f;
        } else {
            if (!(overlay instanceof g5.d.c) && !p013kotlin.jvm.internal.s.f(overlay, g5.d.C2178d.f102497a)) {
                throw new NoWhenBranchMatchedException();
            }
            resourceId2 = m4.f102587g;
        }
        if (p013kotlin.jvm.internal.s.f(overlay, eVar)) {
            i11 = qh0.a.f105525j;
        } else if (p013kotlin.jvm.internal.s.f(overlay, g5.d.a.f102493a)) {
            i11 = qh0.a.f105521f;
        } else {
            if (!p013kotlin.jvm.internal.s.f(overlay, g5.d.b.f102494a) && !(overlay instanceof g5.d.c) && !p013kotlin.jvm.internal.s.f(overlay, g5.d.C2178d.f102497a) && !p013kotlin.jvm.internal.s.f(overlay, g5.d.f.f102499a)) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = qh0.a.f105524i;
        }
        Integer numF = yh0.s.f(context, i11, null, false, 6, null);
        if (numF != null) {
            int iIntValue = numF.intValue();
            int[] Pi2IdFrameGuideAssets = qh0.g.f105579e;
            p013kotlin.jvm.internal.s.j(Pi2IdFrameGuideAssets, "Pi2IdFrameGuideAssets");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, Pi2IdFrameGuideAssets);
            resourceId = typedArrayObtainStyledAttributes.getResourceId(qh0.g.f105580f, resourceId);
            resourceId2 = typedArrayObtainStyledAttributes.getResourceId(qh0.g.f105581g, resourceId2);
            typedArrayObtainStyledAttributes.recycle();
        }
        return new OverlayAssets(resourceId, resourceId2);
    }
}
