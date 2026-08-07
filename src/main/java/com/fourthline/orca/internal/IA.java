package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class IA implements HA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lq.b f26270a;

    public IA(lq.b systemUiController) {
        p013kotlin.jvm.internal.s.k(systemUiController, "systemUiController");
        this.f26270a = systemUiController;
    }

    @Override // com.fourthline.orca.internal.HA
    public void a() {
        this.f26270a.b(false);
        this.f26270a.setSystemBarsBehavior(2);
    }

    @Override // com.fourthline.orca.internal.HA
    public void b() {
        this.f26270a.b(true);
    }
}
