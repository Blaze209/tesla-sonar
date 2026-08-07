package com.content.addresssheet;

import ch.qos.logback.core.joran.action.Action;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0019\u0010\u0015J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\"\u0010!J\u001f\u0010$\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0005H\u0007¢\u0006\u0004\b$\u0010!J\u0017\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/reactnativestripesdk/addresssheet/d;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "view", "", "visibility", "Ljn0/h0;", "setVisible", "(Lcom/reactnativestripesdk/addresssheet/d;Z)V", "Lcom/facebook/react/bridge/ReadableMap;", "appearance", "setAppearance", "(Lcom/reactnativestripesdk/addresssheet/d;Lcom/facebook/react/bridge/ReadableMap;)V", "defaults", "setDefaultValues", "fields", "setAdditionalFields", "Lcom/facebook/react/bridge/ReadableArray;", "countries", "setAllowedCountries", "(Lcom/reactnativestripesdk/addresssheet/d;Lcom/facebook/react/bridge/ReadableArray;)V", "setAutocompleteCountries", "title", "setPrimaryButtonTitle", "(Lcom/reactnativestripesdk/addresssheet/d;Ljava/lang/String;)V", "setSheetTitle", Action.KEY_ATTRIBUTE, "setGooglePlacesApiKey", "Lcom/facebook/react/uimanager/v0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/reactnativestripesdk/addresssheet/d;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddressSheetViewManager extends SimpleViewManager<d> {
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> mapE = c.e("onSubmitAction", c.d("registrationName", "onSubmitAction"), "onErrorAction", c.d("registrationName", "onErrorAction"));
        s.j(mapE, "of(...)");
        return mapE;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AddressSheetView";
    }

    @a(name = "additionalFields")
    public final void setAdditionalFields(d view, ReadableMap fields) {
        s.k(view, "view");
        s.k(fields, "fields");
        view.setAdditionalFields(fields);
    }

    @a(name = "allowedCountries")
    public final void setAllowedCountries(d view, ReadableArray countries) {
        s.k(view, "view");
        s.k(countries, "countries");
        ArrayList<Object> arrayList = countries.toArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof String) {
                arrayList2.add(obj);
            }
        }
        view.setAllowedCountries(arrayList2);
    }

    @a(name = "appearance")
    public final void setAppearance(d view, ReadableMap appearance) {
        s.k(view, "view");
        s.k(appearance, "appearance");
        view.setAppearance(appearance);
    }

    @a(name = "autocompleteCountries")
    public final void setAutocompleteCountries(d view, ReadableArray countries) {
        s.k(view, "view");
        s.k(countries, "countries");
        ArrayList<Object> arrayList = countries.toArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof String) {
                arrayList2.add(obj);
            }
        }
        view.setAutocompleteCountries(arrayList2);
    }

    @a(name = "defaultValues")
    public final void setDefaultValues(d view, ReadableMap defaults) {
        s.k(view, "view");
        s.k(defaults, "defaults");
        view.setDefaultValues(defaults);
    }

    @a(name = "googlePlacesApiKey")
    public final void setGooglePlacesApiKey(d view, String key) {
        s.k(view, "view");
        s.k(key, "key");
        view.setGooglePlacesApiKey(key);
    }

    @a(name = "primaryButtonTitle")
    public final void setPrimaryButtonTitle(d view, String title) {
        s.k(view, "view");
        s.k(title, "title");
        view.setPrimaryButtonTitle(title);
    }

    @a(name = "sheetTitle")
    public final void setSheetTitle(d view, String title) {
        s.k(view, "view");
        s.k(title, "title");
        view.setSheetTitle(title);
    }

    @a(name = "visible")
    public final void setVisible(d view, boolean visibility) {
        s.k(view, "view");
        view.setVisible(visibility);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public d createViewInstance(v0 reactContext) {
        s.k(reactContext, "reactContext");
        return new d(reactContext);
    }
}
