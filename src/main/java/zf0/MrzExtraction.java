package zf0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.scanners.config.orca.workflow.WorkflowKeys;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import ezvcard.property.Gender;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.webrtc.WebrtcBuildVersion;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: zf0.o0, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u0000 ;2\u00020\u0001:\u0001\u001eB·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b/\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u001f\u001a\u0004\b1\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u001f\u001a\u0004\b-\u0010\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b+\u00106R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b)\u00106R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u001f\u001a\u0004\b:\u0010\u0016¨\u0006<"}, d2 = {"Lzf0/o0;", "", "", "rawText", "idClass", "nameFirst", "nameMiddle", "nameLast", "sex", "addressStreet1", "addressCity", "addressState", "addressPostalCode", "identificationNumber", "Ljava/util/Date;", "issueDate", "expirationDate", "birthdate", WorkflowKeys.ISSUING_COUNTRY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "b", "getIdClass", "c", "getNameFirst", DateTokenConverter.CONVERTER_KEY, "getNameMiddle", "e", "getNameLast", "f", "getSex", "g", "getAddressStreet1", "h", "getAddressCity", "getAddressState", "j", "getAddressPostalCode", "k", "l", "Ljava/util/Date;", "getIssueDate", "()Ljava/util/Date;", "m", "n", "o", "getIssuingCountry", "p", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MrzExtraction {

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final p013kotlin.text.q f128245q = new p013kotlin.text.q("([ACI][A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]{9})([0-9]{1})([A-Z0-9<]{15})");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final p013kotlin.text.q f128246r = new p013kotlin.text.q("([0-9]{6})([0-9]{1})([MFX<]{1})([0-9]{6})([0-9]{1})([A-Z]{3})([A-Z0-9<]{11})([0-9]{1})");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final p013kotlin.text.q f128247s = new p013kotlin.text.q("([A-Z0-9<]{30})");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final p013kotlin.text.q f128248t = new p013kotlin.text.q("([ACI][A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]{31})");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final p013kotlin.text.q f128249u = new p013kotlin.text.q("([A-Z0-9<]{9})([0-9]{1})([A-Z]{3})([0-9]{6})([0-9]{1})([MFX<]{1})([0-9]{6})([0-9]{1})([A-Z0-9<]{7})([0-9]{1})");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final p013kotlin.text.q f128250v = new p013kotlin.text.q("(P[A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]+?<<+)");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final p013kotlin.text.q f128251w = new p013kotlin.text.q("(P[A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]+?)<<([A-Z0-9<]+<<+)");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final p013kotlin.text.q f128252x = new p013kotlin.text.q("([A-Z0-9<]{9})([0-9]{1})([A-Z]{3})([0-9]{6})([0-9]{1})([MFX<]{1})([0-9]{6})([0-9]{1})?([A-Z0-9<]{14})?([0-9]{1})?([0-9]{1})?");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String rawText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String idClass;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nameFirst;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nameMiddle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nameLast;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sex;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressStreet1;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressCity;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressPostalCode;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String identificationNumber;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date issueDate;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date expirationDate;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date birthdate;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String issuingCountry;

    /* JADX INFO: renamed from: zf0.o0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015¨\u0006\u001d"}, d2 = {"Lzf0/o0$a;", "", "<init>", "()V", "", "cleanText", "Lzf0/o0;", "f", "(Ljava/lang/String;)Lzf0/o0;", "h", "name", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/lang/String;", InquiryField.DateField.TYPE, "Ljava/util/Date;", "c", "(Ljava/lang/String;)Ljava/util/Date;", "rawText", "e", "Lkotlin/text/q;", "TD1_LINE1", "Lkotlin/text/q;", "TD1_LINE2", "TD1_LINE3", "TD2_LINE1", "TD2_LINE2", "TD2_LINE3", "TD3_LINE1", "TD3_LINE2", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Date c(String date) {
            if (date == null) {
                return null;
            }
            try {
                return new SimpleDateFormat("yyMMdd", Locale.US).parse(new p013kotlin.text.q("G").j(new p013kotlin.text.q("S").j(new p013kotlin.text.q(Gender.OTHER).j(new p013kotlin.text.q("D").j(new p013kotlin.text.q("L").j(new p013kotlin.text.q("I").j(date, "1"), "1"), WebrtcBuildVersion.maint_version), WebrtcBuildVersion.maint_version), "5"), "6"));
            } catch (ParseException unused) {
                return null;
            }
        }

        private final String d(String name) {
            if (name == null) {
                return null;
            }
            return p013kotlin.text.t.F1(p013kotlin.text.t.V(name, "<", " ", false, 4, null)).toString();
        }

        private final MrzExtraction f(String cleanText) {
            p013kotlin.text.m mVarD;
            p013kotlin.text.m mVarD2;
            p013kotlin.text.m mVarD3 = p013kotlin.text.q.d(MrzExtraction.f128245q, cleanText, 0, 2, null);
            if (mVarD3 == null || (mVarD = p013kotlin.text.q.d(MrzExtraction.f128246r, cleanText, 0, 2, null)) == null || (mVarD2 = p013kotlin.text.q.d(MrzExtraction.f128247s, p013kotlin.text.t.V(p013kotlin.text.t.V(cleanText, mVarD3.getValue(), "", false, 4, null), mVarD.getValue(), "", false, 4, null), 0, 2, null)) == null) {
                return null;
            }
            String string = p013kotlin.text.t.F1(mVarD2.getValue()).toString();
            int length = string.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                boolean z12 = string.charAt(!z11 ? i11 : length) == '<';
                if (z11) {
                    if (!z12) {
                        break;
                    }
                    length--;
                } else if (z12) {
                    i11++;
                } else {
                    z11 = true;
                }
            }
            List listF1 = p013kotlin.text.t.f1(string.subSequence(i11, length + 1).toString(), new String[]{"<<"}, false, 0, 6, null);
            return new MrzExtraction(p013kotlin.collections.v.y0(p013kotlin.collections.v.p(mVarD3, mVarD, mVarD2), "\n", null, null, 0, null, new wn0.l() { // from class: zf0.n0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return MrzExtraction.Companion.g((p013kotlin.text.m) obj);
                }
            }, 30, null), null, d((String) p013kotlin.collections.v.r0(listF1, 1)), null, d((String) p013kotlin.collections.v.r0(listF1, 0)), mVarD.c().get(3), null, null, null, null, mVarD3.c().get(3), null, c(mVarD.c().get(4)), c(mVarD.c().get(1)), mVarD3.c().get(2), 3018, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence g(p013kotlin.text.m it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return it.getValue();
        }

        private final MrzExtraction h(String cleanText) {
            p013kotlin.text.m mVarD;
            p013kotlin.text.m mVarD2 = p013kotlin.text.q.d(MrzExtraction.f128251w, cleanText, 0, 2, null);
            if (mVarD2 == null || (mVarD = p013kotlin.text.q.d(MrzExtraction.f128252x, cleanText, 0, 2, null)) == null) {
                return null;
            }
            return new MrzExtraction(p013kotlin.collections.v.y0(p013kotlin.collections.v.p(mVarD2, mVarD), "\n", null, null, 0, null, new wn0.l() { // from class: zf0.m0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return MrzExtraction.Companion.i((p013kotlin.text.m) obj);
                }
            }, 30, null), null, d(mVarD2.c().get(4)), null, d(mVarD2.c().get(3)), mVarD.c().get(6), null, null, null, null, mVarD.c().get(1), null, c(mVarD.c().get(7)), c(mVarD.c().get(4)), mVarD2.c().get(2), 3018, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence i(p013kotlin.text.m it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return it.getValue();
        }

        public final MrzExtraction e(String rawText) {
            if (rawText == null) {
                return null;
            }
            String strJ = new p013kotlin.text.q("([\r\t ])").j(rawText, "");
            Locale locale = Locale.getDefault();
            p013kotlin.jvm.internal.s.j(locale, "getDefault(...)");
            String upperCase = strJ.toUpperCase(locale);
            p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
            MrzExtraction mrzExtractionF = f(upperCase);
            return mrzExtractionF == null ? h(upperCase) : mrzExtractionF;
        }

        private Companion() {
        }
    }

    public MrzExtraction(String rawText, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Date date, Date date2, Date date3, String str11) {
        p013kotlin.jvm.internal.s.k(rawText, "rawText");
        this.rawText = rawText;
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
        if (!(other instanceof MrzExtraction)) {
            return false;
        }
        MrzExtraction mrzExtraction = (MrzExtraction) other;
        return p013kotlin.jvm.internal.s.f(this.rawText, mrzExtraction.rawText) && p013kotlin.jvm.internal.s.f(this.idClass, mrzExtraction.idClass) && p013kotlin.jvm.internal.s.f(this.nameFirst, mrzExtraction.nameFirst) && p013kotlin.jvm.internal.s.f(this.nameMiddle, mrzExtraction.nameMiddle) && p013kotlin.jvm.internal.s.f(this.nameLast, mrzExtraction.nameLast) && p013kotlin.jvm.internal.s.f(this.sex, mrzExtraction.sex) && p013kotlin.jvm.internal.s.f(this.addressStreet1, mrzExtraction.addressStreet1) && p013kotlin.jvm.internal.s.f(this.addressCity, mrzExtraction.addressCity) && p013kotlin.jvm.internal.s.f(this.addressState, mrzExtraction.addressState) && p013kotlin.jvm.internal.s.f(this.addressPostalCode, mrzExtraction.addressPostalCode) && p013kotlin.jvm.internal.s.f(this.identificationNumber, mrzExtraction.identificationNumber) && p013kotlin.jvm.internal.s.f(this.issueDate, mrzExtraction.issueDate) && p013kotlin.jvm.internal.s.f(this.expirationDate, mrzExtraction.expirationDate) && p013kotlin.jvm.internal.s.f(this.birthdate, mrzExtraction.birthdate) && p013kotlin.jvm.internal.s.f(this.issuingCountry, mrzExtraction.issuingCountry);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Date getBirthdate() {
        return this.birthdate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getIdentificationNumber() {
        return this.identificationNumber;
    }

    public int hashCode() {
        int iHashCode = this.rawText.hashCode() * 31;
        String str = this.idClass;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nameFirst;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nameMiddle;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nameLast;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sex;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.addressStreet1;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.addressCity;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.addressState;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addressPostalCode;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.identificationNumber;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Date date = this.issueDate;
        int iHashCode12 = (iHashCode11 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expirationDate;
        int iHashCode13 = (iHashCode12 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.birthdate;
        int iHashCode14 = (iHashCode13 + (date3 == null ? 0 : date3.hashCode())) * 31;
        String str11 = this.issuingCountry;
        return iHashCode14 + (str11 != null ? str11.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getRawText() {
        return this.rawText;
    }

    public String toString() {
        return "MrzExtraction(rawText=" + this.rawText + ", idClass=" + this.idClass + ", nameFirst=" + this.nameFirst + ", nameMiddle=" + this.nameMiddle + ", nameLast=" + this.nameLast + ", sex=" + this.sex + ", addressStreet1=" + this.addressStreet1 + ", addressCity=" + this.addressCity + ", addressState=" + this.addressState + ", addressPostalCode=" + this.addressPostalCode + ", identificationNumber=" + this.identificationNumber + ", issueDate=" + this.issueDate + ", expirationDate=" + this.expirationDate + ", birthdate=" + this.birthdate + ", issuingCountry=" + this.issuingCountry + ")";
    }

    public /* synthetic */ MrzExtraction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Date date, Date date2, Date date3, String str12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? null : str11, (i11 & 2048) != 0 ? null : date, (i11 & 4096) != 0 ? null : date2, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : date3, (i11 & 16384) != 0 ? null : str12);
    }
}
