package com.plaid.link.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.M0;
import com.plaid.link.exception.LinkConfigurationMissingTokenException;
import java.util.Objects;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001'B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/plaid/link/configuration/LinkTokenConfiguration;", "Landroid/os/Parcelable;", "", "token", "Lcom/plaid/link/configuration/LinkLogLevel;", "logLevel", "", "noLoadingState", "Lcom/plaid/internal/M0;", "embeddedSessionInfo", "<init>", "(Ljava/lang/String;Lcom/plaid/link/configuration/LinkLogLevel;ZLcom/plaid/internal/M0;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getToken", "Lcom/plaid/link/configuration/LinkLogLevel;", "getLogLevel", "()Lcom/plaid/link/configuration/LinkLogLevel;", "Z", "getNoLoadingState", "()Z", "Lcom/plaid/internal/M0;", "getEmbeddedSessionInfo", "()Lcom/plaid/internal/M0;", "Builder", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LinkTokenConfiguration implements Parcelable {
    public static final Parcelable.Creator<LinkTokenConfiguration> CREATOR = new Creator();
    private final M0 embeddedSessionInfo;
    private final LinkLogLevel logLevel;
    private final boolean noLoadingState;
    private final String token;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R.\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/plaid/link/configuration/LinkTokenConfiguration$Builder;", "", "<init>", "()V", "Lcom/plaid/link/configuration/LinkLogLevel;", "logLevel", "(Lcom/plaid/link/configuration/LinkLogLevel;)Lcom/plaid/link/configuration/LinkTokenConfiguration$Builder;", "", "token", "(Ljava/lang/String;)Lcom/plaid/link/configuration/LinkTokenConfiguration$Builder;", "", "noLoadingState", "(Z)Lcom/plaid/link/configuration/LinkTokenConfiguration$Builder;", "Lcom/plaid/internal/M0;", "embeddedSessionInfo", "(Lcom/plaid/internal/M0;)Lcom/plaid/link/configuration/LinkTokenConfiguration$Builder;", "Lcom/plaid/link/configuration/LinkTokenConfiguration;", "build", "()Lcom/plaid/link/configuration/LinkTokenConfiguration;", "<set-?>", "Lcom/plaid/link/configuration/LinkLogLevel;", "getLogLevel", "()Lcom/plaid/link/configuration/LinkLogLevel;", "setLogLevel", "(Lcom/plaid/link/configuration/LinkLogLevel;)V", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "Z", "getNoLoadingState", "()Z", "setNoLoadingState", "(Z)V", "Lcom/plaid/internal/M0;", "getEmbeddedSessionInfo", "()Lcom/plaid/internal/M0;", "setEmbeddedSessionInfo", "(Lcom/plaid/internal/M0;)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private M0 embeddedSessionInfo;
        private LinkLogLevel logLevel = LinkLogLevel.ASSERT;
        private boolean noLoadingState;
        private String token;

        public final LinkTokenConfiguration build() {
            M0 m11 = this.embeddedSessionInfo;
            if (m11 != null) {
                return new LinkTokenConfiguration(m11.f46441a, this.logLevel, this.noLoadingState, m11, null);
            }
            String str = this.token;
            if (str == null) {
                throw LinkConfigurationMissingTokenException.INSTANCE;
            }
            if (str.length() == 0) {
                throw LinkConfigurationMissingTokenException.INSTANCE;
            }
            return new LinkTokenConfiguration(str, this.logLevel, this.noLoadingState, null, 8, null);
        }

        public final Builder embeddedSessionInfo(M0 embeddedSessionInfo) {
            s.k(embeddedSessionInfo, "embeddedSessionInfo");
            this.embeddedSessionInfo = embeddedSessionInfo;
            return this;
        }

        public final M0 getEmbeddedSessionInfo() {
            return this.embeddedSessionInfo;
        }

        public final LinkLogLevel getLogLevel() {
            return this.logLevel;
        }

        public final boolean getNoLoadingState() {
            return this.noLoadingState;
        }

        public final String getToken() {
            return this.token;
        }

        public final Builder logLevel(LinkLogLevel logLevel) {
            s.k(logLevel, "logLevel");
            this.logLevel = logLevel;
            return this;
        }

        public final Builder noLoadingState(boolean noLoadingState) {
            this.noLoadingState = noLoadingState;
            return this;
        }

        public final /* synthetic */ void setEmbeddedSessionInfo(M0 m11) {
            this.embeddedSessionInfo = m11;
        }

        public final /* synthetic */ void setLogLevel(LinkLogLevel linkLogLevel) {
            s.k(linkLogLevel, "<set-?>");
            this.logLevel = linkLogLevel;
        }

        public final /* synthetic */ void setNoLoadingState(boolean z11) {
            this.noLoadingState = z11;
        }

        public final /* synthetic */ void setToken(String str) {
            this.token = str;
        }

        public final Builder token(String token) {
            s.k(token, "token");
            this.token = token;
            return this;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkTokenConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkTokenConfiguration createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new LinkTokenConfiguration(parcel.readString(), LinkLogLevel.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : M0.CREATOR.createFromParcel(parcel), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkTokenConfiguration[] newArray(int i11) {
            return new LinkTokenConfiguration[i11];
        }
    }

    public /* synthetic */ LinkTokenConfiguration(String str, LinkLogLevel linkLogLevel, boolean z11, M0 m11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, linkLogLevel, z11, m11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!s.f(LinkTokenConfiguration.class, other != null ? other.getClass() : null)) {
            return false;
        }
        s.i(other, "null cannot be cast to non-null type com.plaid.link.configuration.LinkTokenConfiguration");
        LinkTokenConfiguration linkTokenConfiguration = (LinkTokenConfiguration) other;
        return this.logLevel == linkTokenConfiguration.logLevel && s.f(this.token, linkTokenConfiguration.token) && this.noLoadingState == linkTokenConfiguration.noLoadingState && s.f(this.embeddedSessionInfo, linkTokenConfiguration.embeddedSessionInfo);
    }

    public final M0 getEmbeddedSessionInfo() {
        return this.embeddedSessionInfo;
    }

    public final LinkLogLevel getLogLevel() {
        return this.logLevel;
    }

    public final boolean getNoLoadingState() {
        return this.noLoadingState;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return Objects.hash(this.token, this.logLevel, Boolean.valueOf(this.noLoadingState), this.embeddedSessionInfo);
    }

    public String toString() {
        return "LinkTokenConfiguration(token=" + this.token + ", logLevel=" + this.logLevel + ", noLoadingState=" + this.noLoadingState + ", embeddedSessionInfo=" + this.embeddedSessionInfo + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.token);
        parcel.writeString(this.logLevel.name());
        parcel.writeInt(this.noLoadingState ? 1 : 0);
        M0 m11 = this.embeddedSessionInfo;
        if (m11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            m11.writeToParcel(parcel, flags);
        }
    }

    private LinkTokenConfiguration(String str, LinkLogLevel linkLogLevel, boolean z11, M0 m11) {
        this.token = str;
        this.logLevel = linkLogLevel;
        this.noLoadingState = z11;
        this.embeddedSessionInfo = m11;
    }

    public /* synthetic */ LinkTokenConfiguration(String str, LinkLogLevel linkLogLevel, boolean z11, M0 m11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? LinkLogLevel.ASSERT : linkLogLevel, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : m11);
    }
}
