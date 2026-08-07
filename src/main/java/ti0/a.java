package ti0;

import android.os.Parcel;
import android.os.Parcelable;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lti0/a;", "Landroid/os/Parcelable;", "a", "b", "Lti0/a$a;", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a extends Parcelable {

    /* JADX INFO: renamed from: ti0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\u001a\u0010\u0013¨\u0006\""}, d2 = {"Lti0/a$a;", "Lti0/a;", "", "nonce", "Lti0/a$b;", "idType", "requestJson", "<init>", "(Ljava/lang/String;Lti0/a$b;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getNonce", "b", "Lti0/a$b;", "getIdType", "()Lti0/a$b;", "c", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GoogleWalletRequestMetadata implements a {
        public static final Parcelable.Creator<GoogleWalletRequestMetadata> CREATOR = new C2447a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nonce;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b idType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String requestJson;

        /* JADX INFO: renamed from: ti0.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C2447a implements Parcelable.Creator<GoogleWalletRequestMetadata> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GoogleWalletRequestMetadata createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new GoogleWalletRequestMetadata(parcel.readString(), b.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GoogleWalletRequestMetadata[] newArray(int i11) {
                return new GoogleWalletRequestMetadata[i11];
            }
        }

        public GoogleWalletRequestMetadata(String nonce, b idType, String requestJson) {
            s.k(nonce, "nonce");
            s.k(idType, "idType");
            s.k(requestJson, "requestJson");
            this.nonce = nonce;
            this.idType = idType;
            this.requestJson = requestJson;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getRequestJson() {
            return this.requestJson;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GoogleWalletRequestMetadata)) {
                return false;
            }
            GoogleWalletRequestMetadata googleWalletRequestMetadata = (GoogleWalletRequestMetadata) other;
            return s.f(this.nonce, googleWalletRequestMetadata.nonce) && this.idType == googleWalletRequestMetadata.idType && s.f(this.requestJson, googleWalletRequestMetadata.requestJson);
        }

        public int hashCode() {
            return (((this.nonce.hashCode() * 31) + this.idType.hashCode()) * 31) + this.requestJson.hashCode();
        }

        public String toString() {
            return "GoogleWalletRequestMetadata(nonce=" + this.nonce + ", idType=" + this.idType + ", requestJson=" + this.requestJson + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeString(this.nonce);
            dest.writeString(this.idType.name());
            dest.writeString(this.requestJson);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lti0/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "DL", "PP", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum b {
        DL,
        PP;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }
    }
}
