package p010i90;

import androidx.core.os.LocaleListCompat;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import i4.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jn0.x;
import o4.TransformedText;
import o4.f0;
import o4.z0;
import org.slf4j.Marker;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@p013kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00142\u00020\u0001:\u0004\u0014\u0015\u000e\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0002\u0016\u0017¨\u0006\u0018"}, d2 = {"Li90/t0;", "", "<init>", "()V", "", "input", "h", "(Ljava/lang/String;)Ljava/lang/String;", "g", "e", "()Ljava/lang/String;", "prefix", DateTokenConverter.CONVERTER_KEY, "placeholder", "c", "countryCode", "Lo4/z0;", "f", "()Lo4/z0;", "visualTransformation", "a", "b", "Li90/t0$c;", "Li90/t0$d;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final bo0.c f76979b = new bo0.c('0', '9');

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Metadata> f76980c;

    /* JADX INFO: renamed from: i90.t0$a, reason: from kotlin metadata */
    @p013kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Li90/t0$a;", "", "<init>", "()V", "", "prefix", "Landroidx/core/os/LocaleListCompat;", "userLocales", "b", "(Ljava/lang/String;Landroidx/core/os/LocaleListCompat;)Ljava/lang/String;", "", "a", "(Ljava/lang/String;)Ljava/util/List;", "countryCode", "Li90/t0;", "c", "(Ljava/lang/String;)Li90/t0;", "phoneNumber", DateTokenConverter.CONVERTER_KEY, "", "f", "(Ljava/lang/String;)Ljava/lang/Integer;", "g", "(Ljava/lang/String;)Ljava/lang/String;", "Lbo0/c;", "VALID_INPUT_RANGE", "Lbo0/c;", "e", "()Lbo0/c;", "COUNTRY_PREFIX_MAX_LENGTH", "I", "E164_MAX_DIGITS", "", "Li90/t0$b;", "allMetadata", "Ljava/util/Map;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<String> a(String prefix) {
            Map map = t0.f76980c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (s.f(((Metadata) entry.getValue()).getPrefix(), prefix)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(((Metadata) ((Map.Entry) it.next()).getValue()).getRegionCode());
            }
            return arrayList;
        }

        private final String b(String prefix, LocaleListCompat userLocales) {
            List<String> listA = a(prefix);
            if (listA.isEmpty()) {
                listA = null;
            }
            if (listA == null) {
                return null;
            }
            int iH = userLocales.h();
            for (int i11 = 0; i11 < iH; i11++) {
                Locale localeC = userLocales.c(i11);
                s.h(localeC);
                if (listA.contains(localeC.getCountry())) {
                    return localeC.getCountry();
                }
            }
            return (String) v.o0(listA);
        }

        public final t0 c(String countryCode) {
            s.k(countryCode, "countryCode");
            Map map = t0.f76980c;
            String upperCase = countryCode.toUpperCase(Locale.ROOT);
            s.j(upperCase, "toUpperCase(...)");
            Metadata metadata = (Metadata) map.get(upperCase);
            return metadata != null ? new d(metadata) : new c(countryCode);
        }

        public final t0 d(String phoneNumber) {
            s.k(phoneNumber, "phoneNumber");
            int i11 = 1;
            while (i11 < t.p0(phoneNumber) && i11 < 4) {
                i11++;
                String strSubstring = phoneNumber.substring(0, i11);
                s.j(strSubstring, "substring(...)");
                LocaleListCompat localeListCompatD = LocaleListCompat.d();
                s.j(localeListCompatD, "getAdjustedDefault(...)");
                String strB = b(strSubstring, localeListCompatD);
                if (strB != null) {
                    return c(strB);
                }
            }
            return null;
        }

        public final bo0.c e() {
            return t0.f76979b;
        }

        public final Integer f(String countryCode) {
            String pattern;
            s.k(countryCode, "countryCode");
            Map map = t0.f76980c;
            String upperCase = countryCode.toUpperCase(Locale.ROOT);
            s.j(upperCase, "toUpperCase(...)");
            Metadata metadata = (Metadata) map.get(upperCase);
            if (metadata == null || (pattern = metadata.getPattern()) == null) {
                return null;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < pattern.length(); i12++) {
                if (pattern.charAt(i12) == '#') {
                    i11++;
                }
            }
            return Integer.valueOf(i11);
        }

        public final String g(String countryCode) {
            s.k(countryCode, "countryCode");
            Map map = t0.f76980c;
            String upperCase = countryCode.toUpperCase(Locale.ROOT);
            s.j(upperCase, "toUpperCase(...)");
            Metadata metadata = (Metadata) map.get(upperCase);
            if (metadata != null) {
                return metadata.getPrefix();
            }
            return null;
        }

        private Companion() {
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001a\u0010\u0015\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014¨\u0006\u0016"}, d2 = {"Li90/t0$c;", "Li90/t0;", "", "countryCode", "<init>", "(Ljava/lang/String;)V", "input", "h", "(Ljava/lang/String;)Ljava/lang/String;", "g", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "c", "()Ljava/lang/String;", "e", "prefix", "f", "placeholder", "Lo4/z0;", "Lo4/z0;", "()Lo4/z0;", "visualTransformation", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends t0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String countryCode;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String prefix;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String placeholder;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final z0 visualTransformation;

        @p013kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"i90/t0$c$a", "Lo4/f0;", "", "offset", "originalToTransformed", "(I)I", "transformedToOriginal", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements f0 {
            a() {
            }

            @Override // o4.f0
            public int originalToTransformed(int offset) {
                return offset + 1;
            }

            @Override // o4.f0
            public int transformedToOriginal(int offset) {
                return Math.max(offset - 1, 0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String countryCode) {
            super(null);
            s.k(countryCode, "countryCode");
            this.countryCode = countryCode;
            this.prefix = "";
            this.placeholder = "+############";
            this.visualTransformation = new z0() { // from class: i90.u0
                @Override // o4.z0
                public final TransformedText filter(d dVar) {
                    return t0.c.j(dVar);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TransformedText j(i4.d text) {
            s.k(text, "text");
            return new TransformedText(new i4.d(Marker.ANY_NON_NULL_MARKER + text.getText(), null, null, 6, null), new a());
        }

        @Override // p010i90.t0
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // p010i90.t0
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getPlaceholder() {
            return this.placeholder;
        }

        @Override // p010i90.t0
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getPrefix() {
            return this.prefix;
        }

        @Override // p010i90.t0
        /* JADX INFO: renamed from: f, reason: from getter */
        public z0 getVisualTransformation() {
            return this.visualTransformation;
        }

        @Override // p010i90.t0
        public String g(String input) {
            s.k(input, "input");
            return Marker.ANY_NON_NULL_MARKER + t.I1(h(input), '0');
        }

        @Override // p010i90.t0
        public String h(String input) throws IOException {
            s.k(input, "input");
            StringBuilder sb2 = new StringBuilder();
            int length = input.length();
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = input.charAt(i11);
                if (t0.INSTANCE.e().k(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            String string = sb2.toString();
            s.j(string, "toString(...)");
            String strSubstring = string.substring(0, Math.min(string.length(), 15));
            s.j(strSubstring, "substring(...)");
            return strSubstring;
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\r\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001b"}, d2 = {"Li90/t0$d;", "Li90/t0;", "Li90/t0$b;", OrcaKeys.METADATA, "<init>", "(Li90/t0$b;)V", "", "input", "h", "(Ljava/lang/String;)Ljava/lang/String;", "g", "filteredInput", "j", DateTokenConverter.CONVERTER_KEY, "Li90/t0$b;", "e", "Ljava/lang/String;", "()Ljava/lang/String;", "prefix", "f", "placeholder", "c", "countryCode", "Lo4/z0;", "Lo4/z0;", "()Lo4/z0;", "visualTransformation", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends t0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Metadata metadata;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String prefix;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String placeholder;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final String countryCode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final z0 visualTransformation;

        @p013kotlin.Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"i90/t0$d$a", "Lo4/z0;", "Li4/d;", "text", "Lo4/x0;", "filter", "(Li4/d;)Lo4/x0;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements z0 {

            /* JADX INFO: renamed from: i90.t0$d$a$a, reason: collision with other inner class name */
            @p013kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"i90/t0$d$a$a", "Lo4/f0;", "", "offset", "originalToTransformed", "(I)I", "transformedToOriginal", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class C1625a implements f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ d f76994a;

                C1625a(d dVar) {
                    this.f76994a = dVar;
                }

                @Override // o4.f0
                public int originalToTransformed(int offset) {
                    if (this.f76994a.metadata.getPattern() == null) {
                        return offset;
                    }
                    String pattern = this.f76994a.metadata.getPattern();
                    if (offset == 0) {
                        return 0;
                    }
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = -1;
                    for (int i14 = 0; i14 < pattern.length(); i14++) {
                        i11++;
                        if (pattern.charAt(i14) == '#' && (i12 = i12 + 1) == offset) {
                            i13 = i11;
                        }
                    }
                    return i13 == -1 ? pattern.length() + 1 + (offset - i12) : i13;
                }

                @Override // o4.f0
                public int transformedToOriginal(int offset) throws IOException {
                    if (this.f76994a.metadata.getPattern() == null) {
                        return offset;
                    }
                    if (offset == 0) {
                        return 0;
                    }
                    String pattern = this.f76994a.metadata.getPattern();
                    String strSubstring = pattern.substring(0, Math.min(offset, pattern.length()));
                    s.j(strSubstring, "substring(...)");
                    StringBuilder sb2 = new StringBuilder();
                    int length = strSubstring.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        char cCharAt = strSubstring.charAt(i11);
                        if (cCharAt != '#') {
                            sb2.append(cCharAt);
                        }
                    }
                    String string = sb2.toString();
                    s.j(string, "toString(...)");
                    int length2 = string.length();
                    if (offset > pattern.length()) {
                        length2++;
                    }
                    return offset - length2;
                }
            }

            a() {
            }

            @Override // o4.z0
            public TransformedText filter(i4.d text) {
                s.k(text, "text");
                return new TransformedText(new i4.d(d.this.j(text.getText()), null, null, 6, null), new C1625a(d.this));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Metadata metadata) {
            String strU;
            super(null);
            s.k(metadata, "metadata");
            this.metadata = metadata;
            this.prefix = metadata.getPrefix();
            String pattern = metadata.getPattern();
            this.placeholder = (pattern == null || (strU = t.U(pattern, '#', '5', false, 4, null)) == null) ? "" : strU;
            this.countryCode = metadata.getRegionCode();
            this.visualTransformation = new a();
        }

        @Override // p010i90.t0
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // p010i90.t0
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getPlaceholder() {
            return this.placeholder;
        }

        @Override // p010i90.t0
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getPrefix() {
            return this.prefix;
        }

        @Override // p010i90.t0
        /* JADX INFO: renamed from: f, reason: from getter */
        public z0 getVisualTransformation() {
            return this.visualTransformation;
        }

        @Override // p010i90.t0
        public String g(String input) {
            s.k(input, "input");
            return getPrefix() + t.I1(h(input), '0');
        }

        @Override // p010i90.t0
        public String h(String input) throws IOException {
            s.k(input, "input");
            StringBuilder sb2 = new StringBuilder();
            int length = input.length();
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = input.charAt(i11);
                if (t0.INSTANCE.e().k(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            String string = sb2.toString();
            s.j(string, "toString(...)");
            String strSubstring = string.substring(0, Math.min(string.length(), 15));
            s.j(strSubstring, "substring(...)");
            return strSubstring;
        }

        public final String j(String filteredInput) {
            s.k(filteredInput, "filteredInput");
            if (this.metadata.getPattern() == null) {
                return filteredInput;
            }
            StringBuilder sb2 = new StringBuilder();
            String pattern = this.metadata.getPattern();
            int i11 = 0;
            for (int i12 = 0; i12 < pattern.length(); i12++) {
                char cCharAt = pattern.charAt(i12);
                if (i11 < filteredInput.length()) {
                    if (cCharAt == '#') {
                        cCharAt = filteredInput.charAt(i11);
                        i11++;
                    }
                    sb2.append(cCharAt);
                }
            }
            if (i11 < filteredInput.length()) {
                sb2.append(' ');
                String strSubstring = filteredInput.substring(i11);
                s.j(strSubstring, "substring(...)");
                char[] charArray = strSubstring.toCharArray();
                s.j(charArray, "toCharArray(...)");
                sb2.append(charArray);
            }
            String string = sb2.toString();
            s.j(string, "toString(...)");
            return string;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i11 = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        int i12 = 4;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        String str2 = null;
        int i13 = 4;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        String str3 = null;
        int i14 = 4;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        String str4 = null;
        f76980c = v0.m(x.a("US", new Metadata("+1", "US", "(###) ###-####")), x.a("CA", new Metadata("+1", "CA", "(###) ###-####")), x.a("AG", new Metadata("+1", "AG", "(###) ###-####")), x.a("AS", new Metadata("+1", "AS", "(###) ###-####")), x.a("AI", new Metadata("+1", "AI", "(###) ###-####")), x.a("BB", new Metadata("+1", "BB", "(###) ###-####")), x.a("BM", new Metadata("+1", "BM", "(###) ###-####")), x.a("BS", new Metadata("+1", "BS", "(###) ###-####")), x.a("DM", new Metadata("+1", "DM", "(###) ###-####")), x.a("DO", new Metadata("+1", "DO", "(###) ###-####")), x.a("GD", new Metadata("+1", "GD", "(###) ###-####")), x.a("GU", new Metadata("+1", "GU", "(###) ###-####")), x.a("JM", new Metadata("+1", "JM", "(###) ###-####")), x.a("KN", new Metadata("+1", "KN", "(###) ###-####")), x.a("KY", new Metadata("+1", "KY", "(###) ###-####")), x.a("LC", new Metadata("+1", "LC", "(###) ###-####")), x.a("MP", new Metadata("+1", "MP", "(###) ###-####")), x.a("MS", new Metadata("+1", "MS", "(###) ###-####")), x.a("PR", new Metadata("+1", "PR", "(###) ###-####")), x.a("SX", new Metadata("+1", "SX", "(###) ###-####")), x.a("TC", new Metadata("+1", "TC", "(###) ###-####")), x.a("TT", new Metadata("+1", "TT", "(###) ###-####")), x.a("VC", new Metadata("+1", "VC", "(###) ###-####")), x.a("VG", new Metadata("+1", "VG", "(###) ###-####")), x.a("VI", new Metadata("+1", "VI", "(###) ###-####")), x.a("EG", new Metadata("+20", "EG", "### ### ####")), x.a("SS", new Metadata("+211", "SS", "### ### ###")), x.a("MA", new Metadata("+212", "MA", "###-######")), x.a("EH", new Metadata("+212", "EH", "###-######")), x.a("DZ", new Metadata("+213", "DZ", "### ## ## ##")), x.a("TN", new Metadata("+216", "TN", "## ### ###")), x.a("LY", new Metadata("+218", "LY", "##-#######")), x.a("GM", new Metadata("+220", "GM", "### ####")), x.a("SN", new Metadata("+221", "SN", "## ### ## ##")), x.a("MR", new Metadata("+222", "MR", "## ## ## ##")), x.a("ML", new Metadata("+223", "ML", "## ## ## ##")), x.a("GN", new Metadata("+224", "GN", "### ## ## ##")), x.a("CI", new Metadata("+225", "CI", "## ## ## ##")), x.a("BF", new Metadata("+226", "BF", "## ## ## ##")), x.a("NE", new Metadata("+227", "NE", "## ## ## ##")), x.a("TG", new Metadata("+228", "TG", "## ## ## ##")), x.a("BJ", new Metadata("+229", "BJ", "## ## ## ##")), x.a("MU", new Metadata("+230", "MU", "#### ####")), x.a("LR", new Metadata("+231", "LR", "### ### ###")), x.a("SL", new Metadata("+232", "SL", "## ######")), x.a("GH", new Metadata("+233", "GH", "## ### ####")), x.a("NG", new Metadata("+234", "NG", "### ### ####")), x.a("TD", new Metadata("+235", "TD", "## ## ## ##")), x.a("CF", new Metadata("+236", "CF", "## ## ## ##")), x.a("CM", new Metadata("+237", "CM", "## ## ## ##")), x.a("CV", new Metadata("+238", "CV", "### ## ##")), x.a("ST", new Metadata("+239", "ST", "### ####")), x.a("GQ", new Metadata("+240", "GQ", "### ### ###")), x.a("GA", new Metadata("+241", "GA", "## ## ## ##")), x.a("CG", new Metadata("+242", "CG", "## ### ####")), x.a("CD", new Metadata("+243", "CD", "### ### ###")), x.a("AO", new Metadata("+244", "AO", "### ### ###")), x.a("GW", new Metadata("+245", "GW", "### ####")), x.a("IO", new Metadata("+246", "IO", "### ####")), x.a("AC", new Metadata("+247", "AC", null, 4, null)), x.a(BouncyCastleProvider.PROVIDER_NAME, new Metadata("+248", BouncyCastleProvider.PROVIDER_NAME, "# ### ###")), x.a("RW", new Metadata("+250", "RW", "### ### ###")), x.a("ET", new Metadata("+251", "ET", "## ### ####")), x.a("SO", new Metadata("+252", "SO", "## #######")), x.a("DJ", new Metadata("+253", "DJ", "## ## ## ##")), x.a("KE", new Metadata("+254", "KE", "## #######")), x.a("TZ", new Metadata("+255", "TZ", "### ### ###")), x.a("UG", new Metadata("+256", "UG", "### ######")), x.a("BI", new Metadata("+257", "BI", "## ## ## ##")), x.a("MZ", new Metadata("+258", "MZ", "## ### ####")), x.a("ZM", new Metadata("+260", "ZM", "## #######")), x.a("MG", new Metadata("+261", "MG", "## ## ### ##")), x.a("RE", new Metadata("+262", "RE", str, i11, defaultConstructorMarker)), x.a("TF", new Metadata("+262", "TF", str, i11, defaultConstructorMarker)), x.a("YT", new Metadata("+262", "YT", "### ## ## ##")), x.a("ZW", new Metadata("+263", "ZW", "## ### ####")), x.a("NA", new Metadata("+264", "NA", "## ### ####")), x.a("MW", new Metadata("+265", "MW", "### ## ## ##")), x.a("LS", new Metadata("+266", "LS", "#### ####")), x.a("BW", new Metadata("+267", "BW", "## ### ###")), x.a("SZ", new Metadata("+268", "SZ", "#### ####")), x.a("KM", new Metadata("+269", "KM", "### ## ##")), x.a("ZA", new Metadata("+27", "ZA", "## ### ####")), x.a("SH", new Metadata("+290", "SH", str2, i12, defaultConstructorMarker2)), x.a("TA", new Metadata("+290", "TA", str2, i12, defaultConstructorMarker2)), x.a("ER", new Metadata("+291", "ER", "# ### ###")), x.a("AW", new Metadata("+297", "AW", "### ####")), x.a("FO", new Metadata("+298", "FO", "######")), x.a("GL", new Metadata("+299", "GL", "## ## ##")), x.a("GR", new Metadata("+30", "GR", "### ### ####")), x.a("NL", new Metadata("+31", "NL", "# ########")), x.a("BE", new Metadata("+32", "BE", "### ## ## ##")), x.a("FR", new Metadata("+33", "FR", "# ## ## ## ##")), x.a("ES", new Metadata("+34", "ES", "### ## ## ##")), x.a("GI", new Metadata("+350", "GI", "### #####")), x.a("PT", new Metadata("+351", "PT", "### ### ###")), x.a("LU", new Metadata("+352", "LU", "## ## ## ###")), x.a("IE", new Metadata("+353", "IE", "## ### ####")), x.a("IS", new Metadata("+354", "IS", "### ####")), x.a("AL", new Metadata("+355", "AL", "## ### ####")), x.a("MT", new Metadata("+356", "MT", "#### ####")), x.a("CY", new Metadata("+357", "CY", "## ######")), x.a("FI", new Metadata("+358", "FI", "## ### ## ##")), x.a("AX", new Metadata("+358", "AX", null, 4, null)), x.a("BG", new Metadata("+359", "BG", "### ### ##")), x.a("HU", new Metadata("+36", "HU", "## ### ####")), x.a("LT", new Metadata("+370", "LT", "### #####")), x.a("LV", new Metadata("+371", "LV", "## ### ###")), x.a("EE", new Metadata("+372", "EE", "#### ####")), x.a("MD", new Metadata("+373", "MD", "### ## ###")), x.a("AM", new Metadata("+374", "AM", "## ######")), x.a("BY", new Metadata("+375", "BY", "## ###-##-##")), x.a("AD", new Metadata("+376", "AD", "### ###")), x.a("MC", new Metadata("+377", "MC", "# ## ## ## ##")), x.a("SM", new Metadata("+378", "SM", "## ## ## ##")), x.a("VA", new Metadata("+379", "VA", null, 4, null)), x.a("UA", new Metadata("+380", "UA", "## ### ####")), x.a("RS", new Metadata("+381", "RS", "## #######")), x.a("ME", new Metadata("+382", "ME", "## ### ###")), x.a("XK", new Metadata("+383", "XK", "## ### ###")), x.a("HR", new Metadata("+385", "HR", "## ### ####")), x.a("SI", new Metadata("+386", "SI", "## ### ###")), x.a("BA", new Metadata("+387", "BA", "## ###-###")), x.a("MK", new Metadata("+389", "MK", "## ### ###")), x.a("IT", new Metadata("+39", "IT", "## #### ####")), x.a("RO", new Metadata("+40", "RO", "## ### ####")), x.a("CH", new Metadata("+41", "CH", "## ### ## ##")), x.a("CZ", new Metadata("+420", "CZ", "### ### ###")), x.a("SK", new Metadata("+421", "SK", "### ### ###")), x.a("LI", new Metadata("+423", "LI", "### ### ###")), x.a("AT", new Metadata("+43", "AT", "### ######")), x.a("GB", new Metadata("+44", "GB", "#### ######")), x.a("GG", new Metadata("+44", "GG", "#### ######")), x.a("JE", new Metadata("+44", "JE", "#### ######")), x.a("IM", new Metadata("+44", "IM", "#### ######")), x.a("DK", new Metadata("+45", "DK", "## ## ## ##")), x.a("SE", new Metadata("+46", "SE", "##-### ## ##")), x.a("NO", new Metadata("+47", "NO", "### ## ###")), x.a("BV", new Metadata("+47", "BV", null, 4, null)), x.a("SJ", new Metadata("+47", "SJ", "## ## ## ##")), x.a("PL", new Metadata("+48", "PL", "## ### ## ##")), x.a("DE", new Metadata("+49", "DE", "### #######")), x.a("FK", new Metadata("+500", "FK", str3, i13, defaultConstructorMarker3)), x.a("GS", new Metadata("+500", "GS", str3, i13, defaultConstructorMarker3)), x.a("BZ", new Metadata("+501", "BZ", "###-####")), x.a("GT", new Metadata("+502", "GT", "#### ####")), x.a("SV", new Metadata("+503", "SV", "#### ####")), x.a("HN", new Metadata("+504", "HN", "####-####")), x.a("NI", new Metadata("+505", "NI", "#### ####")), x.a("CR", new Metadata("+506", "CR", "#### ####")), x.a("PA", new Metadata("+507", "PA", "####-####")), x.a("PM", new Metadata("+508", "PM", "## ## ##")), x.a("HT", new Metadata("+509", "HT", "## ## ####")), x.a("PE", new Metadata("+51", "PE", "### ### ###")), x.a("MX", new Metadata("+52", "MX", "### ### ####")), x.a("CY", new Metadata("+537", "CY", null, 4, null)), x.a("AR", new Metadata("+54", "AR", "## ##-####-####")), x.a("BR", new Metadata("+55", "BR", "## #####-####")), x.a("CL", new Metadata("+56", "CL", "# #### ####")), x.a("CO", new Metadata("+57", "CO", "### #######")), x.a("VE", new Metadata("+58", "VE", "###-#######")), x.a("BL", new Metadata("+590", "BL", "### ## ## ##")), x.a("MF", new Metadata("+590", "MF", null, 4, null)), x.a("GP", new Metadata("+590", "GP", "### ## ## ##")), x.a("BO", new Metadata("+591", "BO", "########")), x.a("GY", new Metadata("+592", "GY", "### ####")), x.a("EC", new Metadata("+593", "EC", "## ### ####")), x.a("GF", new Metadata("+594", "GF", "### ## ## ##")), x.a("PY", new Metadata("+595", "PY", "## #######")), x.a("MQ", new Metadata("+596", "MQ", "### ## ## ##")), x.a("SR", new Metadata("+597", "SR", "###-####")), x.a("UY", new Metadata("+598", "UY", "#### ####")), x.a("CW", new Metadata("+599", "CW", "# ### ####")), x.a("BQ", new Metadata("+599", "BQ", "### ####")), x.a("MY", new Metadata("+60", "MY", "##-### ####")), x.a("AU", new Metadata("+61", "AU", "### ### ###")), x.a("ID", new Metadata("+62", "ID", "###-###-###")), x.a("PH", new Metadata("+63", "PH", "#### ######")), x.a("NZ", new Metadata("+64", "NZ", "## ### ####")), x.a("SG", new Metadata("+65", "SG", "#### ####")), x.a("TH", new Metadata("+66", "TH", "## ### ####")), x.a("TL", new Metadata("+670", "TL", "#### ####")), x.a("AQ", new Metadata("+672", "AQ", "## ####")), x.a("BN", new Metadata("+673", "BN", "### ####")), x.a("NR", new Metadata("+674", "NR", "### ####")), x.a("PG", new Metadata("+675", "PG", "### ####")), x.a("TO", new Metadata("+676", "TO", "### ####")), x.a("SB", new Metadata("+677", "SB", "### ####")), x.a("VU", new Metadata("+678", "VU", "### ####")), x.a("FJ", new Metadata("+679", "FJ", "### ####")), x.a("WF", new Metadata("+681", "WF", "## ## ##")), x.a("CK", new Metadata("+682", "CK", "## ###")), x.a("NU", new Metadata("+683", "NU", str4, i14, defaultConstructorMarker4)), x.a("WS", new Metadata("+685", "WS", str4, i14, defaultConstructorMarker4)), x.a("KI", new Metadata("+686", "KI", str4, i14, defaultConstructorMarker4)), x.a("NC", new Metadata("+687", "NC", "########")), x.a("TV", new Metadata("+688", "TV", null, 4, null)), x.a("PF", new Metadata("+689", "PF", "## ## ##")), x.a("TK", new Metadata("+690", "TK", null, 4, null)), x.a("RU", new Metadata("+7", "RU", "### ###-##-##")), x.a("KZ", new Metadata("+7", "KZ", 0 == true ? 1 : 0, 4, null)), x.a("JP", new Metadata("+81", "JP", "##-####-####")), x.a("KR", new Metadata("+82", "KR", "##-####-####")), x.a("VN", new Metadata("+84", "VN", "## ### ## ##")), x.a("HK", new Metadata("+852", "HK", "#### ####")), x.a("MO", new Metadata("+853", "MO", "#### ####")), x.a("KH", new Metadata("+855", "KH", "## ### ###")), x.a("LA", new Metadata("+856", "LA", "## ## ### ###")), x.a("CN", new Metadata("+86", "CN", "### #### ####")), x.a("PN", new Metadata("+872", "PN", null, 4, null)), x.a("BD", new Metadata("+880", "BD", "####-######")), x.a("TW", new Metadata("+886", "TW", "### ### ###")), x.a("TR", new Metadata("+90", "TR", "### ### ####")), x.a("IN", new Metadata("+91", "IN", "## ## ######")), x.a("PK", new Metadata("+92", "PK", "### #######")), x.a("AF", new Metadata("+93", "AF", "## ### ####")), x.a("LK", new Metadata("+94", "LK", "## # ######")), x.a("MM", new Metadata("+95", "MM", "# ### ####")), x.a("MV", new Metadata("+960", "MV", "###-####")), x.a("LB", new Metadata("+961", "LB", "## ### ###")), x.a("JO", new Metadata("+962", "JO", "# #### ####")), x.a("IQ", new Metadata("+964", "IQ", "### ### ####")), x.a("KW", new Metadata("+965", "KW", "### #####")), x.a("SA", new Metadata("+966", "SA", "## ### ####")), x.a("YE", new Metadata("+967", "YE", "### ### ###")), x.a("OM", new Metadata("+968", "OM", "#### ####")), x.a("PS", new Metadata("+970", "PS", "### ### ###")), x.a("AE", new Metadata("+971", "AE", "## ### ####")), x.a("IL", new Metadata("+972", "IL", "##-###-####")), x.a("BH", new Metadata("+973", "BH", "#### ####")), x.a("QA", new Metadata("+974", "QA", "#### ####")), x.a("BT", new Metadata("+975", "BT", "## ## ## ##")), x.a("MN", new Metadata("+976", "MN", "#### ####")), x.a("NP", new Metadata("+977", "NP", "###-#######")), x.a("TJ", new Metadata("+992", "TJ", "### ## ####")), x.a("TM", new Metadata("+993", "TM", "## ##-##-##")), x.a("AZ", new Metadata("+994", "AZ", "## ### ## ##")), x.a("GE", new Metadata("+995", "GE", "### ## ## ##")), x.a("KG", new Metadata("+996", "KG", "### ### ###")), x.a("UZ", new Metadata("+998", "UZ", "## ### ## ##")));
    }

    public /* synthetic */ t0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: c */
    public abstract String getCountryCode();

    /* JADX INFO: renamed from: d */
    public abstract String getPlaceholder();

    /* JADX INFO: renamed from: e */
    public abstract String getPrefix();

    /* JADX INFO: renamed from: f */
    public abstract z0 getVisualTransformation();

    public abstract String g(String input);

    public abstract String h(String input);

    private t0() {
    }

    /* JADX INFO: renamed from: i90.t0$b, reason: from toString */
    @p013kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, d2 = {"Li90/t0$b;", "", "", "prefix", "regionCode", "pattern", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Metadata {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String prefix;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String regionCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String pattern;

        public Metadata(String prefix, String regionCode, String str) {
            s.k(prefix, "prefix");
            s.k(regionCode, "regionCode");
            this.prefix = prefix;
            this.regionCode = regionCode;
            this.pattern = str;
            if (str != null && str.length() <= 0) {
                throw new IllegalArgumentException("Pattern should not be empty. Set it to null if it's missing.");
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPattern() {
            return this.pattern;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPrefix() {
            return this.prefix;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getRegionCode() {
            return this.regionCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) other;
            return s.f(this.prefix, metadata.prefix) && s.f(this.regionCode, metadata.regionCode) && s.f(this.pattern, metadata.pattern);
        }

        public int hashCode() {
            int iHashCode = ((this.prefix.hashCode() * 31) + this.regionCode.hashCode()) * 31;
            String str = this.pattern;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Metadata(prefix=" + this.prefix + ", regionCode=" + this.regionCode + ", pattern=" + this.pattern + ")";
        }

        public /* synthetic */ Metadata(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : str3);
        }
    }
}
