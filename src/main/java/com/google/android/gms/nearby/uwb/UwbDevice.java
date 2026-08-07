package com.google.android.gms.nearby.uwb;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class UwbDevice {
    private final UwbAddress zza;

    private UwbDevice(UwbAddress uwbAddress) {
        this.zza = uwbAddress;
    }

    @NonNull
    public static UwbDevice createForAddress(@NonNull String str) {
        return new UwbDevice(new UwbAddress(str));
    }

    @SuppressLint({"NewApi"})
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UwbDevice) {
            return Objects.equals(this.zza, ((UwbDevice) obj).zza);
        }
        return false;
    }

    @NonNull
    public UwbAddress getAddress() {
        return this.zza;
    }

    @SuppressLint({"NewApi"})
    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @NonNull
    public String toString() {
        return String.format("UwbDevice {%s}", this.zza);
    }

    @NonNull
    public static UwbDevice createForAddress(@NonNull byte[] bArr) {
        return new UwbDevice(new UwbAddress(bArr));
    }
}
