package mw;

import androidx.annotation.NonNull;
import com.google.firebase.perf.v1.TraceMetric;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class d extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kw.a f92528c = kw.a.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TraceMetric f92529b;

    d(@NonNull TraceMetric traceMetric) {
        this.f92529b = traceMetric;
    }

    private boolean g(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                e.d(entry.getKey(), entry.getValue());
            } catch (IllegalArgumentException e11) {
                f92528c.j(e11.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    private boolean h(@NonNull TraceMetric traceMetric) {
        return i(traceMetric, 0);
    }

    private boolean i(TraceMetric traceMetric, int i11) {
        if (traceMetric == null) {
            return false;
        }
        if (i11 > 1) {
            f92528c.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry<String, Long> entry : traceMetric.getCountersMap().entrySet()) {
            if (!l(entry.getKey())) {
                f92528c.j("invalid CounterId:" + entry.getKey());
                return false;
            }
            if (!m(entry.getValue())) {
                f92528c.j("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        Iterator<TraceMetric> it = traceMetric.getSubtracesList().iterator();
        while (it.hasNext()) {
            if (!i(it.next(), i11 + 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean j(@NonNull TraceMetric traceMetric) {
        if (traceMetric.getCountersCount() > 0) {
            return true;
        }
        Iterator<TraceMetric> it = traceMetric.getSubtracesList().iterator();
        while (it.hasNext()) {
            if (it.next().getCountersCount() > 0) {
                return true;
            }
        }
        return false;
    }

    private boolean k(@NonNull TraceMetric traceMetric) {
        return traceMetric.getName().startsWith("_st_");
    }

    private boolean l(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            f92528c.j("counterId is empty");
            return false;
        }
        if (strTrim.length() <= 100) {
            return true;
        }
        f92528c.j("counterId exceeded max length 100");
        return false;
    }

    private boolean m(Long l11) {
        return l11 != null;
    }

    private boolean n(@NonNull TraceMetric traceMetric) {
        Long l11 = traceMetric.getCountersMap().get(com.google.firebase.perf.util.b.FRAMES_TOTAL.toString());
        return l11 != null && l11.compareTo((Long) 0L) > 0;
    }

    private boolean o(TraceMetric traceMetric, int i11) {
        if (traceMetric == null) {
            f92528c.j("TraceMetric is null");
            return false;
        }
        if (i11 > 1) {
            f92528c.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        if (!q(traceMetric.getName())) {
            f92528c.j("invalid TraceId:" + traceMetric.getName());
            return false;
        }
        if (!p(traceMetric)) {
            f92528c.j("invalid TraceDuration:" + traceMetric.getDurationUs());
            return false;
        }
        if (!traceMetric.hasClientStartTimeUs()) {
            f92528c.j("clientStartTimeUs is null.");
            return false;
        }
        if (!k(traceMetric) || n(traceMetric)) {
            Iterator<TraceMetric> it = traceMetric.getSubtracesList().iterator();
            while (it.hasNext()) {
                if (!o(it.next(), i11 + 1)) {
                    return false;
                }
            }
            return g(traceMetric.getCustomAttributesMap());
        }
        f92528c.j("non-positive totalFrames in screen trace " + traceMetric.getName());
        return false;
    }

    private boolean p(TraceMetric traceMetric) {
        return traceMetric != null && traceMetric.getDurationUs() > 0;
    }

    private boolean q(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        return !strTrim.isEmpty() && strTrim.length() <= 100;
    }

    @Override // mw.e
    public boolean c() {
        if (!o(this.f92529b, 0)) {
            f92528c.j("Invalid Trace:" + this.f92529b.getName());
            return false;
        }
        if (!j(this.f92529b) || h(this.f92529b)) {
            return true;
        }
        f92528c.j("Invalid Counters for Trace:" + this.f92529b.getName());
        return false;
    }
}
