package com.swmansion.rnscreens;

import androidx.fragment.app.Fragment;
import androidx.p002activity.OnBackPressedDispatcher;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/swmansion/rnscreens/h;", "", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/activity/b0;", "onBackPressedCallback", "<init>", "(Landroidx/fragment/app/Fragment;Landroidx/activity/b0;)V", "Ljn0/h0;", "maybeAddBackCallback", "()V", "removeBackCallbackIfAdded", "Landroidx/fragment/app/Fragment;", "Landroidx/activity/b0;", "", "isCallbackAdded", "Z", "overrideBackAction", "getOverrideBackAction", "()Z", "setOverrideBackAction", "(Z)V", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {
    private final Fragment fragment;
    private boolean isCallbackAdded;
    private final androidx.p002activity.b0 onBackPressedCallback;
    private boolean overrideBackAction;

    public h(Fragment fragment, androidx.p002activity.b0 onBackPressedCallback) {
        p013kotlin.jvm.internal.s.k(fragment, "fragment");
        p013kotlin.jvm.internal.s.k(onBackPressedCallback, "onBackPressedCallback");
        this.fragment = fragment;
        this.onBackPressedCallback = onBackPressedCallback;
        this.overrideBackAction = true;
    }

    public final boolean getOverrideBackAction() {
        return this.overrideBackAction;
    }

    public final void maybeAddBackCallback() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        if (this.isCallbackAdded || !this.overrideBackAction) {
            return;
        }
        androidx.fragment.app.u activity = this.fragment.getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.i(this.fragment, this.onBackPressedCallback);
        }
        this.isCallbackAdded = true;
    }

    public final void removeBackCallbackIfAdded() {
        if (this.isCallbackAdded) {
            this.onBackPressedCallback.remove();
            this.isCallbackAdded = false;
        }
    }

    public final void setOverrideBackAction(boolean z11) {
        this.overrideBackAction = z11;
    }
}
