package com.fourthline.orca.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Kh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f26579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f26580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f26581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f26582d;

    public Kh(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f26579a = tracker;
        this.f26580b = new LinkedHashMap();
        this.f26581c = new LinkedHashMap();
        this.f26582d = new LinkedHashMap();
    }

    public final void a(Ph state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        if (this.f26580b.containsKey(state.b())) {
            return;
        }
        this.f26580b.put(state.b(), state);
        this.f26581c.put(state.b(), state);
        if (state.c().length() > 0) {
            this.f26579a.a(new Ih(state.b()));
        }
    }

    public final void b(Ph updatedState) {
        p013kotlin.jvm.internal.s.k(updatedState, "updatedState");
        if (updatedState.getState() != Gh.FOCUSED) {
            Ph ph2 = (Ph) this.f26581c.get(updatedState.b());
            if (ph2 != null && !p013kotlin.jvm.internal.s.f(updatedState.c(), ph2.c())) {
                this.f26582d.remove(updatedState.b());
                this.f26579a.a(new Hh(updatedState.b()));
            }
            this.f26581c.put(updatedState.b(), updatedState);
        }
    }

    public final void a(Ph validatedState, Th error) {
        p013kotlin.jvm.internal.s.k(validatedState, "validatedState");
        p013kotlin.jvm.internal.s.k(error, "error");
        if (validatedState.getState() == Gh.ERROR) {
            if (this.f26582d.get(validatedState.b()) == null) {
                this.f26579a.a(new Jh(validatedState.b(), error));
            }
            this.f26581c.put(validatedState.b(), validatedState);
            this.f26582d.put(validatedState.b(), error);
        }
    }
}
