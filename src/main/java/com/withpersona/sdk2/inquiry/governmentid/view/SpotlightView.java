package com.withpersona.sdk2.inquiry.governmentid.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.withpersona.sdk2.inquiry.governmentid.view.SpotlightView;
import ezvcard.property.Gender;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import pg0.q4;
import wn0.a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ#\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ/\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010&¨\u0006("}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/view/SpotlightView;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ljn0/h0;", "c", "left", "top", "right", "bottom", "f", "(IIII)V", "onFinishInflate", "()V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "a", "I", "targetViewId", "", "b", Gender.FEMALE, "getRadius", "()F", "setRadius", "(F)V", "radius", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "clipPath", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpotlightView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int targetViewId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float radius;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Path clipPath;

    public SpotlightView(Context context) {
        super(context);
        c(context, null);
    }

    private final void c(Context context, AttributeSet attrs) {
        Resources.Theme theme;
        TypedArray typedArrayObtainStyledAttributes;
        if (context == null || (theme = context.getTheme()) == null || (typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attrs, q4.f102855a, 0, 0)) == null) {
            return;
        }
        try {
            this.targetViewId = typedArrayObtainStyledAttributes.getResourceId(q4.f102857c, 0);
            this.radius = typedArrayObtainStyledAttributes.getDimension(q4.f102856b, BitmapDescriptorFactory.HUE_RED);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 d(final SpotlightView spotlightView) {
        View viewFindViewById;
        Object parent = spotlightView.getParent();
        if ((parent instanceof View) && (viewFindViewById = ((View) parent).findViewById(spotlightView.targetViewId)) != null) {
            viewFindViewById.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: yg0.c
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    SpotlightView.e(this.f125470a, view, i11, i12, i13, i14, i15, i16, i17, i18);
                }
            });
            spotlightView.f(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SpotlightView spotlightView, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        spotlightView.f(i11, i12, i13, i14);
    }

    private final void f(int left, int top, int right, int bottom) {
        Path path = new Path();
        float f11 = this.radius;
        path.addRoundRect(left, top, right, bottom, f11, f11, Path.Direction.CW);
        this.clipPath = path;
        invalidate();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        s.k(canvas, "canvas");
        Path path = this.clipPath;
        if (path == null) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        super.draw(canvas);
        canvas.restore();
    }

    public final float getRadius() {
        return this.radius;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        ki0.s.b(this, new a() { // from class: yg0.b
            @Override // wn0.a
            public final Object invoke() {
                return SpotlightView.d(this.f125469a);
            }
        });
    }

    public final void setRadius(float f11) {
        this.radius = f11;
    }

    public SpotlightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    public SpotlightView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        c(context, attributeSet);
    }
}
