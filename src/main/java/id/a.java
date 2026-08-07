package id;

import com.adyen.checkout.components.core.action.RedirectAction;
import com.adyen.checkout.components.core.action.Threeds2Action;
import com.adyen.checkout.components.core.action.Threeds2ChallengeAction;
import com.adyen.checkout.components.core.action.Threeds2FingerprintAction;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.iid.InstanceID;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\r\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\f¨\u0006\u000f"}, d2 = {"Lid/a;", "", "<init>", "()V", "Lid/a$b;", "subType", "Lid/a$a;", "result", "", "message", "Lde/a$b;", "c", "(Lid/a$b;Lid/a$a;Ljava/lang/String;)Lde/a$b;", "a", "b", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f77567a = new a();

    /* JADX INFO: renamed from: id.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lid/a$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "CANCELLED", "COMPLETED", InstanceID.ERROR_TIMEOUT, "ERROR", "REDIRECT", "THREEDS2", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum EnumC1634a {
        CANCELLED("cancelled"),
        COMPLETED("completed"),
        TIMEOUT("timeout"),
        ERROR(AnalyticsAttribute.Error),
        REDIRECT(RedirectAction.ACTION_TYPE),
        THREEDS2(Threeds2Action.ACTION_TYPE);

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String value;

        EnumC1634a(String str) {
            this.value = str;
        }

        public static EnumEntries<EnumC1634a> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lid/a$b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "FINGERPRINT_DATA_SENT", "FINGERPRINT_COMPLETED", "CHALLENGE_DATA_SENT", "CHALLENGE_DISPLAYED", "CHALLENGE_COMPLETED", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum b {
        FINGERPRINT_DATA_SENT("fingerprintDataSentMobile"),
        FINGERPRINT_COMPLETED("fingerprintCompleted"),
        CHALLENGE_DATA_SENT("challengeDataSentMobile"),
        CHALLENGE_DISPLAYED("challengeDisplayed"),
        CHALLENGE_COMPLETED("challengeCompleted");

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String value;

        b(String str) {
            this.value = str;
        }

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    private a() {
    }

    public static /* synthetic */ de.a.Log b(a aVar, b bVar, EnumC1634a enumC1634a, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            enumC1634a = null;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        return aVar.a(bVar, enumC1634a, str);
    }

    public static /* synthetic */ de.a.Log d(a aVar, b bVar, EnumC1634a enumC1634a, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            enumC1634a = null;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        return aVar.c(bVar, enumC1634a, str);
    }

    public final de.a.Log a(b subType, EnumC1634a result, String message) {
        s.k(subType, "subType");
        return new de.a.Log(null, 0L, false, Threeds2ChallengeAction.ACTION_TYPE, de.a.Log.EnumC1234a.THREEDS2, subType.getValue(), result != null ? result.getValue() : null, null, message, 135, null);
    }

    public final de.a.Log c(b subType, EnumC1634a result, String message) {
        s.k(subType, "subType");
        return new de.a.Log(null, 0L, false, Threeds2FingerprintAction.ACTION_TYPE, de.a.Log.EnumC1234a.THREEDS2, subType.getValue(), result != null ? result.getValue() : null, null, message, 135, null);
    }
}
