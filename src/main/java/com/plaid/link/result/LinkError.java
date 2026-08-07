package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.C4571x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001(B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b'\u0010\r¨\u0006)"}, d2 = {"Lcom/plaid/link/result/LinkError;", "Landroid/os/Parcelable;", "Lcom/plaid/link/result/LinkErrorCode;", "errorCode", "", "errorMessage", "displayMessage", "errorJson", "<init>", "(Lcom/plaid/link/result/LinkErrorCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/plaid/link/result/LinkErrorCode;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/plaid/link/result/LinkErrorCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/plaid/link/result/LinkError;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/plaid/link/result/LinkErrorCode;", "getErrorCode", "Ljava/lang/String;", "getErrorMessage", "getDisplayMessage", "getErrorJson", "Companion", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LinkError implements Parcelable {
    private final String displayMessage;
    private final LinkErrorCode errorCode;
    private final String errorJson;
    private final String errorMessage;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LinkError> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/plaid/link/result/LinkError$Companion;", "", "()V", "fromException", "Lcom/plaid/link/result/LinkError;", "exception", "", "fromException$link_sdk_release", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkError fromException$link_sdk_release(Throwable exception) {
            String message;
            String message2;
            if (exception == null || (message = exception.getMessage()) == null) {
                message = "Internal Error";
            }
            String simpleName = exception != null ? exception.getClass().getSimpleName() : null;
            LinkErrorCode.INTERNAL_ERROR internal_error = new LinkErrorCode.INTERNAL_ERROR(message, new LinkErrorType.INTERNAL_ERROR_TYPE(simpleName != null ? simpleName : "Internal Error"));
            String localizedMessage = exception != null ? exception.getLocalizedMessage() : null;
            if (localizedMessage == null) {
                localizedMessage = "Internal exception occurred";
            }
            String str = localizedMessage;
            if (exception == null || (message2 = exception.getMessage()) == null) {
                message2 = "An unknown error occurred, please try again later";
            }
            return new LinkError(internal_error, str, message2, null, 8, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkError createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new LinkError((LinkErrorCode) parcel.readParcelable(LinkError.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkError[] newArray(int i11) {
            return new LinkError[i11];
        }
    }

    public LinkError(LinkErrorCode errorCode, String errorMessage, String str, String str2) {
        s.k(errorCode, "errorCode");
        s.k(errorMessage, "errorMessage");
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.displayMessage = str;
        this.errorJson = str2;
    }

    public static /* synthetic */ LinkError copy$default(LinkError linkError, LinkErrorCode linkErrorCode, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            linkErrorCode = linkError.errorCode;
        }
        if ((i11 & 2) != 0) {
            str = linkError.errorMessage;
        }
        if ((i11 & 4) != 0) {
            str2 = linkError.displayMessage;
        }
        if ((i11 & 8) != 0) {
            str3 = linkError.errorJson;
        }
        return linkError.copy(linkErrorCode, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LinkErrorCode getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplayMessage() {
        return this.displayMessage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrorJson() {
        return this.errorJson;
    }

    public final LinkError copy(LinkErrorCode errorCode, String errorMessage, String displayMessage, String errorJson) {
        s.k(errorCode, "errorCode");
        s.k(errorMessage, "errorMessage");
        return new LinkError(errorCode, errorMessage, displayMessage, errorJson);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkError)) {
            return false;
        }
        LinkError linkError = (LinkError) other;
        return s.f(this.errorCode, linkError.errorCode) && s.f(this.errorMessage, linkError.errorMessage) && s.f(this.displayMessage, linkError.displayMessage) && s.f(this.errorJson, linkError.errorJson);
    }

    public final String getDisplayMessage() {
        return this.displayMessage;
    }

    public final LinkErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorJson() {
        return this.errorJson;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        int iA = C4571x.a(this.errorMessage, this.errorCode.hashCode() * 31, 31);
        String str = this.displayMessage;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorJson;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "LinkError(errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", displayMessage=" + this.displayMessage + ", errorJson=" + this.errorJson + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeParcelable(this.errorCode, flags);
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.displayMessage);
        parcel.writeString(this.errorJson);
    }

    public /* synthetic */ LinkError(LinkErrorCode linkErrorCode, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(linkErrorCode, str, str2, (i11 & 8) != 0 ? null : str3);
    }
}
