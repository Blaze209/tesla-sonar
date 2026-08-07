package pg0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0015\u0010\f\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0015\u0010\u0010\u001a\u00020\r*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lpg0/q;", "Lpg0/d4$e;", "side", "Lpg0/d4$c;", DateTokenConverter.CONVERTER_KEY, "(Lpg0/q;Lpg0/d4$e;)Lpg0/d4$c;", "Lpg0/d4;", "c", "(Lpg0/q;)Lpg0/d4;", "", "b", "(Lpg0/q;)Ljava/lang/String;", "idClassKey", "Lwg0/e;", "a", "(Lpg0/q;)Lwg0/e;", "idClass", "government-id_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class r {
    public static final wg0.e a(q qVar) {
        p013kotlin.jvm.internal.s.k(qVar, "<this>");
        if (qVar instanceof q.AutoClassifyConfig) {
            return wg0.e.Unknown;
        }
        if (qVar instanceof q.IdCaptureConfig) {
            return ((q.IdCaptureConfig) qVar).getId().getType();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String b(q qVar) {
        p013kotlin.jvm.internal.s.k(qVar, "<this>");
        if (qVar instanceof q.AutoClassifyConfig) {
            return wg0.e.KeyAutoClassification;
        }
        if (qVar instanceof q.IdCaptureConfig) {
            return ((q.IdCaptureConfig) qVar).getId().getIdClassKey();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final IdConfig c(q qVar) {
        p013kotlin.jvm.internal.s.k(qVar, "<this>");
        if (qVar instanceof q.AutoClassifyConfig) {
            return null;
        }
        if (qVar instanceof q.IdCaptureConfig) {
            return ((q.IdCaptureConfig) qVar).getId();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final IdConfig.IdSideConfig d(q qVar, IdConfig.e side) {
        p013kotlin.jvm.internal.s.k(qVar, "<this>");
        p013kotlin.jvm.internal.s.k(side, "side");
        if (qVar instanceof q.AutoClassifyConfig) {
            return ((q.AutoClassifyConfig) qVar).getConfig().getIdSideConfig();
        }
        if (qVar instanceof q.IdCaptureConfig) {
            return ((q.IdCaptureConfig) qVar).getId().c(side);
        }
        throw new NoWhenBranchMatchedException();
    }
}
