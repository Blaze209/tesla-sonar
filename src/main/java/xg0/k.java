package xg0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import pg0.g3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0005R\u0011\u0010\u0018\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lxg0/k;", "", "Lej0/a;", "webRtcManager", "<init>", "(Lej0/a;)V", "Lpg0/g3$a;", "renderProps", "", "f", "(Lpg0/g3$a;)Z", "c", "Lfg0/a;", "e", "(Lpg0/g3$a;)Lfg0/a;", "Ljn0/h0;", "a", "()V", "Lej0/a;", "b", "()Lej0/a;", "setWebRtcManager", DateTokenConverter.CONVERTER_KEY, "()Z", "isWebRtcConnected", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private ej0.a webRtcManager;

    public k(ej0.a aVar) {
        this.webRtcManager = aVar;
    }

    public final void a() {
        ej0.a aVar = this.webRtcManager;
        if (aVar != null) {
            aVar.d();
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ej0.a getWebRtcManager() {
        return this.webRtcManager;
    }

    public final boolean c(g3.a renderProps) {
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        fg0.a aVarE = e(renderProps);
        return aVarE == fg0.a.Stream || aVarE == fg0.a.Upload;
    }

    public final boolean d() {
        ej0.a aVar = this.webRtcManager;
        return aVar != null && aVar.isConnected();
    }

    public final fg0.a e(g3.a renderProps) {
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        VideoCaptureConfig videoCaptureConfigV = renderProps.v();
        List<fg0.a> listC = videoCaptureConfigV.c();
        if (!videoCaptureConfigV.e()) {
            return fg0.a.None;
        }
        ej0.a aVar = this.webRtcManager;
        boolean zG = aVar != null ? aVar.g() : false;
        ej0.a aVar2 = this.webRtcManager;
        boolean zE = aVar2 != null ? aVar2.e() : true;
        if (p013kotlin.collections.v.q0(videoCaptureConfigV.c()) == fg0.a.Stream && !ej0.c.d()) {
            List<fg0.a> listC2 = videoCaptureConfigV.c();
            fg0.a aVar3 = fg0.a.Upload;
            return listC2.contains(aVar3) ? aVar3 : fg0.a.None;
        }
        if (zE) {
            fg0.a aVar4 = fg0.a.Upload;
            if (listC.contains(aVar4)) {
                return aVar4;
            }
        }
        if (zG) {
            return fg0.a.None;
        }
        fg0.a aVar5 = (fg0.a) p013kotlin.collections.v.q0(listC);
        return aVar5 == null ? fg0.a.None : aVar5;
    }

    public final boolean f(g3.a renderProps) {
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        return (renderProps.v().e() && p013kotlin.collections.v.q0(renderProps.v().c()) == fg0.a.Stream && !ej0.c.d()) ? false : true;
    }

    public /* synthetic */ k(ej0.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? ej0.c.b() : aVar);
    }
}
