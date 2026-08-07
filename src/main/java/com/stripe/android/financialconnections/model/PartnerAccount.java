package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.c0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bK\b\u0081\b\u0018\u0000 \u0080\u00012\u00020\u0001:\u0002;@Bå\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 B\u0085\u0002\b\u0011\u0012\u0006\u0010!\u001a\u00020\r\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J(\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(HÁ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b5\u00100J \u00109\u001a\u00020*2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b9\u0010:R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010.R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u0010?\u001a\u0004\bB\u0010CR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010<\u0012\u0004\bG\u0010?\u001a\u0004\bF\u0010.R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010<\u0012\u0004\bI\u0010?\u001a\u0004\bH\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bJ\u0010K\u0012\u0004\bN\u0010?\u001a\u0004\bL\u0010MR&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bO\u0010P\u0012\u0004\bS\u0010?\u001a\u0004\bQ\u0010RR\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bT\u0010U\u0012\u0004\bW\u0010?\u001a\u0004\bJ\u0010VR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bX\u0010<\u0012\u0004\bZ\u0010?\u001a\u0004\bY\u0010.R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b[\u0010\\\u0012\u0004\b^\u0010?\u001a\u0004\bO\u0010]R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010<\u0012\u0004\b`\u0010?\u001a\u0004\b_\u0010.R\"\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\ba\u0010U\u0012\u0004\bc\u0010?\u001a\u0004\bb\u0010VR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bd\u0010<\u0012\u0004\bf\u0010?\u001a\u0004\be\u0010.R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0083\u0004¢\u0006\f\n\u0004\bg\u0010h\u0012\u0004\bi\u0010?R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bj\u0010<\u0012\u0004\bk\u0010?\u001a\u0004\bE\u0010.R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bl\u0010m\u0012\u0004\bo\u0010?\u001a\u0004\bX\u0010nR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bp\u0010<\u0012\u0004\br\u0010?\u001a\u0004\bq\u0010.R\"\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bs\u0010<\u0012\u0004\bt\u0010?\u001a\u0004\bT\u0010.R\"\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bu\u0010<\u0012\u0004\bw\u0010?\u001a\u0004\bv\u0010.R\"\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bx\u0010y\u0012\u0004\b|\u0010?\u001a\u0004\bz\u0010{R\u0014\u0010~\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010}R\u0014\u0010\u007f\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b[\u0010.¨\u0006\u0081\u0001"}, d2 = {"Lcom/stripe/android/financialconnections/model/c0;", "Landroid/os/Parcelable;", "", "authorization", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "category", "id", "name", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "subcategory", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "supportedPaymentMethodTypes", "", "balanceAmount", "currency", "Lcom/stripe/android/financialconnections/model/q;", "institution", "displayableAccountNumbers", "initialBalanceAmount", "institutionName", "", "_allowSelection", "allowSelectionMessage", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "nextPaneOnSelection", "institutionUrl", "linkedAccountId", "routingNumber", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", PermissionsResponse.STATUS_KEY, "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/q;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;)V", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/q;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "j", "(Lcom/stripe/android/financialconnections/model/c0;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "getAuthorization$annotations", "()V", "b", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "getCategory", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "getCategory$annotations", "c", "getId", "getId$annotations", "getName", "getName$annotations", "e", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "getSubcategory", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "getSubcategory$annotations", "f", "Ljava/util/List;", "getSupportedPaymentMethodTypes", "()Ljava/util/List;", "getSupportedPaymentMethodTypes$annotations", "g", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "getBalanceAmount$annotations", "h", "getCurrency", "getCurrency$annotations", IntegerTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/financialconnections/model/q;", "()Lcom/stripe/android/financialconnections/model/q;", "getInstitution$annotations", "getDisplayableAccountNumbers", "getDisplayableAccountNumbers$annotations", "k", "getInitialBalanceAmount", "getInitialBalanceAmount$annotations", "l", "getInstitutionName", "getInstitutionName$annotations", "m", "Ljava/lang/Boolean;", "get_allowSelection$annotations", "n", "getAllowSelectionMessage$annotations", "o", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getNextPaneOnSelection$annotations", "p", "getInstitutionUrl", "getInstitutionUrl$annotations", "q", "getLinkedAccountId$annotations", "r", "getRoutingNumber", "getRoutingNumber$annotations", "s", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "getStatus", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "getStatus$annotations", "()Z", "allowSelection", "redactedAccountNumbers", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class PartnerAccount implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String authorization;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsAccount.Category category;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsAccount.Subcategory subcategory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FinancialConnectionsAccount.SupportedPaymentMethodTypes> supportedPaymentMethodTypes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer balanceAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currency;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsInstitution institution;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String displayableAccountNumbers;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer initialBalanceAmount;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionName;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean _allowSelection;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String allowSelectionMessage;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsSessionManifest.Pane nextPaneOnSelection;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionUrl;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String linkedAccountId;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String routingNumber;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsAccount.Status status;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f50408t = 8;
    public static final Parcelable.Creator<PartnerAccount> CREATOR = new c();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final ro0.d<Object>[] f50409u = {null, null, null, null, null, new vo0.e(FinancialConnectionsAccount.SupportedPaymentMethodTypes.c.f50292e), null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.c0$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/PartnerAccount.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/c0;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/c0;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/c0;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<PartnerAccount> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50429a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50429a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.PartnerAccount", aVar, 19);
            m1Var.o("authorization", false);
            m1Var.o("category", false);
            m1Var.o("id", false);
            m1Var.o("name", false);
            m1Var.o("subcategory", false);
            m1Var.o("supported_payment_method_types", false);
            m1Var.o("balance_amount", true);
            m1Var.o("currency", true);
            m1Var.o("institution", true);
            m1Var.o("displayable_account_numbers", true);
            m1Var.o("initial_balance_amount", true);
            m1Var.o("institution_name", true);
            m1Var.o("allow_selection", true);
            m1Var.o("allow_selection_message", true);
            m1Var.o("next_pane_on_selection", true);
            m1Var.o("institution_url", true);
            m1Var.o("linked_account_id", true);
            m1Var.o("routing_number", true);
            m1Var.o(PermissionsResponse.STATUS_KEY, true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PartnerAccount deserialize(uo0.e decoder) {
            String str;
            Boolean bool;
            FinancialConnectionsAccount.Category category;
            String str2;
            FinancialConnectionsAccount.Status status;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            Integer num;
            String str8;
            String str9;
            String str10;
            FinancialConnectionsInstitution financialConnectionsInstitution;
            FinancialConnectionsAccount.Subcategory subcategory;
            List list;
            Integer num2;
            int i11;
            FinancialConnectionsSessionManifest.Pane pane;
            int i12;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = PartnerAccount.f50409u;
            String str11 = null;
            if (cVarB.i()) {
                z1 z1Var = z1.f119730a;
                String str12 = (String) cVarB.v(descriptor2, 0, z1Var, null);
                FinancialConnectionsAccount.Category category2 = (FinancialConnectionsAccount.Category) cVarB.v(descriptor2, 1, FinancialConnectionsAccount.Category.c.f50284e, null);
                String strT = cVarB.t(descriptor2, 2);
                String strT2 = cVarB.t(descriptor2, 3);
                FinancialConnectionsAccount.Subcategory subcategory2 = (FinancialConnectionsAccount.Subcategory) cVarB.v(descriptor2, 4, FinancialConnectionsAccount.Subcategory.c.f50290e, null);
                List list2 = (List) cVarB.n(descriptor2, 5, dVarArr[5], null);
                vo0.j0 j0Var = vo0.j0.f119632a;
                Integer num3 = (Integer) cVarB.v(descriptor2, 6, j0Var, null);
                String str13 = (String) cVarB.v(descriptor2, 7, z1Var, null);
                FinancialConnectionsInstitution financialConnectionsInstitution2 = (FinancialConnectionsInstitution) cVarB.v(descriptor2, 8, FinancialConnectionsInstitution.a.f50550a, null);
                String str14 = (String) cVarB.v(descriptor2, 9, z1Var, null);
                Integer num4 = (Integer) cVarB.v(descriptor2, 10, j0Var, null);
                String str15 = (String) cVarB.v(descriptor2, 11, z1Var, null);
                Boolean bool2 = (Boolean) cVarB.v(descriptor2, 12, vo0.h.f119620a, null);
                String str16 = (String) cVarB.v(descriptor2, 13, z1Var, null);
                FinancialConnectionsSessionManifest.Pane pane2 = (FinancialConnectionsSessionManifest.Pane) cVarB.v(descriptor2, 14, FinancialConnectionsSessionManifest.Pane.c.f50360e, null);
                String str17 = (String) cVarB.v(descriptor2, 15, z1Var, null);
                String str18 = (String) cVarB.v(descriptor2, 16, z1Var, null);
                String str19 = (String) cVarB.v(descriptor2, 17, z1Var, null);
                status = (FinancialConnectionsAccount.Status) cVarB.v(descriptor2, 18, FinancialConnectionsAccount.Status.c.f50288e, null);
                i11 = 524287;
                str4 = str17;
                financialConnectionsInstitution = financialConnectionsInstitution2;
                str9 = strT;
                num = num4;
                category = category2;
                str = str12;
                str10 = strT2;
                str2 = str14;
                str8 = str13;
                num2 = num3;
                str7 = str15;
                str3 = str19;
                str5 = str18;
                pane = pane2;
                bool = bool2;
                str6 = str16;
                list = list2;
                subcategory = subcategory2;
            } else {
                int i13 = 5;
                boolean z11 = true;
                int i14 = 0;
                FinancialConnectionsSessionManifest.Pane pane3 = null;
                FinancialConnectionsInstitution financialConnectionsInstitution3 = null;
                Boolean bool3 = null;
                Integer num5 = null;
                String str20 = null;
                FinancialConnectionsAccount.Status status2 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                Integer num6 = null;
                String str25 = null;
                String strT3 = null;
                String strT4 = null;
                String str26 = null;
                FinancialConnectionsAccount.Category category3 = null;
                FinancialConnectionsAccount.Subcategory subcategory3 = null;
                List list3 = null;
                while (z11) {
                    Integer num7 = num5;
                    int iA = cVarB.A(descriptor2);
                    switch (iA) {
                        case -1:
                            z11 = false;
                            financialConnectionsInstitution3 = financialConnectionsInstitution3;
                            num5 = num7;
                            pane3 = pane3;
                            i13 = 5;
                            break;
                        case 0:
                            str26 = (String) cVarB.v(descriptor2, 0, z1.f119730a, str26);
                            i14 |= 1;
                            financialConnectionsInstitution3 = financialConnectionsInstitution3;
                            num5 = num7;
                            pane3 = pane3;
                            i13 = 5;
                            break;
                        case 1:
                            pane3 = pane3;
                            num7 = num7;
                            category3 = (FinancialConnectionsAccount.Category) cVarB.v(descriptor2, 1, FinancialConnectionsAccount.Category.c.f50284e, category3);
                            i14 |= 2;
                            subcategory3 = subcategory3;
                            num5 = num7;
                            pane3 = pane3;
                            i13 = 5;
                            break;
                        case 2:
                            pane3 = pane3;
                            num7 = num7;
                            strT3 = cVarB.t(descriptor2, 2);
                            i14 |= 4;
                            num5 = num7;
                            pane3 = pane3;
                            i13 = 5;
                            break;
                        case 3:
                            pane3 = pane3;
                            num7 = num7;
                            strT4 = cVarB.t(descriptor2, 3);
                            i14 |= 8;
                            num5 = num7;
                            pane3 = pane3;
                            i13 = 5;
                            break;
                        case 4:
                            pane3 = pane3;
                            num7 = num7;
                            subcategory3 = (FinancialConnectionsAccount.Subcategory) cVarB.v(descriptor2, 4, FinancialConnectionsAccount.Subcategory.c.f50290e, subcategory3);
                            i14 |= 16;
                            list3 = list3;
                            num5 = num7;
                            pane3 = pane3;
                            i13 = 5;
                            break;
                        case 5:
                            int i15 = i14;
                            int i16 = i13;
                            list3 = (List) cVarB.n(descriptor2, i16, dVarArr[i13], list3);
                            i14 = i15 | 32;
                            num5 = num7;
                            i13 = i16;
                            pane3 = pane3;
                            break;
                        case 6:
                            num5 = (Integer) cVarB.v(descriptor2, 6, vo0.j0.f119632a, num7);
                            i14 |= 64;
                            pane3 = pane3;
                            break;
                        case 7:
                            str25 = (String) cVarB.v(descriptor2, 7, z1.f119730a, str25);
                            i14 |= 128;
                            pane3 = pane3;
                            num5 = num7;
                            break;
                        case 8:
                            str25 = str25;
                            financialConnectionsInstitution3 = (FinancialConnectionsInstitution) cVarB.v(descriptor2, 8, FinancialConnectionsInstitution.a.f50550a, financialConnectionsInstitution3);
                            i14 |= 256;
                            num5 = num7;
                            str25 = str25;
                            break;
                        case 9:
                            str25 = str25;
                            str20 = (String) cVarB.v(descriptor2, 9, z1.f119730a, str20);
                            i14 |= 512;
                            num5 = num7;
                            str25 = str25;
                            break;
                        case 10:
                            str25 = str25;
                            num6 = (Integer) cVarB.v(descriptor2, 10, vo0.j0.f119632a, num6);
                            i14 |= 1024;
                            num5 = num7;
                            str25 = str25;
                            break;
                        case 11:
                            str25 = str25;
                            str24 = (String) cVarB.v(descriptor2, 11, z1.f119730a, str24);
                            i14 |= 2048;
                            num5 = num7;
                            str25 = str25;
                            break;
                        case 12:
                            str25 = str25;
                            bool3 = (Boolean) cVarB.v(descriptor2, 12, vo0.h.f119620a, bool3);
                            i14 |= 4096;
                            num5 = num7;
                            str25 = str25;
                            break;
                        case 13:
                            str25 = str25;
                            str23 = (String) cVarB.v(descriptor2, 13, z1.f119730a, str23);
                            i14 |= PKIFailureInfo.certRevoked;
                            num5 = num7;
                            str25 = str25;
                            break;
                        case 14:
                            str25 = str25;
                            pane3 = (FinancialConnectionsSessionManifest.Pane) cVarB.v(descriptor2, 14, FinancialConnectionsSessionManifest.Pane.c.f50360e, pane3);
                            i14 |= 16384;
                            num5 = num7;
                            str25 = str25;
                            break;
                        case 15:
                            str11 = (String) cVarB.v(descriptor2, 15, z1.f119730a, str11);
                            i12 = 32768;
                            i14 |= i12;
                            num5 = num7;
                            str25 = str25;
                            break;
                        case 16:
                            str22 = (String) cVarB.v(descriptor2, 16, z1.f119730a, str22);
                            i12 = 65536;
                            i14 |= i12;
                            num5 = num7;
                            str25 = str25;
                            break;
                        case 17:
                            str21 = (String) cVarB.v(descriptor2, 17, z1.f119730a, str21);
                            i12 = 131072;
                            i14 |= i12;
                            num5 = num7;
                            str25 = str25;
                            break;
                        case 18:
                            status2 = (FinancialConnectionsAccount.Status) cVarB.v(descriptor2, 18, FinancialConnectionsAccount.Status.c.f50288e, status2);
                            i12 = 262144;
                            i14 |= i12;
                            num5 = num7;
                            str25 = str25;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                str = str26;
                bool = bool3;
                category = category3;
                str2 = str20;
                status = status2;
                str3 = str21;
                str4 = str11;
                str5 = str22;
                str6 = str23;
                str7 = str24;
                num = num6;
                str8 = str25;
                str9 = strT3;
                str10 = strT4;
                financialConnectionsInstitution = financialConnectionsInstitution3;
                subcategory = subcategory3;
                list = list3;
                num2 = num5;
                i11 = i14;
                pane = pane3;
            }
            cVarB.c(descriptor2);
            return new PartnerAccount(i11, str, category, str9, str10, subcategory, list, num2, str8, financialConnectionsInstitution, str2, num, str7, bool, str6, pane, str4, str5, str3, status, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, PartnerAccount value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            PartnerAccount.j(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            ro0.d<?>[] dVarArr = PartnerAccount.f50409u;
            z1 z1Var = z1.f119730a;
            ro0.d<?> dVarP = so0.a.p(z1Var);
            ro0.d<?> dVarP2 = so0.a.p(FinancialConnectionsAccount.Category.c.f50284e);
            ro0.d<?> dVarP3 = so0.a.p(FinancialConnectionsAccount.Subcategory.c.f50290e);
            ro0.d<?> dVar = dVarArr[5];
            vo0.j0 j0Var = vo0.j0.f119632a;
            return new ro0.d[]{dVarP, dVarP2, z1Var, z1Var, dVarP3, dVar, so0.a.p(j0Var), so0.a.p(z1Var), so0.a.p(FinancialConnectionsInstitution.a.f50550a), so0.a.p(z1Var), so0.a.p(j0Var), so0.a.p(z1Var), so0.a.p(vo0.h.f119620a), so0.a.p(z1Var), so0.a.p(FinancialConnectionsSessionManifest.Pane.c.f50360e), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(FinancialConnectionsAccount.Status.c.f50288e)};
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

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.c0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/c0$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/c0;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<PartnerAccount> serializer() {
            return a.f50429a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.c0$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<PartnerAccount> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PartnerAccount createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            String string = parcel.readString();
            FinancialConnectionsAccount.Category categoryValueOf = parcel.readInt() == 0 ? null : FinancialConnectionsAccount.Category.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            FinancialConnectionsAccount.Subcategory subcategoryValueOf = parcel.readInt() == 0 ? null : FinancialConnectionsAccount.Subcategory.valueOf(parcel.readString());
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(FinancialConnectionsAccount.SupportedPaymentMethodTypes.valueOf(parcel.readString()));
            }
            return new PartnerAccount(string, categoryValueOf, string2, string3, subcategoryValueOf, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : FinancialConnectionsInstitution.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : FinancialConnectionsSessionManifest.Pane.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? FinancialConnectionsAccount.Status.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PartnerAccount[] newArray(int i11) {
            return new PartnerAccount[i11];
        }
    }

    @jn0.e
    public /* synthetic */ PartnerAccount(int i11, @ro0.o("authorization") String str, @ro0.o("category") FinancialConnectionsAccount.Category category, @ro0.o("id") String str2, @ro0.o("name") String str3, @ro0.o("subcategory") FinancialConnectionsAccount.Subcategory subcategory, @ro0.o("supported_payment_method_types") List list, @ro0.o("balance_amount") Integer num, @ro0.o("currency") String str4, @ro0.o("institution") FinancialConnectionsInstitution financialConnectionsInstitution, @ro0.o("displayable_account_numbers") String str5, @ro0.o("initial_balance_amount") Integer num2, @ro0.o("institution_name") String str6, @ro0.o("allow_selection") Boolean bool, @ro0.o("allow_selection_message") String str7, @ro0.o("next_pane_on_selection") FinancialConnectionsSessionManifest.Pane pane, @ro0.o("institution_url") String str8, @ro0.o("linked_account_id") String str9, @ro0.o("routing_number") String str10, @ro0.o(PermissionsResponse.STATUS_KEY) FinancialConnectionsAccount.Status status, v1 v1Var) {
        if (63 != (i11 & 63)) {
            h1.b(i11, 63, a.f50429a.getDescriptor());
        }
        this.authorization = str;
        this.category = category;
        this.id = str2;
        this.name = str3;
        this.subcategory = subcategory;
        this.supportedPaymentMethodTypes = list;
        if ((i11 & 64) == 0) {
            this.balanceAmount = null;
        } else {
            this.balanceAmount = num;
        }
        if ((i11 & 128) == 0) {
            this.currency = null;
        } else {
            this.currency = str4;
        }
        if ((i11 & 256) == 0) {
            this.institution = null;
        } else {
            this.institution = financialConnectionsInstitution;
        }
        if ((i11 & 512) == 0) {
            this.displayableAccountNumbers = null;
        } else {
            this.displayableAccountNumbers = str5;
        }
        if ((i11 & 1024) == 0) {
            this.initialBalanceAmount = null;
        } else {
            this.initialBalanceAmount = num2;
        }
        if ((i11 & 2048) == 0) {
            this.institutionName = null;
        } else {
            this.institutionName = str6;
        }
        if ((i11 & 4096) == 0) {
            this._allowSelection = null;
        } else {
            this._allowSelection = bool;
        }
        if ((i11 & PKIFailureInfo.certRevoked) == 0) {
            this.allowSelectionMessage = null;
        } else {
            this.allowSelectionMessage = str7;
        }
        if ((i11 & 16384) == 0) {
            this.nextPaneOnSelection = null;
        } else {
            this.nextPaneOnSelection = pane;
        }
        if ((32768 & i11) == 0) {
            this.institutionUrl = null;
        } else {
            this.institutionUrl = str8;
        }
        if ((65536 & i11) == 0) {
            this.linkedAccountId = null;
        } else {
            this.linkedAccountId = str9;
        }
        if ((131072 & i11) == 0) {
            this.routingNumber = null;
        } else {
            this.routingNumber = str10;
        }
        if ((i11 & 262144) == 0) {
            this.status = null;
        } else {
            this.status = status;
        }
    }

    public static final /* synthetic */ void j(PartnerAccount self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f50409u;
        z1 z1Var = z1.f119730a;
        output.y(serialDesc, 0, z1Var, self.authorization);
        output.y(serialDesc, 1, FinancialConnectionsAccount.Category.c.f50284e, self.category);
        output.e(serialDesc, 2, self.id);
        output.e(serialDesc, 3, self.name);
        output.y(serialDesc, 4, FinancialConnectionsAccount.Subcategory.c.f50290e, self.subcategory);
        output.D(serialDesc, 5, dVarArr[5], self.supportedPaymentMethodTypes);
        if (output.G(serialDesc, 6) || self.balanceAmount != null) {
            output.y(serialDesc, 6, vo0.j0.f119632a, self.balanceAmount);
        }
        if (output.G(serialDesc, 7) || self.currency != null) {
            output.y(serialDesc, 7, z1Var, self.currency);
        }
        if (output.G(serialDesc, 8) || self.institution != null) {
            output.y(serialDesc, 8, FinancialConnectionsInstitution.a.f50550a, self.institution);
        }
        if (output.G(serialDesc, 9) || self.displayableAccountNumbers != null) {
            output.y(serialDesc, 9, z1Var, self.displayableAccountNumbers);
        }
        if (output.G(serialDesc, 10) || self.initialBalanceAmount != null) {
            output.y(serialDesc, 10, vo0.j0.f119632a, self.initialBalanceAmount);
        }
        if (output.G(serialDesc, 11) || self.institutionName != null) {
            output.y(serialDesc, 11, z1Var, self.institutionName);
        }
        if (output.G(serialDesc, 12) || self._allowSelection != null) {
            output.y(serialDesc, 12, vo0.h.f119620a, self._allowSelection);
        }
        if (output.G(serialDesc, 13) || self.allowSelectionMessage != null) {
            output.y(serialDesc, 13, z1Var, self.allowSelectionMessage);
        }
        if (output.G(serialDesc, 14) || self.nextPaneOnSelection != null) {
            output.y(serialDesc, 14, FinancialConnectionsSessionManifest.Pane.c.f50360e, self.nextPaneOnSelection);
        }
        if (output.G(serialDesc, 15) || self.institutionUrl != null) {
            output.y(serialDesc, 15, z1Var, self.institutionUrl);
        }
        if (output.G(serialDesc, 16) || self.linkedAccountId != null) {
            output.y(serialDesc, 16, z1Var, self.linkedAccountId);
        }
        if (output.G(serialDesc, 17) || self.routingNumber != null) {
            output.y(serialDesc, 17, z1Var, self.routingNumber);
        }
        if (!output.G(serialDesc, 18) && self.status == null) {
            return;
        }
        output.y(serialDesc, 18, FinancialConnectionsAccount.Status.c.f50288e, self.status);
    }

    public final boolean b() {
        Boolean bool = this._allowSelection;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAllowSelectionMessage() {
        return this.allowSelectionMessage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAuthorization() {
        return this.authorization;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getBalanceAmount() {
        return this.balanceAmount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartnerAccount)) {
            return false;
        }
        PartnerAccount partnerAccount = (PartnerAccount) other;
        return p013kotlin.jvm.internal.s.f(this.authorization, partnerAccount.authorization) && this.category == partnerAccount.category && p013kotlin.jvm.internal.s.f(this.id, partnerAccount.id) && p013kotlin.jvm.internal.s.f(this.name, partnerAccount.name) && this.subcategory == partnerAccount.subcategory && p013kotlin.jvm.internal.s.f(this.supportedPaymentMethodTypes, partnerAccount.supportedPaymentMethodTypes) && p013kotlin.jvm.internal.s.f(this.balanceAmount, partnerAccount.balanceAmount) && p013kotlin.jvm.internal.s.f(this.currency, partnerAccount.currency) && p013kotlin.jvm.internal.s.f(this.institution, partnerAccount.institution) && p013kotlin.jvm.internal.s.f(this.displayableAccountNumbers, partnerAccount.displayableAccountNumbers) && p013kotlin.jvm.internal.s.f(this.initialBalanceAmount, partnerAccount.initialBalanceAmount) && p013kotlin.jvm.internal.s.f(this.institutionName, partnerAccount.institutionName) && p013kotlin.jvm.internal.s.f(this._allowSelection, partnerAccount._allowSelection) && p013kotlin.jvm.internal.s.f(this.allowSelectionMessage, partnerAccount.allowSelectionMessage) && this.nextPaneOnSelection == partnerAccount.nextPaneOnSelection && p013kotlin.jvm.internal.s.f(this.institutionUrl, partnerAccount.institutionUrl) && p013kotlin.jvm.internal.s.f(this.linkedAccountId, partnerAccount.linkedAccountId) && p013kotlin.jvm.internal.s.f(this.routingNumber, partnerAccount.routingNumber) && this.status == partnerAccount.status;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final FinancialConnectionsInstitution getInstitution() {
        return this.institution;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLinkedAccountId() {
        return this.linkedAccountId;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getNextPaneOnSelection() {
        return this.nextPaneOnSelection;
    }

    public int hashCode() {
        String str = this.authorization;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        FinancialConnectionsAccount.Category category = this.category;
        int iHashCode2 = (((((iHashCode + (category == null ? 0 : category.hashCode())) * 31) + this.id.hashCode()) * 31) + this.name.hashCode()) * 31;
        FinancialConnectionsAccount.Subcategory subcategory = this.subcategory;
        int iHashCode3 = (((iHashCode2 + (subcategory == null ? 0 : subcategory.hashCode())) * 31) + this.supportedPaymentMethodTypes.hashCode()) * 31;
        Integer num = this.balanceAmount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FinancialConnectionsInstitution financialConnectionsInstitution = this.institution;
        int iHashCode6 = (iHashCode5 + (financialConnectionsInstitution == null ? 0 : financialConnectionsInstitution.hashCode())) * 31;
        String str3 = this.displayableAccountNumbers;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.initialBalanceAmount;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.institutionName;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this._allowSelection;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.allowSelectionMessage;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        FinancialConnectionsSessionManifest.Pane pane = this.nextPaneOnSelection;
        int iHashCode12 = (iHashCode11 + (pane == null ? 0 : pane.hashCode())) * 31;
        String str6 = this.institutionUrl;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.linkedAccountId;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.routingNumber;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        FinancialConnectionsAccount.Status status = this.status;
        return iHashCode15 + (status != null ? status.hashCode() : 0);
    }

    public final String i() {
        String str = this.displayableAccountNumbers;
        if (str == null) {
            str = "";
        }
        return "••••" + str;
    }

    public String toString() {
        return "PartnerAccount(authorization=" + this.authorization + ", category=" + this.category + ", id=" + this.id + ", name=" + this.name + ", subcategory=" + this.subcategory + ", supportedPaymentMethodTypes=" + this.supportedPaymentMethodTypes + ", balanceAmount=" + this.balanceAmount + ", currency=" + this.currency + ", institution=" + this.institution + ", displayableAccountNumbers=" + this.displayableAccountNumbers + ", initialBalanceAmount=" + this.initialBalanceAmount + ", institutionName=" + this.institutionName + ", _allowSelection=" + this._allowSelection + ", allowSelectionMessage=" + this.allowSelectionMessage + ", nextPaneOnSelection=" + this.nextPaneOnSelection + ", institutionUrl=" + this.institutionUrl + ", linkedAccountId=" + this.linkedAccountId + ", routingNumber=" + this.routingNumber + ", status=" + this.status + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.authorization);
        FinancialConnectionsAccount.Category category = this.category;
        if (category == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(category.name());
        }
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        FinancialConnectionsAccount.Subcategory subcategory = this.subcategory;
        if (subcategory == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(subcategory.name());
        }
        List<FinancialConnectionsAccount.SupportedPaymentMethodTypes> list = this.supportedPaymentMethodTypes;
        parcel.writeInt(list.size());
        Iterator<FinancialConnectionsAccount.SupportedPaymentMethodTypes> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
        Integer num = this.balanceAmount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.currency);
        FinancialConnectionsInstitution financialConnectionsInstitution = this.institution;
        if (financialConnectionsInstitution == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            financialConnectionsInstitution.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.displayableAccountNumbers);
        Integer num2 = this.initialBalanceAmount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.institutionName);
        Boolean bool = this._allowSelection;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.allowSelectionMessage);
        FinancialConnectionsSessionManifest.Pane pane = this.nextPaneOnSelection;
        if (pane == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(pane.name());
        }
        parcel.writeString(this.institutionUrl);
        parcel.writeString(this.linkedAccountId);
        parcel.writeString(this.routingNumber);
        FinancialConnectionsAccount.Status status = this.status;
        if (status == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(status.name());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PartnerAccount(String str, FinancialConnectionsAccount.Category category, String id2, String name, FinancialConnectionsAccount.Subcategory subcategory, List<? extends FinancialConnectionsAccount.SupportedPaymentMethodTypes> supportedPaymentMethodTypes, Integer num, String str2, FinancialConnectionsInstitution financialConnectionsInstitution, String str3, Integer num2, String str4, Boolean bool, String str5, FinancialConnectionsSessionManifest.Pane pane, String str6, String str7, String str8, FinancialConnectionsAccount.Status status) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(supportedPaymentMethodTypes, "supportedPaymentMethodTypes");
        this.authorization = str;
        this.category = category;
        this.id = id2;
        this.name = name;
        this.subcategory = subcategory;
        this.supportedPaymentMethodTypes = supportedPaymentMethodTypes;
        this.balanceAmount = num;
        this.currency = str2;
        this.institution = financialConnectionsInstitution;
        this.displayableAccountNumbers = str3;
        this.initialBalanceAmount = num2;
        this.institutionName = str4;
        this._allowSelection = bool;
        this.allowSelectionMessage = str5;
        this.nextPaneOnSelection = pane;
        this.institutionUrl = str6;
        this.linkedAccountId = str7;
        this.routingNumber = str8;
        this.status = status;
    }
}
