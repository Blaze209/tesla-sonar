package vi;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReadableMap;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0002\u0010\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\"\u0010\u0017\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\"\u0010\u001b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\"\u0010\u001d\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u001c\u0010\u000eR\"\u0010\u001f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u001e\u0010\u000eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\"\u0010.\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\"\u001a\u0004\b,\u0010$\"\u0004\b-\u0010&R\"\u00100\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\n\u001a\u0004\b!\u0010\f\"\u0004\b/\u0010\u000eR\"\u00106\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u00102\u001a\u0004\b(\u00103\"\u0004\b4\u00105¨\u00067"}, d2 = {"Lvi/b;", "", "<init>", "()V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "a", "I", "f", "()I", "p", "(I)V", "cacheSize", "b", "l", "w", "minBufferMs", "c", IntegerTokenConverter.CONVERTER_KEY, "s", "maxBufferMs", DateTokenConverter.CONVERTER_KEY, "e", "o", "bufferForPlaybackMs", "n", "bufferForPlaybackAfterRebufferMs", "m", "backBufferDurationMs", "", "g", "D", "j", "()D", "t", "(D)V", "maxHeapAllocationPercent", "h", "getMinBackBufferMemoryReservePercent", "u", "minBackBufferMemoryReservePercent", "k", "v", "minBufferMemoryReservePercent", "q", "initialBitrate", "Lvi/b$b;", "Lvi/b$b;", "()Lvi/b$b;", "r", "(Lvi/b$b;)V", "live", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f119380m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final double f119381n = -1.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int cacheSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int minBufferMs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int maxBufferMs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int bufferForPlaybackMs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int bufferForPlaybackAfterRebufferMs;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int backBufferDurationMs;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private double maxHeapAllocationPercent;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private double minBackBufferMemoryReservePercent;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private double minBufferMemoryReservePercent;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int initialBitrate;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private C2555b live;

    /* JADX INFO: renamed from: vi.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u0014\u0010\u001f\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015¨\u0006 "}, d2 = {"Lvi/b$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "src", "Lvi/b;", "c", "(Lcom/facebook/react/bridge/ReadableMap;)Lvi/b;", "", "BufferConfigPropUnsetInt", "I", "b", "()I", "", "BufferConfigPropUnsetDouble", "D", "a", "()D", "", "PROP_BUFFER_CONFIG_CACHE_SIZE", "Ljava/lang/String;", "PROP_BUFFER_CONFIG_MIN_BUFFER_MS", "PROP_BUFFER_CONFIG_MAX_BUFFER_MS", "PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS", "PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS", "PROP_BUFFER_CONFIG_MAX_HEAP_ALLOCATION_PERCENT", "PROP_BUFFER_CONFIG_MIN_BACK_BUFFER_MEMORY_RESERVE_PERCENT", "PROP_BUFFER_CONFIG_MIN_BUFFER_MEMORY_RESERVE_PERCENT", "PROP_BUFFER_CONFIG_BACK_BUFFER_DURATION_MS", "PROP_BUFFER_CONFIG_INITIAL_BITRATE", "PROP_BUFFER_CONFIG_LIVE", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final double a() {
            return b.f119381n;
        }

        public final int b() {
            return b.f119380m;
        }

        public final b c(ReadableMap src) {
            b bVar = new b();
            if (src != null) {
                bVar.p(xi.b.e(src, "cacheSizeMB", b()));
                bVar.w(xi.b.e(src, "minBufferMs", b()));
                bVar.s(xi.b.e(src, "maxBufferMs", b()));
                bVar.o(xi.b.e(src, "bufferForPlaybackMs", b()));
                bVar.n(xi.b.e(src, "bufferForPlaybackAfterRebufferMs", b()));
                bVar.t(xi.b.c(src, "maxHeapAllocationPercent", a()));
                bVar.u(xi.b.c(src, "minBackBufferMemoryReservePercent", a()));
                bVar.v(xi.b.c(src, "minBufferMemoryReservePercent", a()));
                bVar.m(xi.b.e(src, "backBufferDurationMs", b()));
                bVar.q(xi.b.e(src, "initialBitrate", b()));
                bVar.r(C2555b.INSTANCE.a(src.getMap("live")));
            }
            return bVar;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: vi.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\f\u0018\u0000 \u00172\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\t\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\"\u0010\u001e\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0018¨\u0006\u001f"}, d2 = {"Lvi/b$b;", "", "<init>", "()V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "a", Gender.FEMALE, "b", "()F", "g", "(F)V", "maxPlaybackSpeed", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "minPlaybackSpeed", "", "c", "J", "()J", "f", "(J)V", "maxOffsetMs", "h", "minOffsetMs", "e", "j", "targetOffsetMs", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2555b {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private float maxPlaybackSpeed;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private float minPlaybackSpeed;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private long maxOffsetMs;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private long minOffsetMs;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private long targetOffsetMs;

        /* JADX INFO: renamed from: vi.b$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lvi/b$b$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "src", "Lvi/b$b;", "a", "(Lcom/facebook/react/bridge/ReadableMap;)Lvi/b$b;", "", "PROP_BUFFER_CONFIG_LIVE_MAX_PLAYBACK_SPEED", "Ljava/lang/String;", "PROP_BUFFER_CONFIG_LIVE_MIN_PLAYBACK_SPEED", "PROP_BUFFER_CONFIG_LIVE_MAX_OFFSET_MS", "PROP_BUFFER_CONFIG_LIVE_MIN_OFFSET_MS", "PROP_BUFFER_CONFIG_LIVE_TARGET_OFFSET_MS", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C2555b a(ReadableMap src) {
                C2555b c2555b = new C2555b();
                Companion companion = b.INSTANCE;
                c2555b.g(xi.b.d(src, "maxPlaybackSpeed", (float) companion.a()));
                c2555b.i(xi.b.d(src, "minPlaybackSpeed", (float) companion.a()));
                c2555b.f(xi.b.e(src, "maxOffsetMs", companion.b()));
                c2555b.h(xi.b.e(src, "minOffsetMs", companion.b()));
                c2555b.j(xi.b.e(src, "targetOffsetMs", companion.b()));
                return c2555b;
            }

            private Companion() {
            }
        }

        public C2555b() {
            Companion companion = b.INSTANCE;
            this.maxPlaybackSpeed = (float) companion.a();
            this.minPlaybackSpeed = (float) companion.a();
            this.maxOffsetMs = companion.b();
            this.minOffsetMs = companion.b();
            this.targetOffsetMs = companion.b();
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getMaxOffsetMs() {
            return this.maxOffsetMs;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getMaxPlaybackSpeed() {
            return this.maxPlaybackSpeed;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getMinOffsetMs() {
            return this.minOffsetMs;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getMinPlaybackSpeed() {
            return this.minPlaybackSpeed;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getTargetOffsetMs() {
            return this.targetOffsetMs;
        }

        public boolean equals(Object other) {
            if (other != null && (other instanceof C2555b)) {
                C2555b c2555b = (C2555b) other;
                if (this.maxPlaybackSpeed == c2555b.maxPlaybackSpeed && this.minPlaybackSpeed == c2555b.minPlaybackSpeed && this.maxOffsetMs == c2555b.maxOffsetMs && this.minOffsetMs == c2555b.minOffsetMs && this.targetOffsetMs == c2555b.targetOffsetMs) {
                    return true;
                }
            }
            return false;
        }

        public final void f(long j11) {
            this.maxOffsetMs = j11;
        }

        public final void g(float f11) {
            this.maxPlaybackSpeed = f11;
        }

        public final void h(long j11) {
            this.minOffsetMs = j11;
        }

        public final void i(float f11) {
            this.minPlaybackSpeed = f11;
        }

        public final void j(long j11) {
            this.targetOffsetMs = j11;
        }
    }

    public b() {
        int i11 = f119380m;
        this.cacheSize = i11;
        this.minBufferMs = i11;
        this.maxBufferMs = i11;
        this.bufferForPlaybackMs = i11;
        this.bufferForPlaybackAfterRebufferMs = i11;
        this.backBufferDurationMs = i11;
        double d11 = f119381n;
        this.maxHeapAllocationPercent = d11;
        this.minBackBufferMemoryReservePercent = d11;
        this.minBufferMemoryReservePercent = d11;
        this.initialBitrate = i11;
        this.live = new C2555b();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getBackBufferDurationMs() {
        return this.backBufferDurationMs;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getBufferForPlaybackAfterRebufferMs() {
        return this.bufferForPlaybackAfterRebufferMs;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getBufferForPlaybackMs() {
        return this.bufferForPlaybackMs;
    }

    public boolean equals(Object other) {
        if (other != null && (other instanceof b)) {
            b bVar = (b) other;
            if (this.cacheSize == bVar.cacheSize && this.minBufferMs == bVar.minBufferMs && this.maxBufferMs == bVar.maxBufferMs && this.bufferForPlaybackMs == bVar.bufferForPlaybackMs && this.bufferForPlaybackAfterRebufferMs == bVar.bufferForPlaybackAfterRebufferMs && this.backBufferDurationMs == bVar.backBufferDurationMs && this.maxHeapAllocationPercent == bVar.maxHeapAllocationPercent && this.minBackBufferMemoryReservePercent == bVar.minBackBufferMemoryReservePercent && this.minBufferMemoryReservePercent == bVar.minBufferMemoryReservePercent && this.initialBitrate == bVar.initialBitrate && s.f(this.live, bVar.live)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getCacheSize() {
        return this.cacheSize;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getInitialBitrate() {
        return this.initialBitrate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C2555b getLive() {
        return this.live;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getMaxBufferMs() {
        return this.maxBufferMs;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final double getMaxHeapAllocationPercent() {
        return this.maxHeapAllocationPercent;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final double getMinBufferMemoryReservePercent() {
        return this.minBufferMemoryReservePercent;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getMinBufferMs() {
        return this.minBufferMs;
    }

    public final void m(int i11) {
        this.backBufferDurationMs = i11;
    }

    public final void n(int i11) {
        this.bufferForPlaybackAfterRebufferMs = i11;
    }

    public final void o(int i11) {
        this.bufferForPlaybackMs = i11;
    }

    public final void p(int i11) {
        this.cacheSize = i11;
    }

    public final void q(int i11) {
        this.initialBitrate = i11;
    }

    public final void r(C2555b c2555b) {
        s.k(c2555b, "<set-?>");
        this.live = c2555b;
    }

    public final void s(int i11) {
        this.maxBufferMs = i11;
    }

    public final void t(double d11) {
        this.maxHeapAllocationPercent = d11;
    }

    public final void u(double d11) {
        this.minBackBufferMemoryReservePercent = d11;
    }

    public final void v(double d11) {
        this.minBufferMemoryReservePercent = d11;
    }

    public final void w(int i11) {
        this.minBufferMs = i11;
    }
}
