package org.webrtc;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o0 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RenderSynchronizer f99928a;

    public /* synthetic */ o0(RenderSynchronizer renderSynchronizer) {
        this.f99928a = renderSynchronizer;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j11) {
        this.f99928a.onDisplayRefreshCycleBegin(j11);
    }
}
