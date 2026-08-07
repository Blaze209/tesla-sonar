package yk0;

import bl0.q;
import bl0.u;
import bl0.v;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import expo.modules.interfaces.permissions.PermissionsResponse;
import fl0.GMTDate;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001e\u001a\u00020\u001a8&X§\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lyk0/c;", "Lbl0/q;", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "Lpk0/a;", "I", "()Lpk0/a;", "call", "Lbl0/v;", "f", "()Lbl0/v;", PermissionsResponse.STATUS_KEY, "Lbl0/u;", "g", "()Lbl0/u;", "version", "Lfl0/b;", DateTokenConverter.CONVERTER_KEY, "()Lfl0/b;", "requestTime", "e", "responseTime", "Lio/ktor/utils/io/g;", "c", "()Lio/ktor/utils/io/g;", "getContent$annotations", "content", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class c implements q, CoroutineScope {
    public abstract pk0.a I();

    public abstract io.ktor.utils.io.g c();

    public abstract GMTDate d();

    public abstract GMTDate e();

    public abstract v f();

    public abstract u g();

    public String toString() {
        return "HttpResponse[" + e.d(this).getUrl() + ", " + f() + ']';
    }
}
