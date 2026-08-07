package androidx.camera.video.internal.compat.quirk;

import android.graphics.Rect;
import android.os.Build;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.m2;
import g1.o1;
import h0.s;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class SizeCannotEncodeVideoQuirk implements m2 {
    @NonNull
    private static Set<Size> h() {
        return i() ? new HashSet(Collections.singletonList(new Size(720, 1280))) : Collections.EMPTY_SET;
    }

    private static boolean i() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    static boolean k() {
        return i();
    }

    @NonNull
    public Rect g(@NonNull Rect rect, int i11, o1 o1Var) {
        Size sizeQ = s.q(s.m(rect), i11);
        if (!j(sizeQ)) {
            return rect;
        }
        int iH = o1Var != null ? o1Var.h() / 2 : 8;
        Rect rect2 = new Rect(rect);
        if (rect.width() == sizeQ.getHeight()) {
            rect2.left += iH;
            rect2.right -= iH;
            return rect2;
        }
        rect2.top += iH;
        rect2.bottom -= iH;
        return rect2;
    }

    public boolean j(@NonNull Size size) {
        return h().contains(size);
    }
}
