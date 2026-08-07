package vf0;

import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes8.dex */
final class c0 implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f119276a;

    c0(b bVar) {
        this.f119276a = bVar;
    }

    @Override // vf0.h
    public final void a(String str, i iVar) {
        b.h(this.f119276a, Boolean.parseBoolean(str));
        if (iVar != null) {
            iVar.a(b.i(WebrtcBuildVersion.maint_version, "success", null));
        }
    }
}
