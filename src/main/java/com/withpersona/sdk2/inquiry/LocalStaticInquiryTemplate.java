package com.withpersona.sdk2.inquiry;

import android.os.Parcel;
import android.os.Parcelable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@ExperimentalInquiryTemplate
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/LocalStaticInquiryTemplate;", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "", "resourceId", "<init>", "(I)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "I", "getResourceId", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalStaticInquiryTemplate implements StaticInquiryTemplate {
    public static final Parcelable.Creator<LocalStaticInquiryTemplate> CREATOR = new Creator();
    private final int resourceId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocalStaticInquiryTemplate> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalStaticInquiryTemplate createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new LocalStaticInquiryTemplate(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalStaticInquiryTemplate[] newArray(int i11) {
            return new LocalStaticInquiryTemplate[i11];
        }
    }

    public LocalStaticInquiryTemplate(int i11) {
        this.resourceId = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int getResourceId() {
        return this.resourceId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeInt(this.resourceId);
    }
}
