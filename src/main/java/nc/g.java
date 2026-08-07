package nc;

import ec.Extras;
import p013kotlin.Metadata;
import rc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0003\"\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0003\"\u0015\u0010\r\u001a\u00020\u0001*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\f\"\u0015\u0010\u000f\u001a\u00020\u0005*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000e\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\b*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0010¨\u0006\u0012"}, d2 = {"Lec/l$c;", "", "a", "Lec/l$c;", "httpMethodKey", "Lnc/m;", "b", "httpHeadersKey", "Lnc/o;", "c", "httpBodyKey", "Lrc/n;", "(Lrc/n;)Ljava/lang/String;", "httpMethod", "(Lrc/n;)Lnc/m;", "httpHeaders", "(Lrc/n;)Lnc/o;", "httpBody", "coil-network-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Extras.c<String> f93720a = new Extras.c<>("GET");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Extras.c<NetworkHeaders> f93721b = new Extras.c<>(NetworkHeaders.f93763c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Extras.c<o> f93722c = new Extras.c<>(null);

    public static final o a(Options options) {
        return (o) ec.m.b(options, f93722c);
    }

    public static final NetworkHeaders b(Options options) {
        return (NetworkHeaders) ec.m.b(options, f93721b);
    }

    public static final String c(Options options) {
        return (String) ec.m.b(options, f93720a);
    }
}
