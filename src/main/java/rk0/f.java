package rk0;

import java.net.Proxy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u0014\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lrk0/f;", "", "<init>", "()V", "", "a", "I", "getThreadsCount", "()I", "setThreadsCount", "(I)V", "getThreadsCount$annotations", "threadsCount", "Ljava/net/Proxy;", "Lio/ktor/client/engine/ProxyConfig;", "b", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "setProxy", "(Ljava/net/Proxy;)V", "proxy", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int threadsCount = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Proxy proxy;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }
}
