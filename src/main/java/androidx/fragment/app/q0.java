package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.adyen.checkout.components.core.Address;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Fragment> f8615a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, p0> f8616b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, Bundle> f8617c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l0 f8618d;

    q0() {
    }

    void A(@NonNull l0 l0Var) {
        this.f8618d = l0Var;
    }

    Bundle B(@NonNull String str, Bundle bundle) {
        return bundle != null ? this.f8617c.put(str, bundle) : this.f8617c.remove(str);
    }

    void a(@NonNull Fragment fragment) {
        if (this.f8615a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f8615a) {
            this.f8615a.add(fragment);
        }
        fragment.mAdded = true;
    }

    void b() {
        this.f8616b.values().removeAll(Collections.singleton(null));
    }

    boolean c(@NonNull String str) {
        return this.f8616b.get(str) != null;
    }

    void d(int i11) {
        for (p0 p0Var : this.f8616b.values()) {
            if (p0Var != null) {
                p0Var.s(i11);
            }
        }
    }

    void e(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f8616b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (p0 p0Var : this.f8616b.values()) {
                printWriter.print(str);
                if (p0Var != null) {
                    Fragment fragmentK = p0Var.k();
                    printWriter.println(fragmentK);
                    fragmentK.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(Address.ADDRESS_NULL_PLACEHOLDER);
                }
            }
        }
        int size = this.f8615a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i11 = 0; i11 < size; i11++) {
                Fragment fragment = this.f8615a.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    Fragment f(@NonNull String str) {
        p0 p0Var = this.f8616b.get(str);
        if (p0Var != null) {
            return p0Var.k();
        }
        return null;
    }

    Fragment g(int i11) {
        for (int size = this.f8615a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f8615a.get(size);
            if (fragment != null && fragment.mFragmentId == i11) {
                return fragment;
            }
        }
        for (p0 p0Var : this.f8616b.values()) {
            if (p0Var != null) {
                Fragment fragmentK = p0Var.k();
                if (fragmentK.mFragmentId == i11) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment h(String str) {
        if (str != null) {
            for (int size = this.f8615a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f8615a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (p0 p0Var : this.f8616b.values()) {
            if (p0Var != null) {
                Fragment fragmentK = p0Var.k();
                if (str.equals(fragmentK.mTag)) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment i(@NonNull String str) {
        Fragment fragmentFindFragmentByWho;
        for (p0 p0Var : this.f8616b.values()) {
            if (p0Var != null && (fragmentFindFragmentByWho = p0Var.k().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    int j(@NonNull Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f8615a.indexOf(fragment);
        for (int i11 = iIndexOf - 1; i11 >= 0; i11--) {
            Fragment fragment2 = this.f8615a.get(i11);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f8615a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f8615a.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    @NonNull
    List<p0> k() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : this.f8616b.values()) {
            if (p0Var != null) {
                arrayList.add(p0Var);
            }
        }
        return arrayList;
    }

    @NonNull
    List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : this.f8616b.values()) {
            if (p0Var != null) {
                arrayList.add(p0Var.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @NonNull
    HashMap<String, Bundle> m() {
        return this.f8617c;
    }

    p0 n(@NonNull String str) {
        return this.f8616b.get(str);
    }

    @NonNull
    List<Fragment> o() {
        ArrayList arrayList;
        if (this.f8615a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f8615a) {
            arrayList = new ArrayList(this.f8615a);
        }
        return arrayList;
    }

    l0 p() {
        return this.f8618d;
    }

    Bundle q(@NonNull String str) {
        return this.f8617c.get(str);
    }

    void r(@NonNull p0 p0Var) {
        Fragment fragmentK = p0Var.k();
        if (c(fragmentK.mWho)) {
            return;
        }
        this.f8616b.put(fragmentK.mWho, p0Var);
        if (fragmentK.mRetainInstanceChangedWhileDetached) {
            if (fragmentK.mRetainInstance) {
                this.f8618d.a(fragmentK);
            } else {
                this.f8618d.n(fragmentK);
            }
            fragmentK.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.O0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragmentK);
        }
    }

    void s(@NonNull p0 p0Var) {
        Fragment fragmentK = p0Var.k();
        if (fragmentK.mRetainInstance) {
            this.f8618d.n(fragmentK);
        }
        if (this.f8616b.get(fragmentK.mWho) == p0Var && this.f8616b.put(fragmentK.mWho, null) != null && FragmentManager.O0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentK);
        }
    }

    void t() {
        Iterator<Fragment> it = this.f8615a.iterator();
        while (it.hasNext()) {
            p0 p0Var = this.f8616b.get(it.next().mWho);
            if (p0Var != null) {
                p0Var.m();
            }
        }
        for (p0 p0Var2 : this.f8616b.values()) {
            if (p0Var2 != null) {
                p0Var2.m();
                Fragment fragmentK = p0Var2.k();
                if (fragmentK.mRemoving && !fragmentK.isInBackStack()) {
                    if (fragmentK.mBeingSaved && !this.f8617c.containsKey(fragmentK.mWho)) {
                        B(fragmentK.mWho, p0Var2.q());
                    }
                    s(p0Var2);
                }
            }
        }
    }

    void u(@NonNull Fragment fragment) {
        synchronized (this.f8615a) {
            this.f8615a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    void v() {
        this.f8616b.clear();
    }

    void w(List<String> list) {
        this.f8615a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment fragmentF = f(str);
                if (fragmentF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.O0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentF);
                }
                a(fragmentF);
            }
        }
    }

    void x(@NonNull HashMap<String, Bundle> map) {
        this.f8617c.clear();
        this.f8617c.putAll(map);
    }

    @NonNull
    ArrayList<String> y() {
        ArrayList<String> arrayList = new ArrayList<>(this.f8616b.size());
        for (p0 p0Var : this.f8616b.values()) {
            if (p0Var != null) {
                Fragment fragmentK = p0Var.k();
                B(fragmentK.mWho, p0Var.q());
                arrayList.add(fragmentK.mWho);
                if (FragmentManager.O0(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragmentK + ": " + fragmentK.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    ArrayList<String> z() {
        synchronized (this.f8615a) {
            try {
                if (this.f8615a.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.f8615a.size());
                for (Fragment fragment : this.f8615a) {
                    arrayList.add(fragment.mWho);
                    if (FragmentManager.O0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.mWho + "): " + fragment);
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
