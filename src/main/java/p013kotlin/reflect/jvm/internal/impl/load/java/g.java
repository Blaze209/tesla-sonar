package p013kotlin.reflect.jvm.internal.impl.load.java;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Jsr305Settings f87200a;

    public g(Jsr305Settings jsr305Settings) {
        this.f87200a = jsr305Settings;
    }

    @Override // wn0.a
    public Object invoke() {
        return Jsr305Settings.b(this.f87200a);
    }
}
