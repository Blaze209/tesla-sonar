package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.g, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0002$&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010\"\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b$\u0010*¨\u0006-"}, d2 = {"Lcom/stripe/android/financialconnections/model/g;", "Landroid/os/Parcelable;", "", "subtitle", "Lcom/stripe/android/financialconnections/model/m;", "body", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/m;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/m;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "c", "(Lcom/stripe/android/financialconnections/model/g;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "getSubtitle$annotations", "()V", "Lcom/stripe/android/financialconnections/model/m;", "()Lcom/stripe/android/financialconnections/model/m;", "getBody$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class ConnectedAccessNotice implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subtitle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DataAccessNoticeBody body;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f50451c = 8;
    public static final Parcelable.Creator<ConnectedAccessNotice> CREATOR = new c();

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.g$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/ConnectedAccessNotice.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/g;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/g;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/g;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<ConnectedAccessNotice> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50454a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50454a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.ConnectedAccessNotice", aVar, 2);
            m1Var.o("subtitle", false);
            m1Var.o("body", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectedAccessNotice deserialize(uo0.e decoder) {
            String str;
            DataAccessNoticeBody dataAccessNoticeBody;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            v1 v1Var = null;
            if (cVarB.i()) {
                str = (String) cVarB.n(descriptor2, 0, n50.d.f93345a, null);
                dataAccessNoticeBody = (DataAccessNoticeBody) cVarB.n(descriptor2, 1, DataAccessNoticeBody.a.f50520a, null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                str = null;
                DataAccessNoticeBody dataAccessNoticeBody2 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        str = (String) cVarB.n(descriptor2, 0, n50.d.f93345a, str);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        dataAccessNoticeBody2 = (DataAccessNoticeBody) cVarB.n(descriptor2, 1, DataAccessNoticeBody.a.f50520a, dataAccessNoticeBody2);
                        i12 |= 2;
                    }
                }
                dataAccessNoticeBody = dataAccessNoticeBody2;
                i11 = i12;
            }
            cVarB.c(descriptor2);
            return new ConnectedAccessNotice(i11, str, dataAccessNoticeBody, v1Var);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, ConnectedAccessNotice value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            ConnectedAccessNotice.c(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            return new ro0.d[]{n50.d.f93345a, DataAccessNoticeBody.a.f50520a};
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

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/g$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/g;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<ConnectedAccessNotice> serializer() {
            return a.f50454a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.g$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<ConnectedAccessNotice> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConnectedAccessNotice createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new ConnectedAccessNotice(parcel.readString(), DataAccessNoticeBody.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConnectedAccessNotice[] newArray(int i11) {
            return new ConnectedAccessNotice[i11];
        }
    }

    @jn0.e
    public /* synthetic */ ConnectedAccessNotice(int i11, @ro0.o("subtitle") @ro0.p(with = n50.d.class) String str, @ro0.o("body") DataAccessNoticeBody dataAccessNoticeBody, v1 v1Var) {
        if (3 != (i11 & 3)) {
            h1.b(i11, 3, a.f50454a.getDescriptor());
        }
        this.subtitle = str;
        this.body = dataAccessNoticeBody;
    }

    public static final /* synthetic */ void c(ConnectedAccessNotice self, uo0.d output, to0.f serialDesc) {
        output.D(serialDesc, 0, n50.d.f93345a, self.subtitle);
        output.D(serialDesc, 1, DataAccessNoticeBody.a.f50520a, self.body);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DataAccessNoticeBody getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectedAccessNotice)) {
            return false;
        }
        ConnectedAccessNotice connectedAccessNotice = (ConnectedAccessNotice) other;
        return p013kotlin.jvm.internal.s.f(this.subtitle, connectedAccessNotice.subtitle) && p013kotlin.jvm.internal.s.f(this.body, connectedAccessNotice.body);
    }

    public int hashCode() {
        return (this.subtitle.hashCode() * 31) + this.body.hashCode();
    }

    public String toString() {
        return "ConnectedAccessNotice(subtitle=" + this.subtitle + ", body=" + this.body + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.subtitle);
        this.body.writeToParcel(parcel, flags);
    }

    public ConnectedAccessNotice(String subtitle, DataAccessNoticeBody body) {
        p013kotlin.jvm.internal.s.k(subtitle, "subtitle");
        p013kotlin.jvm.internal.s.k(body, "body");
        this.subtitle = subtitle;
        this.body = body;
    }
}
