package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.m1;
import vo0.v1;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.l0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\b\u0081\b\u0018\u0000 L2\u00020\u0001:\u0002/4B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bo\b\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J(\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aHÁ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b)\u0010#J \u0010-\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b-\u0010.R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b2\u00103\u001a\u0004\b/\u00101R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b7\u00103\u001a\u0004\b4\u00106R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b;\u00103\u001a\u0004\b8\u0010:R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b?\u00103\u001a\u0004\b<\u0010>R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bC\u00103\u001a\u0004\b@\u0010BR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bG\u00103\u001a\u0004\bD\u0010FR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bH\u0010I\u0012\u0004\bK\u00103\u001a\u0004\bH\u0010J¨\u0006M"}, d2 = {"Lcom/stripe/android/financialconnections/model/l0;", "Landroid/os/Parcelable;", "Lcom/stripe/android/financialconnections/model/a;", "accountPicker", "Lcom/stripe/android/financialconnections/model/h;", "consent", "Lcom/stripe/android/financialconnections/model/v;", "linkLoginPane", "Lcom/stripe/android/financialconnections/model/a0;", "networkingLinkSignupPane", "Lcom/stripe/android/financialconnections/model/b0;", "oauthPrepane", "Lcom/stripe/android/financialconnections/model/g0;", "returningNetworkingUserAccountPicker", "Lcom/stripe/android/financialconnections/model/j0;", "successPane", "<init>", "(Lcom/stripe/android/financialconnections/model/a;Lcom/stripe/android/financialconnections/model/h;Lcom/stripe/android/financialconnections/model/v;Lcom/stripe/android/financialconnections/model/a0;Lcom/stripe/android/financialconnections/model/b0;Lcom/stripe/android/financialconnections/model/g0;Lcom/stripe/android/financialconnections/model/j0;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/a;Lcom/stripe/android/financialconnections/model/h;Lcom/stripe/android/financialconnections/model/v;Lcom/stripe/android/financialconnections/model/a0;Lcom/stripe/android/financialconnections/model/b0;Lcom/stripe/android/financialconnections/model/g0;Lcom/stripe/android/financialconnections/model/j0;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "h", "(Lcom/stripe/android/financialconnections/model/l0;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/financialconnections/model/a;", "()Lcom/stripe/android/financialconnections/model/a;", "getAccountPicker$annotations", "()V", "b", "Lcom/stripe/android/financialconnections/model/h;", "()Lcom/stripe/android/financialconnections/model/h;", "getConsent$annotations", "c", "Lcom/stripe/android/financialconnections/model/v;", "()Lcom/stripe/android/financialconnections/model/v;", "getLinkLoginPane$annotations", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/financialconnections/model/a0;", "()Lcom/stripe/android/financialconnections/model/a0;", "getNetworkingLinkSignupPane$annotations", "e", "Lcom/stripe/android/financialconnections/model/b0;", "()Lcom/stripe/android/financialconnections/model/b0;", "getOauthPrepane$annotations", "f", "Lcom/stripe/android/financialconnections/model/g0;", "()Lcom/stripe/android/financialconnections/model/g0;", "getReturningNetworkingUserAccountPicker$annotations", "g", "Lcom/stripe/android/financialconnections/model/j0;", "()Lcom/stripe/android/financialconnections/model/j0;", "getSuccessPane$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class TextUpdate implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AccountPickerPane accountPicker;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ConsentPane consent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LinkLoginPane linkLoginPane;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final NetworkingLinkSignupPane networkingLinkSignupPane;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final OauthPrepane oauthPrepane;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final SuccessPane successPane;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f50508h = 8;
    public static final Parcelable.Creator<TextUpdate> CREATOR = new c();

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.l0$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/TextUpdate.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/l0;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/l0;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/l0;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<TextUpdate> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50516a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50516a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.TextUpdate", aVar, 7);
            m1Var.o("account_picker_pane", true);
            m1Var.o("consent_pane", true);
            m1Var.o("link_login_pane", true);
            m1Var.o("networking_link_signup_pane", true);
            m1Var.o("oauth_prepane", true);
            m1Var.o("returning_networking_user_account_picker", true);
            m1Var.o("success_pane", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TextUpdate deserialize(uo0.e decoder) {
            int i11;
            SuccessPane j0Var;
            AccountPickerPane aVar;
            ConsentPane hVar;
            LinkLoginPane vVar;
            NetworkingLinkSignupPane a0Var;
            OauthPrepane b0Var;
            ReturningNetworkingUserAccountPicker g0Var;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            int i12 = 6;
            AccountPickerPane aVar2 = null;
            if (cVarB.i()) {
                AccountPickerPane aVar3 = (AccountPickerPane) cVarB.v(descriptor2, 0, AccountPickerPane.C0830a.f50382a, null);
                ConsentPane hVar2 = (ConsentPane) cVarB.v(descriptor2, 1, ConsentPane.a.f50472a, null);
                LinkLoginPane vVar2 = (LinkLoginPane) cVarB.v(descriptor2, 2, LinkLoginPane.a.f50574a, null);
                NetworkingLinkSignupPane a0Var2 = (NetworkingLinkSignupPane) cVarB.v(descriptor2, 3, NetworkingLinkSignupPane.a.f50390a, null);
                OauthPrepane b0Var2 = (OauthPrepane) cVarB.v(descriptor2, 4, OauthPrepane.a.f50402a, null);
                ReturningNetworkingUserAccountPicker g0Var2 = (ReturningNetworkingUserAccountPicker) cVarB.v(descriptor2, 5, ReturningNetworkingUserAccountPicker.a.f50463a, null);
                aVar = aVar3;
                j0Var = (SuccessPane) cVarB.v(descriptor2, 6, SuccessPane.a.f50490a, null);
                g0Var = g0Var2;
                a0Var = a0Var2;
                b0Var = b0Var2;
                vVar = vVar2;
                hVar = hVar2;
                i11 = 127;
            } else {
                boolean z11 = true;
                int i13 = 0;
                SuccessPane j0Var2 = null;
                ConsentPane hVar3 = null;
                LinkLoginPane vVar3 = null;
                NetworkingLinkSignupPane a0Var3 = null;
                OauthPrepane b0Var3 = null;
                ReturningNetworkingUserAccountPicker g0Var3 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    switch (iA) {
                        case -1:
                            z11 = false;
                            i12 = 6;
                            break;
                        case 0:
                            aVar2 = (AccountPickerPane) cVarB.v(descriptor2, 0, AccountPickerPane.C0830a.f50382a, aVar2);
                            i13 |= 1;
                            i12 = 6;
                            break;
                        case 1:
                            hVar3 = (ConsentPane) cVarB.v(descriptor2, 1, ConsentPane.a.f50472a, hVar3);
                            i13 |= 2;
                            i12 = 6;
                            break;
                        case 2:
                            vVar3 = (LinkLoginPane) cVarB.v(descriptor2, 2, LinkLoginPane.a.f50574a, vVar3);
                            i13 |= 4;
                            break;
                        case 3:
                            a0Var3 = (NetworkingLinkSignupPane) cVarB.v(descriptor2, 3, NetworkingLinkSignupPane.a.f50390a, a0Var3);
                            i13 |= 8;
                            break;
                        case 4:
                            b0Var3 = (OauthPrepane) cVarB.v(descriptor2, 4, OauthPrepane.a.f50402a, b0Var3);
                            i13 |= 16;
                            break;
                        case 5:
                            g0Var3 = (ReturningNetworkingUserAccountPicker) cVarB.v(descriptor2, 5, ReturningNetworkingUserAccountPicker.a.f50463a, g0Var3);
                            i13 |= 32;
                            break;
                        case 6:
                            j0Var2 = (SuccessPane) cVarB.v(descriptor2, i12, SuccessPane.a.f50490a, j0Var2);
                            i13 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                i11 = i13;
                j0Var = j0Var2;
                aVar = aVar2;
                hVar = hVar3;
                vVar = vVar3;
                a0Var = a0Var3;
                b0Var = b0Var3;
                g0Var = g0Var3;
            }
            cVarB.c(descriptor2);
            return new TextUpdate(i11, aVar, hVar, vVar, a0Var, b0Var, g0Var, j0Var, (v1) null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, TextUpdate value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            TextUpdate.h(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            return new ro0.d[]{so0.a.p(AccountPickerPane.C0830a.f50382a), so0.a.p(ConsentPane.a.f50472a), so0.a.p(LinkLoginPane.a.f50574a), so0.a.p(NetworkingLinkSignupPane.a.f50390a), so0.a.p(OauthPrepane.a.f50402a), so0.a.p(ReturningNetworkingUserAccountPicker.a.f50463a), so0.a.p(SuccessPane.a.f50490a)};
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

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.l0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/l0$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/l0;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<TextUpdate> serializer() {
            return a.f50516a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.l0$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<TextUpdate> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextUpdate createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new TextUpdate(parcel.readInt() == 0 ? null : AccountPickerPane.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ConsentPane.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LinkLoginPane.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : NetworkingLinkSignupPane.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OauthPrepane.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ReturningNetworkingUserAccountPicker.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuccessPane.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TextUpdate[] newArray(int i11) {
            return new TextUpdate[i11];
        }
    }

    public TextUpdate() {
        this((AccountPickerPane) null, (ConsentPane) null, (LinkLoginPane) null, (NetworkingLinkSignupPane) null, (OauthPrepane) null, (ReturningNetworkingUserAccountPicker) null, (SuccessPane) null, 127, (DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ void h(TextUpdate self, uo0.d output, to0.f serialDesc) {
        if (output.G(serialDesc, 0) || self.accountPicker != null) {
            output.y(serialDesc, 0, AccountPickerPane.C0830a.f50382a, self.accountPicker);
        }
        if (output.G(serialDesc, 1) || self.consent != null) {
            output.y(serialDesc, 1, ConsentPane.a.f50472a, self.consent);
        }
        if (output.G(serialDesc, 2) || self.linkLoginPane != null) {
            output.y(serialDesc, 2, LinkLoginPane.a.f50574a, self.linkLoginPane);
        }
        if (output.G(serialDesc, 3) || self.networkingLinkSignupPane != null) {
            output.y(serialDesc, 3, NetworkingLinkSignupPane.a.f50390a, self.networkingLinkSignupPane);
        }
        if (output.G(serialDesc, 4) || self.oauthPrepane != null) {
            output.y(serialDesc, 4, OauthPrepane.a.f50402a, self.oauthPrepane);
        }
        if (output.G(serialDesc, 5) || self.returningNetworkingUserAccountPicker != null) {
            output.y(serialDesc, 5, ReturningNetworkingUserAccountPicker.a.f50463a, self.returningNetworkingUserAccountPicker);
        }
        if (!output.G(serialDesc, 6) && self.successPane == null) {
            return;
        }
        output.y(serialDesc, 6, SuccessPane.a.f50490a, self.successPane);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AccountPickerPane getAccountPicker() {
        return this.accountPicker;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ConsentPane getConsent() {
        return this.consent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LinkLoginPane getLinkLoginPane() {
        return this.linkLoginPane;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final NetworkingLinkSignupPane getNetworkingLinkSignupPane() {
        return this.networkingLinkSignupPane;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final OauthPrepane getOauthPrepane() {
        return this.oauthPrepane;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextUpdate)) {
            return false;
        }
        TextUpdate textUpdate = (TextUpdate) other;
        return p013kotlin.jvm.internal.s.f(this.accountPicker, textUpdate.accountPicker) && p013kotlin.jvm.internal.s.f(this.consent, textUpdate.consent) && p013kotlin.jvm.internal.s.f(this.linkLoginPane, textUpdate.linkLoginPane) && p013kotlin.jvm.internal.s.f(this.networkingLinkSignupPane, textUpdate.networkingLinkSignupPane) && p013kotlin.jvm.internal.s.f(this.oauthPrepane, textUpdate.oauthPrepane) && p013kotlin.jvm.internal.s.f(this.returningNetworkingUserAccountPicker, textUpdate.returningNetworkingUserAccountPicker) && p013kotlin.jvm.internal.s.f(this.successPane, textUpdate.successPane);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ReturningNetworkingUserAccountPicker getReturningNetworkingUserAccountPicker() {
        return this.returningNetworkingUserAccountPicker;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final SuccessPane getSuccessPane() {
        return this.successPane;
    }

    public int hashCode() {
        AccountPickerPane aVar = this.accountPicker;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        ConsentPane hVar = this.consent;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        LinkLoginPane vVar = this.linkLoginPane;
        int iHashCode3 = (iHashCode2 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        NetworkingLinkSignupPane a0Var = this.networkingLinkSignupPane;
        int iHashCode4 = (iHashCode3 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        OauthPrepane b0Var = this.oauthPrepane;
        int iHashCode5 = (iHashCode4 + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        ReturningNetworkingUserAccountPicker g0Var = this.returningNetworkingUserAccountPicker;
        int iHashCode6 = (iHashCode5 + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        SuccessPane j0Var = this.successPane;
        return iHashCode6 + (j0Var != null ? j0Var.hashCode() : 0);
    }

    public String toString() {
        return "TextUpdate(accountPicker=" + this.accountPicker + ", consent=" + this.consent + ", linkLoginPane=" + this.linkLoginPane + ", networkingLinkSignupPane=" + this.networkingLinkSignupPane + ", oauthPrepane=" + this.oauthPrepane + ", returningNetworkingUserAccountPicker=" + this.returningNetworkingUserAccountPicker + ", successPane=" + this.successPane + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        AccountPickerPane aVar = this.accountPicker;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, flags);
        }
        ConsentPane hVar = this.consent;
        if (hVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hVar.writeToParcel(parcel, flags);
        }
        LinkLoginPane vVar = this.linkLoginPane;
        if (vVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vVar.writeToParcel(parcel, flags);
        }
        NetworkingLinkSignupPane a0Var = this.networkingLinkSignupPane;
        if (a0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            a0Var.writeToParcel(parcel, flags);
        }
        OauthPrepane b0Var = this.oauthPrepane;
        if (b0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            b0Var.writeToParcel(parcel, flags);
        }
        ReturningNetworkingUserAccountPicker g0Var = this.returningNetworkingUserAccountPicker;
        if (g0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            g0Var.writeToParcel(parcel, flags);
        }
        SuccessPane j0Var = this.successPane;
        if (j0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            j0Var.writeToParcel(parcel, flags);
        }
    }

    @jn0.e
    public /* synthetic */ TextUpdate(int i11, @ro0.o("account_picker_pane") AccountPickerPane aVar, @ro0.o("consent_pane") ConsentPane hVar, @ro0.o("link_login_pane") LinkLoginPane vVar, @ro0.o("networking_link_signup_pane") NetworkingLinkSignupPane a0Var, @ro0.o("oauth_prepane") OauthPrepane b0Var, @ro0.o("returning_networking_user_account_picker") ReturningNetworkingUserAccountPicker g0Var, @ro0.o("success_pane") SuccessPane j0Var, v1 v1Var) {
        if ((i11 & 1) == 0) {
            this.accountPicker = null;
        } else {
            this.accountPicker = aVar;
        }
        if ((i11 & 2) == 0) {
            this.consent = null;
        } else {
            this.consent = hVar;
        }
        if ((i11 & 4) == 0) {
            this.linkLoginPane = null;
        } else {
            this.linkLoginPane = vVar;
        }
        if ((i11 & 8) == 0) {
            this.networkingLinkSignupPane = null;
        } else {
            this.networkingLinkSignupPane = a0Var;
        }
        if ((i11 & 16) == 0) {
            this.oauthPrepane = null;
        } else {
            this.oauthPrepane = b0Var;
        }
        if ((i11 & 32) == 0) {
            this.returningNetworkingUserAccountPicker = null;
        } else {
            this.returningNetworkingUserAccountPicker = g0Var;
        }
        if ((i11 & 64) == 0) {
            this.successPane = null;
        } else {
            this.successPane = j0Var;
        }
    }

    public TextUpdate(AccountPickerPane aVar, ConsentPane hVar, LinkLoginPane vVar, NetworkingLinkSignupPane a0Var, OauthPrepane b0Var, ReturningNetworkingUserAccountPicker g0Var, SuccessPane j0Var) {
        this.accountPicker = aVar;
        this.consent = hVar;
        this.linkLoginPane = vVar;
        this.networkingLinkSignupPane = a0Var;
        this.oauthPrepane = b0Var;
        this.returningNetworkingUserAccountPicker = g0Var;
        this.successPane = j0Var;
    }

    public /* synthetic */ TextUpdate(AccountPickerPane aVar, ConsentPane hVar, LinkLoginPane vVar, NetworkingLinkSignupPane a0Var, OauthPrepane b0Var, ReturningNetworkingUserAccountPicker g0Var, SuccessPane j0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : aVar, (i11 & 2) != 0 ? null : hVar, (i11 & 4) != 0 ? null : vVar, (i11 & 8) != 0 ? null : a0Var, (i11 & 16) != 0 ? null : b0Var, (i11 & 32) != 0 ? null : g0Var, (i11 & 64) != 0 ? null : j0Var);
    }
}
