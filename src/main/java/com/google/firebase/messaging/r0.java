package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
public final class r0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<r0> CREATOR = new s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    Bundle f44345a;

    @SafeParcelable.Constructor
    public r0(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f44345a = bundle;
    }

    @KeepForSdk
    public Intent T() {
        Intent intent = new Intent();
        intent.putExtras(this.f44345a);
        return intent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        s0.c(this, parcel, i11);
    }
}
