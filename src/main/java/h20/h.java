package h20;

import android.content.Context;
import android.net.NetworkInfo;
import android.util.Pair;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import s20.PlatformContextRetriever;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 42\u00020\u0001:\u0001%BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010!\u001a\u00020\u0018¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010+R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010.R\u0016\u00101\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00100R\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0016\u00103\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010&¨\u00065"}, d2 = {"Lh20/h;", "", "", "platformDictUpdateFrequency", "networkDictUpdateFrequency", "Li20/a;", "deviceInfoMonitor", "", "Lk20/f;", "properties", "Ls20/e;", "retriever", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(JJLi20/a;Ljava/util/List;Ls20/e;Landroid/content/Context;)V", "Ljn0/h0;", "j", "()V", "h", "g", "f", "e", "property", "", IntegerTokenConverter.CONVERTER_KEY, "(Lk20/f;)Z", "T", "Lkotlin/Function0;", "f1", "f2", "c", "(Lwn0/a;Lwn0/a;)Ljava/lang/Object;", "userAnonymisation", "Lr20/b;", DateTokenConverter.CONVERTER_KEY, "(Z)Lr20/b;", "a", "J", "b", "Li20/a;", "Ljava/util/List;", "Ls20/e;", "Landroid/content/Context;", "", "", "Ljava/util/Map;", "pairs", "Z", "initializedPlatformDict", "lastUpdatedEphemeralPlatformDict", "lastUpdatedEphemeralNetworkDict", "k", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f70426l = h.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long platformDictUpdateFrequency;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long networkDictUpdateFrequency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i20.a deviceInfoMonitor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<k20.f> properties;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final PlatformContextRetriever retriever;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> pairs;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean initializedPlatformDict;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long lastUpdatedEphemeralPlatformDict;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long lastUpdatedEphemeralNetworkDict;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Pair<String, String> f70437c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Pair<String, String> pair) {
            super(0);
            this.f70437c = pair;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            Pair<String, String> pair = this.f70437c;
            if (pair != null) {
                return (String) pair.first;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Pair<String, String> f70438c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Pair<String, String> pair) {
            super(0);
            this.f70438c = pair;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            Pair<String, String> pair = this.f70438c;
            if (pair != null) {
                return (String) pair.second;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ NetworkInfo f70440d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(NetworkInfo networkInfo) {
            super(0);
            this.f70440d = networkInfo;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return h.this.deviceInfoMonitor.m(this.f70440d);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ NetworkInfo f70442d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(NetworkInfo networkInfo) {
            super(0);
            this.f70442d = networkInfo;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return h.this.deviceInfoMonitor.l(this.f70442d);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Pair<String, Integer> f70443c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Pair<String, Integer> pair) {
            super(0);
            this.f70443c = pair;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            Pair<String, Integer> pair = this.f70443c;
            if (pair != null) {
                return (String) pair.first;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.a<Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Pair<String, Integer> f70444c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Pair<String, Integer> pair) {
            super(0);
            this.f70444c = pair;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            Pair<String, Integer> pair = this.f70444c;
            if (pair != null) {
                return (Integer) pair.second;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: h20.h$h, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    static final class C1461h extends p013kotlin.jvm.internal.u implements wn0.a<Long> {
        C1461h() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(h.this.deviceInfoMonitor.s(h.this.context));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.a<Long> {
        i() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(h.this.deviceInfoMonitor.c());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class j extends p013kotlin.jvm.internal.u implements wn0.a<Boolean> {
        j() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return h.this.deviceInfoMonitor.h(h.this.context);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class k extends p013kotlin.jvm.internal.u implements wn0.a<String> {
        k() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return h.this.deviceInfoMonitor.i();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class l extends p013kotlin.jvm.internal.u implements wn0.a<String> {
        l() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return h.this.deviceInfoMonitor.a(h.this.context);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class m extends p013kotlin.jvm.internal.u implements wn0.a<String> {
        m() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return h.this.deviceInfoMonitor.n();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class n extends p013kotlin.jvm.internal.u implements wn0.a<String> {
        n() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return h.this.deviceInfoMonitor.o();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class o extends p013kotlin.jvm.internal.u implements wn0.a<String> {
        o() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return h.this.deviceInfoMonitor.f();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class p extends p013kotlin.jvm.internal.u implements wn0.a<String> {
        p() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return h.this.deviceInfoMonitor.g();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class q extends p013kotlin.jvm.internal.u implements wn0.a<String> {
        q() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return h.this.deviceInfoMonitor.e(h.this.context);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    static final class r extends p013kotlin.jvm.internal.u implements wn0.a<Long> {
        r() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(h.this.deviceInfoMonitor.p(h.this.context));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    static final class s extends p013kotlin.jvm.internal.u implements wn0.a<Long> {
        s() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(h.this.deviceInfoMonitor.t());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class t extends p013kotlin.jvm.internal.u implements wn0.a<String> {
        t() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return h.this.deviceInfoMonitor.q(h.this.context);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class u extends p013kotlin.jvm.internal.u implements wn0.a<Float> {
        u() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return h.this.deviceInfoMonitor.r(h.this.context);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(long j11, long j12, i20.a deviceInfoMonitor, List<? extends k20.f> list, PlatformContextRetriever retriever, Context context) {
        p013kotlin.jvm.internal.s.k(deviceInfoMonitor, "deviceInfoMonitor");
        p013kotlin.jvm.internal.s.k(retriever, "retriever");
        p013kotlin.jvm.internal.s.k(context, "context");
        this.platformDictUpdateFrequency = j11;
        this.networkDictUpdateFrequency = j12;
        this.deviceInfoMonitor = deviceInfoMonitor;
        this.properties = list;
        this.retriever = retriever;
        this.context = context;
        this.pairs = new HashMap();
    }

    private final <T> T c(wn0.a<? extends T> f11, wn0.a<? extends T> f12) {
        return f11 == null ? f12.invoke() : f11.invoke();
    }

    private final void e() {
        boolean zI = i(k20.f.APP_SET_ID);
        boolean zI2 = i(k20.f.APP_SET_ID_SCOPE);
        if (zI || zI2) {
            if (this.retriever.b() == null || this.retriever.c() == null) {
                Pair<String, String> pairB = this.deviceInfoMonitor.b(this.context);
                if (zI) {
                    i20.c.a("appSetId", (String) c(this.retriever.b(), new b(pairB)), this.pairs);
                }
                if (zI2) {
                    i20.c.a("appSetIdScope", (String) c(this.retriever.c(), new c(pairB)), this.pairs);
                    return;
                }
                return;
            }
            if (zI) {
                wn0.a<String> aVarB = this.retriever.b();
                i20.c.a("appSetId", aVarB != null ? aVarB.invoke() : null, this.pairs);
            }
            if (zI2) {
                wn0.a<String> aVarC = this.retriever.c();
                i20.c.a("appSetIdScope", aVarC != null ? aVarC.invoke() : null, this.pairs);
            }
        }
    }

    private final void f() {
        this.lastUpdatedEphemeralNetworkDict = System.currentTimeMillis();
        boolean zI = i(k20.f.NETWORK_TYPE);
        boolean zI2 = i(k20.f.NETWORK_TECHNOLOGY);
        if (zI || zI2) {
            NetworkInfo networkInfoK = this.deviceInfoMonitor.k(this.context);
            if (zI) {
                i20.c.a("networkType", c(this.retriever.l(), new d(networkInfoK)), this.pairs);
            }
            if (zI2) {
                i20.c.a("networkTechnology", c(this.retriever.k(), new e(networkInfoK)), this.pairs);
            }
        }
    }

    private final void g() {
        this.lastUpdatedEphemeralPlatformDict = System.currentTimeMillis();
        boolean zI = i(k20.f.BATTERY_STATE);
        boolean zI2 = i(k20.f.BATTERY_LEVEL);
        if (zI || zI2) {
            Pair<String, Integer> pairD = this.deviceInfoMonitor.d(this.context);
            if (zI) {
                i20.c.a("batteryState", c(this.retriever.f(), new f(pairD)), this.pairs);
            }
            if (zI2) {
                i20.c.a("batteryLevel", c(this.retriever.e(), new g(pairD)), this.pairs);
            }
        }
        if (i(k20.f.SYSTEM_AVAILABLE_MEMORY)) {
            i20.c.a("systemAvailableMemory", c(this.retriever.r(), new C1461h()), this.pairs);
        }
        if (i(k20.f.AVAILABLE_STORAGE)) {
            i20.c.a("availableStorage", c(this.retriever.d(), new i()), this.pairs);
        }
        if (i(k20.f.IS_PORTRAIT)) {
            i20.c.a("isPortrait", c(this.retriever.t(), new j()), this.pairs);
        }
    }

    private final void h() {
        i20.c.a("osType", c(this.retriever.m(), new m()), this.pairs);
        i20.c.a("osVersion", c(this.retriever.n(), new n()), this.pairs);
        i20.c.a("deviceModel", c(this.retriever.h(), new o()), this.pairs);
        i20.c.a("deviceManufacturer", c(this.retriever.i(), new p()), this.pairs);
        if (i(k20.f.CARRIER)) {
            i20.c.a("carrier", c(this.retriever.g(), new q()), this.pairs);
        }
        if (i(k20.f.PHYSICAL_MEMORY)) {
            i20.c.a("physicalMemory", c(this.retriever.o(), new r()), this.pairs);
        }
        if (i(k20.f.TOTAL_STORAGE)) {
            i20.c.a("totalStorage", c(this.retriever.s(), new s()), this.pairs);
        }
        if (i(k20.f.RESOLUTION)) {
            i20.c.a("resolution", c(this.retriever.p(), new t()), this.pairs);
        }
        if (i(k20.f.SCALE)) {
            i20.c.a("scale", c(this.retriever.q(), new u()), this.pairs);
        }
        if (i(k20.f.LANGUAGE)) {
            String str = (String) c(this.retriever.j(), new k());
            i20.c.a("language", str != null ? p013kotlin.text.t.T1(str, 8) : null, this.pairs);
        }
        if (i(k20.f.ANDROID_IDFA)) {
            i20.c.a("androidIdfa", c(this.retriever.a(), new l()), this.pairs);
        }
        e();
        this.initializedPlatformDict = true;
    }

    private final boolean i(k20.f property) {
        List<k20.f> list = this.properties;
        if (list != null) {
            return list.contains(property);
        }
        return true;
    }

    private final synchronized void j() {
        try {
            if (!this.initializedPlatformDict) {
                h();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.lastUpdatedEphemeralPlatformDict >= this.platformDictUpdateFrequency) {
                g();
            }
            if (jCurrentTimeMillis - this.lastUpdatedEphemeralNetworkDict >= this.networkDictUpdateFrequency) {
                f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final r20.b d(boolean userAnonymisation) {
        j();
        if (!i20.c.l(this.pairs, "osType", "osVersion", "deviceManufacturer", "deviceModel")) {
            return null;
        }
        if (!userAnonymisation || !this.pairs.containsKey("androidIdfa")) {
            return new r20.b("iglu:com.snowplowanalytics.snowplow/mobile_context/jsonschema/1-0-3", this.pairs);
        }
        HashMap map = new HashMap(this.pairs);
        map.remove("androidIdfa");
        return new r20.b("iglu:com.snowplowanalytics.snowplow/mobile_context/jsonschema/1-0-3", map);
    }

    public /* synthetic */ h(long j11, long j12, i20.a aVar, List list, PlatformContextRetriever platformContextRetriever, Context context, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 1000L : j11, (i11 & 2) != 0 ? 10000L : j12, (i11 & 4) != 0 ? new i20.a() : aVar, (i11 & 8) != 0 ? null : list, (i11 & 16) != 0 ? new PlatformContextRetriever(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null) : platformContextRetriever, context);
    }
}
