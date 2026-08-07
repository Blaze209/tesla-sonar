package rj;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.u;
import com.bumptech.glide.load.resource.bitmap.v;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class o implements Handler.Callback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b f108425f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile com.bumptech.glide.l f108426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f108427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.collection.a<View, Fragment> f108428c = new androidx.collection.a<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f108429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m f108430e;

    class a implements b {
        a() {
        }

        @Override // rj.o.b
        @NonNull
        public com.bumptech.glide.l a(@NonNull com.bumptech.glide.c cVar, @NonNull j jVar, @NonNull p pVar, @NonNull Context context) {
            return new com.bumptech.glide.l(cVar, jVar, pVar, context);
        }
    }

    public interface b {
        @NonNull
        com.bumptech.glide.l a(@NonNull com.bumptech.glide.c cVar, @NonNull j jVar, @NonNull p pVar, @NonNull Context context);
    }

    public o(b bVar) {
        bVar = bVar == null ? f108425f : bVar;
        this.f108427b = bVar;
        this.f108430e = new m(bVar);
        this.f108429d = b();
    }

    @TargetApi(17)
    private static void a(@NonNull Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static i b() {
        return (v.f20839f && v.f20838e) ? new h() : new f();
    }

    private static Activity c(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static void d(Collection<Fragment> collection, @NonNull Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                d(fragment.getChildFragmentManager().A0(), map);
            }
        }
    }

    private Fragment e(@NonNull View view, @NonNull u uVar) {
        this.f108428c.clear();
        d(uVar.getSupportFragmentManager().A0(), this.f108428c);
        View viewFindViewById = uVar.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.f108428c.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f108428c.clear();
        return fragment;
    }

    @NonNull
    private com.bumptech.glide.l j(@NonNull Context context) {
        if (this.f108426a == null) {
            synchronized (this) {
                try {
                    if (this.f108426a == null) {
                        this.f108426a = this.f108427b.a(com.bumptech.glide.c.e(context.getApplicationContext()), new rj.a(), new g(), context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f108426a;
    }

    private static boolean k(Context context) {
        Activity activityC = c(context);
        return activityC == null || !activityC.isFinishing();
    }

    @NonNull
    public com.bumptech.glide.l f(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (xj.l.s() && !(context instanceof Application)) {
            if (context instanceof u) {
                return i((u) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return f(contextWrapper.getBaseContext());
                }
            }
        }
        return j(context);
    }

    @NonNull
    public com.bumptech.glide.l g(@NonNull View view) {
        if (xj.l.r()) {
            return f(view.getContext().getApplicationContext());
        }
        xj.k.d(view);
        xj.k.e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityC = c(view.getContext());
        if (activityC == null) {
            return f(view.getContext().getApplicationContext());
        }
        if (!(activityC instanceof u)) {
            return f(view.getContext().getApplicationContext());
        }
        u uVar = (u) activityC;
        Fragment fragmentE = e(view, uVar);
        return fragmentE != null ? h(fragmentE) : i(uVar);
    }

    @NonNull
    public com.bumptech.glide.l h(@NonNull Fragment fragment) {
        xj.k.e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (xj.l.r()) {
            return f(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f108429d.a(fragment.getActivity());
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f108430e.b(context, com.bumptech.glide.c.e(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }

    @NonNull
    public com.bumptech.glide.l i(@NonNull u uVar) {
        if (xj.l.r()) {
            return f(uVar.getApplicationContext());
        }
        a(uVar);
        this.f108429d.a(uVar);
        boolean zK = k(uVar);
        return this.f108430e.b(uVar, com.bumptech.glide.c.e(uVar.getApplicationContext()), uVar.getLifecycle(), uVar.getSupportFragmentManager(), zK);
    }
}
