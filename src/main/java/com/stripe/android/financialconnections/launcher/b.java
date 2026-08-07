package com.stripe.android.financialconnections.launcher;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.Token;
import jn0.x;
import l50.InstantDebitsResult;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00052\u00020\u0001:\u0004\u0005\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/b;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", "b", "c", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/financialconnections/launcher/b$a;", "Lcom/stripe/android/financialconnections/launcher/b$c;", "Lcom/stripe/android/financialconnections/launcher/b$d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class b implements Parcelable {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/b$a;", "Lcom/stripe/android/financialconnections/launcher/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f50237b = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0827a();

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.launcher.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0827a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return a.f50237b;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        private a() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -1375852025;
        }

        public String toString() {
            return "Canceled";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.launcher.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006%"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/b$c;", "Lcom/stripe/android/financialconnections/launcher/b;", "Ll50/f;", "instantDebits", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "financialConnectionsSession", "Lcom/stripe/android/model/p1;", "token", "<init>", "(Ll50/f;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lcom/stripe/android/model/p1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ll50/f;", "c", "()Ll50/f;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/p1;", "()Lcom/stripe/android/model/p1;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Completed extends b {
        public static final Parcelable.Creator<Completed> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final InstantDebitsResult instantDebits;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final FinancialConnectionsSession financialConnectionsSession;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Token token;

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.launcher.b$c$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Completed> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Completed createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Completed(parcel.readInt() == 0 ? null : InstantDebitsResult.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FinancialConnectionsSession.CREATOR.createFromParcel(parcel) : null, (Token) parcel.readParcelable(Completed.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Completed[] newArray(int i11) {
                return new Completed[i11];
            }
        }

        public Completed() {
            this(null, null, null, 7, null);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final FinancialConnectionsSession getFinancialConnectionsSession() {
            return this.financialConnectionsSession;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InstantDebitsResult getInstantDebits() {
            return this.instantDebits;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Token getToken() {
            return this.token;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) other;
            return s.f(this.instantDebits, completed.instantDebits) && s.f(this.financialConnectionsSession, completed.financialConnectionsSession) && s.f(this.token, completed.token);
        }

        public int hashCode() {
            InstantDebitsResult instantDebitsResult = this.instantDebits;
            int iHashCode = (instantDebitsResult == null ? 0 : instantDebitsResult.hashCode()) * 31;
            FinancialConnectionsSession financialConnectionsSession = this.financialConnectionsSession;
            int iHashCode2 = (iHashCode + (financialConnectionsSession == null ? 0 : financialConnectionsSession.hashCode())) * 31;
            Token token = this.token;
            return iHashCode2 + (token != null ? token.hashCode() : 0);
        }

        public String toString() {
            return "Completed(instantDebits=" + this.instantDebits + ", financialConnectionsSession=" + this.financialConnectionsSession + ", token=" + this.token + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            InstantDebitsResult instantDebitsResult = this.instantDebits;
            if (instantDebitsResult == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                instantDebitsResult.writeToParcel(parcel, flags);
            }
            FinancialConnectionsSession financialConnectionsSession = this.financialConnectionsSession;
            if (financialConnectionsSession == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                financialConnectionsSession.writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.token, flags);
        }

        public /* synthetic */ Completed(InstantDebitsResult instantDebitsResult, FinancialConnectionsSession financialConnectionsSession, Token token, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : instantDebitsResult, (i11 & 2) != 0 ? null : financialConnectionsSession, (i11 & 4) != 0 ? null : token);
        }

        public Completed(InstantDebitsResult instantDebitsResult, FinancialConnectionsSession financialConnectionsSession, Token token) {
            super(null);
            this.instantDebits = instantDebitsResult;
            this.financialConnectionsSession = financialConnectionsSession;
            this.token = token;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.launcher.b$d, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/b$d;", "Lcom/stripe/android/financialconnections/launcher/b;", "", AnalyticsAttribute.Error, "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failed extends b {
        public static final Parcelable.Creator<Failed> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable error;

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.launcher.b$d$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Failed> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Failed createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Failed((Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Failed[] newArray(int i11) {
                return new Failed[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(Throwable error) {
            super(null);
            s.k(error, "error");
            this.error = error;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failed) && s.f(this.error, ((Failed) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Failed(error=" + this.error + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeSerializable(this.error);
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final Bundle a() {
        return q5.d.b(x.a("com.stripe.android.financialconnections.ConnectionsSheetContract.extra_result", this));
    }

    private b() {
    }
}
