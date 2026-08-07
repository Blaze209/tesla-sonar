package com.teslamotors.plugins.ble.messages;

import android.os.Parcel;
import android.os.Parcelable;
import io.realm.internal.Keep;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/teslamotors/plugins/ble/messages/NonUserFeedback;", "Landroid/os/Parcelable;", "", "comment", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/teslamotors/plugins/ble/messages/NonUserFeedback;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getComment", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Keep
public final /* data */ class NonUserFeedback implements Parcelable {
    public static final Parcelable.Creator<NonUserFeedback> CREATOR = new a();
    private final String comment;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NonUserFeedback> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NonUserFeedback createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new NonUserFeedback(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NonUserFeedback[] newArray(int i11) {
            return new NonUserFeedback[i11];
        }
    }

    public NonUserFeedback(String comment) {
        s.k(comment, "comment");
        this.comment = comment;
    }

    public static /* synthetic */ NonUserFeedback copy$default(NonUserFeedback nonUserFeedback, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = nonUserFeedback.comment;
        }
        return nonUserFeedback.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    public final NonUserFeedback copy(String comment) {
        s.k(comment, "comment");
        return new NonUserFeedback(comment);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NonUserFeedback) && s.f(this.comment, ((NonUserFeedback) other).comment);
    }

    public final String getComment() {
        return this.comment;
    }

    public int hashCode() {
        return this.comment.hashCode();
    }

    public String toString() {
        return "NonUserFeedback(comment=" + this.comment + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.comment);
    }
}
