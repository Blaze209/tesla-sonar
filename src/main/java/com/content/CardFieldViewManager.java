package com.content;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.v0;
import java.util.ArrayList;
import java.util.Map;
import jn.c;
import no.a;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u0017J!\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001b\u0010\u0017J\u001f\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b$\u0010\"J\u001f\u0010&\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u001cH\u0007¢\u0006\u0004\b&\u0010\u001fJ\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0014H\u0007¢\u0006\u0004\b(\u0010\u0017J!\u0010*\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/reactnativestripesdk/CardFieldViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/reactnativestripesdk/k;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "Ljn0/h0;", "receiveCommand", "(Lcom/reactnativestripesdk/k;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "view", "", "dangerouslyGetFullCardDetails", "setDangerouslyGetFullCardDetails", "(Lcom/reactnativestripesdk/k;Z)V", "postalCodeEnabled", "setPostalCodeEnabled", "autofocus", "setAutofocus", "Lcom/facebook/react/bridge/ReadableMap;", "cardStyle", "setCardStyle", "(Lcom/reactnativestripesdk/k;Lcom/facebook/react/bridge/ReadableMap;)V", "countryCode", "setCountryCode", "(Lcom/reactnativestripesdk/k;Ljava/lang/String;)V", "onBehalfOf", "setOnBehalfOf", "placeholders", "setPlaceHolders", "isDisabled", "setDisabled", "preferredNetworks", "setPreferredNetworks", "(Lcom/reactnativestripesdk/k;Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/facebook/react/uimanager/v0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/reactnativestripesdk/k;", "onDropViewInstance", "(Lcom/reactnativestripesdk/k;)V", "reactContextRef", "Lcom/facebook/react/uimanager/v0;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CardFieldViewManager extends SimpleViewManager<k> {
    private v0 reactContextRef;

    public static /* synthetic */ void setAutofocus$default(CardFieldViewManager cardFieldViewManager, k kVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        cardFieldViewManager.setAutofocus(kVar, z11);
    }

    public static /* synthetic */ void setDangerouslyGetFullCardDetails$default(CardFieldViewManager cardFieldViewManager, k kVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        cardFieldViewManager.setDangerouslyGetFullCardDetails(kVar, z11);
    }

    public static /* synthetic */ void setPostalCodeEnabled$default(CardFieldViewManager cardFieldViewManager, k kVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        cardFieldViewManager.setPostalCodeEnabled(kVar, z11);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> mapE = c.e("topFocusChange", c.d("registrationName", "onFocusChange"), "onCardChange", c.d("registrationName", "onCardChange"));
        s.j(mapE, "of(...)");
        return mapE;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CardField";
    }

    @a(name = "autofocus")
    public final void setAutofocus(k view, boolean autofocus) {
        s.k(view, "view");
        view.setAutofocus(autofocus);
    }

    @a(name = "cardStyle")
    public final void setCardStyle(k view, ReadableMap cardStyle) {
        s.k(view, "view");
        s.k(cardStyle, "cardStyle");
        view.setCardStyle(cardStyle);
    }

    @a(name = "countryCode")
    public final void setCountryCode(k view, String countryCode) {
        s.k(view, "view");
        view.setCountryCode(countryCode);
    }

    @a(name = "dangerouslyGetFullCardDetails")
    public final void setDangerouslyGetFullCardDetails(k view, boolean dangerouslyGetFullCardDetails) {
        s.k(view, "view");
        view.setDangerouslyGetFullCardDetails(dangerouslyGetFullCardDetails);
    }

    @a(name = "disabled")
    public final void setDisabled(k view, boolean isDisabled) {
        s.k(view, "view");
        view.setDisabled(isDisabled);
    }

    @a(name = "onBehalfOf")
    public final void setOnBehalfOf(k view, String onBehalfOf) {
        s.k(view, "view");
        view.setOnBehalfOf(onBehalfOf);
    }

    @a(name = "placeholders")
    public final void setPlaceHolders(k view, ReadableMap placeholders) {
        s.k(view, "view");
        s.k(placeholders, "placeholders");
        view.setPlaceHolders(placeholders);
    }

    @a(name = "postalCodeEnabled")
    public final void setPostalCodeEnabled(k view, boolean postalCodeEnabled) {
        s.k(view, "view");
        view.setPostalCodeEnabled(postalCodeEnabled);
    }

    @a(name = "preferredNetworks")
    public final void setPreferredNetworks(k view, ReadableArray preferredNetworks) {
        ArrayList<Integer> arrayList;
        ArrayList<Object> arrayList2;
        s.k(view, "view");
        if (preferredNetworks == null || (arrayList2 = preferredNetworks.toArrayList()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (obj instanceof Integer) {
                    arrayList3.add(obj);
                }
            }
            arrayList = new ArrayList<>(arrayList3);
        }
        view.setPreferredNetworks(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public k createViewInstance(v0 reactContext) {
        s.k(reactContext, "reactContext");
        StripeSdkModule stripeSdkModule = (StripeSdkModule) reactContext.getNativeModule(StripeSdkModule.class);
        k kVar = new k(reactContext);
        this.reactContextRef = reactContext;
        if (stripeSdkModule != null) {
            stripeSdkModule.setCardFieldView(kVar);
        }
        return kVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(k view) {
        s.k(view, "view");
        super.onDropViewInstance(view);
        v0 v0Var = this.reactContextRef;
        StripeSdkModule stripeSdkModule = v0Var != null ? (StripeSdkModule) v0Var.getNativeModule(StripeSdkModule.class) : null;
        if (stripeSdkModule != null) {
            stripeSdkModule.setCardFieldView(null);
        }
        this.reactContextRef = null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(k root, String commandId, ReadableArray args) {
        s.k(root, "root");
        if (commandId != null) {
            int iHashCode = commandId.hashCode();
            if (iHashCode == 3027047) {
                if (commandId.equals("blur")) {
                    root.p();
                }
            } else if (iHashCode == 94746189) {
                if (commandId.equals("clear")) {
                    root.q();
                }
            } else if (iHashCode == 97604824 && commandId.equals("focus")) {
                root.r();
            }
        }
    }
}
