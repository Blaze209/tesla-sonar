package com.swmansion.rnscreens.gamma.tabs;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/e;", "Landroidx/fragment/app/Fragment;", "Lcom/swmansion/rnscreens/gamma/tabs/a;", "tabScreen", "<init>", "(Lcom/swmansion/rnscreens/gamma/tabs/a;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Ljn0/h0;", "onStart", "()V", "onResume", "onPause", "onStop", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/swmansion/rnscreens/gamma/tabs/a;", "getTabScreen$react_native_screens_release", "()Lcom/swmansion/rnscreens/gamma/tabs/a;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends Fragment {
    private final a tabScreen;

    public e(a tabScreen) {
        s.k(tabScreen, "tabScreen");
        this.tabScreen = tabScreen;
    }

    /* JADX INFO: renamed from: getTabScreen$react_native_screens_release, reason: from getter */
    public final a getTabScreen() {
        return this.tabScreen;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        s.k(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        this.tabScreen.onFragmentConfigurationChange$react_native_screens_release(this, newConfig);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        s.k(inflater, "inflater");
        return this.tabScreen;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.tabScreen.getEventEmitter$react_native_screens_release().emitOnWillDisappear();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        this.tabScreen.getEventEmitter$react_native_screens_release().emitOnDidAppear();
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        this.tabScreen.getEventEmitter$react_native_screens_release().emitOnWillAppear();
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.tabScreen.getEventEmitter$react_native_screens_release().emitOnDidDisappear();
        super.onStop();
    }
}
