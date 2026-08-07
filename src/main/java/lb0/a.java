package lb0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ic0.f;
import ic0.h;
import ic0.q;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lsc0/b;", "", "e", "(Lsc0/b;)Ljava/lang/String;", "analyticsName", "Lic0/h;", "b", "(Lic0/h;)Ljava/lang/String;", "Lic0/q;", "c", "(Lic0/q;)Ljava/lang/String;", "Ljc0/a;", DateTokenConverter.CONVERTER_KEY, "(Ljc0/a;)Ljava/lang/String;", "Lic0/f;", "a", "(Lic0/f;)Ljava/lang/String;", "command-utils_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final String a(f fVar) {
        s.k(fVar, "<this>");
        return t.r1(fVar.name(), "SOURCE_", null, 2, null);
    }

    public static final String b(h hVar) {
        s.k(hVar, "<this>");
        return t.r1(hVar.name(), "RESULT_", null, 2, null);
    }

    public static final String c(q qVar) {
        s.k(qVar, "<this>");
        return t.r1(qVar.name(), "TRANSPORT_", null, 2, null);
    }

    public static final String d(jc0.a aVar) {
        s.k(aVar, "<this>");
        return t.r1(aVar.name(), "GENERICERROR_", null, 2, null);
    }

    public static final String e(sc0.b bVar) {
        s.k(bVar, "<this>");
        return t.r1(bVar.name(), "DOMAIN_", null, 2, null);
    }
}
