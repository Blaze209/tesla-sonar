package com.swmansion.rnscreens.bottomsheet;

import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.x;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005R\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/swmansion/rnscreens/bottomsheet/g;", "Lcom/facebook/react/uimanager/f0;", "Lcom/swmansion/rnscreens/bottomsheet/f;", "pointerEventsImpl", "<init>", "(Lcom/swmansion/rnscreens/bottomsheet/f;)V", "Lcom/swmansion/rnscreens/bottomsheet/f;", "getPointerEventsImpl", "()Lcom/swmansion/rnscreens/bottomsheet/f;", "setPointerEventsImpl", "Lcom/facebook/react/uimanager/x;", "getPointerEvents", "()Lcom/facebook/react/uimanager/x;", "pointerEvents", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements f0 {
    private f pointerEventsImpl;

    public g(f fVar) {
        this.pointerEventsImpl = fVar;
    }

    @Override // com.facebook.react.uimanager.f0
    public x getPointerEvents() {
        x pointerEvents;
        f fVar = this.pointerEventsImpl;
        return (fVar == null || (pointerEvents = fVar.getPointerEvents()) == null) ? x.NONE : pointerEvents;
    }

    public final f getPointerEventsImpl() {
        return this.pointerEventsImpl;
    }

    public final void setPointerEventsImpl(f fVar) {
        this.pointerEventsImpl = fVar;
    }
}
