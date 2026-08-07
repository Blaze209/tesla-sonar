package t80;

import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lt80/u;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "Companion", "a", "VerificationSuccessful", "VerificationDenied", "VerificationNotPerformed", "VerificationAttempted", "ChallengeAdditionalAuth", "ChallengeDecoupledAuth", "VerificationRejected", "InformationOnly", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum u {
    VerificationSuccessful("Y"),
    VerificationDenied(Gender.NONE),
    VerificationNotPerformed(Gender.UNKNOWN),
    VerificationAttempted("A"),
    ChallengeAdditionalAuth("C"),
    ChallengeDecoupledAuth("D"),
    VerificationRejected("R"),
    InformationOnly("I");

    private final String code;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t80.u$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lt80/u$a;", "", "<init>", "()V", "", "code", "Lt80/u;", "a", "(Ljava/lang/String;)Lt80/u;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u a(String code) {
            u uVar = null;
            if (code == null) {
                return null;
            }
            for (u uVar2 : u.getEntries()) {
                if (p013kotlin.jvm.internal.s.f(uVar2.getCode(), code)) {
                    uVar = uVar2;
                    break;
                }
            }
            return uVar;
        }

        private Companion() {
        }
    }

    u(String str) {
        this.code = str;
    }

    public static EnumEntries<u> getEntries() {
        return $ENTRIES;
    }

    public final String getCode() {
        return this.code;
    }
}
