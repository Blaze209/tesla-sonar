package ld0;

import java.util.Locale;
import nc0.h;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lnc0/h;", "", "a", "(Lnc0/h;)Ljava/lang/String;", "apiValue", "monitoring_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final String a(h hVar) {
        s.k(hVar, "<this>");
        String strName = hVar.name();
        Locale US = Locale.US;
        s.j(US, "US");
        String lowerCase = strName.toLowerCase(US);
        s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
