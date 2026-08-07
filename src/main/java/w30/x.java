package w30;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lw30/x;", "", "Landroid/net/ConnectivityManager;", "connectivityManager", "<init>", "(Landroid/net/ConnectivityManager;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;)V", "", "subtype", "Lw30/x$a;", "a", "(I)Lw30/x$a;", "", "b", "()Ljava/lang/String;", "Landroid/net/ConnectivityManager;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ConnectivityManager connectivityManager;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lw30/x$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "WiFi", "Mobile2G", "Mobile3G", "Mobile4G", "Mobile5G", "Unknown", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private enum a {
        WiFi("Wi-Fi"),
        Mobile2G("2G"),
        Mobile3G("3G"),
        Mobile4G("4G"),
        Mobile5G("5G"),
        Unknown("unknown");

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String value;

        a(String str) {
            this.value = str;
        }

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    private x(ConnectivityManager connectivityManager) {
        this.connectivityManager = connectivityManager;
    }

    private final a a(int subtype) {
        switch (subtype) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return a.Mobile2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return a.Mobile3G;
            case 13:
            case 18:
            case 19:
                return a.Mobile4G;
            case 20:
                return a.Mobile5G;
            default:
                return a.Unknown;
        }
    }

    public final String b() {
        a aVarA;
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            aVarA = type != 1 ? a.Unknown : a.WiFi;
        } else {
            aVarA = a(activeNetworkInfo.getSubtype());
        }
        return aVarA.getValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Object systemService = context.getApplicationContext().getSystemService("connectivity");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this((ConnectivityManager) systemService);
    }
}
