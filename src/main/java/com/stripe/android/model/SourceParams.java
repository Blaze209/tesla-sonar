package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.action.RedirectAction;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.stripe.android.model.j1, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bE\b\u0087\b\u0018\u0000 r2\u00020\u00012\u00020\u0002:\u000614@DJPB»\u0001\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e0\u0014H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020#HÖ\u0001¢\u0006\u0004\b*\u0010%J \u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020#HÖ\u0001¢\u0006\u0004\b/\u00100R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\"R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u00102\u001a\u0004\bA\u0010\"\"\u0004\bB\u0010CR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u00102\u001a\u0004\bQ\u0010\"\"\u0004\bR\u0010CR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u00102\u001a\u0004\b`\u0010\"\"\u0004\ba\u0010CR0\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010 \"\u0004\be\u0010fR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\b1\u0010mR\u0017\u0010q\u001a\u00020\u00038F¢\u0006\f\u0012\u0004\bo\u0010p\u001a\u0004\bn\u0010\"¨\u0006s"}, d2 = {"Lcom/stripe/android/model/j1;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "", "typeRaw", "Lcom/stripe/android/model/j1$f;", "typeData", "", "amount", "currency", "Lcom/stripe/android/model/j1$e;", "owner", "Lcom/stripe/android/model/Source$Usage;", "usage", "returnUrl", "Lcom/stripe/android/model/j1$d;", AnalyticsContext.Flow, "Lcom/stripe/android/model/i1;", "sourceOrder", "token", "", OrcaKeys.METADATA, "Lcom/stripe/android/model/j1$g;", "weChatParams", "Lcom/stripe/android/model/j1$a;", "apiParams", "", "attribution", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/j1$f;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/j1$e;Lcom/stripe/android/model/Source$Usage;Ljava/lang/String;Lcom/stripe/android/model/j1$d;Lcom/stripe/android/model/i1;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/model/j1$g;Lcom/stripe/android/model/j1$a;Ljava/util/Set;)V", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getTypeRaw", "b", "Lcom/stripe/android/model/j1$f;", "getTypeData$payments_core_release", "()Lcom/stripe/android/model/j1$f;", "setTypeData$payments_core_release", "(Lcom/stripe/android/model/j1$f;)V", "c", "Ljava/lang/Long;", "getAmount", "()Ljava/lang/Long;", "setAmount", "(Ljava/lang/Long;)V", DateTokenConverter.CONVERTER_KEY, "getCurrency", "setCurrency", "(Ljava/lang/String;)V", "e", "Lcom/stripe/android/model/j1$e;", "getOwner", "()Lcom/stripe/android/model/j1$e;", "setOwner", "(Lcom/stripe/android/model/j1$e;)V", "f", "Lcom/stripe/android/model/Source$Usage;", "getUsage", "()Lcom/stripe/android/model/Source$Usage;", "setUsage", "(Lcom/stripe/android/model/Source$Usage;)V", "g", "getReturnUrl", "setReturnUrl", "h", "Lcom/stripe/android/model/j1$d;", "getFlow", "()Lcom/stripe/android/model/j1$d;", "setFlow", "(Lcom/stripe/android/model/j1$d;)V", IntegerTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/i1;", "getSourceOrder", "()Lcom/stripe/android/model/i1;", "setSourceOrder", "(Lcom/stripe/android/model/i1;)V", "j", "getToken", "setToken", "k", "Ljava/util/Map;", "getMetadata", "setMetadata", "(Ljava/util/Map;)V", "l", "Lcom/stripe/android/model/j1$g;", "m", "Lcom/stripe/android/model/j1$a;", "n", "Ljava/util/Set;", "()Ljava/util/Set;", "getType", "getType$annotations", "()V", "type", "o", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SourceParams implements o1, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String typeRaw;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private f typeData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private Long amount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String currency;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private OwnerParams owner;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private Source.Usage usage;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private String returnUrl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private d flow;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private SourceOrderParams sourceOrder;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private String token;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private Map<String, String> metadata;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private WeChatParams weChatParams;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private ApiParams apiParams;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<String> attribution;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f51265p = 8;
    public static final Parcelable.Creator<SourceParams> CREATOR = new c();

    /* JADX INFO: renamed from: com.stripe.android.model.j1$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0018B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/j1$a;", "Landroid/os/Parcelable;", "", "", "", "value", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApiParams implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, Object> value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f51281c = 8;
        public static final Parcelable.Creator<ApiParams> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.j1$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/j1$a$a;", "", "Lcom/stripe/android/model/j1$a;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "", "flags", "Ljn0/h0;", "b", "(Lcom/stripe/android/model/j1$a;Landroid/os/Parcel;I)V", "a", "(Landroid/os/Parcel;)Lcom/stripe/android/model/j1$a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public ApiParams a(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                t30.e eVar = t30.e.f112281a;
                String string = parcel.readString();
                Map mapB = eVar.b(string != null ? new JSONObject(string) : null);
                if (mapB == null) {
                    mapB = p013kotlin.collections.v0.i();
                }
                return new ApiParams(mapB);
            }

            public void b(ApiParams apiParams, Parcel parcel, int i11) {
                p013kotlin.jvm.internal.s.k(apiParams, "<this>");
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                JSONObject jSONObjectD = t30.e.f112281a.d(apiParams.a());
                parcel.writeString(jSONObjectD != null ? jSONObjectD.toString() : null);
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.j1$a$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<ApiParams> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ApiParams createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return ApiParams.INSTANCE.a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ApiParams[] newArray(int i11) {
                return new ApiParams[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ApiParams() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Map<String, Object> a() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ApiParams) && p013kotlin.jvm.internal.s.f(this.value, ((ApiParams) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "ApiParams(value=" + this.value + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            INSTANCE.b(this, parcel, flags);
        }

        public ApiParams(Map<String, ? extends Object> value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            this.value = value;
        }

        public /* synthetic */ ApiParams(Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? p013kotlin.collections.v0.i() : map);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.j1$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<SourceParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SourceParams createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            String string = parcel.readString();
            f fVar = (f) parcel.readParcelable(SourceParams.class.getClassLoader());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            OwnerParams ownerParamsCreateFromParcel = parcel.readInt() == 0 ? null : OwnerParams.CREATOR.createFromParcel(parcel);
            Source.Usage usageValueOf = parcel.readInt() == 0 ? null : Source.Usage.valueOf(parcel.readString());
            String string3 = parcel.readString();
            d dVarValueOf = parcel.readInt() == 0 ? null : d.valueOf(parcel.readString());
            SourceOrderParams i1VarCreateFromParcel = parcel.readInt() == 0 ? null : SourceOrderParams.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i11 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            WeChatParams weChatParamsCreateFromParcel = parcel.readInt() == 0 ? null : WeChatParams.CREATOR.createFromParcel(parcel);
            ApiParams apiParamsCreateFromParcel = ApiParams.CREATOR.createFromParcel(parcel);
            int i13 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                linkedHashSet.add(parcel.readString());
            }
            return new SourceParams(string, fVar, lValueOf, string2, ownerParamsCreateFromParcel, usageValueOf, string3, dVarValueOf, i1VarCreateFromParcel, string4, linkedHashMap, weChatParamsCreateFromParcel, apiParamsCreateFromParcel, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SourceParams[] newArray(int i11) {
            return new SourceParams[i11];
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.j1$d */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/j1$d;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "Redirect", "Receiver", "CodeVerification", "None", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum d {
        Redirect(RedirectAction.ACTION_TYPE),
        Receiver("receiver"),
        CodeVerification("code_verification"),
        None("none");

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String code;

        d(String str) {
            this.code = str;
        }

        public static EnumEntries<d> getEntries() {
            return $ENTRIES;
        }

        /* JADX INFO: renamed from: getCode$payments_core_release, reason: from getter */
        public final String getCode() {
            return this.code;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.j1$e, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 02\u00020\u00012\u00020\u0002:\u0001\u001fB9\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0010\"\u0004\b(\u0010)R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\u0010\"\u0004\b,\u0010)R$\u0010\b\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010&\u001a\u0004\b.\u0010\u0010\"\u0004\b/\u0010)¨\u00061"}, d2 = {"Lcom/stripe/android/model/j1$e;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/b;", PlaceTypes.ADDRESS, "", Scopes.EMAIL, "name", "phone", "<init>", "(Lcom/stripe/android/model/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/b;", "getAddress$payments_core_release", "()Lcom/stripe/android/model/b;", "setAddress$payments_core_release", "(Lcom/stripe/android/model/b;)V", "b", "Ljava/lang/String;", "getEmail$payments_core_release", "setEmail$payments_core_release", "(Ljava/lang/String;)V", "c", "getName$payments_core_release", "setName$payments_core_release", DateTokenConverter.CONVERTER_KEY, "getPhone$payments_core_release", "setPhone$payments_core_release", "e", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OwnerParams implements o1, Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private Address address;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private String email;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private String name;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private String phone;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final a f51283e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f51284f = 8;
        public static final Parcelable.Creator<OwnerParams> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.j1$e$a */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/j1$e$a;", "", "<init>", "()V", "", "PARAM_ADDRESS", "Ljava/lang/String;", "PARAM_EMAIL", "PARAM_NAME", "PARAM_PHONE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.j1$e$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<OwnerParams> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final OwnerParams createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new OwnerParams(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final OwnerParams[] newArray(int i11) {
                return new OwnerParams[i11];
            }
        }

        public OwnerParams() {
            this(null, null, null, null, 15, null);
        }

        @Override // com.stripe.android.model.o1
        public Map<String, Object> c3() {
            Map mapI = p013kotlin.collections.v0.i();
            Address address = this.address;
            Map mapF = address != null ? p013kotlin.collections.v0.f(jn0.x.a(PlaceTypes.ADDRESS, address.c3())) : null;
            if (mapF == null) {
                mapF = p013kotlin.collections.v0.i();
            }
            Map mapR = p013kotlin.collections.v0.r(mapI, mapF);
            String str = this.email;
            Map mapF2 = str != null ? p013kotlin.collections.v0.f(jn0.x.a(Scopes.EMAIL, str)) : null;
            if (mapF2 == null) {
                mapF2 = p013kotlin.collections.v0.i();
            }
            Map mapR2 = p013kotlin.collections.v0.r(mapR, mapF2);
            String str2 = this.name;
            Map mapF3 = str2 != null ? p013kotlin.collections.v0.f(jn0.x.a("name", str2)) : null;
            if (mapF3 == null) {
                mapF3 = p013kotlin.collections.v0.i();
            }
            Map mapR3 = p013kotlin.collections.v0.r(mapR2, mapF3);
            String str3 = this.phone;
            Map mapF4 = str3 != null ? p013kotlin.collections.v0.f(jn0.x.a("phone", str3)) : null;
            if (mapF4 == null) {
                mapF4 = p013kotlin.collections.v0.i();
            }
            return p013kotlin.collections.v0.r(mapR3, mapF4);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OwnerParams)) {
                return false;
            }
            OwnerParams ownerParams = (OwnerParams) other;
            return p013kotlin.jvm.internal.s.f(this.address, ownerParams.address) && p013kotlin.jvm.internal.s.f(this.email, ownerParams.email) && p013kotlin.jvm.internal.s.f(this.name, ownerParams.name) && p013kotlin.jvm.internal.s.f(this.phone, ownerParams.phone);
        }

        public int hashCode() {
            Address address = this.address;
            int iHashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "OwnerParams(address=" + this.address + ", email=" + this.email + ", name=" + this.name + ", phone=" + this.phone + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            Address address = this.address;
            if (address == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.email);
            parcel.writeString(this.name);
            parcel.writeString(this.phone);
        }

        public OwnerParams(Address address, String str, String str2, String str3) {
            this.address = address;
            this.email = str;
            this.name = str2;
            this.phone = str3;
        }

        public /* synthetic */ OwnerParams(Address address, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : address, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.j1$f */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b0\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR(\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r0\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/j1$f;", "Landroid/os/Parcelable;", "<init>", "()V", "", "", "", "a", "()Ljava/util/Map;", "getType", "()Ljava/lang/String;", "type", "", "Lkotlin/Pair;", "b", "()Ljava/util/List;", "params", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class f implements Parcelable {
        private f() {
        }

        public final Map<String, Map<String, Object>> a() {
            Map<String, Map<String, Object>> mapF;
            List<Pair<String, Object>> listB = b();
            Map mapI = p013kotlin.collections.v0.i();
            Iterator<T> it = listB.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair pair = (Pair) it.next();
                String str = (String) pair.a();
                Object objB = pair.b();
                mapF = objB != null ? p013kotlin.collections.v0.f(jn0.x.a(str, objB)) : null;
                if (mapF == null) {
                    mapF = p013kotlin.collections.v0.i();
                }
                mapI = p013kotlin.collections.v0.r(mapI, mapF);
            }
            if (mapI.isEmpty()) {
                mapI = null;
            }
            mapF = mapI != null ? p013kotlin.collections.v0.f(jn0.x.a(getType(), mapI)) : null;
            return mapF == null ? p013kotlin.collections.v0.i() : mapF;
        }

        public abstract List<Pair<String, Object>> b();

        public abstract String getType();
    }

    /* JADX INFO: renamed from: com.stripe.android.model.j1$g, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001cB\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006 "}, d2 = {"Lcom/stripe/android/model/j1$g;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "", "appId", "statementDescriptor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "c", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WeChatParams implements o1, Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String appId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String statementDescriptor;
        public static final Parcelable.Creator<WeChatParams> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.j1$g$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<WeChatParams> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WeChatParams createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new WeChatParams(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final WeChatParams[] newArray(int i11) {
                return new WeChatParams[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WeChatParams() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.stripe.android.model.o1
        public Map<String, Object> c3() {
            Map mapI = p013kotlin.collections.v0.i();
            String str = this.appId;
            Map mapF = str != null ? p013kotlin.collections.v0.f(jn0.x.a("appid", str)) : null;
            if (mapF == null) {
                mapF = p013kotlin.collections.v0.i();
            }
            Map mapR = p013kotlin.collections.v0.r(mapI, mapF);
            String str2 = this.statementDescriptor;
            Map mapF2 = str2 != null ? p013kotlin.collections.v0.f(jn0.x.a("statement_descriptor", str2)) : null;
            if (mapF2 == null) {
                mapF2 = p013kotlin.collections.v0.i();
            }
            return p013kotlin.collections.v0.r(mapR, mapF2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WeChatParams)) {
                return false;
            }
            WeChatParams weChatParams = (WeChatParams) other;
            return p013kotlin.jvm.internal.s.f(this.appId, weChatParams.appId) && p013kotlin.jvm.internal.s.f(this.statementDescriptor, weChatParams.statementDescriptor);
        }

        public int hashCode() {
            String str = this.appId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.statementDescriptor;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "WeChatParams(appId=" + this.appId + ", statementDescriptor=" + this.statementDescriptor + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.appId);
            parcel.writeString(this.statementDescriptor);
        }

        public WeChatParams(String str, String str2) {
            this.appId = str;
            this.statementDescriptor = str2;
        }

        public /* synthetic */ WeChatParams(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
        }
    }

    public SourceParams(String typeRaw, f fVar, Long l11, String str, OwnerParams ownerParams, Source.Usage usage, String str2, d dVar, SourceOrderParams i1Var, String str3, Map<String, String> map, WeChatParams weChatParams, ApiParams apiParams, Set<String> attribution) {
        p013kotlin.jvm.internal.s.k(typeRaw, "typeRaw");
        p013kotlin.jvm.internal.s.k(apiParams, "apiParams");
        p013kotlin.jvm.internal.s.k(attribution, "attribution");
        this.typeRaw = typeRaw;
        this.typeData = fVar;
        this.amount = l11;
        this.currency = str;
        this.owner = ownerParams;
        this.usage = usage;
        this.returnUrl = str2;
        this.flow = dVar;
        this.sourceOrder = i1Var;
        this.token = str3;
        this.metadata = map;
        this.weChatParams = weChatParams;
        this.apiParams = apiParams;
        this.attribution = attribution;
    }

    public final Set<String> a() {
        return this.attribution;
    }

    @Override // com.stripe.android.model.o1
    public Map<String, Object> c3() {
        Map mapF = p013kotlin.collections.v0.f(jn0.x.a("type", this.typeRaw));
        Map<String, Object> mapA = this.apiParams.a();
        if (mapA.isEmpty()) {
            mapA = null;
        }
        Map mapF2 = mapA != null ? p013kotlin.collections.v0.f(jn0.x.a(this.typeRaw, mapA)) : null;
        if (mapF2 == null) {
            mapF2 = p013kotlin.collections.v0.i();
        }
        Map mapR = p013kotlin.collections.v0.r(mapF, mapF2);
        f fVar = this.typeData;
        Map<String, Map<String, Object>> mapA2 = fVar != null ? fVar.a() : null;
        if (mapA2 == null) {
            mapA2 = p013kotlin.collections.v0.i();
        }
        Map mapR2 = p013kotlin.collections.v0.r(mapR, mapA2);
        Long l11 = this.amount;
        Map mapF3 = l11 != null ? p013kotlin.collections.v0.f(jn0.x.a("amount", Long.valueOf(l11.longValue()))) : null;
        if (mapF3 == null) {
            mapF3 = p013kotlin.collections.v0.i();
        }
        Map mapR3 = p013kotlin.collections.v0.r(mapR2, mapF3);
        String str = this.currency;
        Map mapF4 = str != null ? p013kotlin.collections.v0.f(jn0.x.a("currency", str)) : null;
        if (mapF4 == null) {
            mapF4 = p013kotlin.collections.v0.i();
        }
        Map mapR4 = p013kotlin.collections.v0.r(mapR3, mapF4);
        d dVar = this.flow;
        Map mapF5 = dVar != null ? p013kotlin.collections.v0.f(jn0.x.a(AnalyticsContext.Flow, dVar.getCode())) : null;
        if (mapF5 == null) {
            mapF5 = p013kotlin.collections.v0.i();
        }
        Map mapR5 = p013kotlin.collections.v0.r(mapR4, mapF5);
        SourceOrderParams i1Var = this.sourceOrder;
        Map mapF6 = i1Var != null ? p013kotlin.collections.v0.f(jn0.x.a("source_order", i1Var.c3())) : null;
        if (mapF6 == null) {
            mapF6 = p013kotlin.collections.v0.i();
        }
        Map mapR6 = p013kotlin.collections.v0.r(mapR5, mapF6);
        OwnerParams ownerParams = this.owner;
        Map mapF7 = ownerParams != null ? p013kotlin.collections.v0.f(jn0.x.a("owner", ownerParams.c3())) : null;
        if (mapF7 == null) {
            mapF7 = p013kotlin.collections.v0.i();
        }
        Map mapR7 = p013kotlin.collections.v0.r(mapR6, mapF7);
        String str2 = this.returnUrl;
        Map mapF8 = str2 != null ? p013kotlin.collections.v0.f(jn0.x.a(RedirectAction.ACTION_TYPE, p013kotlin.collections.v0.f(jn0.x.a("return_url", str2)))) : null;
        if (mapF8 == null) {
            mapF8 = p013kotlin.collections.v0.i();
        }
        Map mapR8 = p013kotlin.collections.v0.r(mapR7, mapF8);
        Map<String, String> map = this.metadata;
        Map mapF9 = map != null ? p013kotlin.collections.v0.f(jn0.x.a(OrcaKeys.METADATA, map)) : null;
        if (mapF9 == null) {
            mapF9 = p013kotlin.collections.v0.i();
        }
        Map mapR9 = p013kotlin.collections.v0.r(mapR8, mapF9);
        String str3 = this.token;
        Map mapF10 = str3 != null ? p013kotlin.collections.v0.f(jn0.x.a("token", str3)) : null;
        if (mapF10 == null) {
            mapF10 = p013kotlin.collections.v0.i();
        }
        Map mapR10 = p013kotlin.collections.v0.r(mapR9, mapF10);
        Source.Usage usage = this.usage;
        Map mapF11 = usage != null ? p013kotlin.collections.v0.f(jn0.x.a("usage", usage.getCode())) : null;
        if (mapF11 == null) {
            mapF11 = p013kotlin.collections.v0.i();
        }
        Map mapR11 = p013kotlin.collections.v0.r(mapR10, mapF11);
        WeChatParams weChatParams = this.weChatParams;
        Map mapF12 = weChatParams != null ? p013kotlin.collections.v0.f(jn0.x.a(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE, weChatParams.c3())) : null;
        if (mapF12 == null) {
            mapF12 = p013kotlin.collections.v0.i();
        }
        return p013kotlin.collections.v0.r(mapR11, mapF12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SourceParams)) {
            return false;
        }
        SourceParams sourceParams = (SourceParams) other;
        return p013kotlin.jvm.internal.s.f(this.typeRaw, sourceParams.typeRaw) && p013kotlin.jvm.internal.s.f(this.typeData, sourceParams.typeData) && p013kotlin.jvm.internal.s.f(this.amount, sourceParams.amount) && p013kotlin.jvm.internal.s.f(this.currency, sourceParams.currency) && p013kotlin.jvm.internal.s.f(this.owner, sourceParams.owner) && this.usage == sourceParams.usage && p013kotlin.jvm.internal.s.f(this.returnUrl, sourceParams.returnUrl) && this.flow == sourceParams.flow && p013kotlin.jvm.internal.s.f(this.sourceOrder, sourceParams.sourceOrder) && p013kotlin.jvm.internal.s.f(this.token, sourceParams.token) && p013kotlin.jvm.internal.s.f(this.metadata, sourceParams.metadata) && p013kotlin.jvm.internal.s.f(this.weChatParams, sourceParams.weChatParams) && p013kotlin.jvm.internal.s.f(this.apiParams, sourceParams.apiParams) && p013kotlin.jvm.internal.s.f(this.attribution, sourceParams.attribution);
    }

    public final String getType() {
        return Source.INSTANCE.a(this.typeRaw);
    }

    public int hashCode() {
        int iHashCode = this.typeRaw.hashCode() * 31;
        f fVar = this.typeData;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Long l11 = this.amount;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.currency;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        OwnerParams ownerParams = this.owner;
        int iHashCode5 = (iHashCode4 + (ownerParams == null ? 0 : ownerParams.hashCode())) * 31;
        Source.Usage usage = this.usage;
        int iHashCode6 = (iHashCode5 + (usage == null ? 0 : usage.hashCode())) * 31;
        String str2 = this.returnUrl;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        d dVar = this.flow;
        int iHashCode8 = (iHashCode7 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        SourceOrderParams i1Var = this.sourceOrder;
        int iHashCode9 = (iHashCode8 + (i1Var == null ? 0 : i1Var.hashCode())) * 31;
        String str3 = this.token;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.metadata;
        int iHashCode11 = (iHashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        WeChatParams weChatParams = this.weChatParams;
        return ((((iHashCode11 + (weChatParams != null ? weChatParams.hashCode() : 0)) * 31) + this.apiParams.hashCode()) * 31) + this.attribution.hashCode();
    }

    public String toString() {
        return "SourceParams(typeRaw=" + this.typeRaw + ", typeData=" + this.typeData + ", amount=" + this.amount + ", currency=" + this.currency + ", owner=" + this.owner + ", usage=" + this.usage + ", returnUrl=" + this.returnUrl + ", flow=" + this.flow + ", sourceOrder=" + this.sourceOrder + ", token=" + this.token + ", metadata=" + this.metadata + ", weChatParams=" + this.weChatParams + ", apiParams=" + this.apiParams + ", attribution=" + this.attribution + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.typeRaw);
        parcel.writeParcelable(this.typeData, flags);
        Long l11 = this.amount;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
        parcel.writeString(this.currency);
        OwnerParams ownerParams = this.owner;
        if (ownerParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ownerParams.writeToParcel(parcel, flags);
        }
        Source.Usage usage = this.usage;
        if (usage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(usage.name());
        }
        parcel.writeString(this.returnUrl);
        d dVar = this.flow;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dVar.name());
        }
        SourceOrderParams i1Var = this.sourceOrder;
        if (i1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            i1Var.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.token);
        Map<String, String> map = this.metadata;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        WeChatParams weChatParams = this.weChatParams;
        if (weChatParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            weChatParams.writeToParcel(parcel, flags);
        }
        this.apiParams.writeToParcel(parcel, flags);
        Set<String> set = this.attribution;
        parcel.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
    }
}
