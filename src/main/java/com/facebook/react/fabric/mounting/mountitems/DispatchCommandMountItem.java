package com.facebook.react.fabric.mounting.mountitems;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "<init>", "()V", "Ljn0/h0;", "incrementRetries", "", "getRetries", "()I", "numRetries", "I", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DispatchCommandMountItem implements MountItem {
    private int numRetries;

    /* JADX INFO: renamed from: getRetries, reason: from getter */
    public final int getNumRetries() {
        return this.numRetries;
    }

    public final void incrementRetries() {
        this.numRetries++;
    }
}
