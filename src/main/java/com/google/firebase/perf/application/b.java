package com.google.firebase.perf.application;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b implements a.b {
    private final WeakReference<a.b> appStateCallback;
    private final a appStateMonitor;
    private com.google.firebase.perf.v1.b currentAppState;
    private boolean isRegisteredForAppState;

    protected b() {
        this(a.b());
    }

    public com.google.firebase.perf.v1.b getAppState() {
        return this.currentAppState;
    }

    public WeakReference<a.b> getAppStateCallback() {
        return this.appStateCallback;
    }

    protected void incrementTsnsCount(int i11) {
        this.appStateMonitor.e(i11);
    }

    @Override // com.google.firebase.perf.application.a.b
    public void onUpdateAppState(com.google.firebase.perf.v1.b bVar) {
        com.google.firebase.perf.v1.b bVar2 = this.currentAppState;
        com.google.firebase.perf.v1.b bVar3 = com.google.firebase.perf.v1.b.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (bVar2 == bVar3) {
            this.currentAppState = bVar;
        } else {
            if (bVar2 == bVar || bVar == bVar3) {
                return;
            }
            this.currentAppState = com.google.firebase.perf.v1.b.FOREGROUND_BACKGROUND;
        }
    }

    protected void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        this.currentAppState = this.appStateMonitor.a();
        this.appStateMonitor.k(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    protected void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            this.appStateMonitor.p(this.appStateCallback);
            this.isRegisteredForAppState = false;
        }
    }

    protected b(@NonNull a aVar) {
        this.isRegisteredForAppState = false;
        this.currentAppState = com.google.firebase.perf.v1.b.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = aVar;
        this.appStateCallback = new WeakReference<>(this);
    }
}
