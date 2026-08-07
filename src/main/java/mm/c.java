package mm;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import xm.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lmm/c;", "Lyk/a;", "Lxm/y;", "poolFactory", "<init>", "(Lxm/y;)V", "Lmm/b;", "a", "Lmm/b;", "jpegGenerator", "Lcom/facebook/imagepipeline/memory/c;", "b", "Lcom/facebook/imagepipeline/memory/c;", "flexByteArrayPool", "c", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements yk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b jpegGenerator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.facebook.imagepipeline.memory.c flexByteArrayPool;

    public c(y poolFactory) {
        s.k(poolFactory, "poolFactory");
        this.jpegGenerator = new b(poolFactory.h());
        com.facebook.imagepipeline.memory.c cVarD = poolFactory.d();
        s.j(cVarD, "getFlexByteArrayPool(...)");
        this.flexByteArrayPool = cVarD;
    }
}
