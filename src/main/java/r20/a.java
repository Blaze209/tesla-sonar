package r20;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u00020\u00052\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH&¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0010\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lr20/a;", "", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;)V", "", "map", "c", "(Ljava/util/Map;)V", "", "base64_encoded", "type_encoded", "type_no_encoded", "a", "(Ljava/util/Map;ZLjava/lang/String;Ljava/lang/String;)V", "getMap", "()Ljava/util/Map;", "", "b", "()J", "byteSize", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface a {
    void a(Map<?, ?> map, boolean base64_encoded, String type_encoded, String type_no_encoded);

    long b();

    void c(Map<String, ? extends Object> map);

    void d(String key, String value);

    Map<String, Object> getMap();
}
