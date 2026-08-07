package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.Serializable;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.text.MatchGroup;
import vo0.h1;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.q, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\b\u0081\b\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0002+1BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010Bw\b\u0011\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÁ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010 J \u0010)\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b)\u0010*R \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010\u001eR \u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010,\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010.R \u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u00102\u0012\u0004\b9\u00100\u001a\u0004\b8\u0010\u001eR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b=\u00100\u001a\u0004\b1\u0010<R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010;\u0012\u0004\b@\u00100\u001a\u0004\b?\u0010<R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010B\u0012\u0004\bE\u00100\u001a\u0004\bC\u0010DR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bF\u00102\u0012\u0004\bH\u00100\u001a\u0004\bG\u0010\u001eR\u0011\u0010I\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b+\u0010\u001e¨\u0006K"}, d2 = {"Lcom/stripe/android/financialconnections/model/q;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "featured", "", "id", "mobileHandoffCapable", "name", "Lcom/stripe/android/financialconnections/model/r;", "icon", "logo", "", "featuredOrder", ImagesContract.URL, "<init>", "(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/r;Lcom/stripe/android/financialconnections/model/r;Ljava/lang/Integer;Ljava/lang/String;)V", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(IZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/r;Lcom/stripe/android/financialconnections/model/r;Ljava/lang/Integer;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "c", "(Lcom/stripe/android/financialconnections/model/q;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Z", "getFeatured", "()Z", "getFeatured$annotations", "()V", "b", "Ljava/lang/String;", "getId", "getId$annotations", "getMobileHandoffCapable", "getMobileHandoffCapable$annotations", DateTokenConverter.CONVERTER_KEY, "getName", "getName$annotations", "e", "Lcom/stripe/android/financialconnections/model/r;", "()Lcom/stripe/android/financialconnections/model/r;", "getIcon$annotations", "f", "getLogo", "getLogo$annotations", "g", "Ljava/lang/Integer;", "getFeaturedOrder", "()Ljava/lang/Integer;", "getFeaturedOrder$annotations", "h", "getUrl", "getUrl$annotations", "formattedUrl", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class FinancialConnectionsInstitution implements Parcelable, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean featured;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean mobileHandoffCapable;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Image icon;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Image logo;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer featuredOrder;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<FinancialConnectionsInstitution> CREATOR = new c();

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.q$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsInstitution.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/q;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/q;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/q;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<FinancialConnectionsInstitution> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50550a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50550a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.FinancialConnectionsInstitution", aVar, 8);
            m1Var.o("featured", false);
            m1Var.o("id", false);
            m1Var.o("mobile_handoff_capable", false);
            m1Var.o("name", false);
            m1Var.o("icon", true);
            m1Var.o("logo", true);
            m1Var.o("featured_order", true);
            m1Var.o(ImagesContract.URL, true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FinancialConnectionsInstitution deserialize(uo0.e decoder) {
            boolean zW;
            String str;
            Integer num;
            Image rVar;
            boolean z11;
            int i11;
            String str2;
            String str3;
            Image rVar2;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            if (cVarB.i()) {
                zW = cVarB.w(descriptor2, 0);
                String strT = cVarB.t(descriptor2, 1);
                boolean zW2 = cVarB.w(descriptor2, 2);
                String strT2 = cVarB.t(descriptor2, 3);
                Image.a aVar = Image.a.f50552a;
                Image rVar3 = (Image) cVarB.v(descriptor2, 4, aVar, null);
                Image rVar4 = (Image) cVarB.v(descriptor2, 5, aVar, null);
                Integer num2 = (Integer) cVarB.v(descriptor2, 6, vo0.j0.f119632a, null);
                str = (String) cVarB.v(descriptor2, 7, z1.f119730a, null);
                num = num2;
                rVar = rVar4;
                str3 = strT2;
                rVar2 = rVar3;
                z11 = zW2;
                str2 = strT;
                i11 = 255;
            } else {
                boolean z12 = true;
                zW = false;
                int i12 = 0;
                String str4 = null;
                Integer num3 = null;
                String strT3 = null;
                String strT4 = null;
                Image rVar5 = null;
                boolean zW3 = false;
                Image rVar6 = null;
                while (z12) {
                    int iA = cVarB.A(descriptor2);
                    switch (iA) {
                        case -1:
                            z12 = false;
                            break;
                        case 0:
                            i12 |= 1;
                            zW = cVarB.w(descriptor2, 0);
                            continue;
                        case 1:
                            i12 |= 2;
                            strT3 = cVarB.t(descriptor2, 1);
                            continue;
                        case 2:
                            i12 |= 4;
                            zW3 = cVarB.w(descriptor2, 2);
                            continue;
                        case 3:
                            strT4 = cVarB.t(descriptor2, 3);
                            i12 |= 8;
                            continue;
                        case 4:
                            rVar5 = (Image) cVarB.v(descriptor2, 4, Image.a.f50552a, rVar5);
                            i12 |= 16;
                            break;
                        case 5:
                            rVar6 = (Image) cVarB.v(descriptor2, 5, Image.a.f50552a, rVar6);
                            i12 |= 32;
                            break;
                        case 6:
                            num3 = (Integer) cVarB.v(descriptor2, 6, vo0.j0.f119632a, num3);
                            i12 |= 64;
                            break;
                        case 7:
                            str4 = (String) cVarB.v(descriptor2, 7, z1.f119730a, str4);
                            i12 |= 128;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                str = str4;
                num = num3;
                rVar = rVar6;
                z11 = zW3;
                i11 = i12;
                str2 = strT3;
                str3 = strT4;
                rVar2 = rVar5;
            }
            boolean z13 = zW;
            cVarB.c(descriptor2);
            return new FinancialConnectionsInstitution(i11, z13, str2, z11, str3, rVar2, rVar, num, str, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, FinancialConnectionsInstitution value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            FinancialConnectionsInstitution.c(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            z1 z1Var = z1.f119730a;
            Image.a aVar = Image.a.f50552a;
            ro0.d<?> dVarP = so0.a.p(aVar);
            ro0.d<?> dVarP2 = so0.a.p(aVar);
            ro0.d<?> dVarP3 = so0.a.p(vo0.j0.f119632a);
            ro0.d<?> dVarP4 = so0.a.p(z1Var);
            vo0.h hVar = vo0.h.f119620a;
            return new ro0.d[]{hVar, z1Var, hVar, z1Var, dVarP, dVarP2, dVarP3, dVarP4};
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

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.q$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/q$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/q;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<FinancialConnectionsInstitution> serializer() {
            return a.f50550a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.q$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<FinancialConnectionsInstitution> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsInstitution createFromParcel(Parcel parcel) {
            boolean z11;
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            boolean z12 = false;
            if (parcel.readInt() != 0) {
                z12 = true;
                z11 = true;
            } else {
                z11 = true;
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                z11 = false;
            }
            return new FinancialConnectionsInstitution(z12, string, z11, parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsInstitution[] newArray(int i11) {
            return new FinancialConnectionsInstitution[i11];
        }
    }

    @jn0.e
    public /* synthetic */ FinancialConnectionsInstitution(int i11, @ro0.o("featured") boolean z11, @ro0.o("id") String str, @ro0.o("mobile_handoff_capable") boolean z12, @ro0.o("name") String str2, @ro0.o("icon") Image rVar, @ro0.o("logo") Image rVar2, @ro0.o("featured_order") Integer num, @ro0.o(ImagesContract.URL) String str3, v1 v1Var) {
        if (15 != (i11 & 15)) {
            h1.b(i11, 15, a.f50550a.getDescriptor());
        }
        this.featured = z11;
        this.id = str;
        this.mobileHandoffCapable = z12;
        this.name = str2;
        if ((i11 & 16) == 0) {
            this.icon = null;
        } else {
            this.icon = rVar;
        }
        if ((i11 & 32) == 0) {
            this.logo = null;
        } else {
            this.logo = rVar2;
        }
        if ((i11 & 64) == 0) {
            this.featuredOrder = null;
        } else {
            this.featuredOrder = num;
        }
        if ((i11 & 128) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
    }

    public static final /* synthetic */ void c(FinancialConnectionsInstitution self, uo0.d output, to0.f serialDesc) {
        output.A(serialDesc, 0, self.featured);
        output.e(serialDesc, 1, self.id);
        output.A(serialDesc, 2, self.mobileHandoffCapable);
        output.e(serialDesc, 3, self.name);
        if (output.G(serialDesc, 4) || self.icon != null) {
            output.y(serialDesc, 4, Image.a.f50552a, self.icon);
        }
        if (output.G(serialDesc, 5) || self.logo != null) {
            output.y(serialDesc, 5, Image.a.f50552a, self.logo);
        }
        if (output.G(serialDesc, 6) || self.featuredOrder != null) {
            output.y(serialDesc, 6, vo0.j0.f119632a, self.featuredOrder);
        }
        if (!output.G(serialDesc, 7) && self.url == null) {
            return;
        }
        output.y(serialDesc, 7, z1.f119730a, self.url);
    }

    public final String a() {
        p013kotlin.text.m mVarD;
        p013kotlin.text.l lVarB;
        MatchGroup matchGroup;
        String value;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            p013kotlin.text.q qVar = new p013kotlin.text.q("^(?:https?://)?(?:www\\.|[^@\\n]+@)?([^:/\\n]+)");
            String str = this.url;
            if (str != null && (mVarD = p013kotlin.text.q.d(qVar, str, 0, 2, null)) != null && (lVarB = mVarD.b()) != null && (matchGroup = lVarB.get(1)) != null && (value = matchGroup.getValue()) != null) {
                List listE1 = p013kotlin.text.t.e1(value, new char[]{CoreConstants.DOT}, false, 0, 6, null);
                int size = listE1.size();
                if (size > 2) {
                    int i11 = size - 2;
                    if (((String) listE1.get(i11)).length() <= 3) {
                        int i12 = size - 1;
                        if (((String) listE1.get(i12)).length() <= 2) {
                            return listE1.get(size - 3) + "." + listE1.get(i11) + "." + listE1.get(i12);
                        }
                    }
                }
                return listE1.get(size - 2) + "." + listE1.get(size - 1);
            }
            return "";
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            Object objB = jn0.s.b(jn0.t.a(th2));
            String str2 = this.url;
            String str3 = str2 != null ? str2 : "";
            if (jn0.s.g(objB)) {
                objB = str3;
            }
            return (String) objB;
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Image getIcon() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsInstitution)) {
            return false;
        }
        FinancialConnectionsInstitution financialConnectionsInstitution = (FinancialConnectionsInstitution) other;
        return this.featured == financialConnectionsInstitution.featured && p013kotlin.jvm.internal.s.f(this.id, financialConnectionsInstitution.id) && this.mobileHandoffCapable == financialConnectionsInstitution.mobileHandoffCapable && p013kotlin.jvm.internal.s.f(this.name, financialConnectionsInstitution.name) && p013kotlin.jvm.internal.s.f(this.icon, financialConnectionsInstitution.icon) && p013kotlin.jvm.internal.s.f(this.logo, financialConnectionsInstitution.logo) && p013kotlin.jvm.internal.s.f(this.featuredOrder, financialConnectionsInstitution.featuredOrder) && p013kotlin.jvm.internal.s.f(this.url, financialConnectionsInstitution.url);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.featured) * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.mobileHandoffCapable)) * 31) + this.name.hashCode()) * 31;
        Image rVar = this.icon;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        Image rVar2 = this.logo;
        int iHashCode3 = (iHashCode2 + (rVar2 == null ? 0 : rVar2.hashCode())) * 31;
        Integer num = this.featuredOrder;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.url;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "FinancialConnectionsInstitution(featured=" + this.featured + ", id=" + this.id + ", mobileHandoffCapable=" + this.mobileHandoffCapable + ", name=" + this.name + ", icon=" + this.icon + ", logo=" + this.logo + ", featuredOrder=" + this.featuredOrder + ", url=" + this.url + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeInt(this.featured ? 1 : 0);
        parcel.writeString(this.id);
        parcel.writeInt(this.mobileHandoffCapable ? 1 : 0);
        parcel.writeString(this.name);
        Image rVar = this.icon;
        if (rVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rVar.writeToParcel(parcel, flags);
        }
        Image rVar2 = this.logo;
        if (rVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rVar2.writeToParcel(parcel, flags);
        }
        Integer num = this.featuredOrder;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.url);
    }

    public FinancialConnectionsInstitution(boolean z11, String id2, boolean z12, String name, Image rVar, Image rVar2, Integer num, String str) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        p013kotlin.jvm.internal.s.k(name, "name");
        this.featured = z11;
        this.id = id2;
        this.mobileHandoffCapable = z12;
        this.name = name;
        this.icon = rVar;
        this.logo = rVar2;
        this.featuredOrder = num;
        this.url = str;
    }
}
