package ro;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
abstract class c extends ro.a {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f108641a;

        static {
            int[] iArr = new int[b.values().length];
            f108641a = iArr;
            try {
                iArr[b.OPACITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f108641a[b.SCALE_XY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f108641a[b.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f108641a[b.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    c() {
    }

    @Override // ro.a
    Animation b(View view, int i11, int i12, int i13, int i14) {
        b bVar = this.f108639c;
        if (bVar == null) {
            throw new IllegalViewOperationException("Missing animated property from animation config");
        }
        int i15 = a.f108641a[bVar.ordinal()];
        float alpha = BitmapDescriptorFactory.HUE_RED;
        if (i15 == 1) {
            float alpha2 = g() ? view.getAlpha() : 0.0f;
            if (!g()) {
                alpha = view.getAlpha();
            }
            return new l(view, alpha2, alpha);
        }
        if (i15 == 2) {
            float f11 = g() ? 1.0f : 0.0f;
            float f12 = g() ? 0.0f : 1.0f;
            return new ScaleAnimation(f11, f12, f11, f12, 1, 0.5f, 1, 0.5f);
        }
        if (i15 == 3) {
            return new ScaleAnimation(g() ? 1.0f : 0.0f, g() ? 0.0f : 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, BitmapDescriptorFactory.HUE_RED);
        }
        if (i15 == 4) {
            return new ScaleAnimation(1.0f, 1.0f, g() ? 1.0f : 0.0f, g() ? 0.0f : 1.0f, 1, BitmapDescriptorFactory.HUE_RED, 1, 0.5f);
        }
        throw new IllegalViewOperationException("Missing animation for property : " + this.f108639c);
    }

    @Override // ro.a
    boolean e() {
        return this.f108640d > 0 && this.f108639c != null;
    }

    abstract boolean g();
}
