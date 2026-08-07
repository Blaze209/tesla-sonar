package com.adyen.checkout.components.core.internal.data.model;

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
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0001*B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010JL\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\rR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0010R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b(\u0010\u0010¨\u0006+"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackRequest;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", AnalyticsTrackRequest.CHANNEL, AnalyticsTrackRequest.PLATFORM, "", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackInfo;", AnalyticsTrackRequest.INFO, "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackLog;", AnalyticsTrackRequest.LOGS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackRequest;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getChannel", "getPlatform", "Ljava/util/List;", "getInfo", "getLogs", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AnalyticsTrackRequest extends b {
    private static final String CHANNEL = "channel";
    private static final String INFO = "info";
    private static final String LOGS = "logs";
    private static final String PLATFORM = "platform";
    private final String channel;
    private final List<AnalyticsTrackInfo> info;
    private final List<AnalyticsTrackLog> logs;
    private final String platform;
    public static final Parcelable.Creator<AnalyticsTrackRequest> CREATOR = new c();
    public static final b.a<AnalyticsTrackRequest> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/internal/data/model/AnalyticsTrackRequest$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackRequest;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackRequest;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackRequest;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<AnalyticsTrackRequest> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AnalyticsTrackRequest b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            try {
                return new AnalyticsTrackRequest(com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsTrackRequest.CHANNEL), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsTrackRequest.PLATFORM), com.adyen.checkout.core.internal.data.model.c.b(jsonObject.getJSONArray(AnalyticsTrackRequest.INFO), AnalyticsTrackInfo.SERIALIZER), com.adyen.checkout.core.internal.data.model.c.b(jsonObject.getJSONArray(AnalyticsTrackRequest.LOGS), AnalyticsTrackLog.SERIALIZER));
            } catch (JSONException e11) {
                throw new ModelSerializationException(AnalyticsTrackRequest.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(AnalyticsTrackRequest modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(AnalyticsTrackRequest.CHANNEL, modelObject.getChannel());
                jSONObject.putOpt(AnalyticsTrackRequest.PLATFORM, modelObject.getPlatform());
                jSONObject.putOpt(AnalyticsTrackRequest.INFO, com.adyen.checkout.core.internal.data.model.c.d(modelObject.getInfo(), AnalyticsTrackInfo.SERIALIZER));
                jSONObject.putOpt(AnalyticsTrackRequest.LOGS, com.adyen.checkout.core.internal.data.model.c.d(modelObject.getLogs(), AnalyticsTrackLog.SERIALIZER));
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(AnalyticsTrackRequest.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<AnalyticsTrackRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnalyticsTrackRequest createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            s.k(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(AnalyticsTrackInfo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(AnalyticsTrackLog.CREATOR.createFromParcel(parcel));
                }
            }
            return new AnalyticsTrackRequest(string, string2, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AnalyticsTrackRequest[] newArray(int i11) {
            return new AnalyticsTrackRequest[i11];
        }
    }

    public AnalyticsTrackRequest(String str, String str2, List<AnalyticsTrackInfo> list, List<AnalyticsTrackLog> list2) {
        this.channel = str;
        this.platform = str2;
        this.info = list;
        this.logs = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalyticsTrackRequest copy$default(AnalyticsTrackRequest analyticsTrackRequest, String str, String str2, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = analyticsTrackRequest.channel;
        }
        if ((i11 & 2) != 0) {
            str2 = analyticsTrackRequest.platform;
        }
        if ((i11 & 4) != 0) {
            list = analyticsTrackRequest.info;
        }
        if ((i11 & 8) != 0) {
            list2 = analyticsTrackRequest.logs;
        }
        return analyticsTrackRequest.copy(str, str2, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    public final List<AnalyticsTrackInfo> component3() {
        return this.info;
    }

    public final List<AnalyticsTrackLog> component4() {
        return this.logs;
    }

    public final AnalyticsTrackRequest copy(String channel, String platform, List<AnalyticsTrackInfo> info, List<AnalyticsTrackLog> logs) {
        return new AnalyticsTrackRequest(channel, platform, info, logs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsTrackRequest)) {
            return false;
        }
        AnalyticsTrackRequest analyticsTrackRequest = (AnalyticsTrackRequest) other;
        return s.f(this.channel, analyticsTrackRequest.channel) && s.f(this.platform, analyticsTrackRequest.platform) && s.f(this.info, analyticsTrackRequest.info) && s.f(this.logs, analyticsTrackRequest.logs);
    }

    public final String getChannel() {
        return this.channel;
    }

    public final List<AnalyticsTrackInfo> getInfo() {
        return this.info;
    }

    public final List<AnalyticsTrackLog> getLogs() {
        return this.logs;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public int hashCode() {
        String str = this.channel;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.platform;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<AnalyticsTrackInfo> list = this.info;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<AnalyticsTrackLog> list2 = this.logs;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "AnalyticsTrackRequest(channel=" + this.channel + ", platform=" + this.platform + ", info=" + this.info + ", logs=" + this.logs + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.channel);
        parcel.writeString(this.platform);
        List<AnalyticsTrackInfo> list = this.info;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AnalyticsTrackInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        List<AnalyticsTrackLog> list2 = this.logs;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<AnalyticsTrackLog> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, flags);
        }
    }
}
