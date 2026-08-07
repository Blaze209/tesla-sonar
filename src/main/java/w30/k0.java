package w30;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.OutputStream;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\b\b'\u0018\u00002\u00020\u0001:\u0002\u000b\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u000e¨\u0006$"}, d2 = {"Lw30/k0;", "", "<init>", "()V", "Ljava/io/OutputStream;", "outputStream", "Ljn0/h0;", "g", "(Ljava/io/OutputStream;)V", "", "", "a", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "setPostHeaders", "(Ljava/util/Map;)V", "postHeaders", "", "b", "Z", "e", "()Z", "shouldCache", "Lw30/k0$a;", "()Lw30/k0$a;", "method", "", "", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Iterable;", "retryResponseCodes", "f", "()Ljava/lang/String;", ImagesContract.URL, "headers", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Map<String, String> postHeaders;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldCache;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lw30/k0$a;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "GET", "POST", "DELETE", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum a {
        GET("GET"),
        POST("POST"),
        DELETE("DELETE");

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String code;

        a(String str) {
            this.code = str;
        }

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }

        public final String getCode() {
            return this.code;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lw30/k0$b;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getCode", "Form", "MultipartForm", "Json", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum b {
        Form("application/x-www-form-urlencoded"),
        MultipartForm("multipart/form-data"),
        Json("application/json");

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String code;

        b(String str) {
            this.code = str;
        }

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }

        public final String getCode() {
            return this.code;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    public abstract Map<String, String> a();

    public abstract a b();

    public Map<String, String> c() {
        return this.postHeaders;
    }

    public abstract Iterable<Integer> d();

    /* JADX INFO: renamed from: e, reason: from getter */
    public boolean getShouldCache() {
        return this.shouldCache;
    }

    public abstract String f();

    public void g(OutputStream outputStream) {
        p013kotlin.jvm.internal.s.k(outputStream, "outputStream");
    }
}
