package pi0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: pi0.c, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0019\u0010\n¨\u0006\u001a"}, d2 = {"Lpi0/c;", "", "", "prefix", "countryCode", "pattern", "defaultFlagEmoji", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "c", "()Ljava/lang/String;", "b", DateTokenConverter.CONVERTER_KEY, "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "getPattern", "getDefaultFlagEmoji", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CountryCodeMetadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String prefix;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pattern;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String defaultFlagEmoji;

    public CountryCodeMetadata(String prefix, String countryCode, String str, String defaultFlagEmoji) {
        s.k(prefix, "prefix");
        s.k(countryCode, "countryCode");
        s.k(defaultFlagEmoji, "defaultFlagEmoji");
        this.prefix = prefix;
        this.countryCode = countryCode;
        this.pattern = str;
        this.defaultFlagEmoji = defaultFlagEmoji;
    }

    private final String b() {
        String displayCountry = new Locale("", this.countryCode).getDisplayCountry(Locale.getDefault());
        s.j(displayCountry, "getDisplayCountry(...)");
        return displayCountry;
    }

    private final String c() {
        if (this.countryCode.length() != 2) {
            return this.defaultFlagEmoji;
        }
        String str = this.countryCode;
        Locale locale = Locale.getDefault();
        s.j(locale, "getDefault(...)");
        String upperCase = str.toUpperCase(locale);
        s.j(upperCase, "toUpperCase(...)");
        int iCodePointAt = Character.codePointAt(upperCase, 0) - (-127397);
        int iCodePointAt2 = Character.codePointAt(upperCase, 1) - (-127397);
        char[] chars = Character.toChars(iCodePointAt);
        s.j(chars, "toChars(...)");
        char[] chars2 = Character.toChars(iCodePointAt2);
        s.j(chars2, "toChars(...)");
        return new String(p013kotlin.collections.n.H(chars, chars2));
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String d() {
        return c() + " " + b() + " " + this.prefix;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPrefix() {
        return this.prefix;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryCodeMetadata)) {
            return false;
        }
        CountryCodeMetadata countryCodeMetadata = (CountryCodeMetadata) other;
        return s.f(this.prefix, countryCodeMetadata.prefix) && s.f(this.countryCode, countryCodeMetadata.countryCode) && s.f(this.pattern, countryCodeMetadata.pattern) && s.f(this.defaultFlagEmoji, countryCodeMetadata.defaultFlagEmoji);
    }

    public int hashCode() {
        int iHashCode = ((this.prefix.hashCode() * 31) + this.countryCode.hashCode()) * 31;
        String str = this.pattern;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.defaultFlagEmoji.hashCode();
    }

    public String toString() {
        return "CountryCodeMetadata(prefix=" + this.prefix + ", countryCode=" + this.countryCode + ", pattern=" + this.pattern + ", defaultFlagEmoji=" + this.defaultFlagEmoji + ")";
    }

    public /* synthetic */ CountryCodeMetadata(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? "🌐" : str4);
    }
}
