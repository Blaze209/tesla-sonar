package so;

import android.content.Context;
import android.graphics.RectF;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, d2 = {"Lso/c;", "", "<init>", "()V", "Lso/n;", "edge", "", Snapshot.WIDTH, "Ljn0/h0;", "b", "(Lso/n;Ljava/lang/Float;)V", "", "layoutDirection", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/RectF;", "a", "(ILandroid/content/Context;)Landroid/graphics/RectF;", "", "[Ljava/lang/Float;", "edgeInsets", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Float[] edgeInsets = new Float[n.values().length];

    public final RectF a(int layoutDirection, Context context) {
        s.k(context, "context");
        float fFloatValue = BitmapDescriptorFactory.HUE_RED;
        if (layoutDirection == 0) {
            Float f11 = this.edgeInsets[n.START.ordinal()];
            float fFloatValue2 = (f11 == null && (f11 = this.edgeInsets[n.LEFT.ordinal()]) == null && (f11 = this.edgeInsets[n.HORIZONTAL.ordinal()]) == null && (f11 = this.edgeInsets[n.ALL.ordinal()]) == null) ? 0.0f : f11.floatValue();
            Float f12 = this.edgeInsets[n.BLOCK_START.ordinal()];
            float fFloatValue3 = (f12 == null && (f12 = this.edgeInsets[n.TOP.ordinal()]) == null && (f12 = this.edgeInsets[n.BLOCK.ordinal()]) == null && (f12 = this.edgeInsets[n.VERTICAL.ordinal()]) == null && (f12 = this.edgeInsets[n.ALL.ordinal()]) == null) ? 0.0f : f12.floatValue();
            Float f13 = this.edgeInsets[n.END.ordinal()];
            float fFloatValue4 = (f13 == null && (f13 = this.edgeInsets[n.RIGHT.ordinal()]) == null && (f13 = this.edgeInsets[n.HORIZONTAL.ordinal()]) == null && (f13 = this.edgeInsets[n.ALL.ordinal()]) == null) ? 0.0f : f13.floatValue();
            Float f14 = this.edgeInsets[n.BLOCK_END.ordinal()];
            if (f14 != null || (f14 = this.edgeInsets[n.BOTTOM.ordinal()]) != null || (f14 = this.edgeInsets[n.BLOCK.ordinal()]) != null || (f14 = this.edgeInsets[n.VERTICAL.ordinal()]) != null || (f14 = this.edgeInsets[n.ALL.ordinal()]) != null) {
                fFloatValue = f14.floatValue();
            }
            return new RectF(fFloatValue2, fFloatValue3, fFloatValue4, fFloatValue);
        }
        if (layoutDirection != 1) {
            throw new IllegalArgumentException("Expected resolved layout direction");
        }
        if (com.facebook.react.modules.i18nmanager.a.INSTANCE.a().d(context)) {
            Float f15 = this.edgeInsets[n.END.ordinal()];
            float fFloatValue5 = (f15 == null && (f15 = this.edgeInsets[n.RIGHT.ordinal()]) == null && (f15 = this.edgeInsets[n.HORIZONTAL.ordinal()]) == null && (f15 = this.edgeInsets[n.ALL.ordinal()]) == null) ? 0.0f : f15.floatValue();
            Float f16 = this.edgeInsets[n.BLOCK_START.ordinal()];
            float fFloatValue6 = (f16 == null && (f16 = this.edgeInsets[n.TOP.ordinal()]) == null && (f16 = this.edgeInsets[n.BLOCK.ordinal()]) == null && (f16 = this.edgeInsets[n.VERTICAL.ordinal()]) == null && (f16 = this.edgeInsets[n.ALL.ordinal()]) == null) ? 0.0f : f16.floatValue();
            Float f17 = this.edgeInsets[n.START.ordinal()];
            float fFloatValue7 = (f17 == null && (f17 = this.edgeInsets[n.LEFT.ordinal()]) == null && (f17 = this.edgeInsets[n.HORIZONTAL.ordinal()]) == null && (f17 = this.edgeInsets[n.ALL.ordinal()]) == null) ? 0.0f : f17.floatValue();
            Float f18 = this.edgeInsets[n.BLOCK_END.ordinal()];
            if (f18 != null || (f18 = this.edgeInsets[n.BOTTOM.ordinal()]) != null || (f18 = this.edgeInsets[n.BLOCK.ordinal()]) != null || (f18 = this.edgeInsets[n.VERTICAL.ordinal()]) != null || (f18 = this.edgeInsets[n.ALL.ordinal()]) != null) {
                fFloatValue = f18.floatValue();
            }
            return new RectF(fFloatValue5, fFloatValue6, fFloatValue7, fFloatValue);
        }
        Float f19 = this.edgeInsets[n.END.ordinal()];
        float fFloatValue8 = (f19 == null && (f19 = this.edgeInsets[n.LEFT.ordinal()]) == null && (f19 = this.edgeInsets[n.HORIZONTAL.ordinal()]) == null && (f19 = this.edgeInsets[n.ALL.ordinal()]) == null) ? 0.0f : f19.floatValue();
        Float f21 = this.edgeInsets[n.BLOCK_START.ordinal()];
        float fFloatValue9 = (f21 == null && (f21 = this.edgeInsets[n.TOP.ordinal()]) == null && (f21 = this.edgeInsets[n.BLOCK.ordinal()]) == null && (f21 = this.edgeInsets[n.VERTICAL.ordinal()]) == null && (f21 = this.edgeInsets[n.ALL.ordinal()]) == null) ? 0.0f : f21.floatValue();
        Float f22 = this.edgeInsets[n.START.ordinal()];
        float fFloatValue10 = (f22 == null && (f22 = this.edgeInsets[n.RIGHT.ordinal()]) == null && (f22 = this.edgeInsets[n.HORIZONTAL.ordinal()]) == null && (f22 = this.edgeInsets[n.ALL.ordinal()]) == null) ? 0.0f : f22.floatValue();
        Float f23 = this.edgeInsets[n.BLOCK_END.ordinal()];
        if (f23 != null || (f23 = this.edgeInsets[n.BOTTOM.ordinal()]) != null || (f23 = this.edgeInsets[n.BLOCK.ordinal()]) != null || (f23 = this.edgeInsets[n.VERTICAL.ordinal()]) != null || (f23 = this.edgeInsets[n.ALL.ordinal()]) != null) {
            fFloatValue = f23.floatValue();
        }
        return new RectF(fFloatValue8, fFloatValue9, fFloatValue10, fFloatValue);
    }

    public final void b(n edge, Float width) {
        s.k(edge, "edge");
        this.edgeInsets[edge.ordinal()] = width;
    }
}
