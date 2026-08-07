package s00;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: s00.p, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b#\u0010\u0011R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0011R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b&\u0010\u0011¨\u0006("}, d2 = {"Ls00/p;", "", "", "", "headers", "Ls00/h;", "httpMethod", "Ls00/l;", "uploadType", "fieldName", "mimeType", "parameters", "uuid", ImagesContract.URL, "<init>", "(Ljava/util/Map;Ls00/h;Ls00/l;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "Ls00/h;", "c", "()Ls00/h;", "Ls00/l;", "f", "()Ls00/l;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "e", "g", "h", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UploaderOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, String> headers;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final h httpMethod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final l uploadType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fieldName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mimeType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, String> parameters;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String uuid;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    public UploaderOptions(Map<String, String> map, h httpMethod, l uploadType, String str, String str2, Map<String, String> map2, String uuid, String url) {
        s.k(httpMethod, "httpMethod");
        s.k(uploadType, "uploadType");
        s.k(uuid, "uuid");
        s.k(url, "url");
        this.headers = map;
        this.httpMethod = httpMethod;
        this.uploadType = uploadType;
        this.fieldName = str;
        this.mimeType = str2;
        this.parameters = map2;
        this.uuid = uuid;
        this.url = url;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFieldName() {
        return this.fieldName;
    }

    public final Map<String, String> b() {
        return this.headers;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h getHttpMethod() {
        return this.httpMethod;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    public final Map<String, String> e() {
        return this.parameters;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploaderOptions)) {
            return false;
        }
        UploaderOptions uploaderOptions = (UploaderOptions) other;
        return s.f(this.headers, uploaderOptions.headers) && this.httpMethod == uploaderOptions.httpMethod && this.uploadType == uploaderOptions.uploadType && s.f(this.fieldName, uploaderOptions.fieldName) && s.f(this.mimeType, uploaderOptions.mimeType) && s.f(this.parameters, uploaderOptions.parameters) && s.f(this.uuid, uploaderOptions.uuid) && s.f(this.url, uploaderOptions.url);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final l getUploadType() {
        return this.uploadType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        Map<String, String> map = this.headers;
        int iHashCode = (((((map == null ? 0 : map.hashCode()) * 31) + this.httpMethod.hashCode()) * 31) + this.uploadType.hashCode()) * 31;
        String str = this.fieldName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mimeType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map2 = this.parameters;
        return ((((iHashCode3 + (map2 != null ? map2.hashCode() : 0)) * 31) + this.uuid.hashCode()) * 31) + this.url.hashCode();
    }

    public String toString() {
        return "UploaderOptions(headers=" + this.headers + ", httpMethod=" + this.httpMethod + ", uploadType=" + this.uploadType + ", fieldName=" + this.fieldName + ", mimeType=" + this.mimeType + ", parameters=" + this.parameters + ", uuid=" + this.uuid + ", url=" + this.url + ")";
    }
}
