package h50;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import defpackage.FinancialConnectionsGenericInfoScreen;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: h50.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\r\u001cB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0013\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\b\u0010\fJ2\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lh50/b;", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "Lh50/b$a;", "content", "Lh50/b$b;", "viewEffect", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lh50/b$a;Lh50/b$b;)V", "Landroid/os/Bundle;", "arguments", "(Landroid/os/Bundle;)V", "a", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lh50/b$a;Lh50/b$b;)Lh50/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "b", "Lh50/b$a;", "c", "()Lh50/b$a;", "Lh50/b$b;", "e", "()Lh50/b$b;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NoticeSheetState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsSessionManifest.Pane pane;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a content;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC1476b viewEffect;

    /* JADX INFO: renamed from: h50.b$a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lh50/b$a;", "Landroid/os/Parcelable;", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "Lh50/b$a$a;", "Lh50/b$a$b;", "Lh50/b$a$c;", "Lh50/b$a$d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends Parcelable {

        /* JADX INFO: renamed from: h50.b$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lh50/b$a$a;", "Lh50/b$a;", "Lcom/stripe/android/financialconnections/model/l;", "dataAccess", "<init>", "(Lcom/stripe/android/financialconnections/model/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/financialconnections/model/l;", "()Lcom/stripe/android/financialconnections/model/l;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DataAccess implements a {
            public static final Parcelable.Creator<DataAccess> CREATOR = new C1466a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DataAccessNotice dataAccess;

            /* JADX INFO: renamed from: h50.b$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C1466a implements Parcelable.Creator<DataAccess> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final DataAccess createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new DataAccess(DataAccessNotice.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final DataAccess[] newArray(int i11) {
                    return new DataAccess[i11];
                }
            }

            public DataAccess(DataAccessNotice dataAccess) {
                s.k(dataAccess, "dataAccess");
                this.dataAccess = dataAccess;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final DataAccessNotice getDataAccess() {
                return this.dataAccess;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DataAccess) && s.f(this.dataAccess, ((DataAccess) other).dataAccess);
            }

            public int hashCode() {
                return this.dataAccess.hashCode();
            }

            public String toString() {
                return "DataAccess(dataAccess=" + this.dataAccess + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                this.dataAccess.writeToParcel(parcel, flags);
            }
        }

        /* JADX INFO: renamed from: h50.b$a$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lh50/b$a$b;", "Lh50/b$a;", "Lg;", "generic", "<init>", "(Lg;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lg;", "()Lg;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Generic implements a {
            public static final Parcelable.Creator<Generic> CREATOR = new C1468a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final FinancialConnectionsGenericInfoScreen generic;

            /* JADX INFO: renamed from: h50.b$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C1468a implements Parcelable.Creator<Generic> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Generic createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new Generic(FinancialConnectionsGenericInfoScreen.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Generic[] newArray(int i11) {
                    return new Generic[i11];
                }
            }

            public Generic(FinancialConnectionsGenericInfoScreen generic) {
                s.k(generic, "generic");
                this.generic = generic;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final FinancialConnectionsGenericInfoScreen getGeneric() {
                return this.generic;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Generic) && s.f(this.generic, ((Generic) other).generic);
            }

            public int hashCode() {
                return this.generic.hashCode();
            }

            public String toString() {
                return "Generic(generic=" + this.generic + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                this.generic.writeToParcel(parcel, flags);
            }
        }

        /* JADX INFO: renamed from: h50.b$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lh50/b$a$c;", "Lh50/b$a;", "Lcom/stripe/android/financialconnections/model/u;", "legalDetails", "<init>", "(Lcom/stripe/android/financialconnections/model/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/financialconnections/model/u;", "()Lcom/stripe/android/financialconnections/model/u;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Legal implements a {
            public static final Parcelable.Creator<Legal> CREATOR = new C1469a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final LegalDetailsNotice legalDetails;

            /* JADX INFO: renamed from: h50.b$a$c$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C1469a implements Parcelable.Creator<Legal> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Legal createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new Legal(LegalDetailsNotice.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Legal[] newArray(int i11) {
                    return new Legal[i11];
                }
            }

            public Legal(LegalDetailsNotice legalDetails) {
                s.k(legalDetails, "legalDetails");
                this.legalDetails = legalDetails;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final LegalDetailsNotice getLegalDetails() {
                return this.legalDetails;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Legal) && s.f(this.legalDetails, ((Legal) other).legalDetails);
            }

            public int hashCode() {
                return this.legalDetails.hashCode();
            }

            public String toString() {
                return "Legal(legalDetails=" + this.legalDetails + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                this.legalDetails.writeToParcel(parcel, flags);
            }
        }

        /* JADX INFO: renamed from: h50.b$a$d, reason: from toString */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lh50/b$a$d;", "Lh50/b$a;", "Lg;", "generic", "Lh50/b$a$d$b;", "type", "<init>", "(Lg;Lh50/b$a$d$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lg;", "()Lg;", "b", "Lh50/b$a$d$b;", "()Lh50/b$a$d$b;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UpdateRequired implements a {
            public static final Parcelable.Creator<UpdateRequired> CREATOR = new C1470a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final FinancialConnectionsGenericInfoScreen generic;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC1471b type;

            /* JADX INFO: renamed from: h50.b$a$d$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C1470a implements Parcelable.Creator<UpdateRequired> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final UpdateRequired createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new UpdateRequired(FinancialConnectionsGenericInfoScreen.CREATOR.createFromParcel(parcel), (InterfaceC1471b) parcel.readParcelable(UpdateRequired.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final UpdateRequired[] newArray(int i11) {
                    return new UpdateRequired[i11];
                }
            }

            /* JADX INFO: renamed from: h50.b$a$d$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lh50/b$a$d$b;", "Landroid/os/Parcelable;", "a", "b", "Lh50/b$a$d$b$a;", "Lh50/b$a$d$b$b;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public interface InterfaceC1471b extends Parcelable {

                /* JADX INFO: renamed from: h50.b$a$d$b$a, reason: collision with other inner class name and from toString */
                @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001a"}, d2 = {"Lh50/b$a$d$b$a;", "Lh50/b$a$d$b;", "", "authorization", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getAuthorization", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class Repair implements InterfaceC1471b {
                    public static final Parcelable.Creator<Repair> CREATOR = new C1473a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                    private final String authorization;

                    /* JADX INFO: renamed from: h50.b$a$d$b$a$a, reason: collision with other inner class name */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class C1473a implements Parcelable.Creator<Repair> {
                        @Override // android.os.Parcelable.Creator
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Repair createFromParcel(Parcel parcel) {
                            s.k(parcel, "parcel");
                            return new Repair(parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final Repair[] newArray(int i11) {
                            return new Repair[i11];
                        }
                    }

                    public Repair(String str) {
                        this.authorization = str;
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Repair) && s.f(this.authorization, ((Repair) other).authorization);
                    }

                    public int hashCode() {
                        String str = this.authorization;
                        if (str == null) {
                            return 0;
                        }
                        return str.hashCode();
                    }

                    public String toString() {
                        return "Repair(authorization=" + this.authorization + ")";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel parcel, int flags) {
                        s.k(parcel, "out");
                        parcel.writeString(this.authorization);
                    }
                }

                /* JADX INFO: renamed from: h50.b$a$d$b$b, reason: collision with other inner class name and from toString */
                @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lh50/b$a$d$b$b;", "Lh50/b$a$d$b;", "Lcom/stripe/android/financialconnections/model/q;", "institution", "<init>", "(Lcom/stripe/android/financialconnections/model/q;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/financialconnections/model/q;", "()Lcom/stripe/android/financialconnections/model/q;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class Supportability implements InterfaceC1471b {
                    public static final Parcelable.Creator<Supportability> CREATOR = new C1475a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                    private final FinancialConnectionsInstitution institution;

                    /* JADX INFO: renamed from: h50.b$a$d$b$b$a, reason: collision with other inner class name */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class C1475a implements Parcelable.Creator<Supportability> {
                        @Override // android.os.Parcelable.Creator
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Supportability createFromParcel(Parcel parcel) {
                            s.k(parcel, "parcel");
                            return new Supportability(parcel.readInt() == 0 ? null : FinancialConnectionsInstitution.CREATOR.createFromParcel(parcel));
                        }

                        @Override // android.os.Parcelable.Creator
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final Supportability[] newArray(int i11) {
                            return new Supportability[i11];
                        }
                    }

                    public Supportability(FinancialConnectionsInstitution financialConnectionsInstitution) {
                        this.institution = financialConnectionsInstitution;
                    }

                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final FinancialConnectionsInstitution getInstitution() {
                        return this.institution;
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Supportability) && s.f(this.institution, ((Supportability) other).institution);
                    }

                    public int hashCode() {
                        FinancialConnectionsInstitution financialConnectionsInstitution = this.institution;
                        if (financialConnectionsInstitution == null) {
                            return 0;
                        }
                        return financialConnectionsInstitution.hashCode();
                    }

                    public String toString() {
                        return "Supportability(institution=" + this.institution + ")";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel parcel, int flags) {
                        s.k(parcel, "out");
                        FinancialConnectionsInstitution financialConnectionsInstitution = this.institution;
                        if (financialConnectionsInstitution == null) {
                            parcel.writeInt(0);
                        } else {
                            parcel.writeInt(1);
                            financialConnectionsInstitution.writeToParcel(parcel, flags);
                        }
                    }
                }
            }

            public UpdateRequired(FinancialConnectionsGenericInfoScreen generic, InterfaceC1471b type) {
                s.k(generic, "generic");
                s.k(type, "type");
                this.generic = generic;
                this.type = type;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final FinancialConnectionsGenericInfoScreen getGeneric() {
                return this.generic;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final InterfaceC1471b getType() {
                return this.type;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateRequired)) {
                    return false;
                }
                UpdateRequired updateRequired = (UpdateRequired) other;
                return s.f(this.generic, updateRequired.generic) && s.f(this.type, updateRequired.type);
            }

            public int hashCode() {
                return (this.generic.hashCode() * 31) + this.type.hashCode();
            }

            public String toString() {
                return "UpdateRequired(generic=" + this.generic + ", type=" + this.type + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                this.generic.writeToParcel(parcel, flags);
                parcel.writeParcelable(this.type, flags);
            }
        }
    }

    /* JADX INFO: renamed from: h50.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lh50/b$b;", "", "a", "Lh50/b$b$a;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface InterfaceC1476b {

        /* JADX INFO: renamed from: h50.b$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lh50/b$b$a;", "Lh50/b$b;", "", ImagesContract.URL, "", "id", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "getId", "()J", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenUrl implements InterfaceC1476b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String url;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final long id;

            public OpenUrl(String url, long j11) {
                s.k(url, "url");
                this.url = url;
                this.id = j11;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OpenUrl)) {
                    return false;
                }
                OpenUrl openUrl = (OpenUrl) other;
                return s.f(this.url, openUrl.url) && this.id == openUrl.id;
            }

            public int hashCode() {
                return (this.url.hashCode() * 31) + Long.hashCode(this.id);
            }

            public String toString() {
                return "OpenUrl(url=" + this.url + ", id=" + this.id + ")";
            }
        }
    }

    public NoticeSheetState(FinancialConnectionsSessionManifest.Pane pane, a aVar, InterfaceC1476b interfaceC1476b) {
        s.k(pane, "pane");
        this.pane = pane;
        this.content = aVar;
        this.viewEffect = interfaceC1476b;
    }

    public static /* synthetic */ NoticeSheetState b(NoticeSheetState noticeSheetState, FinancialConnectionsSessionManifest.Pane pane, a aVar, InterfaceC1476b interfaceC1476b, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pane = noticeSheetState.pane;
        }
        if ((i11 & 2) != 0) {
            aVar = noticeSheetState.content;
        }
        if ((i11 & 4) != 0) {
            interfaceC1476b = noticeSheetState.viewEffect;
        }
        return noticeSheetState.a(pane, aVar, interfaceC1476b);
    }

    public final NoticeSheetState a(FinancialConnectionsSessionManifest.Pane pane, a content, InterfaceC1476b viewEffect) {
        s.k(pane, "pane");
        return new NoticeSheetState(pane, content, viewEffect);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getPane() {
        return this.pane;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC1476b getViewEffect() {
        return this.viewEffect;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoticeSheetState)) {
            return false;
        }
        NoticeSheetState noticeSheetState = (NoticeSheetState) other;
        return this.pane == noticeSheetState.pane && s.f(this.content, noticeSheetState.content) && s.f(this.viewEffect, noticeSheetState.viewEffect);
    }

    public int hashCode() {
        int iHashCode = this.pane.hashCode() * 31;
        a aVar = this.content;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        InterfaceC1476b interfaceC1476b = this.viewEffect;
        return iHashCode2 + (interfaceC1476b != null ? interfaceC1476b.hashCode() : 0);
    }

    public String toString() {
        return "NoticeSheetState(pane=" + this.pane + ", content=" + this.content + ", viewEffect=" + this.viewEffect + ")";
    }

    public /* synthetic */ NoticeSheetState(FinancialConnectionsSessionManifest.Pane pane, a aVar, InterfaceC1476b interfaceC1476b, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(pane, (i11 & 2) != 0 ? null : aVar, (i11 & 4) != 0 ? null : interfaceC1476b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NoticeSheetState(Bundle bundle) {
        FinancialConnectionsSessionManifest.Pane paneA = o50.b.INSTANCE.a(bundle);
        s.h(paneA);
        this(paneA, null, null, 6, null);
    }
}
