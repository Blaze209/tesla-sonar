package lb;

import androidx.work.WorkerParameters;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Llb/a1;", "", "Llb/x;", "workSpecId", "Ljn0/h0;", "b", "(Llb/x;)V", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "c", "(Llb/x;Landroidx/work/WorkerParameters$a;)V", "e", "", AnalyticsAttribute.Reason, DateTokenConverter.CONVERTER_KEY, "(Llb/x;I)V", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a1 {
    default void a(x workSpecId, int reason) {
        p013kotlin.jvm.internal.s.k(workSpecId, "workSpecId");
        d(workSpecId, reason);
    }

    default void b(x workSpecId) {
        p013kotlin.jvm.internal.s.k(workSpecId, "workSpecId");
        c(workSpecId, null);
    }

    void c(x workSpecId, WorkerParameters.a runtimeExtras);

    void d(x workSpecId, int reason);

    default void e(x workSpecId) {
        p013kotlin.jvm.internal.s.k(workSpecId, "workSpecId");
        d(workSpecId, -512);
    }
}
