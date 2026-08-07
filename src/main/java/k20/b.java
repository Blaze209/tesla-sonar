package k20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\nR\u0018\u0010-\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\nR!\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010\u001eR$\u00109\u001a\u00020\t2\u0006\u00104\u001a\u00020\t8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010\u0006\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010:\"\u0004\b;\u0010<R$\u0010@\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010=\"\u0004\b>\u0010?R$\u0010B\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b2\u0010=\"\u0004\bA\u0010?R$\u0010F\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010C\"\u0004\bD\u0010ER$\u0010H\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010C\"\u0004\bG\u0010ER(\u0010M\u001a\u0004\u0018\u00010I2\b\u00104\u001a\u0004\u0018\u00010I8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b*\u0010J\"\u0004\bK\u0010LR(\u0010Q\u001a\u0004\u0018\u00010\"2\b\u00104\u001a\u0004\u0018\u00010\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010N\"\u0004\bO\u0010PR@\u0010U\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010&2\u0014\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010&8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010R\"\u0004\bS\u0010TR$\u0010W\u001a\u00020\t2\u0006\u00104\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b/\u00106\"\u0004\bV\u00108R$\u0010Y\u001a\u00020\t2\u0006\u00104\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u00106\"\u0004\bX\u00108R-\u0010[\u001a\u00020.2\u0006\u00104\u001a\u00020.8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b#\u0010C\"\u0004\bZ\u0010ER$\u0010]\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010C\"\u0004\b\\\u0010E\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Lk20/b;", "Lk20/a;", "", "<init>", "()V", "Lm20/a;", "bufferOption", "a", "(Lm20/a;)Lk20/b;", "", "Ljava/lang/Boolean;", "_isPaused", "b", "Lk20/b;", "getSourceConfig$snowplow_android_tracker_release", "()Lk20/b;", "p", "(Lk20/b;)V", "sourceConfig", "c", "Lm20/a;", "_bufferOption", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", "_emitRange", "e", "_threadPoolSize", "", "f", "Ljava/lang/Long;", "_byteLimitGet", "g", "_byteLimitPost", "Lm20/c;", "h", "Lm20/c;", "_eventStore", "", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/Map;", "_customRetryForStatusCodes", "j", "_serverAnonymisation", "k", "_retryFailedRequests", "Lio0/b;", "l", "Lio0/b;", "_maxEventStoreAge", "m", "_maxEventStoreSize", "value", "n", "()Z", "setPaused$snowplow_android_tracker_release", "(Z)V", "isPaused", "()Lm20/a;", "o", "(Lm20/a;)V", "()I", "setEmitRange", "(I)V", "emitRange", "setThreadPoolSize", "threadPoolSize", "()J", "setByteLimitGet", "(J)V", "byteLimitGet", "setByteLimitPost", "byteLimitPost", "Lq20/i;", "()Lq20/i;", "setRequestCallback", "(Lq20/i;)V", "requestCallback", "()Lm20/c;", "setEventStore", "(Lm20/c;)V", "eventStore", "()Ljava/util/Map;", "setCustomRetryForStatusCodes", "(Ljava/util/Map;)V", "customRetryForStatusCodes", "setServerAnonymisation", "serverAnonymisation", "setRetryFailedRequests", "retryFailedRequests", "setMaxEventStoreAge-LRDsOJo", "maxEventStoreAge", "setMaxEventStoreSize", "maxEventStoreSize", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Boolean _isPaused;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private b sourceConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private m20.a _bufferOption;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Integer _emitRange;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Integer _threadPoolSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Long _byteLimitGet;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Long _byteLimitPost;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private m20.c _eventStore;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Map<Integer, Boolean> _customRetryForStatusCodes;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Boolean _serverAnonymisation;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Boolean _retryFailedRequests;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private io0.b _maxEventStoreAge;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Long _maxEventStoreSize;

    public final b a(m20.a bufferOption) {
        s.k(bufferOption, "bufferOption");
        o(bufferOption);
        return this;
    }

    public m20.a b() {
        m20.a aVar = this._bufferOption;
        if (aVar != null) {
            return aVar;
        }
        b bVar = this.sourceConfig;
        m20.a aVarB = bVar != null ? bVar.b() : null;
        return aVarB == null ? z10.d.f126471a.a() : aVarB;
    }

    public long c() {
        Long l11 = this._byteLimitGet;
        if (l11 != null) {
            return l11.longValue();
        }
        b bVar = this.sourceConfig;
        Long lValueOf = bVar != null ? Long.valueOf(bVar.c()) : null;
        return lValueOf != null ? lValueOf.longValue() : z10.d.f126471a.b();
    }

    public long d() {
        Long l11 = this._byteLimitPost;
        if (l11 != null) {
            return l11.longValue();
        }
        b bVar = this.sourceConfig;
        Long lValueOf = bVar != null ? Long.valueOf(bVar.d()) : null;
        return lValueOf != null ? lValueOf.longValue() : z10.d.f126471a.c();
    }

    public Map<Integer, Boolean> e() {
        Map<Integer, Boolean> map = this._customRetryForStatusCodes;
        if (map != null) {
            return map;
        }
        b bVar = this.sourceConfig;
        if (bVar != null) {
            return bVar.e();
        }
        return null;
    }

    public int f() {
        Integer num = this._emitRange;
        if (num != null) {
            return num.intValue();
        }
        b bVar = this.sourceConfig;
        Integer numValueOf = bVar != null ? Integer.valueOf(bVar.f()) : null;
        return numValueOf != null ? numValueOf.intValue() : z10.d.f126471a.d();
    }

    public m20.c g() {
        m20.c cVar = this._eventStore;
        if (cVar != null) {
            return cVar;
        }
        b bVar = this.sourceConfig;
        if (bVar != null) {
            return bVar.g();
        }
        return null;
    }

    public long h() {
        io0.b bVar = this._maxEventStoreAge;
        if (bVar != null) {
            return bVar.getRawValue();
        }
        b bVar2 = this.sourceConfig;
        io0.b bVarF = bVar2 != null ? io0.b.f(bVar2.h()) : null;
        return bVarF != null ? bVarF.getRawValue() : z10.d.f126471a.j();
    }

    public long i() {
        Long l11 = this._maxEventStoreSize;
        if (l11 != null) {
            return l11.longValue();
        }
        b bVar = this.sourceConfig;
        Long lValueOf = bVar != null ? Long.valueOf(bVar.i()) : null;
        return lValueOf != null ? lValueOf.longValue() : z10.d.f126471a.k();
    }

    public q20.i j() {
        b bVar = this.sourceConfig;
        if (bVar != null) {
            bVar.j();
        }
        return null;
    }

    public boolean k() {
        Boolean bool = this._retryFailedRequests;
        if (bool != null) {
            return bool.booleanValue();
        }
        b bVar = this.sourceConfig;
        Boolean boolValueOf = bVar != null ? Boolean.valueOf(bVar.k()) : null;
        return boolValueOf != null ? boolValueOf.booleanValue() : z10.d.f126471a.l();
    }

    public boolean l() {
        Boolean bool = this._serverAnonymisation;
        if (bool != null) {
            return bool.booleanValue();
        }
        b bVar = this.sourceConfig;
        Boolean boolValueOf = bVar != null ? Boolean.valueOf(bVar.l()) : null;
        return boolValueOf != null ? boolValueOf.booleanValue() : z10.d.f126471a.m();
    }

    public int m() {
        Integer num = this._threadPoolSize;
        if (num != null) {
            return num.intValue();
        }
        b bVar = this.sourceConfig;
        Integer numValueOf = bVar != null ? Integer.valueOf(bVar.m()) : null;
        return numValueOf != null ? numValueOf.intValue() : z10.d.f126471a.n();
    }

    public final boolean n() {
        Boolean bool = this._isPaused;
        if (bool != null) {
            return bool.booleanValue();
        }
        b bVar = this.sourceConfig;
        Boolean boolValueOf = bVar != null ? Boolean.valueOf(bVar.n()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public void o(m20.a value) {
        s.k(value, "value");
        this._bufferOption = value;
    }

    public final void p(b bVar) {
        this.sourceConfig = bVar;
    }
}
