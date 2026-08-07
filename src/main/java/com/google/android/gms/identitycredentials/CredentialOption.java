package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 BE\b\u0007\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0013\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u0015R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0013\u0012\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015¨\u0006!"}, d2 = {"Lcom/google/android/gms/identitycredentials/CredentialOption;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "", "type", "Landroid/os/Bundle;", "credentialRetrievalData", "candidateQueryData", "requestMatcher", "requestType", "protocolType", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Landroid/os/Bundle;", "getCredentialRetrievalData", "()Landroid/os/Bundle;", "getCandidateQueryData", "getRequestMatcher", "getRequestType", "getRequestType$annotations", "()V", "getProtocolType", "getProtocolType$annotations", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SafeParcelable.Class(creator = "CredentialOptionCreator")
public final class CredentialOption extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getCandidateQueryData", id = 3)
    private final Bundle candidateQueryData;

    @SafeParcelable.Field(getter = "getCredentialRetrievalData", id = 2)
    private final Bundle credentialRetrievalData;

    @SafeParcelable.Field(defaultValue = "", getter = "getProtocolType", id = 6)
    private final String protocolType;

    @SafeParcelable.Field(getter = "getRequestMatcher", id = 4)
    private final String requestMatcher;

    @SafeParcelable.Field(defaultValue = "", getter = "getRequestType", id = 5)
    private final String requestType;

    @SafeParcelable.Field(defaultValue = "", getter = "getType", id = 1)
    private final String type;
    public static final Parcelable.Creator<CredentialOption> CREATOR = new CredentialOptionCreator();

    @SafeParcelable.Constructor
    public CredentialOption(@NonNull @SafeParcelable.Param(id = 1) String type, @NonNull @SafeParcelable.Param(id = 2) Bundle credentialRetrievalData, @NonNull @SafeParcelable.Param(id = 3) Bundle candidateQueryData, @NonNull @SafeParcelable.Param(id = 4) String requestMatcher, @NonNull @SafeParcelable.Param(id = 5) String requestType, @NonNull @SafeParcelable.Param(id = 6) String protocolType) {
        s.k(type, "type");
        s.k(credentialRetrievalData, "credentialRetrievalData");
        s.k(candidateQueryData, "candidateQueryData");
        s.k(requestMatcher, "requestMatcher");
        s.k(requestType, "requestType");
        s.k(protocolType, "protocolType");
        this.type = type;
        this.credentialRetrievalData = credentialRetrievalData;
        this.candidateQueryData = candidateQueryData;
        this.requestMatcher = requestMatcher;
        this.requestType = requestType;
        this.protocolType = protocolType;
        boolean z11 = (t.y0(requestType) || t.y0(protocolType)) ? false : true;
        boolean z12 = !t.y0(type) && requestType.length() == 0 && protocolType.length() == 0;
        if (z11 || z12) {
            return;
        }
        throw new IllegalArgumentException("Either type: " + type + ", or requestType: " + requestType + " and protocolType: " + protocolType + " must be specified, but at least one contains an invalid blank value.");
    }

    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    public final Bundle getCredentialRetrievalData() {
        return this.credentialRetrievalData;
    }

    public final String getProtocolType() {
        return this.protocolType;
    }

    public final String getRequestMatcher() {
        return this.requestMatcher;
    }

    public final String getRequestType() {
        return this.requestType;
    }

    public final String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        s.k(dest, "dest");
        CredentialOptionCreator.writeToParcel(this, dest, flags);
    }
}
