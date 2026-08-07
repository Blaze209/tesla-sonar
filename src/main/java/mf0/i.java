package mf0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;
import vc0.q0;
import vc0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH&¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020!H&¢\u0006\u0004\b\u0018\u0010\"J\u000f\u0010#\u001a\u00020\u0004H&¢\u0006\u0004\b#\u0010\u000f¨\u0006$"}, d2 = {"Lmf0/i;", "", "Lvc0/q0;", "request", "Ljn0/h0;", "b", "(Lvc0/q0;)V", "", "", "sessionIds", "Lmf0/j;", AnalyticsAttribute.Reason, DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;Lmf0/j;)V", "h", "()V", "Lvc0/u0;", "firaSessionRequest", "", "resetRangingStart", "g", "(Lvc0/u0;Z)V", "sessionId", "Lkf0/a;", "e", "a", "(ILkf0/a;)V", "c", "(Ljava/util/List;)V", "Lkotlinx/coroutines/flow/Flow;", "Llf0/b;", "f", "()Lkotlinx/coroutines/flow/Flow;", "", "(ILjava/lang/Throwable;)V", "clear", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface i {
    void a(int sessionId, kf0.a e11);

    void b(q0 request);

    void c(List<Integer> sessionIds);

    void clear();

    void d(List<Integer> sessionIds, j reason);

    void e(int sessionId, Throwable e11);

    Flow<lf0.b> f();

    void g(u0 firaSessionRequest, boolean resetRangingStart);

    void h();
}
