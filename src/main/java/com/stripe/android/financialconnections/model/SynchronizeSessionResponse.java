package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.k0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0081\b\u0018\u0000 72\u00020\u0001:\u0002\u0017.B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB?\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J0\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010'\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u0010-\u001a\u0004\b0\u00101R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u00103\u0012\u0004\b6\u0010-\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/stripe/android/financialconnections/model/k0;", "Landroid/os/Parcelable;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "manifest", "Lcom/stripe/android/financialconnections/model/l0;", "text", "Lcom/stripe/android/financialconnections/model/m0;", "visual", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/model/l0;Lcom/stripe/android/financialconnections/model/m0;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/model/l0;Lcom/stripe/android/financialconnections/model/m0;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "f", "(Lcom/stripe/android/financialconnections/model/k0;Luo0/d;Lto0/f;)V", "a", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/model/l0;Lcom/stripe/android/financialconnections/model/m0;)Lcom/stripe/android/financialconnections/model/k0;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "c", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "getManifest$annotations", "()V", "b", "Lcom/stripe/android/financialconnections/model/l0;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/financialconnections/model/l0;", "getText$annotations", "Lcom/stripe/android/financialconnections/model/m0;", "e", "()Lcom/stripe/android/financialconnections/model/m0;", "getVisual$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class SynchronizeSessionResponse implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsSessionManifest manifest;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextUpdate text;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final VisualUpdate visual;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f50494d = 8;
    public static final Parcelable.Creator<SynchronizeSessionResponse> CREATOR = new c();

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.k0$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/SynchronizeSessionResponse.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/k0;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/k0;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/k0;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<SynchronizeSessionResponse> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50498a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50498a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.SynchronizeSessionResponse", aVar, 3);
            m1Var.o("manifest", false);
            m1Var.o("text", true);
            m1Var.o("visual", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SynchronizeSessionResponse deserialize(uo0.e decoder) {
            int i11;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            TextUpdate l0Var;
            VisualUpdate m0Var;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = null;
            if (cVarB.i()) {
                FinancialConnectionsSessionManifest financialConnectionsSessionManifest3 = (FinancialConnectionsSessionManifest) cVarB.n(descriptor2, 0, FinancialConnectionsSessionManifest.a.f50365a, null);
                TextUpdate l0Var2 = (TextUpdate) cVarB.v(descriptor2, 1, TextUpdate.a.f50516a, null);
                financialConnectionsSessionManifest = financialConnectionsSessionManifest3;
                m0Var = (VisualUpdate) cVarB.n(descriptor2, 2, VisualUpdate.a.f50526a, null);
                l0Var = l0Var2;
                i11 = 7;
            } else {
                boolean z11 = true;
                int i12 = 0;
                TextUpdate l0Var3 = null;
                VisualUpdate m0Var2 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        financialConnectionsSessionManifest2 = (FinancialConnectionsSessionManifest) cVarB.n(descriptor2, 0, FinancialConnectionsSessionManifest.a.f50365a, financialConnectionsSessionManifest2);
                        i12 |= 1;
                    } else if (iA == 1) {
                        l0Var3 = (TextUpdate) cVarB.v(descriptor2, 1, TextUpdate.a.f50516a, l0Var3);
                        i12 |= 2;
                    } else {
                        if (iA != 2) {
                            throw new UnknownFieldException(iA);
                        }
                        m0Var2 = (VisualUpdate) cVarB.n(descriptor2, 2, VisualUpdate.a.f50526a, m0Var2);
                        i12 |= 4;
                    }
                }
                i11 = i12;
                financialConnectionsSessionManifest = financialConnectionsSessionManifest2;
                l0Var = l0Var3;
                m0Var = m0Var2;
            }
            cVarB.c(descriptor2);
            return new SynchronizeSessionResponse(i11, financialConnectionsSessionManifest, l0Var, m0Var, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, SynchronizeSessionResponse value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            SynchronizeSessionResponse.f(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            return new ro0.d[]{FinancialConnectionsSessionManifest.a.f50365a, so0.a.p(TextUpdate.a.f50516a), VisualUpdate.a.f50526a};
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

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.k0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/k0$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/k0;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<SynchronizeSessionResponse> serializer() {
            return a.f50498a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.k0$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<SynchronizeSessionResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SynchronizeSessionResponse createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new SynchronizeSessionResponse(FinancialConnectionsSessionManifest.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TextUpdate.CREATOR.createFromParcel(parcel), VisualUpdate.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SynchronizeSessionResponse[] newArray(int i11) {
            return new SynchronizeSessionResponse[i11];
        }
    }

    @jn0.e
    public /* synthetic */ SynchronizeSessionResponse(int i11, @ro0.o("manifest") FinancialConnectionsSessionManifest financialConnectionsSessionManifest, @ro0.o("text") TextUpdate l0Var, @ro0.o("visual") VisualUpdate m0Var, v1 v1Var) {
        if (5 != (i11 & 5)) {
            h1.b(i11, 5, a.f50498a.getDescriptor());
        }
        this.manifest = financialConnectionsSessionManifest;
        if ((i11 & 2) == 0) {
            this.text = null;
        } else {
            this.text = l0Var;
        }
        this.visual = m0Var;
    }

    public static /* synthetic */ SynchronizeSessionResponse b(SynchronizeSessionResponse synchronizeSessionResponse, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, TextUpdate l0Var, VisualUpdate m0Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            financialConnectionsSessionManifest = synchronizeSessionResponse.manifest;
        }
        if ((i11 & 2) != 0) {
            l0Var = synchronizeSessionResponse.text;
        }
        if ((i11 & 4) != 0) {
            m0Var = synchronizeSessionResponse.visual;
        }
        return synchronizeSessionResponse.a(financialConnectionsSessionManifest, l0Var, m0Var);
    }

    public static final /* synthetic */ void f(SynchronizeSessionResponse self, uo0.d output, to0.f serialDesc) {
        output.D(serialDesc, 0, FinancialConnectionsSessionManifest.a.f50365a, self.manifest);
        if (output.G(serialDesc, 1) || self.text != null) {
            output.y(serialDesc, 1, TextUpdate.a.f50516a, self.text);
        }
        output.D(serialDesc, 2, VisualUpdate.a.f50526a, self.visual);
    }

    public final SynchronizeSessionResponse a(FinancialConnectionsSessionManifest manifest, TextUpdate text, VisualUpdate visual) {
        p013kotlin.jvm.internal.s.k(manifest, "manifest");
        p013kotlin.jvm.internal.s.k(visual, "visual");
        return new SynchronizeSessionResponse(manifest, text, visual);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final FinancialConnectionsSessionManifest getManifest() {
        return this.manifest;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextUpdate getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final VisualUpdate getVisual() {
        return this.visual;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SynchronizeSessionResponse)) {
            return false;
        }
        SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) other;
        return p013kotlin.jvm.internal.s.f(this.manifest, synchronizeSessionResponse.manifest) && p013kotlin.jvm.internal.s.f(this.text, synchronizeSessionResponse.text) && p013kotlin.jvm.internal.s.f(this.visual, synchronizeSessionResponse.visual);
    }

    public int hashCode() {
        int iHashCode = this.manifest.hashCode() * 31;
        TextUpdate l0Var = this.text;
        return ((iHashCode + (l0Var == null ? 0 : l0Var.hashCode())) * 31) + this.visual.hashCode();
    }

    public String toString() {
        return "SynchronizeSessionResponse(manifest=" + this.manifest + ", text=" + this.text + ", visual=" + this.visual + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        this.manifest.writeToParcel(parcel, flags);
        TextUpdate l0Var = this.text;
        if (l0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            l0Var.writeToParcel(parcel, flags);
        }
        this.visual.writeToParcel(parcel, flags);
    }

    public SynchronizeSessionResponse(FinancialConnectionsSessionManifest manifest, TextUpdate l0Var, VisualUpdate visual) {
        p013kotlin.jvm.internal.s.k(manifest, "manifest");
        p013kotlin.jvm.internal.s.k(visual, "visual");
        this.manifest = manifest;
        this.text = l0Var;
        this.visual = visual;
    }
}
