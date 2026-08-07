package j$.time.temporal;

import j$.time.LocalDate;

/* JADX INFO: loaded from: classes2.dex */
public interface l extends TemporalAccessor {
    l d(long j11, p pVar);

    /* JADX INFO: renamed from: f */
    l k(LocalDate localDate);

    l g(long j11, r rVar);

    default l a(long j11, r rVar) {
        return j11 == Long.MIN_VALUE ? g(Long.MAX_VALUE, rVar).g(1L, rVar) : g(-j11, rVar);
    }
}
