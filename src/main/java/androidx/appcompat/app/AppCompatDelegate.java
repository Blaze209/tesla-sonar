package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppCompatDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f2030a = -100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.collection.b<WeakReference<AppCompatDelegate>> f2031b = new androidx.collection.b<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f2032c = new Object();

    AppCompatDelegate() {
    }

    static void A(@NonNull AppCompatDelegate appCompatDelegate) {
        synchronized (f2032c) {
            B(appCompatDelegate);
        }
    }

    private static void B(@NonNull AppCompatDelegate appCompatDelegate) {
        synchronized (f2032c) {
            try {
                Iterator<WeakReference<AppCompatDelegate>> it = f2031b.iterator();
                while (it.hasNext()) {
                    AppCompatDelegate appCompatDelegate2 = it.next().get();
                    if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void G(int i11) {
        if (i11 != -1 && i11 != 0 && i11 != 1 && i11 != 2 && i11 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f2030a != i11) {
            f2030a = i11;
            f();
        }
    }

    static void c(@NonNull AppCompatDelegate appCompatDelegate) {
        synchronized (f2032c) {
            B(appCompatDelegate);
            f2031b.add(new WeakReference<>(appCompatDelegate));
        }
    }

    private static void f() {
        synchronized (f2032c) {
            try {
                Iterator<WeakReference<AppCompatDelegate>> it = f2031b.iterator();
                while (it.hasNext()) {
                    AppCompatDelegate appCompatDelegate = it.next().get();
                    if (appCompatDelegate != null) {
                        appCompatDelegate.e();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public static AppCompatDelegate i(@NonNull Activity activity, d dVar) {
        return new e(activity, dVar);
    }

    @NonNull
    public static AppCompatDelegate j(@NonNull Dialog dialog, d dVar) {
        return new e(dialog, dVar);
    }

    public static int l() {
        return f2030a;
    }

    public abstract boolean C(int i11);

    public abstract void D(int i11);

    public abstract void E(View view);

    public abstract void F(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void H(Toolbar toolbar);

    public void I(int i11) {
    }

    public abstract void J(CharSequence charSequence);

    public abstract ActionMode K(@NonNull ActionMode.Callback callback);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean e();

    @Deprecated
    public void g(Context context) {
    }

    @NonNull
    public Context h(@NonNull Context context) {
        g(context);
        return context;
    }

    public abstract <T extends View> T k(int i11);

    public abstract a m();

    public int n() {
        return -100;
    }

    public abstract MenuInflater o();

    public abstract ActionBar p();

    public abstract void q();

    public abstract void r();

    public abstract void s(Configuration configuration);

    public abstract void t(Bundle bundle);

    public abstract void u();

    public abstract void v(Bundle bundle);

    public abstract void w();

    public abstract void x(Bundle bundle);

    public abstract void y();

    public abstract void z();
}
