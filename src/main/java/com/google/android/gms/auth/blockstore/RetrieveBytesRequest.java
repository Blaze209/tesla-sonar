package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "RetrieveBytesRequestCreator")
public class RetrieveBytesRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RetrieveBytesRequest> CREATOR = new zzc();

    @SafeParcelable.Field(getter = "getKeys", id = 1)
    private final List zza;

    @SafeParcelable.Field(defaultValue = "false", getter = "getRetrieveAll", id = 2)
    private final boolean zzb;

    public static final class Builder {
        private List zza = new ArrayList();
        private boolean zzb = false;

        @NonNull
        public RetrieveBytesRequest build() {
            return new RetrieveBytesRequest(this.zza, this.zzb);
        }

        @NonNull
        public Builder setKeys(@NonNull List<String> list) {
            Preconditions.checkNotNull(list, "Keys cannot be set to null");
            this.zza = list;
            return this;
        }

        @NonNull
        public Builder setRetrieveAll(boolean z11) {
            this.zzb = z11;
            return this;
        }
    }

    @SafeParcelable.Constructor
    RetrieveBytesRequest(@SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) boolean z11) {
        if (z11) {
            boolean z12 = true;
            if (list != null && !list.isEmpty()) {
                z12 = false;
            }
            Preconditions.checkState(z12, "retrieveAll was set to true but other constraint(s) was also provided: keys");
        }
        this.zzb = z11;
        this.zza = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Preconditions.checkNotEmpty(str, "Element in keys cannot be null or empty");
                this.zza.add(str);
            }
        }
    }

    @NonNull
    public List<String> getKeys() {
        return Collections.unmodifiableList(this.zza);
    }

    public boolean getRetrieveAll() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, getKeys(), false);
        SafeParcelWriter.writeBoolean(parcel, 2, getRetrieveAll());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
