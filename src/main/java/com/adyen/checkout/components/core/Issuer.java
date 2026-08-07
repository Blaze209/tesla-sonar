package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001(B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\n\"\u0004\b \u0010!R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\"\u0010\n\"\u0004\b#\u0010!R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010$\u001a\u0004\b\u0006\u0010\r\"\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/adyen/checkout/components/core/Issuer;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", Issuer.ID, "name", "", "isDisabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/adyen/checkout/components/core/Issuer;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "getName", "setName", "Z", "setDisabled", "(Z)V", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Issuer extends b {
    private static final String DISABLED = "disabled";
    private static final String ID = "id";
    private static final String NAME = "name";
    private String id;
    private boolean isDisabled;
    private String name;
    public static final Parcelable.Creator<Issuer> CREATOR = new c();
    public static final b.a<Issuer> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/Issuer$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/Issuer;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/Issuer;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/Issuer;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<Issuer> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Issuer b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            return new Issuer(com.adyen.checkout.core.internal.data.model.a.e(jsonObject, Issuer.ID), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "name"), jsonObject.optBoolean(Issuer.DISABLED, false));
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(Issuer modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(Issuer.ID, modelObject.getId());
                jSONObject.putOpt("name", modelObject.getName());
                jSONObject.putOpt(Issuer.DISABLED, Boolean.valueOf(modelObject.isDisabled()));
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(Issuer.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<Issuer> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Issuer createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new Issuer(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Issuer[] newArray(int i11) {
            return new Issuer[i11];
        }
    }

    public Issuer() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ Issuer copy$default(Issuer issuer, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = issuer.id;
        }
        if ((i11 & 2) != 0) {
            str2 = issuer.name;
        }
        if ((i11 & 4) != 0) {
            z11 = issuer.isDisabled;
        }
        return issuer.copy(str, str2, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    public final Issuer copy(String id2, String name, boolean isDisabled) {
        return new Issuer(id2, name, isDisabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Issuer)) {
            return false;
        }
        Issuer issuer = (Issuer) other;
        return s.f(this.id, issuer.id) && s.f(this.name, issuer.name) && this.isDisabled == issuer.isDisabled;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isDisabled);
    }

    public final boolean isDisabled() {
        return this.isDisabled;
    }

    public final void setDisabled(boolean z11) {
        this.isDisabled = z11;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return "Issuer(id=" + this.id + ", name=" + this.name + ", isDisabled=" + this.isDisabled + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeInt(this.isDisabled ? 1 : 0);
    }

    public /* synthetic */ Issuer(String str, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? false : z11);
    }

    public Issuer(String str, String str2, boolean z11) {
        this.id = str;
        this.name = str2;
        this.isDisabled = z11;
    }
}
