package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import o30.e;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import t30.CountryCode;
import t30.d;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010 \n\u0002\b\n\b\u0007\u0018\u0000 62\u00020\u0001:\u0001\u001eBa\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010 R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010'\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010,\u001a\u00020\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b(\u00100R \u00103\u001a\b\u0012\u0004\u0012\u00020\u00030-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b\u001a\u00100R \u00105\u001a\b\u0012\u0004\u0012\u00020\u00030-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b\"\u00100¨\u00067"}, d2 = {"Li90/t;", "Li90/x;", "", "", "onlyShowCountryCodes", "Ljava/util/Locale;", "locale", "", "tinyMode", "disableDropdownWithSingleElement", "Lkotlin/Function1;", "Lt30/a;", "collapsedLabelMapper", "expandedLabelMapper", "<init>", "(Ljava/util/Set;Ljava/util/Locale;ZZLwn0/l;Lwn0/l;)V", "", "index", "f", "(I)Ljava/lang/String;", "rawValue", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Set;", "getOnlyShowCountryCodes", "()Ljava/util/Set;", "b", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "c", "Z", "()Z", DateTokenConverter.CONVERTER_KEY, "e", "Lwn0/l;", "Ljava/lang/String;", "getDebugLabel", "()Ljava/lang/String;", "debugLabel", "g", "I", "getLabel", "()I", AnnotatedPrivateKey.LABEL, "", "h", "Ljava/util/List;", "()Ljava/util/List;", "countries", IntegerTokenConverter.CONVERTER_KEY, "rawItems", "j", "displayItems", "k", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class t implements x {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f76965l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<String> onlyShowCountryCodes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Locale locale;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean tinyMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean disableDropdownWithSingleElement;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l<t30.a, String> collapsedLabelMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String debugLabel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int label;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<t30.a> countries;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<String> rawItems;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<String> displayItems;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt30/a;", PlaceTypes.COUNTRY, "", "a", "(Lt30/a;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    public static final class a extends u implements l<t30.a, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f76976c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(t30.a country) {
            s.k(country, "country");
            return country.getName();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt30/a;", PlaceTypes.COUNTRY, "", "a", "(Lt30/a;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    public static final class b extends u implements l<t30.a, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f76977c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(t30.a country) {
            s.k(country, "country");
            return t.INSTANCE.a(country.b().getValue()) + " " + country.getName();
        }
    }

    /* JADX INFO: renamed from: i90.t$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li90/t$c;", "", "<init>", "()V", "", "countryCode", "a", "(Ljava/lang/String;)Ljava/lang/String;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String countryCode) {
            s.k(countryCode, "countryCode");
            if (countryCode.length() != 2) {
                return "🌐";
            }
            int iCodePointAt = Character.codePointAt(countryCode, 0) - (-127397);
            int iCodePointAt2 = Character.codePointAt(countryCode, 1) - (-127397);
            char[] chars = Character.toChars(iCodePointAt);
            s.j(chars, "toChars(...)");
            char[] chars2 = Character.toChars(iCodePointAt2);
            s.j(chars2, "toChars(...)");
            return new String(n.H(chars, chars2));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(Set<String> onlyShowCountryCodes, Locale locale, boolean z11, boolean z12, l<? super t30.a, String> collapsedLabelMapper, l<? super t30.a, String> expandedLabelMapper) {
        s.k(onlyShowCountryCodes, "onlyShowCountryCodes");
        s.k(locale, "locale");
        s.k(collapsedLabelMapper, "collapsedLabelMapper");
        s.k(expandedLabelMapper, "expandedLabelMapper");
        this.onlyShowCountryCodes = onlyShowCountryCodes;
        this.locale = locale;
        this.tinyMode = z11;
        this.disableDropdownWithSingleElement = z12;
        this.collapsedLabelMapper = collapsedLabelMapper;
        this.debugLabel = PlaceTypes.COUNTRY;
        this.label = e.f96365c;
        List listF = d.f112276a.f(locale);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            t30.a aVar = (t30.a) obj;
            if (this.onlyShowCountryCodes.isEmpty() || this.onlyShowCountryCodes.contains(aVar.b().getValue())) {
                arrayList.add(obj);
            }
        }
        this.countries = arrayList;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(v.y(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((t30.a) it.next()).b().getValue());
        }
        this.rawItems = arrayList3;
        List<t30.a> list = this.countries;
        ArrayList arrayList4 = new ArrayList(v.y(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(expandedLabelMapper.invoke(it2.next()));
        }
        this.displayItems = arrayList4;
    }

    @Override // p010i90.x
    public String a(String rawValue) {
        s.k(rawValue, "rawValue");
        d dVar = d.f112276a;
        CountryCode countryCodeA = CountryCode.INSTANCE.a(rawValue);
        Locale locale = Locale.getDefault();
        s.j(locale, "getDefault(...)");
        t30.a aVarD = dVar.d(countryCodeA, locale);
        if (aVarD != null) {
            Integer numValueOf = Integer.valueOf(this.countries.indexOf(aVarD));
            String str = null;
            if (numValueOf.intValue() == -1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                str = e().get(numValueOf.intValue());
            }
            if (str != null) {
                return str;
            }
        }
        String str2 = (String) v.q0(e());
        return str2 == null ? "" : str2;
    }

    @Override // p010i90.x
    public List<String> b() {
        return this.rawItems;
    }

    @Override // p010i90.x
    /* JADX INFO: renamed from: c, reason: from getter */
    public boolean getTinyMode() {
        return this.tinyMode;
    }

    @Override // p010i90.x
    /* JADX INFO: renamed from: d, reason: from getter */
    public boolean getDisableDropdownWithSingleElement() {
        return this.disableDropdownWithSingleElement;
    }

    @Override // p010i90.x
    public List<String> e() {
        return this.displayItems;
    }

    @Override // p010i90.x
    public String f(int index) {
        String strInvoke;
        t30.a aVar = (t30.a) v.r0(this.countries, index);
        return (aVar == null || (strInvoke = this.collapsedLabelMapper.invoke(aVar)) == null) ? "" : strInvoke;
    }

    public final List<t30.a> g() {
        return this.countries;
    }

    @Override // p010i90.x
    public int getLabel() {
        return this.label;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ t(Set set, Locale locale, boolean z11, boolean z12, l lVar, l lVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        set = (i11 & 1) != 0 ? d1.d() : set;
        if ((i11 & 2) != 0) {
            locale = Locale.getDefault();
            s.j(locale, "getDefault(...)");
        }
        this(set, locale, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? a.f76976c : lVar, (i11 & 32) != 0 ? b.f76977c : lVar2);
    }
}
