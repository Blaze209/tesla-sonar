package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class g1 extends Resources {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f2694b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<Context> f2695a;

    public g1(@NonNull Context context, @NonNull Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f2695a = new WeakReference<>(context);
    }

    public static boolean a() {
        return f2694b;
    }

    public static boolean b() {
        a();
        return false;
    }

    final Drawable c(int i11) {
        return super.getDrawable(i11);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i11) {
        Context context = this.f2695a.get();
        return context != null ? r0.g().s(context, this, i11) : super.getDrawable(i11);
    }
}
