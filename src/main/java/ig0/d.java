package ig0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lig0/d;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "b", "Lig0/d$a;", "Lig0/d$b;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class d implements Parcelable {

    /* JADX INFO: renamed from: ig0.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0010J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010\u0010¨\u0006$"}, d2 = {"Lig0/d$a;", "Lig0/d;", "", "absoluteFilePath", "Lig0/a;", "captureMethod", "", "uploadProgress", "<init>", "(Ljava/lang/String;Lig0/a;I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "a", "(Ljava/lang/String;Lig0/a;I)Lig0/d$a;", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "c", "b", "Lig0/a;", DateTokenConverter.CONVERTER_KEY, "()Lig0/a;", "I", "e", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Local extends d {
        public static final Parcelable.Creator<Local> CREATOR = new C1641a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String absoluteFilePath;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final a captureMethod;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int uploadProgress;

        /* JADX INFO: renamed from: ig0.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C1641a implements Parcelable.Creator<Local> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Local createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Local(parcel.readString(), a.CREATOR.createFromParcel(parcel), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Local[] newArray(int i11) {
                return new Local[i11];
            }
        }

        public /* synthetic */ Local(String str, a aVar, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, aVar, (i12 & 4) != 0 ? 0 : i11);
        }

        public static /* synthetic */ Local b(Local local, String str, a aVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = local.absoluteFilePath;
            }
            if ((i12 & 2) != 0) {
                aVar = local.captureMethod;
            }
            if ((i12 & 4) != 0) {
                i11 = local.uploadProgress;
            }
            return local.a(str, aVar, i11);
        }

        public final Local a(String absoluteFilePath, a captureMethod, int uploadProgress) {
            p013kotlin.jvm.internal.s.k(absoluteFilePath, "absoluteFilePath");
            p013kotlin.jvm.internal.s.k(captureMethod, "captureMethod");
            return new Local(absoluteFilePath, captureMethod, uploadProgress);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getAbsoluteFilePath() {
            return this.absoluteFilePath;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final a getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getUploadProgress() {
            return this.uploadProgress;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!p013kotlin.jvm.internal.s.f(Local.class, other != null ? other.getClass() : null)) {
                return false;
            }
            p013kotlin.jvm.internal.s.i(other, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentFile.Local");
            return p013kotlin.jvm.internal.s.f(this.absoluteFilePath, ((Local) other).absoluteFilePath);
        }

        public int hashCode() {
            return this.absoluteFilePath.hashCode();
        }

        public String toString() {
            return "Local(absoluteFilePath=" + this.absoluteFilePath + ", captureMethod=" + this.captureMethod + ", uploadProgress=" + this.uploadProgress + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeString(this.absoluteFilePath);
            this.captureMethod.writeToParcel(dest, flags);
            dest.writeInt(this.uploadProgress);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Local(String absoluteFilePath, a captureMethod, int i11) {
            super(null);
            p013kotlin.jvm.internal.s.k(absoluteFilePath, "absoluteFilePath");
            p013kotlin.jvm.internal.s.k(captureMethod, "captureMethod");
            this.absoluteFilePath = absoluteFilePath;
            this.captureMethod = captureMethod;
            this.uploadProgress = i11;
        }
    }

    /* JADX INFO: renamed from: ig0.d$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013¨\u0006\u001f"}, d2 = {"Lig0/d$b;", "Lig0/d;", "", "absoluteFilePath", "filename", "remoteUrl", "documentFileId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", DateTokenConverter.CONVERTER_KEY, "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Remote extends d {
        public static final Parcelable.Creator<Remote> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String absoluteFilePath;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String filename;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String remoteUrl;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentFileId;

        /* JADX INFO: renamed from: ig0.d$b$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Remote> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Remote createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Remote(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Remote[] newArray(int i11) {
                return new Remote[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Remote(String str, String str2, String remoteUrl, String documentFileId) {
            super(null);
            p013kotlin.jvm.internal.s.k(remoteUrl, "remoteUrl");
            p013kotlin.jvm.internal.s.k(documentFileId, "documentFileId");
            this.absoluteFilePath = str;
            this.filename = str2;
            this.remoteUrl = remoteUrl;
            this.documentFileId = documentFileId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAbsoluteFilePath() {
            return this.absoluteFilePath;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDocumentFileId() {
            return this.documentFileId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFilename() {
            return this.filename;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getRemoteUrl() {
            return this.remoteUrl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Remote)) {
                return false;
            }
            Remote remote = (Remote) other;
            return p013kotlin.jvm.internal.s.f(this.absoluteFilePath, remote.absoluteFilePath) && p013kotlin.jvm.internal.s.f(this.filename, remote.filename) && p013kotlin.jvm.internal.s.f(this.remoteUrl, remote.remoteUrl) && p013kotlin.jvm.internal.s.f(this.documentFileId, remote.documentFileId);
        }

        public int hashCode() {
            String str = this.absoluteFilePath;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.filename;
            return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.remoteUrl.hashCode()) * 31) + this.documentFileId.hashCode();
        }

        public String toString() {
            return "Remote(absoluteFilePath=" + this.absoluteFilePath + ", filename=" + this.filename + ", remoteUrl=" + this.remoteUrl + ", documentFileId=" + this.documentFileId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeString(this.absoluteFilePath);
            dest.writeString(this.filename);
            dest.writeString(this.remoteUrl);
            dest.writeString(this.documentFileId);
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private d() {
    }
}
