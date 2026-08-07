package com.teslamotors.plugins.ble.beacon;

import androidx.annotation.Keep;
import com.teslamotors.plugins.ble.card.OemWalletProvider;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/teslamotors/plugins/ble/beacon/OemWalletInjector;", "", "<init>", "()V", "inject", "", "Lcom/teslamotors/plugins/ble/card/OemWalletProvider;", "tesla-oem-wallet_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OemWalletInjector {
    public static final OemWalletInjector INSTANCE = new OemWalletInjector();

    private OemWalletInjector() {
    }

    public final List<OemWalletProvider> inject() {
        return v.m();
    }
}
