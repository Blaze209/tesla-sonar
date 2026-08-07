package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.f1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f8606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q0 f8607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final Fragment f8608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8609d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8610e = -1;

    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f8611a;

        a(View view) {
            this.f8611a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f8611a.removeOnAttachStateChangeListener(this);
            ViewCompat.m0(this.f8611a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8613a;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f8613a = iArr;
            try {
                iArr[Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8613a[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8613a[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8613a[Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    p0(@NonNull c0 c0Var, @NonNull q0 q0Var, @NonNull Fragment fragment) {
        this.f8606a = c0Var;
        this.f8607b = q0Var;
        this.f8608c = fragment;
    }

    private boolean l(@NonNull View view) {
        if (view == this.f8608c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f8608c.mView) {
                return true;
            }
        }
        return false;
    }

    void a() {
        if (FragmentManager.O0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f8608c);
        }
        Bundle bundle = this.f8608c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f8608c.performActivityCreated(bundle2);
        this.f8606a.a(this.f8608c, bundle2, false);
    }

    void b() {
        Fragment fragmentR0 = FragmentManager.r0(this.f8608c.mContainer);
        Fragment parentFragment = this.f8608c.getParentFragment();
        if (fragmentR0 != null && !fragmentR0.equals(parentFragment)) {
            Fragment fragment = this.f8608c;
            g7.b.o(fragment, fragmentR0, fragment.mContainerId);
        }
        int iJ = this.f8607b.j(this.f8608c);
        Fragment fragment2 = this.f8608c;
        fragment2.mContainer.addView(fragment2.mView, iJ);
    }

    void c() {
        if (FragmentManager.O0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f8608c);
        }
        Fragment fragment = this.f8608c;
        Fragment fragment2 = fragment.mTarget;
        p0 p0VarN = null;
        if (fragment2 != null) {
            p0 p0VarN2 = this.f8607b.n(fragment2.mWho);
            if (p0VarN2 == null) {
                throw new IllegalStateException("Fragment " + this.f8608c + " declared target fragment " + this.f8608c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f8608c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            p0VarN = p0VarN2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (p0VarN = this.f8607b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f8608c + " declared target fragment " + this.f8608c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (p0VarN != null) {
            p0VarN.m();
        }
        Fragment fragment4 = this.f8608c;
        fragment4.mHost = fragment4.mFragmentManager.B0();
        Fragment fragment5 = this.f8608c;
        fragment5.mParentFragment = fragment5.mFragmentManager.E0();
        this.f8606a.g(this.f8608c, false);
        this.f8608c.performAttach();
        this.f8606a.b(this.f8608c, false);
    }

    int d() {
        Fragment fragment = this.f8608c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f8610e;
        int i11 = b.f8613a[fragment.mMaxState.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i11 != 3) {
                iMin = i11 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        Fragment fragment2 = this.f8608c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                iMin = Math.max(this.f8610e, 2);
                View view = this.f8608c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f8610e < 4 ? Math.min(iMin, fragment2.mState) : Math.min(iMin, 1);
            }
        }
        Fragment fragment3 = this.f8608c;
        if (fragment3.mInDynamicContainer && fragment3.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!this.f8608c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment4 = this.f8608c;
        ViewGroup viewGroup = fragment4.mContainer;
        a1.d.a aVarS = viewGroup != null ? a1.u(viewGroup, fragment4.getParentFragmentManager()).s(this) : null;
        if (aVarS == a1.d.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVarS == a1.d.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment5 = this.f8608c;
            if (fragment5.mRemoving) {
                iMin = fragment5.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment6 = this.f8608c;
        if (fragment6.mDeferStart && fragment6.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (this.f8608c.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (FragmentManager.O0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f8608c);
        }
        return iMin;
    }

    void e() {
        if (FragmentManager.O0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f8608c);
        }
        Bundle bundle = this.f8608c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        Fragment fragment = this.f8608c;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            this.f8606a.h(fragment, bundle2, false);
            this.f8608c.performCreate(bundle2);
            this.f8606a.c(this.f8608c, bundle2, false);
        }
    }

    void f() {
        String resourceName;
        if (this.f8608c.mFromLayout) {
            return;
        }
        if (FragmentManager.O0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f8608c);
        }
        Bundle bundle = this.f8608c.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = this.f8608c.performGetLayoutInflater(bundle2);
        Fragment fragment = this.f8608c;
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i11 = fragment.mContainerId;
            if (i11 != 0) {
                if (i11 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f8608c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.x0().c(this.f8608c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment2 = this.f8608c;
                    if (!fragment2.mRestored && !fragment2.mInDynamicContainer) {
                        try {
                            resourceName = fragment2.getResources().getResourceName(this.f8608c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f8608c.mContainerId) + " (" + resourceName + ") for fragment " + this.f8608c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    g7.b.n(this.f8608c, viewGroup);
                }
            }
        }
        Fragment fragment3 = this.f8608c;
        fragment3.mContainer = viewGroup;
        fragment3.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (this.f8608c.mView != null) {
            if (FragmentManager.O0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f8608c);
            }
            this.f8608c.mView.setSaveFromParentEnabled(false);
            Fragment fragment4 = this.f8608c;
            fragment4.mView.setTag(f7.b.f64524a, fragment4);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment5 = this.f8608c;
            if (fragment5.mHidden) {
                fragment5.mView.setVisibility(8);
            }
            if (this.f8608c.mView.isAttachedToWindow()) {
                ViewCompat.m0(this.f8608c.mView);
            } else {
                View view = this.f8608c.mView;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f8608c.performViewCreated();
            c0 c0Var = this.f8606a;
            Fragment fragment6 = this.f8608c;
            c0Var.m(fragment6, fragment6.mView, bundle2, false);
            int visibility = this.f8608c.mView.getVisibility();
            this.f8608c.setPostOnViewCreatedAlpha(this.f8608c.mView.getAlpha());
            Fragment fragment7 = this.f8608c;
            if (fragment7.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment7.mView.findFocus();
                if (viewFindFocus != null) {
                    this.f8608c.setFocusedView(viewFindFocus);
                    if (FragmentManager.O0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f8608c);
                    }
                }
                this.f8608c.mView.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
        }
        this.f8608c.mState = 2;
    }

    void g() {
        Fragment fragmentF;
        if (FragmentManager.O0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f8608c);
        }
        Fragment fragment = this.f8608c;
        boolean zIsChangingConfigurations = true;
        boolean z11 = fragment.mRemoving && !fragment.isInBackStack();
        if (z11) {
            Fragment fragment2 = this.f8608c;
            if (!fragment2.mBeingSaved) {
                this.f8607b.B(fragment2.mWho, null);
            }
        }
        if (!z11 && !this.f8607b.p().p(this.f8608c)) {
            String str = this.f8608c.mTargetWho;
            if (str != null && (fragmentF = this.f8607b.f(str)) != null && fragmentF.mRetainInstance) {
                this.f8608c.mTarget = fragmentF;
            }
            this.f8608c.mState = 0;
            return;
        }
        z<?> zVar = this.f8608c.mHost;
        if (zVar instanceof f1) {
            zIsChangingConfigurations = this.f8607b.p().m();
        } else if (zVar.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) zVar.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String()).isChangingConfigurations();
        }
        if ((z11 && !this.f8608c.mBeingSaved) || zIsChangingConfigurations) {
            this.f8607b.p().c(this.f8608c, false);
        }
        this.f8608c.performDestroy();
        this.f8606a.d(this.f8608c, false);
        for (p0 p0Var : this.f8607b.k()) {
            if (p0Var != null) {
                Fragment fragmentK = p0Var.k();
                if (this.f8608c.mWho.equals(fragmentK.mTargetWho)) {
                    fragmentK.mTarget = this.f8608c;
                    fragmentK.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f8608c;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f8607b.f(str2);
        }
        this.f8607b.s(this);
    }

    void h() {
        View view;
        if (FragmentManager.O0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f8608c);
        }
        Fragment fragment = this.f8608c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f8608c.performDestroyView();
        this.f8606a.n(this.f8608c, false);
        Fragment fragment2 = this.f8608c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.f8608c.mInLayout = false;
    }

    void i() {
        if (FragmentManager.O0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f8608c);
        }
        this.f8608c.performDetach();
        this.f8606a.e(this.f8608c, false);
        Fragment fragment = this.f8608c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.f8607b.p().p(this.f8608c)) {
            return;
        }
        if (FragmentManager.O0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f8608c);
        }
        this.f8608c.initState();
    }

    void j() {
        Fragment fragment = this.f8608c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.O0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f8608c);
            }
            Bundle bundle = this.f8608c.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            Fragment fragment2 = this.f8608c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.f8608c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f8608c;
                fragment3.mView.setTag(f7.b.f64524a, fragment3);
                Fragment fragment4 = this.f8608c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f8608c.performViewCreated();
                c0 c0Var = this.f8606a;
                Fragment fragment5 = this.f8608c;
                c0Var.m(fragment5, fragment5.mView, bundle2, false);
                this.f8608c.mState = 2;
            }
        }
    }

    @NonNull
    Fragment k() {
        return this.f8608c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f8609d) {
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f8609d = true;
            boolean z11 = false;
            while (true) {
                int iD = d();
                Fragment fragment = this.f8608c;
                int i11 = fragment.mState;
                if (iD == i11) {
                    if (!z11 && i11 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f8608c.mBeingSaved) {
                        if (FragmentManager.O0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f8608c);
                        }
                        this.f8607b.p().c(this.f8608c, true);
                        this.f8607b.s(this);
                        if (FragmentManager.O0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f8608c);
                        }
                        this.f8608c.initState();
                    }
                    Fragment fragment2 = this.f8608c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            a1 a1VarU = a1.u(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f8608c.mHidden) {
                                a1VarU.k(this);
                            } else {
                                a1VarU.m(this);
                            }
                        }
                        Fragment fragment3 = this.f8608c;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.M0(fragment3);
                        }
                        Fragment fragment4 = this.f8608c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f8608c.mChildFragmentManager.N();
                    }
                    return;
                }
                if (iD <= i11) {
                    switch (i11 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.f8607b.q(fragment.mWho) == null) {
                                this.f8607b.B(this.f8608c.mWho, q());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f8608c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.O0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f8608c);
                            }
                            Fragment fragment5 = this.f8608c;
                            if (fragment5.mBeingSaved) {
                                this.f8607b.B(fragment5.mWho, q());
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                r();
                            }
                            Fragment fragment6 = this.f8608c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                a1.u(viewGroup2, fragment6.getParentFragmentManager()).l(this);
                            }
                            this.f8608c.mState = 3;
                            break;
                        case 4:
                            u();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i11 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                a1.u(viewGroup3, fragment.getParentFragmentManager()).j(a1.d.b.from(this.f8608c.mView.getVisibility()), this);
                            }
                            this.f8608c.mState = 4;
                            break;
                        case 5:
                            t();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z11 = true;
            }
        } finally {
            this.f8609d = false;
        }
    }

    void n() {
        if (FragmentManager.O0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f8608c);
        }
        this.f8608c.performPause();
        this.f8606a.f(this.f8608c, false);
    }

    void o(@NonNull ClassLoader classLoader) {
        Bundle bundle = this.f8608c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f8608c.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            this.f8608c.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            Fragment fragment = this.f8608c;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
            Fragment fragment2 = this.f8608c;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("viewRegistryState");
            o0 o0Var = (o0) this.f8608c.mSavedFragmentState.getParcelable("state");
            if (o0Var != null) {
                Fragment fragment3 = this.f8608c;
                fragment3.mTargetWho = o0Var.f8602m;
                fragment3.mTargetRequestCode = o0Var.f8603n;
                Boolean bool = fragment3.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment3.mUserVisibleHint = bool.booleanValue();
                    this.f8608c.mSavedUserVisibleHint = null;
                } else {
                    fragment3.mUserVisibleHint = o0Var.f8604o;
                }
            }
            Fragment fragment4 = this.f8608c;
            if (fragment4.mUserVisibleHint) {
                return;
            }
            fragment4.mDeferStart = true;
        } catch (BadParcelableException e11) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + k(), e11);
        }
    }

    void p() {
        if (FragmentManager.O0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f8608c);
        }
        View focusedView = this.f8608c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (FragmentManager.O0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(zRequestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f8608c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f8608c.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f8608c.setFocusedView(null);
        this.f8608c.performResume();
        this.f8606a.i(this.f8608c, false);
        this.f8607b.B(this.f8608c.mWho, null);
        Fragment fragment = this.f8608c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    @NonNull
    Bundle q() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f8608c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new o0(this.f8608c));
        if (this.f8608c.mState > -1) {
            Bundle bundle3 = new Bundle();
            this.f8608c.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f8606a.j(this.f8608c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f8608c.mSavedStateRegistryController.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleS1 = this.f8608c.mChildFragmentManager.s1();
            if (!bundleS1.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleS1);
            }
            if (this.f8608c.mView != null) {
                r();
            }
            SparseArray<Parcelable> sparseArray = this.f8608c.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f8608c.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f8608c.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    void r() {
        if (this.f8608c.mView == null) {
            return;
        }
        if (FragmentManager.O0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f8608c + " with view " + this.f8608c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f8608c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f8608c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f8608c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f8608c.mSavedViewRegistryState = bundle;
    }

    void s(int i11) {
        this.f8610e = i11;
    }

    void t() {
        if (FragmentManager.O0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f8608c);
        }
        this.f8608c.performStart();
        this.f8606a.k(this.f8608c, false);
    }

    void u() {
        if (FragmentManager.O0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f8608c);
        }
        this.f8608c.performStop();
        this.f8606a.l(this.f8608c, false);
    }

    p0(@NonNull c0 c0Var, @NonNull q0 q0Var, @NonNull ClassLoader classLoader, @NonNull y yVar, @NonNull Bundle bundle) {
        this.f8606a = c0Var;
        this.f8607b = q0Var;
        Fragment fragmentA = ((o0) bundle.getParcelable("state")).a(yVar, classLoader);
        this.f8608c = fragmentA;
        fragmentA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentA.setArguments(bundle2);
        if (FragmentManager.O0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentA);
        }
    }

    p0(@NonNull c0 c0Var, @NonNull q0 q0Var, @NonNull Fragment fragment, @NonNull Bundle bundle) {
        this.f8606a = c0Var;
        this.f8607b = q0Var;
        this.f8608c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
