package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p013kotlin.enums.EnumEntries;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.plaid.internal.H3[], still in use, count: 1, list:
  (r0v1 com.plaid.internal.H3[]) from 0x0038: INVOKE (r0v1 com.plaid.internal.H3[]) STATIC call: on0.a.a(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:57)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes6.dex */
public final class H3 implements Parcelable {
    NETWORK_ERROR,
    SESSION_EXPIRED,
    INITIALIZATION_ERROR,
    HTTP_ERROR,
    UNKNOWN_ERROR;

    public static final Parcelable.Creator<H3> CREATOR = new Parcelable.Creator<H3>() { // from class: com.plaid.internal.H3.a
        @Override // android.os.Parcelable.Creator
        public final H3 createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return H3.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final H3[] newArray(int i11) {
            return new H3[i11];
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f46332b;

    static {
        f46332b = on0.a.a(new H3[]{r0, r1, r2, r3, r4});
    }

    public H3() {
        super(str, i);
    }

    public static EnumEntries<H3> getEntries() {
        return f46332b;
    }

    public static H3 valueOf(String str) {
        return (H3) Enum.valueOf(H3.class, str);
    }

    public static H3[] values() {
        return (H3[]) f46331a.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        p013kotlin.jvm.internal.s.k(out, "out");
        out.writeString(name());
    }
}
