package vf0;

import com.unionpay.utils.UPUtils;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes8.dex */
final class b0 implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f119268a;

    b0(b bVar) {
        this.f119268a = bVar;
    }

    @Override // vf0.h
    public final void a(String str, i iVar) {
        UPUtils.k(this.f119268a, str);
        if (iVar != null) {
            iVar.a(b.i(WebrtcBuildVersion.maint_version, "success", null));
        }
    }
}
