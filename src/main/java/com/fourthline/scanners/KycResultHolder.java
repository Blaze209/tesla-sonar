package com.fourthline.scanners;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/fourthline/scanners/KycResultHolder;", "", "<init>", "()V", "Ljn0/h0;", "clear", "Lcom/fourthline/scanners/Kyc;", "kyc", "Lcom/fourthline/scanners/Kyc;", "getKyc", "()Lcom/fourthline/scanners/Kyc;", "setKyc", "(Lcom/fourthline/scanners/Kyc;)V", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KycResultHolder {
    public static final KycResultHolder INSTANCE = new KycResultHolder();
    private static Kyc kyc = new Kyc();

    private KycResultHolder() {
    }

    public final void clear() {
        kyc = new Kyc();
    }

    public final Kyc getKyc() {
        return kyc;
    }

    public final void setKyc(Kyc kyc2) {
        s.k(kyc2, "<set-?>");
        kyc = kyc2;
    }
}
