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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001f\u0010\u0017J\u001f\u0010!\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001aH\u0007¢\u0006\u0004\b!\u0010\u001dJ\u001f\u0010#\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001aH\u0007¢\u0006\u0004\b#\u0010\u001dJ\u001f\u0010%\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0014H\u0007¢\u0006\u0004\b%\u0010\u0017J!\u0010'\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/reactnativestripesdk/CardFormViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/reactnativestripesdk/v;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "Ljn0/h0;", "receiveCommand", "(Lcom/reactnativestripesdk/v;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "view", "", "dangerouslyGetFullCardDetails", "setDangerouslyGetFullCardDetails", "(Lcom/reactnativestripesdk/v;Z)V", "postalCodeEnabled", "setPostalCodeEnabled", "Lcom/facebook/react/bridge/ReadableMap;", "placeholders", "setPlaceHolders", "(Lcom/reactnativestripesdk/v;Lcom/facebook/react/bridge/ReadableMap;)V", "autofocus", "setAutofocus", "cardStyle", "setCardStyle", "defaults", "setDefaultValues", "isDisabled", "setDisabled", "preferredNetworks", "setPreferredNetworks", "(Lcom/reactnativestripesdk/v;Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/facebook/react/uimanager/v0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/reactnativestripesdk/v;", "onDropViewInstance", "(Lcom/reactnativestripesdk/v;)V", "reactContextRef", "Lcom/facebook/react/uimanager/v0;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CardFormViewManager extends SimpleViewManager<v> {
    private v0 reactContextRef;

    public static /* synthetic */ void setAutofocus$default(CardFormViewManager cardFormViewManager, v vVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        cardFormViewManager.setAutofocus(vVar, z11);
    }

    public static /* synthetic */ void setDangerouslyGetFullCardDetails$default(CardFormViewManager cardFormViewManager, v vVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        cardFormViewManager.setDangerouslyGetFullCardDetails(vVar, z11);
    }

    public static /* synthetic */ void setPostalCodeEnabled$default(CardFormViewManager cardFormViewManager, v vVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        cardFormViewManager.setPostalCodeEnabled(vVar, z11);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> mapE = c.e("topFocusChange", c.d("registrationName", "onFocusChange"), "onFormComplete", c.d("registrationName", "onFormComplete"));
        s.j(mapE, "of(...)");
        return mapE;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CardForm";
    }

    @a(name = "autofocus")
    public final void setAutofocus(v view, boolean autofocus) {
        s.k(view, "view");
        view.setAutofocus(autofocus);
    }

    @a(name = "cardStyle")
    public final void setCardStyle(v view, ReadableMap cardStyle) {
        s.k(view, "view");
        s.k(cardStyle, "cardStyle");
        view.setCardStyle(cardStyle);
    }

    @a(name = "dangerouslyGetFullCardDetails")
    public final void setDangerouslyGetFullCardDetails(v view, boolean dangerouslyGetFullCardDetails) {
        s.k(view, "view");
        view.setDangerouslyGetFullCardDetails(dangerouslyGetFullCardDetails);
    }

    @a(name = "defaultValues")
    public final void setDefaultValues(v view, ReadableMap defaults) {
        s.k(view, "view");
        s.k(defaults, "defaults");
        view.setDefaultValues(defaults);
    }

    @a(name = "disabled")
    public final void setDisabled(v view, boolean isDisabled) {
        s.k(view, "view");
        view.setDisabled(isDisabled);
    }

    @a(name = "placeholders")
    public final void setPlaceHolders(v view, ReadableMap placeholders) {
        s.k(view, "view");
        s.k(placeholders, "placeholders");
        view.setPlaceHolders(placeholders);
    }

    @a(name = "postalCodeEnabled")
    public final void setPostalCodeEnabled(v view, boolean postalCodeEnabled) {
        s.k(view, "view");
        view.setPostalCodeEnabled(postalCodeEnabled);
    }

    @a(name = "preferredNetworks")
    public final void setPreferredNetworks(v view, ReadableArray preferredNetworks) {
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
    public v createViewInstance(v0 reactContext) {
        s.k(reactContext, "reactContext");
        StripeSdkModule stripeSdkModule = (StripeSdkModule) reactContext.getNativeModule(StripeSdkModule.class);
        v vVar = new v(reactContext);
        this.reactContextRef = reactContext;
        if (stripeSdkModule != null) {
            stripeSdkModule.setCardFormView(vVar);
        }
        return vVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(v view) {
        s.k(view, "view");
        super.onDropViewInstance(view);
        v0 v0Var = this.reactContextRef;
        StripeSdkModule stripeSdkModule = v0Var != null ? (StripeSdkModule) v0Var.getNativeModule(StripeSdkModule.class) : null;
        if (stripeSdkModule != null) {
            stripeSdkModule.setCardFormView(null);
        }
        this.reactContextRef = null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(v root, String commandId, ReadableArray args) {
        s.k(root, "root");
        if (commandId != null) {
            int iHashCode = commandId.hashCode();
            if (iHashCode == 3027047) {
                if (commandId.equals("blur")) {
                    root.n();
                }
            } else if (iHashCode == 94746189) {
                if (commandId.equals("clear")) {
                    root.o();
                }
            } else if (iHashCode == 97604824 && commandId.equals("focus")) {
                root.p();
            }
        }
    }
}
