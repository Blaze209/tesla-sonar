package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0003+-ABE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBa\b\u0011\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0016\b\u0001\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÁ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010)\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b)\u0010*R \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001fR,\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u00100\u0012\u0004\b3\u0010/\u001a\u0004\b1\u00102R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u0010/\u001a\u0004\b6\u00107R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b<\u0010/\u001a\u0004\b4\u0010;R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010=\u0012\u0004\b?\u0010/\u001a\u0004\b9\u0010>¨\u0006B"}, d2 = {"Lcom/stripe/android/financialconnections/model/Balance;", "Lt30/f;", "Landroid/os/Parcelable;", "", "asOf", "", "", "current", "Lcom/stripe/android/financialconnections/model/Balance$Type;", "type", "Lcom/stripe/android/financialconnections/model/f;", "cash", "Lcom/stripe/android/financialconnections/model/j;", "credit", "<init>", "(ILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/f;Lcom/stripe/android/financialconnections/model/j;)V", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(IILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/f;Lcom/stripe/android/financialconnections/model/j;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "g", "(Lcom/stripe/android/financialconnections/model/Balance;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "I", "b", "getAsOf$annotations", "()V", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "getCurrent$annotations", "c", "Lcom/stripe/android/financialconnections/model/Balance$Type;", "f", "()Lcom/stripe/android/financialconnections/model/Balance$Type;", "getType$annotations", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/financialconnections/model/f;", "()Lcom/stripe/android/financialconnections/model/f;", "getCash$annotations", "Lcom/stripe/android/financialconnections/model/j;", "()Lcom/stripe/android/financialconnections/model/j;", "getCredit$annotations", "Companion", "Type", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class Balance implements t30.f, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int asOf;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Integer> current;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Type type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CashBalance cash;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final CreditBalance credit;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f50252f = 8;
    public static final Parcelable.Creator<Balance> CREATOR = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ro0.d<Object>[] f50253g = {null, new vo0.m0(z1.f119730a, vo0.j0.f119632a), Type.INSTANCE.serializer(), null, null};

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/model/Balance$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "b", "CASH", "CREDIT", "UNKNOWN", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ro0.p
    public enum Type {
        CASH("cash"),
        CREDIT("credit"),
        UNKNOWN("unknown");

        private final String value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<ro0.d<Object>> $cachedSerializer$delegate = jn0.m.a(jn0.p.PUBLICATION, a.f50259c);

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f50259c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ro0.d<Object> invoke() {
                return vo0.a0.a("com.stripe.android.financialconnections.model.Balance.Type", Type.values(), new String[]{"cash", "credit", null}, new Annotation[][]{null, null, null}, null);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.Balance$Type$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/Balance$Type$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/Balance$Type;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ ro0.d a() {
                return (ro0.d) Type.$cachedSerializer$delegate.getValue();
            }

            public final ro0.d<Type> serializer() {
                return a();
            }

            private Companion() {
            }
        }

        Type(String str) {
            this.value = str;
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/Balance.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/Balance;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/Balance;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/Balance;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<Balance> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50260a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50260a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.Balance", aVar, 5);
            m1Var.o("as_of", false);
            m1Var.o("current", false);
            m1Var.o("type", true);
            m1Var.o("cash", true);
            m1Var.o("credit", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Balance deserialize(uo0.e decoder) {
            int iE;
            int i11;
            Map map;
            Type type;
            CashBalance fVar;
            CreditBalance jVar;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = Balance.f50253g;
            if (cVarB.i()) {
                iE = cVarB.e(descriptor2, 0);
                Map map2 = (Map) cVarB.n(descriptor2, 1, dVarArr[1], null);
                type = (Type) cVarB.n(descriptor2, 2, dVarArr[2], null);
                fVar = (CashBalance) cVarB.v(descriptor2, 3, CashBalance.a.f50450a, null);
                jVar = (CreditBalance) cVarB.v(descriptor2, 4, CreditBalance.a.f50487a, null);
                i11 = 31;
                map = map2;
            } else {
                boolean z11 = true;
                iE = 0;
                Map map3 = null;
                Type type2 = null;
                CashBalance fVar2 = null;
                CreditBalance jVar2 = null;
                int i12 = 0;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        iE = cVarB.e(descriptor2, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        map3 = (Map) cVarB.n(descriptor2, 1, dVarArr[1], map3);
                        i12 |= 2;
                    } else if (iA == 2) {
                        type2 = (Type) cVarB.n(descriptor2, 2, dVarArr[2], type2);
                        i12 |= 4;
                    } else if (iA == 3) {
                        fVar2 = (CashBalance) cVarB.v(descriptor2, 3, CashBalance.a.f50450a, fVar2);
                        i12 |= 8;
                    } else {
                        if (iA != 4) {
                            throw new UnknownFieldException(iA);
                        }
                        jVar2 = (CreditBalance) cVarB.v(descriptor2, 4, CreditBalance.a.f50487a, jVar2);
                        i12 |= 16;
                    }
                }
                i11 = i12;
                map = map3;
                type = type2;
                fVar = fVar2;
                jVar = jVar2;
            }
            int i13 = iE;
            cVarB.c(descriptor2);
            return new Balance(i11, i13, map, type, fVar, jVar, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, Balance value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            Balance.g(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            ro0.d<?>[] dVarArr = Balance.f50253g;
            return new ro0.d[]{vo0.j0.f119632a, dVarArr[1], dVarArr[2], so0.a.p(CashBalance.a.f50450a), so0.a.p(CreditBalance.a.f50487a)};
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

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.Balance$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/Balance$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/Balance;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<Balance> serializer() {
            return a.f50260a;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<Balance> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Balance createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
            }
            return new Balance(i11, linkedHashMap, Type.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CashBalance.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CreditBalance.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Balance[] newArray(int i11) {
            return new Balance[i11];
        }
    }

    @jn0.e
    public /* synthetic */ Balance(int i11, @ro0.o("as_of") int i12, @ro0.o("current") Map map, @ro0.o("type") Type type, @ro0.o("cash") CashBalance fVar, @ro0.o("credit") CreditBalance jVar, v1 v1Var) {
        if (3 != (i11 & 3)) {
            h1.b(i11, 3, a.f50260a.getDescriptor());
        }
        this.asOf = i12;
        this.current = map;
        if ((i11 & 4) == 0) {
            this.type = Type.UNKNOWN;
        } else {
            this.type = type;
        }
        if ((i11 & 8) == 0) {
            this.cash = null;
        } else {
            this.cash = fVar;
        }
        if ((i11 & 16) == 0) {
            this.credit = null;
        } else {
            this.credit = jVar;
        }
    }

    public static final /* synthetic */ void g(Balance self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f50253g;
        output.x(serialDesc, 0, self.asOf);
        output.D(serialDesc, 1, dVarArr[1], self.current);
        if (output.G(serialDesc, 2) || self.type != Type.UNKNOWN) {
            output.D(serialDesc, 2, dVarArr[2], self.type);
        }
        if (output.G(serialDesc, 3) || self.cash != null) {
            output.y(serialDesc, 3, CashBalance.a.f50450a, self.cash);
        }
        if (!output.G(serialDesc, 4) && self.credit == null) {
            return;
        }
        output.y(serialDesc, 4, CreditBalance.a.f50487a, self.credit);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAsOf() {
        return this.asOf;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CashBalance getCash() {
        return this.cash;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final CreditBalance getCredit() {
        return this.credit;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Map<String, Integer> e() {
        return this.current;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Balance)) {
            return false;
        }
        Balance balance = (Balance) other;
        return this.asOf == balance.asOf && p013kotlin.jvm.internal.s.f(this.current, balance.current) && this.type == balance.type && p013kotlin.jvm.internal.s.f(this.cash, balance.cash) && p013kotlin.jvm.internal.s.f(this.credit, balance.credit);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.asOf) * 31) + this.current.hashCode()) * 31) + this.type.hashCode()) * 31;
        CashBalance fVar = this.cash;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        CreditBalance jVar = this.credit;
        return iHashCode2 + (jVar != null ? jVar.hashCode() : 0);
    }

    public String toString() {
        return "Balance(asOf=" + this.asOf + ", current=" + this.current + ", type=" + this.type + ", cash=" + this.cash + ", credit=" + this.credit + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeInt(this.asOf);
        Map<String, Integer> map = this.current;
        parcel.writeInt(map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeInt(entry.getValue().intValue());
        }
        parcel.writeString(this.type.name());
        CashBalance fVar = this.cash;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, flags);
        }
        CreditBalance jVar = this.credit;
        if (jVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            jVar.writeToParcel(parcel, flags);
        }
    }

    public Balance(int i11, Map<String, Integer> current, Type type, CashBalance fVar, CreditBalance jVar) {
        p013kotlin.jvm.internal.s.k(current, "current");
        p013kotlin.jvm.internal.s.k(type, "type");
        this.asOf = i11;
        this.current = current;
        this.type = type;
        this.cash = fVar;
        this.credit = jVar;
    }
}
