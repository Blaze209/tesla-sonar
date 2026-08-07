package com.content;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.d;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/reactnativestripesdk/m;", "Lcom/facebook/react/uimanager/events/d;", "Lcom/reactnativestripesdk/b;", "", "viewTag", "", "", "", "cardDetails", "", "complete", "dangerouslyGetFullCardDetails", "<init>", "(ILjava/util/Map;ZZ)V", "Lcom/facebook/react/bridge/WritableMap;", "a", "()Lcom/facebook/react/bridge/WritableMap;", "getEventName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "Ljn0/h0;", "dispatch", "(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V", "Ljava/util/Map;", "b", "Z", "c", DateTokenConverter.CONVERTER_KEY, "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m extends d<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> cardDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean complete;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean dangerouslyGetFullCardDetails;

    public m(int i11, Map<String, Object> map, boolean z11, boolean z12) {
        super(i11);
        this.cardDetails = map;
        this.complete = z11;
        this.dangerouslyGetFullCardDetails = z12;
    }

    private final WritableMap a() {
        String string;
        WritableMap writableMapCreateMap = Arguments.createMap();
        Map<String, Object> map = this.cardDetails;
        if (map == null) {
            s.h(writableMapCreateMap);
            return writableMapCreateMap;
        }
        Object obj = map.get("brand");
        writableMapCreateMap.putString("brand", obj != null ? obj.toString() : null);
        Object obj2 = this.cardDetails.get("last4");
        writableMapCreateMap.putString("last4", obj2 != null ? obj2.toString() : null);
        Object obj3 = this.cardDetails.get(PlaceTypes.COUNTRY);
        writableMapCreateMap.putString(PlaceTypes.COUNTRY, obj3 != null ? obj3.toString() : null);
        Object obj4 = this.cardDetails.get("expiryMonth");
        s.i(obj4, "null cannot be cast to non-null type kotlin.Int");
        writableMapCreateMap.putInt("expiryMonth", ((Integer) obj4).intValue());
        Object obj5 = this.cardDetails.get("expiryYear");
        s.i(obj5, "null cannot be cast to non-null type kotlin.Int");
        writableMapCreateMap.putInt("expiryYear", ((Integer) obj5).intValue());
        writableMapCreateMap.putBoolean("complete", this.complete);
        Object obj6 = this.cardDetails.get("postalCode");
        writableMapCreateMap.putString("postalCode", obj6 != null ? obj6.toString() : null);
        if (this.dangerouslyGetFullCardDetails) {
            Object obj7 = this.cardDetails.get(InquiryField.FloatField.TYPE2);
            writableMapCreateMap.putString(InquiryField.FloatField.TYPE2, (obj7 == null || (string = obj7.toString()) == null) ? null : t.V(string, " ", "", false, 4, null));
            Object obj8 = this.cardDetails.get("cvc");
            writableMapCreateMap.putString("cvc", obj8 != null ? obj8.toString() : null);
        }
        s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        s.k(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), a());
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "onFormComplete";
    }
}
