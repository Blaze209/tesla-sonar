package io.ktor.client.plugins;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.network.sockets.SocketTimeoutException;
import org.slf4j.Logger;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wk0.HttpRequestData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\"\u0018\u0010\u0011\u001a\u00060\u000ej\u0002`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lwk0/d;", "request", "", "cause", "Lio/ktor/client/network/sockets/ConnectTimeoutException;", "a", "(Lwk0/d;Ljava/lang/Throwable;)Lio/ktor/client/network/sockets/ConnectTimeoutException;", "Lio/ktor/client/network/sockets/SocketTimeoutException;", "b", "(Lwk0/d;Ljava/lang/Throwable;)Lio/ktor/client/network/sockets/SocketTimeoutException;", "", "timeout", DateTokenConverter.CONVERTER_KEY, "(J)J", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "Lorg/slf4j/Logger;", "LOGGER", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f78514a = gl0.a.a("io.ktor.client.plugins.HttpTimeout");

    public static final ConnectTimeoutException a(HttpRequestData request, Throwable th2) {
        Object objC;
        s.k(request, "request");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connect timeout has expired [url=");
        sb2.append(request.getUrl());
        sb2.append(", connect_timeout=");
        f.a aVar = (f.a) request.c(f.f78494d);
        if (aVar == null || (objC = aVar.c()) == null) {
            objC = "unknown";
        }
        sb2.append(objC);
        sb2.append(" ms]");
        return new ConnectTimeoutException(sb2.toString(), th2);
    }

    public static final SocketTimeoutException b(HttpRequestData request, Throwable th2) {
        Object objE;
        s.k(request, "request");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Socket timeout has expired [url=");
        sb2.append(request.getUrl());
        sb2.append(", socket_timeout=");
        f.a aVar = (f.a) request.c(f.f78494d);
        if (aVar == null || (objE = aVar.e()) == null) {
            objE = "unknown";
        }
        sb2.append(objE);
        sb2.append("] ms");
        return new SocketTimeoutException(sb2.toString(), th2);
    }

    public static final long d(long j11) {
        if (j11 == Long.MAX_VALUE) {
            return 0L;
        }
        return j11;
    }
}
