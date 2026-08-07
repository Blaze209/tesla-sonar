package rd0;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u0018\u0010\u0007\u001a\u00020\u0004*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\u0004*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "c", "(J)J", "Lvc0/m;", "", "a", "(Lvc0/m;)Ljava/lang/String;", "analyticsName", "Lvc0/o;", "b", "(Lvc0/o;)Ljava/lang/String;", "phonekeyauthengine_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final String a(vc0.m mVar) {
        p013kotlin.jvm.internal.s.k(mVar, "<this>");
        String lowerCase = mVar.name().toLowerCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final String b(vc0.o oVar) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        String lowerCase = p013kotlin.text.t.r1(oVar.name(), "AUTHENTICATIONREJECTION_", null, 2, null).toLowerCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final long c(long j11) {
        return TimeUnit.SECONDS.convert(System.currentTimeMillis() - j11, TimeUnit.MILLISECONDS);
    }
}
