package com.swmansion.worklets;

/* JADX INFO: loaded from: classes7.dex */
@in.a
public class WorkletsMessageQueueThread extends WorkletsMessageQueueThreadBase {
    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean isIdle() {
        return this.f55529a.isIdle();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean runOnQueue(Runnable runnable) {
        return this.f55529a.runOnQueue(runnable);
    }
}
