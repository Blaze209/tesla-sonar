package h20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.UUID;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lh20/p;", "Lx10/a;", "Ll20/a;", "Lh20/j;", "serviceProvider", "<init>", "(Lh20/j;)V", "Lo20/f;", "event", "Ljava/util/UUID;", "a", "(Lo20/f;)Ljava/util/UUID;", "", "b", "Ljava/lang/String;", "crossDeviceQueryParameterKey", "Lh20/o;", DateTokenConverter.CONVERTER_KEY, "()Lh20/o;", "tracker", "Ls20/d;", "loggerDelegate", "c", "()Ls20/d;", "setLoggerDelegate", "(Ls20/d;)V", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p extends x10.a implements l20.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f70528d = p.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String crossDeviceQueryParameterKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(j serviceProvider) {
        super(serviceProvider);
        s.k(serviceProvider, "serviceProvider");
        this.crossDeviceQueryParameterKey = "_sp";
    }

    private final o d() {
        s20.d dVarC;
        if (!getServiceProvider().b() && (dVarC = c()) != null) {
            String TAG = f70528d;
            s.j(TAG, "TAG");
            dVarC.c(TAG, "Recreating tracker instance after it was removed. This will not be supported in future versions.");
        }
        return getServiceProvider().a();
    }

    @Override // l20.a
    public UUID a(o20.f event) {
        s.k(event, "event");
        return d().X(event);
    }

    public s20.d c() {
        return g.f70421a.c();
    }
}
