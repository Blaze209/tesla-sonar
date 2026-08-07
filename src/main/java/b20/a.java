package b20;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.HashMap;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import r20.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0018\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0017¨\u0006\u0019"}, d2 = {"Lb20/a;", "", "Lt20/a;", "basisForProcessing", "", "documentId", "documentVersion", "documentDescription", "<init>", "(Lt20/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Lt20/a;", "getBasisForProcessing", "()Lt20/a;", "b", "Ljava/lang/String;", "getDocumentId", "()Ljava/lang/String;", "c", "getDocumentVersion", DateTokenConverter.CONVERTER_KEY, "getDocumentDescription", "Lr20/b;", "()Lr20/b;", CoreConstants.CONTEXT_SCOPE_VALUE, "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t20.a basisForProcessing;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String documentId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String documentVersion;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String documentDescription;

    public a(t20.a basisForProcessing, String str, String str2, String str3) {
        s.k(basisForProcessing, "basisForProcessing");
        this.basisForProcessing = basisForProcessing;
        this.documentId = str;
        this.documentVersion = str2;
        this.documentDescription = str3;
    }

    public final b a() {
        HashMap map = new HashMap();
        String string = this.basisForProcessing.toString();
        Locale locale = Locale.getDefault();
        s.j(locale, "getDefault()");
        String lowerCase = string.toLowerCase(locale);
        s.j(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        map.put("basisForProcessing", lowerCase);
        map.put("documentId", this.documentId);
        map.put("documentVersion", this.documentVersion);
        map.put("documentDescription", this.documentDescription);
        return new b("iglu:com.snowplowanalytics.snowplow/gdpr/jsonschema/1-0-0", map);
    }
}
