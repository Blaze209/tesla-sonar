package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.application.a;
import com.google.firebase.perf.application.b;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class SessionManager extends b {

    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final a appStateMonitor;
    private final Set<WeakReference<ow.b>> clients;
    private final GaugeManager gaugeManager;
    private ow.a perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), ow.a.c(UUID.randomUUID().toString()), a.b());
    }

    public static /* synthetic */ void b(SessionManager sessionManager, Context context, ow.a aVar) {
        sessionManager.gaugeManager.initializeGaugeMetadataManager(context);
        if (aVar.e()) {
            sessionManager.gaugeManager.logGaugeMetadata(aVar.h(), com.google.firebase.perf.v1.b.FOREGROUND);
        }
    }

    public static SessionManager getInstance() {
        return instance;
    }

    private void logGaugeMetadataIfCollectionEnabled(com.google.firebase.perf.v1.b bVar) {
        if (this.perfSession.e()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.h(), bVar);
        }
    }

    private void startOrStopCollectingGauges(com.google.firebase.perf.v1.b bVar) {
        if (this.perfSession.e()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, bVar);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        com.google.firebase.perf.v1.b bVar = com.google.firebase.perf.v1.b.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(bVar);
        startOrStopCollectingGauges(bVar);
    }

    @Override // com.google.firebase.perf.application.b, com.google.firebase.perf.application.a.b
    public void onUpdateAppState(com.google.firebase.perf.v1.b bVar) {
        super.onUpdateAppState(bVar);
        if (this.appStateMonitor.f()) {
            return;
        }
        if (bVar == com.google.firebase.perf.v1.b.FOREGROUND) {
            updatePerfSession(ow.a.c(UUID.randomUUID().toString()));
        } else if (this.perfSession.f()) {
            updatePerfSession(ow.a.c(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(bVar);
        }
    }

    public final ow.a perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<ow.b> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(final Context context) {
        final ow.a aVar = this.perfSession;
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: ow.c
            @Override // java.lang.Runnable
            public final void run() {
                SessionManager.b(this.f100074a, context, aVar);
            }
        });
    }

    public void setPerfSession(ow.a aVar) {
        this.perfSession = aVar;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.f()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<ow.b> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(ow.a aVar) {
        if (aVar.h() == this.perfSession.h()) {
            return;
        }
        this.perfSession = aVar;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<ow.b>> it = this.clients.iterator();
                while (it.hasNext()) {
                    ow.b bVar = it.next().get();
                    if (bVar != null) {
                        bVar.a(aVar);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.a());
        startOrStopCollectingGauges(this.appStateMonitor.a());
    }

    public SessionManager(GaugeManager gaugeManager, ow.a aVar, a aVar2) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = aVar;
        this.appStateMonitor = aVar2;
        registerForAppState();
    }
}
