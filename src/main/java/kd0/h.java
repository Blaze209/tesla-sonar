package kd0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import com.tesla.logging.TeslaLog;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Lkd0/h;", "Lkd0/f;", "Llw/g;", "metric", "", ImagesContract.URL, "method", "<init>", "(Llw/g;Ljava/lang/String;Ljava/lang/String;)V", "", "responseCode", "", "responseSize", "responseContentType", "Ljn0/h0;", "a", "(IJLjava/lang/String;)V", "Llw/g;", "b", "Ljava/lang/String;", "c", DateTokenConverter.CONVERTER_KEY, "monitoring_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final lw.g metric;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String method;

    public h(lw.g metric, String url, String method) {
        s.k(metric, "metric");
        s.k(url, "url");
        s.k(method, "method");
        this.metric = metric;
        this.url = url;
        this.method = method;
    }

    @Override // kd0.f
    public void a(int responseCode, long responseSize, String responseContentType) {
        lw.g gVar = this.metric;
        gVar.a(responseCode);
        gVar.d(responseSize);
        gVar.c(responseContentType);
        gVar.f();
        TeslaLog.INSTANCE.i("NetworkTrace", "Network trace stopped for " + this.url + " " + this.method);
    }
}
