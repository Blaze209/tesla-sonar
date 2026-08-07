package com.stripe.android.paymentsheet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.PaymentMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u000b2\u00020\u0001:\u0004\t\u000b\u0007\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000f\u0082\u0001\u0003\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/s;", "Landroid/os/Parcelable;", "", StatusResponse.RESULT_CODE, "<init>", "(I)V", "Landroid/os/Bundle;", "c", "()Landroid/os/Bundle;", "a", "I", "b", "()I", "", "Lcom/stripe/android/model/v0;", "()Ljava/util/List;", "paymentMethods", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/paymentsheet/s$a;", "Lcom/stripe/android/paymentsheet/s$c;", "Lcom/stripe/android/paymentsheet/s$d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class s implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int resultCode;

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.s$a, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/stripe/android/paymentsheet/s$a;", "Lcom/stripe/android/paymentsheet/s;", "", "mostRecentError", "Lw70/j;", "paymentSelection", "", "Lcom/stripe/android/model/v0;", "paymentMethods", "<init>", "(Ljava/lang/Throwable;Lw70/j;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Ljava/lang/Throwable;", "getMostRecentError", "()Ljava/lang/Throwable;", DateTokenConverter.CONVERTER_KEY, "Lw70/j;", "()Lw70/j;", "e", "Ljava/util/List;", "a", "()Ljava/util/List;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Canceled extends s {
        public static final Parcelable.Creator<Canceled> CREATOR = new C1046a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable mostRecentError;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final w70.j paymentSelection;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<PaymentMethod> paymentMethods;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.s$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C1046a implements Parcelable.Creator<Canceled> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Canceled createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                Throwable th2 = (Throwable) parcel.readSerializable();
                w70.j jVar = (w70.j) parcel.readParcelable(Canceled.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i11 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        arrayList2.add(parcel.readParcelable(Canceled.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new Canceled(th2, jVar, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Canceled[] newArray(int i11) {
                return new Canceled[i11];
            }
        }

        public Canceled(Throwable th2, w70.j jVar, List<PaymentMethod> list) {
            super(0, null);
            this.mostRecentError = th2;
            this.paymentSelection = jVar;
            this.paymentMethods = list;
        }

        @Override // com.stripe.android.paymentsheet.s
        public List<PaymentMethod> a() {
            return this.paymentMethods;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final w70.j getPaymentSelection() {
            return this.paymentSelection;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Canceled)) {
                return false;
            }
            Canceled canceled = (Canceled) other;
            return p013kotlin.jvm.internal.s.f(this.mostRecentError, canceled.mostRecentError) && p013kotlin.jvm.internal.s.f(this.paymentSelection, canceled.paymentSelection) && p013kotlin.jvm.internal.s.f(this.paymentMethods, canceled.paymentMethods);
        }

        public int hashCode() {
            Throwable th2 = this.mostRecentError;
            int iHashCode = (th2 == null ? 0 : th2.hashCode()) * 31;
            w70.j jVar = this.paymentSelection;
            int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
            List<PaymentMethod> list = this.paymentMethods;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Canceled(mostRecentError=" + this.mostRecentError + ", paymentSelection=" + this.paymentSelection + ", paymentMethods=" + this.paymentMethods + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeSerializable(this.mostRecentError);
            parcel.writeParcelable(this.paymentSelection, flags);
            List<PaymentMethod> list = this.paymentMethods;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PaymentMethod> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.s$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/s$b;", "", "<init>", "()V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Lcom/stripe/android/paymentsheet/s;", "a", "(Landroid/content/Intent;)Lcom/stripe/android/paymentsheet/s;", "", "EXTRA_RESULT", "Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ s a(Intent intent) {
            if (intent != null) {
                return (s) intent.getParcelableExtra("extra_activity_result");
            }
            return null;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.s$c, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/stripe/android/paymentsheet/s$c;", "Lcom/stripe/android/paymentsheet/s;", "", AnalyticsAttribute.Error, "", "Lcom/stripe/android/model/v0;", "paymentMethods", "<init>", "(Ljava/lang/Throwable;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "a", "()Ljava/util/List;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failed extends s {
        public static final Parcelable.Creator<Failed> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable error;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<PaymentMethod> paymentMethods;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.s$c$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Failed> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Failed createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                Throwable th2 = (Throwable) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i11 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        arrayList2.add(parcel.readParcelable(Failed.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new Failed(th2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Failed[] newArray(int i11) {
                return new Failed[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(Throwable error, List<PaymentMethod> list) {
            super(0, null);
            p013kotlin.jvm.internal.s.k(error, "error");
            this.error = error;
            this.paymentMethods = list;
        }

        @Override // com.stripe.android.paymentsheet.s
        public List<PaymentMethod> a() {
            return this.paymentMethods;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return p013kotlin.jvm.internal.s.f(this.error, failed.error) && p013kotlin.jvm.internal.s.f(this.paymentMethods, failed.paymentMethods);
        }

        public int hashCode() {
            int iHashCode = this.error.hashCode() * 31;
            List<PaymentMethod> list = this.paymentMethods;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "Failed(error=" + this.error + ", paymentMethods=" + this.paymentMethods + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeSerializable(this.error);
            List<PaymentMethod> list = this.paymentMethods;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PaymentMethod> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.s$d, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/stripe/android/paymentsheet/s$d;", "Lcom/stripe/android/paymentsheet/s;", "Lw70/j;", "paymentSelection", "", "Lcom/stripe/android/model/v0;", "paymentMethods", "<init>", "(Lw70/j;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Lw70/j;", DateTokenConverter.CONVERTER_KEY, "()Lw70/j;", "Ljava/util/List;", "a", "()Ljava/util/List;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Succeeded extends s {
        public static final Parcelable.Creator<Succeeded> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final w70.j paymentSelection;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<PaymentMethod> paymentMethods;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.s$d$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Succeeded> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Succeeded createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                w70.j jVar = (w70.j) parcel.readParcelable(Succeeded.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i11 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        arrayList2.add(parcel.readParcelable(Succeeded.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new Succeeded(jVar, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Succeeded[] newArray(int i11) {
                return new Succeeded[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Succeeded(w70.j paymentSelection, List<PaymentMethod> list) {
            super(-1, null);
            p013kotlin.jvm.internal.s.k(paymentSelection, "paymentSelection");
            this.paymentSelection = paymentSelection;
            this.paymentMethods = list;
        }

        @Override // com.stripe.android.paymentsheet.s
        public List<PaymentMethod> a() {
            return this.paymentMethods;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final w70.j getPaymentSelection() {
            return this.paymentSelection;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Succeeded)) {
                return false;
            }
            Succeeded succeeded = (Succeeded) other;
            return p013kotlin.jvm.internal.s.f(this.paymentSelection, succeeded.paymentSelection) && p013kotlin.jvm.internal.s.f(this.paymentMethods, succeeded.paymentMethods);
        }

        public int hashCode() {
            int iHashCode = this.paymentSelection.hashCode() * 31;
            List<PaymentMethod> list = this.paymentMethods;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "Succeeded(paymentSelection=" + this.paymentSelection + ", paymentMethods=" + this.paymentMethods + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeParcelable(this.paymentSelection, flags);
            List<PaymentMethod> list = this.paymentMethods;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PaymentMethod> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
        }
    }

    public /* synthetic */ s(int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11);
    }

    public abstract List<PaymentMethod> a();

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getResultCode() {
        return this.resultCode;
    }

    public final Bundle c() {
        return q5.d.b(jn0.x.a("extra_activity_result", this));
    }

    private s(int i11) {
        this.resultCode = i11;
    }
}
