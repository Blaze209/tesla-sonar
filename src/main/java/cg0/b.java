package cg0;

import android.graphics.Rect;
import android.view.View;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import zf0.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcg0/a;", "Lzf0/i;", "cameraController", "Landroid/view/View;", "pointOfInterestView", "Ljn0/h0;", "a", "(Lcg0/a;Lzf0/i;Landroid/view/View;)V", "camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final void a(a aVar, i cameraController, View pointOfInterestView) {
        s.k(aVar, "<this>");
        s.k(cameraController, "cameraController");
        s.k(pointOfInterestView, "pointOfInterestView");
        int[] iArr = new int[2];
        pointOfInterestView.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        Rect rect = new Rect(i11, iArr[1], pointOfInterestView.getWidth() + i11, iArr[1] + pointOfInterestView.getHeight());
        View viewE = cameraController.e();
        viewE.getLocationOnScreen(iArr);
        int i12 = iArr[0];
        aVar.a(rect, new Rect(i12, iArr[1], viewE.getWidth() + i12, iArr[1] + viewE.getHeight()));
    }
}
