package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class zzal extends zzl {
    public static final Parcelable.Creator<zzal> CREATOR = new zzak();

    zzal(List list, List list2) {
        super(list, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeList(getPeriods());
        parcel.writeList(getWeekdayText());
    }
}
