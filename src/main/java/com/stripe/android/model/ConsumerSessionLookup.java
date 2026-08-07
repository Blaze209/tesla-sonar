package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.v1;
import vo0.z1;

/* JADX INFO: renamed from: com.stripe.android.model.u, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 42\u00020\u0001:\u0002&(B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b \u0010\u001bJ \u0010$\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010,\u0012\u0004\b.\u0010+\u001a\u0004\b&\u0010-R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b2\u0010+\u001a\u0004\b1\u0010\u0019R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u00100\u0012\u0004\b3\u0010+\u001a\u0004\b/\u0010\u0019¨\u00065"}, d2 = {"Lcom/stripe/android/model/u;", "Lt30/f;", "", "exists", "Lcom/stripe/android/model/t;", "consumerSession", "", "errorMessage", "publishableKey", "<init>", "(ZLcom/stripe/android/model/t;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(IZLcom/stripe/android/model/t;Ljava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/model/u;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Z", "b", "()Z", "getExists$annotations", "()V", "Lcom/stripe/android/model/t;", "()Lcom/stripe/android/model/t;", "getConsumerSession$annotations", "c", "Ljava/lang/String;", "getErrorMessage", "getErrorMessage$annotations", "getPublishableKey$annotations", "Companion", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class ConsumerSessionLookup implements t30.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean exists;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ConsumerSession consumerSession;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorMessage;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String publishableKey;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ConsumerSessionLookup> CREATOR = new c();

    /* JADX INFO: renamed from: com.stripe.android.model.u$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/model/ConsumerSessionLookup.$serializer", "Lvo0/e0;", "Lcom/stripe/android/model/u;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/model/u;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/model/u;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<ConsumerSessionLookup> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f51474a;
        private static final /* synthetic */ vo0.m1 descriptor;

        static {
            a aVar = new a();
            f51474a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.stripe.android.model.ConsumerSessionLookup", aVar, 4);
            m1Var.o("exists", false);
            m1Var.o("consumer_session", true);
            m1Var.o("error_message", true);
            m1Var.o("publishable_key", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConsumerSessionLookup deserialize(uo0.e decoder) {
            boolean zW;
            int i11;
            ConsumerSession consumerSession;
            String str;
            String str2;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            if (cVarB.i()) {
                zW = cVarB.w(descriptor2, 0);
                ConsumerSession consumerSession2 = (ConsumerSession) cVarB.v(descriptor2, 1, ConsumerSession.a.f51463a, null);
                z1 z1Var = z1.f119730a;
                String str3 = (String) cVarB.v(descriptor2, 2, z1Var, null);
                str2 = (String) cVarB.v(descriptor2, 3, z1Var, null);
                str = str3;
                consumerSession = consumerSession2;
                i11 = 15;
            } else {
                boolean z11 = true;
                zW = false;
                ConsumerSession consumerSession3 = null;
                String str4 = null;
                String str5 = null;
                int i12 = 0;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        zW = cVarB.w(descriptor2, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        consumerSession3 = (ConsumerSession) cVarB.v(descriptor2, 1, ConsumerSession.a.f51463a, consumerSession3);
                        i12 |= 2;
                    } else if (iA == 2) {
                        str4 = (String) cVarB.v(descriptor2, 2, z1.f119730a, str4);
                        i12 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        str5 = (String) cVarB.v(descriptor2, 3, z1.f119730a, str5);
                        i12 |= 8;
                    }
                }
                i11 = i12;
                consumerSession = consumerSession3;
                str = str4;
                str2 = str5;
            }
            boolean z12 = zW;
            cVarB.c(descriptor2);
            return new ConsumerSessionLookup(i11, z12, consumerSession, str, str2, (v1) null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, ConsumerSessionLookup value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            ConsumerSessionLookup.d(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            ro0.d<?> dVarP = so0.a.p(ConsumerSession.a.f51463a);
            z1 z1Var = z1.f119730a;
            return new ro0.d[]{vo0.h.f119620a, dVarP, so0.a.p(z1Var), so0.a.p(z1Var)};
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

    /* JADX INFO: renamed from: com.stripe.android.model.u$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/u$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/model/u;", "serializer", "()Lro0/d;", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<ConsumerSessionLookup> serializer() {
            return a.f51474a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.u$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<ConsumerSessionLookup> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConsumerSessionLookup createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new ConsumerSessionLookup(parcel.readInt() != 0, parcel.readInt() == 0 ? null : ConsumerSession.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConsumerSessionLookup[] newArray(int i11) {
            return new ConsumerSessionLookup[i11];
        }
    }

    @jn0.e
    public /* synthetic */ ConsumerSessionLookup(int i11, @ro0.o("exists") boolean z11, @ro0.o("consumer_session") ConsumerSession consumerSession, @ro0.o("error_message") String str, @ro0.o("publishable_key") String str2, v1 v1Var) {
        if (1 != (i11 & 1)) {
            vo0.h1.b(i11, 1, a.f51474a.getDescriptor());
        }
        this.exists = z11;
        if ((i11 & 2) == 0) {
            this.consumerSession = null;
        } else {
            this.consumerSession = consumerSession;
        }
        if ((i11 & 4) == 0) {
            this.errorMessage = null;
        } else {
            this.errorMessage = str;
        }
        if ((i11 & 8) == 0) {
            this.publishableKey = null;
        } else {
            this.publishableKey = str2;
        }
    }

    public static final /* synthetic */ void d(ConsumerSessionLookup self, uo0.d output, to0.f serialDesc) {
        output.A(serialDesc, 0, self.exists);
        if (output.G(serialDesc, 1) || self.consumerSession != null) {
            output.y(serialDesc, 1, ConsumerSession.a.f51463a, self.consumerSession);
        }
        if (output.G(serialDesc, 2) || self.errorMessage != null) {
            output.y(serialDesc, 2, z1.f119730a, self.errorMessage);
        }
        if (!output.G(serialDesc, 3) && self.publishableKey == null) {
            return;
        }
        output.y(serialDesc, 3, z1.f119730a, self.publishableKey);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ConsumerSession getConsumerSession() {
        return this.consumerSession;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getExists() {
        return this.exists;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
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
        if (!(other instanceof ConsumerSessionLookup)) {
            return false;
        }
        ConsumerSessionLookup consumerSessionLookup = (ConsumerSessionLookup) other;
        return this.exists == consumerSessionLookup.exists && p013kotlin.jvm.internal.s.f(this.consumerSession, consumerSessionLookup.consumerSession) && p013kotlin.jvm.internal.s.f(this.errorMessage, consumerSessionLookup.errorMessage) && p013kotlin.jvm.internal.s.f(this.publishableKey, consumerSessionLookup.publishableKey);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.exists) * 31;
        ConsumerSession consumerSession = this.consumerSession;
        int iHashCode2 = (iHashCode + (consumerSession == null ? 0 : consumerSession.hashCode())) * 31;
        String str = this.errorMessage;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.publishableKey;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ConsumerSessionLookup(exists=" + this.exists + ", consumerSession=" + this.consumerSession + ", errorMessage=" + this.errorMessage + ", publishableKey=" + this.publishableKey + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeInt(this.exists ? 1 : 0);
        ConsumerSession consumerSession = this.consumerSession;
        if (consumerSession == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            consumerSession.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.publishableKey);
    }

    public ConsumerSessionLookup(boolean z11, ConsumerSession consumerSession, String str, String str2) {
        this.exists = z11;
        this.consumerSession = consumerSession;
        this.errorMessage = str;
        this.publishableKey = str2;
    }

    public /* synthetic */ ConsumerSessionLookup(boolean z11, ConsumerSession consumerSession, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? null : consumerSession, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2);
    }
}
