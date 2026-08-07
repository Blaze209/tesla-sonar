package androidx.core.view;

import android.content.Context;
import android.view.PointerIcon;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointerIcon f7794a;

    static class a {
        static PointerIcon a(Context context, int i11) {
            return PointerIcon.getSystemIcon(context, i11);
        }
    }

    private e0(PointerIcon pointerIcon) {
        this.f7794a = pointerIcon;
    }

    public static e0 b(Context context, int i11) {
        return new e0(a.a(context, i11));
    }

    public Object a() {
        return this.f7794a;
    }
}
