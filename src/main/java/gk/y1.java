package gk;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public final class y1 extends p013kotlin.jvm.internal.u implements wn0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y1 f69165c = new y1();

    public y1() {
        super(0);
    }

    @Override // wn0.a
    public final Object invoke() {
        return vo0.a0.a("com.dlocal.direct.internal.analytics.LogEventType", e.values(), new String[]{AnalyticsAttribute.Error, "http_call"}, new Annotation[][]{null, null}, null);
    }
}
