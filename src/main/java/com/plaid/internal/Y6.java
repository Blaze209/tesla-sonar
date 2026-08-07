package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p013kotlin.Lazy;
import p013kotlin.enums.EnumEntries;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.plaid.internal.Y6[], still in use, count: 1, list:
  (r0v1 com.plaid.internal.Y6[]) from 0x001a: INVOKE (r0v1 com.plaid.internal.Y6[]) STATIC call: on0.a.a(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:27)
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
@ro0.p
public final class Y6 implements Parcelable {
    SMS_RECEIVER,
    NO_SMS_AUTOFILL;


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f46836c;
    public static final c Companion = new Object() { // from class: com.plaid.internal.Y6.c
    };
    public static final Parcelable.Creator<Y6> CREATOR = new Parcelable.Creator<Y6>() { // from class: com.plaid.internal.Y6.d
        @Override // android.os.Parcelable.Creator
        public final Y6 createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return Y6.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Y6[] newArray(int i11) {
            return new Y6[i11];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy<ro0.d<Object>> f46834a = jn0.m.a(jn0.p.PUBLICATION, b.f46839a);

    @jn0.e
    public static final class a implements vo0.e0<Y6> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f46837a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ vo0.x f46838b;

        static {
            vo0.x xVar = new vo0.x("com.plaid.internal.workflow.model.SmsAutofillType", 2);
            xVar.o("SMS_RECEIVER", false);
            xVar.o("NO_SMS_AUTOFILL", false);
            f46838b = xVar;
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            return new ro0.d[0];
        }

        @Override // ro0.c
        public final Object deserialize(uo0.e decoder) {
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            return Y6.values()[decoder.x(f46838b)];
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return f46838b;
        }

        @Override // ro0.q
        public final void serialize(uo0.f encoder, Object obj) {
            Y6 value = (Y6) obj;
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            encoder.g(f46838b, value.ordinal());
        }

        @Override // vo0.e0
        public final ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    public static final class b extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f46839a = new b();

        public b() {
            super(0);
        }

        @Override // wn0.a
        public final ro0.d<Object> invoke() {
            return a.f46837a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.plaid.internal.Y6$c] */
    static {
        f46836c = on0.a.a(new Y6[]{r0, r1});
    }

    public Y6() {
        super(str, i);
    }

    public static EnumEntries<Y6> getEntries() {
        return f46836c;
    }

    public static Y6 valueOf(String str) {
        return (Y6) Enum.valueOf(Y6.class, str);
    }

    public static Y6[] values() {
        return (Y6[]) f46835b.clone();
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
