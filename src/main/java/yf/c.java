package yf;

import android.content.Context;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import hg.l;

/* JADX INFO: loaded from: classes3.dex */
public class c implements b {
    @Override // yf.b
    public a a(Context context) {
        return (context == null || l.f(context) != BitmapDescriptorFactory.HUE_RED) ? a.STANDARD_MOTION : a.REDUCED_MOTION;
    }
}
