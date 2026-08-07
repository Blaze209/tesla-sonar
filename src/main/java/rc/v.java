package rc;

import android.view.View;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/view/View;", "Lrc/u;", "a", "(Landroid/view/View;)Lrc/u;", "requestManager", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v {
    public static final u a(View view) {
        u uVar;
        Object tag = view.getTag(fc.a.f64838a);
        u uVar2 = tag instanceof u ? (u) tag : null;
        if (uVar2 != null) {
            return uVar2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(fc.a.f64838a);
                uVar = tag2 instanceof u ? (u) tag2 : null;
                if (uVar == null) {
                    uVar = new u(view);
                    view.addOnAttachStateChangeListener(uVar);
                    view.setTag(fc.a.f64838a, uVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }
}
