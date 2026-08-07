package com.tesla.messagebuilder.util;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import com.tesla.sessionmanager.VehicleSessionInfo;
import ie0.n;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0013\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J>\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/tesla/messagebuilder/util/VehicleSessionInfoDataBody;", "", "epoch", "", "publicKey", "clockTime", "", "counter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "vehicleSessionInfo", "Lcom/tesla/sessionmanager/VehicleSessionInfo;", "(Lcom/tesla/sessionmanager/VehicleSessionInfo;)V", "getEpoch", "()Ljava/lang/String;", "getPublicKey", "getClockTime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCounter", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/tesla/messagebuilder/util/VehicleSessionInfoDataBody;", "equals", "", "other", "hashCode", "toString", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VehicleSessionInfoDataBody {
    private final Integer clockTime;
    private final Integer counter;
    private final String epoch;
    private final String publicKey;

    public VehicleSessionInfoDataBody(@g(name = "epoch") String str, @g(name = "public_key") String str2, @g(name = "clock_time") Integer num, @g(name = "counter") Integer num2) {
        this.epoch = str;
        this.publicKey = str2;
        this.clockTime = num;
        this.counter = num2;
    }

    public static /* synthetic */ VehicleSessionInfoDataBody copy$default(VehicleSessionInfoDataBody vehicleSessionInfoDataBody, String str, String str2, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = vehicleSessionInfoDataBody.epoch;
        }
        if ((i11 & 2) != 0) {
            str2 = vehicleSessionInfoDataBody.publicKey;
        }
        if ((i11 & 4) != 0) {
            num = vehicleSessionInfoDataBody.clockTime;
        }
        if ((i11 & 8) != 0) {
            num2 = vehicleSessionInfoDataBody.counter;
        }
        return vehicleSessionInfoDataBody.copy(str, str2, num, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEpoch() {
        return this.epoch;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getClockTime() {
        return this.clockTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getCounter() {
        return this.counter;
    }

    public final VehicleSessionInfoDataBody copy(@g(name = "epoch") String epoch, @g(name = "public_key") String publicKey, @g(name = "clock_time") Integer clockTime, @g(name = "counter") Integer counter) {
        return new VehicleSessionInfoDataBody(epoch, publicKey, clockTime, counter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleSessionInfoDataBody)) {
            return false;
        }
        VehicleSessionInfoDataBody vehicleSessionInfoDataBody = (VehicleSessionInfoDataBody) other;
        return s.f(this.epoch, vehicleSessionInfoDataBody.epoch) && s.f(this.publicKey, vehicleSessionInfoDataBody.publicKey) && s.f(this.clockTime, vehicleSessionInfoDataBody.clockTime) && s.f(this.counter, vehicleSessionInfoDataBody.counter);
    }

    public final Integer getClockTime() {
        return this.clockTime;
    }

    public final Integer getCounter() {
        return this.counter;
    }

    public final String getEpoch() {
        return this.epoch;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        String str = this.epoch;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.publicKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.clockTime;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.counter;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "VehicleSessionInfoDataBody(epoch=" + this.epoch + ", publicKey=" + this.publicKey + ", clockTime=" + this.clockTime + ", counter=" + this.counter + ")";
    }

    public VehicleSessionInfoDataBody(VehicleSessionInfo vehicleSessionInfo) {
        String publicKeyHex;
        byte[] bArrF;
        String epochHex;
        byte[] bArrF2;
        this((vehicleSessionInfo == null || (epochHex = vehicleSessionInfo.getEpochHex()) == null || (bArrF2 = n.f(epochHex)) == null) ? null : n.c(bArrF2, 0, 1, null), (vehicleSessionInfo == null || (publicKeyHex = vehicleSessionInfo.getPublicKeyHex()) == null || (bArrF = n.f(publicKeyHex)) == null) ? null : n.c(bArrF, 0, 1, null), vehicleSessionInfo != null ? Integer.valueOf(vehicleSessionInfo.getClockTime()) : null, vehicleSessionInfo != null ? Integer.valueOf(vehicleSessionInfo.getCounter()) : null);
    }
}
