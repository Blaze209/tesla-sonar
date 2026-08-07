package bl0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Kind;
import io.ktor.http.BadContentTypeFormatException;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import org.slf4j.Marker;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u000f2\u00020\u0001:\u0004\u001f !\u001aB1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006\""}, d2 = {"Lbl0/c;", "Lbl0/i;", "", CMSAttributeTableGenerator.CONTENT_TYPE, "contentSubtype", "existingContent", "", "Lbl0/h;", "parameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "name", "value", "", "f", "(Ljava/lang/String;Ljava/lang/String;)Z", "g", "(Ljava/lang/String;Ljava/lang/String;)Lbl0/c;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "e", "()Ljava/lang/String;", "getContentSubtype", "a", "b", "c", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final c f17544g = new c(Marker.ANY_MARKER, Marker.ANY_MARKER, null, 4, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String contentType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String contentSubtype;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bA\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\bR\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u0017\u0010,\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\bR\u0017\u0010/\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u0017\u00102\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\bR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u0017\u00108\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b7\u0010\bR\u0017\u0010;\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u0017\u0010>\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b=\u0010\bR\u0017\u0010A\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u0017\u0010D\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bB\u0010\u0006\u001a\u0004\bC\u0010\b¨\u0006E"}, d2 = {"Lbl0/c$a;", "", "<init>", "()V", "Lbl0/c;", "b", "Lbl0/c;", "getAny", "()Lbl0/c;", "Any", "c", "getAtom", "Atom", DateTokenConverter.CONVERTER_KEY, "getCbor", "Cbor", "e", "a", "Json", "f", "getHalJson", "HalJson", "g", "getJavaScript", "JavaScript", "h", "OctetStream", IntegerTokenConverter.CONVERTER_KEY, "getRss", "Rss", "j", "getXml", "Xml", "k", "getXml_Dtd", "Xml_Dtd", "l", "getZip", "Zip", "m", "getGZip", "GZip", "n", "getFormUrlEncoded", "FormUrlEncoded", "o", "getPdf", "Pdf", "p", "getXlsx", "Xlsx", "q", "getDocx", "Docx", "r", "getPptx", "Pptx", "s", "getProtoBuf", "ProtoBuf", "t", "getWasm", "Wasm", "u", "getProblemJson", "ProblemJson", "v", "getProblemXml", "ProblemXml", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final c JavaScript;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private static final c FormUrlEncoded;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        private static final c ProblemJson;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17547a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final c Any = new c(Kind.APPLICATION, Marker.ANY_MARKER, null, 4, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final c Atom = new c(Kind.APPLICATION, "atom+xml", null, 4, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final c Cbor = new c(Kind.APPLICATION, "cbor", null, 4, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final c Json = new c(Kind.APPLICATION, "json", null, 4, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final c HalJson = new c(Kind.APPLICATION, "hal+json", null, 4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final c OctetStream = new c(Kind.APPLICATION, "octet-stream", null, 4, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private static final c Rss = new c(Kind.APPLICATION, "rss+xml", null, 4, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private static final c Xml = new c(Kind.APPLICATION, "xml", null, 4, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private static final c Xml_Dtd = new c(Kind.APPLICATION, "xml-dtd", null, 4, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private static final c Zip = new c(Kind.APPLICATION, "zip", null, 4, 0 == true ? 1 : 0);

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private static final c GZip = new c(Kind.APPLICATION, "gzip", null, 4, null);

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private static final c Pdf = new c(Kind.APPLICATION, "pdf", null, 4, null);

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private static final c Xlsx = new c(Kind.APPLICATION, "vnd.openxmlformats-officedocument.spreadsheetml.sheet", null, 4, null);

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private static final c Docx = new c(Kind.APPLICATION, "vnd.openxmlformats-officedocument.wordprocessingml.document", null, 4, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private static final c Pptx = new c(Kind.APPLICATION, "vnd.openxmlformats-officedocument.presentationml.presentation", null, 4, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private static final c ProtoBuf = new c(Kind.APPLICATION, "protobuf", null, 4, 0 == true ? 1 : 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private static final c Wasm = new c(Kind.APPLICATION, "wasm", null, 4, null);

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        private static final c ProblemXml = new c(Kind.APPLICATION, "problem+xml", null, 4, null);

        /* JADX WARN: Multi-variable type inference failed */
        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            JavaScript = new c(Kind.APPLICATION, "javascript", null, 4, defaultConstructorMarker);
            FormUrlEncoded = new c(Kind.APPLICATION, "x-www-form-urlencoded", null, 4, defaultConstructorMarker);
            ProblemJson = new c(Kind.APPLICATION, "problem+json", null, 4, defaultConstructorMarker);
        }

        private a() {
        }

        public final c a() {
            return Json;
        }

        public final c b() {
            return OctetStream;
        }
    }

    /* JADX INFO: renamed from: bl0.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lbl0/c$b;", "", "<init>", "()V", "", "value", "Lbl0/c;", "b", "(Ljava/lang/String;)Lbl0/c;", "Any", "Lbl0/c;", "a", "()Lbl0/c;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            return c.f17544g;
        }

        public final c b(String value) throws BadContentTypeFormatException {
            p013kotlin.jvm.internal.s.k(value, "value");
            if (p013kotlin.text.t.y0(value)) {
                return a();
            }
            i.Companion aVar = i.INSTANCE;
            HeaderValue gVar = (HeaderValue) p013kotlin.collections.v.A0(n.b(value));
            String strB = gVar.getValue();
            List<HeaderValueParam> listA = gVar.a();
            int iU0 = p013kotlin.text.t.u0(strB, '/', 0, false, 6, null);
            if (iU0 == -1) {
                if (p013kotlin.jvm.internal.s.f(p013kotlin.text.t.F1(strB).toString(), Marker.ANY_MARKER)) {
                    return c.INSTANCE.a();
                }
                throw new BadContentTypeFormatException(value);
            }
            String strSubstring = strB.substring(0, iU0);
            p013kotlin.jvm.internal.s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = p013kotlin.text.t.F1(strSubstring).toString();
            if (string.length() == 0) {
                throw new BadContentTypeFormatException(value);
            }
            String strSubstring2 = strB.substring(iU0 + 1);
            p013kotlin.jvm.internal.s.j(strSubstring2, "this as java.lang.String).substring(startIndex)");
            String string2 = p013kotlin.text.t.F1(strSubstring2).toString();
            if (p013kotlin.text.t.g0(string, ' ', false, 2, null) || p013kotlin.text.t.g0(string2, ' ', false, 2, null)) {
                throw new BadContentTypeFormatException(value);
            }
            if (string2.length() == 0 || p013kotlin.text.t.g0(string2, '/', false, 2, null)) {
                throw new BadContentTypeFormatException(value);
            }
            return new c(string, string2, listA);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: bl0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\b¨\u0006\u001f"}, d2 = {"Lbl0/c$c;", "", "<init>", "()V", "Lbl0/c;", "b", "Lbl0/c;", "getAny", "()Lbl0/c;", "Any", "c", "getMixed", "Mixed", DateTokenConverter.CONVERTER_KEY, "getAlternative", "Alternative", "e", "getRelated", "Related", "f", "a", "FormData", "g", "getSigned", "Signed", "h", "getEncrypted", "Encrypted", IntegerTokenConverter.CONVERTER_KEY, "getByteRanges", "ByteRanges", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C0353c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0353c f17569a = new C0353c();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final c Any = new c("multipart", Marker.ANY_MARKER, null, 4, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final c Mixed = new c("multipart", "mixed", null, 4, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final c Alternative = new c("multipart", "alternative", null, 4, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final c Related = new c("multipart", "related", null, 4, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final c FormData = new c("multipart", "form-data", null, 4, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final c Signed = new c("multipart", "signed", null, 4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final c Encrypted = new c("multipart", "encrypted", null, 4, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private static final c ByteRanges = new c("multipart", "byteranges", null, 4, null);

        private C0353c() {
        }

        public final c a() {
            return FormData;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\b¨\u0006\""}, d2 = {"Lbl0/c$d;", "", "<init>", "()V", "Lbl0/c;", "b", "Lbl0/c;", "getAny", "()Lbl0/c;", "Any", "c", "a", "Plain", DateTokenConverter.CONVERTER_KEY, "getCSS", "CSS", "e", "getCSV", "CSV", "f", "getHtml", "Html", "g", "getJavaScript", "JavaScript", "h", "getVCard", "VCard", IntegerTokenConverter.CONVERTER_KEY, "getXml", "Xml", "j", "getEventStream", "EventStream", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f17578a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final c Any = new c("text", Marker.ANY_MARKER, null, 4, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final c Plain = new c("text", "plain", null, 4, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final c CSS = new c("text", "css", null, 4, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final c CSV = new c("text", "csv", null, 4, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final c Html = new c("text", "html", null, 4, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final c JavaScript = new c("text", "javascript", null, 4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final c VCard = new c("text", "vcard", null, 4, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private static final c Xml = new c("text", "xml", null, 4, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private static final c EventStream = new c("text", "event-stream", null, 4, null);

        private d() {
        }

        public final c a() {
            return Plain;
        }
    }

    private c(String str, String str2, String str3, List<HeaderValueParam> list) {
        super(str3, list);
        this.contentType = str;
        this.contentSubtype = str2;
    }

    private final boolean f(String name, String value) {
        int size = b().size();
        if (size != 0) {
            if (size != 1) {
                List<HeaderValueParam> listB = b();
                if ((listB instanceof Collection) && listB.isEmpty()) {
                    return false;
                }
                for (HeaderValueParam hVar : listB) {
                    if (p013kotlin.text.t.M(hVar.getName(), name, true) && p013kotlin.text.t.M(hVar.getValue(), value, true)) {
                        return true;
                    }
                }
                return false;
            }
            HeaderValueParam hVar2 = b().get(0);
            if (p013kotlin.text.t.M(hVar2.getName(), name, true) && p013kotlin.text.t.M(hVar2.getValue(), value, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    public boolean equals(Object other) {
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return p013kotlin.text.t.M(this.contentType, cVar.contentType, true) && p013kotlin.text.t.M(this.contentSubtype, cVar.contentSubtype, true) && p013kotlin.jvm.internal.s.f(b(), cVar.b());
    }

    public final c g(String name, String value) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(value, "value");
        return f(name, value) ? this : new c(this.contentType, this.contentSubtype, getContent(), p013kotlin.collections.v.Q0(b(), new HeaderValueParam(name, value)));
    }

    public int hashCode() {
        String str = this.contentType;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        p013kotlin.jvm.internal.s.j(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.contentSubtype.toLowerCase(locale);
        p013kotlin.jvm.internal.s.j(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return iHashCode + (iHashCode * 31) + lowerCase2.hashCode() + (b().hashCode() * 31);
    }

    public /* synthetic */ c(String str, String str2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? p013kotlin.collections.v.m() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String contentType, String contentSubtype, List<HeaderValueParam> parameters) {
        this(contentType, contentSubtype, contentType + '/' + contentSubtype, parameters);
        p013kotlin.jvm.internal.s.k(contentType, "contentType");
        p013kotlin.jvm.internal.s.k(contentSubtype, "contentSubtype");
        p013kotlin.jvm.internal.s.k(parameters, "parameters");
    }
}
