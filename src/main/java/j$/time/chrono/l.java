package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public interface l extends Comparable {
    ChronoLocalDate C(TemporalAccessor temporalAccessor);

    ChronoLocalDate G();

    ChronoLocalDate K(int i11, int i12, int i13);

    ChronoLocalDate M(Map map, j$.time.format.c0 c0Var);

    i N(Instant instant, ZoneId zoneId);

    boolean Q(long j11);

    boolean equals(Object obj);

    int hashCode();

    ChronoLocalDate l(long j11);

    String m();

    String p();

    ChronoLocalDate q(int i11, int i12);

    String toString();

    j$.time.temporal.t u(j$.time.temporal.a aVar);

    List v();

    m x(int i11);

    int y(m mVar, int i11);

    static l n(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        l lVar = (l) temporalAccessor.b(j$.time.temporal.q.f82215b);
        s sVar = s.f82037c;
        if (lVar != null) {
            return lVar;
        }
        Objects.requireNonNull(sVar, "defaultObj");
        return sVar;
    }

    static l of(String str) {
        ConcurrentHashMap concurrentHashMap = a.f81993a;
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = a.f81993a;
            l lVar = (l) concurrentHashMap2.get(str);
            if (lVar == null) {
                lVar = (l) a.f81994b.get(str);
            }
            if (lVar != null) {
                return lVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                for (l lVar2 : ServiceLoader.load(l.class)) {
                    if (str.equals(lVar2.m()) || str.equals(lVar2.p())) {
                        return lVar2;
                    }
                }
                throw new DateTimeException("Unknown chronology: ".concat(str));
            }
            o oVar = o.f82021l;
            oVar.getClass();
            a.w(oVar, "Hijrah-umalqura");
            v vVar = v.f82040c;
            vVar.getClass();
            a.w(vVar, "Japanese");
            a0 a0Var = a0.f81995c;
            a0Var.getClass();
            a.w(a0Var, "Minguo");
            g0 g0Var = g0.f82011c;
            g0Var.getClass();
            a.w(g0Var, "ThaiBuddhist");
            try {
                for (a aVar : Arrays.asList(new a[0])) {
                    if (!aVar.m().equals("ISO")) {
                        a.w(aVar, aVar.m());
                    }
                }
                s sVar = s.f82037c;
                sVar.getClass();
                a.w(sVar, "ISO");
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
    }

    default d D(LocalDateTime localDateTime) {
        try {
            return C(localDateTime).F(LocalTime.w(localDateTime));
        } catch (DateTimeException e11) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e11);
        }
    }
}
