package o20;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\u001aB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0018¨\u0006\u001b"}, d2 = {"Lo20/m;", "Lo20/c;", "", "source", "message", "", "throwable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "s", "", "maxLength", "g", "(Ljava/lang/String;I)Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "e", "f", "Ljava/lang/Throwable;", "", "", "b", "()Ljava/util/Map;", "dataPayload", "()Ljava/lang/String;", "schema", "a", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String message;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Throwable throwable;

    public m(String source, String message, Throwable th2) {
        s.k(source, "source");
        s.k(message, "message");
        this.source = source;
        this.message = message;
        this.throwable = th2;
    }

    private final String g(String s11, int maxLength) {
        if (s11 == null) {
            return null;
        }
        String strSubstring = s11.substring(0, n.j(s11.length(), maxLength));
        s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Override // o20.f
    public Map<String, Object> b() {
        String strG = g(this.message, 2048);
        if (strG == null || strG.length() == 0) {
            strG = "Empty message found";
        }
        HashMap map = new HashMap();
        map.put("className", this.source);
        map.put("message", strG);
        Throwable th2 = this.throwable;
        if (th2 != null) {
            String strG2 = g(i20.c.o(th2), PKIFailureInfo.certRevoked);
            String strG3 = g(this.throwable.getClass().getName(), 1024);
            map.put("stackTrace", strG2);
            map.put("exceptionName", strG3);
        }
        return map;
    }

    @Override // o20.c
    /* JADX INFO: renamed from: f */
    public String getSchema() {
        return "iglu:com.snowplowanalytics.snowplow/diagnostic_error/jsonschema/1-0-0";
    }
}
