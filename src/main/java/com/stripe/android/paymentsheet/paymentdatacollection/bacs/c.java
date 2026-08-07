package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/c;", "Landroid/os/Parcelable;", "u1", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/c$a;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/c$c;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/c$d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface c extends Parcelable {

    /* JADX INFO: renamed from: u1, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f53306a;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/c$a;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/c;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f53305a = new a();
        public static final Parcelable.Creator<a> CREATOR = new C1025a();

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C1025a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return a.f53305a;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        private a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/c$b;", "", "<init>", "()V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/c;", "result", "b", "(Landroid/content/Intent;Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/c;)Landroid/content/Intent;", "a", "(Landroid/content/Intent;)Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/c;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f53306a = new Companion();

        private Companion() {
        }

        public final c a(Intent intent) {
            Bundle extras;
            c cVar = (intent == null || (extras = intent.getExtras()) == null) ? null : (c) q5.c.a(extras, "extra_activity_result", c.class);
            return cVar == null ? a.f53305a : cVar;
        }

        public final Intent b(Intent intent, c result) {
            s.k(intent, "intent");
            s.k(result, "result");
            Intent intentPutExtra = intent.putExtra("extra_activity_result", result);
            s.j(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/c$c;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/c;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C1026c implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1026c f53307a = new C1026c();
        public static final Parcelable.Creator<C1026c> CREATOR = new a();

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.c$c$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<C1026c> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C1026c createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return C1026c.f53307a;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C1026c[] newArray(int i11) {
                return new C1026c[i11];
            }
        }

        private C1026c() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/c$d;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/c;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f53308a = new d();
        public static final Parcelable.Creator<d> CREATOR = new a();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return d.f53308a;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        private d() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeInt(1);
        }
    }
}
