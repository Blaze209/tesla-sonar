package dg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.p;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public class f extends b {
    f(p pVar, e eVar) {
        super(pVar, eVar);
    }

    @Override // dg.b, vf.e
    public void b(RectF rectF, Matrix matrix, boolean z11) {
        super.b(rectF, matrix, z11);
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // dg.b
    void u(Canvas canvas, Matrix matrix, int i11, hg.b bVar) {
    }
}
