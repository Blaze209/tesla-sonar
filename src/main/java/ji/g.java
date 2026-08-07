package ji;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001\u0010B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0010\u0010\u001b¨\u0006\u001c"}, d2 = {"Lji/g;", "", "Lji/f;", "method", "", ImagesContract.URL, "", "Lji/d;", "headers", "Lji/c;", "body", "<init>", "(Lji/f;Ljava/lang/String;Ljava/util/List;Lji/c;)V", "Lji/g$a;", "e", "(Lji/f;Ljava/lang/String;)Lji/g$a;", "a", "Lji/f;", "c", "()Lji/f;", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "Lji/c;", "()Lji/c;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f method;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<HttpHeader> headers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c body;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c¨\u0006\u001d"}, d2 = {"Lji/g$a;", "", "Lji/f;", "method", "", ImagesContract.URL, "<init>", "(Lji/f;Ljava/lang/String;)V", "Lji/c;", "body", "c", "(Lji/c;)Lji/g$a;", "name", "value", "a", "(Ljava/lang/String;Ljava/lang/String;)Lji/g$a;", "", "Lji/d;", "headers", "b", "(Ljava/util/List;)Lji/g$a;", "Lji/g;", DateTokenConverter.CONVERTER_KEY, "()Lji/g;", "Lji/f;", "Ljava/lang/String;", "Lji/c;", "", "Ljava/util/List;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final f method;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String url;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private c body;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<HttpHeader> headers;

        public a(f method, String url) {
            s.k(method, "method");
            s.k(url, "url");
            this.method = method;
            this.url = url;
            this.headers = new ArrayList();
        }

        public final a a(String name, String value) {
            s.k(name, "name");
            s.k(value, "value");
            this.headers.add(new HttpHeader(name, value));
            return this;
        }

        public final a b(List<HttpHeader> headers) {
            s.k(headers, "headers");
            this.headers.addAll(headers);
            return this;
        }

        public final a c(c body) {
            s.k(body, "body");
            this.body = body;
            return this;
        }

        public final g d() {
            return new g(this.method, this.url, this.headers, this.body, null);
        }
    }

    public /* synthetic */ g(f fVar, String str, List list, c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, str, list, cVar);
    }

    public static /* synthetic */ a f(g gVar, f fVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fVar = gVar.method;
        }
        if ((i11 & 2) != 0) {
            str = gVar.url;
        }
        return gVar.e(fVar, str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getBody() {
        return this.body;
    }

    public final List<HttpHeader> b() {
        return this.headers;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final a e(f method, String url) {
        s.k(method, "method");
        s.k(url, "url");
        a aVar = new a(method, url);
        c cVar = this.body;
        if (cVar != null) {
            aVar.c(cVar);
        }
        aVar.b(this.headers);
        return aVar;
    }

    private g(f fVar, String str, List<HttpHeader> list, c cVar) {
        this.method = fVar;
        this.url = str;
        this.headers = list;
        this.body = cVar;
    }
}
