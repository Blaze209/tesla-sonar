package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class y0 extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f2901c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList<WeakReference<y0>> f2902d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f2903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources.Theme f2904b;

    private y0(@NonNull Context context) {
        super(context);
        if (!g1.b()) {
            this.f2903a = new a1(this, context.getResources());
            this.f2904b = null;
            return;
        }
        g1 g1Var = new g1(this, context.getResources());
        this.f2903a = g1Var;
        Resources.Theme themeNewTheme = g1Var.newTheme();
        this.f2904b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(@NonNull Context context) {
        return ((context instanceof y0) || (context.getResources() instanceof a1) || (context.getResources() instanceof g1) || !g1.b()) ? false : true;
    }

    public static Context b(@NonNull Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f2901c) {
            try {
                ArrayList<WeakReference<y0>> arrayList = f2902d;
                if (arrayList == null) {
                    f2902d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<y0> weakReference = f2902d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f2902d.remove(size);
                        }
                    }
                    for (int size2 = f2902d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<y0> weakReference2 = f2902d.get(size2);
                        y0 y0Var = weakReference2 != null ? weakReference2.get() : null;
                        if (y0Var != null && y0Var.getBaseContext() == context) {
                            return y0Var;
                        }
                    }
                }
                y0 y0Var2 = new y0(context);
                f2902d.add(new WeakReference<>(y0Var2));
                return y0Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f2903a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f2903a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2904b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i11) {
        Resources.Theme theme = this.f2904b;
        if (theme == null) {
            super.setTheme(i11);
        } else {
            theme.applyStyle(i11, true);
        }
    }
}
