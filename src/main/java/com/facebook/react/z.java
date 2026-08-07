package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.h1;

/* JADX INFO: loaded from: classes3.dex */
public class z {
    private final Activity mActivity;
    private com.facebook.react.devsupport.i0 mDoubleTapReloadRecognizer;
    private boolean mFabricEnabled;
    private Bundle mLaunchOptions;
    private final String mMainComponentName;
    private a0 mReactHost;
    private o0 mReactNativeHost;
    private x0 mReactRootView;
    private rn.a mReactSurface;

    @Deprecated
    public z(Activity activity, o0 o0Var, String str, Bundle bundle) {
        this.mFabricEnabled = tn.b.f();
        this.mActivity = activity;
        this.mMainComponentName = str;
        this.mLaunchOptions = bundle;
        this.mDoubleTapReloadRecognizer = new com.facebook.react.devsupport.i0();
        this.mReactNativeHost = o0Var;
    }

    private pn.e getDevSupportManager() {
        a0 a0Var;
        if (tn.b.c() && (a0Var = this.mReactHost) != null && a0Var.i() != null) {
            return this.mReactHost.i();
        }
        if (!getReactNativeHost().hasInstance() || getReactNativeHost().getReactInstanceManager() == null) {
            return null;
        }
        return getReactNativeHost().getReactInstanceManager().F();
    }

    private o0 getReactNativeHost() {
        return this.mReactNativeHost;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reload$0() {
        if (!this.mReactNativeHost.hasInstance() || this.mReactNativeHost.getReactInstanceManager() == null) {
            return;
        }
        this.mReactNativeHost.getReactInstanceManager().o0();
    }

    protected x0 createRootView() {
        x0 x0Var = new x0(this.mActivity);
        x0Var.setIsFabric(isFabricEnabled());
        return x0Var;
    }

    public ReactContext getCurrentReactContext() {
        if (!tn.b.c()) {
            return getReactInstanceManager().E();
        }
        a0 a0Var = this.mReactHost;
        if (a0Var != null) {
            return a0Var.h();
        }
        return null;
    }

    public a0 getReactHost() {
        return this.mReactHost;
    }

    public j0 getReactInstanceManager() {
        return getReactNativeHost().getReactInstanceManager();
    }

    public x0 getReactRootView() {
        if (!tn.b.c()) {
            return this.mReactRootView;
        }
        rn.a aVar = this.mReactSurface;
        if (aVar != null) {
            return (x0) aVar.getView();
        }
        return null;
    }

    protected boolean isFabricEnabled() {
        return this.mFabricEnabled;
    }

    public void loadApp() {
        loadApp(this.mMainComponentName);
    }

    public void onActivityResult(int i11, int i12, Intent intent, boolean z11) {
        if (tn.b.c()) {
            this.mReactHost.onActivityResult(this.mActivity, i11, i12, intent);
        } else if (getReactNativeHost().hasInstance() && z11) {
            getReactNativeHost().getReactInstanceManager().Z(this.mActivity, i11, i12, intent);
        }
    }

    public boolean onBackPressed() {
        if (tn.b.c()) {
            this.mReactHost.onBackPressed();
            return true;
        }
        if (!getReactNativeHost().hasInstance()) {
            return false;
        }
        getReactNativeHost().getReactInstanceManager().a0();
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (tn.b.c()) {
            this.mReactHost.j((Context) gn.a.c(this.mActivity));
        } else if (getReactNativeHost().hasInstance()) {
            getReactInstanceManager().b0((Context) gn.a.c(this.mActivity), configuration);
        }
    }

    public void onHostDestroy() {
        unloadApp();
        if (tn.b.c()) {
            this.mReactHost.k(this.mActivity);
        } else if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().d0(this.mActivity);
        }
    }

