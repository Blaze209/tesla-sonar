package ec;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0003\"\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0003\"\u0018\u0010\r\u001a\u00020\u0001*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\f\"\u0018\u0010\u000f\u001a\u00020\u0005*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\b*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0010¨\u0006\u0012"}, d2 = {"Lec/l$c;", "", "a", "Lec/l$c;", "bitmapFactoryMaxParallelismKey", "Lgc/q;", "b", "bitmapFactoryExifOrientationStrategyKey", "", "c", "imageDecoderEnabledKey", "Lec/v$a;", "(Lec/v$a;)I", "bitmapFactoryMaxParallelism", "(Lec/v$a;)Lgc/q;", "bitmapFactoryExifOrientationStrategy", "(Lec/v$a;)Z", "imageDecoderEnabled", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Extras.c<Integer> f62512a = new Extras.c<>(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Extras.c<gc.q> f62513b = new Extras.c<>(gc.q.f67824c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Extras.c<Boolean> f62514c = new Extras.c<>(Boolean.TRUE);

    public static final gc.q a(v.Options options) {
        return (gc.q) m.c(options.getDefaults().getExtras(), f62513b);
    }

    public static final int b(v.Options options) {
        return ((Number) m.c(options.getDefaults().getExtras(), f62512a)).intValue();
    }

    public static final boolean c(v.Options options) {
        return ((Boolean) m.c(options.getDefaults().getExtras(), f62514c)).booleanValue();
    }
}
