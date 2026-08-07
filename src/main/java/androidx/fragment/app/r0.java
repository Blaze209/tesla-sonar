package androidx.fragment.app;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.p003lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f8620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f8621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ArrayList<a> f8622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f8623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f8624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f8625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f8626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f8627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f8628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f8629j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    String f8630k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f8631l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    CharSequence f8632m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f8633n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    CharSequence f8634o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList<String> f8635p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList<String> f8636q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f8637r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ArrayList<Runnable> f8638s;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f8639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Fragment f8640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f8641c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f8642d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f8643e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f8644f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f8645g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Lifecycle.State f8646h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Lifecycle.State f8647i;

        a() {
        }

        a(int i11, Fragment fragment) {
            this.f8639a = i11;
            this.f8640b = fragment;
            this.f8641c = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f8646h = state;
            this.f8647i = state;
        }

        a(int i11, Fragment fragment, boolean z11) {
            this.f8639a = i11;
            this.f8640b = fragment;
            this.f8641c = z11;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f8646h = state;
            this.f8647i = state;
        }
    }

    @Deprecated
    public r0() {
        this.f8622c = new ArrayList<>();
        this.f8629j = true;
        this.f8637r = false;
        this.f8620a = null;
        this.f8621b = null;
    }

    @NonNull
    private Fragment k(@NonNull Class<? extends Fragment> cls, Bundle bundle) {
        y yVar = this.f8620a;
        if (yVar == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader = this.f8621b;
        if (classLoader == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        Fragment fragmentInstantiate = yVar.instantiate(classLoader, cls.getName());
        if (bundle != null) {
            fragmentInstantiate.setArguments(bundle);
        }
        return fragmentInstantiate;
    }

    @NonNull
    public r0 b(int i11, @NonNull Fragment fragment) {
        m(i11, fragment, null, 1);
        return this;
    }

    @NonNull
    public r0 c(int i11, @NonNull Fragment fragment, String str) {
        m(i11, fragment, str, 1);
        return this;
    }

    @NonNull
    public final r0 d(@NonNull ViewGroup viewGroup, @NonNull Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        fragment.mInDynamicContainer = true;
        return c(viewGroup.getId(), fragment, str);
    }

    @NonNull
    public r0 e(@NonNull Fragment fragment, String str) {
        m(0, fragment, str, 1);
        return this;
    }

    void f(a aVar) {
        this.f8622c.add(aVar);
        aVar.f8642d = this.f8623d;
        aVar.f8643e = this.f8624e;
        aVar.f8644f = this.f8625f;
        aVar.f8645g = this.f8626g;
    }

    public abstract int g();

    public abstract int h();

    public abstract void i();

    public abstract void j();

    @NonNull
    public r0 l() {
        if (this.f8628i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f8629j = false;
        return this;
    }

    void m(int i11, Fragment fragment, String str, int i12) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            g7.b.f(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i11 != 0) {
            if (i11 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i13 = fragment.mFragmentId;
            if (i13 != 0 && i13 != i11) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i11);
            }
            fragment.mFragmentId = i11;
            fragment.mContainerId = i11;
        }
        f(new a(i12, fragment));
    }

    @NonNull
    public r0 n(@NonNull Fragment fragment) {
        f(new a(3, fragment));
        return this;
    }

    @NonNull
    public r0 o(int i11, @NonNull Fragment fragment) {
        return p(i11, fragment, null);
    }

    @NonNull
    public r0 p(int i11, @NonNull Fragment fragment, String str) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        m(i11, fragment, str, 2);
        return this;
    }

    @NonNull
    public final r0 q(int i11, @NonNull Class<? extends Fragment> cls, Bundle bundle) {
        return r(i11, cls, bundle, null);
    }

    @NonNull
    public final r0 r(int i11, @NonNull Class<? extends Fragment> cls, Bundle bundle, String str) {
        return p(i11, k(cls, bundle), str);
    }

    @NonNull
    public r0 s(@NonNull Runnable runnable) {
        return t(false, runnable);
    }

    @NonNull
    r0 t(boolean z11, @NonNull Runnable runnable) {
        if (!z11) {
            l();
        }
        if (this.f8638s == null) {
            this.f8638s = new ArrayList<>();
        }
        this.f8638s.add(runnable);
        return this;
    }

    @NonNull
    public r0 u(int i11, int i12) {
        return v(i11, i12, 0, 0);
    }

    @NonNull
    public r0 v(int i11, int i12, int i13, int i14) {
        this.f8623d = i11;
        this.f8624e = i12;
        this.f8625f = i13;
        this.f8626g = i14;
        return this;
    }

    @NonNull
    public r0 w(Fragment fragment) {
        f(new a(8, fragment));
        return this;
    }

    @NonNull
    public r0 x(boolean z11) {
        this.f8637r = z11;
        return this;
    }

    r0(@NonNull y yVar, ClassLoader classLoader) {
        this.f8622c = new ArrayList<>();
        this.f8629j = true;
        this.f8637r = false;
        this.f8620a = yVar;
        this.f8621b = classLoader;
    }
}
