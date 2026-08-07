package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.internal.zzig;
import com.google.android.libraries.places.internal.zziy;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AddressComponent implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public AddressComponent build() {
            AddressComponent addressComponentZzc = zzc();
            zzig.zzi(!addressComponentZzc.getName().isEmpty(), "Name must not be empty.");
            List<String> types = addressComponentZzc.getTypes();
            Iterator<String> it = types.iterator();
            while (it.hasNext()) {
                zzig.zzi(!TextUtils.isEmpty(it.next()), "Types must not contain null or empty values.");
            }
            zzb(zziy.zzk(types));
            return zzc();
        }

        @RecentlyNullable
        public abstract String getShortName();

        @RecentlyNonNull
        public abstract Builder setShortName(String str);

        abstract Builder zzb(List list);

        abstract AddressComponent zzc();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str, @RecentlyNonNull List<String> list) {
        zza zzaVar = new zza();
        zzaVar.zza(str);
        zzaVar.zzb(list);
        return zzaVar;
    }

    @RecentlyNonNull
    public abstract String getName();

    @RecentlyNullable
    public abstract String getShortName();

    @RecentlyNonNull
    public abstract List<String> getTypes();
}
