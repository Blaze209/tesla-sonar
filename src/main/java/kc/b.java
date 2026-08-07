package kc;

import ch.qos.logback.core.CoreConstants;
import ec.g0;
import ec.h0;
import okio.i0;
import p013kotlin.Metadata;
import rc.Options;
import rc.h;
import yc.f0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkc/b;", "Lkc/c;", "Lec/g0;", "<init>", "()V", "data", "Lrc/n;", "options", "", "b", "(Lec/g0;Lrc/n;)Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements c<g0> {
    @Override // kc.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(g0 data, Options options) {
        String strD;
        if (!f0.m(data) || !h.c(options) || (strD = h0.d(data)) == null) {
            return null;
        }
        Long lastModifiedAtMillis = options.getFileSystem().b0(i0.Companion.e(i0.INSTANCE, strD, false, 1, null)).getLastModifiedAtMillis();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(data);
        sb2.append(CoreConstants.DASH_CHAR);
        sb2.append(lastModifiedAtMillis);
        return sb2.toString();
    }
}
