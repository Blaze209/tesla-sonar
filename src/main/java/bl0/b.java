package bl0;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lbl0/b;", "Lbl0/i;", "", "disposition", "", "Lbl0/h;", "parameters", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "a", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f17539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b f17540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f17541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f17542h;

    /* JADX INFO: renamed from: bl0.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbl0/b$a;", "", "<init>", "()V", "", "value", "Lbl0/b;", "a", "(Ljava/lang/String;)Lbl0/b;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            i.Companion companion = i.INSTANCE;
            HeaderValue headerValue = (HeaderValue) p013kotlin.collections.v.A0(n.b(value));
            return new b(headerValue.getValue(), headerValue.a());
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i11 = 2;
        f17539e = new b(Action.FILE_ATTRIBUTE, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        f17540f = new b("mixed", 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        f17541g = new b("attachment", 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        f17542h = new b("inline", 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
    }

    public /* synthetic */ b(String str, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? p013kotlin.collections.v.m() : list);
    }

    public final String d() {
        return getContent();
    }

    public boolean equals(Object other) {
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return p013kotlin.jvm.internal.s.f(d(), bVar.d()) && p013kotlin.jvm.internal.s.f(b(), bVar.b());
    }

    public int hashCode() {
        return (d().hashCode() * 31) + b().hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String disposition, List<HeaderValueParam> parameters) {
        super(disposition, parameters);
        p013kotlin.jvm.internal.s.k(disposition, "disposition");
        p013kotlin.jvm.internal.s.k(parameters, "parameters");
    }
}
