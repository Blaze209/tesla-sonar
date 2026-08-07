package com.adyen.checkout.sessions.core;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001&B1\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ@\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\rR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b$\u0010\u000b¨\u0006'"}, d2 = {"Lcom/adyen/checkout/sessions/core/SessionSetupInstallmentOptions;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", "", SessionSetupInstallmentOptions.PLANS, "", SessionSetupInstallmentOptions.PRESELECTED_VALUE, SessionSetupInstallmentOptions.VALUES, "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Integer;", "component3", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)Lcom/adyen/checkout/sessions/core/SessionSetupInstallmentOptions;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getPlans", "Ljava/lang/Integer;", "getPreselectedValue", "getValues", "Companion", "b", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionSetupInstallmentOptions extends b {
    private static final String PLANS = "plans";
    private static final String PRESELECTED_VALUE = "preselectedValue";
    private static final String VALUES = "values";
    private final List<String> plans;
    private final Integer preselectedValue;
    private final List<Integer> values;
    public static final Parcelable.Creator<SessionSetupInstallmentOptions> CREATOR = new c();
    public static final b.a<SessionSetupInstallmentOptions> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/sessions/core/SessionSetupInstallmentOptions$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/sessions/core/SessionSetupInstallmentOptions;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/sessions/core/SessionSetupInstallmentOptions;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/sessions/core/SessionSetupInstallmentOptions;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<SessionSetupInstallmentOptions> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SessionSetupInstallmentOptions b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            try {
                List<String> listG = com.adyen.checkout.core.internal.data.model.a.g(jsonObject, SessionSetupInstallmentOptions.PLANS);
                if (listG == null) {
                    listG = v.m();
                }
                return new SessionSetupInstallmentOptions(listG, Integer.valueOf(jsonObject.optInt(SessionSetupInstallmentOptions.PRESELECTED_VALUE)), com.adyen.checkout.core.internal.data.model.a.f(jsonObject, SessionSetupInstallmentOptions.VALUES));
            } catch (JSONException e11) {
                throw new ModelSerializationException(SessionSetupConfiguration.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(SessionSetupInstallmentOptions modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(SessionSetupInstallmentOptions.PLANS, oe.a.d(modelObject.getPlans()));
                jSONObject.putOpt(SessionSetupInstallmentOptions.PRESELECTED_VALUE, modelObject.getPreselectedValue());
                jSONObject.putOpt(SessionSetupInstallmentOptions.VALUES, oe.a.c(modelObject.getValues()));
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(SessionSetupResponse.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<SessionSetupInstallmentOptions> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SessionSetupInstallmentOptions createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList = arrayList2;
            }
            return new SessionSetupInstallmentOptions(arrayListCreateStringArrayList, numValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SessionSetupInstallmentOptions[] newArray(int i11) {
            return new SessionSetupInstallmentOptions[i11];
        }
    }

    public SessionSetupInstallmentOptions(List<String> list, Integer num, List<Integer> list2) {
        this.plans = list;
        this.preselectedValue = num;
        this.values = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionSetupInstallmentOptions copy$default(SessionSetupInstallmentOptions sessionSetupInstallmentOptions, List list, Integer num, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = sessionSetupInstallmentOptions.plans;
        }
        if ((i11 & 2) != 0) {
            num = sessionSetupInstallmentOptions.preselectedValue;
        }
        if ((i11 & 4) != 0) {
            list2 = sessionSetupInstallmentOptions.values;
        }
        return sessionSetupInstallmentOptions.copy(list, num, list2);
    }

    public final List<String> component1() {
        return this.plans;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getPreselectedValue() {
        return this.preselectedValue;
    }

    public final List<Integer> component3() {
        return this.values;
    }

    public final SessionSetupInstallmentOptions copy(List<String> plans, Integer preselectedValue, List<Integer> values) {
        return new SessionSetupInstallmentOptions(plans, preselectedValue, values);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionSetupInstallmentOptions)) {
            return false;
        }
        SessionSetupInstallmentOptions sessionSetupInstallmentOptions = (SessionSetupInstallmentOptions) other;
        return s.f(this.plans, sessionSetupInstallmentOptions.plans) && s.f(this.preselectedValue, sessionSetupInstallmentOptions.preselectedValue) && s.f(this.values, sessionSetupInstallmentOptions.values);
    }

    public final List<String> getPlans() {
        return this.plans;
    }

    public final Integer getPreselectedValue() {
        return this.preselectedValue;
    }

    public final List<Integer> getValues() {
        return this.values;
    }

    public int hashCode() {
        List<String> list = this.plans;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.preselectedValue;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list2 = this.values;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "SessionSetupInstallmentOptions(plans=" + this.plans + ", preselectedValue=" + this.preselectedValue + ", values=" + this.values + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeStringList(this.plans);
        Integer num = this.preselectedValue;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<Integer> list = this.values;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
    }
}
