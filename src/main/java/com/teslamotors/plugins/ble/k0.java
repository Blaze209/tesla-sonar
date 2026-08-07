package com.teslamotors.plugins.ble;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\n\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/teslamotors/plugins/ble/k0;", "", "<init>", "()V", "", "caller", "Lcom/teslamotors/plugins/ble/j0;", "a", "(Ljava/lang/String;)Lcom/teslamotors/plugins/ble/j0;", "Lcom/tesla/logging/g;", "b", "Lcom/tesla/logging/g;", "logger", "c", "Lcom/teslamotors/plugins/ble/j0;", "getListener", "()Lcom/teslamotors/plugins/ble/j0;", "(Lcom/teslamotors/plugins/ble/j0;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f56924a = new k0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("OemWalletRegistry");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static volatile j0 listener;

    private k0() {
    }

    public final j0 a(String caller) {
        p013kotlin.jvm.internal.s.k(caller, "caller");
        j0 j0Var = listener;
        if (j0Var == null) {
            logger.n("OemWalletBleListener is null when called from " + caller + " — initProviders may not have run yet");
        }
        return j0Var;
    }

    public final void b(j0 j0Var) {
        listener = j0Var;
    }
}
