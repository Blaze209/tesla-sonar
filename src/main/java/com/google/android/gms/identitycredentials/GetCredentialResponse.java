package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/google/android/gms/identitycredentials/GetCredentialResponse;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "Lcom/google/android/gms/identitycredentials/Credential;", "credential", "<init>", "(Lcom/google/android/gms/identitycredentials/Credential;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/google/android/gms/identitycredentials/Credential;", "getCredential", "()Lcom/google/android/gms/identitycredentials/Credential;", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SafeParcelable.Class(creator = "GetCredentialResponseCreator")
public final class GetCredentialResponse extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getCredential", id = 1)
    private final Credential credential;
    public static final Parcelable.Creator<GetCredentialResponse> CREATOR = new GetCredentialResponseCreator();

    @SafeParcelable.Constructor
    public GetCredentialResponse(@NonNull @SafeParcelable.Param(id = 1) Credential credential) {
        s.k(credential, "credential");
        this.credential = credential;
    }

    public final Credential getCredential() {
        return this.credential;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        s.k(dest, "dest");
        GetCredentialResponseCreator.writeToParcel(this, dest, flags);
    }
}
