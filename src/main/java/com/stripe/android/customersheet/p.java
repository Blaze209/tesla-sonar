package com.stripe.android.customersheet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \n2\u00020\u0001:\u0004\n\u0007\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/customersheet/p;", "Landroid/os/Parcelable;", "<init>", "()V", "Lw70/h;", "paymentOptionFactory", "Lcom/stripe/android/customersheet/i;", "b", "(Lw70/h;)Lcom/stripe/android/customersheet/i;", "Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", "c", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/customersheet/p$a;", "Lcom/stripe/android/customersheet/p$c;", "Lcom/stripe/android/customersheet/p$d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class p implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.stripe.android.customersheet.p$a, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/stripe/android/customersheet/p$a;", "Lcom/stripe/android/customersheet/p;", "Lw70/j;", "paymentSelection", "<init>", "(Lw70/j;)V", "Lw70/h;", "paymentOptionFactory", "Lcom/stripe/android/customersheet/i;", "b", "(Lw70/h;)Lcom/stripe/android/customersheet/i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lw70/j;", "getPaymentSelection", "()Lw70/j;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Canceled extends p {
        public static final Parcelable.Creator<Canceled> CREATOR = new C0810a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final w70.j paymentSelection;

        /* JADX INFO: renamed from: com.stripe.android.customersheet.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0810a implements Parcelable.Creator<Canceled> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Canceled createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Canceled((w70.j) parcel.readParcelable(Canceled.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Canceled[] newArray(int i11) {
                return new Canceled[i11];
            }
        }

        public Canceled(w70.j jVar) {
            super(null);
            this.paymentSelection = jVar;
        }

        @Override // com.stripe.android.customersheet.p
        public i b(w70.h paymentOptionFactory) {
            p013kotlin.jvm.internal.s.k(paymentOptionFactory, "paymentOptionFactory");
            w70.j jVar = this.paymentSelection;
            return new i.a(jVar != null ? d.INSTANCE.c(jVar, paymentOptionFactory, true) : null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Canceled) && p013kotlin.jvm.internal.s.f(this.paymentSelection, ((Canceled) other).paymentSelection);
        }

        public int hashCode() {
            w70.j jVar = this.paymentSelection;
            if (jVar == null) {
                return 0;
            }
            return jVar.hashCode();
        }

        public String toString() {
            return "Canceled(paymentSelection=" + this.paymentSelection + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeParcelable(this.paymentSelection, flags);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.customersheet.p$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/customersheet/p$b;", "", "<init>", "()V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Lcom/stripe/android/customersheet/p;", "a", "(Landroid/content/Intent;)Lcom/stripe/android/customersheet/p;", "", "EXTRA_RESULT", "Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ p a(Intent intent) {
            if (intent != null) {
                return (p) intent.getParcelableExtra("extra_activity_result");
            }
            return null;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/customersheet/p$c;", "Lcom/stripe/android/customersheet/p;", "", "exception", "<init>", "(Ljava/lang/Throwable;)V", "Lw70/h;", "paymentOptionFactory", "Lcom/stripe/android/customersheet/i;", "b", "(Lw70/h;)Lcom/stripe/android/customersheet/i;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Throwable;", "getException", "()Ljava/lang/Throwable;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends p {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Throwable exception;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new c((Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i11) {
                return new c[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable exception) {
            super(null);
            p013kotlin.jvm.internal.s.k(exception, "exception");
            this.exception = exception;
        }

        @Override // com.stripe.android.customersheet.p
        public i b(w70.h paymentOptionFactory) {
            p013kotlin.jvm.internal.s.k(paymentOptionFactory, "paymentOptionFactory");
            return new i.c(this.exception);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeSerializable(this.exception);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.customersheet.p$d, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/stripe/android/customersheet/p$d;", "Lcom/stripe/android/customersheet/p;", "Lw70/j;", "paymentSelection", "<init>", "(Lw70/j;)V", "Lw70/h;", "paymentOptionFactory", "Lcom/stripe/android/customersheet/i;", "b", "(Lw70/h;)Lcom/stripe/android/customersheet/i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lw70/j;", "getPaymentSelection", "()Lw70/j;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Selected extends p {
        public static final Parcelable.Creator<Selected> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final w70.j paymentSelection;

        /* JADX INFO: renamed from: com.stripe.android.customersheet.p$d$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Selected> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Selected createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Selected((w70.j) parcel.readParcelable(Selected.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Selected[] newArray(int i11) {
                return new Selected[i11];
            }
        }

        public Selected(w70.j jVar) {
            super(null);
            this.paymentSelection = jVar;
        }

        @Override // com.stripe.android.customersheet.p
        public i b(w70.h paymentOptionFactory) {
            p013kotlin.jvm.internal.s.k(paymentOptionFactory, "paymentOptionFactory");
            w70.j jVar = this.paymentSelection;
            return new i.d(jVar != null ? d.INSTANCE.c(jVar, paymentOptionFactory, true) : null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Selected) && p013kotlin.jvm.internal.s.f(this.paymentSelection, ((Selected) other).paymentSelection);
        }

        public int hashCode() {
            w70.j jVar = this.paymentSelection;
            if (jVar == null) {
                return 0;
            }
            return jVar.hashCode();
        }

        public String toString() {
            return "Selected(paymentSelection=" + this.paymentSelection + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeParcelable(this.paymentSelection, flags);
        }
    }

    public /* synthetic */ p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final Bundle a() {
        return q5.d.b(x.a("extra_activity_result", this));
    }

    public abstract i b(w70.h paymentOptionFactory);

    private p() {
    }
}
