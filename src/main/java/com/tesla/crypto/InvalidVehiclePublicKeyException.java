package com.tesla.crypto;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tesla/crypto/InvalidVehiclePublicKeyException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "vehicleKeyHex", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "crypto_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InvalidVehiclePublicKeyException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String vehicleKeyHex;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InvalidVehiclePublicKeyException(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 2) != 0) {
            str2 = "Invalid vehicle public key: " + str;
        }
        this(str, str2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getVehicleKeyHex() {
        return this.vehicleKeyHex;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidVehiclePublicKeyException(String vehicleKeyHex, String message) {
        super(message);
        s.k(vehicleKeyHex, "vehicleKeyHex");
        s.k(message, "message");
        this.vehicleKeyHex = vehicleKeyHex;
    }
}
