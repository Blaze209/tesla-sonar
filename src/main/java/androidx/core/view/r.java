package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f7839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<MenuProvider> f7840b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<MenuProvider, a> f7841c = new HashMap();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Lifecycle f7842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.p003lifecycle.u f7843b;

        a(Lifecycle lifecycle, androidx.p003lifecycle.u uVar) {
            this.f7842a = lifecycle;
            this.f7843b = uVar;
            lifecycle.a(uVar);
        }

        void a() {
            this.f7842a.d(this.f7843b);
            this.f7843b = null;
        }
    }

    public r(Runnable runnable) {
        this.f7839a = runnable;
    }

    public static /* synthetic */ void a(r rVar, Lifecycle.State state, MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
        rVar.getClass();
        if (aVar == Lifecycle.a.upTo(state)) {
            rVar.c(menuProvider);
            return;
        }
        if (aVar == Lifecycle.a.ON_DESTROY) {
            rVar.j(menuProvider);
        } else if (aVar == Lifecycle.a.downFrom(state)) {
            rVar.f7840b.remove(menuProvider);
            rVar.f7839a.run();
        }
    }

    public static /* synthetic */ void b(r rVar, MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
        rVar.getClass();
        if (aVar == Lifecycle.a.ON_DESTROY) {
            rVar.j(menuProvider);
        }
    }

    public void c(MenuProvider menuProvider) {
        this.f7840b.add(menuProvider);
        this.f7839a.run();
    }

    public void d(final MenuProvider menuProvider, LifecycleOwner lifecycleOwner) {
        c(menuProvider);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        a aVarRemove = this.f7841c.remove(menuProvider);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f7841c.put(menuProvider, new a(lifecycle, new androidx.p003lifecycle.u() { // from class: androidx.core.view.q
            @Override // androidx.p003lifecycle.u
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.a aVar) {
                r.b(this.f7835a, menuProvider, lifecycleOwner2, aVar);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void e(final MenuProvider menuProvider, LifecycleOwner lifecycleOwner, final Lifecycle.State state) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        a aVarRemove = this.f7841c.remove(menuProvider);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f7841c.put(menuProvider, new a(lifecycle, new androidx.p003lifecycle.u() { // from class: androidx.core.view.p
            @Override // androidx.p003lifecycle.u
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.a aVar) {
                r.a(this.f7831a, state, menuProvider, lifecycleOwner2, aVar);
            }
        }));
    }

    public void f(Menu menu, MenuInflater menuInflater) {
        Iterator<MenuProvider> it = this.f7840b.iterator();
        while (it.hasNext()) {
            it.next().a(menu, menuInflater);
        }
    }

    public void g(Menu menu) {
        Iterator<MenuProvider> it = this.f7840b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean h(MenuItem menuItem) {
        Iterator<MenuProvider> it = this.f7840b.iterator();
        while (it.hasNext()) {
            if (it.next().d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void i(Menu menu) {
        Iterator<MenuProvider> it = this.f7840b.iterator();
        while (it.hasNext()) {
            it.next().c(menu);
        }
    }

    public void j(MenuProvider menuProvider) {
        this.f7840b.remove(menuProvider);
        a aVarRemove = this.f7841c.remove(menuProvider);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f7839a.run();
    }
}
