package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class a1 extends s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f2588b;

    public a1(@NonNull Context context, @NonNull Resources resources) {
        super(resources);
        this.f2588b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.s0, android.content.res.Resources
    public Drawable getDrawable(int i11) {
        Drawable drawable = super.getDrawable(i11);
        Context context = this.f2588b.get();
        if (drawable != null && context != null) {
            r0.g().w(context, i11, drawable);
        }
        return drawable;
    }
}
