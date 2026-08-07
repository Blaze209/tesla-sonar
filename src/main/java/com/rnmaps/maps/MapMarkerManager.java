package com.rnmaps.maps;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.v0;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class MapMarkerManager extends ViewGroupManager<l> {
    private final Map<String, a> sharedIcons = new ConcurrentHashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BitmapDescriptor f49089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f49090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<l, Boolean> f49091c = new WeakHashMap();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f49092d = false;

        public synchronized void a(l lVar) {
            this.f49091c.put(lVar, Boolean.TRUE);
            BitmapDescriptor bitmapDescriptor = this.f49089a;
            if (bitmapDescriptor != null) {
                lVar.setIconBitmapDescriptor(bitmapDescriptor, this.f49090b);
            }
        }

        public synchronized boolean b() {
            return this.f49091c.isEmpty();
        }

        public synchronized void c(l lVar) {
            this.f49091c.remove(lVar);
        }

        public synchronized boolean d() {
            if (this.f49092d) {
                return false;
            }
            this.f49092d = true;
            return true;
        }

        public synchronized void e(BitmapDescriptor bitmapDescriptor, Bitmap bitmap) {
            this.f49089a = bitmapDescriptor;
            this.f49090b = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            if (this.f49091c.isEmpty()) {
                return;
            }
            for (Map.Entry<l, Boolean> entry : this.f49091c.entrySet()) {
                if (entry.getKey() != null) {
                    entry.getKey().setIconBitmapDescriptor(bitmapDescriptor, bitmap);
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        return jn.c.a().b("onSelect", jn.c.d("phasedRegistrationNames", jn.c.d("bubbled", "onSelect"))).b("onDeselect", jn.c.d("phasedRegistrationNames", jn.c.d("bubbled", "onDeselect"))).a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return jn.c.a().b("onPress", jn.c.d("registrationName", "onPress")).b("onCalloutPress", jn.c.d("registrationName", "onCalloutPress")).b("onDragStart", jn.c.d("registrationName", "onDragStart")).b("onDrag", jn.c.d("registrationName", "onDrag")).b("onDragEnd", jn.c.d("registrationName", "onDragEnd")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapMarker";
    }

    public a getSharedIcon(String str) {
        a aVar;
        a aVar2 = this.sharedIcons.get(str);
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (this) {
            try {
                aVar = this.sharedIcons.get(str);
                if (aVar == null) {
                    aVar = new a();
                    this.sharedIcons.put(str, aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    public void removeSharedIconIfEmpty(String str) {
        a aVar = this.sharedIcons.get(str);
        if (aVar == null || aVar.b()) {
            return;
        }
        synchronized (this) {
            try {
                a aVar2 = this.sharedIcons.get(str);
                if (aVar2 != null && !aVar2.b()) {
                    this.sharedIcons.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @no.a(name = "anchor")
    public void setAnchor(l lVar, ReadableMap readableMap) {
        lVar.setAnchor((readableMap == null || !readableMap.hasKey("x")) ? 0.5d : readableMap.getDouble("x"), (readableMap == null || !readableMap.hasKey("y")) ? 1.0d : readableMap.getDouble("y"));
    }

    @no.a(name = "calloutAnchor")
    public void setCalloutAnchor(l lVar, ReadableMap readableMap) {
        lVar.setCalloutAnchor((readableMap == null || !readableMap.hasKey("x")) ? 0.5d : readableMap.getDouble("x"), (readableMap == null || !readableMap.hasKey("y")) ? 0.0d : readableMap.getDouble("y"));
    }

    @no.a(name = "coordinate")
    public void setCoordinate(l lVar, ReadableMap readableMap) {
        lVar.setCoordinate(readableMap);
    }

    @no.a(name = "description")
    public void setDescription(l lVar, String str) {
        lVar.setSnippet(str);
    }

    @no.a(defaultBoolean = false, name = "draggable")
    public void setDraggable(l lVar, boolean z11) {
        lVar.setDraggable(z11);
    }

    @no.a(defaultBoolean = false, name = "flat")
    public void setFlat(l lVar, boolean z11) {
        lVar.setFlat(z11);
    }

    @no.a(name = "icon")
    public void setIcon(l lVar, String str) {
        lVar.setImage(str);
    }

    @no.a(name = "identifier")
    public void setIdentifier(l lVar, String str) {
        lVar.setIdentifier(str);
    }

    @no.a(name = "image")
    public void setImage(l lVar, String str) {
        lVar.setImage(str);
    }

    @no.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "rotation")
    public void setMarkerRotation(l lVar, float f11) {
        lVar.setRotation(f11);
    }

    @no.a(customType = "Color", defaultInt = -65536, name = "pinColor")
    public void setPinColor(l lVar, int i11) {
        float[] fArr = new float[3];
        Color.colorToHSV(i11, fArr);
        lVar.setMarkerHue(fArr[0]);
    }

    @no.a(name = "title")
    public void setTitle(l lVar, String str) {
        lVar.setTitle(str);
    }

    @no.a(defaultBoolean = true, name = "tracksViewChanges")
    public void setTracksViewChanges(l lVar, boolean z11) {
        lVar.setTracksViewChanges(z11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public com.facebook.react.uimanager.m createShadowNodeInstance() {
        return new w();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public l createViewInstance(v0 v0Var) {
        return new l(v0Var, this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull l lVar, String str, ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "animateMarkerToCoordinate":
                if (readableArray != null) {
                    ReadableMap map = readableArray.getMap(0);
                    int i11 = readableArray.getInt(1);
                    lVar.q(new LatLng(map.getDouble(OrcaKeys.LATITUDE), map.getDouble(OrcaKeys.LONGITUDE)), Integer.valueOf(i11));
                    break;
                }
                break;
            case "redraw":
                lVar.B();
                break;
            case "hideCallout":
                ((Marker) lVar.getFeature()).hideInfoWindow();
                break;
            case "showCallout":
                ((Marker) lVar.getFeature()).showInfoWindow();
                break;
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @no.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(l lVar, float f11) {
        super.setOpacity(lVar, f11);
        lVar.setOpacity(f11);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @no.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "zIndex")
    public void setZIndex(l lVar, float f11) {
        super.setZIndex(lVar, f11);
        lVar.setZIndex(Math.round(f11));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(l lVar, View view, int i11) {
        if (view instanceof f) {
            lVar.setCalloutView((f) view);
        } else {
            super.addView(lVar, view, i11);
            lVar.z(true);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(l lVar, int i11) {
        super.removeViewAt(lVar, i11);
        lVar.z(true);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(l lVar, Object obj) {
        HashMap map = (HashMap) obj;
        lVar.y((int) ((Float) map.get(Snapshot.WIDTH)).floatValue(), (int) ((Float) map.get(Snapshot.HEIGHT)).floatValue());
    }
}
