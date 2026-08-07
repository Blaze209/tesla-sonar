package c0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f18308a;

    private f0(boolean z11) {
        this.f18308a = z11;
    }

    @NonNull
    public static f0 a(boolean z11) {
        return new f0(z11);
    }

    @NonNull
    public static f0 b() {
        return new f0(false);
    }

    public boolean c() {
        return this.f18308a;
    }
}
