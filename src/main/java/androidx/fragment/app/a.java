package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.ActionConst;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class a extends r0 implements FragmentManager.o {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final FragmentManager f8443t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f8444u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f8445v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f8446w;

    a(@NonNull FragmentManager fragmentManager) {
        super(fragmentManager.z0(), fragmentManager.B0() != null ? fragmentManager.B0().getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String().getClassLoader() : null);
        this.f8445v = -1;
        this.f8446w = false;
        this.f8443t = fragmentManager;
    }

    int A(boolean z11, boolean z12) {
        if (this.f8444u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.O0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new x0("FragmentManager"));
            B("  ", printWriter);
            printWriter.close();
        }
        this.f8444u = true;
        if (this.f8628i) {
            this.f8445v = this.f8443t.o();
        } else {
            this.f8445v = -1;
        }
        if (z12) {
            this.f8443t.d0(this, z11);
        }
        return this.f8445v;
    }

    public void B(String str, PrintWriter printWriter) {
        C(str, printWriter, true);
    }

    public void C(String str, PrintWriter printWriter, boolean z11) {
        String str2;
        if (z11) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f8630k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f8445v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f8444u);
            if (this.f8627h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f8627h));
            }
            if (this.f8623d != 0 || this.f8624e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8623d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8624e));
            }
            if (this.f8625f != 0 || this.f8626g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8625f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8626g));
            }
            if (this.f8631l != 0 || this.f8632m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8631l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f8632m);
            }
            if (this.f8633n != 0 || this.f8634o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8633n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f8634o);
            }
        }
        if (this.f8622c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f8622c.size();
        for (int i11 = 0; i11 < size; i11++) {
            r0.a aVar = this.f8622c.get(i11);
            switch (aVar.f8639a) {
                case 0:
                    str2 = ActionConst.NULL;
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f8639a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i11);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f8640b);
            if (z11) {
                if (aVar.f8642d != 0 || aVar.f8643e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f8642d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f8643e));
                }
                if (aVar.f8644f != 0 || aVar.f8645g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f8644f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f8645g));
                }
            }
        }
    }

    void D() {
        int size = this.f8622c.size();
        for (int i11 = 0; i11 < size; i11++) {
            r0.a aVar = this.f8622c.get(i11);
            Fragment fragment = aVar.f8640b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f8446w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f8627h);
                fragment.setSharedElementNames(this.f8635p, this.f8636q);
            }
            switch (aVar.f8639a) {
                case 1:
                    fragment.setAnimations(aVar.f8642d, aVar.f8643e, aVar.f8644f, aVar.f8645g);
                    this.f8443t.u1(fragment, false);
                    this.f8443t.l(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f8639a);
                case 3:
                    fragment.setAnimations(aVar.f8642d, aVar.f8643e, aVar.f8644f, aVar.f8645g);
                    this.f8443t.m1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f8642d, aVar.f8643e, aVar.f8644f, aVar.f8645g);
                    this.f8443t.L0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f8642d, aVar.f8643e, aVar.f8644f, aVar.f8645g);
                    this.f8443t.u1(fragment, false);
                    this.f8443t.B1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f8642d, aVar.f8643e, aVar.f8644f, aVar.f8645g);
                    this.f8443t.B(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f8642d, aVar.f8643e, aVar.f8644f, aVar.f8645g);
                    this.f8443t.u1(fragment, false);
                    this.f8443t.q(fragment);
                    break;
                case 8:
                    this.f8443t.z1(fragment);
                    break;
                case 9:
                    this.f8443t.z1(null);
                    break;
                case 10:
                    this.f8443t.y1(fragment, aVar.f8647i);
                    break;
            }
        }
    }

    void E() {
        for (int size = this.f8622c.size() - 1; size >= 0; size--) {
            r0.a aVar = this.f8622c.get(size);
            Fragment fragment = aVar.f8640b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f8446w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.r1(this.f8627h));
                fragment.setSharedElementNames(this.f8636q, this.f8635p);
            }
            switch (aVar.f8639a) {
                case 1:
                    fragment.setAnimations(aVar.f8642d, aVar.f8643e, aVar.f8644f, aVar.f8645g);
                    this.f8443t.u1(fragment, true);
                    this.f8443t.m1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f8639a);
                case 3:
                    fragment.setAnimations(aVar.f8642d, aVar.f8643e, aVar.f8644f, aVar.f8645g);
                    this.f8443t.l(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f8642d, aVar.f8643e, aVar.f8644f, aVar.f8645g);
                    this.f8443t.B1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f8642d, aVar.f8643e, aVar.f8644f, aVar.f8645g);
                    this.f8443t.u1(fragment, true);
                    this.f8443t.L0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f8642d, aVar.f8643e, aVar.f8644f, aVar.f8645g);
                    this.f8443t.q(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f8642d, aVar.f8643e, aVar.f8644f, aVar.f8645g);
                    this.f8443t.u1(fragment, true);
                    this.f8443t.B(fragment);
                    break;
                case 8:
                    this.f8443t.z1(null);
                    break;
                case 9:
                    this.f8443t.z1(fragment);
                    break;
                case 10:
                    this.f8443t.y1(fragment, aVar.f8646h);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    Fragment F(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i11 = 0;
        while (i11 < this.f8622c.size()) {
            r0.a aVar = this.f8622c.get(i11);
            int i12 = aVar.f8639a;
            if (i12 == 1) {
                arrayList.add(aVar.f8640b);
            } else if (i12 == 2) {
                Fragment fragment3 = aVar.f8640b;
                int i13 = fragment3.mContainerId;
                boolean z11 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = arrayList.get(size);
                    if (fragment4.mContainerId == i13) {
                        if (fragment4 == fragment3) {
                            z11 = true;
                        } else {
                            if (fragment4 == fragment2) {
                                this.f8622c.add(i11, new r0.a(9, fragment4, true));
                                i11++;
                                fragment2 = null;
                            }
                            r0.a aVar2 = new r0.a(3, fragment4, true);
                            aVar2.f8642d = aVar.f8642d;
                            aVar2.f8644f = aVar.f8644f;
                            aVar2.f8643e = aVar.f8643e;
                            aVar2.f8645g = aVar.f8645g;
                            this.f8622c.add(i11, aVar2);
                            arrayList.remove(fragment4);
                            i11++;
                        }
                    }
                }
                if (z11) {
                    this.f8622c.remove(i11);
                    i11--;
                } else {
                    aVar.f8639a = 1;
                    aVar.f8641c = true;
                    arrayList.add(fragment3);
                }
            } else if (i12 == 3 || i12 == 6) {
                arrayList.remove(aVar.f8640b);
                Fragment fragment5 = aVar.f8640b;
                if (fragment5 == fragment2) {
                    this.f8622c.add(i11, new r0.a(9, fragment5));
                    i11++;
                    fragment2 = null;
                }
            } else if (i12 == 7) {
                arrayList.add(aVar.f8640b);
            } else if (i12 == 8) {
                this.f8622c.add(i11, new r0.a(9, fragment2, true));
                aVar.f8641c = true;
                i11++;
                fragment2 = aVar.f8640b;
            }
            i11++;
        }
        return fragment2;
    }

    public String G() {
        return this.f8630k;
    }

    public void H() {
        if (this.f8638s != null) {
            for (int i11 = 0; i11 < this.f8638s.size(); i11++) {
                this.f8638s.get(i11).run();
            }
            this.f8638s = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    Fragment I(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f8622c.size() - 1; size >= 0; size--) {
            r0.a aVar = this.f8622c.get(size);
            int i11 = aVar.f8639a;
            if (i11 == 1) {
                arrayList.remove(aVar.f8640b);
            } else if (i11 != 3) {
                switch (i11) {
                    case 6:
                        arrayList.add(aVar.f8640b);
                        break;
                    case 7:
                        arrayList.remove(aVar.f8640b);
                        break;
                    case 8:
                        fragment = null;
                        break;
                    case 9:
                        fragment = aVar.f8640b;
                        break;
                    case 10:
                        aVar.f8647i = aVar.f8646h;
                        break;
                }
            } else {
                arrayList.add(aVar.f8640b);
            }
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.o
    public boolean a(@NonNull ArrayList<a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (FragmentManager.O0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f8628i) {
            return true;
        }
        this.f8443t.k(this);
        return true;
    }

    @Override // androidx.fragment.app.r0
    public int g() {
        return A(false, true);
    }

    @Override // androidx.fragment.app.r0
    public int h() {
        return A(true, true);
    }

    @Override // androidx.fragment.app.r0
    public void i() {
        l();
        this.f8443t.g0(this, false);
    }

    @Override // androidx.fragment.app.r0
    public void j() {
        l();
        this.f8443t.g0(this, true);
    }

    @Override // androidx.fragment.app.r0
    void m(int i11, Fragment fragment, String str, int i12) {
        super.m(i11, fragment, str, i12);
        fragment.mFragmentManager = this.f8443t;
    }

    @Override // androidx.fragment.app.r0
    @NonNull
    public r0 n(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f8443t) {
            return super.n(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f8445v >= 0) {
            sb2.append(" #");
            sb2.append(this.f8445v);
        }
        if (this.f8630k != null) {
            sb2.append(" ");
            sb2.append(this.f8630k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // androidx.fragment.app.r0
    @NonNull
    public r0 w(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.f8443t) {
            return super.w(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void y(int i11) {
        if (this.f8628i) {
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i11);
            }
            int size = this.f8622c.size();
            for (int i12 = 0; i12 < size; i12++) {
                r0.a aVar = this.f8622c.get(i12);
                Fragment fragment = aVar.f8640b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i11;
                    if (FragmentManager.O0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f8640b + " to " + aVar.f8640b.mBackStackNesting);
                    }
                }
            }
        }
    }

    void z() {
        int size = this.f8622c.size() - 1;
        while (size >= 0) {
            r0.a aVar = this.f8622c.get(size);
            if (aVar.f8641c) {
                if (aVar.f8639a == 8) {
                    aVar.f8641c = false;
                    this.f8622c.remove(size - 1);
                    size--;
                } else {
                    int i11 = aVar.f8640b.mContainerId;
                    aVar.f8639a = 2;
                    aVar.f8641c = false;
                    for (int i12 = size - 1; i12 >= 0; i12--) {
                        r0.a aVar2 = this.f8622c.get(i12);
                        if (aVar2.f8641c && aVar2.f8640b.mContainerId == i11) {
                            this.f8622c.remove(i12);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }
}
