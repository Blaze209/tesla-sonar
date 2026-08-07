package com.google.android.gms.auth.blockstore;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "RetrieveBytesResponseCreator")
public class RetrieveBytesResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RetrieveBytesResponse> CREATOR = new zzd();

    @SafeParcelable.Field(getter = "getInternalBlockstoreDataBundle", id = 1)
    @Deprecated
    private final Bundle zza;

    @SafeParcelable.Field(getter = "getInternalBlockstoreDataList", id = 2)
    private final List zzb;
    private final Map zzc;

    @SafeParcelable.Class(creator = "BlockstoreDataCreator")
    public static class BlockstoreData extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<BlockstoreData> CREATOR = new zza();

        @SafeParcelable.Field(getter = "getBytes", id = 1)
        private final byte[] zza;

        @SafeParcelable.Field(getter = "getKey", id = 2)
        private final String zzb;

        @SafeParcelable.Constructor
        BlockstoreData(@SafeParcelable.Param(id = 1) byte[] bArr, @SafeParcelable.Param(id = 2) String str) {
            this.zza = bArr;
            this.zzb = str;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof BlockstoreData)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.zza, ((BlockstoreData) obj).zza);
        }

        @NonNull
        public byte[] getBytes() {
            return this.zza;
        }

        public int hashCode() {
            return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeByteArray(parcel, 1, getBytes(), false);
            SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }

        @NonNull
        public final String zza() {
            return this.zzb;
        }
    }

    @SafeParcelable.Constructor
    RetrieveBytesResponse(@SafeParcelable.Param(id = 1) Bundle bundle, @SafeParcelable.Param(id = 2) List list) {
        this.zza = bundle;
        this.zzb = list;
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BlockstoreData blockstoreData = (BlockstoreData) it.next();
            map.put(blockstoreData.zza(), blockstoreData);
        }
        this.zzc = map;
    }

    @NonNull
    public Map<String, BlockstoreData> getBlockstoreDataMap() {
        return Collections.unmodifiableMap(this.zzc);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        Bundle bundle = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, bundle, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
