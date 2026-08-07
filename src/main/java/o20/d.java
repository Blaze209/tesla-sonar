package o20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.HashMap;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lo20/d;", "Lo20/c;", "<init>", "()V", "", "backgroundIndex", "g", "(Ljava/lang/Integer;)Lo20/d;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "setBackgroundIndex", "(Ljava/lang/Integer;)V", "", "f", "()Ljava/lang/String;", "schema", "", "", "b", "()Ljava/util/Map;", "dataPayload", "e", "a", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Integer backgroundIndex;

    @Override // o20.f
    public Map<String, Object> b() {
        HashMap map = new HashMap();
        Integer num = this.backgroundIndex;
        if (num != null) {
            map.put("backgroundIndex", Integer.valueOf(num.intValue()));
        }
        return map;
    }

    @Override // o20.c
    public String f() {
        return "iglu:com.snowplowanalytics.snowplow/application_background/jsonschema/1-0-0";
    }

    public final d g(Integer backgroundIndex) {
        this.backgroundIndex = backgroundIndex;
        return this;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getBackgroundIndex() {
        return this.backgroundIndex;
    }
}
