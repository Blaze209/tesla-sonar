package kd0;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkd0/i;", "", "", "metricName", "", "value", "Ljn0/h0;", "b", "(Ljava/lang/String;J)V", "", "Lkd0/a;", "attributes", "a", "(Ljava/util/List;)V", "monitoring_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface i {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void a(i iVar, List list, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stop");
            }
            if ((i11 & 1) != 0) {
                list = v.m();
            }
            iVar.a(list);
        }
    }

    void a(List<kd0.a> attributes);

    void b(String metricName, long value);
}
