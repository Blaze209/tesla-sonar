package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.v1;
import vo0.z1;

/* JADX INFO: renamed from: com.stripe.android.model.t, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 72\u00020\u0001:\u0003(-1B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bB]\b\u0011\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010&\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010)\u0012\u0004\b0\u0010,\u001a\u0004\b/\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010)\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u001aR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b6\u0010,\u001a\u0004\b3\u00105¨\u00068"}, d2 = {"Lcom/stripe/android/model/t;", "Lt30/f;", "", "clientSecret", "emailAddress", "redactedFormattedPhoneNumber", "redactedPhoneNumber", "", "Lcom/stripe/android/model/t$d;", "verificationSessions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "f", "(Lcom/stripe/android/model/t;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "p", "getClientSecret$annotations", "()V", "b", "getEmailAddress$annotations", "c", "getRedactedFormattedPhoneNumber$annotations", DateTokenConverter.CONVERTER_KEY, "getRedactedPhoneNumber$annotations", "e", "Ljava/util/List;", "()Ljava/util/List;", "getVerificationSessions$annotations", "Companion", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class ConsumerSession implements t30.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientSecret;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String emailAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String redactedFormattedPhoneNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String redactedPhoneNumber;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<VerificationSession> verificationSessions;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ConsumerSession> CREATOR = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ro0.d<Object>[] f51457f = {null, null, null, null, new vo0.e(VerificationSession.a.f51467a)};

    /* JADX INFO: renamed from: com.stripe.android.model.t$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/model/ConsumerSession.$serializer", "Lvo0/e0;", "Lcom/stripe/android/model/t;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/model/t;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/model/t;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<ConsumerSession> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f51463a;
        private static final /* synthetic */ vo0.m1 descriptor;

        static {
            a aVar = new a();
            f51463a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.stripe.android.model.ConsumerSession", aVar, 5);
            m1Var.o("client_secret", true);
            m1Var.o("email_address", false);
            m1Var.o("redacted_formatted_phone_number", false);
            m1Var.o("redacted_phone_number", false);
            m1Var.o("verification_sessions", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConsumerSession deserialize(uo0.e decoder) {
            int i11;
            String str;
            String str2;
            String str3;
            String str4;
            List list;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = ConsumerSession.f51457f;
            String strT = null;
            if (cVarB.i()) {
                String strT2 = cVarB.t(descriptor2, 0);
                String strT3 = cVarB.t(descriptor2, 1);
                String strT4 = cVarB.t(descriptor2, 2);
                String strT5 = cVarB.t(descriptor2, 3);
                list = (List) cVarB.n(descriptor2, 4, dVarArr[4], null);
                str = strT2;
                str4 = strT5;
                str3 = strT4;
                i11 = 31;
                str2 = strT3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                String strT6 = null;
                String strT7 = null;
                String strT8 = null;
                List list2 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        strT = cVarB.t(descriptor2, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        strT6 = cVarB.t(descriptor2, 1);
                        i12 |= 2;
                    } else if (iA == 2) {
                        strT7 = cVarB.t(descriptor2, 2);
                        i12 |= 4;
                    } else if (iA == 3) {
                        strT8 = cVarB.t(descriptor2, 3);
                        i12 |= 8;
                    } else {
                        if (iA != 4) {
                            throw new UnknownFieldException(iA);
                        }
                        list2 = (List) cVarB.n(descriptor2, 4, dVarArr[4], list2);
                        i12 |= 16;
                    }
                }
                i11 = i12;
                str = strT;
                str2 = strT6;
                str3 = strT7;
                str4 = strT8;
                list = list2;
            }
            cVarB.c(descriptor2);
            return new ConsumerSession(i11, str, str2, str3, str4, list, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, ConsumerSession value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            ConsumerSession.f(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            ro0.d<?> dVar = ConsumerSession.f51457f[4];
            z1 z1Var = z1.f119730a;
            return new ro0.d[]{z1Var, z1Var, z1Var, z1Var, dVar};
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

    /* JADX INFO: renamed from: com.stripe.android.model.t$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/t$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/model/t;", "serializer", "()Lro0/d;", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<ConsumerSession> serializer() {
            return a.f51463a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.t$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<ConsumerSession> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConsumerSession createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(VerificationSession.CREATOR.createFromParcel(parcel));
            }
            return new ConsumerSession(string, string2, string3, string4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConsumerSession[] newArray(int i11) {
            return new ConsumerSession[i11];
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.t$d, reason: from toString */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0004%)\u0013-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010#\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+¨\u0006."}, d2 = {"Lcom/stripe/android/model/t$d;", "Lt30/f;", "Lcom/stripe/android/model/t$d$e;", "type", "Lcom/stripe/android/model/t$d$d;", "state", "<init>", "(Lcom/stripe/android/model/t$d$e;Lcom/stripe/android/model/t$d$d;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/stripe/android/model/t$d$e;Lcom/stripe/android/model/t$d$d;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/model/t$d;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/t$d$e;", "c", "()Lcom/stripe/android/model/t$d$e;", "b", "Lcom/stripe/android/model/t$d$d;", "()Lcom/stripe/android/model/t$d$d;", "Companion", "e", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class VerificationSession implements t30.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC0911d state;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<VerificationSession> CREATOR = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final ro0.d<Object>[] f51464c = {vo0.a0.b("com.stripe.android.model.ConsumerSession.VerificationSession.SessionType", e.values()), vo0.a0.b("com.stripe.android.model.ConsumerSession.VerificationSession.SessionState", EnumC0911d.values())};

        /* JADX INFO: renamed from: com.stripe.android.model.t$d$a */
        @jn0.e
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/model/ConsumerSession.VerificationSession.$serializer", "Lvo0/e0;", "Lcom/stripe/android/model/t$d;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/model/t$d;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/model/t$d;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements vo0.e0<VerificationSession> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f51467a;
            private static final /* synthetic */ vo0.m1 descriptor;

            static {
                a aVar = new a();
                f51467a = aVar;
                vo0.m1 m1Var = new vo0.m1("com.stripe.android.model.ConsumerSession.VerificationSession", aVar, 2);
                m1Var.o("type", false);
                m1Var.o("state", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public VerificationSession deserialize(uo0.e decoder) {
                EnumC0911d enumC0911d;
                e eVar;
                int i11;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f descriptor2 = getDescriptor();
                uo0.c cVarB = decoder.b(descriptor2);
                ro0.d[] dVarArr = VerificationSession.f51464c;
                v1 v1Var = null;
                if (cVarB.i()) {
                    eVar = (e) cVarB.n(descriptor2, 0, dVarArr[0], null);
                    enumC0911d = (EnumC0911d) cVarB.n(descriptor2, 1, dVarArr[1], null);
                    i11 = 3;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    EnumC0911d enumC0911d2 = null;
                    e eVar2 = null;
                    while (z11) {
                        int iA = cVarB.A(descriptor2);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            eVar2 = (e) cVarB.n(descriptor2, 0, dVarArr[0], eVar2);
                            i12 |= 1;
                        } else {
                            if (iA != 1) {
                                throw new UnknownFieldException(iA);
                            }
                            enumC0911d2 = (EnumC0911d) cVarB.n(descriptor2, 1, dVarArr[1], enumC0911d2);
                            i12 |= 2;
                        }
                    }
                    enumC0911d = enumC0911d2;
                    eVar = eVar2;
                    i11 = i12;
                }
                cVarB.c(descriptor2);
                return new VerificationSession(i11, eVar, enumC0911d, v1Var);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void serialize(uo0.f encoder, VerificationSession value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f descriptor2 = getDescriptor();
                uo0.d dVarB = encoder.b(descriptor2);
                VerificationSession.d(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }

            @Override // vo0.e0
            public ro0.d<?>[] childSerializers() {
                ro0.d<?>[] dVarArr = VerificationSession.f51464c;
                return new ro0.d[]{dVarArr[0], dVarArr[1]};
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

        /* JADX INFO: renamed from: com.stripe.android.model.t$d$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/t$d$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/model/t$d;", "serializer", "()Lro0/d;", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ro0.d<VerificationSession> serializer() {
                return a.f51467a;
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.t$d$c */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<VerificationSession> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final VerificationSession createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new VerificationSession(e.CREATOR.createFromParcel(parcel), EnumC0911d.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final VerificationSession[] newArray(int i11) {
                return new VerificationSession[i11];
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.t$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/model/t$d$d;", "", "Landroid/os/Parcelable;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "a", "Unknown", "Started", "Failed", "Verified", "Canceled", "Expired", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum EnumC0911d implements Parcelable {
            Unknown(""),
            Started("started"),
            Failed("failed"),
            Verified("verified"),
            Canceled("canceled"),
            Expired("expired");

            private final String value;
            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<EnumC0911d> CREATOR = new b();

            /* JADX INFO: renamed from: com.stripe.android.model.t$d$d$a, reason: from kotlin metadata */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/t$d$d$a;", "", "<init>", "()V", "", "value", "Lcom/stripe/android/model/t$d$d;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/t$d$d;", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final EnumC0911d a(String value) {
                    EnumC0911d next;
                    p013kotlin.jvm.internal.s.k(value, "value");
                    Iterator<EnumC0911d> it = EnumC0911d.getEntries().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!p013kotlin.text.t.M(next.getValue(), value, true));
                    EnumC0911d enumC0911d = next;
                    return enumC0911d == null ? EnumC0911d.Unknown : enumC0911d;
                }

                private Companion() {
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.model.t$d$d$b */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class b implements Parcelable.Creator<EnumC0911d> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final EnumC0911d createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return EnumC0911d.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final EnumC0911d[] newArray(int i11) {
                    return new EnumC0911d[i11];
                }
            }

            EnumC0911d(String str) {
                this.value = str;
            }

            public static EnumEntries<EnumC0911d> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getValue() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(name());
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.t$d$e */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/model/t$d$e;", "", "Landroid/os/Parcelable;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "a", "Unknown", "SignUp", "Email", "Sms", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum e implements Parcelable {
            Unknown(""),
            SignUp("signup"),
            Email(Scopes.EMAIL),
            Sms("sms");

            private final String value;
            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<e> CREATOR = new b();

            /* JADX INFO: renamed from: com.stripe.android.model.t$d$e$a, reason: from kotlin metadata */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/t$d$e$a;", "", "<init>", "()V", "", "value", "Lcom/stripe/android/model/t$d$e;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/t$d$e;", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final e a(String value) {
                    e next;
                    p013kotlin.jvm.internal.s.k(value, "value");
                    Iterator<e> it = e.getEntries().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!p013kotlin.text.t.M(next.getValue(), value, true));
                    e eVar = next;
                    return eVar == null ? e.Unknown : eVar;
                }

                private Companion() {
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.model.t$d$e$b */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class b implements Parcelable.Creator<e> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return e.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final e[] newArray(int i11) {
                    return new e[i11];
                }
            }

            e(String str) {
                this.value = str;
            }

            public static EnumEntries<e> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getValue() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(name());
            }
        }

        @jn0.e
        public /* synthetic */ VerificationSession(int i11, e eVar, EnumC0911d enumC0911d, v1 v1Var) {
            if (3 != (i11 & 3)) {
                vo0.h1.b(i11, 3, a.f51467a.getDescriptor());
            }
            this.type = eVar;
            this.state = enumC0911d;
        }

        public static final /* synthetic */ void d(VerificationSession self, uo0.d output, to0.f serialDesc) {
            ro0.d<Object>[] dVarArr = f51464c;
            output.D(serialDesc, 0, dVarArr[0], self.type);
            output.D(serialDesc, 1, dVarArr[1], self.state);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC0911d getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final e getType() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerificationSession)) {
                return false;
            }
            VerificationSession verificationSession = (VerificationSession) other;
            return this.type == verificationSession.type && this.state == verificationSession.state;
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.state.hashCode();
        }

        public String toString() {
            return "VerificationSession(type=" + this.type + ", state=" + this.state + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            this.type.writeToParcel(parcel, flags);
            this.state.writeToParcel(parcel, flags);
        }

        public VerificationSession(e type, EnumC0911d state) {
            p013kotlin.jvm.internal.s.k(type, "type");
            p013kotlin.jvm.internal.s.k(state, "state");
            this.type = type;
            this.state = state;
        }
    }

    @jn0.e
    public /* synthetic */ ConsumerSession(int i11, @ro0.o("client_secret") String str, @ro0.o("email_address") String str2, @ro0.o("redacted_formatted_phone_number") String str3, @ro0.o("redacted_phone_number") String str4, @ro0.o("verification_sessions") List list, v1 v1Var) {
        if (14 != (i11 & 14)) {
            vo0.h1.b(i11, 14, a.f51463a.getDescriptor());
        }
        this.clientSecret = (i11 & 1) == 0 ? "" : str;
        this.emailAddress = str2;
        this.redactedFormattedPhoneNumber = str3;
        this.redactedPhoneNumber = str4;
        if ((i11 & 16) == 0) {
            this.verificationSessions = p013kotlin.collections.v.m();
        } else {
            this.verificationSessions = list;
        }
    }

    public static final /* synthetic */ void f(ConsumerSession self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f51457f;
        if (output.G(serialDesc, 0) || !p013kotlin.jvm.internal.s.f(self.clientSecret, "")) {
            output.e(serialDesc, 0, self.clientSecret);
        }
        output.e(serialDesc, 1, self.emailAddress);
        output.e(serialDesc, 2, self.redactedFormattedPhoneNumber);
        output.e(serialDesc, 3, self.redactedPhoneNumber);
        if (!output.G(serialDesc, 4) && p013kotlin.jvm.internal.s.f(self.verificationSessions, p013kotlin.collections.v.m())) {
            return;
        }
        output.D(serialDesc, 4, dVarArr[4], self.verificationSessions);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRedactedFormattedPhoneNumber() {
        return this.redactedFormattedPhoneNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRedactedPhoneNumber() {
        return this.redactedPhoneNumber;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<VerificationSession> e() {
        return this.verificationSessions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsumerSession)) {
            return false;
        }
        ConsumerSession consumerSession = (ConsumerSession) other;
        return p013kotlin.jvm.internal.s.f(this.clientSecret, consumerSession.clientSecret) && p013kotlin.jvm.internal.s.f(this.emailAddress, consumerSession.emailAddress) && p013kotlin.jvm.internal.s.f(this.redactedFormattedPhoneNumber, consumerSession.redactedFormattedPhoneNumber) && p013kotlin.jvm.internal.s.f(this.redactedPhoneNumber, consumerSession.redactedPhoneNumber) && p013kotlin.jvm.internal.s.f(this.verificationSessions, consumerSession.verificationSessions);
    }

    public int hashCode() {
        return (((((((this.clientSecret.hashCode() * 31) + this.emailAddress.hashCode()) * 31) + this.redactedFormattedPhoneNumber.hashCode()) * 31) + this.redactedPhoneNumber.hashCode()) * 31) + this.verificationSessions.hashCode();
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    public String toString() {
        return "ConsumerSession(clientSecret=" + this.clientSecret + ", emailAddress=" + this.emailAddress + ", redactedFormattedPhoneNumber=" + this.redactedFormattedPhoneNumber + ", redactedPhoneNumber=" + this.redactedPhoneNumber + ", verificationSessions=" + this.verificationSessions + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.emailAddress);
        parcel.writeString(this.redactedFormattedPhoneNumber);
        parcel.writeString(this.redactedPhoneNumber);
        List<VerificationSession> list = this.verificationSessions;
        parcel.writeInt(list.size());
        Iterator<VerificationSession> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public ConsumerSession(String clientSecret, String emailAddress, String redactedFormattedPhoneNumber, String redactedPhoneNumber, List<VerificationSession> verificationSessions) {
        p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
        p013kotlin.jvm.internal.s.k(emailAddress, "emailAddress");
        p013kotlin.jvm.internal.s.k(redactedFormattedPhoneNumber, "redactedFormattedPhoneNumber");
        p013kotlin.jvm.internal.s.k(redactedPhoneNumber, "redactedPhoneNumber");
        p013kotlin.jvm.internal.s.k(verificationSessions, "verificationSessions");
        this.clientSecret = clientSecret;
        this.emailAddress = emailAddress;
        this.redactedFormattedPhoneNumber = redactedFormattedPhoneNumber;
        this.redactedPhoneNumber = redactedPhoneNumber;
        this.verificationSessions = verificationSessions;
    }
}
