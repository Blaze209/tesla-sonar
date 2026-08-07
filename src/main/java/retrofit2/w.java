package retrofit2;

import java.io.EOFException;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes10.dex */
final class w {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final char[] f107994l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f107995m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f107996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HttpUrl f107997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f107998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HttpUrl.Builder f107999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Request.Builder f108000e = new Request.Builder();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Headers.Builder f108001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MediaType f108002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f108003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MultipartBody.Builder f108004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private FormBody.Builder f108005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private RequestBody f108006k;

    private static class a extends RequestBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final RequestBody f108007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MediaType f108008b;

        a(RequestBody requestBody, MediaType mediaType) {
            this.f108007a = requestBody;
            this.f108008b = mediaType;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.f108007a.contentLength();
        }

        @Override // okhttp3.RequestBody
        /* JADX INFO: renamed from: contentType */
        public MediaType getContentType() {
            return this.f108008b;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(okio.i iVar) {
            this.f108007a.writeTo(iVar);
        }
    }

    w(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z11, boolean z12, boolean z13) {
        this.f107996a = str;
        this.f107997b = httpUrl;
        this.f107998c = str2;
        this.f108002g = mediaType;
        this.f108003h = z11;
        if (headers != null) {
            this.f108001f = headers.newBuilder();
        } else {
            this.f108001f = new Headers.Builder();
        }
        if (z12) {
            this.f108005j = new FormBody.Builder();
        } else if (z13) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f108004i = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    private static String i(String str, boolean z11) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z11 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                okio.h hVar = new okio.h();
                hVar.p0(str, 0, iCharCount);
                j(hVar, str, iCharCount, length, z11);
                return hVar.t1();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    private static void j(okio.h hVar, String str, int i11, int i12, boolean z11) throws EOFException {
        okio.h hVar2 = null;
        while (i11 < i12) {
            int iCodePointAt = str.codePointAt(i11);
            if (!z11 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z11 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (hVar2 == null) {
                        hVar2 = new okio.h();
                    }
                    hVar2.r1(iCodePointAt);
                    while (!hVar2.T2()) {
                        byte b11 = hVar2.readByte();
                        hVar.writeByte(37);
                        char[] cArr = f107994l;
                        hVar.writeByte(cArr[((b11 & 255) >> 4) & 15]);
                        hVar.writeByte(cArr[b11 & 15]);
                    }
                } else {
                    hVar.r1(iCodePointAt);
                }
            }
            i11 += Character.charCount(iCodePointAt);
        }
    }

    void a(String str, String str2, boolean z11) {
        if (z11) {
            this.f108005j.addEncoded(str, str2);
        } else {
            this.f108005j.add(str, str2);
        }
    }

    void b(String str, String str2, boolean z11) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            if (z11) {
                this.f108001f.addUnsafeNonAscii(str, str2);
                return;
            } else {
                this.f108001f.add(str, str2);
                return;
            }
        }
        try {
            this.f108002g = MediaType.get(str2);
        } catch (IllegalArgumentException e11) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e11);
        }
    }

    void c(Headers headers) {
        this.f108001f.addAll(headers);
    }

    void d(Headers headers, RequestBody requestBody) {
        this.f108004i.addPart(headers, requestBody);
    }

    void e(MultipartBody.Part part) {
        this.f108004i.addPart(part);
    }

    void f(String str, String str2, boolean z11) throws EOFException {
        if (this.f107998c == null) {
            throw new AssertionError();
        }
        String strI = i(str2, z11);
        String strReplace = this.f107998c.replace("{" + str + "}", strI);
        if (!f107995m.matcher(strReplace).matches()) {
            this.f107998c = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    void g(String str, String str2, boolean z11) {
        String str3 = this.f107998c;
        if (str3 != null) {
            HttpUrl.Builder builderNewBuilder = this.f107997b.newBuilder(str3);
            this.f107999d = builderNewBuilder;
            if (builderNewBuilder == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f107997b + ", Relative: " + this.f107998c);
            }
            this.f107998c = null;
        }
        if (z11) {
            this.f107999d.addEncodedQueryParameter(str, str2);
        } else {
            this.f107999d.addQueryParameter(str, str2);
        }
    }

    <T> void h(Class<T> cls, T t11) {
        this.f108000e.tag(cls, t11);
    }

    Request.Builder k() {
        HttpUrl httpUrlResolve;
        HttpUrl.Builder builder = this.f107999d;
        if (builder != null) {
            httpUrlResolve = builder.build();
        } else {
            httpUrlResolve = this.f107997b.resolve(this.f107998c);
            if (httpUrlResolve == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f107997b + ", Relative: " + this.f107998c);
            }
        }
        RequestBody aVar = this.f108006k;
        if (aVar == null) {
            FormBody.Builder builder2 = this.f108005j;
            if (builder2 != null) {
                aVar = builder2.build();
            } else {
                MultipartBody.Builder builder3 = this.f108004i;
                if (builder3 != null) {
                    aVar = builder3.build();
                } else if (this.f108003h) {
                    aVar = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.f108002g;
        if (mediaType != null) {
            if (aVar != null) {
                aVar = new a(aVar, mediaType);
            } else {
                this.f108001f.add("Content-Type", mediaType.getMediaType());
            }
        }
        return this.f108000e.url(httpUrlResolve).headers(this.f108001f.build()).method(this.f107996a, aVar);
    }

    void l(RequestBody requestBody) {
        this.f108006k = requestBody;
    }

    void m(Object obj) {
        this.f107998c = obj.toString();
    }
}
