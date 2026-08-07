package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/DestroyUnmountedViewMountItem;", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "", "_surfaceId", "reactTag", "<init>", "(II)V", "Lcom/facebook/react/fabric/mounting/MountingManager;", "mountingManager", "Ljn0/h0;", "execute", "(Lcom/facebook/react/fabric/mounting/MountingManager;)V", "getSurfaceId", "()I", "I", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DestroyUnmountedViewMountItem implements MountItem {
    private final int _surfaceId;
    private final int reactTag;

    public DestroyUnmountedViewMountItem(int i11, int i12) {
        this._surfaceId = i11;
        this.reactTag = i12;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        s.k(mountingManager, "mountingManager");
        SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(this._surfaceId);
        if (surfaceManager == null) {
            return;
        }
        surfaceManager.deleteView(this.reactTag);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    /* JADX INFO: renamed from: getSurfaceId, reason: from getter */
    public int get_surfaceId() {
        return this._surfaceId;
    }
}
