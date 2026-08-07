package mc;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ec.BitmapImage;
import ec.r;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import rc.ImageRequest;
import rc.Options;
import rc.SuccessResult;
import rc.p;
import sc.Size;
import yc.f0;
import yc.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000  2\u00020\u0001:\u0001\u001eB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010 \u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b \u0010\u0016J'\u0010#\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J-\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010/\u001a\u00020\u0014*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001a\u00102\u001a\u0004\u0018\u000100*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u00101¨\u00063"}, d2 = {"Lmc/e;", "", "Lec/r;", "imageLoader", "Lrc/p;", "requestService", "Lyc/t;", "logger", "<init>", "(Lec/r;Lrc/p;Lyc/t;)V", "Lrc/g;", "request", "Lmc/d$b;", "cacheKey", "Lmc/d$c;", "cacheValue", "Lsc/g;", "size", "Lsc/f;", "scale", "", DateTokenConverter.CONVERTER_KEY, "(Lrc/g;Lmc/d$b;Lmc/d$c;Lsc/g;Lsc/f;)Z", "mappedData", "Lrc/n;", "options", "Lec/j;", "eventListener", "f", "(Lrc/g;Ljava/lang/Object;Lrc/n;Lec/j;)Lmc/d$b;", "a", "(Lrc/g;Lmc/d$b;Lsc/g;Lsc/f;)Lmc/d$c;", "c", "Ljc/a$b;", "result", "h", "(Lmc/d$b;Lrc/g;Ljc/a$b;)Z", "Ljc/d$a;", "chain", "Lrc/r;", "g", "(Ljc/d$a;Lrc/g;Lmc/d$b;Lmc/d$c;)Lrc/r;", "Lec/r;", "b", "Lrc/p;", "e", "(Lmc/d$c;)Z", "isSampled", "", "(Lmc/d$c;)Ljava/lang/String;", "diskCacheKey", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r imageLoader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p requestService;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f91748b;

        static {
            int[] iArr = new int[sc.f.values().length];
            try {
                iArr[sc.f.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sc.f.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f91747a = iArr;
            int[] iArr2 = new int[sc.c.values().length];
            try {
                iArr2[sc.c.EXACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[sc.c.INEXACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f91748b = iArr2;
        }
    }

    public e(r rVar, p pVar, t tVar) {
        this.imageLoader = rVar;
        this.requestService = pVar;
    }

    private final String b(d.Value value) {
        Object obj = value.a().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private final boolean d(ImageRequest request, d.Key cacheKey, d.Value cacheValue, Size size, sc.f scale) {
        int iAbs;
        String str = cacheKey.a().get("coil#size");
        if (str != null) {
            return s.f(str, size.toString());
        }
        if (!e(cacheValue) && (sc.h.b(size) || request.getPrecision() == sc.c.INEXACT)) {
            return true;
        }
        int i11 = cacheValue.getImage().getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
        int height = cacheValue.getImage().getHeight();
        Size sizeE = cacheValue.getImage() instanceof BitmapImage ? rc.h.e(request) : Size.f111062d;
        sc.a width = size.getWidth();
        int px2 = width instanceof sc.a.C2364a ? ((sc.a.C2364a) width).getPx() : Integer.MAX_VALUE;
        sc.a width2 = sizeE.getWidth();
        int iMin = Math.min(px2, width2 instanceof sc.a.C2364a ? ((sc.a.C2364a) width2).getPx() : Integer.MAX_VALUE);
        sc.a height2 = size.getHeight();
        int px3 = height2 instanceof sc.a.C2364a ? ((sc.a.C2364a) height2).getPx() : Integer.MAX_VALUE;
        sc.a height3 = sizeE.getHeight();
        int iMin2 = Math.min(px3, height3 instanceof sc.a.C2364a ? ((sc.a.C2364a) height3).getPx() : Integer.MAX_VALUE);
        double d11 = ((double) iMin) / ((double) i11);
        double d12 = ((double) iMin2) / ((double) height);
        int i12 = b.f91747a[((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? sc.f.FIT : scale).ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (d11 < d12) {
                iAbs = Math.abs(iMin - i11);
            } else {
                iAbs = Math.abs(iMin2 - height);
                d11 = d12;
            }
        } else if (d11 > d12) {
            iAbs = Math.abs(iMin - i11);
        } else {
            iAbs = Math.abs(iMin2 - height);
            d11 = d12;
        }
        if (iAbs <= 1) {
            return true;
        }
        int i13 = b.f91748b[request.getPrecision().ordinal()];
        if (i13 == 1) {
            return d11 == 1.0d;
        }
        if (i13 == 2) {
            return d11 <= 1.0d;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean e(d.Value value) {
        Object obj = value.a().get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final d.Value a(ImageRequest request, d.Key cacheKey, Size size, sc.f scale) {
        if (!request.getMemoryCachePolicy().getReadEnabled()) {
            return null;
        }
        d dVarD = this.imageLoader.d();
        d.Value valueA = dVarD != null ? dVarD.a(cacheKey) : null;
        if (valueA == null || !c(request, cacheKey, valueA, size, scale)) {
            return null;
        }
        return valueA;
    }

    public final boolean c(ImageRequest request, d.Key cacheKey, d.Value cacheValue, Size size, sc.f scale) {
        if (this.requestService.e(request, cacheValue)) {
            return d(request, cacheKey, cacheValue, size, scale);
        }
        return false;
    }

    public final d.Key f(ImageRequest request, Object mappedData, Options options, ec.j eventListener) {
        if (request.getMemoryCacheKey() != null) {
            return new d.Key(request.getMemoryCacheKey(), request.r());
        }
        eventListener.j(request, mappedData);
        String strP = f0.p(this.imageLoader.getComponents(), mappedData, options, null, "MemoryCacheService");
        eventListener.i(request, strP);
        if (strP == null) {
            return null;
        }
        if (rc.h.g(request).isEmpty()) {
            return new d.Key(strP, request.r());
        }
        Map mapD = v0.D(request.r());
        mapD.put("coil#size", options.getSize().toString());
        return new d.Key(strP, mapD);
    }

    public final SuccessResult g(jc.d.a chain, ImageRequest request, d.Key cacheKey, d.Value cacheValue) {
        return new SuccessResult(cacheValue.getImage(), request, gc.h.MEMORY_CACHE, cacheKey, b(cacheValue), e(cacheValue), f0.o(chain));
    }

    public final boolean h(d.Key cacheKey, ImageRequest request, jc.a.ExecuteResult result) {
        d dVarD;
        if (cacheKey == null || !request.getMemoryCachePolicy().getWriteEnabled() || !result.getImage().getShareable() || (dVarD = this.imageLoader.d()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(result.getIsSampled()));
        String diskCacheKey = result.getDiskCacheKey();
        if (diskCacheKey != null) {
            linkedHashMap.put("coil#disk_cache_key", diskCacheKey);
        }
        dVarD.e(cacheKey, new d.Value(result.getImage(), linkedHashMap));
        return true;
    }
}
