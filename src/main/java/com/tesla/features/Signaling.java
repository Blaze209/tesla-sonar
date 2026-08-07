package com.tesla.features;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/tesla/features/Signaling;", "", "useAuthToken", "", "<init>", "(Z)V", "getUseAuthToken", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "features_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Signaling {

    @g(name = "use_auth_token")
    private final boolean useAuthToken;

    public Signaling() {
        this(false, 1, null);
    }

    public static /* synthetic */ Signaling copy$default(Signaling signaling, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = signaling.useAuthToken;
        }
        return signaling.copy(z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getUseAuthToken() {
        return this.useAuthToken;
    }

    public final Signaling copy(boolean useAuthToken) {
        return new Signaling(useAuthToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Signaling) && this.useAuthToken == ((Signaling) other).useAuthToken;
    }

    public final boolean getUseAuthToken() {
        return this.useAuthToken;
    }

    public int hashCode() {
        return Boolean.hashCode(this.useAuthToken);
    }

    public String toString() {
        return "Signaling(useAuthToken=" + this.useAuthToken + ")";
    }

    public Signaling(boolean z11) {
        this.useAuthToken = z11;
    }

    public /* synthetic */ Signaling(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
