package r30;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import com.stripe.android.core.exception.InvalidRequestException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import w30.c0;
import w30.k0;
import w30.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0007\u0018\u0000 52\u00020\u0001:\u0001*B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b\u0011\u0010#R\u001a\u0010(\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001b\u0010'R&\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\u000f\u001a\u0004\b*\u0010+R0\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010\u000f\u001a\u0004\b\u000e\u0010+\"\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010'R\u0014\u00104\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u00103¨\u00066"}, d2 = {"Lr30/i;", "Lw30/k0;", "", "", "", "params", "guid", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "Ljava/io/OutputStream;", "outputStream", "Ljn0/h0;", "g", "(Ljava/io/OutputStream;)V", "c", "Ljava/util/Map;", "Lw30/c0$e;", DateTokenConverter.CONVERTER_KEY, "Lw30/c0$e;", "headersFactory", "Lw30/k0$a;", "e", "Lw30/k0$a;", "b", "()Lw30/k0$a;", "method", "Lw30/k0$b;", "f", "Lw30/k0$b;", "getMimeType", "()Lw30/k0$b;", "mimeType", "", "", "Ljava/lang/Iterable;", "()Ljava/lang/Iterable;", "retryResponseCodes", "h", "Ljava/lang/String;", "()Ljava/lang/String;", ImagesContract.URL, IntegerTokenConverter.CONVERTER_KEY, "a", "()Ljava/util/Map;", "headers", "j", "setPostHeaders", "(Ljava/util/Map;)V", "postHeaders", "jsonBody", "", "()[B", "postBodyBytes", "k", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i extends k0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f106950k = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> params;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c0.e headersFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k0.a method;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k0.b mimeType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Iterable<Integer> retryResponseCodes;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> headers;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Map<String, String> postHeaders;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr30/i$a;", "", "<init>", "()V", "", "URL", "Ljava/lang/String;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i(Map<String, ? extends Object> params, String guid) {
        s.k(params, "params");
        s.k(guid, "guid");
        this.params = params;
        c0.e eVar = new c0.e(guid);
        this.headersFactory = eVar;
        this.method = k0.a.POST;
        this.mimeType = k0.b.Json;
        this.retryResponseCodes = w.a();
        this.url = "https://m.stripe.com/6";
        this.headers = eVar.b();
        this.postHeaders = eVar.c();
    }

    private final String h() {
        return String.valueOf(t30.e.f112281a.d(this.params));
    }

    private final byte[] i() throws InvalidRequestException {
        try {
            byte[] bytes = h().getBytes(p013kotlin.text.d.UTF_8);
            s.j(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e11) {
            throw new InvalidRequestException(null, null, 0, "Unable to encode parameters to " + p013kotlin.text.d.UTF_8.name() + ". Please contact support@stripe.com for assistance.", e11, 7, null);
        }
    }

    @Override // w30.k0
    public Map<String, String> a() {
        return this.headers;
    }

    @Override // w30.k0
    /* JADX INFO: renamed from: b, reason: from getter */
    public k0.a getMethod() {
        return this.method;
    }

    @Override // w30.k0
    public Map<String, String> c() {
        return this.postHeaders;
    }

    @Override // w30.k0
    public Iterable<Integer> d() {
        return this.retryResponseCodes;
    }

    @Override // w30.k0
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    @Override // w30.k0
    public void g(OutputStream outputStream) throws IOException {
        s.k(outputStream, "outputStream");
        outputStream.write(i());
        outputStream.flush();
    }
}
