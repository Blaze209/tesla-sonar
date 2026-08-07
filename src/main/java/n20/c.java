package n20;

import java.util.HashMap;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR0\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Ln20/c;", "Lr20/b;", "", "isVisible", "<init>", "(Z)V", "", "index", "e", "(Ljava/lang/Integer;)Ln20/c;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "b", "Ljava/util/HashMap;", "parameters", "c", "a", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends r20.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final HashMap<String, Object> parameters;

    public c(boolean z11) {
        super("iglu:com.snowplowanalytics.mobile/application_lifecycle/jsonschema/1-0-0");
        HashMap<String, Object> map = new HashMap<>();
        this.parameters = map;
        map.put("isVisible", Boolean.valueOf(z11));
        b(map);
    }

    public final c e(Integer index) {
        if (index != null) {
            this.parameters.put("index", Integer.valueOf(index.intValue()));
        }
        b(this.parameters);
        return this;
    }
}
