package pa0;

import cc0.f;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lpa0/d;", "", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "()V", "Lpa0/a;", "destination", "c", "(Lpa0/a;)V", "Lcc0/d;", "eventName", "a", "(Lcc0/d;)V", "", "Lcc0/f;", "parameters", "b", "(Lcc0/d;Ljava/util/List;)V", "analytics_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface d {
    void a(cc0.d eventName);

    void b(cc0.d eventName, List<f> parameters);

    void c(a destination);

    void d();
}
