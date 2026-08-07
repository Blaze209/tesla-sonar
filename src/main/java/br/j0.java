package br;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f17929b = new j0(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17930a;

    public j0(boolean z11) {
        this.f17930a = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && j0.class == obj.getClass() && this.f17930a == ((j0) obj).f17930a;
    }

    public int hashCode() {
        return !this.f17930a ? 1 : 0;
    }
}
