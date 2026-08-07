package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B9\b\u0007\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "Lcom/google/android/gms/common/internal/ReflectedParcelable;", "", "Lcom/google/android/gms/identitycredentials/CredentialOption;", "credentialOptions", "Landroid/os/Bundle;", "data", "", "origin", "Landroid/os/ResultReceiver;", "resultReceiver", "<init>", "(Ljava/util/List;Landroid/os/Bundle;Ljava/lang/String;Landroid/os/ResultReceiver;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getCredentialOptions", "()Ljava/util/List;", "Landroid/os/Bundle;", "getData", "()Landroid/os/Bundle;", "Ljava/lang/String;", "getOrigin", "()Ljava/lang/String;", "Landroid/os/ResultReceiver;", "getResultReceiver", "()Landroid/os/ResultReceiver;", "getResultReceiver$annotations", "()V", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SafeParcelable.Class(creator = "GetCredentialRequestCreator")
public final class GetCredentialRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @SafeParcelable.Field(getter = "getCredentialOptions", id = 1)
    private final List<CredentialOption> credentialOptions;

    @SafeParcelable.Field(getter = "getData", id = 2)
    private final Bundle data;

    @SafeParcelable.Field(getter = "getOrigin", id = 3)
    private final String origin;

    @SafeParcelable.Field(getter = "getResultReceiver", id = 4)
    private final ResultReceiver resultReceiver;
    public static final Parcelable.Creator<GetCredentialRequest> CREATOR = new GetCredentialRequestCreator();

    @SafeParcelable.Constructor
    public GetCredentialRequest(@NonNull @SafeParcelable.Param(id = 1) List<CredentialOption> credentialOptions, @NonNull @SafeParcelable.Param(id = 2) Bundle data, @SafeParcelable.Param(id = 3) String str, @NonNull @SafeParcelable.Param(id = 4) ResultReceiver resultReceiver) {
        s.k(credentialOptions, "credentialOptions");
        s.k(data, "data");
        s.k(resultReceiver, "resultReceiver");
        this.credentialOptions = credentialOptions;
        this.data = data;
        this.origin = str;
        this.resultReceiver = resultReceiver;
    }

    public final List<CredentialOption> getCredentialOptions() {
        return this.credentialOptions;
    }

    public final Bundle getData() {
        return this.data;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final ResultReceiver getResultReceiver() {
        return this.resultReceiver;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        s.k(dest, "dest");
        GetCredentialRequestCreator.writeToParcel(this, dest, flags);
    }
}
