package com.swmansion.rnscreens.bottomsheet;

import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/swmansion/rnscreens/bottomsheet/f;", "Lcom/facebook/react/uimanager/f0;", "Lcom/swmansion/rnscreens/bottomsheet/b;", "dimmingView", "<init>", "(Lcom/swmansion/rnscreens/bottomsheet/b;)V", "Lcom/swmansion/rnscreens/bottomsheet/b;", "getDimmingView", "()Lcom/swmansion/rnscreens/bottomsheet/b;", "Lcom/facebook/react/uimanager/x;", "getPointerEvents", "()Lcom/facebook/react/uimanager/x;", "pointerEvents", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements f0 {
    private final b dimmingView;

    public f(b dimmingView) {
        s.k(dimmingView, "dimmingView");
        this.dimmingView = dimmingView;
    }

    public final b getDimmingView() {
        return this.dimmingView;
    }

    @Override // com.facebook.react.uimanager.f0
    public x getPointerEvents() {
        return this.dimmingView.getBlockGestures$react_native_screens_release() ? x.AUTO : x.NONE;
    }
}
