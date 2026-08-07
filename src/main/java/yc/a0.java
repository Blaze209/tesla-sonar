package yc;

import java.util.List;
import java.util.ServiceLoader;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R1\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00050\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR)\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\f0\f0\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Lyc/a0;", "", "<init>", "()V", "", "Lyc/i;", "kotlin.jvm.PlatformType", "b", "Lkotlin/Lazy;", "f", "()Ljava/util/List;", "fetchers", "Lyc/g;", "c", "e", "decoders", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f125335a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Lazy fetchers = jn0.m.b(new wn0.a() { // from class: yc.y
        @Override // wn0.a
        public final Object invoke() {
            return a0.d();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Lazy decoders = jn0.m.b(new wn0.a() { // from class: yc.z
        @Override // wn0.a
        public final Object invoke() {
            return a0.c();
        }
    });

    private a0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c() {
        return d.c(ho0.l.c0(ho0.l.h(ServiceLoader.load(g.class, g.class.getClassLoader()).iterator())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d() {
        return d.c(ho0.l.c0(ho0.l.h(ServiceLoader.load(i.class, i.class.getClassLoader()).iterator())));
    }

    public final List<g> e() {
        return (List) decoders.getValue();
    }

    public final List<i<?>> f() {
        return (List) fetchers.getValue();
    }
}
