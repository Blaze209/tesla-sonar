package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<rw.c> f44712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f44713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f44714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.f f44715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zv.f f44716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f44717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f44718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f44719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final t f44720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ScheduledExecutorService f44721j;

    public p(com.google.firebase.f fVar, zv.f fVar2, m mVar, f fVar3, Context context, String str, t tVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f44712a = linkedHashSet;
        this.f44713b = new s(fVar, fVar2, mVar, fVar3, context, str, linkedHashSet, tVar, scheduledExecutorService);
        this.f44715d = fVar;
        this.f44714c = mVar;
        this.f44716e = fVar2;
        this.f44717f = fVar3;
        this.f44718g = context;
        this.f44719h = str;
        this.f44720i = tVar;
        this.f44721j = scheduledExecutorService;
    }

    private synchronized void a() {
        if (!this.f44712a.isEmpty()) {
            this.f44713b.C();
        }
    }

    public synchronized void b(boolean z11) {
        this.f44713b.z(z11);
        if (!z11) {
            a();
        }
    }
}
