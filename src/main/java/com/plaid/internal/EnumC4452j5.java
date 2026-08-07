package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import p013kotlin.enums.EnumEntries;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v2 com.plaid.internal.j5[], still in use, count: 1, list:
  (r6v2 com.plaid.internal.j5[]) from 0x0036: INVOKE (r6v2 com.plaid.internal.j5[]) STATIC call: on0.a.a(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:55)
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
/* JADX INFO: renamed from: com.plaid.internal.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC4452j5 implements Parcelable {
    PRODUCTION("production"),
    DEVELOPMENT("development"),
    SANDBOX("sandbox"),
    DEVENV("devenv");

    public static final Parcelable.Creator<EnumC4452j5> CREATOR;
    public static final a Companion;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, EnumC4452j5> f47773b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f47775d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47776a;

    /* JADX INFO: renamed from: com.plaid.internal.j5$a */
    public static final class a {
        public static EnumC4452j5 a(String json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            EnumC4452j5 enumC4452j5 = (EnumC4452j5) EnumC4452j5.f47773b.get(json);
            return enumC4452j5 == null ? EnumC4452j5.SANDBOX : enumC4452j5;
        }
    }

    static {
        EnumC4452j5 enumC4452j5 = PRODUCTION;
        EnumC4452j5 enumC4452j6 = DEVELOPMENT;
        EnumC4452j5 enumC4452j7 = SANDBOX;
        EnumC4452j5 enumC4452j8 = DEVENV;
        f47775d = on0.a.a(enumC4452j5Arr);
        Companion = new a();
        CREATOR = new Parcelable.Creator<EnumC4452j5>() { // from class: com.plaid.internal.j5.b
            @Override // android.os.Parcelable.Creator
            public final EnumC4452j5 createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return EnumC4452j5.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EnumC4452j5[] newArray(int i11) {
                return new EnumC4452j5[i11];
            }
        };
        f47773b = p013kotlin.collections.v0.m(jn0.x.a("production", enumC4452j5), jn0.x.a("development", enumC4452j6), jn0.x.a("sandbox", enumC4452j7), jn0.x.a("devenv", enumC4452j8));
    }

    public EnumC4452j5(String str) {
        super(str, i);
        this.f47776a = str;
    }

    public static EnumEntries<EnumC4452j5> getEntries() {
        return f47775d;
    }

    public static EnumC4452j5 valueOf(String str) {
        return (EnumC4452j5) Enum.valueOf(EnumC4452j5.class, str);
    }

    public static EnumC4452j5[] values() {
        return (EnumC4452j5[]) f47774c.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getJson() {
        return this.f47776a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        p013kotlin.jvm.internal.s.k(out, "out");
        out.writeString(name());
    }
}
