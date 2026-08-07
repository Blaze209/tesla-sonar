package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b0\u0007H ¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0001\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/model/x0;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/v0$p;", "type", "<init>", "(Lcom/stripe/android/model/v0$p;)V", "", "Lkotlin/Pair;", "", "", "a", "()Ljava/util/List;", "", "c3", "()Ljava/util/Map;", "Lcom/stripe/android/model/v0$p;", "getType", "()Lcom/stripe/android/model/v0$p;", "Lcom/stripe/android/model/x0$a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class x0 implements o1, Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f51723b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PaymentMethod.p type;

    /* JADX INFO: renamed from: com.stripe.android.model.x0$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001\nB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00070\u0006H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0005¨\u0006!"}, d2 = {"Lcom/stripe/android/model/x0$a;", "Lcom/stripe/android/model/x0;", "", "confirmed", "<init>", "(Ljava/lang/Boolean;)V", "", "Lkotlin/Pair;", "", "", "a", "()Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Ljava/lang/Boolean;", "getConfirmed", "()Ljava/lang/Boolean;", "setConfirmed", DateTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BacsDebit extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private Boolean confirmed;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f51726e = 8;
        public static final Parcelable.Creator<BacsDebit> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.x0$a$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<BacsDebit> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BacsDebit createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new BacsDebit(boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BacsDebit[] newArray(int i11) {
                return new BacsDebit[i11];
            }
        }

        public BacsDebit(Boolean bool) {
            super(PaymentMethod.p.BacsDebit, null);
            this.confirmed = bool;
        }

        @Override // com.stripe.android.model.x0
        public List<Pair<String, Object>> a() {
            Boolean bool = this.confirmed;
            return p013kotlin.collections.v.e(jn0.x.a("confirmed", bool != null ? bool.toString() : null));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BacsDebit) && p013kotlin.jvm.internal.s.f(this.confirmed, ((BacsDebit) other).confirmed);
        }

        public int hashCode() {
            Boolean bool = this.confirmed;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return "BacsDebit(confirmed=" + this.confirmed + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v4, types: [int] */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6 */
        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            ?? BooleanValue;
            p013kotlin.jvm.internal.s.k(parcel, "out");
            Boolean bool = this.confirmed;
            if (bool == null) {
                BooleanValue = 0;
            } else {
                parcel.writeInt(1);
                BooleanValue = bool.booleanValue();
            }
            parcel.writeInt(BooleanValue);
        }
    }

    public /* synthetic */ x0(PaymentMethod.p pVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar);
    }

    public abstract List<Pair<String, Object>> a();

    @Override // com.stripe.android.model.o1
    public final Map<String, Object> c3() {
        List<Pair<String, Object>> listA = a();
        Map mapI = p013kotlin.collections.v0.i();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) pair.a();
            Object objB = pair.b();
            Map mapF = objB != null ? p013kotlin.collections.v0.f(jn0.x.a(str, objB)) : null;
            if (mapF == null) {
                mapF = p013kotlin.collections.v0.i();
            }
            mapI = p013kotlin.collections.v0.r(mapI, mapF);
        }
        return !mapI.isEmpty() ? p013kotlin.collections.v0.f(jn0.x.a(this.type.code, mapI)) : p013kotlin.collections.v0.i();
    }

    private x0(PaymentMethod.p pVar) {
        this.type = pVar;
    }
}
