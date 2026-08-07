package b70;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lb70/a;", "Landroid/os/Parcelable;", "a", "b", "Lb70/a$a;", "Lb70/a$b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a extends Parcelable {

    /* JADX INFO: renamed from: b70.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lb70/a$a;", "Landroid/os/Parcelable;", "Lb70/a;", "", Scopes.EMAIL, "Lcom/stripe/android/financialconnections/a$c;", "elementsSessionContext", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/a$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "Lcom/stripe/android/financialconnections/a$c;", "()Lcom/stripe/android/financialconnections/a$c;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InstantDebits implements Parcelable, a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f16776c = com.stripe.android.financialconnections.a.ElementsSessionContext.f50140e;
        public static final Parcelable.Creator<InstantDebits> CREATOR = new C0332a();

        /* JADX INFO: renamed from: b70.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0332a implements Parcelable.Creator<InstantDebits> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InstantDebits createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new InstantDebits(parcel.readString(), (com.stripe.android.financialconnections.a.ElementsSessionContext) parcel.readParcelable(InstantDebits.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InstantDebits[] newArray(int i11) {
                return new InstantDebits[i11];
            }
        }

        public InstantDebits(String str, com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext) {
            this.email = str;
            this.elementsSessionContext = elementsSessionContext;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final com.stripe.android.financialconnections.a.ElementsSessionContext getElementsSessionContext() {
            return this.elementsSessionContext;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstantDebits)) {
                return false;
            }
            InstantDebits instantDebits = (InstantDebits) other;
            return s.f(this.email, instantDebits.email) && s.f(this.elementsSessionContext, instantDebits.elementsSessionContext);
        }

        public int hashCode() {
            String str = this.email;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            return iHashCode + (elementsSessionContext != null ? elementsSessionContext.hashCode() : 0);
        }

        public String toString() {
            return "InstantDebits(email=" + this.email + ", elementsSessionContext=" + this.elementsSessionContext + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.email);
            parcel.writeParcelable(this.elementsSessionContext, flags);
        }
    }

    /* JADX INFO: renamed from: b70.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u0019\u0010\t¨\u0006\u001d"}, d2 = {"Lb70/a$b;", "Landroid/os/Parcelable;", "Lb70/a;", "", "name", Scopes.EMAIL, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getName", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class USBankAccount implements Parcelable, a {
        public static final Parcelable.Creator<USBankAccount> CREATOR = new C0333a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        /* JADX INFO: renamed from: b70.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0333a implements Parcelable.Creator<USBankAccount> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final USBankAccount createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new USBankAccount(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final USBankAccount[] newArray(int i11) {
                return new USBankAccount[i11];
            }
        }

        public USBankAccount(String name, String str) {
            s.k(name, "name");
            this.name = name;
            this.email = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof USBankAccount)) {
                return false;
            }
            USBankAccount uSBankAccount = (USBankAccount) other;
            return s.f(this.name, uSBankAccount.name) && s.f(this.email, uSBankAccount.email);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.email;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "USBankAccount(name=" + this.name + ", email=" + this.email + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.name);
            parcel.writeString(this.email);
        }
    }
}
