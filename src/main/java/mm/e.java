package mm;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import xm.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lmm/e;", "", "<init>", "()V", "Lxm/y;", "poolFactory", "Lym/d;", "platformDecoder", "Lpm/a;", "closeableReferenceFactory", "Lmm/d;", "a", "(Lxm/y;Lym/d;Lpm/a;)Lmm/d;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f92346a = new e();

    private e() {
    }

    public static final d a(y poolFactory, ym.d platformDecoder, pm.a closeableReferenceFactory) {
        s.k(poolFactory, "poolFactory");
        s.k(platformDecoder, "platformDecoder");
        s.k(closeableReferenceFactory, "closeableReferenceFactory");
        xm.d dVarB = poolFactory.b();
        s.j(dVarB, "getBitmapPool(...)");
        return new a(dVarB, closeableReferenceFactory);
    }
}
