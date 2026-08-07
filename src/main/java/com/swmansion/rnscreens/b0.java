package com.swmansion.rnscreens;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReactContext;
import com.fourthline.analytics.internal.AnalyticsContext;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001b\u001a\u00020\u00168&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/swmansion/rnscreens/b0;", "Lcom/swmansion/rnscreens/i;", "Lcom/swmansion/rnscreens/x;", "Lcom/swmansion/rnscreens/v;", "container", "Ljn0/h0;", "addChildScreenContainer", "(Lcom/swmansion/rnscreens/v;)V", "removeChildScreenContainer", "onContainerUpdate", "()V", "onViewAnimationStart", "onViewAnimationEnd", "", "isTranslucent", "()Z", "Landroid/app/Activity;", "tryGetActivity", "()Landroid/app/Activity;", "Lcom/facebook/react/bridge/ReactContext;", "tryGetContext", "()Lcom/facebook/react/bridge/ReactContext;", "Lcom/swmansion/rnscreens/t;", "getScreen", "()Lcom/swmansion/rnscreens/t;", "setScreen", "(Lcom/swmansion/rnscreens/t;)V", AnalyticsContext.Screen, "", "getChildScreenContainers", "()Ljava/util/List;", "childScreenContainers", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface b0 extends i, x {
    void addChildScreenContainer(v container);

    /* synthetic */ boolean canDispatchLifecycleEvent(a0.b bVar);

    /* synthetic */ void dispatchHeaderBackButtonClickedEvent();

    /* synthetic */ void dispatchLifecycleEvent(a0.b bVar, b0 b0Var);

    /* synthetic */ void dispatchLifecycleEventInChildContainers(a0.b bVar);

    /* synthetic */ void dispatchTransitionProgressEvent(float f11, boolean z11);

    List<v> getChildScreenContainers();

    @Override // com.swmansion.rnscreens.i
    /* synthetic */ Fragment getFragment();

    t getScreen();

    boolean isTranslucent();

    void onContainerUpdate();

    void onViewAnimationEnd();

    void onViewAnimationStart();

    void removeChildScreenContainer(v container);

    void setScreen(t tVar);

    Activity tryGetActivity();

    ReactContext tryGetContext();

    /* synthetic */ void updateLastEventDispatched(a0.b bVar);
}
