package com.teslamotors.plugins.ble.messages;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import vc0.p1;
import vc0.u;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JL\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u001a\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010 ¨\u00063"}, d2 = {"Lcom/teslamotors/plugins/ble/messages/NfcSwipeStatus;", "Landroid/os/Parcelable;", "", "vin", "keyID", "publicKey", "Lvc0/p1;", "nfcPresence", "Lvc0/u;", "blePresence", "", "unknown", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvc0/p1;Lvc0/u;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lvc0/p1;", "component5", "()Lvc0/u;", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvc0/p1;Lvc0/u;Z)Lcom/teslamotors/plugins/ble/messages/NfcSwipeStatus;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVin", "getKeyID", "getPublicKey", "Lvc0/p1;", "getNfcPresence", "Lvc0/u;", "getBlePresence", "Z", "getUnknown", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NfcSwipeStatus implements Parcelable {
    public static final Parcelable.Creator<NfcSwipeStatus> CREATOR = new a();
    private final u blePresence;
    private final String keyID;
    private final p1 nfcPresence;
    private final String publicKey;
    private final boolean unknown;
    private final String vin;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NfcSwipeStatus> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NfcSwipeStatus createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new NfcSwipeStatus(parcel.readString(), parcel.readString(), parcel.readString(), p1.valueOf(parcel.readString()), u.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NfcSwipeStatus[] newArray(int i11) {
            return new NfcSwipeStatus[i11];
        }
    }

    public NfcSwipeStatus(String vin, String keyID, String publicKey, p1 nfcPresence, u blePresence, boolean z11) {
        s.k(vin, "vin");
        s.k(keyID, "keyID");
        s.k(publicKey, "publicKey");
        s.k(nfcPresence, "nfcPresence");
        s.k(blePresence, "blePresence");
        this.vin = vin;
        this.keyID = keyID;
        this.publicKey = publicKey;
        this.nfcPresence = nfcPresence;
        this.blePresence = blePresence;
        this.unknown = z11;
    }

    public static /* synthetic */ NfcSwipeStatus copy$default(NfcSwipeStatus nfcSwipeStatus, String str, String str2, String str3, p1 p1Var, u uVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = nfcSwipeStatus.vin;
        }
        if ((i11 & 2) != 0) {
            str2 = nfcSwipeStatus.keyID;
        }
        if ((i11 & 4) != 0) {
            str3 = nfcSwipeStatus.publicKey;
        }
        if ((i11 & 8) != 0) {
            p1Var = nfcSwipeStatus.nfcPresence;
        }
        if ((i11 & 16) != 0) {
            uVar = nfcSwipeStatus.blePresence;
        }
        if ((i11 & 32) != 0) {
            z11 = nfcSwipeStatus.unknown;
        }
        u uVar2 = uVar;
        boolean z12 = z11;
        return nfcSwipeStatus.copy(str, str2, str3, p1Var, uVar2, z12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVin() {
        return this.vin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKeyID() {
        return this.keyID;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final p1 getNfcPresence() {
        return this.nfcPresence;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final u getBlePresence() {
        return this.blePresence;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getUnknown() {
        return this.unknown;
    }

    public final NfcSwipeStatus copy(String vin, String keyID, String publicKey, p1 nfcPresence, u blePresence, boolean unknown) {
        s.k(vin, "vin");
        s.k(keyID, "keyID");
        s.k(publicKey, "publicKey");
        s.k(nfcPresence, "nfcPresence");
        s.k(blePresence, "blePresence");
        return new NfcSwipeStatus(vin, keyID, publicKey, nfcPresence, blePresence, unknown);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcSwipeStatus)) {
            return false;
        }
        NfcSwipeStatus nfcSwipeStatus = (NfcSwipeStatus) other;
        return s.f(this.vin, nfcSwipeStatus.vin) && s.f(this.keyID, nfcSwipeStatus.keyID) && s.f(this.publicKey, nfcSwipeStatus.publicKey) && this.nfcPresence == nfcSwipeStatus.nfcPresence && this.blePresence == nfcSwipeStatus.blePresence && this.unknown == nfcSwipeStatus.unknown;
    }

    public final u getBlePresence() {
        return this.blePresence;
    }

    public final String getKeyID() {
        return this.keyID;
    }

    public final p1 getNfcPresence() {
        return this.nfcPresence;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final boolean getUnknown() {
        return this.unknown;
    }

    public final String getVin() {
        return this.vin;
    }

    public int hashCode() {
        return (((((((((this.vin.hashCode() * 31) + this.keyID.hashCode()) * 31) + this.publicKey.hashCode()) * 31) + this.nfcPresence.hashCode()) * 31) + this.blePresence.hashCode()) * 31) + Boolean.hashCode(this.unknown);
    }

    public String toString() {
        return "NfcSwipeStatus(vin=" + this.vin + ", keyID=" + this.keyID + ", publicKey=" + this.publicKey + ", nfcPresence=" + this.nfcPresence + ", blePresence=" + this.blePresence + ", unknown=" + this.unknown + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.vin);
        dest.writeString(this.keyID);
        dest.writeString(this.publicKey);
        dest.writeString(this.nfcPresence.name());
        dest.writeString(this.blePresence.name());
        dest.writeInt(this.unknown ? 1 : 0);
    }
}
