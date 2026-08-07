package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import so.BorderRadiusStyle;
import so.BoxShadow;
import so.ComputedBorderRadius;
import so.CornerRadii;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"H\u0007¢\u0006\u0004\b$\u0010%J#\u0010'\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b'\u0010\nJ\u001f\u0010)\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0014H\u0007¢\u0006\u0004\b)\u0010*J!\u0010-\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b/\u0010*J%\u00102\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u00101\u001a\b\u0012\u0004\u0012\u0002000\u000bH\u0007¢\u0006\u0004\b2\u0010\u000fJ!\u00104\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u000103H\u0007¢\u0006\u0004\b4\u00105J!\u00108\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u00107\u001a\u0004\u0018\u000106H\u0007¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020@2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bA\u0010BJ\u0019\u0010C\u001a\u0004\u0018\u00010@2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bC\u0010BJ\u0017\u0010E\u001a\u00020D2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020G2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bH\u0010IJ\u0019\u0010J\u001a\u0004\u0018\u00010D2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bJ\u0010FJ\u0019\u0010K\u001a\u0004\u0018\u00010G2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bK\u0010IJ\u0017\u0010M\u001a\u00020L2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020O2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bP\u0010QJ#\u0010T\u001a\u00020\u00142\b\u0010R\u001a\u0004\u0018\u00010\u00142\b\u0010S\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\bT\u0010UJ1\u0010[\u001a\u00020Z2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010V\u001a\u00020@2\u0006\u0010X\u001a\u00020W2\b\u0010Y\u001a\u0004\u0018\u00010WH\u0002¢\u0006\u0004\b[\u0010\\¨\u0006]"}, d2 = {"Lcom/facebook/react/uimanager/a;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "color", "Ljn0/h0;", "o", "(Landroid/view/View;Ljava/lang/Integer;)V", "", "Lso/a;", "backgroundImageLayers", "p", "(Landroid/view/View;Ljava/util/List;)V", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/view/View;)Ljava/lang/Integer;", "Lso/n;", "edge", "", Snapshot.WIDTH, "t", "(Landroid/view/View;Lso/n;Ljava/lang/Float;)V", "q", "(Landroid/view/View;Lso/n;Ljava/lang/Integer;)V", "Lso/d;", "corner", "Lcom/facebook/react/uimanager/o;", "radius", "r", "(Landroid/view/View;Lso/d;Lcom/facebook/react/uimanager/o;)V", "j", "(Landroid/view/View;Lso/d;)Lcom/facebook/react/uimanager/o;", "Lso/f;", "borderStyle", "s", "(Landroid/view/View;Lso/f;)V", "outlineColor", "x", "outlineOffset", "y", "(Landroid/view/View;F)V", "Lso/o;", "outlineStyle", "z", "(Landroid/view/View;Lso/o;)V", "A", "Lso/g;", "shadows", "v", "Lcom/facebook/react/bridge/ReadableArray;", "u", "(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "w", "(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V", "Landroid/graphics/Canvas;", "canvas", "a", "(Landroid/view/View;Landroid/graphics/Canvas;)V", "n", "(Landroid/view/View;)V", "Lqo/e;", "f", "(Landroid/view/View;)Lqo/e;", "l", "Lqo/d;", "e", "(Landroid/view/View;)Lqo/d;", "Lqo/a;", "c", "(Landroid/view/View;)Lqo/a;", "k", "h", "Lqo/b;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;)Lqo/b;", "Lqo/h;", "g", "(Landroid/view/View;)Lqo/h;", "computedRadius", "borderWidth", "m", "(Ljava/lang/Float;Ljava/lang/Float;)F", "composite", "Landroid/graphics/RectF;", "paddingBoxRect", "computedBorderInsets", "Landroid/graphics/Path;", "b", "(Landroid/view/View;Lqo/e;Landroid/graphics/RectF;Landroid/graphics/RectF;)Landroid/graphics/Path;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f23114a = new a();

    private a() {
    }

    public static final void A(View view, float width) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (oo.a.c(view) != 2) {
            return;
        }
        f23114a.g(view).i(w.f23413a.b(width));
    }

    public static final void a(View view, Canvas canvas) {
        RectF rectFA;
        float fB;
        float fB2;
        float fB3;
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(canvas, "canvas");
        if (!tn.b.h()) {
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            qo.d dVarK = f23114a.k(view);
            if (dVarK == null) {
                canvas.clipRect(rect);
                return;
            }
            Path pathP = dVarK.p();
            if (pathP != null) {
                pathP.offset(rect.left, rect.top);
                canvas.clipPath(pathP);
                return;
            } else {
                RectF rectFQ = dVarK.q();
                p013kotlin.jvm.internal.s.j(rectFQ, "getPaddingBoxRect(...)");
                rectFQ.offset(rect.left, rect.top);
                canvas.clipRect(rectFQ);
                return;
            }
        }
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        a aVar = f23114a;
        qo.e eVarF = aVar.f(view);
        RectF rectF = new RectF();
        so.c cVarC = eVarF.getBorderInsets();
        if (cVarC != null) {
            int layoutDirection = eVarF.getLayoutDirection();
            Context context = view.getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            rectFA = cVarC.a(layoutDirection, context);
        } else {
            rectFA = null;
        }
        float f11 = eVarF.getBounds().left;
        float fB4 = BitmapDescriptorFactory.HUE_RED;
        if (rectFA != null) {
            fB = w.f23413a.b(rectFA.left);
        } else {
            fB = 0.0f;
        }
        rectF.left = f11 + fB;
        float f12 = eVarF.getBounds().top;
        if (rectFA != null) {
            fB2 = w.f23413a.b(rectFA.top);
        } else {
            fB2 = 0.0f;
        }
        rectF.top = f12 + fB2;
        float f13 = eVarF.getBounds().right;
        if (rectFA != null) {
            fB3 = w.f23413a.b(rectFA.right);
        } else {
            fB3 = 0.0f;
        }
        rectF.right = f13 - fB3;
        float f14 = eVarF.getBounds().bottom;
        if (rectFA != null) {
            fB4 = w.f23413a.b(rectFA.bottom);
        }
        rectF.bottom = f14 - fB4;
        BorderRadiusStyle eVarD = eVarF.getBorderRadius();
        if (eVarD == null || !eVarD.c()) {
            rectF.offset(rect2.left, rect2.top);
            canvas.clipRect(rectF);
        } else {
            Path pathB = aVar.b(view, eVarF, rectF, rectFA);
            pathB.offset(rect2.left, rect2.top);
            canvas.clipPath(pathB);
        }
    }

    private final Path b(View view, qo.e composite, RectF paddingBoxRect, RectF computedBorderInsets) {
        ComputedBorderRadius computedBorderRadiusD;
        CornerRadii bottomLeft;
        CornerRadii bottomLeft2;
        CornerRadii bottomRight;
        CornerRadii bottomRight2;
        CornerRadii topRight;
        CornerRadii topRight2;
        CornerRadii topLeft;
        CornerRadii topLeft2;
        BorderRadiusStyle eVarD = composite.getBorderRadius();
        if (eVarD != null) {
            int layoutDirection = composite.getLayoutDirection();
            Context context = view.getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            computedBorderRadiusD = eVarD.d(layoutDirection, context, w.f(composite.getBounds().width()), w.f(composite.getBounds().height()));
        } else {
            computedBorderRadiusD = null;
        }
        Path path = new Path();
        path.addRoundRect(paddingBoxRect, new float[]{m((computedBorderRadiusD == null || (topLeft2 = computedBorderRadiusD.getTopLeft()) == null) ? null : Float.valueOf(w.f23413a.b(topLeft2.getHorizontal())), computedBorderInsets != null ? Float.valueOf(w.f23413a.b(computedBorderInsets.left)) : null), m((computedBorderRadiusD == null || (topLeft = computedBorderRadiusD.getTopLeft()) == null) ? null : Float.valueOf(w.f23413a.b(topLeft.getVertical())), computedBorderInsets != null ? Float.valueOf(w.f23413a.b(computedBorderInsets.top)) : null), m((computedBorderRadiusD == null || (topRight2 = computedBorderRadiusD.getTopRight()) == null) ? null : Float.valueOf(w.f23413a.b(topRight2.getHorizontal())), computedBorderInsets != null ? Float.valueOf(w.f23413a.b(computedBorderInsets.right)) : null), m((computedBorderRadiusD == null || (topRight = computedBorderRadiusD.getTopRight()) == null) ? null : Float.valueOf(w.f23413a.b(topRight.getVertical())), computedBorderInsets != null ? Float.valueOf(w.f23413a.b(computedBorderInsets.top)) : null), m((computedBorderRadiusD == null || (bottomRight2 = computedBorderRadiusD.getBottomRight()) == null) ? null : Float.valueOf(w.f23413a.b(bottomRight2.getHorizontal())), computedBorderInsets != null ? Float.valueOf(w.f23413a.b(computedBorderInsets.right)) : null), m((computedBorderRadiusD == null || (bottomRight = computedBorderRadiusD.getBottomRight()) == null) ? null : Float.valueOf(w.f23413a.b(bottomRight.getVertical())), computedBorderInsets != null ? Float.valueOf(w.f23413a.b(computedBorderInsets.bottom)) : null), m((computedBorderRadiusD == null || (bottomLeft2 = computedBorderRadiusD.getBottomLeft()) == null) ? null : Float.valueOf(w.f23413a.b(bottomLeft2.getHorizontal())), computedBorderInsets != null ? Float.valueOf(w.f23413a.b(computedBorderInsets.left)) : null), m((computedBorderRadiusD == null || (bottomLeft = computedBorderRadiusD.getBottomLeft()) == null) ? null : Float.valueOf(w.f23413a.b(bottomLeft.getVertical())), computedBorderInsets != null ? Float.valueOf(w.f23413a.b(computedBorderInsets.bottom)) : null)}, Path.Direction.CW);
        return path;
    }

    private final qo.a c(View view) {
        qo.e eVarF = f(view);
        qo.a aVarA = eVarF.getBackground();
        if (aVarA != null) {
            return aVarA;
        }
        Context context = view.getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        qo.a aVar = new qo.a(context, eVarF.getBorderRadius(), eVarF.getBorderInsets());
        view.setBackground(eVarF.l(aVar));
        return aVar;
    }

    private final qo.b d(View view) {
        qo.e eVarF = f(view);
        qo.b bVarB = eVarF.getBorder();
        if (bVarB != null) {
            return bVarB;
        }
        Context context = view.getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        BorderRadiusStyle eVarD = eVarF.getBorderRadius();
        qo.b bVar = new qo.b(context, new t0(BitmapDescriptorFactory.HUE_RED), eVarD, eVarF.getBorderInsets(), so.f.SOLID);
        view.setBackground(eVarF.m(bVar));
        return bVar;
    }

    private final qo.d e(View view) {
        qo.e eVarF = f(view);
        qo.d dVarE = eVarF.getCssBackground();
        if (dVarE != null) {
            return dVarE;
        }
        qo.d dVar = new qo.d(view.getContext());
        view.setBackground(eVarF.n(dVar));
        return dVar;
    }

    private final qo.e f(View view) {
        if (view.getBackground() instanceof qo.e) {
            Drawable background = view.getBackground();
            p013kotlin.jvm.internal.s.i(background, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable");
            return (qo.e) background;
        }
        Context context = view.getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        qo.e eVar = new qo.e(context, view.getBackground(), null, null, null, null, null, null, null, null, null, 2044, null);
        view.setBackground(eVar);
        return eVar;
    }

    private final qo.h g(View view) {
        qo.e eVarF = f(view);
        qo.h hVarI = eVarF.getOutline();
        if (hVarI != null) {
            return hVarI;
        }
        BorderRadiusStyle eVarD = tn.b.h() ? eVarF.getBorderRadius() : e(view).h();
        Context context = view.getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        qo.h hVar = new qo.h(context, eVarD, -16777216, BitmapDescriptorFactory.HUE_RED, so.o.SOLID, BitmapDescriptorFactory.HUE_RED);
        view.setBackground(eVarF.p(hVar));
        return hVar;
    }

    private final qo.a h(View view) {
        qo.e eVarL = l(view);
        if (eVarL != null) {
            return eVarL.getBackground();
        }
        return null;
    }

    public static final Integer i(View view) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (tn.b.h()) {
            qo.a aVarH = f23114a.h(view);
            if (aVarH != null) {
                return Integer.valueOf(aVarH.getBackgroundColor());
            }
            return null;
        }
        qo.d dVarK = f23114a.k(view);
        if (dVarK != null) {
            return Integer.valueOf(dVarK.k());
        }
        return null;
    }

    public static final LengthPercentage j(View view, so.d corner) {
        BorderRadiusStyle eVarH;
        BorderRadiusStyle eVarD;
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(corner, "corner");
        if (tn.b.h()) {
            qo.e eVarL = f23114a.l(view);
            if (eVarL == null || (eVarD = eVarL.getBorderRadius()) == null) {
                return null;
            }
            return eVarD.b(corner);
        }
        qo.d dVarK = f23114a.k(view);
        if (dVarK == null || (eVarH = dVarK.h()) == null) {
            return null;
        }
        return eVarH.b(corner);
    }

    private final qo.d k(View view) {
        qo.e eVarL = l(view);
        if (eVarL != null) {
            return eVarL.getCssBackground();
        }
        return null;
    }

    private final qo.e l(View view) {
        Drawable background = view.getBackground();
        if (background instanceof qo.e) {
            return (qo.e) background;
        }
        return null;
    }

    private final float m(Float computedRadius, Float borderWidth) {
        return bo0.n.e((computedRadius != null ? computedRadius.floatValue() : 0.0f) - (borderWidth != null ? borderWidth.floatValue() : 0.0f), BitmapDescriptorFactory.HUE_RED);
    }

    public static final void n(View view) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (view.getBackground() instanceof qo.e) {
            Drawable background = view.getBackground();
            p013kotlin.jvm.internal.s.i(background, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable");
            view.setBackground(((qo.e) background).getOriginalBackground());
        }
    }

    public static final void o(View view, Integer color) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if ((color == null || color.intValue() == 0) && !(view.getBackground() instanceof qo.e)) {
            return;
        }
        if (tn.b.h()) {
            f23114a.c(view).d(color != null ? color.intValue() : 0);
        } else {
            f23114a.e(view).C(color != null ? color.intValue() : 0);
        }
    }

    public static final void p(View view, List<so.a> backgroundImageLayers) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (tn.b.h()) {
            f23114a.c(view).e(backgroundImageLayers);
        } else {
            f23114a.e(view).v(backgroundImageLayers);
        }
    }

    public static final void q(View view, so.n edge, Integer color) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(edge, "edge");
        if (tn.b.h()) {
            f23114a.d(view).o(edge, color);
        } else {
            f23114a.e(view).x(edge.toSpacingType(), color);
        }
    }

    public static final void r(View view, so.d corner, LengthPercentage radius) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(corner, "corner");
        a aVar = f23114a;
        qo.e eVarF = aVar.f(view);
        BorderRadiusStyle eVarD = eVarF.getBorderRadius();
        if (eVarD == null) {
            eVarD = new BorderRadiusStyle(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }
        eVarF.k(eVarD);
        BorderRadiusStyle eVarD2 = eVarF.getBorderRadius();
        if (eVarD2 != null) {
            eVarD2.e(corner, radius);
        }
        if (tn.b.h()) {
            if (view instanceof ImageView) {
                aVar.c(view);
            }
            qo.a aVarA = eVarF.getBackground();
            if (aVarA != null) {
                aVarA.g(eVarF.getBorderRadius());
            }
            qo.b bVarB = eVarF.getBorder();
            if (bVarB != null) {
                bVarB.q(eVarF.getBorderRadius());
            }
            qo.a aVarA2 = eVarF.getBackground();
            if (aVarA2 != null) {
                aVarA2.invalidateSelf();
            }
            qo.b bVarB2 = eVarF.getBorder();
            if (bVarB2 != null) {
                bVarB2.invalidateSelf();
            }
        } else {
            aVar.e(view).z(corner, radius);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            List<Drawable> listH = eVarF.h();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listH) {
                if (obj instanceof qo.i) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((qo.i) it.next()).c(eVarF.getBorderRadius());
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            List<Drawable> listF = eVarF.f();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listF) {
                if (obj2 instanceof qo.f) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((qo.f) it2.next()).e(eVarF.getBorderRadius());
            }
        }
        qo.h hVarI = eVarF.getOutline();
        if (hVarI != null) {
            hVarI.e(eVarF.getBorderRadius());
        }
        eVarF.invalidateSelf();
    }

    public static final void s(View view, so.f borderStyle) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (tn.b.h()) {
            f23114a.d(view).r(borderStyle);
        } else {
            f23114a.e(view).A(borderStyle);
        }
    }

    public static final void t(View view, so.n edge, Float width) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(edge, "edge");
        a aVar = f23114a;
        qo.e eVarF = aVar.f(view);
        so.c cVarC = eVarF.getBorderInsets();
        if (cVarC == null) {
            cVarC = new so.c();
        }
        eVarF.j(cVarC);
        so.c cVarC2 = eVarF.getBorderInsets();
        if (cVarC2 != null) {
            cVarC2.b(edge, width);
        }
        if (tn.b.h()) {
            aVar.d(view).s(edge.toSpacingType(), width != null ? w.f23413a.b(width.floatValue()) : Float.NaN);
            qo.a aVarA = eVarF.getBackground();
            if (aVarA != null) {
                aVarA.f(eVarF.getBorderInsets());
            }
            qo.b bVarB = eVarF.getBorder();
            if (bVarB != null) {
                bVarB.p(eVarF.getBorderInsets());
            }
            qo.a aVarA2 = eVarF.getBackground();
            if (aVarA2 != null) {
                aVarA2.invalidateSelf();
            }
            qo.b bVarB2 = eVarF.getBorder();
            if (bVarB2 != null) {
                bVarB2.invalidateSelf();
            }
        } else {
            aVar.e(view).B(edge.toSpacingType(), width != null ? w.f23413a.b(width.floatValue()) : Float.NaN);
        }
        so.c cVarC3 = eVarF.getBorderInsets();
        if (cVarC3 == null) {
            cVarC3 = new so.c();
        }
        eVarF.j(cVarC3);
        so.c cVarC4 = eVarF.getBorderInsets();
        if (cVarC4 != null) {
            cVarC4.b(edge, width);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            List<Drawable> listF = eVarF.f();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listF) {
                if (obj instanceof qo.f) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((qo.f) it.next()).d(eVarF.getBorderInsets());
            }
        }
    }

    public static final void u(View view, ReadableArray shadows) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (shadows == null) {
            v(view, p013kotlin.collections.v.m());
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = shadows.size();
        for (int i11 = 0; i11 < size; i11++) {
            BoxShadow.Companion companion = BoxShadow.INSTANCE;
            ReadableMap map = shadows.getMap(i11);
            Context context = view.getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            BoxShadow boxShadowA = companion.a(map, context);
            if (boxShadowA == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(boxShadowA);
        }
        v(view, arrayList);
    }

    public static final void v(View view, List<BoxShadow> shadows) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(shadows, "shadows");
        if (oo.a.c(view) != 2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        qo.e eVarF = f23114a.f(view);
        so.c cVarC = eVarF.getBorderInsets();
        BorderRadiusStyle eVarD = eVarF.getBorderRadius();
        for (BoxShadow boxShadow : shadows) {
            float offsetX = boxShadow.getOffsetX();
            float offsetY = boxShadow.getOffsetY();
            Integer color = boxShadow.getColor();
            int iIntValue = color != null ? color.intValue() : -16777216;
            Float blurRadius = boxShadow.getBlurRadius();
            float fFloatValue = BitmapDescriptorFactory.HUE_RED;
            float fFloatValue2 = blurRadius != null ? blurRadius.floatValue() : 0.0f;
            Float spreadDistance = boxShadow.getSpreadDistance();
            if (spreadDistance != null) {
                fFloatValue = spreadDistance.floatValue();
            }
            float f11 = fFloatValue;
            Boolean inset = boxShadow.getInset();
            boolean zBooleanValue = inset != null ? inset.booleanValue() : false;
            if (zBooleanValue && Build.VERSION.SDK_INT >= 29) {
                Context context = view.getContext();
                p013kotlin.jvm.internal.s.j(context, "getContext(...)");
                arrayList.add(new qo.f(context, iIntValue, offsetX, offsetY, fFloatValue2, f11, cVarC, eVarD));
            } else if (!zBooleanValue && Build.VERSION.SDK_INT >= 28) {
                Context context2 = view.getContext();
                p013kotlin.jvm.internal.s.j(context2, "getContext(...)");
                arrayList2.add(new qo.i(context2, iIntValue, offsetX, offsetY, fFloatValue2, f11, eVarD));
            }
        }
        view.setBackground(f23114a.f(view).q(arrayList2, arrayList));
    }

    public static final void w(View view, Drawable drawable) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (tn.b.h()) {
            f23114a.f(view).o(drawable);
        } else {
            view.setBackground(f23114a.f(view).o(drawable));
        }
    }

    public static final void x(View view, Integer outlineColor) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (oo.a.c(view) != 2) {
            return;
        }
        qo.h hVarG = f23114a.g(view);
        if (outlineColor != null) {
            hVarG.f(outlineColor.intValue());
        }
    }

    public static final void y(View view, float outlineOffset) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (oo.a.c(view) != 2) {
            return;
        }
        f23114a.g(view).g(w.f23413a.b(outlineOffset));
    }

    public static final void z(View view, so.o outlineStyle) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (oo.a.c(view) != 2) {
            return;
        }
        qo.h hVarG = f23114a.g(view);
        if (outlineStyle != null) {
            hVarG.h(outlineStyle);
        }
    }
}
