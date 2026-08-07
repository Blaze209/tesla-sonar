package z10;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b\u0015\u0010(\"\u0004\b)\u0010*R\"\u0010.\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b&\u0010(\"\u0004\b-\u0010*R\"\u00100\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010(\"\u0004\b/\u0010*R\"\u00106\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00102\u001a\u0004\b\u0005\u00103\"\u0004\b4\u00105R\"\u00109\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b\r\u00103\"\u0004\b8\u00105R\"\u0010<\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010'\u001a\u0004\b\u001e\u0010(\"\u0004\b;\u0010*R\"\u0010@\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010'\u001a\u0004\b>\u0010(\"\u0004\b?\u0010*R\"\u0010G\u001a\u00020A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bB\u0010D\"\u0004\bE\u0010FR\"\u0010I\u001a\u00020A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010C\u001a\u0004\b=\u0010D\"\u0004\bH\u0010FR\"\u0010P\u001a\u00020J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bK\u0010M\"\u0004\bN\u0010OR+\u0010S\u001a\u00020Q8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b \u00102\u001a\u0004\b7\u00103\"\u0004\bR\u00105R\"\u0010V\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u00102\u001a\u0004\b:\u00103\"\u0004\bU\u00105\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006W"}, d2 = {"Lz10/d;", "", "<init>", "()V", "Lq20/c;", "b", "Lq20/c;", "h", "()Lq20/c;", "setHttpMethod", "(Lq20/c;)V", "httpMethod", "Lm20/a;", "c", "Lm20/a;", "a", "()Lm20/a;", "setBufferOption", "(Lm20/a;)V", "bufferOption", "Lq20/g;", DateTokenConverter.CONVERTER_KEY, "Lq20/g;", IntegerTokenConverter.CONVERTER_KEY, "()Lq20/g;", "setHttpProtocol", "(Lq20/g;)V", "httpProtocol", "Ljava/util/EnumSet;", "Lz10/j;", "e", "Ljava/util/EnumSet;", "p", "()Ljava/util/EnumSet;", "setTlsVersions", "(Ljava/util/EnumSet;)V", "tlsVersions", "", "f", "I", "()I", "setEmitRange", "(I)V", "emitRange", "g", "setEmitterTick", "emitterTick", "setEmptyLimit", "emptyLimit", "", "J", "()J", "setByteLimitGet", "(J)V", "byteLimitGet", "j", "setByteLimitPost", "byteLimitPost", "k", "setEmitTimeout", "emitTimeout", "l", "n", "setThreadPoolSize", "threadPoolSize", "", "m", "Z", "()Z", "setServerAnonymisation", "(Z)V", "serverAnonymisation", "setRetryFailedRequests", "retryFailedRequests", "Ljava/util/concurrent/TimeUnit;", "o", "Ljava/util/concurrent/TimeUnit;", "()Ljava/util/concurrent/TimeUnit;", "setTimeUnit", "(Ljava/util/concurrent/TimeUnit;)V", "timeUnit", "Lio0/b;", "setMaxEventStoreAge-LRDsOJo", "maxEventStoreAge", "q", "setMaxEventStoreSize", "maxEventStoreSize", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f126471a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static q20.c httpMethod = q20.c.POST;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static m20.a bufferOption = m20.a.Single;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static q20.g httpProtocol = q20.g.HTTPS;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static EnumSet<j> tlsVersions;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static int emitRange;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static int emitterTick;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static int emptyLimit;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static long byteLimitGet;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static long byteLimitPost;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static int emitTimeout;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static int threadPoolSize;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static boolean serverAnonymisation;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static boolean retryFailedRequests;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static TimeUnit timeUnit;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static long maxEventStoreAge;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static long maxEventStoreSize;

    static {
        EnumSet<j> enumSetOf = EnumSet.of(j.TLSv1_2);
        s.j(enumSetOf, "of(TLSVersion.TLSv1_2)");
        tlsVersions = enumSetOf;
        emitRange = m20.a.LargeGroup.getCode();
        emitterTick = 5;
        emptyLimit = 5;
        byteLimitGet = 40000L;
        byteLimitPost = 40000L;
        emitTimeout = 30;
        threadPoolSize = 15;
        retryFailedRequests = true;
        timeUnit = TimeUnit.SECONDS;
        maxEventStoreAge = io0.d.s(30, io0.e.DAYS);
        maxEventStoreSize = 1000L;
    }

    private d() {
    }

    public final m20.a a() {
        return bufferOption;
    }

    public final long b() {
        return byteLimitGet;
    }

    public final long c() {
        return byteLimitPost;
    }

    public final int d() {
        return emitRange;
    }

    public final int e() {
        return emitTimeout;
    }

    public final int f() {
        return emitterTick;
    }

    public final int g() {
        return emptyLimit;
    }

    public final q20.c h() {
        return httpMethod;
    }

    public final q20.g i() {
        return httpProtocol;
    }

    public final long j() {
        return maxEventStoreAge;
    }

    public final long k() {
        return maxEventStoreSize;
    }

    public final boolean l() {
        return retryFailedRequests;
    }

    public final boolean m() {
        return serverAnonymisation;
    }

    public final int n() {
        return threadPoolSize;
    }

    public final TimeUnit o() {
        return timeUnit;
    }

    public final EnumSet<j> p() {
        return tlsVersions;
    }
}
