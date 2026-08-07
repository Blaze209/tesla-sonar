package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.m0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0081\b\u0018\u0000 12\u00020\u0001:\u0002%+B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tBA\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ \u0010#\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010&\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010(R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010.\u0012\u0004\b0\u0010*\u001a\u0004\b+\u0010/¨\u00062"}, d2 = {"Lcom/stripe/android/financialconnections/model/m0;", "Landroid/os/Parcelable;", "", "reducedBranding", "reducedManualEntryProminenceInErrors", "", "", "merchantLogos", "<init>", "(ZZLjava/util/List;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(IZZLjava/util/List;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "e", "(Lcom/stripe/android/financialconnections/model/m0;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Z", "c", "()Z", "getReducedBranding$annotations", "()V", "b", DateTokenConverter.CONVERTER_KEY, "getReducedManualEntryProminenceInErrors$annotations", "Ljava/util/List;", "()Ljava/util/List;", "getMerchantLogos$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class VisualUpdate implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean reducedBranding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean reducedManualEntryProminenceInErrors;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> merchantLogos;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f50521d = 8;
    public static final Parcelable.Creator<VisualUpdate> CREATOR = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ro0.d<Object>[] f50522e = {null, null, new vo0.e(z1.f119730a)};

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.m0$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/VisualUpdate.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/m0;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/m0;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/m0;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<VisualUpdate> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50526a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50526a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.VisualUpdate", aVar, 3);
            m1Var.o("reduced_branding", false);
            m1Var.o("reduce_manual_entry_prominence_in_errors", false);
            m1Var.o("merchant_logo", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VisualUpdate deserialize(uo0.e decoder) {
            boolean zW;
            int i11;
            boolean z11;
            List list;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = VisualUpdate.f50522e;
            if (cVarB.i()) {
                zW = cVarB.w(descriptor2, 0);
                boolean zW2 = cVarB.w(descriptor2, 1);
                list = (List) cVarB.n(descriptor2, 2, dVarArr[2], null);
                i11 = 7;
                z11 = zW2;
            } else {
                boolean z12 = true;
                zW = false;
                boolean zW3 = false;
                List list2 = null;
                int i12 = 0;
                while (z12) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z12 = false;
                    } else if (iA == 0) {
                        zW = cVarB.w(descriptor2, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        zW3 = cVarB.w(descriptor2, 1);
                        i12 |= 2;
                    } else {
                        if (iA != 2) {
                            throw new UnknownFieldException(iA);
                        }
                        list2 = (List) cVarB.n(descriptor2, 2, dVarArr[2], list2);
                        i12 |= 4;
                    }
                }
                i11 = i12;
                z11 = zW3;
                list = list2;
            }
            boolean z13 = zW;
            cVarB.c(descriptor2);
            return new VisualUpdate(i11, z13, z11, list, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, VisualUpdate value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            VisualUpdate.e(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            ro0.d<?> dVar = VisualUpdate.f50522e[2];
            vo0.h hVar = vo0.h.f119620a;
            return new ro0.d[]{hVar, hVar, dVar};
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

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.m0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/m0$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/m0;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<VisualUpdate> serializer() {
            return a.f50526a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.m0$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<VisualUpdate> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VisualUpdate createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new VisualUpdate(parcel.readInt() != 0, parcel.readInt() != 0, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final VisualUpdate[] newArray(int i11) {
            return new VisualUpdate[i11];
        }
    }

    @jn0.e
    public /* synthetic */ VisualUpdate(int i11, @ro0.o("reduced_branding") boolean z11, @ro0.o("reduce_manual_entry_prominence_in_errors") boolean z12, @ro0.o("merchant_logo") List list, v1 v1Var) {
        if (7 != (i11 & 7)) {
            h1.b(i11, 7, a.f50526a.getDescriptor());
        }
        this.reducedBranding = z11;
        this.reducedManualEntryProminenceInErrors = z12;
        this.merchantLogos = list;
    }

    public static final /* synthetic */ void e(VisualUpdate self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f50522e;
        output.A(serialDesc, 0, self.reducedBranding);
        output.A(serialDesc, 1, self.reducedManualEntryProminenceInErrors);
        output.D(serialDesc, 2, dVarArr[2], self.merchantLogos);
    }

    public final List<String> b() {
        return this.merchantLogos;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getReducedBranding() {
        return this.reducedBranding;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getReducedManualEntryProminenceInErrors() {
        return this.reducedManualEntryProminenceInErrors;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisualUpdate)) {
            return false;
        }
        VisualUpdate visualUpdate = (VisualUpdate) other;
        return this.reducedBranding == visualUpdate.reducedBranding && this.reducedManualEntryProminenceInErrors == visualUpdate.reducedManualEntryProminenceInErrors && p013kotlin.jvm.internal.s.f(this.merchantLogos, visualUpdate.merchantLogos);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.reducedBranding) * 31) + Boolean.hashCode(this.reducedManualEntryProminenceInErrors)) * 31) + this.merchantLogos.hashCode();
    }

    public String toString() {
        return "VisualUpdate(reducedBranding=" + this.reducedBranding + ", reducedManualEntryProminenceInErrors=" + this.reducedManualEntryProminenceInErrors + ", merchantLogos=" + this.merchantLogos + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeInt(this.reducedBranding ? 1 : 0);
        parcel.writeInt(this.reducedManualEntryProminenceInErrors ? 1 : 0);
        parcel.writeStringList(this.merchantLogos);
    }

    public VisualUpdate(boolean z11, boolean z12, List<String> merchantLogos) {
        p013kotlin.jvm.internal.s.k(merchantLogos, "merchantLogos");
        this.reducedBranding = z11;
        this.reducedManualEntryProminenceInErrors = z12;
        this.merchantLogos = merchantLogos;
    }
}
