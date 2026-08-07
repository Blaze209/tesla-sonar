package com.fourthline.nfc;

import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/fourthline/nfc/NfcScannerConfig;", "", "Lcom/fourthline/nfc/NfcScannerSecurityKey;", Action.KEY_ATTRIBUTE, "<init>", "(Lcom/fourthline/nfc/NfcScannerSecurityKey;)V", "component1", "()Lcom/fourthline/nfc/NfcScannerSecurityKey;", "copy", "(Lcom/fourthline/nfc/NfcScannerSecurityKey;)Lcom/fourthline/nfc/NfcScannerConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/nfc/NfcScannerSecurityKey;", "getKey", "fourthline-nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NfcScannerConfig {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final NfcScannerSecurityKey key;

    public NfcScannerConfig(NfcScannerSecurityKey key) {
        s.k(key, "key");
        this.key = key;
    }

    public static /* synthetic */ NfcScannerConfig copy$default(NfcScannerConfig nfcScannerConfig, NfcScannerSecurityKey nfcScannerSecurityKey, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            nfcScannerSecurityKey = nfcScannerConfig.key;
        }
        return nfcScannerConfig.copy(nfcScannerSecurityKey);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NfcScannerSecurityKey getKey() {
        return this.key;
    }

    public final NfcScannerConfig copy(NfcScannerSecurityKey key) {
        s.k(key, "key");
        return new NfcScannerConfig(key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NfcScannerConfig) && s.f(this.key, ((NfcScannerConfig) other).key);
    }

    public final NfcScannerSecurityKey getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public String toString() {
        return "NfcScannerConfig(key=" + this.key + ")";
    }
}
