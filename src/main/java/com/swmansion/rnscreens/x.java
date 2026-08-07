package com.swmansion.rnscreens;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/swmansion/rnscreens/x;", "", "Lcom/swmansion/rnscreens/a0$b;", "event", "", "canDispatchLifecycleEvent", "(Lcom/swmansion/rnscreens/a0$b;)Z", "Ljn0/h0;", "updateLastEventDispatched", "(Lcom/swmansion/rnscreens/a0$b;)V", "Lcom/swmansion/rnscreens/b0;", "fragmentWrapper", "dispatchLifecycleEvent", "(Lcom/swmansion/rnscreens/a0$b;Lcom/swmansion/rnscreens/b0;)V", "dispatchLifecycleEventInChildContainers", "dispatchHeaderBackButtonClickedEvent", "()V", "", "alpha", "closing", "dispatchTransitionProgressEvent", "(FZ)V", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface x {
    boolean canDispatchLifecycleEvent(a0.b event);

    void dispatchHeaderBackButtonClickedEvent();

    void dispatchLifecycleEvent(a0.b event, b0 fragmentWrapper);

    void dispatchLifecycleEventInChildContainers(a0.b event);

    void dispatchTransitionProgressEvent(float alpha, boolean closing);

    void updateLastEventDispatched(a0.b event);
}
