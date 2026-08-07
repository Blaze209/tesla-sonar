package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.concurrent.CopyOnWriteArrayList;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u0018J/\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\u0013J\u001d\u0010 \u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b \u0010\u0013J\u001d\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0013J\u001d\u0010!\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b!\u0010\u0013J%\u0010#\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b#\u0010\u0018J\u001d\u0010$\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b$\u0010\u0013J\u001d\u0010%\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0013J\u001d\u0010&\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b&\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010*¨\u0006,"}, d2 = {"Landroidx/fragment/app/c0;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "Landroidx/fragment/app/FragmentManager$k;", "cb", "", "recursive", "Ljn0/h0;", "o", "(Landroidx/fragment/app/FragmentManager$k;Z)V", "p", "(Landroidx/fragment/app/FragmentManager$k;)V", "Landroidx/fragment/app/Fragment;", "f", "onlyRecursive", "g", "(Landroidx/fragment/app/Fragment;Z)V", "b", "Landroid/os/Bundle;", "savedInstanceState", "h", "(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V", "c", "a", "Landroid/view/View;", "v", "m", "(Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;Z)V", "k", IntegerTokenConverter.CONVERTER_KEY, "l", "outState", "j", "n", DateTokenConverter.CONVERTER_KEY, "e", "Landroidx/fragment/app/FragmentManager;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/fragment/app/c0$a;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "lifecycleCallbacks", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FragmentManager fragmentManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<a> lifecycleCallbacks;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/c0$a;", "", "Landroidx/fragment/app/FragmentManager$k;", "callback", "", "recursive", "<init>", "(Landroidx/fragment/app/FragmentManager$k;Z)V", "a", "Landroidx/fragment/app/FragmentManager$k;", "()Landroidx/fragment/app/FragmentManager$k;", "b", "Z", "()Z", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final FragmentManager.k callback;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean recursive;

        public a(FragmentManager.k callback, boolean z11) {
            p013kotlin.jvm.internal.s.k(callback, "callback");
            this.callback = callback;
            this.recursive = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FragmentManager.k getCallback() {
            return this.callback;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getRecursive() {
            return this.recursive;
        }
    }

    public c0(FragmentManager fragmentManager) {
        p013kotlin.jvm.internal.s.k(fragmentManager, "fragmentManager");
        this.fragmentManager = fragmentManager;
        this.lifecycleCallbacks = new CopyOnWriteArrayList<>();
    }

    public final void a(Fragment f11, Bundle savedInstanceState, boolean onlyRecursive) {
        p013kotlin.jvm.internal.s.k(f11, "f");
        Fragment fragmentE0 = this.fragmentManager.E0();
        if (fragmentE0 != null) {
            FragmentManager parentFragmentManager = fragmentE0.getParentFragmentManager();
            p013kotlin.jvm.internal.s.j(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.D0().a(f11, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentActivityCreated(this.fragmentManager, f11, savedInstanceState);
            }
        }
    }

    public final void b(Fragment f11, boolean onlyRecursive) {
        p013kotlin.jvm.internal.s.k(f11, "f");
        Context context = this.fragmentManager.B0().getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String();
        Fragment fragmentE0 = this.fragmentManager.E0();
        if (fragmentE0 != null) {
            FragmentManager parentFragmentManager = fragmentE0.getParentFragmentManager();
            p013kotlin.jvm.internal.s.j(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.D0().b(f11, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentAttached(this.fragmentManager, f11, context);
            }
        }
    }

    public final void c(Fragment f11, Bundle savedInstanceState, boolean onlyRecursive) {
        p013kotlin.jvm.internal.s.k(f11, "f");
        Fragment fragmentE0 = this.fragmentManager.E0();
        if (fragmentE0 != null) {
            FragmentManager parentFragmentManager = fragmentE0.getParentFragmentManager();
            p013kotlin.jvm.internal.s.j(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.D0().c(f11, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentCreated(this.fragmentManager, f11, savedInstanceState);
            }
        }
    }

    public final void d(Fragment f11, boolean onlyRecursive) {
        p013kotlin.jvm.internal.s.k(f11, "f");
        Fragment fragmentE0 = this.fragmentManager.E0();
        if (fragmentE0 != null) {
            FragmentManager parentFragmentManager = fragmentE0.getParentFragmentManager();
            p013kotlin.jvm.internal.s.j(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.D0().d(f11, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentDestroyed(this.fragmentManager, f11);
            }
        }
    }

    public final void e(Fragment f11, boolean onlyRecursive) {
        p013kotlin.jvm.internal.s.k(f11, "f");
        Fragment fragmentE0 = this.fragmentManager.E0();
        if (fragmentE0 != null) {
            FragmentManager parentFragmentManager = fragmentE0.getParentFragmentManager();
            p013kotlin.jvm.internal.s.j(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.D0().e(f11, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentDetached(this.fragmentManager, f11);
            }
        }
    }

    public final void f(Fragment f11, boolean onlyRecursive) {
        p013kotlin.jvm.internal.s.k(f11, "f");
        Fragment fragmentE0 = this.fragmentManager.E0();
        if (fragmentE0 != null) {
            FragmentManager parentFragmentManager = fragmentE0.getParentFragmentManager();
            p013kotlin.jvm.internal.s.j(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.D0().f(f11, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentPaused(this.fragmentManager, f11);
            }
        }
    }

    public final void g(Fragment f11, boolean onlyRecursive) {
        p013kotlin.jvm.internal.s.k(f11, "f");
        Context context = this.fragmentManager.B0().getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String();
        Fragment fragmentE0 = this.fragmentManager.E0();
        if (fragmentE0 != null) {
            FragmentManager parentFragmentManager = fragmentE0.getParentFragmentManager();
            p013kotlin.jvm.internal.s.j(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.D0().g(f11, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentPreAttached(this.fragmentManager, f11, context);
            }
        }
    }

    public final void h(Fragment f11, Bundle savedInstanceState, boolean onlyRecursive) {
        p013kotlin.jvm.internal.s.k(f11, "f");
        Fragment fragmentE0 = this.fragmentManager.E0();
        if (fragmentE0 != null) {
            FragmentManager parentFragmentManager = fragmentE0.getParentFragmentManager();
            p013kotlin.jvm.internal.s.j(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.D0().h(f11, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentPreCreated(this.fragmentManager, f11, savedInstanceState);
            }
        }
    }

    public final void i(Fragment f11, boolean onlyRecursive) {
        p013kotlin.jvm.internal.s.k(f11, "f");
        Fragment fragmentE0 = this.fragmentManager.E0();
        if (fragmentE0 != null) {
            FragmentManager parentFragmentManager = fragmentE0.getParentFragmentManager();
            p013kotlin.jvm.internal.s.j(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.D0().i(f11, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentResumed(this.fragmentManager, f11);
            }
        }
    }

    public final void j(Fragment f11, Bundle outState, boolean onlyRecursive) {
        p013kotlin.jvm.internal.s.k(f11, "f");
        p013kotlin.jvm.internal.s.k(outState, "outState");
        Fragment fragmentE0 = this.fragmentManager.E0();
        if (fragmentE0 != null) {
            FragmentManager parentFragmentManager = fragmentE0.getParentFragmentManager();
            p013kotlin.jvm.internal.s.j(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.D0().j(f11, outState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentSaveInstanceState(this.fragmentManager, f11, outState);
            }
        }
    }

    public final void k(Fragment f11, boolean onlyRecursive) {
        p013kotlin.jvm.internal.s.k(f11, "f");
        Fragment fragmentE0 = this.fragmentManager.E0();
        if (fragmentE0 != null) {
            FragmentManager parentFragmentManager = fragmentE0.getParentFragmentManager();
            p013kotlin.jvm.internal.s.j(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.D0().k(f11, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentStarted(this.fragmentManager, f11);
            }
        }
    }

    public final void l(Fragment f11, boolean onlyRecursive) {
        p013kotlin.jvm.internal.s.k(f11, "f");
        Fragment fragmentE0 = this.fragmentManager.E0();
        if (fragmentE0 != null) {
            FragmentManager parentFragmentManager = fragmentE0.getParentFragmentManager();
            p013kotlin.jvm.internal.s.j(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.D0().l(f11, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentStopped(this.fragmentManager, f11);
            }
        }
    }

    public final void m(Fragment f11, View v11, Bundle savedInstanceState, boolean onlyRecursive) {
        p013kotlin.jvm.internal.s.k(f11, "f");
        p013kotlin.jvm.internal.s.k(v11, "v");
        Fragment fragmentE0 = this.fragmentManager.E0();
        if (fragmentE0 != null) {
            FragmentManager parentFragmentManager = fragmentE0.getParentFragmentManager();
            p013kotlin.jvm.internal.s.j(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.D0().m(f11, v11, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentViewCreated(this.fragmentManager, f11, v11, savedInstanceState);
            }
        }
    }

    public final void n(Fragment f11, boolean onlyRecursive) {
        p013kotlin.jvm.internal.s.k(f11, "f");
        Fragment fragmentE0 = this.fragmentManager.E0();
        if (fragmentE0 != null) {
            FragmentManager parentFragmentManager = fragmentE0.getParentFragmentManager();
            p013kotlin.jvm.internal.s.j(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.D0().n(f11, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().onFragmentViewDestroyed(this.fragmentManager, f11);
            }
        }
    }

    public final void o(FragmentManager.k cb2, boolean recursive) {
        p013kotlin.jvm.internal.s.k(cb2, "cb");
        this.lifecycleCallbacks.add(new a(cb2, recursive));
    }

    public final void p(FragmentManager.k cb2) {
        p013kotlin.jvm.internal.s.k(cb2, "cb");
        synchronized (this.lifecycleCallbacks) {
            try {
                int size = this.lifecycleCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (this.lifecycleCallbacks.get(i11).getCallback() == cb2) {
                        this.lifecycleCallbacks.remove(i11);
                        break;
                    }
                }
                jn0.h0 h0Var = jn0.h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
