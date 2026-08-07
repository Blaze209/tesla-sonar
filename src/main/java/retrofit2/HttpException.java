package retrofit2;

import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class HttpException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f107862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f107863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient y<?> f107864c;

    public HttpException(y<?> yVar) {
        super(a(yVar));
        this.f107862a = yVar.b();
        this.f107863b = yVar.h();
        this.f107864c = yVar;
    }

    private static String a(y<?> yVar) {
        Objects.requireNonNull(yVar, "response == null");
        return "HTTP " + yVar.b() + " " + yVar.h();
    }
}
