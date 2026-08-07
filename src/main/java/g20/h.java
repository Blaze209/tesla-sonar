package g20;

import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lg20/h;", "Ls20/b;", "", "", "", StatusResponse.PAYLOAD, "", "a", "(Ljava/util/Map;)Z", "Lg20/m;", "getState", "()Lg20/m;", "state", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface h extends s20.b {
    boolean a(Map<String, ? extends Object> payload);

    m getState();
}
