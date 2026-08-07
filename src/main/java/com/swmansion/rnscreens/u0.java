package com.swmansion.rnscreens;

import android.app.Activity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReactContext;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\tH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/swmansion/rnscreens/u0;", "Lcom/swmansion/rnscreens/b0;", "Ljn0/h0;", "removeToolbar", "()V", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "setToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "", "hidden", "setToolbarShadowHidden", "(Z)V", "translucent", "setToolbarTranslucent", "canNavigateBack", "()Z", "dismissFromContainer", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface u0 extends b0 {
    @Override // com.swmansion.rnscreens.b0
    /* synthetic */ void addChildScreenContainer(v vVar);

    @Override // com.swmansion.rnscreens.b0, com.swmansion.rnscreens.x
    /* synthetic */ boolean canDispatchLifecycleEvent(a0.b bVar);

    boolean canNavigateBack();

    void dismissFromContainer();

    @Override // com.swmansion.rnscreens.b0, com.swmansion.rnscreens.x
    /* synthetic */ void dispatchHeaderBackButtonClickedEvent();

    @Override // com.swmansion.rnscreens.b0, com.swmansion.rnscreens.x
    /* synthetic */ void dispatchLifecycleEvent(a0.b bVar, b0 b0Var);

    @Override // com.swmansion.rnscreens.b0, com.swmansion.rnscreens.x
    /* synthetic */ void dispatchLifecycleEventInChildContainers(a0.b bVar);

    @Override // com.swmansion.rnscreens.b0, com.swmansion.rnscreens.x
    /* synthetic */ void dispatchTransitionProgressEvent(float f11, boolean z11);

    @Override // com.swmansion.rnscreens.b0
    /* synthetic */ List getChildScreenContainers();

    @Override // com.swmansion.rnscreens.b0, com.swmansion.rnscreens.i
    /* synthetic */ Fragment getFragment();

    @Override // com.swmansion.rnscreens.b0
    /* synthetic */ t getScreen();

    @Override // com.swmansion.rnscreens.b0
    /* synthetic */ boolean isTranslucent();

    @Override // com.swmansion.rnscreens.b0
    /* synthetic */ void onContainerUpdate();

    @Override // com.swmansion.rnscreens.b0
    /* synthetic */ void onViewAnimationEnd();

    @Override // com.swmansion.rnscreens.b0
    /* synthetic */ void onViewAnimationStart();

    @Override // com.swmansion.rnscreens.b0
    /* synthetic */ void removeChildScreenContainer(v vVar);

    void removeToolbar();

    @Override // com.swmansion.rnscreens.b0
    /* synthetic */ void setScreen(t tVar);

    void setToolbar(Toolbar toolbar);

    void setToolbarShadowHidden(boolean hidden);

    void setToolbarTranslucent(boolean translucent);

    @Override // com.swmansion.rnscreens.b0
    /* synthetic */ Activity tryGetActivity();

    @Override // com.swmansion.rnscreens.b0
    /* synthetic */ ReactContext tryGetContext();

    @Override // com.swmansion.rnscreens.b0, com.swmansion.rnscreens.x
    /* synthetic */ void updateLastEventDispatched(a0.b bVar);
}
