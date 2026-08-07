package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.lang.annotation.Annotation;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0003%/+B\u001b\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB1\b\u0011\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010#\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010$R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b-\u0010*\u001a\u0004\b+\u0010\u0019¨\u00060"}, d2 = {"Lcom/stripe/android/financialconnections/model/BalanceRefresh;", "Lt30/f;", "Landroid/os/Parcelable;", "Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;", PermissionsResponse.STATUS_KEY, "", "lastAttemptedAt", "<init>", "(Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;I)V", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;ILvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/financialconnections/model/BalanceRefresh;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;", "c", "()Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;", "getStatus$annotations", "()V", "b", "I", "getLastAttemptedAt$annotations", "Companion", "BalanceRefreshStatus", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class BalanceRefresh implements t30.f, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BalanceRefreshStatus status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int lastAttemptedAt;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<BalanceRefresh> CREATOR = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ro0.d<Object>[] f50261c = {BalanceRefreshStatus.INSTANCE.serializer(), null};

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode$financial_connections_release", "()Ljava/lang/String;", "Companion", "b", "FAILED", "PENDING", "SUCCEEDED", "UNKNOWN", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ro0.p
    public enum BalanceRefreshStatus {
        FAILED("failed"),
        PENDING("pending"),
        SUCCEEDED("succeeded"),
        UNKNOWN("unknown");

        private final String code;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<ro0.d<Object>> $cachedSerializer$delegate = jn0.m.a(jn0.p.PUBLICATION, a.f50264c);

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f50264c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ro0.d<Object> invoke() {
                return vo0.a0.a("com.stripe.android.financialconnections.model.BalanceRefresh.BalanceRefreshStatus", BalanceRefreshStatus.values(), new String[]{"failed", "pending", "succeeded", null}, new Annotation[][]{null, null, null, null}, null);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.BalanceRefresh$BalanceRefreshStatus$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ ro0.d a() {
                return (ro0.d) BalanceRefreshStatus.$cachedSerializer$delegate.getValue();
            }

            public final ro0.d<BalanceRefreshStatus> serializer() {
                return a();
            }

            private Companion() {
            }
        }

        BalanceRefreshStatus(String str) {
            this.code = str;
        }

        public static EnumEntries<BalanceRefreshStatus> getEntries() {
            return $ENTRIES;
        }

        /* JADX INFO: renamed from: getCode$financial_connections_release, reason: from getter */
        public final String getCode() {
            return this.code;
        }
    }

    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/BalanceRefresh.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/BalanceRefresh;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/BalanceRefresh;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/BalanceRefresh;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<BalanceRefresh> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50265a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50265a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.BalanceRefresh", aVar, 2);
            m1Var.o(PermissionsResponse.STATUS_KEY, true);
            m1Var.o("last_attempted_at", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BalanceRefresh deserialize(uo0.e decoder) {
            BalanceRefreshStatus balanceRefreshStatus;
            int iE;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = BalanceRefresh.f50261c;
            v1 v1Var = null;
            if (cVarB.i()) {
                balanceRefreshStatus = (BalanceRefreshStatus) cVarB.v(descriptor2, 0, dVarArr[0], null);
                iE = cVarB.e(descriptor2, 1);
                i11 = 3;
            } else {
                boolean z11 = true;
                int iE2 = 0;
                int i12 = 0;
                BalanceRefreshStatus balanceRefreshStatus2 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        balanceRefreshStatus2 = (BalanceRefreshStatus) cVarB.v(descriptor2, 0, dVarArr[0], balanceRefreshStatus2);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        iE2 = cVarB.e(descriptor2, 1);
                        i12 |= 2;
                    }
                }
                balanceRefreshStatus = balanceRefreshStatus2;
                iE = iE2;
                i11 = i12;
            }
            cVarB.c(descriptor2);
            return new BalanceRefresh(i11, balanceRefreshStatus, iE, v1Var);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, BalanceRefresh value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            BalanceRefresh.d(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            return new ro0.d[]{so0.a.p(BalanceRefresh.f50261c[0]), vo0.j0.f119632a};
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

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.BalanceRefresh$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/BalanceRefresh$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/BalanceRefresh;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<BalanceRefresh> serializer() {
            return a.f50265a;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<BalanceRefresh> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BalanceRefresh createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new BalanceRefresh(parcel.readInt() == 0 ? null : BalanceRefreshStatus.valueOf(parcel.readString()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BalanceRefresh[] newArray(int i11) {
            return new BalanceRefresh[i11];
        }
    }

    @jn0.e
    public /* synthetic */ BalanceRefresh(int i11, @ro0.o(PermissionsResponse.STATUS_KEY) BalanceRefreshStatus balanceRefreshStatus, @ro0.o("last_attempted_at") int i12, v1 v1Var) {
        if (2 != (i11 & 2)) {
            h1.b(i11, 2, a.f50265a.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.status = BalanceRefreshStatus.UNKNOWN;
        } else {
            this.status = balanceRefreshStatus;
        }
        this.lastAttemptedAt = i12;
    }

    public static final /* synthetic */ void d(BalanceRefresh self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f50261c;
        if (output.G(serialDesc, 0) || self.status != BalanceRefreshStatus.UNKNOWN) {
            output.y(serialDesc, 0, dVarArr[0], self.status);
        }
        output.x(serialDesc, 1, self.lastAttemptedAt);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLastAttemptedAt() {
        return this.lastAttemptedAt;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BalanceRefreshStatus getStatus() {
        return this.status;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalanceRefresh)) {
            return false;
        }
        BalanceRefresh balanceRefresh = (BalanceRefresh) other;
        return this.status == balanceRefresh.status && this.lastAttemptedAt == balanceRefresh.lastAttemptedAt;
    }

    public int hashCode() {
        BalanceRefreshStatus balanceRefreshStatus = this.status;
        return ((balanceRefreshStatus == null ? 0 : balanceRefreshStatus.hashCode()) * 31) + Integer.hashCode(this.lastAttemptedAt);
    }

    public String toString() {
        return "BalanceRefresh(status=" + this.status + ", lastAttemptedAt=" + this.lastAttemptedAt + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        BalanceRefreshStatus balanceRefreshStatus = this.status;
        if (balanceRefreshStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(balanceRefreshStatus.name());
        }
        parcel.writeInt(this.lastAttemptedAt);
    }

    public BalanceRefresh(BalanceRefreshStatus balanceRefreshStatus, int i11) {
        this.status = balanceRefreshStatus;
        this.lastAttemptedAt = i11;
    }
}
