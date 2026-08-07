package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.g0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0081\b\u0018\u0000 @2\u00020\u0001:\u0002+0BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBi\b\u0011\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÁ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010)\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010,\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010\u001dR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u0010/\u001a\u0004\b5\u00106R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00108\u0012\u0004\b:\u0010/\u001a\u0004\b3\u00109R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010,\u0012\u0004\b;\u0010/\u001a\u0004\b0\u0010\u001dR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b?\u0010/\u001a\u0004\b<\u0010>¨\u0006A"}, d2 = {"Lcom/stripe/android/financialconnections/model/g0;", "Landroid/os/Parcelable;", "", "title", "defaultCta", "Lcom/stripe/android/financialconnections/model/b;", "addNewAccount", "", "Lcom/stripe/android/financialconnections/model/x;", "accounts", "aboveCta", "Lcom/stripe/android/financialconnections/model/l;", "multipleAccountTypesSelectedDataAccessNotice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/b;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/l;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/b;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/l;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "h", "(Lcom/stripe/android/financialconnections/model/g0;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "g", "getTitle$annotations", "()V", "b", "e", "getDefaultCta$annotations", "c", "Lcom/stripe/android/financialconnections/model/b;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/financialconnections/model/b;", "getAddNewAccount$annotations", "Ljava/util/List;", "()Ljava/util/List;", "getAccounts$annotations", "getAboveCta$annotations", "f", "Lcom/stripe/android/financialconnections/model/l;", "()Lcom/stripe/android/financialconnections/model/l;", "getMultipleAccountTypesSelectedDataAccessNotice$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class ReturningNetworkingUserAccountPicker implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String defaultCta;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddNewAccount addNewAccount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<NetworkedAccount> accounts;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String aboveCta;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final DataAccessNotice multipleAccountTypesSelectedDataAccessNotice;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f50455g = 8;
    public static final Parcelable.Creator<ReturningNetworkingUserAccountPicker> CREATOR = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ro0.d<Object>[] f50456h = {null, null, null, new vo0.e(NetworkedAccount.a.f50587a), null, null};

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.g0$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/g0;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/g0;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/g0;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<ReturningNetworkingUserAccountPicker> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50463a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50463a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.ReturningNetworkingUserAccountPicker", aVar, 6);
            m1Var.o("title", false);
            m1Var.o("default_cta", false);
            m1Var.o("add_new_account", false);
            m1Var.o("accounts", false);
            m1Var.o("above_cta", true);
            m1Var.o("multiple_account_types_selected_data_access_notice", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ReturningNetworkingUserAccountPicker deserialize(uo0.e decoder) {
            int i11;
            String str;
            String str2;
            AddNewAccount addNewAccount;
            List list;
            String str3;
            DataAccessNotice dataAccessNotice;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = ReturningNetworkingUserAccountPicker.f50456h;
            String strT = null;
            if (cVarB.i()) {
                String strT2 = cVarB.t(descriptor2, 0);
                String strT3 = cVarB.t(descriptor2, 1);
                AddNewAccount addNewAccount2 = (AddNewAccount) cVarB.n(descriptor2, 2, AddNewAccount.a.f50393a, null);
                List list2 = (List) cVarB.n(descriptor2, 3, dVarArr[3], null);
                String str4 = (String) cVarB.v(descriptor2, 4, n50.d.f93345a, null);
                list = list2;
                str = strT2;
                dataAccessNotice = (DataAccessNotice) cVarB.v(descriptor2, 5, DataAccessNotice.a.f50507a, null);
                str3 = str4;
                addNewAccount = addNewAccount2;
                i11 = 63;
                str2 = strT3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                String strT4 = null;
                AddNewAccount addNewAccount3 = null;
                List list3 = null;
                String str5 = null;
                DataAccessNotice dataAccessNotice2 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    switch (iA) {
                        case -1:
                            z11 = false;
                            continue;
                        case 0:
                            strT = cVarB.t(descriptor2, 0);
                            i12 |= 1;
                            continue;
                        case 1:
                            strT4 = cVarB.t(descriptor2, 1);
                            i12 |= 2;
                            break;
                        case 2:
                            addNewAccount3 = (AddNewAccount) cVarB.n(descriptor2, 2, AddNewAccount.a.f50393a, addNewAccount3);
                            i12 |= 4;
                            break;
                        case 3:
                            list3 = (List) cVarB.n(descriptor2, 3, dVarArr[3], list3);
                            i12 |= 8;
                            break;
                        case 4:
                            str5 = (String) cVarB.v(descriptor2, 4, n50.d.f93345a, str5);
                            i12 |= 16;
                            break;
                        case 5:
                            dataAccessNotice2 = (DataAccessNotice) cVarB.v(descriptor2, 5, DataAccessNotice.a.f50507a, dataAccessNotice2);
                            i12 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                i11 = i12;
                str = strT;
                str2 = strT4;
                addNewAccount = addNewAccount3;
                list = list3;
                str3 = str5;
                dataAccessNotice = dataAccessNotice2;
            }
            cVarB.c(descriptor2);
            return new ReturningNetworkingUserAccountPicker(i11, str, str2, addNewAccount, list, str3, dataAccessNotice, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, ReturningNetworkingUserAccountPicker value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            ReturningNetworkingUserAccountPicker.h(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            ro0.d<?> dVar = ReturningNetworkingUserAccountPicker.f50456h[3];
            ro0.d<?> dVarP = so0.a.p(n50.d.f93345a);
            ro0.d<?> dVarP2 = so0.a.p(DataAccessNotice.a.f50507a);
            z1 z1Var = z1.f119730a;
            return new ro0.d[]{z1Var, z1Var, AddNewAccount.a.f50393a, dVar, dVarP, dVarP2};
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

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.g0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/g0$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/g0;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<ReturningNetworkingUserAccountPicker> serializer() {
            return a.f50463a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.g0$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<ReturningNetworkingUserAccountPicker> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReturningNetworkingUserAccountPicker createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            AddNewAccount addNewAccountCreateFromParcel = AddNewAccount.CREATOR.createFromParcel(parcel);
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(NetworkedAccount.CREATOR.createFromParcel(parcel));
            }
            return new ReturningNetworkingUserAccountPicker(string, string2, addNewAccountCreateFromParcel, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : DataAccessNotice.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ReturningNetworkingUserAccountPicker[] newArray(int i11) {
            return new ReturningNetworkingUserAccountPicker[i11];
        }
    }

    @jn0.e
    public /* synthetic */ ReturningNetworkingUserAccountPicker(int i11, @ro0.o("title") String str, @ro0.o("default_cta") String str2, @ro0.o("add_new_account") AddNewAccount addNewAccount, @ro0.o("accounts") List list, @ro0.o("above_cta") @ro0.p(with = n50.d.class) String str3, @ro0.o("multiple_account_types_selected_data_access_notice") DataAccessNotice dataAccessNotice, v1 v1Var) {
        if (15 != (i11 & 15)) {
            h1.b(i11, 15, a.f50463a.getDescriptor());
        }
        this.title = str;
        this.defaultCta = str2;
        this.addNewAccount = addNewAccount;
        this.accounts = list;
        if ((i11 & 16) == 0) {
            this.aboveCta = null;
        } else {
            this.aboveCta = str3;
        }
        if ((i11 & 32) == 0) {
            this.multipleAccountTypesSelectedDataAccessNotice = null;
        } else {
            this.multipleAccountTypesSelectedDataAccessNotice = dataAccessNotice;
        }
    }

    public static final /* synthetic */ void h(ReturningNetworkingUserAccountPicker self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f50456h;
        output.e(serialDesc, 0, self.title);
        output.e(serialDesc, 1, self.defaultCta);
        output.D(serialDesc, 2, AddNewAccount.a.f50393a, self.addNewAccount);
        output.D(serialDesc, 3, dVarArr[3], self.accounts);
        if (output.G(serialDesc, 4) || self.aboveCta != null) {
            output.y(serialDesc, 4, n50.d.f93345a, self.aboveCta);
        }
        if (!output.G(serialDesc, 5) && self.multipleAccountTypesSelectedDataAccessNotice == null) {
            return;
        }
        output.y(serialDesc, 5, DataAccessNotice.a.f50507a, self.multipleAccountTypesSelectedDataAccessNotice);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAboveCta() {
        return this.aboveCta;
    }

    public final List<NetworkedAccount> c() {
        return this.accounts;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AddNewAccount getAddNewAccount() {
        return this.addNewAccount;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDefaultCta() {
        return this.defaultCta;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturningNetworkingUserAccountPicker)) {
            return false;
        }
        ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker = (ReturningNetworkingUserAccountPicker) other;
        return p013kotlin.jvm.internal.s.f(this.title, returningNetworkingUserAccountPicker.title) && p013kotlin.jvm.internal.s.f(this.defaultCta, returningNetworkingUserAccountPicker.defaultCta) && p013kotlin.jvm.internal.s.f(this.addNewAccount, returningNetworkingUserAccountPicker.addNewAccount) && p013kotlin.jvm.internal.s.f(this.accounts, returningNetworkingUserAccountPicker.accounts) && p013kotlin.jvm.internal.s.f(this.aboveCta, returningNetworkingUserAccountPicker.aboveCta) && p013kotlin.jvm.internal.s.f(this.multipleAccountTypesSelectedDataAccessNotice, returningNetworkingUserAccountPicker.multipleAccountTypesSelectedDataAccessNotice);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final DataAccessNotice getMultipleAccountTypesSelectedDataAccessNotice() {
        return this.multipleAccountTypesSelectedDataAccessNotice;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((this.title.hashCode() * 31) + this.defaultCta.hashCode()) * 31) + this.addNewAccount.hashCode()) * 31) + this.accounts.hashCode()) * 31;
        String str = this.aboveCta;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DataAccessNotice dataAccessNotice = this.multipleAccountTypesSelectedDataAccessNotice;
        return iHashCode2 + (dataAccessNotice != null ? dataAccessNotice.hashCode() : 0);
    }

    public String toString() {
        return "ReturningNetworkingUserAccountPicker(title=" + this.title + ", defaultCta=" + this.defaultCta + ", addNewAccount=" + this.addNewAccount + ", accounts=" + this.accounts + ", aboveCta=" + this.aboveCta + ", multipleAccountTypesSelectedDataAccessNotice=" + this.multipleAccountTypesSelectedDataAccessNotice + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.title);
        parcel.writeString(this.defaultCta);
        this.addNewAccount.writeToParcel(parcel, flags);
        List<NetworkedAccount> list = this.accounts;
        parcel.writeInt(list.size());
        Iterator<NetworkedAccount> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        parcel.writeString(this.aboveCta);
        DataAccessNotice dataAccessNotice = this.multipleAccountTypesSelectedDataAccessNotice;
        if (dataAccessNotice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dataAccessNotice.writeToParcel(parcel, flags);
        }
    }

    public ReturningNetworkingUserAccountPicker(String title, String defaultCta, AddNewAccount addNewAccount, List<NetworkedAccount> accounts, String str, DataAccessNotice dataAccessNotice) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(defaultCta, "defaultCta");
        p013kotlin.jvm.internal.s.k(addNewAccount, "addNewAccount");
        p013kotlin.jvm.internal.s.k(accounts, "accounts");
        this.title = title;
        this.defaultCta = defaultCta;
        this.addNewAccount = addNewAccount;
        this.accounts = accounts;
        this.aboveCta = str;
        this.multipleAccountTypesSelectedDataAccessNotice = dataAccessNotice;
    }
}
