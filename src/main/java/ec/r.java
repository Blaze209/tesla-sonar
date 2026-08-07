package ec;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Kind;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import rc.ImageRequest;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0017J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Lec/r;", "", "Lrc/g;", "request", "Lrc/d;", "b", "(Lrc/g;)Lrc/d;", "Ljn0/h0;", "shutdown", "()V", "Lrc/g$b;", "c", "()Lrc/g$b;", "defaults", "Lec/h;", "getComponents", "()Lec/h;", "components", "Lmc/d;", DateTokenConverter.CONVERTER_KEY, "()Lmc/d;", "memoryCache", "Lhc/a;", "a", "()Lhc/a;", "diskCache", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface r {

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR \u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010#R\u0017\u0010)\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lec/r$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lec/h;", "components", "f", "(Lec/h;)Lec/r$a;", "Lhc/a;", "diskCache", "g", "(Lhc/a;)Lec/r$a;", "Lec/r;", "c", "()Lec/r;", "a", "Landroid/content/Context;", Kind.APPLICATION, "Lrc/g$b;", "b", "Lrc/g$b;", "defaults", "Lkotlin/Lazy;", "Lmc/d;", "Lkotlin/Lazy;", "memoryCacheLazy", DateTokenConverter.CONVERTER_KEY, "diskCacheLazy", "Lec/j$c;", "e", "Lec/j$c;", "eventListenerFactory", "Lec/h;", "componentRegistry", "Lec/l$a;", "Lec/l$a;", "h", "()Lec/l$a;", "extras", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Context application;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private ImageRequest.Defaults defaults = ImageRequest.Defaults.f107567p;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Lazy<? extends mc.d> memoryCacheLazy = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Lazy<? extends hc.a> diskCacheLazy = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private j.c eventListenerFactory = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private h componentRegistry = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final Extras.a extras = new Extras.a();

        public a(Context context) {
            this.application = yc.e.b(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mc.d d(a aVar) {
            return mc.d.a.d(new mc.d.a(), aVar.application, 0.0d, 2, null).b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hc.a e() {
            return hc.g.d();
        }

        public final r c() {
            Context context = this.application;
            ImageRequest.Defaults defaults = this.defaults;
            ImageRequest.Defaults defaultsA = defaults.a((8191 & 1) != 0 ? defaults.fileSystem : null, (8191 & 2) != 0 ? defaults.interceptorCoroutineContext : null, (8191 & 4) != 0 ? defaults.fetcherCoroutineContext : null, (8191 & 8) != 0 ? defaults.decoderCoroutineContext : null, (8191 & 16) != 0 ? defaults.memoryCachePolicy : null, (8191 & 32) != 0 ? defaults.diskCachePolicy : null, (8191 & 64) != 0 ? defaults.networkCachePolicy : null, (8191 & 128) != 0 ? defaults.placeholderFactory : null, (8191 & 256) != 0 ? defaults.errorFactory : null, (8191 & 512) != 0 ? defaults.fallbackFactory : null, (8191 & 1024) != 0 ? defaults.sizeResolver : null, (8191 & 2048) != 0 ? defaults.scale : null, (8191 & 4096) != 0 ? defaults.precision : null, (8191 & PKIFailureInfo.certRevoked) != 0 ? defaults.extras : this.extras.a());
            Lazy<? extends mc.d> lazyB = this.memoryCacheLazy;
            if (lazyB == null) {
                lazyB = jn0.m.b(new wn0.a() { // from class: ec.p
                    @Override // wn0.a
                    public final Object invoke() {
                        return r.a.d(this.f62503a);
                    }
                });
            }
            Lazy<? extends hc.a> lazyB2 = this.diskCacheLazy;
            if (lazyB2 == null) {
                lazyB2 = jn0.m.b(new wn0.a() { // from class: ec.q
                    @Override // wn0.a
                    public final Object invoke() {
                        return r.a.e();
                    }
                });
            }
            j.c cVar = this.eventListenerFactory;
            if (cVar == null) {
                cVar = j.c.f62494b;
            }
            h hVar = this.componentRegistry;
            if (hVar == null) {
                hVar = new h();
            }
            return new v(new v.Options(context, defaultsA, lazyB, lazyB2, cVar, hVar, null));
        }

        public final a f(h components) {
            this.componentRegistry = components;
            return this;
        }

        public final a g(hc.a diskCache) {
            this.diskCacheLazy = jn0.m.c(diskCache);
            return this;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Extras.a getExtras() {
            return this.extras;
        }
    }

    hc.a a();

    rc.d b(ImageRequest request);

    ImageRequest.Defaults c();

    mc.d d();

    h getComponents();

    void shutdown();
}
