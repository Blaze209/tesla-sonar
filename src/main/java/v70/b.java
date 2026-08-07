package v70;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lv70/b;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$a;", "args", "La90/b;", "b", "(Landroid/content/Context;Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$a;)La90/b;", "Lp70/c;", "defaultAddressLauncherEventReporter", "Lp70/b;", "a", "(Lp70/c;)Lp70/b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {
    public final p70.b a(p70.c defaultAddressLauncherEventReporter) {
        p013kotlin.jvm.internal.s.k(defaultAddressLauncherEventReporter, "defaultAddressLauncherEventReporter");
        return defaultAddressLauncherEventReporter;
    }

    public final a90.b b(Context context, AddressElementActivityContract.Args args) {
        String googlePlacesApiKey;
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(args, "args");
        com.stripe.android.paymentsheet.addresselement.d.Configuration config = args.getConfig();
        if (config == null || (googlePlacesApiKey = config.getGooglePlacesApiKey()) == null) {
            return null;
        }
        return a90.b.Companion.b(a90.b.INSTANCE, context, googlePlacesApiKey, null, null, null, h70.h.Companion.b(h70.h.INSTANCE, context, null, 2, null), 28, null);
    }
}
