package com.withpersona.sdk2.inquiry.steps.ui.components;

import a30.t;
import a30.w;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.steps.ui.network.Suggestion;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import oi0.e0;
import oi0.n0;
import oi0.n5;
import oi0.v;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import pi0.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b/\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 K2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001=B\u0095\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b!\u0010 J\u0019\u0010\"\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\"\u0010 J\u0019\u0010#\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b#\u0010 J\u0019\u0010$\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b$\u0010 J\u0019\u0010%\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b%\u0010 J\u001f\u0010&\u001a\u00020\u00002\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b)\u0010 J\u0019\u0010*\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b*\u0010\u001dJ\u001d\u00100\u001a\u00020/2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020-¢\u0006\u0004\b2\u00103J°\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020-HÖ\u0001¢\u0006\u0004\b8\u00103J\u001a\u0010;\u001a\u00020\u00162\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003¢\u0006\u0004\b;\u0010<R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u00107R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010>\u001a\u0004\bA\u00107\"\u0004\bB\u0010CR\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010>\u001a\u0004\bE\u00107\"\u0004\bF\u0010CR\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010>\u001a\u0004\bG\u00107\"\u0004\bH\u0010CR\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010>\u001a\u0004\bI\u00107\"\u0004\bJ\u0010CR\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010>\u001a\u0004\bK\u00107\"\u0004\bL\u0010CR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010M\u001a\u0004\bN\u0010OR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010M\u001a\u0004\bQ\u0010OR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\"\u0010R\u001a\u0004\bS\u0010TR$\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010>\u001a\u0004\bV\u00107\"\u0004\bW\u0010CR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010>\u001a\u0004\b^\u00107\"\u0004\b_\u0010CR$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010a\u001a\u0004\bg\u0010c\"\u0004\bh\u0010eR&\u0010n\u001a\b\u0012\u0004\u0012\u00020j0i8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bk\u0010Y\u0012\u0004\bl\u0010m\u001a\u0004\bP\u0010[R(\u0010v\u001a\u00020o8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bp\u0010q\u0012\u0004\bu\u0010m\u001a\u0004\b`\u0010r\"\u0004\bs\u0010tR(\u0010}\u001a\u00020w8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b4\u0010x\u0012\u0004\b|\u0010m\u001a\u0004\bU\u0010y\"\u0004\bz\u0010{R*\u0010\u0081\u0001\u001a\u00020w8\u0016@\u0016X\u0097\u000e¢\u0006\u0019\n\u0004\b~\u0010x\u0012\u0005\b\u0080\u0001\u0010m\u001a\u0004\bX\u0010y\"\u0004\b\u007f\u0010{R+\u0010\u0084\u0001\u001a\u00020w8\u0016@\u0016X\u0097\u000e¢\u0006\u001a\n\u0004\bS\u0010x\u0012\u0005\b\u0083\u0001\u0010m\u001a\u0004\b=\u0010y\"\u0005\b\u0082\u0001\u0010{R,\u0010\u0088\u0001\u001a\u00020w8\u0016@\u0016X\u0097\u000e¢\u0006\u001b\n\u0005\b\u0085\u0001\u0010x\u0012\u0005\b\u0087\u0001\u0010m\u001a\u0004\bD\u0010y\"\u0005\b\u0086\u0001\u0010{R+\u0010\u008b\u0001\u001a\u00020w8\u0016@\u0016X\u0097\u000e¢\u0006\u001a\n\u0004\bG\u0010x\u0012\u0005\b\u008a\u0001\u0010m\u001a\u0004\b@\u0010y\"\u0005\b\u0089\u0001\u0010{¨\u0006\u008c\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "Loi0/n5;", "Loi0/c;", "Loi0/v;", "Loi0/e0;", "", "name", "street1", "street2", "city", "subdivision", "postalCode", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "Lpi0/a;", "autocompleteMethod", "searchQuery", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;", "searchResults", "selectedSearchResultId", "", "isAddressAutocompleteLoading", "isAddressComponentsCollapsed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lpi0/a;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "newState", "e", "(Ljava/lang/Boolean;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "newString", "l", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "g", "f", "R", "S", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "resultId", "T", "Q", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lpi0/a;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "z", "setStreet1", "(Ljava/lang/String;)V", "c", "A", "setStreet2", "u", "setCity", "D", "setSubdivision", "v", "setPostalCode", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "h", "getDisabled", "Lpi0/a;", "s", "()Lpi0/a;", "j", "w", "setSearchQuery", "k", "Ljava/util/List;", "x", "()Ljava/util/List;", "setSearchResults", "(Ljava/util/List;)V", "y", "setSelectedSearchResultId", "m", "Ljava/lang/Boolean;", "E", "()Ljava/lang/Boolean;", "setAddressAutocompleteLoading", "(Ljava/lang/Boolean;)V", "n", Gender.FEMALE, "G", "", "Lxi0/a;", "o", "getAssociatedViews$annotations", "()V", "associatedViews", "Lpi0/n;", "p", "Lpi0/n;", "()Lpi0/n;", "K", "(Lpi0/n;)V", "isAddressFieldCollapsed$annotations", "isAddressFieldCollapsed", "La30/t;", "La30/t;", "()La30/t;", Gender.NONE, "(La30/t;)V", "getTextControllerForAddressStreet1$annotations", "textControllerForAddressStreet1", "r", Gender.OTHER, "getTextControllerForAddressStreet2$annotations", "textControllerForAddressStreet2", "L", "getTextControllerForAddressCity$annotations", "textControllerForAddressCity", "t", "P", "getTextControllerForAddressSubdivision$annotations", "textControllerForAddressSubdivision", Gender.MALE, "getTextControllerForAddressPostalCode$annotations", "textControllerForAddressPostalCode", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InputAddressComponent implements n5, oi0.c, v, e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String street1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String street2;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String city;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String subdivision;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private String postalCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final pi0.a autocompleteMethod;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private String searchQuery;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private List<Suggestion> searchResults;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private String selectedSearchResultId;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private Boolean isAddressAutocompleteLoading;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private Boolean isAddressComponentsCollapsed;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final List<xi0.a> associatedViews;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private n isAddressFieldCollapsed;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private t textControllerForAddressStreet1;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private t textControllerForAddressStreet2;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private t textControllerForAddressCity;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private t textControllerForAddressSubdivision;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private t textControllerForAddressPostalCode;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<InputAddressComponent> CREATOR = new b();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;", "config", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InputAddressComponent a(InputAddress config) {
            String lowerCase;
            String prefillAddressStreet1;
            String prefillAddressStreet2;
            String prefillAddressCity;
            String prefillAddressSubdivision;
            String prefillAddressPostalCode;
            String addressAutocompleteMethod;
            s.k(config, "config");
            InputAddress.Attributes attributes = config.getAttributes();
            if (attributes == null || (addressAutocompleteMethod = attributes.getAddressAutocompleteMethod()) == null) {
                lowerCase = null;
            } else {
                Locale US = Locale.US;
                s.j(US, "US");
                lowerCase = addressAutocompleteMethod.toLowerCase(US);
                s.j(lowerCase, "toLowerCase(...)");
            }
            pi0.a aVar = s.f(lowerCase, "none") ? pi0.a.None : pi0.a.Server;
            String name = config.getName();
            if (attributes == null || (prefillAddressStreet1 = attributes.getPrefillAddressStreet1()) == null) {
                prefillAddressStreet1 = "";
            }
            if (attributes == null || (prefillAddressStreet2 = attributes.getPrefillAddressStreet2()) == null) {
                prefillAddressStreet2 = "";
            }
            if (attributes == null || (prefillAddressCity = attributes.getPrefillAddressCity()) == null) {
                prefillAddressCity = "";
            }
            if (attributes == null || (prefillAddressSubdivision = attributes.getPrefillAddressSubdivision()) == null) {
                prefillAddressSubdivision = "";
            }
            if (attributes == null || (prefillAddressPostalCode = attributes.getPrefillAddressPostalCode()) == null) {
                prefillAddressPostalCode = "";
            }
            return new InputAddressComponent(name, prefillAddressStreet1, prefillAddressStreet2, prefillAddressCity, prefillAddressSubdivision, prefillAddressPostalCode, attributes != null ? attributes.getHidden() : null, attributes != null ? attributes.getDisabled() : null, aVar, null, null, null, null, Boolean.valueOf(n0.e(config) && aVar != pi0.a.None), 7680, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<InputAddressComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputAddressComponent createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            s.k(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            JsonLogicBoolean jsonLogicBoolean = (JsonLogicBoolean) parcel.readParcelable(InputAddressComponent.class.getClassLoader());
            JsonLogicBoolean jsonLogicBoolean2 = (JsonLogicBoolean) parcel.readParcelable(InputAddressComponent.class.getClassLoader());
            pi0.a aVarValueOf = pi0.a.valueOf(parcel.readString());
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(Suggestion.CREATOR.createFromParcel(parcel));
                }
            }
            return new InputAddressComponent(string, string2, string3, string4, string5, string6, jsonLogicBoolean, jsonLogicBoolean2, aVarValueOf, string7, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputAddressComponent[] newArray(int i11) {
            return new InputAddressComponent[i11];
        }
    }

    public InputAddressComponent(String name, String street1, String street2, String city, String subdivision, String postalCode, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, pi0.a autocompleteMethod, String str, List<Suggestion> list, String str2, Boolean bool, Boolean bool2) {
        s.k(name, "name");
        s.k(street1, "street1");
        s.k(street2, "street2");
        s.k(city, "city");
        s.k(subdivision, "subdivision");
        s.k(postalCode, "postalCode");
        s.k(autocompleteMethod, "autocompleteMethod");
        this.name = name;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.subdivision = subdivision;
        this.postalCode = postalCode;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.autocompleteMethod = autocompleteMethod;
        this.searchQuery = str;
        this.searchResults = list;
        this.selectedSearchResultId = str2;
        this.isAddressAutocompleteLoading = bool;
        this.isAddressComponentsCollapsed = bool2;
        this.associatedViews = new ArrayList();
        this.isAddressFieldCollapsed = new n(true);
        this.textControllerForAddressStreet1 = w.a(this.street1);
        this.textControllerForAddressStreet2 = w.a(this.street2);
        this.textControllerForAddressCity = w.a(this.city);
        this.textControllerForAddressSubdivision = w.a(this.subdivision);
        this.textControllerForAddressPostalCode = w.a(this.postalCode);
    }

    @com.squareup.moshi.g(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressCity$annotations() {
    }

    @com.squareup.moshi.g(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressPostalCode$annotations() {
    }

    @com.squareup.moshi.g(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressStreet1$annotations() {
    }

    @com.squareup.moshi.g(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressStreet2$annotations() {
    }

    @com.squareup.moshi.g(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressSubdivision$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputAddressComponent r(InputAddressComponent inputAddressComponent, String str, String str2, String str3, String str4, String str5, String str6, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, pi0.a aVar, String str7, List list, String str8, Boolean bool, Boolean bool2, int i11, Object obj) {
        return inputAddressComponent.q((i11 & 1) != 0 ? inputAddressComponent.name : str, (i11 & 2) != 0 ? inputAddressComponent.street1 : str2, (i11 & 4) != 0 ? inputAddressComponent.street2 : str3, (i11 & 8) != 0 ? inputAddressComponent.city : str4, (i11 & 16) != 0 ? inputAddressComponent.subdivision : str5, (i11 & 32) != 0 ? inputAddressComponent.postalCode : str6, (i11 & 64) != 0 ? inputAddressComponent.hidden : jsonLogicBoolean, (i11 & 128) != 0 ? inputAddressComponent.disabled : jsonLogicBoolean2, (i11 & 256) != 0 ? inputAddressComponent.autocompleteMethod : aVar, (i11 & 512) != 0 ? inputAddressComponent.searchQuery : str7, (i11 & 1024) != 0 ? inputAddressComponent.searchResults : list, (i11 & 2048) != 0 ? inputAddressComponent.selectedSearchResultId : str8, (i11 & 4096) != 0 ? inputAddressComponent.isAddressAutocompleteLoading : bool, (i11 & PKIFailureInfo.certRevoked) != 0 ? inputAddressComponent.isAddressComponentsCollapsed : bool2);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final String getStreet2() {
        return this.street2;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final String getSubdivision() {
        return this.subdivision;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final Boolean getIsAddressAutocompleteLoading() {
        return this.isAddressAutocompleteLoading;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final Boolean getIsAddressComponentsCollapsed() {
        return this.isAddressComponentsCollapsed;
    }

    public final void G(Boolean bool) {
        this.isAddressComponentsCollapsed = bool;
    }

    public void K(n nVar) {
        s.k(nVar, "<set-?>");
        this.isAddressFieldCollapsed = nVar;
    }

    public void L(t tVar) {
        s.k(tVar, "<set-?>");
        this.textControllerForAddressCity = tVar;
    }

    public void M(t tVar) {
        s.k(tVar, "<set-?>");
        this.textControllerForAddressPostalCode = tVar;
    }

    public void N(t tVar) {
        s.k(tVar, "<set-?>");
        this.textControllerForAddressStreet1 = tVar;
    }

    public void O(t tVar) {
        s.k(tVar, "<set-?>");
        this.textControllerForAddressStreet2 = tVar;
    }

    public void P(t tVar) {
        s.k(tVar, "<set-?>");
        this.textControllerForAddressSubdivision = tVar;
    }

    public InputAddressComponent Q(Boolean isAddressAutocompleteLoading) {
        return n0.f(r(this, null, null, null, null, null, null, null, null, null, null, null, null, isAddressAutocompleteLoading, null, 12287, null), this);
    }

    public InputAddressComponent R(String searchQuery) {
        return n0.f(r(this, null, null, null, null, null, null, null, null, null, searchQuery, null, null, null, null, 15871, null), this);
    }

    public InputAddressComponent S(List<Suggestion> searchResults) {
        return n0.f(r(this, null, null, null, null, null, null, null, null, null, null, searchResults, null, null, null, 15359, null), this);
    }

    public InputAddressComponent T(String resultId) {
        return n0.f(r(this, null, null, null, null, null, null, null, null, null, null, null, resultId, null, null, 14335, null), this);
    }

    @Override // oi0.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public t getTextControllerForAddressCity() {
        return this.textControllerForAddressCity;
    }

    @Override // oi0.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public t getTextControllerForAddressPostalCode() {
        return this.textControllerForAddressPostalCode;
    }

    @Override // oi0.c
    /* JADX INFO: renamed from: c, reason: from getter */
    public t getTextControllerForAddressSubdivision() {
        return this.textControllerForAddressSubdivision;
    }

    @Override // oi0.c
    public InputAddressComponent d(String newString) {
        return n0.f(r(this, null, null, newString == null ? "" : newString, null, null, null, null, null, null, null, null, null, null, null, 16379, null), this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // oi0.c
    public InputAddressComponent e(Boolean newState) {
        return n0.f(r(this, null, null, null, null, null, null, null, null, null, null, null, null, null, newState, 8191, null), this);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputAddressComponent)) {
            return false;
        }
        InputAddressComponent inputAddressComponent = (InputAddressComponent) other;
        return s.f(this.name, inputAddressComponent.name) && s.f(this.street1, inputAddressComponent.street1) && s.f(this.street2, inputAddressComponent.street2) && s.f(this.city, inputAddressComponent.city) && s.f(this.subdivision, inputAddressComponent.subdivision) && s.f(this.postalCode, inputAddressComponent.postalCode) && s.f(this.hidden, inputAddressComponent.hidden) && s.f(this.disabled, inputAddressComponent.disabled) && this.autocompleteMethod == inputAddressComponent.autocompleteMethod && s.f(this.searchQuery, inputAddressComponent.searchQuery) && s.f(this.searchResults, inputAddressComponent.searchResults) && s.f(this.selectedSearchResultId, inputAddressComponent.selectedSearchResultId) && s.f(this.isAddressAutocompleteLoading, inputAddressComponent.isAddressAutocompleteLoading) && s.f(this.isAddressComponentsCollapsed, inputAddressComponent.isAddressComponentsCollapsed);
    }

    @Override // oi0.c
    public InputAddressComponent f(String newString) {
        return n0.f(r(this, null, null, null, null, null, newString == null ? "" : newString, null, null, null, null, null, null, null, null, 16351, null), this);
    }

    @Override // oi0.c
    public InputAddressComponent g(String newString) {
        return n0.f(r(this, null, null, null, null, newString == null ? "" : newString, null, null, null, null, null, null, null, null, null, 16367, null), this);
    }

    @Override // oi0.v
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // oi0.e0
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // oi0.n5
    public String getName() {
        return this.name;
    }

    @Override // oi0.e0
    public List<xi0.a> h() {
        return this.associatedViews;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.name.hashCode() * 31) + this.street1.hashCode()) * 31) + this.street2.hashCode()) * 31) + this.city.hashCode()) * 31) + this.subdivision.hashCode()) * 31) + this.postalCode.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode3 = (((iHashCode2 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31) + this.autocompleteMethod.hashCode()) * 31;
        String str = this.searchQuery;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<Suggestion> list = this.searchResults;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.selectedSearchResultId;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isAddressAutocompleteLoading;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAddressComponentsCollapsed;
        return iHashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Override // oi0.c
    public InputAddressComponent i(String newString) {
        return n0.f(r(this, null, null, null, newString == null ? "" : newString, null, null, null, null, null, null, null, null, null, null, 16375, null), this);
    }

    @Override // oi0.c
    /* JADX INFO: renamed from: j, reason: from getter */
    public t getTextControllerForAddressStreet1() {
        return this.textControllerForAddressStreet1;
    }

    @Override // oi0.c
    /* JADX INFO: renamed from: k, reason: from getter */
    public t getTextControllerForAddressStreet2() {
        return this.textControllerForAddressStreet2;
    }

    @Override // oi0.c
    public InputAddressComponent l(String newString) {
        return n0.f(r(this, null, newString == null ? "" : newString, null, null, null, null, null, null, null, null, null, null, null, null, 16381, null), this);
    }

    @Override // oi0.c
    /* JADX INFO: renamed from: m, reason: from getter */
    public n getIsAddressFieldCollapsed() {
        return this.isAddressFieldCollapsed;
    }

    public final InputAddressComponent q(String name, String street1, String street2, String city, String subdivision, String postalCode, JsonLogicBoolean hidden, JsonLogicBoolean disabled, pi0.a autocompleteMethod, String searchQuery, List<Suggestion> searchResults, String selectedSearchResultId, Boolean isAddressAutocompleteLoading, Boolean isAddressComponentsCollapsed) {
        s.k(name, "name");
        s.k(street1, "street1");
        s.k(street2, "street2");
        s.k(city, "city");
        s.k(subdivision, "subdivision");
        s.k(postalCode, "postalCode");
        s.k(autocompleteMethod, "autocompleteMethod");
        return new InputAddressComponent(name, street1, street2, city, subdivision, postalCode, hidden, disabled, autocompleteMethod, searchQuery, searchResults, selectedSearchResultId, isAddressAutocompleteLoading, isAddressComponentsCollapsed);
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final pi0.a getAutocompleteMethod() {
        return this.autocompleteMethod;
    }

    public String toString() {
        return "InputAddressComponent(name=" + this.name + ", street1=" + this.street1 + ", street2=" + this.street2 + ", city=" + this.city + ", subdivision=" + this.subdivision + ", postalCode=" + this.postalCode + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", autocompleteMethod=" + this.autocompleteMethod + ", searchQuery=" + this.searchQuery + ", searchResults=" + this.searchResults + ", selectedSearchResultId=" + this.selectedSearchResultId + ", isAddressAutocompleteLoading=" + this.isAddressAutocompleteLoading + ", isAddressComponentsCollapsed=" + this.isAddressComponentsCollapsed + ")";
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.street1);
        dest.writeString(this.street2);
        dest.writeString(this.city);
        dest.writeString(this.subdivision);
        dest.writeString(this.postalCode);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeString(this.autocompleteMethod.name());
        dest.writeString(this.searchQuery);
        List<Suggestion> list = this.searchResults;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<Suggestion> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.selectedSearchResultId);
        Boolean bool = this.isAddressAutocompleteLoading;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isAddressComponentsCollapsed;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public final List<Suggestion> x() {
        return this.searchResults;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getSelectedSearchResultId() {
        return this.selectedSearchResultId;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getStreet1() {
        return this.street1;
    }

    public /* synthetic */ InputAddressComponent(String str, String str2, String str3, String str4, String str5, String str6, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, pi0.a aVar, String str7, List list, String str8, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, jsonLogicBoolean, jsonLogicBoolean2, aVar, (i11 & 512) != 0 ? null : str7, (i11 & 1024) != 0 ? null : list, (i11 & 2048) != 0 ? null : str8, (i11 & 4096) != 0 ? null : bool, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : bool2);
    }
}
