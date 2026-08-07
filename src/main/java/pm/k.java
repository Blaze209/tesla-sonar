package pm;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010,\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0019¨\u0006-"}, d2 = {"Lpm/k;", "Lpk/n;", "Lpm/c;", "Lpm/q;", "fileCacheFactory", "Lxm/y;", "poolFactory", "Lpm/p;", "executorSupplier", "Lnm/t;", "imageCacheStatsTracker", "", "memoryChunkType", "Lkk/d;", "mainDiskCacheConfig", "smallImageDiskCacheConfig", "", "", "dynamicDiskCacheConfigMap", "<init>", "(Lpm/q;Lxm/y;Lpm/p;Lnm/t;ILkk/d;Lkk/d;Ljava/util/Map;)V", "Lpm/v;", "config", "(Lpm/q;Lpm/v;)V", "k", "()Lpm/c;", "a", "Lpm/q;", "b", "Lxm/y;", "c", "Lpm/p;", DateTokenConverter.CONVERTER_KEY, "Lnm/t;", "e", "I", "f", "Lkk/d;", "g", "h", "Ljava/util/Map;", IntegerTokenConverter.CONVERTER_KEY, "Lkotlin/Lazy;", "l", "diskCachesStore", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k implements pk.n<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q fileCacheFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xm.y poolFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p executorSupplier;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final nm.t imageCacheStatsTracker;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int memoryChunkType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final kk.d mainDiskCacheConfig;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final kk.d smallImageDiskCacheConfig;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Map<String, kk.d> dynamicDiskCacheConfigMap;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Lazy diskCachesStore;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u000b\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000e\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001b\u0010\u0010\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0003\u0010\nR'\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0015R'\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\f\u0010\u0019¨\u0006\u001b"}, d2 = {"pm/k$a", "Lpm/c;", "Lkk/k;", "a", "Lkotlin/Lazy;", "m", "()Lkk/k;", "mainFileCache", "Lnm/j;", "b", "()Lnm/j;", "mainBufferedDiskCache", "c", "n", "smallImageFileCache", DateTokenConverter.CONVERTER_KEY, "smallImageBufferedDiskCache", "", "", "e", "l", "()Ljava/util/Map;", "dynamicFileCaches", "Lpk/g;", "f", "()Lpk/g;", "dynamicBufferedDiskCaches", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Lazy mainFileCache;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Lazy mainBufferedDiskCache;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Lazy smallImageFileCache;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Lazy smallImageBufferedDiskCache;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Lazy dynamicFileCaches;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Lazy dynamicBufferedDiskCaches;

        a(final k kVar) {
            jn0.p pVar = jn0.p.SYNCHRONIZED;
            this.mainFileCache = jn0.m.a(pVar, new wn0.a() { // from class: pm.e
                @Override // wn0.a
                public final Object invoke() {
                    return k.a.p(kVar);
                }
            });
            this.mainBufferedDiskCache = jn0.m.a(pVar, new wn0.a() { // from class: pm.f
                @Override // wn0.a
                public final Object invoke() {
                    return k.a.o(this.f103240a, kVar);
                }
            });
            this.smallImageFileCache = jn0.m.a(pVar, new wn0.a() { // from class: pm.g
                @Override // wn0.a
                public final Object invoke() {
                    return k.a.r(kVar);
                }
            });
            this.smallImageBufferedDiskCache = jn0.m.a(pVar, new wn0.a() { // from class: pm.h
                @Override // wn0.a
                public final Object invoke() {
                    return k.a.q(this.f103245a, kVar);
                }
            });
            this.dynamicFileCaches = jn0.m.a(pVar, new wn0.a() { // from class: pm.i
                @Override // wn0.a
                public final Object invoke() {
                    return k.a.k(kVar, this);
                }
            });
            this.dynamicBufferedDiskCaches = jn0.m.a(pVar, new wn0.a() { // from class: pm.j
                @Override // wn0.a
                public final Object invoke() {
                    return k.a.j(this.f103251a, kVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final pk.g j(a this$0, k this$1) {
            p013kotlin.jvm.internal.s.k(this$0, "this$0");
            p013kotlin.jvm.internal.s.k(this$1, "this$1");
            Map<String, kk.k> mapL = this$0.l();
            LinkedHashMap linkedHashMap = new LinkedHashMap(p013kotlin.collections.v0.e(mapL.size()));
            Iterator<T> it = mapL.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                kk.k kVar = (kk.k) entry.getValue();
                sk.h hVarI = this$1.poolFactory.i(this$1.memoryChunkType);
                p013kotlin.jvm.internal.s.j(hVarI, "getPooledByteBufferFactory(...)");
                sk.k kVarJ = this$1.poolFactory.j();
                p013kotlin.jvm.internal.s.j(kVarJ, "getPooledByteStreams(...)");
                Executor ioBoundExecutor = this$1.executorSupplier.getIoBoundExecutor();
                p013kotlin.jvm.internal.s.j(ioBoundExecutor, "forLocalStorageRead(...)");
                Executor executorE = this$1.executorSupplier.e();
                p013kotlin.jvm.internal.s.j(executorE, "forLocalStorageWrite(...)");
                linkedHashMap.put(key, new nm.j(kVar, hVarI, kVarJ, ioBoundExecutor, executorE, this$1.imageCacheStatsTracker));
            }
            return pk.g.b(linkedHashMap);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map k(k this$0, a this$1) {
            p013kotlin.jvm.internal.s.k(this$0, "this$0");
            p013kotlin.jvm.internal.s.k(this$1, "this$1");
            Map map = this$0.dynamicDiskCacheConfigMap;
            if (map == null) {
                return p013kotlin.collections.v0.i();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(p013kotlin.collections.v0.e(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), this$0.fileCacheFactory.a((kk.d) entry.getValue()));
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nm.j o(a this$0, k this$1) {
            p013kotlin.jvm.internal.s.k(this$0, "this$0");
            p013kotlin.jvm.internal.s.k(this$1, "this$1");
            kk.k kVarM = this$0.m();
            sk.h hVarI = this$1.poolFactory.i(this$1.memoryChunkType);
            p013kotlin.jvm.internal.s.j(hVarI, "getPooledByteBufferFactory(...)");
            sk.k kVarJ = this$1.poolFactory.j();
            p013kotlin.jvm.internal.s.j(kVarJ, "getPooledByteStreams(...)");
            Executor ioBoundExecutor = this$1.executorSupplier.getIoBoundExecutor();
            p013kotlin.jvm.internal.s.j(ioBoundExecutor, "forLocalStorageRead(...)");
            Executor executorE = this$1.executorSupplier.e();
            p013kotlin.jvm.internal.s.j(executorE, "forLocalStorageWrite(...)");
            return new nm.j(kVarM, hVarI, kVarJ, ioBoundExecutor, executorE, this$1.imageCacheStatsTracker);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kk.k p(k this$0) {
            p013kotlin.jvm.internal.s.k(this$0, "this$0");
            return this$0.fileCacheFactory.a(this$0.mainDiskCacheConfig);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nm.j q(a this$0, k this$1) {
            p013kotlin.jvm.internal.s.k(this$0, "this$0");
            p013kotlin.jvm.internal.s.k(this$1, "this$1");
            kk.k kVarN = this$0.n();
            sk.h hVarI = this$1.poolFactory.i(this$1.memoryChunkType);
            p013kotlin.jvm.internal.s.j(hVarI, "getPooledByteBufferFactory(...)");
            sk.k kVarJ = this$1.poolFactory.j();
            p013kotlin.jvm.internal.s.j(kVarJ, "getPooledByteStreams(...)");
            Executor ioBoundExecutor = this$1.executorSupplier.getIoBoundExecutor();
            p013kotlin.jvm.internal.s.j(ioBoundExecutor, "forLocalStorageRead(...)");
            Executor executorE = this$1.executorSupplier.e();
            p013kotlin.jvm.internal.s.j(executorE, "forLocalStorageWrite(...)");
            return new nm.j(kVarN, hVarI, kVarJ, ioBoundExecutor, executorE, this$1.imageCacheStatsTracker);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kk.k r(k this$0) {
            p013kotlin.jvm.internal.s.k(this$0, "this$0");
            return this$0.fileCacheFactory.a(this$0.smallImageDiskCacheConfig);
        }

        @Override // pm.c
        public nm.j a() {
            return (nm.j) this.smallImageBufferedDiskCache.getValue();
        }

        @Override // pm.c
        public nm.j b() {
            return (nm.j) this.mainBufferedDiskCache.getValue();
        }

        @Override // pm.c
        public pk.g<String, nm.j> c() {
            Object value = this.dynamicBufferedDiskCaches.getValue();
            p013kotlin.jvm.internal.s.j(value, "getValue(...)");
            return (pk.g) value;
        }

        public Map<String, kk.k> l() {
            return (Map) this.dynamicFileCaches.getValue();
        }

        public kk.k m() {
            return (kk.k) this.mainFileCache.getValue();
        }

        public kk.k n() {
            return (kk.k) this.smallImageFileCache.getValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(q fileCacheFactory, xm.y poolFactory, p executorSupplier, nm.t imageCacheStatsTracker, int i11, kk.d mainDiskCacheConfig, kk.d smallImageDiskCacheConfig, Map<String, ? extends kk.d> map) {
        p013kotlin.jvm.internal.s.k(fileCacheFactory, "fileCacheFactory");
        p013kotlin.jvm.internal.s.k(poolFactory, "poolFactory");
        p013kotlin.jvm.internal.s.k(executorSupplier, "executorSupplier");
        p013kotlin.jvm.internal.s.k(imageCacheStatsTracker, "imageCacheStatsTracker");
        p013kotlin.jvm.internal.s.k(mainDiskCacheConfig, "mainDiskCacheConfig");
        p013kotlin.jvm.internal.s.k(smallImageDiskCacheConfig, "smallImageDiskCacheConfig");
        this.fileCacheFactory = fileCacheFactory;
        this.poolFactory = poolFactory;
        this.executorSupplier = executorSupplier;
        this.imageCacheStatsTracker = imageCacheStatsTracker;
        this.memoryChunkType = i11;
        this.mainDiskCacheConfig = mainDiskCacheConfig;
        this.smallImageDiskCacheConfig = smallImageDiskCacheConfig;
        this.dynamicDiskCacheConfigMap = map;
        this.diskCachesStore = jn0.m.a(jn0.p.SYNCHRONIZED, new wn0.a() { // from class: pm.d
            @Override // wn0.a
            public final Object invoke() {
                return k.j(this.f103236a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a j(k this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        return new a(this$0);
    }

    private final c l() {
        return (c) this.diskCachesStore.getValue();
    }

    @Override // pk.n
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public c get() {
        return l();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(q fileCacheFactory, v config) {
        this(fileCacheFactory, config.getPoolFactory(), config.getExecutorSupplier(), config.getImageCacheStatsTracker(), config.getMemoryChunkType(), config.getMainDiskCacheConfig(), config.getSmallImageDiskCacheConfig(), config.d());
        p013kotlin.jvm.internal.s.k(fileCacheFactory, "fileCacheFactory");
        p013kotlin.jvm.internal.s.k(config, "config");
    }
}
