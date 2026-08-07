package og0;

import qj0.i;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i<ng0.b> f97329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i<b> f97330b;

    public d(i<ng0.b> iVar, i<b> iVar2) {
        this.f97329a = iVar;
        this.f97330b = iVar2;
    }

    public static d a(i<ng0.b> iVar, i<b> iVar2) {
        return new d(iVar, iVar2);
    }

    public static c c(String str, ng0.b bVar, b bVar2) {
        return new c(str, bVar, bVar2);
    }

    public c b(String str) {
        return c(str, this.f97329a.get(), this.f97330b.get());
    }
}
