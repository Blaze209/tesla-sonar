package com.stripe.android.view;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u000e\u0013B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/view/q;", "", "", "Lcom/stripe/android/view/q$a;", "banks", "", "shouldIncludeTestBank", "<init>", "(Ljava/util/List;Z)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;Z)V", "", "bsb", "a", "(Ljava/lang/String;)Lcom/stripe/android/view/q$a;", "Ljava/util/List;", "getBanks$payments_core_release", "()Ljava/util/List;", "b", "Z", "c", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f55123c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f55124d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Bank f55125e = new Bank("00", "Stripe Test Bank");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<Bank> banks;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldIncludeTestBank;

    /* JADX INFO: renamed from: com.stripe.android.view.q$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/view/q$a;", "Landroid/os/Parcelable;", "", "prefix", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "getName", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Bank implements Parcelable {
        public static final Parcelable.Creator<Bank> CREATOR = new C1107a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String prefix;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: com.stripe.android.view.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C1107a implements Parcelable.Creator<Bank> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Bank createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Bank(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Bank[] newArray(int i11) {
                return new Bank[i11];
            }
        }

        public Bank(String prefix, String name) {
            p013kotlin.jvm.internal.s.k(prefix, "prefix");
            p013kotlin.jvm.internal.s.k(name, "name");
            this.prefix = prefix;
            this.name = name;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPrefix() {
            return this.prefix;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bank)) {
                return false;
            }
            Bank bank = (Bank) other;
            return p013kotlin.jvm.internal.s.f(this.prefix, bank.prefix) && p013kotlin.jvm.internal.s.f(this.name, bank.name);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.prefix.hashCode() * 31) + this.name.hashCode();
        }

        public String toString() {
            return "Bank(prefix=" + this.prefix + ", name=" + this.name + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.prefix);
            parcel.writeString(this.name);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/view/q$b;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lcom/stripe/android/view/q$a;", "b", "(Landroid/content/Context;)Ljava/util/List;", "", "c", "(Landroid/content/Context;)Ljava/lang/String;", "STRIPE_TEST_BANK", "Lcom/stripe/android/view/q$a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Bank> b(Context context) {
            Map mapB = t30.e.f112281a.b(new JSONObject(c(context)));
            if (mapB == null) {
                mapB = p013kotlin.collections.v0.i();
            }
            ArrayList arrayList = new ArrayList(mapB.size());
            for (Map.Entry entry : mapB.entrySet()) {
                arrayList.add(new Bank((String) entry.getKey(), String.valueOf(entry.getValue())));
            }
            return arrayList;
        }

        private final String c(Context context) {
            String next = new Scanner(context.getResources().getAssets().open("au_becs_bsb.json")).useDelimiter("\\A").next();
            p013kotlin.jvm.internal.s.j(next, "next(...)");
            return next;
        }

        private b() {
        }
    }

    public q(List<Bank> banks, boolean z11) {
        p013kotlin.jvm.internal.s.k(banks, "banks");
        this.banks = banks;
        this.shouldIncludeTestBank = z11;
    }

    public final Bank a(String bsb) {
        p013kotlin.jvm.internal.s.k(bsb, "bsb");
        List<Bank> list = this.banks;
        Bank bank = f55125e;
        Object obj = null;
        if (!this.shouldIncludeTestBank) {
            bank = null;
        }
        for (Object obj2 : p013kotlin.collections.v.P0(list, p013kotlin.collections.v.q(bank))) {
            if (p013kotlin.text.t.b0(bsb, ((Bank) obj2).getPrefix(), false, 2, null)) {
                obj = obj2;
                break;
            }
        }
        return (Bank) obj;
    }

    public /* synthetic */ q(Context context, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? true : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(Context context, boolean z11) {
        this((List<Bank>) f55123c.b(context), z11);
        p013kotlin.jvm.internal.s.k(context, "context");
    }
}
