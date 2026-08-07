package com.withpersona.sdk2.inquiry.nfc;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/a;", "Landroid/os/Parcelable;", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, "a", "b", "c", "Lcom/withpersona/sdk2/inquiry/nfc/a$a;", "Lcom/withpersona/sdk2/inquiry/nfc/a$b;", "Lcom/withpersona/sdk2/inquiry/nfc/a$d;", "nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a implements Parcelable {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.nfc.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/a$a;", "Lcom/withpersona/sdk2/inquiry/nfc/a;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class C1192a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1192a f58327a = new C1192a();
        public static final Parcelable.Creator<C1192a> CREATOR = new C1193a();

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.nfc.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C1193a implements Parcelable.Creator<C1192a> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C1192a createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return C1192a.f58327a;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C1192a[] newArray(int i11) {
                return new C1192a[i11];
            }
        }

        private C1192a() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C1192a);
        }

        public int hashCode() {
            return -869674698;
        }

        public String toString() {
            return "Cancel";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/a$b;", "Lcom/withpersona/sdk2/inquiry/nfc/a;", "", "debugMessage", "Lcom/withpersona/sdk2/inquiry/nfc/a$c;", "cause", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/nfc/a$c;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Ljava/lang/String;", "getDebugMessage", "()Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/nfc/a$c;", "getCause", "()Lcom/withpersona/sdk2/inquiry/nfc/a$c;", "nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends a {
        public static final Parcelable.Creator<b> CREATOR = new C1194a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String debugMessage;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final c cause;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.nfc.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C1194a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new b(parcel.readString(), c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, c cause) {
            super(null);
            s.k(cause, "cause");
            this.debugMessage = str;
            this.cause = cause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeString(this.debugMessage);
            dest.writeString(this.cause.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/a$c;", "", "<init>", "(Ljava/lang/String;I)V", "AuthenticationError", "Unknown", "nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum c {
        AuthenticationError,
        Unknown;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/a$d;", "Lcom/withpersona/sdk2/inquiry/nfc/a;", "Landroid/net/Uri;", "dg1Uri", "dg2Uri", "sodUri", "Lnh0/a;", "chipAuthenticationStatus", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Lnh0/a;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Landroid/net/Uri;", "b", "()Landroid/net/Uri;", "c", DateTokenConverter.CONVERTER_KEY, "Lnh0/a;", "()Lnh0/a;", "nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends a {
        public static final Parcelable.Creator<d> CREATOR = new C1195a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Uri dg1Uri;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Uri dg2Uri;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Uri sodUri;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final nh0.a chipAuthenticationStatus;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.nfc.a$d$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C1195a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new d((Uri) parcel.readParcelable(d.class.getClassLoader()), (Uri) parcel.readParcelable(d.class.getClassLoader()), (Uri) parcel.readParcelable(d.class.getClassLoader()), nh0.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Uri dg1Uri, Uri dg2Uri, Uri sodUri, nh0.a chipAuthenticationStatus) {
            super(null);
            s.k(dg1Uri, "dg1Uri");
            s.k(dg2Uri, "dg2Uri");
            s.k(sodUri, "sodUri");
            s.k(chipAuthenticationStatus, "chipAuthenticationStatus");
            this.dg1Uri = dg1Uri;
            this.dg2Uri = dg2Uri;
            this.sodUri = sodUri;
            this.chipAuthenticationStatus = chipAuthenticationStatus;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final nh0.a getChipAuthenticationStatus() {
            return this.chipAuthenticationStatus;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Uri getDg1Uri() {
            return this.dg1Uri;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Uri getDg2Uri() {
            return this.dg2Uri;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Uri getSodUri() {
            return this.sodUri;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeParcelable(this.dg1Uri, flags);
            dest.writeParcelable(this.dg2Uri, flags);
            dest.writeParcelable(this.sodUri, flags);
            dest.writeString(this.chipAuthenticationStatus.name());
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
