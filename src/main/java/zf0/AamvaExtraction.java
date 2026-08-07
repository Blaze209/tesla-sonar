package zf0;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.scanners.config.orca.workflow.WorkflowKeys;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: zf0.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u0000 72\u00020\u0001:\u0001\u001dB¯\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b/\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u001e\u001a\u0004\b1\u0010\u0015R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u001e\u001a\u0004\b:\u0010\u0015¨\u0006;"}, d2 = {"Lzf0/a;", "", "", "idClass", "nameFirst", "nameMiddle", "nameLast", "sex", "addressStreet1", "addressCity", "addressState", "addressPostalCode", "identificationNumber", "Ljava/util/Date;", "issueDate", "expirationDate", "birthdate", WorkflowKeys.ISSUING_COUNTRY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getIdClass", "b", "getNameFirst", "c", "getNameMiddle", DateTokenConverter.CONVERTER_KEY, "getNameLast", "e", "getSex", "f", "getAddressStreet1", "g", "getAddressCity", "h", "getAddressState", IntegerTokenConverter.CONVERTER_KEY, "getAddressPostalCode", "j", "getIdentificationNumber", "k", "Ljava/util/Date;", "getIssueDate", "()Ljava/util/Date;", "l", "o", "m", "n", "getIssuingCountry", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AamvaExtraction {
    private static final p013kotlin.text.q A;
    private static final p013kotlin.text.q B;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final p013kotlin.text.q f128140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final p013kotlin.text.q f128141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final p013kotlin.text.q f128142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final p013kotlin.text.q f128143s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final p013kotlin.text.q f128144t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final p013kotlin.text.q f128145u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final p013kotlin.text.q f128146v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final p013kotlin.text.q f128147w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final p013kotlin.text.q f128148x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final p013kotlin.text.q f128149y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final p013kotlin.text.q f128150z;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String idClass;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nameFirst;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nameMiddle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nameLast;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sex;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressStreet1;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressCity;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressState;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressPostalCode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String identificationNumber;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date issueDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date expirationDate;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date birthdate;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String issuingCountry;

    /* JADX INFO: renamed from: zf0.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019¨\u0006&"}, d2 = {"Lzf0/a$a;", "", "<init>", "()V", "", Action.KEY_ATTRIBUTE, "Lkotlin/text/q;", "c", "(Ljava/lang/String;)Lkotlin/text/q;", "rawText", "fieldPattern", "e", "(Ljava/lang/String;Lkotlin/text/q;)Ljava/lang/String;", "value", "Ljava/util/Date;", "b", "(Ljava/lang/String;)Ljava/util/Date;", "barcodeText", "", "f", "(Ljava/lang/String;)Z", "Lzf0/a;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Lzf0/a;", "CITY", "Lkotlin/text/q;", "STATE", "STREET", "ZIP", "BIRTH_DATE", "EXPIRY_DATE", "FIRST_NAME", "GENDER", "ISSUE_DATE", "ISSUING_COUNTRY", "LAST_NAME", "LICENSE_NUMBER", "MIDDLE_NAME", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Date b(String value) {
            if (value == null) {
                return null;
            }
            try {
                return new SimpleDateFormat("MMddyyyy", Locale.US).parse(value);
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final p013kotlin.text.q c(String key) {
            return new p013kotlin.text.q("\n" + key + "(.+?)(\n|$)");
        }

        private final String e(String rawText, p013kotlin.text.q fieldPattern) {
            List<String> listC;
            p013kotlin.text.m mVarD = p013kotlin.text.q.d(fieldPattern, rawText, 0, 2, null);
            if (mVarD == null || (listC = mVarD.c()) == null) {
                return null;
            }
            return (String) p013kotlin.collections.v.r0(listC, 1);
        }

        private final boolean f(String barcodeText) {
            return (!new p013kotlin.text.q("^@\n\\u001e\r(ANSI |AAMVA)\\d{10}.+", p013kotlin.text.s.DOT_MATCHES_ALL).i(p013kotlin.text.t.F1(barcodeText).toString()) || e(barcodeText, AamvaExtraction.f128146v) == null || e(barcodeText, AamvaExtraction.f128150z) == null) ? false : true;
        }

        public final AamvaExtraction d(String rawText) {
            if (rawText == null || !f(rawText)) {
                return null;
            }
            return new AamvaExtraction(null, e(rawText, AamvaExtraction.f128146v), e(rawText, AamvaExtraction.B), e(rawText, AamvaExtraction.f128150z), e(rawText, AamvaExtraction.f128147w), e(rawText, AamvaExtraction.f128142r), e(rawText, AamvaExtraction.f128140p), e(rawText, AamvaExtraction.f128141q), e(rawText, AamvaExtraction.f128143s), e(rawText, AamvaExtraction.A), b(e(rawText, AamvaExtraction.f128148x)), b(e(rawText, AamvaExtraction.f128145u)), b(e(rawText, AamvaExtraction.f128144t)), e(rawText, AamvaExtraction.f128149y), 1, null);
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f128140p = companion.c("DAI");
        f128141q = companion.c("DAJ");
        f128142r = companion.c("DAG");
        f128143s = companion.c("DAK");
        f128144t = companion.c("DBB");
        f128145u = companion.c("DBA");
        f128146v = companion.c("DAC");
        f128147w = companion.c("DBC");
        f128148x = companion.c("DBD");
        f128149y = companion.c("DCG");
        f128150z = companion.c("DCS");
        A = companion.c("DAQ");
        B = companion.c("DAD");
    }

    public AamvaExtraction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Date date, Date date2, Date date3, String str11) {
        this.idClass = str;
        this.nameFirst = str2;
        this.nameMiddle = str3;
        this.nameLast = str4;
        this.sex = str5;
        this.addressStreet1 = str6;
        this.addressCity = str7;
        this.addressState = str8;
        this.addressPostalCode = str9;
        this.identificationNumber = str10;
        this.issueDate = date;
        this.expirationDate = date2;
        this.birthdate = date3;
        this.issuingCountry = str11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AamvaExtraction)) {
            return false;
        }
        AamvaExtraction aamvaExtraction = (AamvaExtraction) other;
        return p013kotlin.jvm.internal.s.f(this.idClass, aamvaExtraction.idClass) && p013kotlin.jvm.internal.s.f(this.nameFirst, aamvaExtraction.nameFirst) && p013kotlin.jvm.internal.s.f(this.nameMiddle, aamvaExtraction.nameMiddle) && p013kotlin.jvm.internal.s.f(this.nameLast, aamvaExtraction.nameLast) && p013kotlin.jvm.internal.s.f(this.sex, aamvaExtraction.sex) && p013kotlin.jvm.internal.s.f(this.addressStreet1, aamvaExtraction.addressStreet1) && p013kotlin.jvm.internal.s.f(this.addressCity, aamvaExtraction.addressCity) && p013kotlin.jvm.internal.s.f(this.addressState, aamvaExtraction.addressState) && p013kotlin.jvm.internal.s.f(this.addressPostalCode, aamvaExtraction.addressPostalCode) && p013kotlin.jvm.internal.s.f(this.identificationNumber, aamvaExtraction.identificationNumber) && p013kotlin.jvm.internal.s.f(this.issueDate, aamvaExtraction.issueDate) && p013kotlin.jvm.internal.s.f(this.expirationDate, aamvaExtraction.expirationDate) && p013kotlin.jvm.internal.s.f(this.birthdate, aamvaExtraction.birthdate) && p013kotlin.jvm.internal.s.f(this.issuingCountry, aamvaExtraction.issuingCountry);
    }

    public int hashCode() {
        String str = this.idClass;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nameFirst;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nameMiddle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nameLast;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sex;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.addressStreet1;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.addressCity;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.addressState;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addressPostalCode;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.identificationNumber;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Date date = this.issueDate;
        int iHashCode11 = (iHashCode10 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expirationDate;
        int iHashCode12 = (iHashCode11 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.birthdate;
        int iHashCode13 = (iHashCode12 + (date3 == null ? 0 : date3.hashCode())) * 31;
        String str11 = this.issuingCountry;
        return iHashCode13 + (str11 != null ? str11.hashCode() : 0);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Date getBirthdate() {
        return this.birthdate;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public String toString() {
        return "AamvaExtraction(idClass=" + this.idClass + ", nameFirst=" + this.nameFirst + ", nameMiddle=" + this.nameMiddle + ", nameLast=" + this.nameLast + ", sex=" + this.sex + ", addressStreet1=" + this.addressStreet1 + ", addressCity=" + this.addressCity + ", addressState=" + this.addressState + ", addressPostalCode=" + this.addressPostalCode + ", identificationNumber=" + this.identificationNumber + ", issueDate=" + this.issueDate + ", expirationDate=" + this.expirationDate + ", birthdate=" + this.birthdate + ", issuingCountry=" + this.issuingCountry + ")";
    }

    public /* synthetic */ AamvaExtraction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Date date, Date date2, Date date3, String str11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? null : date, (i11 & 2048) != 0 ? null : date2, (i11 & 4096) != 0 ? null : date3, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : str11);
    }
}
