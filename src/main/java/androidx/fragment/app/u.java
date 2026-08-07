package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.core.app.SharedElementCallback;
import androidx.core.util.Consumer;
import androidx.core.view.MenuProvider;
import androidx.loader.app.LoaderManager;
import androidx.p002activity.ComponentActivity;
import androidx.p002activity.OnBackPressedDispatcher;
import androidx.p002activity.contextaware.OnContextAvailableListener;
import androidx.p002activity.result.ActivityResultRegistry;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.f1;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class u extends ComponentActivity implements androidx.core.app.b.e {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.p003lifecycle.y mFragmentLifecycleRegistry;
    final x mFragments;
    boolean mResumed;
    boolean mStopped;

    class a extends z<u> implements androidx.core.content.d, androidx.core.content.e, androidx.core.app.s, androidx.core.app.t, f1, androidx.p002activity.e0, h.d, xa.d, m0, androidx.core.view.o {
        public a() {
            super(u.this);
        }

        @Override // androidx.fragment.app.m0
        public void a(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
            u.this.onAttachFragment(fragment);
        }

        @Override // androidx.core.view.o
        public void addMenuProvider(@NonNull MenuProvider menuProvider) {
            u.this.addMenuProvider(menuProvider);
        }

        @Override // androidx.core.content.d
        public void addOnConfigurationChangedListener(@NonNull Consumer<Configuration> consumer) {
            u.this.addOnConfigurationChangedListener(consumer);
        }

        @Override // androidx.core.app.s
        public void addOnMultiWindowModeChangedListener(@NonNull Consumer<androidx.core.app.l> consumer) {
            u.this.addOnMultiWindowModeChangedListener(consumer);
        }

        @Override // androidx.core.app.t
        public void addOnPictureInPictureModeChangedListener(@NonNull Consumer<androidx.core.app.w> consumer) {
            u.this.addOnPictureInPictureModeChangedListener(consumer);
        }

        @Override // androidx.core.content.e
        public void addOnTrimMemoryListener(@NonNull Consumer<Integer> consumer) {
            u.this.addOnTrimMemoryListener(consumer);
        }

        @Override // androidx.fragment.app.z, androidx.fragment.app.w
        public View c(int i11) {
            return u.this.findViewById(i11);
        }

        @Override // androidx.fragment.app.z, androidx.fragment.app.w
        public boolean d() {
            Window window = u.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // h.d
        @NonNull
        public ActivityResultRegistry getActivityResultRegistry() {
            return u.this.getActivityResultRegistry();
        }

        @Override // androidx.p003lifecycle.LifecycleOwner
        @NonNull
        public Lifecycle getLifecycle() {
            return u.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.p002activity.e0
        @NonNull
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return u.this.getOnBackPressedDispatcher();
        }

        @Override // xa.d
        @NonNull
        public SavedStateRegistry getSavedStateRegistry() {
            return u.this.getSavedStateRegistry();
        }

        @Override // androidx.p003lifecycle.f1
        @NonNull
        public ViewModelStore getViewModelStore() {
            return u.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.z
        public void i(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
            u.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.z
        @NonNull
        public LayoutInflater k() {
            return u.this.getLayoutInflater().cloneInContext(u.this);
        }

        @Override // androidx.fragment.app.z
        public boolean m(@NonNull String str) {
            return androidx.core.app.b.i(u.this, str);
        }

        @Override // androidx.fragment.app.z
        public void q() {
            r();
        }

        public void r() {
            u.this.invalidateMenu();
        }

        @Override // androidx.core.view.o
        public void removeMenuProvider(@NonNull MenuProvider menuProvider) {
            u.this.removeMenuProvider(menuProvider);
        }

        @Override // androidx.core.content.d
        public void removeOnConfigurationChangedListener(@NonNull Consumer<Configuration> consumer) {
            u.this.removeOnConfigurationChangedListener(consumer);
        }

        @Override // androidx.core.app.s
        public void removeOnMultiWindowModeChangedListener(@NonNull Consumer<androidx.core.app.l> consumer) {
            u.this.removeOnMultiWindowModeChangedListener(consumer);
        }

        @Override // androidx.core.app.t
        public void removeOnPictureInPictureModeChangedListener(@NonNull Consumer<androidx.core.app.w> consumer) {
            u.this.removeOnPictureInPictureModeChangedListener(consumer);
        }

        @Override // androidx.core.content.e
        public void removeOnTrimMemoryListener(@NonNull Consumer<Integer> consumer) {
            u.this.removeOnTrimMemoryListener(consumer);
        }

        @Override // androidx.fragment.app.z
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public u j() {
            return u.this;
        }
    }

    public u() {
        this.mFragments = x.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.p003lifecycle.y(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().h(LIFECYCLE_TAG, new SavedStateRegistry.c() { // from class: androidx.fragment.app.q
            @Override // androidx.savedstate.SavedStateRegistry.c
            public final Bundle a() {
                return u.k(this.f8614a);
            }
        });
        addOnConfigurationChangedListener(new Consumer() { // from class: androidx.fragment.app.r
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f8619a.mFragments.m();
            }
        });
        addOnNewIntentListener(new Consumer() { // from class: androidx.fragment.app.s
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f8648a.mFragments.m();
            }
        });
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: androidx.fragment.app.t
            @Override // androidx.p002activity.contextaware.OnContextAvailableListener
            public final void a(Context context) {
                this.f8661a.mFragments.a(null);
            }
        });
    }

    public static /* synthetic */ Bundle k(u uVar) {
        uVar.markFragmentsCreated();
        uVar.mFragmentLifecycleRegistry.j(Lifecycle.a.ON_STOP);
        return new Bundle();
    }

    private static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean zMarkState = false;
        for (Fragment fragment : fragmentManager.A0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), state);
                }
                v0 v0Var = fragment.mViewLifecycleOwner;
                if (v0Var != null && v0Var.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mViewLifecycleOwner.f(state);
                    zMarkState = true;
                }
                if (fragment.mLifecycleRegistry.getState().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.o(state);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    final View dispatchFragmentsOnCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.n(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                LoaderManager.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.l().b0(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.l();
    }

    @NonNull
    @Deprecated
    public LoaderManager getSupportLoaderManager() {
        return LoaderManager.b(this);
    }

    void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED)) {
        }
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i11, int i12, Intent intent) {
        this.mFragments.m();
        super.onActivityResult(i11, i12, intent);
    }

    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.j(Lifecycle.a.ON_CREATE);
        this.mFragments.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.f();
        this.mFragmentLifecycleRegistry.j(Lifecycle.a.ON_DESTROY);
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i11, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i11, menuItem)) {
            return true;
        }
        if (i11 == 6) {
            return this.mFragments.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.g();
        this.mFragmentLifecycleRegistry.j(Lifecycle.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i11, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.m();
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.k();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.j(Lifecycle.a.ON_RESUME);
        this.mFragments.h();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.k();
        this.mFragmentLifecycleRegistry.j(Lifecycle.a.ON_START);
        this.mFragments.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.j();
        this.mFragmentLifecycleRegistry.j(Lifecycle.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        androidx.core.app.b.g(this, sharedElementCallback);
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback) {
        androidx.core.app.b.h(this, sharedElementCallback);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i11) {
        startActivityFromFragment(fragment, intent, i11, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) throws IntentSender.SendIntentException {
        if (i11 == -1) {
            androidx.core.app.b.k(this, intentSender, i11, intent, i12, i13, i14, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.b.c(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.b.d(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.b.l(this);
    }

    @Override // androidx.core.app.b.e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i11) {
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i11, Bundle bundle) {
        if (i11 == -1) {
            androidx.core.app.b.j(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i11, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public u(int i11) {
        super(i11);
        this.mFragments = x.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.p003lifecycle.y(this);
        this.mStopped = true;
        init();
    }
}