    public void onHostPause() {
        if (tn.b.c()) {
            this.mReactHost.o(this.mActivity);
        } else if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().f0(this.mActivity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void onHostResume() {
        if (!(this.mActivity instanceof co.a)) {
            throw new ClassCastException("Host Activity does not implement DefaultHardwareBackBtnHandler");
        }
        if (tn.b.c()) {
            a0 a0Var = this.mReactHost;
            Activity activity = this.mActivity;
            a0Var.q(activity, (co.a) activity);
        } else if (getReactNativeHost().hasInstance()) {
            j0 reactInstanceManager = getReactNativeHost().getReactInstanceManager();
            Activity activity2 = this.mActivity;
            reactInstanceManager.h0(activity2, (co.a) activity2);
        }
    }

    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        a0 a0Var;
        if (i11 != 90) {
            return false;
        }
        if ((!tn.b.c() || (a0Var = this.mReactHost) == null || a0Var.i() == null) && !(getReactNativeHost().hasInstance() && getReactNativeHost().getUseDeveloperSupport())) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyLongPress(int i11) {
        a0 a0Var;
        if (i11 != 90) {
            return false;
        }
        if (!tn.b.c() || (a0Var = this.mReactHost) == null) {
            if (!getReactNativeHost().hasInstance() || !getReactNativeHost().getUseDeveloperSupport()) {
                return false;
            }
            getReactNativeHost().getReactInstanceManager().w0();
            return true;
        }
        pn.e eVarI = a0Var.i();
        if (eVarI == null || (eVarI instanceof h1)) {
            return false;
        }
        eVarI.r();
        return true;
    }

    public boolean onNewIntent(Intent intent) {
        if (tn.b.c()) {
            this.mReactHost.onNewIntent(intent);
            return true;
        }
        if (!getReactNativeHost().hasInstance()) {
            return false;
        }
        getReactNativeHost().getReactInstanceManager().j0(intent);
        return true;
    }

    public void onUserLeaveHint() {
        if (tn.b.c()) {
            this.mReactHost.l(this.mActivity);
        } else if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().k0(this.mActivity);
        }
    }

    public void onWindowFocusChanged(boolean z11) {
        if (tn.b.c()) {
            this.mReactHost.onWindowFocusChange(z11);
        } else if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().l0(z11);
        }
    }

    public void reload() {
        pn.e devSupportManager = getDevSupportManager();
        if (devSupportManager == null) {
            return;
        }
        if (!(devSupportManager instanceof h1)) {
            devSupportManager.C();
            return;
        }
        if (!tn.b.c()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23901a.lambda$reload$0();
                }
            });
            return;
        }
        a0 a0Var = this.mReactHost;
        if (a0Var != null) {
            a0Var.a("ReactDelegate.reload()");
        }
    }

    public void setReactRootView(x0 x0Var) {
        this.mReactRootView = x0Var;
    }

    public void setReactSurface(rn.a aVar) {
        this.mReactSurface = aVar;
    }

    public boolean shouldShowDevMenuOrReload(int i11, KeyEvent keyEvent) {
        pn.e devSupportManager = getDevSupportManager();
        if (devSupportManager != null && !(devSupportManager instanceof h1)) {
            if (i11 == 82) {
                devSupportManager.r();
                return true;
            }
            if (((com.facebook.react.devsupport.i0) gn.a.c(this.mDoubleTapReloadRecognizer)).b(i11, this.mActivity.getCurrentFocus())) {
                devSupportManager.C();
                return true;
            }
        }
        return false;
    }

    public void unloadApp() {
        if (tn.b.c()) {
            rn.a aVar = this.mReactSurface;
            if (aVar != null) {
                aVar.stop();
                this.mReactSurface = null;
                return;
            }
            return;
        }
        x0 x0Var = this.mReactRootView;
        if (x0Var != null) {
            x0Var.v();
            this.mReactRootView = null;
        }
    }

    public void loadApp(String str) {
        if (tn.b.c()) {
            if (this.mReactSurface == null) {
                this.mReactSurface = this.mReactHost.m(this.mActivity, str, this.mLaunchOptions);
            }
            this.mReactSurface.start();
        } else {
            if (this.mReactRootView != null) {
                throw new IllegalStateException("Cannot loadApp while app is already running.");
            }
            x0 x0VarCreateRootView = createRootView();
            this.mReactRootView = x0VarCreateRootView;
            x0VarCreateRootView.u(getReactNativeHost().getReactInstanceManager(), str, this.mLaunchOptions);
        }
    }

    public z(Activity activity, a0 a0Var, String str, Bundle bundle) {
        this.mFabricEnabled = tn.b.f();
        this.mActivity = activity;
        this.mMainComponentName = str;
        this.mLaunchOptions = bundle;
        this.mDoubleTapReloadRecognizer = new com.facebook.react.devsupport.i0();
        this.mReactHost = a0Var;
    }

    public z(Activity activity, o0 o0Var, String str, Bundle bundle, boolean z11) {
        tn.b.f();
        this.mFabricEnabled = z11;
        this.mActivity = activity;
        this.mMainComponentName = str;
        this.mLaunchOptions = bundle;
        this.mDoubleTapReloadRecognizer = new com.facebook.react.devsupport.i0();
        this.mReactNativeHost = o0Var;
    }
}
