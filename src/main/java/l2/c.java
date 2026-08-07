package l2;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k3.SolidColor;
import k3.i4;
import k3.j4;
import k3.p1;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p3.f;
import p3.o;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0006\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0005¨\u0006\u0007"}, d2 = {"Lp3/d;", "a", "Lp3/d;", "_clear", "Lj2/b$a;", "(Lj2/b$a;)Lp3/d;", "Clear", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p3.d f89493a;

    public static final p3.d a(j2.b.a aVar) {
        p3.d dVar = f89493a;
        if (dVar != null) {
            s.h(dVar);
            return dVar;
        }
        p3.d.a aVar2 = new p3.d.a("Filled.Clear", h.g(24.0f), h.g(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int iA = o.a();
        SolidColor solidColor = new SolidColor(p1.INSTANCE.a(), null);
        int iA2 = i4.INSTANCE.a();
        int iA3 = j4.INSTANCE.a();
        f fVar = new f();
        fVar.i(19.0f, 6.41f);
        fVar.g(17.59f, 5.0f);
        fVar.g(12.0f, 10.59f);
        fVar.g(6.41f, 5.0f);
        fVar.g(5.0f, 6.41f);
        fVar.g(10.59f, 12.0f);
        fVar.g(5.0f, 17.59f);
        fVar.g(6.41f, 19.0f);
        fVar.g(12.0f, 13.41f);
        fVar.g(17.59f, 19.0f);
        fVar.g(19.0f, 17.59f);
        fVar.g(13.41f, 12.0f);
        fVar.a();
        p3.d dVarF = aVar2.c(fVar.d(), (14336 & 2) != 0 ? o.a() : iA, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? o.b() : iA2, (14336 & 512) != 0 ? o.c() : iA3, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : BitmapDescriptorFactory.HUE_RED, (14336 & 4096) == 0 ? BitmapDescriptorFactory.HUE_RED : 1.0f, (14336 & PKIFailureInfo.certRevoked) != 0 ? 0.0f : BitmapDescriptorFactory.HUE_RED).f();
        f89493a = dVarF;
        s.h(dVarF);
        return dVarF;
    }
}
