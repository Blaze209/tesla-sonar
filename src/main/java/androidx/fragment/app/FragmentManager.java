package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import androidx.core.view.MenuProvider;
import androidx.p002activity.OnBackPressedDispatcher;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p002activity.result.ActivityResultRegistry;
import androidx.p002activity.result.contract.ActivityResultContract;
import androidx.p002activity.result.contract.ActivityResultContracts$RequestMultiplePermissions;
import androidx.p002activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.f1;
import androidx.savedstate.SavedStateRegistry;
import com.adyen.checkout.components.core.Address;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {
    private static boolean U = false;
    static boolean V = true;
    Fragment A;
    private ActivityResultLauncher<Intent> F;
    private ActivityResultLauncher<h.e> G;
    private ActivityResultLauncher<String[]> H;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private ArrayList<androidx.fragment.app.a> O;
    private ArrayList<Boolean> P;
    private ArrayList<Fragment> Q;
    private l0 R;
    private g7.b.c S;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8394b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<Fragment> f8397e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private OnBackPressedDispatcher f8399g;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private z<?> f8416x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private w f8417y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Fragment f8418z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<o> f8393a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q0 f8395c = new q0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f8396d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b0 f8398f = new b0(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    androidx.fragment.app.a f8400h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f8401i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.p002activity.b0 f8402j = new b(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f8403k = new AtomicInteger();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<String, androidx.fragment.app.c> f8404l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map<String, Bundle> f8405m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<String, m> f8406n = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ArrayList<n> f8407o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final c0 f8408p = new c0(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final CopyOnWriteArrayList<m0> f8409q = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Consumer<Configuration> f8410r = new Consumer() { // from class: androidx.fragment.app.d0
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            FragmentManager.f(this.f8497a, (Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Consumer<Integer> f8411s = new Consumer() { // from class: androidx.fragment.app.e0
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            FragmentManager.a(this.f8501a, (Integer) obj);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Consumer<androidx.core.app.l> f8412t = new Consumer() { // from class: androidx.fragment.app.f0
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            FragmentManager.e(this.f8549a, (androidx.core.app.l) obj);
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Consumer<androidx.core.app.w> f8413u = new Consumer() { // from class: androidx.fragment.app.g0
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            FragmentManager.d(this.f8551a, (androidx.core.app.w) obj);
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final MenuProvider f8414v = new c();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f8415w = -1;
    private y B = null;
    private y C = new d();
    private b1 D = null;
    private b1 E = new e();
    ArrayDeque<l> I = new ArrayDeque<>();
    private Runnable T = new f();

    static class FragmentIntentSenderContract extends ActivityResultContract<h.e, h.a> {
        FragmentIntentSenderContract() {
        }

        @Override // androidx.p002activity.result.contract.ActivityResultContract
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NonNull Context context, h.e eVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent fillInIntent = eVar.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                fillInIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (fillInIntent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    eVar = new h.e.a(eVar.getIntentSender()).b(null).c(eVar.getFlagsValues(), eVar.getFlagsMask()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eVar);
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // androidx.p002activity.result.contract.ActivityResultContract
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h.a parseResult(int i11, Intent intent) {
            return new h.a(i11, intent);
        }
    }

    class a implements ActivityResultCallback<Map<String, Boolean>> {
        a() {
        }

        @Override // androidx.p002activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                iArr[i11] = ((Boolean) arrayList.get(i11)).booleanValue() ? 0 : -1;
            }
            l lVarPollFirst = FragmentManager.this.I.pollFirst();
            if (lVarPollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = lVarPollFirst.f8433a;
            int i12 = lVarPollFirst.f8434b;
            Fragment fragmentI = FragmentManager.this.f8395c.i(str);
            if (fragmentI != null) {
                fragmentI.onRequestPermissionsResult(i12, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    class b extends androidx.p002activity.b0 {
        b(boolean z11) {
            super(z11);
        }

        @Override // androidx.p002activity.b0
        public void handleOnBackCancelled() {
            if (FragmentManager.O0(3)) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = " + FragmentManager.V + " fragment manager " + FragmentManager.this);
            }
            if (FragmentManager.V) {
                FragmentManager.this.s();
            }
        }

        @Override // androidx.p002activity.b0
        public void handleOnBackPressed() {
            if (FragmentManager.O0(3)) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = " + FragmentManager.V + " fragment manager " + FragmentManager.this);
            }
            FragmentManager.this.K0();
        }

        @Override // androidx.p002activity.b0
        public void handleOnBackProgressed(@NonNull androidx.p002activity.b bVar) {
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = " + FragmentManager.V + " fragment manager " + FragmentManager.this);
            }
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.f8400h != null) {
                Iterator<a1> it = fragmentManager.z(new ArrayList<>(Collections.singletonList(FragmentManager.this.f8400h)), 0, 1).iterator();
                while (it.hasNext()) {
                    it.next().A(bVar);
                }
                Iterator<n> it2 = FragmentManager.this.f8407o.iterator();
                while (it2.hasNext()) {
                    it2.next().c(bVar);
                }
            }
        }

        @Override // androidx.p002activity.b0
        public void handleOnBackStarted(@NonNull androidx.p002activity.b bVar) {
            if (FragmentManager.O0(3)) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = " + FragmentManager.V + " fragment manager " + FragmentManager.this);
            }
            if (FragmentManager.V) {
                FragmentManager.this.c0();
                FragmentManager.this.k1();
            }
        }
    }

    class c implements MenuProvider {
        c() {
        }

        @Override // androidx.core.view.MenuProvider
        public void a(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
            FragmentManager.this.H(menu, menuInflater);
        }

        @Override // androidx.core.view.MenuProvider
        public void b(@NonNull Menu menu) {
            FragmentManager.this.P(menu);
        }

        @Override // androidx.core.view.MenuProvider
        public void c(@NonNull Menu menu) {
            FragmentManager.this.T(menu);
        }

        @Override // androidx.core.view.MenuProvider
        public boolean d(@NonNull MenuItem menuItem) {
            return FragmentManager.this.O(menuItem);
        }
    }

    class d extends y {
        d() {
        }

        @Override // androidx.fragment.app.y
        @NonNull
        public Fragment instantiate(@NonNull ClassLoader classLoader, @NonNull String str) {
            return FragmentManager.this.B0().b(FragmentManager.this.B0().getContext(), str, null);
        }
    }

    class e implements b1 {
        e() {
        }

        @Override // androidx.fragment.app.b1
        @NonNull
        public a1 a(@NonNull ViewGroup viewGroup) {
            return new androidx.fragment.app.f(viewGroup);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.f0(true);
        }
    }

    class g implements androidx.p003lifecycle.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n0 f8426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Lifecycle f8427c;

        g(String str, n0 n0Var, Lifecycle lifecycle) {
            this.f8425a = str;
            this.f8426b = n0Var;
            this.f8427c = lifecycle;
        }

        @Override // androidx.p003lifecycle.u
        public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.a aVar) {
            Bundle bundle;
            if (aVar == Lifecycle.a.ON_START && (bundle = (Bundle) FragmentManager.this.f8405m.get(this.f8425a)) != null) {
                this.f8426b.a(this.f8425a, bundle);
                FragmentManager.this.x(this.f8425a);
            }
            if (aVar == Lifecycle.a.ON_DESTROY) {
                this.f8427c.d(this);
                FragmentManager.this.f8406n.remove(this.f8425a);
            }
        }
    }

    class h implements m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f8429a;

        h(Fragment fragment) {
            this.f8429a = fragment;
        }

        @Override // androidx.fragment.app.m0
        public void a(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
            this.f8429a.onAttachFragment(fragment);
        }
    }

    class i implements ActivityResultCallback<h.a> {
        i() {
        }

        @Override // androidx.p002activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(h.a aVar) {
            l lVarPollLast = FragmentManager.this.I.pollLast();
            if (lVarPollLast == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = lVarPollLast.f8433a;
            int i11 = lVarPollLast.f8434b;
            Fragment fragmentI = FragmentManager.this.f8395c.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i11, aVar.getCom.adyen.checkout.components.core.internal.data.model.StatusResponse.RESULT_CODE java.lang.String(), aVar.getData());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    class j implements ActivityResultCallback<h.a> {
        j() {
        }

        @Override // androidx.p002activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(h.a aVar) {
            l lVarPollFirst = FragmentManager.this.I.pollFirst();
            if (lVarPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = lVarPollFirst.f8433a;
            int i11 = lVarPollFirst.f8434b;
            Fragment fragmentI = FragmentManager.this.f8395c.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i11, aVar.getCom.adyen.checkout.components.core.internal.data.model.StatusResponse.RESULT_CODE java.lang.String(), aVar.getData());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    public static abstract class k {
        @Deprecated
        public void onFragmentActivityCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, Bundle bundle) {
        }

        public void onFragmentAttached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void onFragmentCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, Bundle bundle) {
        }

        public void onFragmentDestroyed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentDetached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentPaused(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentPreAttached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void onFragmentPreCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, Bundle bundle) {
        }

        public void onFragmentResumed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Bundle bundle) {
        }

        public void onFragmentStarted(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentStopped(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentViewCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }
    }

    private static class m implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Lifecycle f8435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n0 f8436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.p003lifecycle.u f8437c;

        m(@NonNull Lifecycle lifecycle, @NonNull n0 n0Var, @NonNull androidx.p003lifecycle.u uVar) {
            this.f8435a = lifecycle;
            this.f8436b = n0Var;
            this.f8437c = uVar;
        }

        @Override // androidx.fragment.app.n0
        public void a(@NonNull String str, @NonNull Bundle bundle) {
            this.f8436b.a(str, bundle);
        }

        public boolean b(Lifecycle.State state) {
            return this.f8435a.getState().isAtLeast(state);
        }

        public void c() {
            this.f8435a.d(this.f8437c);
        }
    }

    public interface n {
        default void a(@NonNull Fragment fragment, boolean z11) {
        }

        default void b() {
        }

        default void c(@NonNull androidx.p002activity.b bVar) {
        }

        default void d(@NonNull Fragment fragment, boolean z11) {
        }

        void onBackStackChanged();
    }

    interface o {
        boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2);
    }

    private class p implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f8438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f8439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f8440c;

        p(String str, int i11, int i12) {
            this.f8438a = str;
            this.f8439b = i11;
            this.f8440c = i12;
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.A;
            if (fragment == null || this.f8439b >= 0 || this.f8438a != null || !fragment.getChildFragmentManager().f1()) {
                return FragmentManager.this.i1(arrayList, arrayList2, this.f8438a, this.f8439b, this.f8440c);
            }
            return false;
        }
    }

    class q implements o {
        q() {
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            boolean zJ1 = FragmentManager.this.j1(arrayList, arrayList2);
            if (!FragmentManager.this.f8407o.isEmpty() && arrayList.size() > 0) {
                boolean zBooleanValue = arrayList2.get(arrayList.size() - 1).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<androidx.fragment.app.a> it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(FragmentManager.this.t0(it.next()));
                }
                for (n nVar : FragmentManager.this.f8407o) {
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        nVar.a((Fragment) it2.next(), zBooleanValue);
                    }
                }
            }
            return zJ1;
        }
    }

    private void A1(@NonNull Fragment fragment) {
        ViewGroup viewGroupY0 = y0(fragment);
        if (viewGroupY0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupY0.getTag(f7.b.f64526c) == null) {
            viewGroupY0.setTag(f7.b.f64526c, fragment);
        }
        ((Fragment) viewGroupY0.getTag(f7.b.f64526c)).setPopDirection(fragment.getPopDirection());
    }

    private void C1() {
        Iterator<p0> it = this.f8395c.k().iterator();
        while (it.hasNext()) {
            c1(it.next());
        }
    }

    private void D1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new x0("FragmentManager"));
        z<?> zVar = this.f8416x;
        if (zVar != null) {
            try {
                zVar.i("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e11) {
                Log.e("FragmentManager", "Failed dumping state", e11);
                throw runtimeException;
            }
        }
        try {
            b0("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e12) {
            Log.e("FragmentManager", "Failed dumping state", e12);
            throw runtimeException;
        }
    }

    private void F1() {
        synchronized (this.f8393a) {
            try {
                if (!this.f8393a.isEmpty()) {
                    this.f8402j.setEnabled(true);
                    if (O0(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z11 = v0() > 0 && T0(this.f8418z);
                if (O0(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z11);
                }
                this.f8402j.setEnabled(z11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static Fragment I0(@NonNull View view) {
        Object tag = view.getTag(f7.b.f64524a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean O0(int i11) {
        return U || Log.isLoggable("FragmentManager", i11);
    }

    private boolean P0(@NonNull Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.t();
    }

    private void Q(Fragment fragment) {
        if (fragment == null || !fragment.equals(k0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    private boolean Q0() {
        Fragment fragment = this.f8418z;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f8418z.getParentFragmentManager().Q0();
    }

    private void X(int i11) {
        try {
            this.f8394b = true;
            this.f8395c.d(i11);
            Z0(i11, false);
            Iterator<a1> it = y().iterator();
            while (it.hasNext()) {
                it.next().q();
            }
            this.f8394b = false;
            f0(true);
        } catch (Throwable th2) {
            this.f8394b = false;
            throw th2;
        }
    }

    public static /* synthetic */ void a(FragmentManager fragmentManager, Integer num) {
        if (fragmentManager.Q0() && num.intValue() == 80) {
            fragmentManager.K(false);
        }
    }

    private void a0() {
        if (this.N) {
            this.N = false;
            C1();
        }
    }

    public static /* synthetic */ void c(FragmentManager fragmentManager) {
        Iterator<n> it = fragmentManager.f8407o.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        Iterator<a1> it = y().iterator();
        while (it.hasNext()) {
            it.next().q();
        }
    }

    public static /* synthetic */ void d(FragmentManager fragmentManager, androidx.core.app.w wVar) {
        if (fragmentManager.Q0()) {
            fragmentManager.S(wVar.getIsInPictureInPictureMode(), false);
        }
    }

    public static /* synthetic */ void e(FragmentManager fragmentManager, androidx.core.app.l lVar) {
        if (fragmentManager.Q0()) {
            fragmentManager.L(lVar.getIsInMultiWindowMode(), false);
        }
    }

    private void e0(boolean z11) {
        if (this.f8394b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f8416x == null) {
            if (!this.M) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f8416x.getHandler().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z11) {
            u();
        }
        if (this.O == null) {
            this.O = new ArrayList<>();
            this.P = new ArrayList<>();
        }
    }

    public static /* synthetic */ void f(FragmentManager fragmentManager, Configuration configuration) {
        if (fragmentManager.Q0()) {
            fragmentManager.E(configuration, false);
        }
    }

    private static void h0(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i11, int i12) {
        while (i11 < i12) {
            androidx.fragment.app.a aVar = arrayList.get(i11);
            if (arrayList2.get(i11).booleanValue()) {
                aVar.y(-1);
                aVar.E();
            } else {
                aVar.y(1);
                aVar.D();
            }
            i11++;
        }
    }

    private boolean h1(String str, int i11, int i12) {
        f0(false);
        e0(true);
        Fragment fragment = this.A;
        if (fragment != null && i11 < 0 && str == null && fragment.getChildFragmentManager().f1()) {
            return true;
        }
        boolean zI1 = i1(this.O, this.P, str, i11, i12);
        if (zI1) {
            this.f8394b = true;
            try {
                n1(this.O, this.P);
                v();
            } catch (Throwable th2) {
                v();
                throw th2;
            }
        }
        F1();
        a0();
        this.f8395c.b();
        return zI1;
    }

    private void i0(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i11, int i12) {
        boolean z11 = arrayList.get(i11).f8637r;
        ArrayList<Fragment> arrayList3 = this.Q;
        if (arrayList3 == null) {
            this.Q = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.Q.addAll(this.f8395c.o());
        Fragment fragmentF0 = F0();
        boolean z12 = false;
        for (int i13 = i11; i13 < i12; i13++) {
            androidx.fragment.app.a aVar = arrayList.get(i13);
            fragmentF0 = !arrayList2.get(i13).booleanValue() ? aVar.F(this.Q, fragmentF0) : aVar.I(this.Q, fragmentF0);
            z12 = z12 || aVar.f8628i;
        }
        this.Q.clear();
        if (!z11 && this.f8415w >= 1) {
            for (int i14 = i11; i14 < i12; i14++) {
                Iterator<r0.a> it = arrayList.get(i14).f8622c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f8640b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f8395c.r(A(fragment));
                    }
                }
            }
        }
        h0(arrayList, arrayList2, i11, i12);
        boolean zBooleanValue = arrayList2.get(i12 - 1).booleanValue();
        if (z12 && !this.f8407o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<androidx.fragment.app.a> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(t0(it2.next()));
            }
            if (this.f8400h == null) {
                for (n nVar : this.f8407o) {
                    Iterator it3 = linkedHashSet.iterator();
                    while (it3.hasNext()) {
                        nVar.a((Fragment) it3.next(), zBooleanValue);
                    }
                }
                for (n nVar2 : this.f8407o) {
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        nVar2.d((Fragment) it4.next(), zBooleanValue);
                    }
                }
            }
        }
        for (int i15 = i11; i15 < i12; i15++) {
            androidx.fragment.app.a aVar2 = arrayList.get(i15);
            if (zBooleanValue) {
                for (int size = aVar2.f8622c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = aVar2.f8622c.get(size).f8640b;
                    if (fragment2 != null) {
                        A(fragment2).m();
                    }
                }
            } else {
                Iterator<r0.a> it5 = aVar2.f8622c.iterator();
                while (it5.hasNext()) {
                    Fragment fragment3 = it5.next().f8640b;
                    if (fragment3 != null) {
                        A(fragment3).m();
                    }
                }
            }
        }
        Z0(this.f8415w, true);
        for (a1 a1Var : z(arrayList, i11, i12)) {
            a1Var.D(zBooleanValue);
            a1Var.z();
            a1Var.n();
        }
        while (i11 < i12) {
            androidx.fragment.app.a aVar3 = arrayList.get(i11);
            if (arrayList2.get(i11).booleanValue() && aVar3.f8445v >= 0) {
                aVar3.f8445v = -1;
            }
            aVar3.H();
            i11++;
        }
        if (z12) {
            p1();
        }
    }

    private int l0(String str, int i11, boolean z11) {
        if (this.f8396d.isEmpty()) {
            return -1;
        }
        if (str == null && i11 < 0) {
            if (z11) {
                return 0;
            }
            return this.f8396d.size() - 1;
        }
        int size = this.f8396d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = this.f8396d.get(size);
            if ((str != null && str.equals(aVar.G())) || (i11 >= 0 && i11 == aVar.f8445v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z11) {
            if (size == this.f8396d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = this.f8396d.get(size - 1);
            if ((str == null || !str.equals(aVar2.G())) && (i11 < 0 || i11 != aVar2.f8445v)) {
                break;
            }
            size--;
        }
        return size;
    }

    @NonNull
    public static <F extends Fragment> F m0(@NonNull View view) {
        F f11 = (F) r0(view);
        if (f11 != null) {
            return f11;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    private void n1(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            if (!arrayList.get(i11).f8637r) {
                if (i12 != i11) {
                    i0(arrayList, arrayList2, i12, i11);
                }
                i12 = i11 + 1;
                if (arrayList2.get(i11).booleanValue()) {
                    while (i12 < size && arrayList2.get(i12).booleanValue() && !arrayList.get(i12).f8637r) {
                        i12++;
                    }
                }
                i0(arrayList, arrayList2, i11, i12);
                i11 = i12 - 1;
            }
            i11++;
        }
        if (i12 != size) {
            i0(arrayList, arrayList2, i12, size);
        }
    }

    private void p1() {
        for (int i11 = 0; i11 < this.f8407o.size(); i11++) {
            this.f8407o.get(i11).onBackStackChanged();
        }
    }

    @NonNull
    public static FragmentManager q0(@NonNull View view) {
        u uVar;
        Fragment fragmentR0 = r0(view);
        if (fragmentR0 != null) {
            if (fragmentR0.isAdded()) {
                return fragmentR0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + fragmentR0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                uVar = null;
                break;
            }
            if (context instanceof u) {
                uVar = (u) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (uVar != null) {
            return uVar.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    static Fragment r0(@NonNull View view) {
        while (view != null) {
            Fragment fragmentI0 = I0(view);
            if (fragmentI0 != null) {
                return fragmentI0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    static int r1(int i11) {
        if (i11 == 4097) {
            return 8194;
        }
        if (i11 == 8194) {
            return 4097;
        }
        if (i11 == 8197) {
            return 4100;
        }
        if (i11 != 4099) {
            return i11 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    private void s0() {
        Iterator<a1> it = y().iterator();
        while (it.hasNext()) {
            it.next().r();
        }
    }

    private void u() {
        if (V0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private boolean u0(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        synchronized (this.f8393a) {
            if (this.f8393a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f8393a.size();
                boolean zA = false;
                for (int i11 = 0; i11 < size; i11++) {
                    zA |= this.f8393a.get(i11).a(arrayList, arrayList2);
                }
                this.f8393a.clear();
                this.f8416x.getHandler().removeCallbacks(this.T);
                return zA;
            } catch (Throwable th2) {
                this.f8393a.clear();
                this.f8416x.getHandler().removeCallbacks(this.T);
                throw th2;
            }
        }
    }

    private void v() {
        this.f8394b = false;
        this.P.clear();
        this.O.clear();
    }

    private void w() {
        boolean zM;
        z<?> zVar = this.f8416x;
        if (zVar instanceof f1) {
            zM = this.f8395c.p().m();
        } else {
            zM = zVar.getContext() instanceof Activity ? !((Activity) this.f8416x.getContext()).isChangingConfigurations() : true;
        }
        if (zM) {
            Iterator<androidx.fragment.app.c> it = this.f8404l.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().f8489a.iterator();
                while (it2.hasNext()) {
                    this.f8395c.p().f(it2.next(), false);
                }
            }
        }
    }

    @NonNull
    private l0 w0(@NonNull Fragment fragment) {
        return this.R.i(fragment);
    }

    private Set<a1> y() {
        HashSet hashSet = new HashSet();
        Iterator<p0> it = this.f8395c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().mContainer;
            if (viewGroup != null) {
                hashSet.add(a1.v(viewGroup, G0()));
            }
        }
        return hashSet;
    }

    private ViewGroup y0(@NonNull Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f8417y.d()) {
            View viewC = this.f8417y.c(fragment.mContainerId);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    @NonNull
    p0 A(@NonNull Fragment fragment) {
        p0 p0VarN = this.f8395c.n(fragment.mWho);
        if (p0VarN != null) {
            return p0VarN;
        }
        p0 p0Var = new p0(this.f8408p, this.f8395c, fragment);
        p0Var.o(this.f8416x.getContext().getClassLoader());
        p0Var.s(this.f8415w);
        return p0Var;
    }

    @NonNull
    public List<Fragment> A0() {
        return this.f8395c.o();
    }

    void B(@NonNull Fragment fragment) {
        if (O0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (O0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f8395c.u(fragment);
            if (P0(fragment)) {
                this.J = true;
            }
            A1(fragment);
        }
    }

    @NonNull
    public z<?> B0() {
        return this.f8416x;
    }

    void B1(@NonNull Fragment fragment) {
        if (O0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    void C() {
        this.K = false;
        this.L = false;
        this.R.o(false);
        X(4);
    }

    @NonNull
    LayoutInflater.Factory2 C0() {
        return this.f8398f;
    }

    void D() {
        this.K = false;
        this.L = false;
        this.R.o(false);
        X(0);
    }

    @NonNull
    c0 D0() {
        return this.f8408p;
    }

    void E(@NonNull Configuration configuration, boolean z11) {
        if (z11 && (this.f8416x instanceof androidx.core.content.d)) {
            D1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f8395c.o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z11) {
                    fragment.mChildFragmentManager.E(configuration, true);
                }
            }
        }
    }

    Fragment E0() {
        return this.f8418z;
    }

    public void E1(@NonNull k kVar) {
        this.f8408p.p(kVar);
    }

    boolean F(@NonNull MenuItem menuItem) {
        if (this.f8415w < 1) {
            return false;
        }
        for (Fragment fragment : this.f8395c.o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public Fragment F0() {
        return this.A;
    }

    void G() {
        this.K = false;
        this.L = false;
        this.R.o(false);
        X(1);
    }

    @NonNull
    b1 G0() {
        b1 b1Var = this.D;
        if (b1Var != null) {
            return b1Var;
        }
        Fragment fragment = this.f8418z;
        return fragment != null ? fragment.mFragmentManager.G0() : this.E;
    }

    boolean H(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.f8415w < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z11 = false;
        for (Fragment fragment : this.f8395c.o()) {
            if (fragment != null && S0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z11 = true;
            }
        }
        if (this.f8397e != null) {
            for (int i11 = 0; i11 < this.f8397e.size(); i11++) {
                Fragment fragment2 = this.f8397e.get(i11);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f8397e = arrayList;
        return z11;
    }

    public g7.b.c H0() {
        return this.S;
    }

    void I() {
        this.M = true;
        f0(true);
        c0();
        w();
        X(-1);
        Object obj = this.f8416x;
        if (obj instanceof androidx.core.content.e) {
            ((androidx.core.content.e) obj).removeOnTrimMemoryListener(this.f8411s);
        }
        Object obj2 = this.f8416x;
        if (obj2 instanceof androidx.core.content.d) {
            ((androidx.core.content.d) obj2).removeOnConfigurationChangedListener(this.f8410r);
        }
        Object obj3 = this.f8416x;
        if (obj3 instanceof androidx.core.app.s) {
            ((androidx.core.app.s) obj3).removeOnMultiWindowModeChangedListener(this.f8412t);
        }
        Object obj4 = this.f8416x;
        if (obj4 instanceof androidx.core.app.t) {
            ((androidx.core.app.t) obj4).removeOnPictureInPictureModeChangedListener(this.f8413u);
        }
        Object obj5 = this.f8416x;
        if ((obj5 instanceof androidx.core.view.o) && this.f8418z == null) {
            ((androidx.core.view.o) obj5).removeMenuProvider(this.f8414v);
        }
        this.f8416x = null;
        this.f8417y = null;
        this.f8418z = null;
        if (this.f8399g != null) {
            this.f8402j.remove();
            this.f8399g = null;
        }
        ActivityResultLauncher<Intent> activityResultLauncher = this.F;
        if (activityResultLauncher != null) {
            activityResultLauncher.d();
            this.G.d();
            this.H.d();
        }
    }

    void J() {
        X(1);
    }

    @NonNull
    ViewModelStore J0(@NonNull Fragment fragment) {
        return this.R.l(fragment);
    }

    void K(boolean z11) {
        if (z11 && (this.f8416x instanceof androidx.core.content.e)) {
            D1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f8395c.o()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z11) {
                    fragment.mChildFragmentManager.K(true);
                }
            }
        }
    }

    void K0() {
        this.f8401i = true;
        f0(true);
        this.f8401i = false;
        if (!V || this.f8400h == null) {
            if (this.f8402j.getIsEnabled()) {
                if (O0(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                f1();
                return;
            } else {
                if (O0(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                this.f8399g.m();
                return;
            }
        }
        if (!this.f8407o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(t0(this.f8400h));
            for (n nVar : this.f8407o) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    nVar.d((Fragment) it.next(), true);
                }
            }
        }
        Iterator<r0.a> it2 = this.f8400h.f8622c.iterator();
        while (it2.hasNext()) {
            Fragment fragment = it2.next().f8640b;
            if (fragment != null) {
                fragment.mTransitioning = false;
            }
        }
        Iterator<a1> it3 = z(new ArrayList<>(Collections.singletonList(this.f8400h)), 0, 1).iterator();
        while (it3.hasNext()) {
            it3.next().f();
        }
        Iterator<r0.a> it4 = this.f8400h.f8622c.iterator();
        while (it4.hasNext()) {
            Fragment fragment2 = it4.next().f8640b;
            if (fragment2 != null && fragment2.mContainer == null) {
                A(fragment2).m();
            }
        }
        this.f8400h = null;
        F1();
        if (O0(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + this.f8402j.getIsEnabled() + " for  FragmentManager " + this);
        }
    }

    void L(boolean z11, boolean z12) {
        if (z12 && (this.f8416x instanceof androidx.core.app.s)) {
            D1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f8395c.o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z11);
                if (z12) {
                    fragment.mChildFragmentManager.L(z11, true);
                }
            }
        }
    }

    void L0(@NonNull Fragment fragment) {
        if (O0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        A1(fragment);
    }

    void M(@NonNull Fragment fragment) {
        Iterator<m0> it = this.f8409q.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    void M0(@NonNull Fragment fragment) {
        if (fragment.mAdded && P0(fragment)) {
            this.J = true;
        }
    }

    void N() {
        for (Fragment fragment : this.f8395c.l()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.N();
            }
        }
    }

    public boolean N0() {
        return this.M;
    }

    boolean O(@NonNull MenuItem menuItem) {
        if (this.f8415w < 1) {
            return false;
        }
        for (Fragment fragment : this.f8395c.o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void P(@NonNull Menu menu) {
        if (this.f8415w < 1) {
            return;
        }
        for (Fragment fragment : this.f8395c.o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    void R() {
        X(5);
    }

    boolean R0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    void S(boolean z11, boolean z12) {
        if (z12 && (this.f8416x instanceof androidx.core.app.t)) {
            D1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f8395c.o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z11);
                if (z12) {
                    fragment.mChildFragmentManager.S(z11, true);
                }
            }
        }
    }

    boolean S0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    boolean T(@NonNull Menu menu) {
        boolean z11 = false;
        if (this.f8415w < 1) {
            return false;
        }
        for (Fragment fragment : this.f8395c.o()) {
            if (fragment != null && S0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z11 = true;
            }
        }
        return z11;
    }

    boolean T0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.F0()) && T0(fragmentManager.f8418z);
    }

    void U() {
        F1();
        Q(this.A);
    }

    boolean U0(int i11) {
        return this.f8415w >= i11;
    }

    void V() {
        this.K = false;
        this.L = false;
        this.R.o(false);
        X(7);
    }

    public boolean V0() {
        return this.K || this.L;
    }

    void W() {
        this.K = false;
        this.L = false;
        this.R.o(false);
        X(5);
    }

    void W0(@NonNull Fragment fragment, @NonNull String[] strArr, int i11) {
        if (this.H == null) {
            this.f8416x.l(fragment, strArr, i11);
            return;
        }
        this.I.addLast(new l(fragment.mWho, i11));
        this.H.b(strArr);
    }

    void X0(@NonNull Fragment fragment, @NonNull Intent intent, int i11, Bundle bundle) {
        if (this.F == null) {
            this.f8416x.n(fragment, intent, i11, bundle);
            return;
        }
        this.I.addLast(new l(fragment.mWho, i11));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.F.b(intent);
    }

    void Y() {
        this.L = true;
        this.R.o(true);
        X(4);
    }

    void Y0(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) {
        if (this.G == null) {
            this.f8416x.p(fragment, intentSender, i11, intent, i12, i13, i14, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (O0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + fragment);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        h.e eVarA = new h.e.a(intentSender).b(intent).c(i13, i12).a();
        this.I.addLast(new l(fragment.mWho, i11));
        if (O0(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.G.b(eVarA);
    }

    void Z() {
        X(2);
    }

    void Z0(int i11, boolean z11) {
        z<?> zVar;
        if (this.f8416x == null && i11 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z11 || i11 != this.f8415w) {
            this.f8415w = i11;
            this.f8395c.t();
            C1();
            if (this.J && (zVar = this.f8416x) != null && this.f8415w == 7) {
                zVar.q();
                this.J = false;
            }
        }
    }

    void a1() {
        if (this.f8416x == null) {
            return;
        }
        this.K = false;
        this.L = false;
        this.R.o(false);
        for (Fragment fragment : this.f8395c.o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void b0(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f8395c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f8397e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size; i11++) {
                Fragment fragment = this.f8397e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        int size2 = this.f8396d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size2; i12++) {
                androidx.fragment.app.a aVar = this.f8396d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.B(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f8403k.get());
        synchronized (this.f8393a) {
            try {
                int size3 = this.f8393a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size3; i13++) {
                        o oVar = this.f8393a.get(i13);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println(oVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f8416x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f8417y);
        if (this.f8418z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f8418z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f8415w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.K);
        printWriter.print(" mStopped=");
        printWriter.print(this.L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.M);
        if (this.J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.J);
        }
    }

    public final void b1(@NonNull FragmentContainerView fragmentContainerView) {
        View view;
        for (p0 p0Var : this.f8395c.k()) {
            Fragment fragmentK = p0Var.k();
            if (fragmentK.mContainerId == fragmentContainerView.getId() && (view = fragmentK.mView) != null && view.getParent() == null) {
                fragmentK.mContainer = fragmentContainerView;
                p0Var.b();
                p0Var.m();
            }
        }
    }

    void c1(@NonNull p0 p0Var) {
        Fragment fragmentK = p0Var.k();
        if (fragmentK.mDeferStart) {
            if (this.f8394b) {
                this.N = true;
            } else {
                fragmentK.mDeferStart = false;
                p0Var.m();
            }
        }
    }

    void d0(@NonNull o oVar, boolean z11) {
        if (!z11) {
            if (this.f8416x == null) {
                if (!this.M) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            u();
        }
        synchronized (this.f8393a) {
            try {
                if (this.f8416x == null) {
                    if (!z11) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f8393a.add(oVar);
                    t1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d1() {
        d0(new p(null, -1, 0), false);
    }

    void e1(int i11, int i12, boolean z11) {
        if (i11 >= 0) {
            d0(new p(null, i11, i12), z11);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i11);
    }

    boolean f0(boolean z11) {
        androidx.fragment.app.a aVar;
        e0(z11);
        boolean z12 = false;
        if (!this.f8401i && (aVar = this.f8400h) != null) {
            aVar.f8444u = false;
            aVar.z();
            if (O0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f8400h + " as part of execPendingActions for actions " + this.f8393a);
            }
            this.f8400h.A(false, false);
            this.f8393a.add(0, this.f8400h);
            Iterator<r0.a> it = this.f8400h.f8622c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f8640b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f8400h = null;
        }
        while (u0(this.O, this.P)) {
            z12 = true;
            this.f8394b = true;
            try {
                n1(this.O, this.P);
                v();
            } catch (Throwable th2) {
                v();
                throw th2;
            }
        }
        F1();
        a0();
        this.f8395c.b();
        return z12;
    }

    public boolean f1() {
        return h1(null, -1, 0);
    }

    void g0(@NonNull o oVar, boolean z11) {
        if (z11 && (this.f8416x == null || this.M)) {
            return;
        }
        e0(z11);
        androidx.fragment.app.a aVar = this.f8400h;
        boolean z12 = false;
        if (aVar != null) {
            aVar.f8444u = false;
            aVar.z();
            if (O0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f8400h + " as part of execSingleAction for action " + oVar);
            }
            this.f8400h.A(false, false);
            boolean zA = this.f8400h.a(this.O, this.P);
            Iterator<r0.a> it = this.f8400h.f8622c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f8640b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f8400h = null;
            z12 = zA;
        }
        boolean zA2 = oVar.a(this.O, this.P);
        if (z12 || zA2) {
            this.f8394b = true;
            try {
                n1(this.O, this.P);
                v();
            } catch (Throwable th2) {
                v();
                throw th2;
            }
        }
        F1();
        a0();
        this.f8395c.b();
    }

    public boolean g1(int i11, int i12) {
        if (i11 >= 0) {
            return h1(null, i11, i12);
        }
        throw new IllegalArgumentException("Bad id: " + i11);
    }

    boolean i1(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, String str, int i11, int i12) {
        int iL0 = l0(str, i11, (i12 & 1) != 0);
        if (iL0 < 0) {
            return false;
        }
        for (int size = this.f8396d.size() - 1; size >= iL0; size--) {
            arrayList.add(this.f8396d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public boolean j0() {
        boolean zF0 = f0(true);
        s0();
        return zF0;
    }

    boolean j1(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (O0(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + this.f8393a);
        }
        if (this.f8396d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            return false;
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f8396d;
        androidx.fragment.app.a aVar = arrayList3.get(arrayList3.size() - 1);
        this.f8400h = aVar;
        Iterator<r0.a> it = aVar.f8622c.iterator();
        while (it.hasNext()) {
            Fragment fragment = it.next().f8640b;
            if (fragment != null) {
                fragment.mTransitioning = true;
            }
        }
        return i1(arrayList, arrayList2, null, -1, 0);
    }

    void k(androidx.fragment.app.a aVar) {
        this.f8396d.add(aVar);
    }

    Fragment k0(@NonNull String str) {
        return this.f8395c.f(str);
    }

    void k1() {
        d0(new q(), false);
    }

    p0 l(@NonNull Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            g7.b.f(fragment, str);
        }
        if (O0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        p0 p0VarA = A(fragment);
        fragment.mFragmentManager = this;
        this.f8395c.r(p0VarA);
        if (!fragment.mDetached) {
            this.f8395c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (P0(fragment)) {
                this.J = true;
            }
        }
        return p0VarA;
    }

    public void l1(@NonNull k kVar, boolean z11) {
        this.f8408p.o(kVar, z11);
    }

    public void m(@NonNull m0 m0Var) {
        this.f8409q.add(m0Var);
    }

    void m1(@NonNull Fragment fragment) {
        if (O0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        this.f8395c.u(fragment);
        if (P0(fragment)) {
            this.J = true;
        }
        fragment.mRemoving = true;
        A1(fragment);
    }

    void n(@NonNull Fragment fragment) {
        this.R.a(fragment);
    }

    public Fragment n0(int i11) {
        return this.f8395c.g(i11);
    }

    int o() {
        return this.f8403k.getAndIncrement();
    }

    public Fragment o0(String str) {
        return this.f8395c.h(str);
    }

    void o1(@NonNull Fragment fragment) {
        this.R.n(fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void p(@NonNull z<?> zVar, @NonNull w wVar, Fragment fragment) {
        String str;
        LifecycleOwner lifecycleOwner;
        if (this.f8416x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f8416x = zVar;
        this.f8417y = wVar;
        this.f8418z = fragment;
        if (fragment != null) {
            m(new h(fragment));
        } else if (zVar instanceof m0) {
            m((m0) zVar);
        }
        if (this.f8418z != null) {
            F1();
        }
        if (zVar instanceof androidx.p002activity.e0) {
            androidx.p002activity.e0 e0Var = (androidx.p002activity.e0) zVar;
            OnBackPressedDispatcher onBackPressedDispatcher = e0Var.getOnBackPressedDispatcher();
            this.f8399g = onBackPressedDispatcher;
            if (fragment != null) {
                lifecycleOwner = e0Var;
                lifecycleOwner = fragment;
            }
            lifecycleOwner = e0Var;
            onBackPressedDispatcher.i(lifecycleOwner, this.f8402j);
        }
        if (fragment != null) {
            this.R = fragment.mFragmentManager.w0(fragment);
        } else if (zVar instanceof f1) {
            this.R = l0.j(((f1) zVar).getViewModelStore());
        } else {
            this.R = new l0(false);
        }
        this.R.o(V0());
        this.f8395c.A(this.R);
        Object obj = this.f8416x;
        if ((obj instanceof xa.d) && fragment == null) {
            SavedStateRegistry savedStateRegistry = ((xa.d) obj).getSavedStateRegistry();
            savedStateRegistry.h("android:support:fragments", new SavedStateRegistry.c() { // from class: androidx.fragment.app.h0
                @Override // androidx.savedstate.SavedStateRegistry.c
                public final Bundle a() {
                    return this.f8554a.s1();
                }
            });
            Bundle bundleB = savedStateRegistry.b("android:support:fragments");
            if (bundleB != null) {
                q1(bundleB);
            }
        }
        Object obj2 = this.f8416x;
        if (obj2 instanceof h.d) {
            ActivityResultRegistry activityResultRegistry = ((h.d) obj2).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.F = activityResultRegistry.l(str2 + "StartActivityForResult", new ActivityResultContracts$StartActivityForResult(), new i());
            this.G = activityResultRegistry.l(str2 + "StartIntentSenderForResult", new FragmentIntentSenderContract(), new j());
            this.H = activityResultRegistry.l(str2 + "RequestPermissions", new ActivityResultContracts$RequestMultiplePermissions(), new a());
        }
        Object obj3 = this.f8416x;
        if (obj3 instanceof androidx.core.content.d) {
            ((androidx.core.content.d) obj3).addOnConfigurationChangedListener(this.f8410r);
        }
        Object obj4 = this.f8416x;
        if (obj4 instanceof androidx.core.content.e) {
            ((androidx.core.content.e) obj4).addOnTrimMemoryListener(this.f8411s);
        }
        Object obj5 = this.f8416x;
        if (obj5 instanceof androidx.core.app.s) {
            ((androidx.core.app.s) obj5).addOnMultiWindowModeChangedListener(this.f8412t);
        }
        Object obj6 = this.f8416x;
        if (obj6 instanceof androidx.core.app.t) {
            ((androidx.core.app.t) obj6).addOnPictureInPictureModeChangedListener(this.f8413u);
        }
        Object obj7 = this.f8416x;
        if ((obj7 instanceof androidx.core.view.o) && fragment == null) {
            ((androidx.core.view.o) obj7).addMenuProvider(this.f8414v);
        }
    }

    Fragment p0(@NonNull String str) {
        return this.f8395c.i(str);
    }

    void q(@NonNull Fragment fragment) {
        if (O0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f8395c.a(fragment);
            if (O0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (P0(fragment)) {
                this.J = true;
            }
        }
    }

    void q1(Parcelable parcelable) {
        p0 p0Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f8416x.getContext().getClassLoader());
                this.f8405m.put(str.substring(7), bundle2);
            }
        }
        HashMap<String, Bundle> map = new HashMap<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f8416x.getContext().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f8395c.x(map);
        k0 k0Var = (k0) bundle3.getParcelable("state");
        if (k0Var == null) {
            return;
        }
        this.f8395c.v();
        Iterator<String> it = k0Var.f8564a.iterator();
        while (it.hasNext()) {
            Bundle bundleB = this.f8395c.B(it.next(), null);
            if (bundleB != null) {
                Fragment fragmentH = this.R.h(((o0) bundleB.getParcelable("state")).f8591b);
                if (fragmentH != null) {
                    if (O0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentH);
                    }
                    p0Var = new p0(this.f8408p, this.f8395c, fragmentH, bundleB);
                } else {
                    p0Var = new p0(this.f8408p, this.f8395c, this.f8416x.getContext().getClassLoader(), z0(), bundleB);
                }
                Fragment fragmentK = p0Var.k();
                fragmentK.mSavedFragmentState = bundleB;
                fragmentK.mFragmentManager = this;
                if (O0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentK.mWho + "): " + fragmentK);
                }
                p0Var.o(this.f8416x.getContext().getClassLoader());
                this.f8395c.r(p0Var);
                p0Var.s(this.f8415w);
            }
        }
        for (Fragment fragment : this.R.k()) {
            if (!this.f8395c.c(fragment.mWho)) {
                if (O0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + k0Var.f8564a);
                }
                this.R.n(fragment);
                fragment.mFragmentManager = this;
                p0 p0Var2 = new p0(this.f8408p, this.f8395c, fragment);
                p0Var2.s(1);
                p0Var2.m();
                fragment.mRemoving = true;
                p0Var2.m();
            }
        }
        this.f8395c.w(k0Var.f8565b);
        if (k0Var.f8566c != null) {
            this.f8396d = new ArrayList<>(k0Var.f8566c.length);
            int i11 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = k0Var.f8566c;
                if (i11 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarB = bVarArr[i11].b(this);
                if (O0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i11 + " (index " + aVarB.f8445v + "): " + aVarB);
                    PrintWriter printWriter = new PrintWriter(new x0("FragmentManager"));
                    aVarB.C("  ", printWriter, false);
                    printWriter.close();
                }
                this.f8396d.add(aVarB);
                i11++;
            }
        } else {
            this.f8396d = new ArrayList<>();
        }
        this.f8403k.set(k0Var.f8567d);
        String str3 = k0Var.f8568e;
        if (str3 != null) {
            Fragment fragmentK0 = k0(str3);
            this.A = fragmentK0;
            Q(fragmentK0);
        }
        ArrayList<String> arrayList = k0Var.f8569f;
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                this.f8404l.put(arrayList.get(i12), k0Var.f8570g.get(i12));
            }
        }
        this.I = new ArrayDeque<>(k0Var.f8571h);
    }

    @NonNull
    public r0 r() {
        return new androidx.fragment.app.a(this);
    }

    void s() {
        if (O0(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + this.f8400h);
        }
        androidx.fragment.app.a aVar = this.f8400h;
        if (aVar != null) {
            aVar.f8444u = false;
            aVar.z();
            this.f8400h.t(true, new Runnable() { // from class: androidx.fragment.app.i0
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentManager.c(this.f8557a);
                }
            });
            this.f8400h.g();
            this.f8401i = true;
            j0();
            this.f8401i = false;
            this.f8400h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Bundle s1() {
        androidx.fragment.app.b[] bVarArr;
        Bundle bundle = new Bundle();
        s0();
        c0();
        f0(true);
        this.K = true;
        this.R.o(true);
        ArrayList<String> arrayListY = this.f8395c.y();
        HashMap<String, Bundle> mapM = this.f8395c.m();
        if (!mapM.isEmpty()) {
            ArrayList<String> arrayListZ = this.f8395c.z();
            int size = this.f8396d.size();
            if (size > 0) {
                bVarArr = new androidx.fragment.app.b[size];
                for (int i11 = 0; i11 < size; i11++) {
                    bVarArr[i11] = new androidx.fragment.app.b(this.f8396d.get(i11));
                    if (O0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i11 + ": " + this.f8396d.get(i11));
                    }
                }
            } else {
                bVarArr = null;
            }
            k0 k0Var = new k0();
            k0Var.f8564a = arrayListY;
            k0Var.f8565b = arrayListZ;
            k0Var.f8566c = bVarArr;
            k0Var.f8567d = this.f8403k.get();
            Fragment fragment = this.A;
            if (fragment != null) {
                k0Var.f8568e = fragment.mWho;
            }
            k0Var.f8569f.addAll(this.f8404l.keySet());
            k0Var.f8570g.addAll(this.f8404l.values());
            k0Var.f8571h = new ArrayList<>(this.I);
            bundle.putParcelable("state", k0Var);
            for (String str : this.f8405m.keySet()) {
                bundle.putBundle("result_" + str, this.f8405m.get(str));
            }
            for (String str2 : mapM.keySet()) {
                bundle.putBundle("fragment_" + str2, mapM.get(str2));
            }
        } else if (O0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    boolean t() {
        boolean zP0 = false;
        for (Fragment fragment : this.f8395c.l()) {
            if (fragment != null) {
                zP0 = P0(fragment);
            }
            if (zP0) {
                return true;
            }
        }
        return false;
    }

    Set<Fragment> t0(@NonNull androidx.fragment.app.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < aVar.f8622c.size(); i11++) {
            Fragment fragment = aVar.f8622c.get(i11).f8640b;
            if (fragment != null && aVar.f8628i) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    void t1() {
        synchronized (this.f8393a) {
            try {
                if (this.f8393a.size() == 1) {
                    this.f8416x.getHandler().removeCallbacks(this.T);
                    this.f8416x.getHandler().post(this.T);
                    F1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f8418z;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f8418z)));
            sb2.append("}");
        } else {
            z<?> zVar = this.f8416x;
            if (zVar != null) {
                sb2.append(zVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f8416x)));
                sb2.append("}");
            } else {
                sb2.append(Address.ADDRESS_NULL_PLACEHOLDER);
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    void u1(@NonNull Fragment fragment, boolean z11) {
        ViewGroup viewGroupY0 = y0(fragment);
        if (viewGroupY0 == null || !(viewGroupY0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupY0).setDrawDisappearingViewsLast(!z11);
    }

    public int v0() {
        return this.f8396d.size() + (this.f8400h != null ? 1 : 0);
    }

    public void v1(@NonNull y yVar) {
        this.B = yVar;
    }

    public final void w1(@NonNull String str, @NonNull Bundle bundle) {
        m mVar = this.f8406n.get(str);
        if (mVar == null || !mVar.b(Lifecycle.State.STARTED)) {
            this.f8405m.put(str, bundle);
        } else {
            mVar.a(str, bundle);
        }
        if (O0(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    public final void x(@NonNull String str) {
        this.f8405m.remove(str);
        if (O0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    @NonNull
    w x0() {
        return this.f8417y;
    }

    public final void x1(@NonNull String str, @NonNull LifecycleOwner lifecycleOwner, @NonNull n0 n0Var) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            return;
        }
        g gVar = new g(str, n0Var, lifecycle);
        m mVarPut = this.f8406n.put(str, new m(lifecycle, n0Var, gVar));
        if (mVarPut != null) {
            mVarPut.c();
        }
        if (O0(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + n0Var);
        }
        lifecycle.a(gVar);
    }

    void y1(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        if (fragment.equals(k0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    Set<a1> z(@NonNull ArrayList<androidx.fragment.app.a> arrayList, int i11, int i12) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i11 < i12) {
            Iterator<r0.a> it = arrayList.get(i11).f8622c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f8640b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(a1.u(viewGroup, this));
                }
            }
            i11++;
        }
        return hashSet;
    }

    @NonNull
    public y z0() {
        y yVar = this.B;
        if (yVar != null) {
            return yVar;
        }
        Fragment fragment = this.f8418z;
        return fragment != null ? fragment.mFragmentManager.z0() : this.C;
    }

    void z1(Fragment fragment) {
        if (fragment == null || (fragment.equals(k0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.A;
            this.A = fragment;
            Q(fragment2);
            Q(this.A);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    @SuppressLint({"BanParcelableUsage"})
    static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f8433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8434b;

        class a implements Parcelable.Creator<l> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public l[] newArray(int i11) {
                return new l[i11];
            }
        }

        l(@NonNull String str, int i11) {
            this.f8433a = str;
            this.f8434b = i11;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.f8433a);
            parcel.writeInt(this.f8434b);
        }

        l(@NonNull Parcel parcel) {
            this.f8433a = parcel.readString();
            this.f8434b = parcel.readInt();
        }
    }
}
