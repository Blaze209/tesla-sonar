package yo;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import pm.t;
import pm.y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lyo/b;", "", "<init>", "()V", "", Snapshot.WIDTH, Snapshot.HEIGHT, "", "Lyo/a;", "sources", "Lyo/b$a;", "a", "(IILjava/util/List;)Lyo/b$a;", "", "multiplier", "b", "(IILjava/util/List;D)Lyo/b$a;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f125718a = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lyo/b$a;", "", "Lyo/a;", "bestResult", "bestResultInCache", "<init>", "(Lyo/a;Lyo/a;)V", "a", "Lyo/a;", "b", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final yo.a bestResult;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final yo.a bestResultInCache;

        public a(yo.a aVar, yo.a aVar2) {
            this.bestResult = aVar;
            this.bestResultInCache = aVar2;
        }
    }

    private b() {
    }

    public static final a a(int width, int height, List<? extends yo.a> sources) {
        s.k(sources, "sources");
        return b(width, height, sources, 1.0d);
    }

    public static final a b(int width, int height, List<? extends yo.a> sources, double multiplier) {
        s.k(sources, "sources");
        if (sources.isEmpty()) {
            return new a(null, null);
        }
        if (sources.size() == 1) {
            return new a(sources.get(0), null);
        }
        if (width <= 0 || height <= 0) {
            return new a(null, null);
        }
        t tVarJ = y.l().j();
        s.j(tVarJ, "getImagePipeline(...)");
        double d11 = ((double) (width * height)) * multiplier;
        double d12 = Double.MAX_VALUE;
        double d13 = Double.MAX_VALUE;
        yo.a aVar = null;
        yo.a aVar2 = null;
        for (yo.a aVar3 : sources) {
            double dAbs = Math.abs(1.0d - (aVar3.getSize() / d11));
            if (dAbs < d12) {
                aVar2 = aVar3;
                d12 = dAbs;
            }
            if (dAbs < d13 && aVar3.getCacheControl() != go.a.RELOAD && (tVarJ.t(aVar3.getUri()) || tVarJ.v(aVar3.getUri()))) {
                aVar = aVar3;
                d13 = dAbs;
            }
        }
        return new a(aVar2, (aVar == null || aVar2 == null || !s.f(aVar.getSource(), aVar2.getSource())) ? aVar : null);
    }
}
