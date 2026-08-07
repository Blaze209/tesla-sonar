package c0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class f extends o1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o1 f18307b;

    f(int i11, o1 o1Var) {
        this.f18306a = i11;
        if (o1Var == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.f18307b = o1Var;
    }

    @Override // c0.o1.b
    public int a() {
        return this.f18306a;
    }

    @Override // c0.o1.b
    @NonNull
    public o1 b() {
        return this.f18307b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1.b) {
            o1.b bVar = (o1.b) obj;
            if (this.f18306a == bVar.a() && this.f18307b.equals(bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f18306a ^ 1000003) * 1000003) ^ this.f18307b.hashCode();
    }

    public String toString() {
        return "Event{eventCode=" + this.f18306a + ", surfaceOutput=" + this.f18307b + "}";
    }
}
