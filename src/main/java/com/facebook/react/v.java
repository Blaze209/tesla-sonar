package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes3.dex */
public class v {
    private final Activity mActivity;
    private final String mMainComponentName;
    private co.g mPermissionListener;
    private Callback mPermissionsCallback;
    private z mReactDelegate;

    class a extends z {
        a(Activity activity, o0 o0Var, String str, Bundle bundle, boolean z11) {
            super(activity, o0Var, str, bundle, z11);
        }

        @Override // com.facebook.react.z
        protected x0 createRootView() {
            x0 x0VarCreateRootView = v.this.createRootView();
            return x0VarCreateRootView == null ? super.createRootView() : x0VarCreateRootView;
        }
    }

    @Deprecated
    public v(Activity activity, String str) {
        this.mActivity = activity;
        this.mMainComponentName = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0() {
        String mainComponentName = getMainComponentName();
        Bundle bundleComposeLaunchOptions = composeLaunchOptions();
        if (Build.VERSION.SDK_INT >= 26 && isWideColorGamutEnabled()) {
            this.mActivity.getWindow().setColorMode(1);
        }
        if (tn.b.c()) {
            this.mReactDelegate = new z(getPlainActivity(), getReactHost(), mainComponentName, bundleComposeLaunchOptions);
        } else {
            this.mReactDelegate = new a(getPlainActivity(), getReactNativeHost(), mainComponentName, bundleComposeLaunchOptions, isFabricEnabled());
        }
        if (mainComponentName != null) {
            loadApp(mainComponentName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRequestPermissionsResult$1(int i11, String[] strArr, int[] iArr, Object[] objArr) {
        co.g gVar = this.mPermissionListener;
        if (gVar == null || !gVar.onRequestPermissionsResult(i11, strArr, iArr)) {
            return;
        }
        this.mPermissionListener = null;
    }

    protected Bundle composeLaunchOptions() {
        return getLaunchOptions();
    }

    protected x0 createRootView() {
        return null;
    }

    protected Context getContext() {
        return (Context) gn.a.c(this.mActivity);
    }

    public ReactContext getCurrentReactContext() {
        return this.mReactDelegate.getCurrentReactContext();
    }

    protected Bundle getLaunchOptions() {
        return null;
    }

    public String getMainComponentName() {
        return this.mMainComponentName;
    }

    protected Activity getPlainActivity() {
        return (Activity) getContext();
    }

    protected s getReactActivity() {
        return (s) getContext();
    }

    protected z getReactDelegate() {
        return this.mReactDelegate;
    }

    public a0 getReactHost() {
        return ((x) getPlainActivity().getApplication()).e();
    }

    public j0 getReactInstanceManager() {
        return this.mReactDelegate.getReactInstanceManager();
    }

    protected o0 getReactNativeHost() {
        return ((x) getPlainActivity().getApplication()).d();
    }

    protected boolean isFabricEnabled() {
        return tn.b.f();
    }

    protected boolean isWideColorGamutEnabled() {
        return false;
    }

    protected void loadApp(String str) {
        this.mReactDelegate.loadApp(str);
        getPlainActivity().setContentView(this.mReactDelegate.getReactRootView());
    }

    public void onActivityResult(int i11, int i12, Intent intent) {
        this.mReactDelegate.onActivityResult(i11, i12, intent, true);
    }

    public boolean onBackPressed() {
        return this.mReactDelegate.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mReactDelegate.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        ep.a.o(0L, "ReactActivityDelegate.onCreate::init", new Runnable() { // from class: com.facebook.react.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f23098a.lambda$onCreate$0();
            }
        });
    }

    public void onDestroy() {
        this.mReactDelegate.onHostDestroy();
    }

    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        return this.mReactDelegate.onKeyDown(i11, keyEvent);
    }

    public boolean onKeyLongPress(int i11, KeyEvent keyEvent) {
        return this.mReactDelegate.onKeyLongPress(i11);
    }

    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        return this.mReactDelegate.shouldShowDevMenuOrReload(i11, keyEvent);
    }

    public boolean onNewIntent(Intent intent) {
        return this.mReactDelegate.onNewIntent(intent);
    }

    public void onPause() {
        this.mReactDelegate.onHostPause();
    }

    public void onRequestPermissionsResult(final int i11, final String[] strArr, final int[] iArr) {
        this.mPermissionsCallback = new Callback() { // from class: com.facebook.react.u
            @Override // com.facebook.react.bridge.Callback
            public final void invoke(Object[] objArr) {
                this.f23100a.lambda$onRequestPermissionsResult$1(i11, strArr, iArr, objArr);
            }
        };
    }

    public void onResume() {
        this.mReactDelegate.onHostResume();
        Callback callback = this.mPermissionsCallback;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.mPermissionsCallback = null;
        }
    }

    public void onUserLeaveHint() {
        z zVar = this.mReactDelegate;
        if (zVar != null) {
            zVar.onUserLeaveHint();
        }
    }

    public void onWindowFocusChanged(boolean z11) {
        this.mReactDelegate.onWindowFocusChanged(z11);
    }

    public void requestPermissions(String[] strArr, int i11, co.g gVar) {
        this.mPermissionListener = gVar;
        getPlainActivity().requestPermissions(strArr, i11);
    }

    public void setReactRootView(x0 x0Var) {
        this.mReactDelegate.setReactRootView(x0Var);
    }

    public void setReactSurface(rn.a aVar) {
        this.mReactDelegate.setReactSurface(aVar);
    }

    public v(s sVar, String str) {
        this.mActivity = sVar;
        this.mMainComponentName = str;
    }
}
