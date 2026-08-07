package vf0;

import com.unionpay.utils.UPUtils;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes8.dex */
final class a0 implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f119258a;

    a0(b bVar) {
        this.f119258a = bVar;
    }

    @Override // vf0.h
    public final void a(String str, i iVar) {
        String strC = UPUtils.c(this.f119258a, str);
        if (iVar != null) {
            iVar.a(b.i(WebrtcBuildVersion.maint_version, "success", strC));
        }
    }
}
