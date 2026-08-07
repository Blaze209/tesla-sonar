package bb0;

import cc0.f;
import cc0.g;
import cc0.h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ic0.e;
import ic0.q;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lbb0/b;", "", "<init>", "()V", "Lic0/q;", "transport", "Lcc0/f;", "e", "(Lic0/q;)Lcc0/f;", "", "commandId", "a", "(Ljava/lang/String;)Lcc0/f;", "requestId", "c", "", "statusCode", DateTokenConverter.CONVERTER_KEY, "(I)Lcc0/f;", "Lic0/e;", "request", "b", "(Lic0/e;)Lcc0/f;", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f16948a = new b();

    private b() {
    }

    public final f a(String commandId) {
        s.k(commandId, "commandId");
        return new f(g.COMMAND_ID, null, null, null, new h(commandId, null, 2, null), null, 46, null);
    }

    public final f b(e request) {
        s.k(request, "request");
        return new f(g.COMMAND, null, null, null, new h(ce0.c.b(request), null, 2, null), null, 46, null);
    }

    public final f c(String requestId) {
        s.k(requestId, "requestId");
        return new f(g.RESPONSE_REQUEST_ID, null, null, null, new h(requestId, null, 2, null), null, 46, null);
    }

    public final f d(int statusCode) {
        return new f(g.RESPONSE_STATUS_CODE, null, new cc0.e(statusCode, null, 2, null), null, null, null, 58, null);
    }

    public final f e(q transport) {
        s.k(transport, "transport");
        g gVar = g.TRANSPORT;
        String strName = transport.name();
        Locale US = Locale.US;
        s.j(US, "US");
        String lowerCase = strName.toLowerCase(US);
        s.j(lowerCase, "toLowerCase(...)");
        return new f(gVar, null, null, null, new h(lowerCase, null, 2, null), null, 46, null);
    }
}
