package com.content;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.d;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/reactnativestripesdk/b;", "Lcom/facebook/react/uimanager/events/d;", "", "viewTag", "", "", "", "cardDetails", "", "postalCodeEnabled", "complete", "dangerouslyGetFullCardDetails", "<init>", "(ILjava/util/Map;ZZZ)V", "Lcom/facebook/react/bridge/WritableMap;", "a", "()Lcom/facebook/react/bridge/WritableMap;", "getEventName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "Ljn0/h0;", "dispatch", "(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V", "Ljava/util/Map;", "b", "Z", "c", DateTokenConverter.CONVERTER_KEY, "e", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends d<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> cardDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean postalCodeEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean complete;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean dangerouslyGetFullCardDetails;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i11, Map<String, Object> cardDetails, boolean z11, boolean z12, boolean z13) {
        super(i11);
        s.k(cardDetails, "cardDetails");
        this.cardDetails = cardDetails;
        this.postalCodeEnabled = z11;
        this.complete = z12;
        this.dangerouslyGetFullCardDetails = z13;
    }

    private final WritableMap a() {
        String string;
        WritableMap writableMapCreateMap = Arguments.createMap();
        Object obj = this.cardDetails.get("brand");
        writableMapCreateMap.putString("brand", obj != null ? obj.toString() : null);
        Object obj2 = this.cardDetails.get("last4");
        writableMapCreateMap.putString("last4", obj2 != null ? obj2.toString() : null);
        Integer num = (Integer) this.cardDetails.get("expiryMonth");
        if (num != null) {
            writableMapCreateMap.putInt("expiryMonth", num.intValue());
        } else {
            writableMapCreateMap.putNull("expiryMonth");
        }
        Integer num2 = (Integer) this.cardDetails.get("expiryYear");
        if (num2 != null) {
            writableMapCreateMap.putInt("expiryYear", num2.intValue());
        } else {
            writableMapCreateMap.putNull("expiryYear");
        }
        writableMapCreateMap.putBoolean("complete", this.complete);
        Object obj3 = this.cardDetails.get("validNumber");
        writableMapCreateMap.putString("validNumber", obj3 != null ? obj3.toString() : null);
        Object obj4 = this.cardDetails.get("validCVC");
        writableMapCreateMap.putString("validCVC", obj4 != null ? obj4.toString() : null);
        Object obj5 = this.cardDetails.get("validExpiryDate");
        writableMapCreateMap.putString("validExpiryDate", obj5 != null ? obj5.toString() : null);
        if (this.postalCodeEnabled) {
            Object obj6 = this.cardDetails.get("postalCode");
            writableMapCreateMap.putString("postalCode", obj6 != null ? obj6.toString() : null);
        }
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
        return "onCardChange";
    }
}
