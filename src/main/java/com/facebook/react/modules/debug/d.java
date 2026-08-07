package com.facebook.react.modules.debug;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import java.util.ArrayList;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\nR$\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0014j\b\u0012\u0004\u0012\u00020\u0005`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0014j\b\u0012\u0004\u0012\u00020\u0005`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0014j\b\u0012\u0004\u0012\u00020\u0005`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0014j\b\u0012\u0004\u0012\u00020\u0005`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0016\u0010\u001d\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/modules/debug/d;", "Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;", "Lpo/a;", "<init>", "()V", "", "startTime", "endTime", "", "c", "(JJ)Z", "Ljn0/h0;", "onTransitionToBridgeIdle", "onTransitionToBridgeBusy", "onBridgeDestroyed", "b", "a", "frameStartTimeNanos", "frameEndTimeNanos", DateTokenConverter.CONVERTER_KEY, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "transitionToIdleEvents", "transitionToBusyEvents", "viewHierarchyUpdateEnqueuedEvents", "viewHierarchyUpdateFinishedEvents", "e", "Z", "wasIdleAtEndOfLastFrame", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements NotThreadSafeBridgeIdleDebugListener, po.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<Long> transitionToIdleEvents = new ArrayList<>(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<Long> transitionToBusyEvents = new ArrayList<>(20);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<Long> viewHierarchyUpdateEnqueuedEvents = new ArrayList<>(20);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<Long> viewHierarchyUpdateFinishedEvents = new ArrayList<>(20);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private volatile boolean wasIdleAtEndOfLastFrame = true;

    private final boolean c(long startTime, long endTime) {
        long jE = e.e(this.transitionToIdleEvents, startTime, endTime);
        long jE2 = e.e(this.transitionToBusyEvents, startTime, endTime);
        if (jE == -1 && jE2 == -1) {
            return this.wasIdleAtEndOfLastFrame;
        }
        return jE > jE2;
    }

    @Override // po.a
    public synchronized void a() {
        this.viewHierarchyUpdateFinishedEvents.add(Long.valueOf(System.nanoTime()));
    }

    @Override // po.a
    public synchronized void b() {
        this.viewHierarchyUpdateEnqueuedEvents.add(Long.valueOf(System.nanoTime()));
    }

    public final synchronized boolean d(long frameStartTimeNanos, long frameEndTimeNanos) {
        boolean z11;
        try {
            boolean zF = e.f(this.viewHierarchyUpdateFinishedEvents, frameStartTimeNanos, frameEndTimeNanos);
            boolean zC = c(frameStartTimeNanos, frameEndTimeNanos);
            z11 = true;
            if (!zF && (!zC || e.f(this.viewHierarchyUpdateEnqueuedEvents, frameStartTimeNanos, frameEndTimeNanos))) {
                z11 = false;
            }
            e.d(this.transitionToIdleEvents, frameEndTimeNanos);
            e.d(this.transitionToBusyEvents, frameEndTimeNanos);
            e.d(this.viewHierarchyUpdateEnqueuedEvents, frameEndTimeNanos);
            e.d(this.viewHierarchyUpdateFinishedEvents, frameEndTimeNanos);
            this.wasIdleAtEndOfLastFrame = zC;
        } catch (Throwable th2) {
            throw th2;
        }
        return z11;
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onBridgeDestroyed() {
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeBusy() {
        this.transitionToBusyEvents.add(Long.valueOf(System.nanoTime()));
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeIdle() {
        this.transitionToIdleEvents.add(Long.valueOf(System.nanoTime()));
    }
}
