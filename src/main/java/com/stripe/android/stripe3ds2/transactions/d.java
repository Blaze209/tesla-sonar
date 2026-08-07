package com.stripe.android.stripe3ds2.transactions;

import java.util.Iterator;
import org.webrtc.WebrtcBuildVersion;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/d;", "", "", "code", "", "requiresSubmitButton", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "Z", "getRequiresSubmitButton$3ds2sdk_release", "()Z", "Companion", "a", "Text", "SingleSelect", "MultiSelect", "OutOfBand", "Html", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum d {
    Text("01", true),
    SingleSelect("02", true),
    MultiSelect("03", true),
    OutOfBand(WebrtcBuildVersion.webrtc_commit, false),
    Html("05", false);

    private final String code;
    private final boolean requiresSubmitButton;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transactions.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/d$a;", "", "<init>", "()V", "", "code", "Lcom/stripe/android/stripe3ds2/transactions/d;", "a", "(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/d;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(String code) {
            d next;
            Iterator<d> it = d.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (s.f(code, next.getCode())) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        private Companion() {
        }
    }

    d(String str, boolean z11) {
        this.code = str;
        this.requiresSubmitButton = z11;
    }

    public static EnumEntries<d> getEntries() {
        return $ENTRIES;
    }

    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: getRequiresSubmitButton$3ds2sdk_release, reason: from getter */
    public final boolean getRequiresSubmitButton() {
        return this.requiresSubmitButton;
    }
}
