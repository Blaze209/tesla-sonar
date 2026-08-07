package ig0;

import android.os.Parcel;
import android.os.Parcelable;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lig0/l;", "Landroid/os/Parcelable;", "Lig0/u;", "documentStartPage", "Lig0/b3;", "uploadOptionsDialog", "<init>", "(Lig0/u;Lig0/b3;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Lig0/u;", "()Lig0/u;", "b", "Lig0/b3;", "()Lig0/b3;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u documentStartPage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b3 uploadOptionsDialog;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new l(u.CREATOR.createFromParcel(parcel), b3.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l[] newArray(int i11) {
            return new l[i11];
        }
    }

    public l(u documentStartPage, b3 uploadOptionsDialog) {
        p013kotlin.jvm.internal.s.k(documentStartPage, "documentStartPage");
        p013kotlin.jvm.internal.s.k(uploadOptionsDialog, "uploadOptionsDialog");
        this.documentStartPage = documentStartPage;
        this.uploadOptionsDialog = uploadOptionsDialog;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final u getDocumentStartPage() {
        return this.documentStartPage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b3 getUploadOptionsDialog() {
        return this.uploadOptionsDialog;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        p013kotlin.jvm.internal.s.k(dest, "dest");
        this.documentStartPage.writeToParcel(dest, flags);
        this.uploadOptionsDialog.writeToParcel(dest, flags);
    }
}
