package fu;

import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
final class h implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f66587a;

    h(i iVar) {
        this.f66587a = iVar;
    }

    @Override // fu.m
    public final void a(n nVar, File file, boolean z11) {
        this.f66587a.f66589b.add(file);
        if (z11) {
            return;
        }
        this.f66587a.f66590c.set(false);
    }
}
