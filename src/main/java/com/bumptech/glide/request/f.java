package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes3.dex */
public interface f {

    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        a(boolean z11) {
            this.isComplete = z11;
        }

        boolean isComplete() {
            return this.isComplete;
        }
    }

    boolean a();

    void b(e eVar);

    boolean c(e eVar);

    boolean e(e eVar);

    f getRoot();

    void h(e eVar);

    boolean j(e eVar);
}
