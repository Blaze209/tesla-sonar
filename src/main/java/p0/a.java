package p0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class a extends t.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f100089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f100090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.concurrent.futures.c.a<Void> f100091c;

    a(int i11, int i12, androidx.concurrent.futures.c.a<Void> aVar) {
        this.f100089a = i11;
        this.f100090b = i12;
        if (aVar == null) {
            throw new NullPointerException("Null completer");
        }
        this.f100091c = aVar;
    }

    @Override // p0.t.b
    @NonNull
    androidx.concurrent.futures.c.a<Void> a() {
        return this.f100091c;
    }

    @Override // p0.t.b
    int b() {
        return this.f100089a;
    }

    @Override // p0.t.b
    int c() {
        return this.f100090b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t.b) {
            t.b bVar = (t.b) obj;
            if (this.f100089a == bVar.b() && this.f100090b == bVar.c() && this.f100091c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f100089a ^ 1000003) * 1000003) ^ this.f100090b) * 1000003) ^ this.f100091c.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f100089a + ", rotationDegrees=" + this.f100090b + ", completer=" + this.f100091c + "}";
    }
}
