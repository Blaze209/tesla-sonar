package d20;

import h20.j;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ld20/a;", "Lx10/a;", "", "Lh20/j;", "serviceProvider", "<init>", "(Lh20/j;)V", "", "", "b", "Ljava/util/Map;", "mediaTrackings", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends x10.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Map<String, Object> mediaTrackings;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j serviceProvider) {
        super(serviceProvider);
        s.k(serviceProvider, "serviceProvider");
        this.mediaTrackings = new LinkedHashMap();
    }
}
