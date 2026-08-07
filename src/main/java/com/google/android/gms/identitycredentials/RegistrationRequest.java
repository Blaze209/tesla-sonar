package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!BA\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u0019R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u001d\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/google/android/gms/identitycredentials/RegistrationRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "", "credentials", "matcher", "", "type", "requestType", "", "protocolTypes", "<init>", "([B[BLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "[B", "getCredentials", "()[B", "getMatcher", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getRequestType", "getRequestType$annotations", "()V", "Ljava/util/List;", "getProtocolTypes", "()Ljava/util/List;", "getProtocolTypes$annotations", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SafeParcelable.Class(creator = "RegistrationRequestCreator")
public final class RegistrationRequest extends AbstractSafeParcelable {
    public static final String TAG = "RegistrationRequest";

    @SafeParcelable.Field(getter = "getCredentials", id = 1)
    private final byte[] credentials;

    @SafeParcelable.Field(getter = "getMatcher", id = 2)
    private final byte[] matcher;

    @SafeParcelable.Field(defaultValueUnchecked = "java.util.Collections.emptyList()", getter = "getProtocolTypes", id = 5)
    private final List<String> protocolTypes;

    @SafeParcelable.Field(defaultValue = "", getter = "getRequestType", id = 4)
    private final String requestType;

    @SafeParcelable.Field(defaultValue = "", getter = "getType", id = 3)
    private final String type;
    public static final Parcelable.Creator<RegistrationRequest> CREATOR = new RegistrationRequestCreator();

    /* JADX WARN: Code duplicated, block: B:10:0x0046 A[EDGE_INSN: B:10:0x0046->B:17:0x005f BREAK  A[LOOP:0: B:12:0x004c->B:33:?]] */
    @SafeParcelable.Constructor
    public RegistrationRequest(@NonNull @SafeParcelable.Param(id = 1) byte[] credentials, @NonNull @SafeParcelable.Param(id = 2) byte[] matcher, @NonNull @SafeParcelable.Param(id = 3) String type, @NonNull @SafeParcelable.Param(id = 4) String requestType, @NonNull @SafeParcelable.Param(id = 5) List<String> protocolTypes) {
        boolean z11;
        s.k(credentials, "credentials");
        s.k(matcher, "matcher");
        s.k(type, "type");
        s.k(requestType, "requestType");
        s.k(protocolTypes, "protocolTypes");
        this.credentials = credentials;
        this.matcher = matcher;
        this.type = type;
        this.requestType = requestType;
        this.protocolTypes = protocolTypes;
        if (!t.y0(requestType) && !protocolTypes.isEmpty()) {
            List<String> list = protocolTypes;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z11 = false;
                        break;
                    } else if (!t.y0((String) it.next())) {
                        z11 = true;
                        break;
                    }
                }
            } else {
                z11 = false;
                break;
            }
        } else {
            z11 = false;
            break;
        }
        boolean z12 = !t.y0(this.type) && this.requestType.length() == 0 && this.protocolTypes.isEmpty();
        if (z11 || z12) {
            return;
        }
        throw new IllegalArgumentException("Either type: " + this.type + ", or requestType: " + this.requestType + " and protocolTypes: " + this.protocolTypes + " must be specified, but all were blank, or for protocolTypes, empty or full of blank elements.");
    }

    public final byte[] getCredentials() {
        return this.credentials;
    }

    public final byte[] getMatcher() {
        return this.matcher;
    }

    public final List<String> getProtocolTypes() {
        return this.protocolTypes;
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
        RegistrationRequestCreator.writeToParcel(this, dest, flags);
    }
}
