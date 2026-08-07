package vf0;

import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes8.dex */
final class y implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f119303a;

    y(b bVar) {
        this.f119303a = bVar;
    }

    @Override // vf0.h
    public final void a(String str, i iVar) {
        String strC = a.c(this.f119303a);
        if (iVar != null) {
            iVar.a(b.i(WebrtcBuildVersion.maint_version, "success", strC));
        }
    }
}
