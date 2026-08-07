package rc;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ec.Extras;
import java.util.List;
import p013kotlin.Metadata;
import sc.Size;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\" \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000b\"\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u0019\u001a\u00020\r*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0015\u0010\u0019\u001a\u00020\r*\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0015\u0010\u001e\u001a\u00020\u0001*\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001d\"\u0015\u0010 \u001a\u00020\u0001*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001f¨\u0006!"}, d2 = {"Lrc/g$a;", "", "enable", "b", "(Lrc/g$a;Z)Lrc/g$a;", "Lec/r$a;", "a", "(Lec/r$a;Z)Lec/r$a;", "Lec/l$c;", "", "Lwc/a;", "Lec/l$c;", "transformationsKey", "Lsc/g;", "maxBitmapSizeKey", "c", "addLastModifiedToFileCacheKeyKey", DateTokenConverter.CONVERTER_KEY, "allowConversionToBitmapKey", "Lrc/g;", "g", "(Lrc/g;)Ljava/util/List;", "transformations", "e", "(Lrc/g;)Lsc/g;", "maxBitmapSize", "Lrc/n;", "f", "(Lrc/n;)Lsc/g;", "(Lrc/n;)Z", "addLastModifiedToFileCacheKey", "(Lrc/g;)Z", "allowConversionToBitmap", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Extras.c<List<wc.a>> f107595a = new Extras.c<>(p013kotlin.collections.v.m());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Extras.c<Size> f107596b = new Extras.c<>(sc.h.a(4096, 4096));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Extras.c<Boolean> f107597c = new Extras.c<>(Boolean.FALSE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Extras.c<Boolean> f107598d = new Extras.c<>(Boolean.TRUE);

    public static final ec.r.a a(ec.r.a aVar, boolean z11) {
        return i.a(aVar, z11 ? 200 : 0);
    }

    public static final ImageRequest.a b(ImageRequest.a aVar, boolean z11) {
        return i.b(aVar, z11 ? 200 : 0);
    }

    public static final boolean c(Options options) {
        return ((Boolean) ec.m.b(options, f107597c)).booleanValue();
    }

    public static final boolean d(ImageRequest imageRequest) {
        return ((Boolean) ec.m.a(imageRequest, f107598d)).booleanValue();
    }

    public static final Size e(ImageRequest imageRequest) {
        return (Size) ec.m.a(imageRequest, f107596b);
    }

    public static final Size f(Options options) {
        return (Size) ec.m.b(options, f107596b);
    }

    public static final List<wc.a> g(ImageRequest imageRequest) {
        return (List) ec.m.a(imageRequest, f107595a);
    }
}
