package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "PaymentCardRecognitionIntentRequestCreator")
public class PaymentCardRecognitionIntentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PaymentCardRecognitionIntentRequest> CREATOR = new zzy();

    @SafeParcelable.Field(id = 1)
    int zza;

    public final class Builder {
        /* synthetic */ Builder(zzx zzxVar) {
        }

        @NonNull
        public PaymentCardRecognitionIntentRequest build() {
            Preconditions.checkArgument(PaymentCardRecognitionIntentRequest.this.zza != 0, "The paymentCardRecognitionType is required when creating a PaymentCardRecognitionIntentRequest.");
            return PaymentCardRecognitionIntentRequest.this;
        }
    }

    PaymentCardRecognitionIntentRequest() {
    }

    @NonNull
    public static Builder builder() {
        return new PaymentCardRecognitionIntentRequest().new Builder(null);
    }

    @NonNull
    public static PaymentCardRecognitionIntentRequest getDefaultInstance() {
        Builder builder = new PaymentCardRecognitionIntentRequest().new Builder(null);
        PaymentCardRecognitionIntentRequest.this.zza = 1;
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    PaymentCardRecognitionIntentRequest(@SafeParcelable.Param(id = 1) int i11) {
        this.zza = i11;
    }
}
