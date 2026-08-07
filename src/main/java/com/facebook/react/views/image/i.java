package com.facebook.react.views.image;

import android.graphics.Matrix;
import android.graphics.Rect;
import bo0.n;
import ll.q;
import ll.s;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/views/image/i;", "Lll/q;", "<init>", "()V", "Landroid/graphics/Matrix;", "outTransform", "Landroid/graphics/Rect;", "parentRect", "", "childWidth", "childHeight", "", "focusX", "focusY", "scaleX", "scaleY", "Ljn0/h0;", "b", "(Landroid/graphics/Matrix;Landroid/graphics/Rect;IIFFFF)V", "", "toString", "()Ljava/lang/String;", "l", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i extends q {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final s f23488m = new i();

    /* JADX INFO: renamed from: com.facebook.react.views.image.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/views/image/i$a;", "", "<init>", "()V", "Lll/s;", "INSTANCE", "Lll/s;", "a", "()Lll/s;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s a() {
            return i.f23488m;
        }

        private Companion() {
        }
    }

    @Override // ll.q
    public void b(Matrix outTransform, Rect parentRect, int childWidth, int childHeight, float focusX, float focusY, float scaleX, float scaleY) {
        p013kotlin.jvm.internal.s.k(outTransform, "outTransform");
        p013kotlin.jvm.internal.s.k(parentRect, "parentRect");
        float fI = n.i(Math.min(scaleX, scaleY), 1.0f);
        float f11 = parentRect.left;
        float f12 = parentRect.top;
        outTransform.setScale(fI, fI);
        outTransform.postTranslate(Math.round(f11), Math.round(f12));
    }

    public String toString() {
        return "start_inside";
    }
}
