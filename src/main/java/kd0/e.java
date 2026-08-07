package kd0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import nc0.l;
import p013kotlin.Metadata;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000 %2\u00020\u0001:\u0001%J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\rH&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u001dH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u0006H&¢\u0006\u0004\b%\u0010&J-\u0010(\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b(\u0010)J-\u0010*\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b*\u0010)J\u0017\u0010,\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u000bH&¢\u0006\u0004\b,\u0010!¨\u0006-"}, d2 = {"Lkd0/e;", "", "", ImagesContract.URL, "Lnc0/e;", "method", "", "requestPayloadSize", "Lkd0/f;", "c", "(Ljava/lang/String;Lnc0/e;J)Lkd0/f;", "Lnc0/l;", "trace", "", "Lkd0/a;", "attributes", "Lkd0/i;", "h", "(Lnc0/l;Ljava/util/List;)Lkd0/i;", "Ljn0/h0;", "l", "(Lnc0/l;Ljava/util/List;)V", "Lnc0/i;", "metrics", "k", "(Lnc0/l;Ljava/util/List;Ljava/util/List;)V", "Lnc0/g;", DateTokenConverter.CONVERTER_KEY, "(Lnc0/g;)V", "Lnc0/f;", IntegerTokenConverter.CONVERTER_KEY, "(Lnc0/f;)V", "e", "(Lnc0/l;)V", "Lnc0/h;", "metric", "value", "a", "(Lnc0/h;J)V", "forVIN", "j", "(Lnc0/l;Ljava/lang/String;Ljava/util/List;)V", "b", "matching", "g", "monitoring_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f85941a;

    /* JADX INFO: renamed from: kd0.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkd0/e$a;", "", "<init>", "()V", "Lkd0/e;", "a", "()Lkd0/e;", "monitoring_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f85941a = new Companion();

        private Companion() {
        }

        public final e a() {
            return g.INSTANCE.a();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public static /* synthetic */ void a(e eVar, nc0.h hVar, long j11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementMetricForActiveTraces");
            }
            if ((i11 & 2) != 0) {
                j11 = 1;
            }
            eVar.a(hVar, j11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void b(e eVar, l lVar, List list, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTrace");
            }
            if ((i11 & 2) != 0) {
                list = v.m();
            }
            eVar.l(lVar, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ i c(e eVar, l lVar, List list, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTraceWithToken");
            }
            if ((i11 & 2) != 0) {
                list = v.m();
            }
            return eVar.h(lVar, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void d(e eVar, l lVar, List list, List list2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopTrace");
            }
            if ((i11 & 2) != 0) {
                list = v.m();
            }
            if ((i11 & 4) != 0) {
                list2 = v.m();
            }
            eVar.k(lVar, list, list2);
        }
    }

    static e f() {
        return INSTANCE.a();
    }

    void a(nc0.h metric, long value);

    void b(l trace, String forVIN, List<a> attributes);

    f c(String url, nc0.e method, long requestPayloadSize);

    void d(nc0.g trace);

    void e(l trace);

    void g(l matching);

    i h(l trace, List<a> attributes);

    void i(nc0.f trace);

    void j(l trace, String forVIN, List<a> attributes);

    void k(l trace, List<a> attributes, List<nc0.i> metrics);

    void l(l trace, List<a> attributes);
}
