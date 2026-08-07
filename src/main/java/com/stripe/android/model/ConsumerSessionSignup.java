package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.v1;
import vo0.z1;

/* JADX INFO: renamed from: com.stripe.android.model.v, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002$)B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010\"\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b$\u0010&R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b+\u0010(\u001a\u0004\b)\u0010\u0016¨\u0006-"}, d2 = {"Lcom/stripe/android/model/v;", "Lt30/f;", "Lcom/stripe/android/model/t;", "consumerSession", "", "publishableKey", "<init>", "(Lcom/stripe/android/model/t;Ljava/lang/String;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/stripe/android/model/t;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "c", "(Lcom/stripe/android/model/v;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/t;", "()Lcom/stripe/android/model/t;", "getConsumerSession$annotations", "()V", "b", "Ljava/lang/String;", "getPublishableKey$annotations", "Companion", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class ConsumerSessionSignup implements t30.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ConsumerSession consumerSession;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String publishableKey;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ConsumerSessionSignup> CREATOR = new c();

    /* JADX INFO: renamed from: com.stripe.android.model.v$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/model/ConsumerSessionSignup.$serializer", "Lvo0/e0;", "Lcom/stripe/android/model/v;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/model/v;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/model/v;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<ConsumerSessionSignup> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f51532a;
        private static final /* synthetic */ vo0.m1 descriptor;

        static {
            a aVar = new a();
            f51532a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.stripe.android.model.ConsumerSessionSignup", aVar, 2);
            m1Var.o("consumer_session", false);
            m1Var.o("publishable_key", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConsumerSessionSignup deserialize(uo0.e decoder) {
            ConsumerSession consumerSession;
            String str;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            v1 v1Var = null;
            if (cVarB.i()) {
                consumerSession = (ConsumerSession) cVarB.n(descriptor2, 0, ConsumerSession.a.f51463a, null);
                str = (String) cVarB.v(descriptor2, 1, z1.f119730a, null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                consumerSession = null;
                String str2 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        consumerSession = (ConsumerSession) cVarB.n(descriptor2, 0, ConsumerSession.a.f51463a, consumerSession);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        str2 = (String) cVarB.v(descriptor2, 1, z1.f119730a, str2);
                        i12 |= 2;
                    }
                }
                str = str2;
                i11 = i12;
            }
            cVarB.c(descriptor2);
            return new ConsumerSessionSignup(i11, consumerSession, str, v1Var);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, ConsumerSessionSignup value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            ConsumerSessionSignup.c(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            return new ro0.d[]{ConsumerSession.a.f51463a, so0.a.p(z1.f119730a)};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.v$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/v$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/model/v;", "serializer", "()Lro0/d;", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<ConsumerSessionSignup> serializer() {
            return a.f51532a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.v$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<ConsumerSessionSignup> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConsumerSessionSignup createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new ConsumerSessionSignup(ConsumerSession.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConsumerSessionSignup[] newArray(int i11) {
            return new ConsumerSessionSignup[i11];
        }
    }

    @jn0.e
    public /* synthetic */ ConsumerSessionSignup(int i11, @ro0.o("consumer_session") ConsumerSession consumerSession, @ro0.o("publishable_key") String str, v1 v1Var) {
        if (1 != (i11 & 1)) {
            vo0.h1.b(i11, 1, a.f51532a.getDescriptor());
        }
        this.consumerSession = consumerSession;
        if ((i11 & 2) == 0) {
            this.publishableKey = null;
        } else {
            this.publishableKey = str;
        }
    }

    public static final /* synthetic */ void c(ConsumerSessionSignup self, uo0.d output, to0.f serialDesc) {
        output.D(serialDesc, 0, ConsumerSession.a.f51463a, self.consumerSession);
        if (!output.G(serialDesc, 1) && self.publishableKey == null) {
            return;
        }
        output.y(serialDesc, 1, z1.f119730a, self.publishableKey);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ConsumerSession getConsumerSession() {
        return this.consumerSession;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPublishableKey() {
        return this.publishableKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsumerSessionSignup)) {
            return false;
        }
        ConsumerSessionSignup consumerSessionSignup = (ConsumerSessionSignup) other;
        return p013kotlin.jvm.internal.s.f(this.consumerSession, consumerSessionSignup.consumerSession) && p013kotlin.jvm.internal.s.f(this.publishableKey, consumerSessionSignup.publishableKey);
    }

    public int hashCode() {
        int iHashCode = this.consumerSession.hashCode() * 31;
        String str = this.publishableKey;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ConsumerSessionSignup(consumerSession=" + this.consumerSession + ", publishableKey=" + this.publishableKey + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        this.consumerSession.writeToParcel(parcel, flags);
        parcel.writeString(this.publishableKey);
    }

    public ConsumerSessionSignup(ConsumerSession consumerSession, String str) {
        p013kotlin.jvm.internal.s.k(consumerSession, "consumerSession");
        this.consumerSession = consumerSession;
        this.publishableKey = str;
    }
}
