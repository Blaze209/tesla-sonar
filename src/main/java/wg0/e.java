package wg0;

import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import pg0.h4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 wg0.e, still in use, count: 1, list:
  (r0v0 wg0.e) from 0x0144: INVOKE ("dl"), (r0v0 wg0.e) STATIC call: jn0.x.a(java.lang.Object, java.lang.Object):kotlin.Pair A[MD:<A, B>:(A, B):kotlin.Pair<A, B> (m), WRAPPED] (LINE:325)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, d2 = {"Lwg0/e;", "", "<init>", "(Ljava/lang/String;I)V", "Lpg0/h4;", "toIcon", "()Lpg0/h4;", "Companion", "a", "DriverLicense", "StateID", "Keypass", "MilitaryID", "MyNumberCard", "NRIC", "OFWID", "Passport", "PermanentResidentCard", "ResidencyPermit", "StudentPermit", "SocialSecurityID", "UMID", "VoterID", "PassportCard", "PostalID", "Visa", "WorkPermit", "CitizenshipCertificate", "ConsularID", "ForeignerID", "HealthInsuranceCard", "LongTermPass", "NBICertificate", "PermanentAccountNumber", "Unknown", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {
    DriverLicense,
    StateID,
    Keypass,
    MilitaryID,
    MyNumberCard,
    NRIC,
    OFWID,
    Passport,
    PermanentResidentCard,
    ResidencyPermit,
    StudentPermit,
    SocialSecurityID,
    UMID,
    VoterID,
    PassportCard,
    PostalID,
    Visa,
    WorkPermit,
    CitizenshipCertificate,
    ConsularID,
    ForeignerID,
    HealthInsuranceCard,
    LongTermPass,
    NBICertificate,
    PermanentAccountNumber,
    Unknown;

    public static final String KeyAutoClassification = "auto-classification";
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, e> codes = v0.m(x.a("dl", new e()), x.a("id", new e()), x.a("keyp", new e()), x.a("mid", new e()), x.a("myn", new e()), x.a("nric", new e()), x.a("ofw", new e()), x.a("pp", new e()), x.a("pr", new e()), x.a("rp", new e()), x.a("sp", new e()), x.a("sss", new e()), x.a("umid", new e()), x.a("vid", new e()), x.a("ppc", new e()), x.a("pid", new e()), x.a("visa", new e()), x.a("wp", new e()), x.a("cct", new e()), x.a("cid", new e()), x.a("foid", new e()), x.a("hic", new e()), x.a("ltpass", new e()), x.a("nbi", new e()), x.a("pan", new e()));

    /* JADX INFO: renamed from: wg0.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lwg0/e$a;", "", "<init>", "()V", "", "abbr", "Lwg0/e;", "a", "(Ljava/lang/String;)Lwg0/e;", "KeyAutoClassification", "Ljava/lang/String;", "", "codes", "Ljava/util/Map;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(String abbr) {
            s.k(abbr, "abbr");
            e eVar = (e) e.codes.get(abbr);
            return eVar == null ? e.Unknown : eVar;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121814a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.DriverLicense.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.StateID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.Keypass.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.MilitaryID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.MyNumberCard.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.NRIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[e.OFWID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[e.Passport.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[e.PermanentResidentCard.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[e.ResidencyPermit.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[e.StudentPermit.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[e.SocialSecurityID.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[e.UMID.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[e.VoterID.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[e.PassportCard.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[e.PostalID.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[e.Visa.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[e.WorkPermit.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[e.CitizenshipCertificate.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[e.ConsularID.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[e.ForeignerID.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[e.HealthInsuranceCard.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[e.LongTermPass.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[e.NBICertificate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[e.PermanentAccountNumber.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[e.Unknown.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            f121814a = iArr;
        }
    }

    static {
    }

    private e() {
        super(str, i);
    }

    public static EnumEntries<e> getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final h4 toIcon() {
        switch (b.f121814a[ordinal()]) {
            case 1:
                return h4.Card;
            case 2:
                return h4.Flag;
            case 3:
                return h4.Card;
            case 4:
                return h4.Card;
            case 5:
                return h4.Card;
            case 6:
                return h4.Card;
            case 7:
                return h4.Card;
            case 8:
                return h4.World;
            case 9:
                return h4.House;
            case 10:
                return h4.House;
            case 11:
                return h4.Card;
            case 12:
                return h4.Card;
            case 13:
                return h4.Card;
            case 14:
                return h4.Card;
            case 15:
                return h4.World;
            case 16:
                return h4.Card;
            case 17:
                return h4.World;
            case 18:
                return h4.Card;
            case 19:
                return h4.Card;
            case 20:
                return h4.Card;
            case 21:
                return h4.Card;
            case 22:
                return h4.Card;
            case 23:
                return h4.Card;
            case 24:
                return h4.Card;
            case 25:
                return h4.Card;
            case 26:
                throw new RuntimeException("IdClass is 'UNKNOWN'.");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
