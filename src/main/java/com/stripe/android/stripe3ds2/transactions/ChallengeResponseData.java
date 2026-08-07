package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import jn0.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import t80.q;
import t80.u;

/* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transactions.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b4\b\u0087\b\u0018\u0000 h2\u00020\u0001:\u00038;>BÏ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020*HÖ\u0001¢\u0006\u0004\b1\u0010,J \u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020*HÖ\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010)R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b<\u0010)R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b=\u0010)R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b>\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b<\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u00109\u001a\u0004\bF\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u00109\u001a\u0004\bG\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u00109\u001a\u0004\bH\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u00109\u001a\u0004\bB\u0010)R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bJ\u0010C\u001a\u0004\bK\u0010ER\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bI\u0010NR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bO\u00109\u001a\u0004\bJ\u0010)R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bP\u00109\u001a\u0004\bL\u0010)R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bO\u0010SR\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bT\u0010M\u001a\u0004\bU\u0010NR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u00109\u001a\u0004\bV\u0010)R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bW\u00109\u001a\u0004\bX\u0010)R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bY\u00109\u001a\u0004\bZ\u0010)R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b[\u00109\u001a\u0004\bW\u0010)R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\\\u0010R\u001a\u0004\bY\u0010SR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b]\u00109\u001a\u0004\b\\\u0010)R\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b:\u0010^\u001a\u0004\b]\u0010_R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u00109\u001a\u0004\b`\u0010)R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b`\u00109\u001a\u0004\ba\u0010)R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bb\u00109\u001a\u0004\bc\u0010)R\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b@\u00109\u001a\u0004\bd\u0010)R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\be\u00109\u001a\u0004\bb\u0010)R\u0014\u0010g\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bf\u0010E¨\u0006i"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/b;", "Landroid/os/Parcelable;", "", "serverTransId", "acsTransId", "acsHtml", "acsHtmlRefresh", "Lcom/stripe/android/stripe3ds2/transactions/d;", "uiType", "", "isChallengeCompleted", "challengeInfoHeader", "challengeInfoLabel", "challengeInfoText", "challengeAdditionalInfoText", "shouldShowChallengeInfoTextIndicator", "", "Lcom/stripe/android/stripe3ds2/transactions/b$a;", "challengeSelectOptions", "expandInfoLabel", "expandInfoText", "Lcom/stripe/android/stripe3ds2/transactions/b$d;", "issuerImage", "Lcom/stripe/android/stripe3ds2/transactions/c;", "messageExtensions", "messageVersion", "oobAppUrl", "oobAppLabel", "oobContinueLabel", "paymentSystemImage", "resendInformationLabel", "Lt80/q;", "sdkTransId", "submitAuthenticationLabel", "whitelistingInfoText", "whyInfoLabel", "whyInfoText", "transStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/d;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/b$d;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/b$d;Ljava/lang/String;Lt80/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "w", "b", "e", "c", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/stripe3ds2/transactions/d;", "A", "()Lcom/stripe/android/stripe3ds2/transactions/d;", "f", "Z", "G", "()Z", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "x", "l", "Ljava/util/List;", "()Ljava/util/List;", "m", "n", "o", "Lcom/stripe/android/stripe3ds2/transactions/b$d;", "()Lcom/stripe/android/stripe3ds2/transactions/b$d;", "p", "getMessageExtensions", "q", "r", "getOobAppUrl", "s", "getOobAppLabel", "t", "u", "v", "Lt80/q;", "()Lt80/q;", "y", "D", "z", "E", Gender.FEMALE, "B", "K", "isValidForUi", "C", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ChallengeResponseData implements Parcelable {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ChallengeResponseData> CREATOR = new c();
    private static final List<String> D = v.p("Y", Gender.NONE);
    private static final Set<String> E = d1.i("threeDSServerTransID", "acsCounterAtoS", "acsTransID", "challengeCompletionInd", "messageExtension", "messageType", "messageVersion", "sdkTransID", "transStatus");

    /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
    private final String whyInfoText;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
    private final String transStatus;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String serverTransId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String acsTransId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String acsHtml;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String acsHtmlRefresh;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final d uiType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isChallengeCompleted;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String challengeInfoHeader;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String challengeInfoLabel;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String challengeInfoText;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String challengeAdditionalInfoText;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldShowChallengeInfoTextIndicator;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ChallengeSelectOption> challengeSelectOptions;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String expandInfoLabel;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String expandInfoText;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final Image issuerImage;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<MessageExtension> messageExtensions;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String messageVersion;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String oobAppUrl;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final String oobAppLabel;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final String oobContinueLabel;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final Image paymentSystemImage;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final String resendInformationLabel;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final q sdkTransId;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final String submitAuthenticationLabel;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final String whitelistingInfoText;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final String whyInfoLabel;

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transactions.b$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/b$a;", "Landroid/os/Parcelable;", "", "name", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getName", "b", "getText", "c", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChallengeSelectOption implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String text;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<ChallengeSelectOption> CREATOR = new C1082b();

        /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transactions.b$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/b$a$a;", "", "<init>", "()V", "Lorg/json/JSONArray;", "challengeSelectOptionsJson", "", "Lcom/stripe/android/stripe3ds2/transactions/b$a;", "a", "(Lorg/json/JSONArray;)Ljava/util/List;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final List<ChallengeSelectOption> a(JSONArray challengeSelectOptionsJson) {
                if (challengeSelectOptionsJson == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                int length = challengeSelectOptionsJson.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObjectOptJSONObject = challengeSelectOptionsJson.optJSONObject(i11);
                    if (jSONObjectOptJSONObject != null) {
                        String next = jSONObjectOptJSONObject.keys().next();
                        String strOptString = jSONObjectOptJSONObject.optString(next);
                        s.h(next);
                        s.h(strOptString);
                        arrayList.add(new ChallengeSelectOption(next, strOptString));
                    }
                }
                return arrayList;
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transactions.b$a$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C1082b implements Parcelable.Creator<ChallengeSelectOption> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ChallengeSelectOption createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new ChallengeSelectOption(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ChallengeSelectOption[] newArray(int i11) {
                return new ChallengeSelectOption[i11];
            }
        }

        public ChallengeSelectOption(String name, String text) {
            s.k(name, "name");
            s.k(text, "text");
            this.name = name;
            this.text = text;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChallengeSelectOption)) {
                return false;
            }
            ChallengeSelectOption challengeSelectOption = (ChallengeSelectOption) other;
            return s.f(this.name, challengeSelectOption.name) && s.f(this.text, challengeSelectOption.text);
        }

        public final String getName() {
            return this.name;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.text.hashCode();
        }

        public String toString() {
            return "ChallengeSelectOption(name=" + this.name + ", text=" + this.text + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.name);
            parcel.writeString(this.text);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transactions.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\"\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\r\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bH\u0001¢\u0006\u0004\b!\u0010\u001dJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\r\u001a\u00020\bH\u0001¢\u0006\u0004\b&\u0010'J!\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0015H\u0000¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0015H\u0001¢\u0006\u0004\b+\u0010*J!\u0010,\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0015H\u0001¢\u0006\u0004\b,\u0010*J\u001f\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-2\u0006\u0010\r\u001a\u00020\bH\u0001¢\u0006\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00104\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00105\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00102R\u0014\u00106\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00102R\u0014\u00107\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00102R\u0014\u00108\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00102R\u0014\u00109\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u00102R\u0014\u0010:\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u00102R\u0014\u0010;\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u00102R\u0014\u0010<\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u00102R\u0014\u0010=\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u00102R\u0014\u0010>\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u00102R\u0014\u0010?\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u00102R\u0014\u0010@\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u00102R\u0014\u0010A\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u00102R\u0014\u0010B\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u00102R\u0014\u0010C\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u00102R\u0014\u0010D\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u00102R\u0014\u0010E\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u00102R\u0014\u0010F\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u00102R\u0014\u0010G\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u00102R\u0014\u0010H\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u00102R\u0014\u0010I\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u00102R\u0014\u0010J\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u00102R\u0014\u0010K\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u00102R\u0014\u0010L\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bL\u00102R\u0014\u0010M\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bM\u00102R\u0014\u0010N\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u00102R\u0014\u0010O\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bO\u00102R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bS\u00102R\u0014\u0010T\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bT\u00102R\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00040-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bW\u00102¨\u0006X"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/b$b;", "", "<init>", "()V", "", "encodedHtml", "c", "(Ljava/lang/String;)Ljava/lang/String;", "Lorg/json/JSONObject;", "json", "fieldName", "j", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "cresJson", "Lcom/stripe/android/stripe3ds2/transactions/b;", DateTokenConverter.CONVERTER_KEY, "(Lorg/json/JSONObject;)Lcom/stripe/android/stripe3ds2/transactions/b;", "Ljn0/h0;", "a", "(Lorg/json/JSONObject;)V", "b", "Lcom/stripe/android/stripe3ds2/transactions/d;", "o", "(Lorg/json/JSONObject;)Lcom/stripe/android/stripe3ds2/transactions/d;", "", "isRequired", "p", "(Lorg/json/JSONObject;Ljava/lang/String;Z)Z", "k", "(Lorg/json/JSONObject;)Ljava/lang/String;", "Lorg/json/JSONArray;", "e", "(Lorg/json/JSONObject;)Lorg/json/JSONArray;", "h", "Ljava/util/UUID;", "n", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/UUID;", "Lt80/u;", "m", "(Lorg/json/JSONObject;)Lt80/u;", "uiType", "l", "(Lorg/json/JSONObject;Lcom/stripe/android/stripe3ds2/transactions/d;)Ljava/lang/String;", "f", IntegerTokenConverter.CONVERTER_KEY, "", "Lcom/stripe/android/stripe3ds2/transactions/c;", "g", "(Lorg/json/JSONObject;)Ljava/util/List;", "FIELD_ACS_COUNTER_ACS_TO_SDK", "Ljava/lang/String;", "FIELD_ACS_HTML", "FIELD_ACS_HTML_REFRESH", "FIELD_ACS_TRANS_ID", "FIELD_ACS_UI_TYPE", "FIELD_CHALLENGE_ADDITIONAL_INFO_TEXT", "FIELD_CHALLENGE_COMPLETION_INDICATOR", "FIELD_CHALLENGE_INFO_HEADER", "FIELD_CHALLENGE_INFO_LABEL", "FIELD_CHALLENGE_INFO_TEXT", "FIELD_CHALLENGE_INFO_TEXT_INDICATOR", "FIELD_CHALLENGE_SELECT_INFO", "FIELD_EXPAND_INFO_LABEL", "FIELD_EXPAND_INFO_TEXT", "FIELD_ISSUER_IMAGE", "FIELD_MESSAGE_EXTENSION", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_OOB_APP_LABEL", "FIELD_OOB_APP_URL", "FIELD_OOB_CONTINUE_LABEL", "FIELD_PAYMENT_SYSTEM_IMAGE", "FIELD_RESEND_INFORMATION_LABEL", "FIELD_SDK_TRANS_ID", "FIELD_SERVER_TRANS_ID", "FIELD_SUBMIT_AUTHENTICATION_LABEL", "FIELD_TRANS_STATUS", "FIELD_WHITELISTING_INFO_TEXT", "FIELD_WHY_INFO_LABEL", "FIELD_WHY_INFO_TEXT", "", "FINAL_CRES_FIELDS", "Ljava/util/Set;", "MESSAGE_TYPE", "NO_VALUE", "YES_NO_VALUES", "Ljava/util/List;", "YES_VALUE", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String c(String encodedHtml) {
            Object objB;
            if (encodedHtml == null) {
                return null;
            }
            Companion companion = ChallengeResponseData.INSTANCE;
            try {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                byte[] bArrDecode = Base64.decode(encodedHtml, 8);
                s.j(bArrDecode, "decode(...)");
                objB = jn0.s.b(new String(bArrDecode, p013kotlin.text.d.UTF_8));
            } catch (Throwable th2) {
                jn0.s.Companion companion3 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th2));
            }
            return (String) (jn0.s.g(objB) ? null : objB);
        }

        private final String j(JSONObject json, String fieldName) {
            if (json.has(fieldName)) {
                return json.getString(fieldName);
            }
            return null;
        }

        public final void a(JSONObject cresJson) throws ChallengeResponseParseException {
            s.k(cresJson, "cresJson");
            Iterator<String> itKeys = cresJson.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!ChallengeResponseData.E.contains(next)) {
                    throw new ChallengeResponseParseException(u80.b.InvalidMessageReceived.getCode(), "Message is not final CRes", "Invalid data element for final CRes: " + next);
                }
            }
        }

        public final void b(JSONObject cresJson) throws ChallengeResponseParseException {
            s.k(cresJson, "cresJson");
            if (!s.f("CRes", cresJson.optString("messageType"))) {
                throw new ChallengeResponseParseException(u80.b.InvalidMessageReceived.getCode(), "Message is not CRes", "Invalid Message Type");
            }
        }

        public final ChallengeResponseData d(JSONObject cresJson) throws JSONException, ChallengeResponseParseException {
            ChallengeResponseData challengeResponseData;
            s.k(cresJson, "cresJson");
            b(cresJson);
            boolean zP = p(cresJson, "challengeCompletionInd", true);
            q qVar = new q(n(cresJson, "sdkTransID"));
            String string = n(cresJson, "threeDSServerTransID").toString();
            s.j(string, "toString(...)");
            String string2 = n(cresJson, "acsTransID").toString();
            s.j(string2, "toString(...)");
            String strH = h(cresJson);
            List<MessageExtension> listG = g(cresJson);
            if (zP) {
                a(cresJson);
                challengeResponseData = new ChallengeResponseData(string, string2, null, null, null, zP, null, null, null, null, false, null, null, null, null, listG, strH, null, null, null, null, null, qVar, null, null, null, null, m(cresJson).getCode(), 129925084, null);
            } else {
                boolean zP2 = p(cresJson, "challengeInfoTextIndicator", false);
                String strK = k(cresJson);
                JSONArray jSONArrayE = e(cresJson);
                d dVarO = o(cresJson);
                String strL = l(cresJson, dVarO);
                String strF = f(cresJson, dVarO);
                String strI = i(cresJson, dVarO);
                List<ChallengeSelectOption> listA = ChallengeSelectOption.INSTANCE.a(jSONArrayE);
                String strC = c(cresJson.optString("acsHTMLRefresh"));
                String strOptString = cresJson.optString("challengeInfoHeader");
                String strOptString2 = cresJson.optString("challengeInfoLabel");
                String strOptString3 = cresJson.optString("challengeInfoText");
                String strOptString4 = cresJson.optString("challengeAddInfo");
                String strOptString5 = cresJson.optString("expandInfoLabel");
                String strOptString6 = cresJson.optString("expandInfoText");
                Image.Companion companion = Image.INSTANCE;
                challengeResponseData = new ChallengeResponseData(string, string2, strF, strC, dVarO, zP, strOptString, strOptString2, strOptString3, strOptString4, zP2, listA, strOptString5, strOptString6, companion.a(cresJson.optJSONObject("issuerImage")), listG, strH, cresJson.optString("oobAppURL"), cresJson.optString("oobAppLabel"), strI, companion.a(cresJson.optJSONObject("psImage")), strK, qVar, strL, cresJson.optString("whitelistingInfoText"), cresJson.optString("whyInfoLabel"), cresJson.optString("whyInfoText"), "");
            }
            if (challengeResponseData.K()) {
                return challengeResponseData;
            }
            throw ChallengeResponseParseException.INSTANCE.b("UI fields missing");
        }

        public final JSONArray e(JSONObject cresJson) throws ChallengeResponseParseException {
            Object objB;
            s.k(cresJson, "cresJson");
            if (!cresJson.has("challengeSelectInfo")) {
                cresJson = null;
            }
            if (cresJson == null) {
                return null;
            }
            Companion companion = ChallengeResponseData.INSTANCE;
            try {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(cresJson.getJSONArray("challengeSelectInfo"));
            } catch (Throwable th2) {
                jn0.s.Companion companion3 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th2));
            }
            if (jn0.s.e(objB) == null) {
                return (JSONArray) objB;
            }
            throw ChallengeResponseParseException.INSTANCE.a("challengeSelectInfo");
        }

        public final String f(JSONObject cresJson, d uiType) throws ChallengeResponseParseException {
            s.k(cresJson, "cresJson");
            s.k(uiType, "uiType");
            String strJ = j(cresJson, "acsHTML");
            if ((strJ == null || p013kotlin.text.t.y0(strJ)) && uiType == d.Html) {
                throw ChallengeResponseParseException.INSTANCE.b("acsHTML");
            }
            return c(strJ);
        }

        public final List<MessageExtension> g(JSONObject cresJson) throws ChallengeResponseParseException {
            s.k(cresJson, "cresJson");
            List<MessageExtension> listB = MessageExtension.INSTANCE.b(cresJson.optJSONArray("messageExtension"));
            if (listB != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listB) {
                    MessageExtension cVar = (MessageExtension) obj;
                    if (cVar.getCriticalityIndicator() && !cVar.b()) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    throw new ChallengeResponseParseException(u80.b.UnrecognizedCriticalMessageExtensions, v.y0(arrayList, ",", null, null, 0, null, null, 62, null));
                }
            }
            return listB;
        }

        public final String h(JSONObject cresJson) throws ChallengeResponseParseException {
            s.k(cresJson, "cresJson");
            String strOptString = cresJson.optString("messageVersion");
            s.h(strOptString);
            if (p013kotlin.text.t.y0(strOptString)) {
                strOptString = null;
            }
            if (strOptString != null) {
                return strOptString;
            }
            throw ChallengeResponseParseException.INSTANCE.b("messageVersion");
        }

        public final String i(JSONObject cresJson, d uiType) throws ChallengeResponseParseException {
            s.k(cresJson, "cresJson");
            s.k(uiType, "uiType");
            String strOptString = cresJson.optString("oobContinueLabel");
            if ((strOptString == null || p013kotlin.text.t.y0(strOptString)) && uiType == d.OutOfBand) {
                throw ChallengeResponseParseException.INSTANCE.b("oobContinueLabel");
            }
            return strOptString;
        }

        public final String k(JSONObject cresJson) throws ChallengeResponseParseException {
            s.k(cresJson, "cresJson");
            String strJ = j(cresJson, "resendInformationLabel");
            if (strJ == null || strJ.length() != 0) {
                return strJ;
            }
            throw ChallengeResponseParseException.INSTANCE.a("resendInformationLabel");
        }

        public final String l(JSONObject cresJson, d uiType) throws ChallengeResponseParseException {
            s.k(cresJson, "cresJson");
            s.k(uiType, "uiType");
            String strJ = j(cresJson, "submitAuthenticationLabel");
            if ((strJ == null || p013kotlin.text.t.y0(strJ)) && uiType.getRequiresSubmitButton()) {
                throw ChallengeResponseParseException.INSTANCE.b("submitAuthenticationLabel");
            }
            return strJ;
        }

        public final u m(JSONObject cresJson) throws ChallengeResponseParseException {
            s.k(cresJson, "cresJson");
            String strOptString = cresJson.optString("transStatus");
            if (strOptString == null || p013kotlin.text.t.y0(strOptString)) {
                throw ChallengeResponseParseException.INSTANCE.b("transStatus");
            }
            u uVarA = u.INSTANCE.a(strOptString);
            if (uVarA != null) {
                return uVarA;
            }
            throw ChallengeResponseParseException.INSTANCE.a("transStatus");
        }

        public final UUID n(JSONObject cresJson, String fieldName) throws ChallengeResponseParseException {
            s.k(cresJson, "cresJson");
            s.k(fieldName, "fieldName");
            String strOptString = cresJson.optString(fieldName);
            if (strOptString == null || p013kotlin.text.t.y0(strOptString)) {
                throw ChallengeResponseParseException.INSTANCE.b(fieldName);
            }
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                UUID uuidFromString = UUID.fromString(strOptString);
                s.j(uuidFromString, "fromString(...)");
                return uuidFromString;
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                if (jn0.s.e(jn0.s.b(t.a(th2))) == null) {
                    throw new KotlinNothingValueException();
                }
                throw ChallengeResponseParseException.INSTANCE.a(fieldName);
            }
        }

        public final d o(JSONObject cresJson) throws ChallengeResponseParseException {
            s.k(cresJson, "cresJson");
            String strOptString = cresJson.optString("acsUiType");
            if (strOptString == null || p013kotlin.text.t.y0(strOptString)) {
                throw ChallengeResponseParseException.INSTANCE.b("acsUiType");
            }
            d dVarA = d.INSTANCE.a(strOptString);
            if (dVarA != null) {
                return dVarA;
            }
            throw ChallengeResponseParseException.INSTANCE.a("acsUiType");
        }

        public final boolean p(JSONObject cresJson, String fieldName, boolean isRequired) throws JSONException, ChallengeResponseParseException {
            String strJ;
            s.k(cresJson, "cresJson");
            s.k(fieldName, "fieldName");
            if (!isRequired) {
                strJ = j(cresJson, fieldName);
            } else {
                if (!cresJson.has(fieldName)) {
                    throw ChallengeResponseParseException.INSTANCE.b(fieldName);
                }
                strJ = cresJson.getString(fieldName);
            }
            if (strJ == null || ChallengeResponseData.D.contains(strJ)) {
                return s.f("Y", strJ);
            }
            if (isRequired && p013kotlin.text.t.y0(strJ)) {
                throw ChallengeResponseParseException.INSTANCE.b(fieldName);
            }
            throw ChallengeResponseParseException.INSTANCE.a(fieldName);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transactions.b$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<ChallengeResponseData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChallengeResponseData createFromParcel(Parcel parcel) {
            boolean z11;
            ArrayList arrayList;
            ArrayList arrayList2;
            s.k(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            d dVarValueOf = parcel.readInt() == 0 ? null : d.valueOf(parcel.readString());
            boolean z12 = false;
            if (parcel.readInt() != 0) {
                z12 = true;
                z11 = true;
            } else {
                z11 = true;
            }
            String string5 = parcel.readString();
            boolean z13 = z11;
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            boolean z14 = z13;
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                z14 = false;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList3.add(ChallengeSelectOption.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList3;
            }
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            Image imageCreateFromParcel = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                int i14 = 0;
                while (i14 != i13) {
                    arrayList4.add(MessageExtension.CREATOR.createFromParcel(parcel));
                    i14++;
                    i13 = i13;
                }
                arrayList2 = arrayList4;
                imageCreateFromParcel = imageCreateFromParcel;
            }
            return new ChallengeResponseData(string, string2, string3, string4, dVarValueOf, z12, string5, string6, string7, string8, z14, arrayList, string9, string10, imageCreateFromParcel, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readString(), q.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ChallengeResponseData[] newArray(int i11) {
            return new ChallengeResponseData[i11];
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transactions.b$d, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001\u001cB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\rR\u0013\u0010\"\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\r¨\u0006$"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/b$d;", "Landroid/os/Parcelable;", "", "mediumUrl", "highUrl", "extraHighUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "density", "b", "(I)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getMediumUrl$3ds2sdk_release", "getHighUrl$3ds2sdk_release", "c", "getExtraHighUrl$3ds2sdk_release", "highestFidelityImageUrl", DateTokenConverter.CONVERTER_KEY, "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Image implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mediumUrl;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String highUrl;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String extraHighUrl;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Image> CREATOR = new C1084b();

        /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transactions.b$d$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/b$d$a;", "", "<init>", "()V", "Lorg/json/JSONObject;", "imageJson", "Lcom/stripe/android/stripe3ds2/transactions/b$d;", "a", "(Lorg/json/JSONObject;)Lcom/stripe/android/stripe3ds2/transactions/b$d;", "", "FIELD_EXTRA_HIGH", "Ljava/lang/String;", "FIELD_HIGH", "FIELD_MEDIUM", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Image a(JSONObject imageJson) {
                if (imageJson != null) {
                    return new Image(imageJson.optString("medium"), imageJson.optString("high"), imageJson.optString("extraHigh"));
                }
                return null;
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transactions.b$d$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C1084b implements Parcelable.Creator<Image> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Image createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Image(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Image[] newArray(int i11) {
                return new Image[i11];
            }
        }

        public Image(String str, String str2, String str3) {
            this.mediumUrl = str;
            this.highUrl = str2;
            this.extraHighUrl = str3;
        }

        public final String a() {
            Object next;
            Iterator it = v.p(this.extraHighUrl, this.highUrl, this.mediumUrl).iterator();
            while (it.hasNext()) {
                next = it.next();
                String str = (String) next;
                if (!(str == null || p013kotlin.text.t.y0(str))) {
                    return (String) next;
                }
            }
            next = null;
            return (String) next;
        }

        public final String b(int density) {
            String str;
            if (density <= 160) {
                str = this.mediumUrl;
            } else {
                str = density >= 320 ? this.extraHighUrl : this.highUrl;
            }
            if (str == null || p013kotlin.text.t.y0(str)) {
                str = null;
            }
            return str == null ? a() : str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return s.f(this.mediumUrl, image.mediumUrl) && s.f(this.highUrl, image.highUrl) && s.f(this.extraHighUrl, image.extraHighUrl);
        }

        public int hashCode() {
            String str = this.mediumUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.highUrl;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.extraHighUrl;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Image(mediumUrl=" + this.mediumUrl + ", highUrl=" + this.highUrl + ", extraHighUrl=" + this.extraHighUrl + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.mediumUrl);
            parcel.writeString(this.highUrl);
            parcel.writeString(this.extraHighUrl);
        }
    }

    public ChallengeResponseData(String serverTransId, String acsTransId, String str, String str2, d dVar, boolean z11, String str3, String str4, String str5, String str6, boolean z12, List<ChallengeSelectOption> list, String str7, String str8, Image image, List<MessageExtension> list2, String messageVersion, String str9, String str10, String str11, Image image2, String str12, q sdkTransId, String str13, String str14, String str15, String str16, String str17) {
        s.k(serverTransId, "serverTransId");
        s.k(acsTransId, "acsTransId");
        s.k(messageVersion, "messageVersion");
        s.k(sdkTransId, "sdkTransId");
        this.serverTransId = serverTransId;
        this.acsTransId = acsTransId;
        this.acsHtml = str;
        this.acsHtmlRefresh = str2;
        this.uiType = dVar;
        this.isChallengeCompleted = z11;
        this.challengeInfoHeader = str3;
        this.challengeInfoLabel = str4;
        this.challengeInfoText = str5;
        this.challengeAdditionalInfoText = str6;
        this.shouldShowChallengeInfoTextIndicator = z12;
        this.challengeSelectOptions = list;
        this.expandInfoLabel = str7;
        this.expandInfoText = str8;
        this.issuerImage = image;
        this.messageExtensions = list2;
        this.messageVersion = messageVersion;
        this.oobAppUrl = str9;
        this.oobAppLabel = str10;
        this.oobContinueLabel = str11;
        this.paymentSystemImage = image2;
        this.resendInformationLabel = str12;
        this.sdkTransId = sdkTransId;
        this.submitAuthenticationLabel = str13;
        this.whitelistingInfoText = str14;
        this.whyInfoLabel = str15;
        this.whyInfoText = str16;
        this.transStatus = str17;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final d getUiType() {
        return this.uiType;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final String getWhitelistingInfoText() {
        return this.whitelistingInfoText;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final String getWhyInfoLabel() {
        return this.whyInfoLabel;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getWhyInfoText() {
        return this.whyInfoText;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final boolean getIsChallengeCompleted() {
        return this.isChallengeCompleted;
    }

    public final boolean K() {
        List<ChallengeSelectOption> list;
        d dVar = this.uiType;
        if (dVar == null) {
            return true;
        }
        if (dVar == d.Html) {
            String str = this.acsHtml;
            return !(str == null || p013kotlin.text.t.y0(str));
        }
        Set<String> setI = d1.i(this.challengeInfoHeader, this.challengeInfoLabel, this.challengeInfoText, this.whyInfoLabel, this.whyInfoText, this.expandInfoLabel, this.expandInfoText, this.resendInformationLabel);
        if (!(setI instanceof Collection) || !setI.isEmpty()) {
            for (String str2 : setI) {
                if (str2 != null && !p013kotlin.text.t.y0(str2)) {
                    d dVar2 = this.uiType;
                    if (dVar2 != d.OutOfBand) {
                        if ((dVar2 == d.SingleSelect || dVar2 == d.MultiSelect) && ((list = this.challengeSelectOptions) == null || list.isEmpty())) {
                            break;
                            break;
                        }
                        String str3 = this.submitAuthenticationLabel;
                        return !(str3 == null || p013kotlin.text.t.y0(str3));
                    }
                    Set<String> setI2 = d1.i(this.oobAppLabel, this.oobAppUrl, this.oobContinueLabel);
                    if ((setI2 instanceof Collection) && setI2.isEmpty()) {
                        return false;
                    }
                    for (String str4 : setI2) {
                        if (!(str4 == null || p013kotlin.text.t.y0(str4))) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAcsHtml() {
        return this.acsHtml;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAcsHtmlRefresh() {
        return this.acsHtmlRefresh;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getAcsTransId() {
        return this.acsTransId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeResponseData)) {
            return false;
        }
        ChallengeResponseData challengeResponseData = (ChallengeResponseData) other;
        return s.f(this.serverTransId, challengeResponseData.serverTransId) && s.f(this.acsTransId, challengeResponseData.acsTransId) && s.f(this.acsHtml, challengeResponseData.acsHtml) && s.f(this.acsHtmlRefresh, challengeResponseData.acsHtmlRefresh) && this.uiType == challengeResponseData.uiType && this.isChallengeCompleted == challengeResponseData.isChallengeCompleted && s.f(this.challengeInfoHeader, challengeResponseData.challengeInfoHeader) && s.f(this.challengeInfoLabel, challengeResponseData.challengeInfoLabel) && s.f(this.challengeInfoText, challengeResponseData.challengeInfoText) && s.f(this.challengeAdditionalInfoText, challengeResponseData.challengeAdditionalInfoText) && this.shouldShowChallengeInfoTextIndicator == challengeResponseData.shouldShowChallengeInfoTextIndicator && s.f(this.challengeSelectOptions, challengeResponseData.challengeSelectOptions) && s.f(this.expandInfoLabel, challengeResponseData.expandInfoLabel) && s.f(this.expandInfoText, challengeResponseData.expandInfoText) && s.f(this.issuerImage, challengeResponseData.issuerImage) && s.f(this.messageExtensions, challengeResponseData.messageExtensions) && s.f(this.messageVersion, challengeResponseData.messageVersion) && s.f(this.oobAppUrl, challengeResponseData.oobAppUrl) && s.f(this.oobAppLabel, challengeResponseData.oobAppLabel) && s.f(this.oobContinueLabel, challengeResponseData.oobContinueLabel) && s.f(this.paymentSystemImage, challengeResponseData.paymentSystemImage) && s.f(this.resendInformationLabel, challengeResponseData.resendInformationLabel) && s.f(this.sdkTransId, challengeResponseData.sdkTransId) && s.f(this.submitAuthenticationLabel, challengeResponseData.submitAuthenticationLabel) && s.f(this.whitelistingInfoText, challengeResponseData.whitelistingInfoText) && s.f(this.whyInfoLabel, challengeResponseData.whyInfoLabel) && s.f(this.whyInfoText, challengeResponseData.whyInfoText) && s.f(this.transStatus, challengeResponseData.transStatus);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getChallengeAdditionalInfoText() {
        return this.challengeAdditionalInfoText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getChallengeInfoHeader() {
        return this.challengeInfoHeader;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getChallengeInfoLabel() {
        return this.challengeInfoLabel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r1v95 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iHashCode = ((this.serverTransId.hashCode() * 31) + this.acsTransId.hashCode()) * 31;
        String str = this.acsHtml;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.acsHtmlRefresh;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        d dVar = this.uiType;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        boolean z11 = this.isChallengeCompleted;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode4 + r11) * 31;
        String str3 = this.challengeInfoHeader;
        int iHashCode5 = (i11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.challengeInfoLabel;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.challengeInfoText;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.challengeAdditionalInfoText;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        boolean z12 = this.shouldShowChallengeInfoTextIndicator;
        int i12 = (iHashCode8 + (z12 ? 1 : z12)) * 31;
        List<ChallengeSelectOption> list = this.challengeSelectOptions;
        int iHashCode9 = (i12 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.expandInfoLabel;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.expandInfoText;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Image image = this.issuerImage;
        int iHashCode12 = (iHashCode11 + (image == null ? 0 : image.hashCode())) * 31;
        List<MessageExtension> list2 = this.messageExtensions;
        int iHashCode13 = (((iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.messageVersion.hashCode()) * 31;
        String str9 = this.oobAppUrl;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.oobAppLabel;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.oobContinueLabel;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Image image2 = this.paymentSystemImage;
        int iHashCode17 = (iHashCode16 + (image2 == null ? 0 : image2.hashCode())) * 31;
        String str12 = this.resendInformationLabel;
        int iHashCode18 = (((iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31) + this.sdkTransId.hashCode()) * 31;
        String str13 = this.submitAuthenticationLabel;
        int iHashCode19 = (iHashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.whitelistingInfoText;
        int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.whyInfoLabel;
        int iHashCode21 = (iHashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.whyInfoText;
        int iHashCode22 = (iHashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.transStatus;
        return iHashCode22 + (str17 != null ? str17.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getChallengeInfoText() {
        return this.challengeInfoText;
    }

    public final List<ChallengeSelectOption> j() {
        return this.challengeSelectOptions;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getExpandInfoLabel() {
        return this.expandInfoLabel;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getExpandInfoText() {
        return this.expandInfoText;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Image getIssuerImage() {
        return this.issuerImage;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getMessageVersion() {
        return this.messageVersion;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getOobContinueLabel() {
        return this.oobContinueLabel;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Image getPaymentSystemImage() {
        return this.paymentSystemImage;
    }

    public String toString() {
        return "ChallengeResponseData(serverTransId=" + this.serverTransId + ", acsTransId=" + this.acsTransId + ", acsHtml=" + this.acsHtml + ", acsHtmlRefresh=" + this.acsHtmlRefresh + ", uiType=" + this.uiType + ", isChallengeCompleted=" + this.isChallengeCompleted + ", challengeInfoHeader=" + this.challengeInfoHeader + ", challengeInfoLabel=" + this.challengeInfoLabel + ", challengeInfoText=" + this.challengeInfoText + ", challengeAdditionalInfoText=" + this.challengeAdditionalInfoText + ", shouldShowChallengeInfoTextIndicator=" + this.shouldShowChallengeInfoTextIndicator + ", challengeSelectOptions=" + this.challengeSelectOptions + ", expandInfoLabel=" + this.expandInfoLabel + ", expandInfoText=" + this.expandInfoText + ", issuerImage=" + this.issuerImage + ", messageExtensions=" + this.messageExtensions + ", messageVersion=" + this.messageVersion + ", oobAppUrl=" + this.oobAppUrl + ", oobAppLabel=" + this.oobAppLabel + ", oobContinueLabel=" + this.oobContinueLabel + ", paymentSystemImage=" + this.paymentSystemImage + ", resendInformationLabel=" + this.resendInformationLabel + ", sdkTransId=" + this.sdkTransId + ", submitAuthenticationLabel=" + this.submitAuthenticationLabel + ", whitelistingInfoText=" + this.whitelistingInfoText + ", whyInfoLabel=" + this.whyInfoLabel + ", whyInfoText=" + this.whyInfoText + ", transStatus=" + this.transStatus + ")";
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getResendInformationLabel() {
        return this.resendInformationLabel;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final q getSdkTransId() {
        return this.sdkTransId;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getServerTransId() {
        return this.serverTransId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.serverTransId);
        parcel.writeString(this.acsTransId);
        parcel.writeString(this.acsHtml);
        parcel.writeString(this.acsHtmlRefresh);
        d dVar = this.uiType;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dVar.name());
        }
        parcel.writeInt(this.isChallengeCompleted ? 1 : 0);
        parcel.writeString(this.challengeInfoHeader);
        parcel.writeString(this.challengeInfoLabel);
        parcel.writeString(this.challengeInfoText);
        parcel.writeString(this.challengeAdditionalInfoText);
        parcel.writeInt(this.shouldShowChallengeInfoTextIndicator ? 1 : 0);
        List<ChallengeSelectOption> list = this.challengeSelectOptions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ChallengeSelectOption> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.expandInfoLabel);
        parcel.writeString(this.expandInfoText);
        Image image = this.issuerImage;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image.writeToParcel(parcel, flags);
        }
        List<MessageExtension> list2 = this.messageExtensions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<MessageExtension> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.messageVersion);
        parcel.writeString(this.oobAppUrl);
        parcel.writeString(this.oobAppLabel);
        parcel.writeString(this.oobContinueLabel);
        Image image2 = this.paymentSystemImage;
        if (image2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image2.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.resendInformationLabel);
        this.sdkTransId.writeToParcel(parcel, flags);
        parcel.writeString(this.submitAuthenticationLabel);
        parcel.writeString(this.whitelistingInfoText);
        parcel.writeString(this.whyInfoLabel);
        parcel.writeString(this.whyInfoText);
        parcel.writeString(this.transStatus);
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getShouldShowChallengeInfoTextIndicator() {
        return this.shouldShowChallengeInfoTextIndicator;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getSubmitAuthenticationLabel() {
        return this.submitAuthenticationLabel;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getTransStatus() {
        return this.transStatus;
    }

    public /* synthetic */ ChallengeResponseData(String str, String str2, String str3, String str4, d dVar, boolean z11, String str5, String str6, String str7, String str8, boolean z12, List list, String str9, String str10, Image image, List list2, String str11, String str12, String str13, String str14, Image image2, String str15, q qVar, String str16, String str17, String str18, String str19, String str20, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : dVar, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : str7, (i11 & 512) != 0 ? null : str8, (i11 & 1024) != 0 ? false : z12, (i11 & 2048) != 0 ? null : list, (i11 & 4096) != 0 ? null : str9, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : str10, (i11 & 16384) != 0 ? null : image, (32768 & i11) != 0 ? null : list2, str11, (131072 & i11) != 0 ? null : str12, (262144 & i11) != 0 ? null : str13, (524288 & i11) != 0 ? null : str14, (1048576 & i11) != 0 ? null : image2, (2097152 & i11) != 0 ? null : str15, qVar, (8388608 & i11) != 0 ? null : str16, (16777216 & i11) != 0 ? null : str17, (33554432 & i11) != 0 ? null : str18, (67108864 & i11) != 0 ? null : str19, (i11 & 134217728) != 0 ? null : str20);
    }
}
