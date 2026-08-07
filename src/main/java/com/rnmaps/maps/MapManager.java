package com.rnmaps.maps;

import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.u0;
import com.facebook.react.uimanager.v0;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class MapManager extends ViewGroupManager<s> {
    private static final String REACT_CLASS = "AIRMap";
    private final Map<String, Integer> MAP_TYPES = jn.c.h("standard", 1, "satellite", 2, "hybrid", 4, "terrain", 3, "none", 0);
    private final Map<String, Integer> MY_LOCATION_PRIORITY = jn.c.g("balanced", 102, "high", 100, "low", 104, "passive", 105);
    private final ReactApplicationContext appContext;
    protected GoogleMapOptions googleMapOptions;
    private MapMarkerManager markerManager;
    protected MapsInitializer.Renderer renderer;

    public MapManager(ReactApplicationContext reactApplicationContext) {
        this.appContext = reactApplicationContext;
    }

    private void emitMapError(v0 v0Var, String str, String str2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", str);
        writableMapCreateMap.putString("type", str2);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) v0Var.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onError", writableMapCreateMap);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map mapH = jn.c.h("onMapReady", jn.c.d("registrationName", "onMapReady"), "onPress", jn.c.d("registrationName", "onPress"), "onLongPress", jn.c.d("registrationName", "onLongPress"), "onMarkerPress", jn.c.d("registrationName", "onMarkerPress"), "onCalloutPress", jn.c.d("registrationName", "onCalloutPress"));
        mapH.putAll(jn.c.j("onUserLocationChange", jn.c.d("registrationName", "onUserLocationChange"), "onMarkerDragStart", jn.c.d("registrationName", "onMarkerDragStart"), "onMarkerDrag", jn.c.d("registrationName", "onMarkerDrag"), "onMarkerDragEnd", jn.c.d("registrationName", "onMarkerDragEnd"), "onPanDrag", jn.c.d("registrationName", "onPanDrag"), "onKmlReady", jn.c.d("registrationName", "onKmlReady"), "onPoiClick", jn.c.d("registrationName", "onPoiClick")));
        mapH.putAll(jn.c.i("onIndoorLevelActivated", jn.c.d("registrationName", "onIndoorLevelActivated"), "onIndoorBuildingFocused", jn.c.d("registrationName", "onIndoorBuildingFocused"), "onDoublePress", jn.c.d("registrationName", "onDoublePress"), "onMapLoaded", jn.c.d("registrationName", "onMapLoaded"), "onMarkerSelect", jn.c.d("registrationName", "onMarkerSelect"), "onMarkerDeselect", jn.c.d("registrationName", "onMarkerDeselect")));
        return mapH;
    }

    public MapMarkerManager getMarkerManager() {
        return this.markerManager;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    void pushEvent(v0 v0Var, View view, String str, WritableMap writableMap) {
        ((RCTEventEmitter) v0Var.b().getJSModule(RCTEventEmitter.class)).receiveEvent(view.getId(), str, writableMap);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @no.a(defaultBoolean = false, name = "cacheEnabled")
    public void setCacheEnabled(s sVar, boolean z11) {
        sVar.setCacheEnabled(z11);
    }

    @no.a(name = "camera")
    public void setCamera(s sVar, ReadableMap readableMap) {
        sVar.setCamera(readableMap);
    }

    @no.a(name = "googleMapId")
    public void setGoogleMapId(s sVar, String str) {
        if (str != null) {
            this.googleMapOptions.mapId(str);
        }
    }

    @no.a(name = "googleRenderer")
    public void setGoogleRenderer(s sVar, String str) {
    }

    @no.a(defaultBoolean = false, name = "handlePanDrag")
    public void setHandlePanDrag(s sVar, boolean z11) {
        sVar.setHandlePanDrag(z11);
    }

    @no.a(name = "initialCamera")
    public void setInitialCamera(s sVar, ReadableMap readableMap) {
    }

    @no.a(name = "initialRegion")
    public void setInitialRegion(s sVar, ReadableMap readableMap) {
        sVar.setInitialRegion(readableMap);
    }

    @no.a(name = "kmlSrc")
    public void setKmlSrc(s sVar, String str) {
        if (str != null) {
            sVar.setKmlSrc(str);
        }
    }

    @no.a(defaultBoolean = false, name = "liteMode")
    public void setLiteMode(s sVar, boolean z11) {
        this.googleMapOptions.liteMode(z11);
    }

    @no.a(customType = "Color", name = "loadingBackgroundColor")
    public void setLoadingBackgroundColor(s sVar, Integer num) {
        sVar.setLoadingBackgroundColor(num);
    }

    @no.a(defaultBoolean = false, name = "loadingEnabled")
    public void setLoadingEnabled(s sVar, boolean z11) {
        sVar.I(z11);
    }

    @no.a(customType = "Color", name = "loadingIndicatorColor")
    public void setLoadingIndicatorColor(s sVar, Integer num) {
        sVar.setLoadingIndicatorColor(num);
    }

    @no.a(name = "mapPadding")
    public void setMapPadding(s sVar, ReadableMap readableMap) {
        int i11;
        int i12;
        int i13;
        double d11 = sVar.getResources().getDisplayMetrics().density;
        int i14 = 0;
        if (readableMap != null) {
            int i15 = readableMap.hasKey("left") ? (int) (readableMap.getDouble("left") * d11) : 0;
            i12 = readableMap.hasKey("top") ? (int) (readableMap.getDouble("top") * d11) : 0;
            i13 = readableMap.hasKey("right") ? (int) (readableMap.getDouble("right") * d11) : 0;
            i11 = readableMap.hasKey("bottom") ? (int) (readableMap.getDouble("bottom") * d11) : 0;
            i14 = i15;
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        sVar.C(i14, i12, i13, i11);
        sVar.f49279a.setPadding(i14, i12, i13, i11);
    }

    @no.a(name = "customMapStyleString")
    public void setMapStyle(s sVar, String str) {
        sVar.setMapStyle(str);
    }

    @no.a(name = "mapType")
    public void setMapType(s sVar, String str) {
        sVar.f49279a.setMapType(this.MAP_TYPES.get(str).intValue());
    }

    public void setMarkerManager(MapMarkerManager mapMarkerManager) {
        this.markerManager = mapMarkerManager;
    }

    @no.a(name = "maxZoomLevel")
    public void setMaxZoomLevel(s sVar, float f11) {
        sVar.f49279a.setMaxZoomPreference(f11);
    }

    @no.a(name = "minZoomLevel")
    public void setMinZoomLevel(s sVar, float f11) {
        sVar.f49279a.setMinZoomPreference(f11);
    }

    @no.a(defaultBoolean = true, name = "moveOnMarkerPress")
    public void setMoveOnMarkerPress(s sVar, boolean z11) {
        sVar.setMoveOnMarkerPress(z11);
    }

    @no.a(defaultBoolean = false, name = "pitchEnabled")
    public void setPitchEnabled(s sVar, boolean z11) {
        sVar.f49279a.getUiSettings().setTiltGesturesEnabled(z11);
    }

    @no.a(name = "region")
    public void setRegion(s sVar, ReadableMap readableMap) {
        sVar.setRegion(readableMap);
    }

    @no.a(defaultBoolean = false, name = "rotateEnabled")
    public void setRotateEnabled(s sVar, boolean z11) {
        sVar.f49279a.getUiSettings().setRotateGesturesEnabled(z11);
    }

    @no.a(defaultBoolean = true, name = "scrollDuringRotateOrZoomEnabled")
    public void setScrollDuringRotateOrZoomEnabled(s sVar, boolean z11) {
        sVar.f49279a.getUiSettings().setScrollGesturesEnabledDuringRotateOrZoom(z11);
    }

    @no.a(defaultBoolean = false, name = "scrollEnabled")
    public void setScrollEnabled(s sVar, boolean z11) {
        sVar.f49279a.getUiSettings().setScrollGesturesEnabled(z11);
    }

    @no.a(defaultBoolean = false, name = "showsBuildings")
    public void setShowBuildings(s sVar, boolean z11) {
        sVar.f49279a.setBuildingsEnabled(z11);
    }

    @no.a(defaultBoolean = false, name = "showsIndoors")
    public void setShowIndoors(s sVar, boolean z11) {
        sVar.f49279a.setIndoorEnabled(z11);
    }

    @no.a(defaultBoolean = false, name = "showsTraffic")
    public void setShowTraffic(s sVar, boolean z11) {
        sVar.f49279a.setTrafficEnabled(z11);
    }

    @no.a(defaultBoolean = false, name = "showsCompass")
    public void setShowsCompass(s sVar, boolean z11) {
        sVar.f49279a.getUiSettings().setCompassEnabled(z11);
    }

    @no.a(defaultBoolean = false, name = "showsIndoorLevelPicker")
    public void setShowsIndoorLevelPicker(s sVar, boolean z11) {
        sVar.f49279a.getUiSettings().setIndoorLevelPickerEnabled(z11);
    }

    @no.a(defaultBoolean = true, name = "showsMyLocationButton")
    public void setShowsMyLocationButton(s sVar, boolean z11) {
        sVar.setShowsMyLocationButton(z11);
    }

    @no.a(defaultBoolean = false, name = "showsUserLocation")
    public void setShowsUserLocation(s sVar, boolean z11) {
        sVar.setShowsUserLocation(z11);
    }

    @no.a(defaultBoolean = true, name = "toolbarEnabled")
    public void setToolbarEnabled(s sVar, boolean z11) {
        sVar.setToolbarEnabled(z11);
    }

    @no.a(defaultInt = 5000, name = "userLocationFastestInterval")
    public void setUserLocationFastestInterval(s sVar, int i11) {
        sVar.setUserLocationFastestInterval(i11);
    }

    @no.a(name = "userLocationPriority")
    public void setUserLocationPriority(s sVar, String str) {
        sVar.setUserLocationPriority(this.MY_LOCATION_PRIORITY.get(str).intValue());
    }

    @no.a(defaultInt = 5000, name = "userLocationUpdateInterval")
    public void setUserLocationUpdateInterval(s sVar, int i11) {
        sVar.setUserLocationUpdateInterval(i11);
    }

    @no.a(defaultBoolean = true, name = "zoomControlEnabled")
    public void setZoomControlEnabled(s sVar, boolean z11) {
        sVar.f49279a.getUiSettings().setZoomControlsEnabled(z11);
    }

    @no.a(defaultBoolean = false, name = "zoomEnabled")
    public void setZoomEnabled(s sVar, boolean z11) {
        sVar.f49279a.getUiSettings().setZoomGesturesEnabled(z11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public com.facebook.react.uimanager.m createShadowNodeInstance() {
        return new w();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(s sVar) {
        sVar.H();
        super.onDropViewInstance(sVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull s sVar, String str, ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "fitToSuppliedMarkers":
                if (readableArray != null) {
                    sVar.L(readableArray.getArray(0), readableArray.getMap(1), readableArray.getBoolean(2));
                    break;
                }
                break;
            case "setIndoorActiveLevelIndex":
                if (readableArray != null) {
                    sVar.setIndoorActiveLevelIndex(readableArray.getInt(0));
                    break;
                }
                break;
            case "setCamera":
                if (readableArray != null) {
                    sVar.z(readableArray.getMap(0), 0);
                    break;
                }
                break;
            case "setMapBoundaries":
                if (readableArray != null) {
                    sVar.setMapBoundaries(readableArray.getMap(0), readableArray.getMap(1));
                    break;
                }
                break;
            case "fitToElements":
                if (readableArray != null) {
                    sVar.K(readableArray.getMap(0), readableArray.getBoolean(1));
                    break;
                }
                break;
            case "animateCamera":
                if (readableArray != null) {
                    sVar.z(readableArray.getMap(0), readableArray.getInt(1));
                    break;
                }
                break;
            case "animateToRegion":
                if (readableArray != null) {
                    ReadableMap map = readableArray.getMap(0);
                    int i11 = readableArray.getInt(1);
                    double d11 = map.getDouble(OrcaKeys.LONGITUDE);
                    double d12 = map.getDouble(OrcaKeys.LATITUDE);
                    double d13 = map.getDouble("longitudeDelta");
                    double d14 = map.getDouble("latitudeDelta") / 2.0d;
                    double d15 = d13 / 2.0d;
                    sVar.A(new LatLngBounds(new LatLng(d12 - d14, d11 - d15), new LatLng(d12 + d14, d11 + d15)), i11);
                    break;
                }
                break;
            case "fitToCoordinates":
                if (readableArray != null) {
                    sVar.J(readableArray.getArray(0), readableArray.getMap(1), readableArray.getBoolean(2));
                    break;
                }
                break;
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(s sVar, View view, int i11) {
        sVar.y(view, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public s createViewInstance(@NonNull v0 v0Var) {
        return new s(v0Var, this.appContext, this, this.googleMapOptions);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(s sVar, int i11) {
        return sVar.M(i11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(s sVar) {
        return sVar.getFeatureCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(s sVar, int i11) {
        sVar.X(i11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(s sVar, Object obj) {
        sVar.a0(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public s createViewInstance(int i11, @NonNull v0 v0Var, k0 k0Var, u0 u0Var) {
        CameraPosition cameraPositionF;
        this.googleMapOptions = new GoogleMapOptions();
        if (k0Var != null) {
            if (k0Var.c("googleMapId") != null) {
                this.googleMapOptions.mapId(k0Var.c("googleMapId"));
            }
            if (k0Var.d("liteMode")) {
                this.googleMapOptions.liteMode(k0Var.a("liteMode", false));
            }
            if (k0Var.d("initialCamera")) {
                CameraPosition cameraPositionF2 = s.F(k0Var.b("initialCamera"));
                if (cameraPositionF2 != null) {
                    this.googleMapOptions.camera(cameraPositionF2);
                }
            } else if (k0Var.d("camera") && (cameraPositionF = s.F(k0Var.b("camera"))) != null) {
                this.googleMapOptions.camera(cameraPositionF);
            }
            if (k0Var.d("googleRenderer") && "LEGACY".equals(k0Var.c("googleRenderer"))) {
                this.renderer = MapsInitializer.Renderer.LEGACY;
            } else {
                this.renderer = MapsInitializer.Renderer.LATEST;
            }
        }
        return (s) super.createViewInstance(i11, v0Var, k0Var, u0Var);
    }
}
