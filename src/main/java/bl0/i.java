package bl0;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000 \n2\u00020\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lbl0/i;", "", "", "content", "", "Lbl0/h;", "parameters", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "name", "c", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<HeaderValueParam> parameters;

    /* JADX INFO: renamed from: bl0.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbl0/i$a;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public i(String content, List<HeaderValueParam> parameters) {
        p013kotlin.jvm.internal.s.k(content, "content");
        p013kotlin.jvm.internal.s.k(parameters, "parameters");
        this.content = content;
        this.parameters = parameters;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    protected final String getContent() {
        return this.content;
    }

    public final List<HeaderValueParam> b() {
        return this.parameters;
    }

    public final String c(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        int iO = p013kotlin.collections.v.o(this.parameters);
        if (iO < 0) {
            return null;
        }
        int i11 = 0;
        while (true) {
            HeaderValueParam headerValueParam = this.parameters.get(i11);
            if (p013kotlin.text.t.M(headerValueParam.getName(), name, true)) {
                return headerValueParam.getValue();
            }
            if (i11 == iO) {
                return null;
            }
            i11++;
        }
    }

    public String toString() {
        if (this.parameters.isEmpty()) {
            return this.content;
        }
        int length = this.content.length();
        int i11 = 0;
        int length2 = 0;
        for (HeaderValueParam headerValueParam : this.parameters) {
            length2 += headerValueParam.getName().length() + headerValueParam.getValue().length() + 3;
        }
        StringBuilder sb2 = new StringBuilder(length + length2);
        sb2.append(this.content);
        int iO = p013kotlin.collections.v.o(this.parameters);
        if (iO >= 0) {
            while (true) {
                HeaderValueParam headerValueParam2 = this.parameters.get(i11);
                sb2.append("; ");
                sb2.append(headerValueParam2.getName());
                sb2.append("=");
                String value = headerValueParam2.getValue();
                if (j.d(value)) {
                    sb2.append(j.e(value));
                } else {
                    sb2.append(value);
                }
                if (i11 == iO) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "{\n            val size =…   }.toString()\n        }");
        return string;
    }
}
