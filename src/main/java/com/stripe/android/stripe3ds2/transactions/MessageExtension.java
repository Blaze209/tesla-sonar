package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import bo0.j;
import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transactions.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001\u001eB9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b\u001e\u0010$R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b!\u0010$¨\u0006)"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/c;", "Landroid/os/Parcelable;", "", "name", "id", "", "criticalityIndicator", "", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)V", "Lorg/json/JSONObject;", "c", "()Lorg/json/JSONObject;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getName", "b", "getId$3ds2sdk_release", "Z", "()Z", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Map;", "isProcessable", "e", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MessageExtension implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean criticalityIndicator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, String> data;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<MessageExtension> CREATOR = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List<String> f54148f = v.m();

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transactions.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/c$a;", "", "<init>", "()V", "Lorg/json/JSONObject;", "messageExtensionJson", "Lcom/stripe/android/stripe3ds2/transactions/c;", "a", "(Lorg/json/JSONObject;)Lcom/stripe/android/stripe3ds2/transactions/c;", "", "messageExtensions", "Lorg/json/JSONArray;", "c", "(Ljava/util/List;)Lorg/json/JSONArray;", "messageExtensionsJson", "b", "(Lorg/json/JSONArray;)Ljava/util/List;", "", "DATA_VALUE_MAX_LENGTH", "I", "", "FIELD_CRITICALITY_INDICATOR", "Ljava/lang/String;", "FIELD_DATA", "FIELD_ID", "FIELD_NAME", "ID_MAX_LENGTH", "MESSAGE_EXTENSIONS_MAX_COUNT", "NAME_MAX_LENGTH", "SUPPORTED_MESSAGE_EXTENSIONS", "Ljava/util/List;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final MessageExtension a(JSONObject messageExtensionJson) throws ChallengeResponseParseException {
            String strOptString = messageExtensionJson.optString("name");
            if (strOptString.length() > 64) {
                throw ChallengeResponseParseException.INSTANCE.a("messageExtension.name");
            }
            String strOptString2 = messageExtensionJson.optString("id");
            if (strOptString2.length() > 64) {
                throw ChallengeResponseParseException.INSTANCE.a("messageExtension.id");
            }
            HashMap map = new HashMap();
            JSONObject jSONObjectOptJSONObject = messageExtensionJson.optJSONObject("data");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString3 = jSONObjectOptJSONObject.optString(next);
                    if (strOptString3.length() > 8059) {
                        throw ChallengeResponseParseException.INSTANCE.a("messageExtension.data.value");
                    }
                    s.h(next);
                    s.h(strOptString3);
                    map.put(next, strOptString3);
                }
            }
            s.h(strOptString);
            s.h(strOptString2);
            return new MessageExtension(strOptString, strOptString2, messageExtensionJson.optBoolean("criticalityIndicator"), map);
        }

        public final List<MessageExtension> b(JSONArray messageExtensionsJson) {
            if (messageExtensionsJson == null) {
                return null;
            }
            j jVarW = n.w(0, messageExtensionsJson.length());
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = jVarW.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectOptJSONObject = messageExtensionsJson.optJSONObject(((s0) it).nextInt());
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(jSONObjectOptJSONObject);
                }
            }
            ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(MessageExtension.INSTANCE.a((JSONObject) it2.next()));
            }
            if (arrayList2.size() <= 10) {
                return arrayList2;
            }
            throw ChallengeResponseParseException.INSTANCE.a("messageExtensions");
        }

        public final JSONArray c(List<MessageExtension> messageExtensions) {
            if (messageExtensions == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = messageExtensions.iterator();
            while (it.hasNext()) {
                jSONArray.put(((MessageExtension) it.next()).c());
            }
            return jSONArray;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transactions.c$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<MessageExtension> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MessageExtension createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z11 = parcel.readInt() != 0;
            int i11 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new MessageExtension(string, string2, z11, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MessageExtension[] newArray(int i11) {
            return new MessageExtension[i11];
        }
    }

    public MessageExtension(String name, String id2, boolean z11, Map<String, String> data) {
        s.k(name, "name");
        s.k(id2, "id");
        s.k(data, "data");
        this.name = name;
        this.id = id2;
        this.criticalityIndicator = z11;
        this.data = data;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCriticalityIndicator() {
        return this.criticalityIndicator;
    }

    public final boolean b() {
        return f54148f.contains(this.name);
    }

    public final JSONObject c() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("name", this.name).put("id", this.id).put("criticalityIndicator", this.criticalityIndicator).put("data", new JSONObject(this.data));
        s.j(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageExtension)) {
            return false;
        }
        MessageExtension messageExtension = (MessageExtension) other;
        return s.f(this.name, messageExtension.name) && s.f(this.id, messageExtension.id) && this.criticalityIndicator == messageExtension.criticalityIndicator && s.f(this.data, messageExtension.data);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.id.hashCode()) * 31;
        boolean z11 = this.criticalityIndicator;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return ((iHashCode + r11) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "MessageExtension(name=" + this.name + ", id=" + this.id + ", criticalityIndicator=" + this.criticalityIndicator + ", data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.id);
        parcel.writeInt(this.criticalityIndicator ? 1 : 0);
        Map<String, String> map = this.data;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }
}
