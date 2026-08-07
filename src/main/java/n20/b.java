package n20;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR0\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Ln20/b;", "Lr20/b;", "", ImagesContract.URL, "<init>", "(Ljava/lang/String;)V", "referrer", "g", "(Ljava/lang/String;)Ln20/b;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "b", "Ljava/util/HashMap;", "parameters", "f", "()Ljava/lang/String;", "e", "c", "a", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b extends r20.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final HashMap<String, Object> parameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String url) {
        super("iglu:com.snowplowanalytics.mobile/deep_link/jsonschema/1-0-0");
        s.k(url, "url");
        HashMap<String, Object> map = new HashMap<>();
        this.parameters = map;
        map.put(ImagesContract.URL, url);
        b(map);
    }

    public final String e() {
        Object obj = this.parameters.get("referrer");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final String f() {
        Object obj = this.parameters.get(ImagesContract.URL);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final b g(String referrer) {
        if (referrer != null) {
            this.parameters.put("referrer", referrer);
        }
        b(this.parameters);
        return this;
    }
}
