package expo.modules.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0014"}, d2 = {"Lexpo/modules/battery/PowerSaverReceiver;", "Landroid/content/BroadcastReceiver;", "Lkotlin/Function2;", "", "Landroid/os/Bundle;", "Ljn0/h0;", "sendEvent", "<init>", "(Lwn0/p;)V", "", "lowPowerMode", "onLowPowerModeChange", "(Z)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", AnalyticsAttribute.Intent, "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lwn0/p;", "expo-battery_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PowerSaverReceiver extends BroadcastReceiver {
    private final p<String, Bundle, h0> sendEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public PowerSaverReceiver(p<? super String, ? super Bundle, h0> sendEvent) {
        s.k(sendEvent, "sendEvent");
        this.sendEvent = sendEvent;
    }

    private final void onLowPowerModeChange(boolean lowPowerMode) {
        p<String, Bundle, h0> pVar = this.sendEvent;
        Bundle bundle = new Bundle();
        bundle.putBoolean("lowPowerMode", lowPowerMode);
        h0 h0Var = h0.f84049a;
        pVar.invoke(BatteryModuleKt.POWER_MODE_EVENT_NAME, bundle);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        s.k(context, "context");
        s.k(intent, "intent");
        Object systemService = context.getApplicationContext().getSystemService("power");
        s.i(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        onLowPowerModeChange(((PowerManager) systemService).isPowerSaveMode());
    }
}
