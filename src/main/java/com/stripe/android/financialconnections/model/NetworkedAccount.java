package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import defpackage.FinancialConnectionsGenericInfoScreen;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.x, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\b\u0081\b\u0018\u0000 J2\u00020\u0001:\u0002,1Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0085\u0001\b\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J(\u0010\u000e\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aHÁ\u0001¢\u0006\u0004\b\u000e\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b&\u0010!J \u0010*\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b4\u00100\u001a\u0004\b1\u00103R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010-\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u0010-\u0012\u0004\b9\u00100\u001a\u0004\b8\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u00100\u001a\u0004\b<\u0010=R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010;\u0012\u0004\b@\u00100\u001a\u0004\b?\u0010=R\"\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010;\u0012\u0004\bA\u00100\u001a\u0004\b,\u0010=R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bE\u00100\u001a\u0004\b7\u0010DR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bF\u0010G\u0012\u0004\bI\u00100\u001a\u0004\b:\u0010H¨\u0006K"}, d2 = {"Lcom/stripe/android/financialconnections/model/x;", "Landroid/os/Parcelable;", "", "id", "", "allowSelection", "caption", "selectionCta", "Lcom/stripe/android/financialconnections/model/r;", "icon", "selectionCtaIcon", "accountIcon", "Lcom/stripe/android/financialconnections/model/l;", "dataAccessNotice", "Lg;", "drawerOnSelection", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/r;Lcom/stripe/android/financialconnections/model/r;Lcom/stripe/android/financialconnections/model/r;Lcom/stripe/android/financialconnections/model/l;Lg;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/r;Lcom/stripe/android/financialconnections/model/r;Lcom/stripe/android/financialconnections/model/r;Lcom/stripe/android/financialconnections/model/l;Lg;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "(Lcom/stripe/android/financialconnections/model/x;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "b", "Z", "()Z", "getAllowSelection$annotations", "c", "getCaption$annotations", DateTokenConverter.CONVERTER_KEY, "f", "getSelectionCta$annotations", "e", "Lcom/stripe/android/financialconnections/model/r;", "getIcon", "()Lcom/stripe/android/financialconnections/model/r;", "getIcon$annotations", "getSelectionCtaIcon", "getSelectionCtaIcon$annotations", "getAccountIcon$annotations", "h", "Lcom/stripe/android/financialconnections/model/l;", "()Lcom/stripe/android/financialconnections/model/l;", "getDataAccessNotice$annotations", IntegerTokenConverter.CONVERTER_KEY, "Lg;", "()Lg;", "getDrawerOnSelection$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class NetworkedAccount implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allowSelection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String caption;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectionCta;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Image icon;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Image selectionCtaIcon;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Image accountIcon;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final DataAccessNotice dataAccessNotice;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsGenericInfoScreen drawerOnSelection;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f50577j = 8;
    public static final Parcelable.Creator<NetworkedAccount> CREATOR = new c();

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.x$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/NetworkedAccount.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/x;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/x;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/x;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<NetworkedAccount> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50587a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50587a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.NetworkedAccount", aVar, 9);
            m1Var.o("id", false);
            m1Var.o("allow_selection", false);
            m1Var.o("caption", true);
            m1Var.o("selection_cta", true);
            m1Var.o("icon", true);
            m1Var.o("selection_cta_icon", true);
            m1Var.o("account_icon", true);
            m1Var.o("data_access_notice", true);
            m1Var.o("drawer_on_selection", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NetworkedAccount deserialize(uo0.e decoder) {
            boolean z11;
            DataAccessNotice dataAccessNotice;
            FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen;
            Image image;
            Image image2;
            Image image3;
            int i11;
            String str;
            String str2;
            String str3;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            int i12 = 7;
            if (cVarB.i()) {
                String strT = cVarB.t(descriptor2, 0);
                boolean zW = cVarB.w(descriptor2, 1);
                z1 z1Var = z1.f119730a;
                String str4 = (String) cVarB.v(descriptor2, 2, z1Var, null);
                String str5 = (String) cVarB.v(descriptor2, 3, z1Var, null);
                Image.a aVar = Image.a.f50552a;
                Image image4 = (Image) cVarB.v(descriptor2, 4, aVar, null);
                Image image5 = (Image) cVarB.v(descriptor2, 5, aVar, null);
                Image image6 = (Image) cVarB.v(descriptor2, 6, aVar, null);
                str = strT;
                dataAccessNotice = (DataAccessNotice) cVarB.v(descriptor2, 7, DataAccessNotice.a.f50507a, null);
                image = image6;
                image2 = image5;
                str3 = str5;
                financialConnectionsGenericInfoScreen = (FinancialConnectionsGenericInfoScreen) cVarB.v(descriptor2, 8, FinancialConnectionsGenericInfoScreen.a.f66767a, null);
                image3 = image4;
                str2 = str4;
                z11 = zW;
                i11 = 511;
            } else {
                boolean z12 = true;
                boolean zW2 = false;
                DataAccessNotice dataAccessNotice2 = null;
                FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen2 = null;
                Image image7 = null;
                Image image8 = null;
                String strT2 = null;
                String str6 = null;
                String str7 = null;
                int i13 = 0;
                Image image9 = null;
                while (z12) {
                    int iA = cVarB.A(descriptor2);
                    switch (iA) {
                        case -1:
                            z12 = false;
                            break;
                        case 0:
                            i13 |= 1;
                            strT2 = cVarB.t(descriptor2, 0);
                            i12 = 7;
                            break;
                        case 1:
                            zW2 = cVarB.w(descriptor2, 1);
                            i13 |= 2;
                            i12 = 7;
                            break;
                        case 2:
                            str6 = (String) cVarB.v(descriptor2, 2, z1.f119730a, str6);
                            i13 |= 4;
                            i12 = 7;
                            break;
                        case 3:
                            str7 = (String) cVarB.v(descriptor2, 3, z1.f119730a, str7);
                            i13 |= 8;
                            i12 = 7;
                            break;
                        case 4:
                            image9 = (Image) cVarB.v(descriptor2, 4, Image.a.f50552a, image9);
                            i13 |= 16;
                            i12 = 7;
                            break;
                        case 5:
                            image8 = (Image) cVarB.v(descriptor2, 5, Image.a.f50552a, image8);
                            i13 |= 32;
                            i12 = 7;
                            break;
                        case 6:
                            image7 = (Image) cVarB.v(descriptor2, 6, Image.a.f50552a, image7);
                            i13 |= 64;
                            break;
                        case 7:
                            dataAccessNotice2 = (DataAccessNotice) cVarB.v(descriptor2, i12, DataAccessNotice.a.f50507a, dataAccessNotice2);
                            i13 |= 128;
                            break;
                        case 8:
                            financialConnectionsGenericInfoScreen2 = (FinancialConnectionsGenericInfoScreen) cVarB.v(descriptor2, 8, FinancialConnectionsGenericInfoScreen.a.f66767a, financialConnectionsGenericInfoScreen2);
                            i13 |= 256;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                z11 = zW2;
                dataAccessNotice = dataAccessNotice2;
                financialConnectionsGenericInfoScreen = financialConnectionsGenericInfoScreen2;
                image = image7;
                image2 = image8;
                image3 = image9;
                i11 = i13;
                str = strT2;
                str2 = str6;
                str3 = str7;
            }
            cVarB.c(descriptor2);
            return new NetworkedAccount(i11, str, z11, str2, str3, image3, image2, image, dataAccessNotice, financialConnectionsGenericInfoScreen, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, NetworkedAccount value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            NetworkedAccount.g(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            z1 z1Var = z1.f119730a;
            ro0.d<?> dVarP = so0.a.p(z1Var);
            ro0.d<?> dVarP2 = so0.a.p(z1Var);
            Image.a aVar = Image.a.f50552a;
            return new ro0.d[]{z1Var, vo0.h.f119620a, dVarP, dVarP2, so0.a.p(aVar), so0.a.p(aVar), so0.a.p(aVar), so0.a.p(DataAccessNotice.a.f50507a), so0.a.p(FinancialConnectionsGenericInfoScreen.a.f66767a)};
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

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.x$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/x$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/x;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<NetworkedAccount> serializer() {
            return a.f50587a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.x$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<NetworkedAccount> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkedAccount createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new NetworkedAccount(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DataAccessNotice.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FinancialConnectionsGenericInfoScreen.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NetworkedAccount[] newArray(int i11) {
            return new NetworkedAccount[i11];
        }
    }

    @jn0.e
    public /* synthetic */ NetworkedAccount(int i11, @ro0.o("id") String str, @ro0.o("allow_selection") boolean z11, @ro0.o("caption") String str2, @ro0.o("selection_cta") String str3, @ro0.o("icon") Image image, @ro0.o("selection_cta_icon") Image image2, @ro0.o("account_icon") Image image3, @ro0.o("data_access_notice") DataAccessNotice dataAccessNotice, @ro0.o("drawer_on_selection") FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen, v1 v1Var) {
        if (3 != (i11 & 3)) {
            h1.b(i11, 3, a.f50587a.getDescriptor());
        }
        this.id = str;
        this.allowSelection = z11;
        if ((i11 & 4) == 0) {
            this.caption = null;
        } else {
            this.caption = str2;
        }
        if ((i11 & 8) == 0) {
            this.selectionCta = null;
        } else {
            this.selectionCta = str3;
        }
        if ((i11 & 16) == 0) {
            this.icon = null;
        } else {
            this.icon = image;
        }
        if ((i11 & 32) == 0) {
            this.selectionCtaIcon = null;
        } else {
            this.selectionCtaIcon = image2;
        }
        if ((i11 & 64) == 0) {
            this.accountIcon = null;
        } else {
            this.accountIcon = image3;
        }
        if ((i11 & 128) == 0) {
            this.dataAccessNotice = null;
        } else {
            this.dataAccessNotice = dataAccessNotice;
        }
        if ((i11 & 256) == 0) {
            this.drawerOnSelection = null;
        } else {
            this.drawerOnSelection = financialConnectionsGenericInfoScreen;
        }
    }

    public static final /* synthetic */ void g(NetworkedAccount self, uo0.d output, to0.f serialDesc) {
        output.e(serialDesc, 0, self.id);
        output.A(serialDesc, 1, self.allowSelection);
        if (output.G(serialDesc, 2) || self.caption != null) {
            output.y(serialDesc, 2, z1.f119730a, self.caption);
        }
        if (output.G(serialDesc, 3) || self.selectionCta != null) {
            output.y(serialDesc, 3, z1.f119730a, self.selectionCta);
        }
        if (output.G(serialDesc, 4) || self.icon != null) {
            output.y(serialDesc, 4, Image.a.f50552a, self.icon);
        }
        if (output.G(serialDesc, 5) || self.selectionCtaIcon != null) {
            output.y(serialDesc, 5, Image.a.f50552a, self.selectionCtaIcon);
        }
        if (output.G(serialDesc, 6) || self.accountIcon != null) {
            output.y(serialDesc, 6, Image.a.f50552a, self.accountIcon);
        }
        if (output.G(serialDesc, 7) || self.dataAccessNotice != null) {
            output.y(serialDesc, 7, DataAccessNotice.a.f50507a, self.dataAccessNotice);
        }
        if (!output.G(serialDesc, 8) && self.drawerOnSelection == null) {
            return;
        }
        output.y(serialDesc, 8, FinancialConnectionsGenericInfoScreen.a.f66767a, self.drawerOnSelection);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Image getAccountIcon() {
        return this.accountIcon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAllowSelection() {
        return this.allowSelection;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final DataAccessNotice getDataAccessNotice() {
        return this.dataAccessNotice;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final FinancialConnectionsGenericInfoScreen getDrawerOnSelection() {
        return this.drawerOnSelection;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkedAccount)) {
            return false;
        }
        NetworkedAccount networkedAccount = (NetworkedAccount) other;
        return p013kotlin.jvm.internal.s.f(this.id, networkedAccount.id) && this.allowSelection == networkedAccount.allowSelection && p013kotlin.jvm.internal.s.f(this.caption, networkedAccount.caption) && p013kotlin.jvm.internal.s.f(this.selectionCta, networkedAccount.selectionCta) && p013kotlin.jvm.internal.s.f(this.icon, networkedAccount.icon) && p013kotlin.jvm.internal.s.f(this.selectionCtaIcon, networkedAccount.selectionCtaIcon) && p013kotlin.jvm.internal.s.f(this.accountIcon, networkedAccount.accountIcon) && p013kotlin.jvm.internal.s.f(this.dataAccessNotice, networkedAccount.dataAccessNotice) && p013kotlin.jvm.internal.s.f(this.drawerOnSelection, networkedAccount.drawerOnSelection);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSelectionCta() {
        return this.selectionCta;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + Boolean.hashCode(this.allowSelection)) * 31;
        String str = this.caption;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.selectionCta;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.icon;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.selectionCtaIcon;
        int iHashCode5 = (iHashCode4 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Image image3 = this.accountIcon;
        int iHashCode6 = (iHashCode5 + (image3 == null ? 0 : image3.hashCode())) * 31;
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        int iHashCode7 = (iHashCode6 + (dataAccessNotice == null ? 0 : dataAccessNotice.hashCode())) * 31;
        FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen = this.drawerOnSelection;
        return iHashCode7 + (financialConnectionsGenericInfoScreen != null ? financialConnectionsGenericInfoScreen.hashCode() : 0);
    }

    public String toString() {
        return "NetworkedAccount(id=" + this.id + ", allowSelection=" + this.allowSelection + ", caption=" + this.caption + ", selectionCta=" + this.selectionCta + ", icon=" + this.icon + ", selectionCtaIcon=" + this.selectionCtaIcon + ", accountIcon=" + this.accountIcon + ", dataAccessNotice=" + this.dataAccessNotice + ", drawerOnSelection=" + this.drawerOnSelection + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeInt(this.allowSelection ? 1 : 0);
        parcel.writeString(this.caption);
        parcel.writeString(this.selectionCta);
        Image image = this.icon;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image.writeToParcel(parcel, flags);
        }
        Image image2 = this.selectionCtaIcon;
        if (image2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image2.writeToParcel(parcel, flags);
        }
        Image image3 = this.accountIcon;
        if (image3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image3.writeToParcel(parcel, flags);
        }
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        if (dataAccessNotice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dataAccessNotice.writeToParcel(parcel, flags);
        }
        FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen = this.drawerOnSelection;
        if (financialConnectionsGenericInfoScreen == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            financialConnectionsGenericInfoScreen.writeToParcel(parcel, flags);
        }
    }

    public NetworkedAccount(String id2, boolean z11, String str, String str2, Image image, Image image2, Image image3, DataAccessNotice dataAccessNotice, FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        this.id = id2;
        this.allowSelection = z11;
        this.caption = str;
        this.selectionCta = str2;
        this.icon = image;
        this.selectionCtaIcon = image2;
        this.accountIcon = image3;
        this.dataAccessNotice = dataAccessNotice;
        this.drawerOnSelection = financialConnectionsGenericInfoScreen;
    }
}
