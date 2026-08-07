package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class l0 extends androidx.p003lifecycle.c1 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final ViewModelProvider.Factory f8573z = new a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f8577v;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final HashMap<String, Fragment> f8574s = new HashMap<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final HashMap<String, l0> f8575t = new HashMap<>();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final HashMap<String, ViewModelStore> f8576u = new HashMap<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f8578w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f8579x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f8580y = false;

    class a implements ViewModelProvider.Factory {
        a() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NonNull
        public <T extends androidx.p003lifecycle.c1> T create(@NonNull Class<T> cls) {
            return new l0(true);
        }
    }

    l0(boolean z11) {
        this.f8577v = z11;
    }

    private void g(@NonNull String str, boolean z11) {
        l0 l0Var = this.f8575t.get(str);
        if (l0Var != null) {
            if (z11) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(l0Var.f8575t.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    l0Var.f((String) it.next(), true);
                }
            }
            l0Var.onCleared();
            this.f8575t.remove(str);
        }
        ViewModelStore viewModelStore = this.f8576u.get(str);
        if (viewModelStore != null) {
            viewModelStore.a();
            this.f8576u.remove(str);
        }
    }

    @NonNull
    static l0 j(ViewModelStore viewModelStore) {
        return (l0) new ViewModelProvider(viewModelStore, f8573z).b(l0.class);
    }

    void a(@NonNull Fragment fragment) {
        if (this.f8580y) {
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f8574s.containsKey(fragment.mWho)) {
                return;
            }
            this.f8574s.put(fragment.mWho, fragment);
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    void c(@NonNull Fragment fragment, boolean z11) {
        if (FragmentManager.O0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        g(fragment.mWho, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l0.class == obj.getClass()) {
            l0 l0Var = (l0) obj;
            if (this.f8574s.equals(l0Var.f8574s) && this.f8575t.equals(l0Var.f8575t) && this.f8576u.equals(l0Var.f8576u)) {
                return true;
            }
        }
        return false;
    }

    void f(@NonNull String str, boolean z11) {
        if (FragmentManager.O0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        g(str, z11);
    }

    Fragment h(String str) {
        return this.f8574s.get(str);
    }

    public int hashCode() {
        return (((this.f8574s.hashCode() * 31) + this.f8575t.hashCode()) * 31) + this.f8576u.hashCode();
    }

    @NonNull
    l0 i(@NonNull Fragment fragment) {
        l0 l0Var = this.f8575t.get(fragment.mWho);
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = new l0(this.f8577v);
        this.f8575t.put(fragment.mWho, l0Var2);
        return l0Var2;
    }

    @NonNull
    Collection<Fragment> k() {
        return new ArrayList(this.f8574s.values());
    }

    @NonNull
    ViewModelStore l(@NonNull Fragment fragment) {
        ViewModelStore viewModelStore = this.f8576u.get(fragment.mWho);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        this.f8576u.put(fragment.mWho, viewModelStore2);
        return viewModelStore2;
    }

    boolean m() {
        return this.f8578w;
    }

    void n(@NonNull Fragment fragment) {
        if (this.f8580y) {
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f8574s.remove(fragment.mWho) == null || !FragmentManager.O0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    void o(boolean z11) {
        this.f8580y = z11;
    }

    @Override // androidx.p003lifecycle.c1
    protected void onCleared() {
        if (FragmentManager.O0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f8578w = true;
    }

    boolean p(@NonNull Fragment fragment) {
        if (this.f8574s.containsKey(fragment.mWho)) {
            return this.f8577v ? this.f8578w : !this.f8579x;
        }
        return true;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f8574s.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f8575t.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f8576u.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }
}
