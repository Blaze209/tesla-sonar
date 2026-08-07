package com.rnmaps.maps;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.z0;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@xn.a(name = MapModule.NAME)
public class MapModule extends ReactContextBaseJavaModule {
    public static final String NAME = "AirMapModule";
    private static final String SNAPSHOT_FORMAT_JPG = "jpg";
    private static final String SNAPSHOT_FORMAT_PNG = "png";
    private static final String SNAPSHOT_RESULT_BASE64 = "base64";
    private static final String SNAPSHOT_RESULT_FILE = "file";

    class a implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f49093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Promise f49094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f49095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Integer f49096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f49097e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f49098f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f49099g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Bitmap.CompressFormat f49100h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ double f49101i;

        /* JADX INFO: renamed from: com.rnmaps.maps.MapModule$a$a, reason: collision with other inner class name */
        class C0778a implements GoogleMap.SnapshotReadyCallback {
            C0778a() {
            }

            @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
            public void onSnapshotReady(Bitmap bitmap) {
                if (bitmap == null) {
                    a.this.f49094b.reject("Failed to generate bitmap, snapshot = null");
                    return;
                }
                if (a.this.f49095c.intValue() != 0 && a.this.f49096d.intValue() != 0 && (a.this.f49095c.intValue() != bitmap.getWidth() || a.this.f49096d.intValue() != bitmap.getHeight())) {
                    bitmap = Bitmap.createScaledBitmap(bitmap, a.this.f49095c.intValue(), a.this.f49096d.intValue(), true);
                }
                if (!a.this.f49097e.equals("file")) {
                    if (a.this.f49097e.equals(MapModule.SNAPSHOT_RESULT_BASE64)) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        a aVar = a.this;
                        bitmap.compress(aVar.f49100h, (int) (aVar.f49101i * 100.0d), byteArrayOutputStream);
                        MapModule.closeQuietly(byteArrayOutputStream);
                        a.this.f49094b.resolve(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                        return;
                    }
                    return;
                }
                try {
                    File fileCreateTempFile = File.createTempFile("AirMapSnapshot", "." + a.this.f49098f, a.this.f49099g.getCacheDir());
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    a aVar2 = a.this;
                    bitmap.compress(aVar2.f49100h, (int) (aVar2.f49101i * 100.0d), fileOutputStream);
                    MapModule.closeQuietly(fileOutputStream);
                    a.this.f49094b.resolve(Uri.fromFile(fileCreateTempFile).toString());
                } catch (Exception e11) {
                    a.this.f49094b.reject(e11);
                }
            }
        }

        a(int i11, Promise promise, Integer num, Integer num2, String str, String str2, ReactApplicationContext reactApplicationContext, Bitmap.CompressFormat compressFormat, double d11) {
            this.f49093a = i11;
            this.f49094b = promise;
            this.f49095c = num;
            this.f49096d = num2;
            this.f49097e = str;
            this.f49098f = str2;
            this.f49099g = reactApplicationContext;
            this.f49100h = compressFormat;
            this.f49101i = d11;
        }

        @Override // com.facebook.react.uimanager.z0
        public void execute(com.facebook.react.uimanager.t tVar) {
            s sVar = (s) tVar.resolveView(this.f49093a);
            if (sVar == null) {
                this.f49094b.reject("AirMapView not found");
                return;
            }
            GoogleMap googleMap = sVar.f49279a;
            if (googleMap == null) {
                this.f49094b.reject("AirMapView.map is not valid");
            } else {
                googleMap.snapshot(new C0778a());
            }
        }
    }

    class b implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f49104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Promise f49105b;

        b(int i11, Promise promise) {
            this.f49104a = i11;
            this.f49105b = promise;
        }

        @Override // com.facebook.react.uimanager.z0
        public void execute(com.facebook.react.uimanager.t tVar) {
            s sVar = (s) tVar.resolveView(this.f49104a);
            if (sVar == null) {
                this.f49105b.reject("AirMapView not found");
                return;
            }
            GoogleMap googleMap = sVar.f49279a;
            if (googleMap == null) {
                this.f49105b.reject("AirMapView.map is not valid");
                return;
            }
            CameraPosition cameraPosition = googleMap.getCameraPosition();
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble(OrcaKeys.LATITUDE, cameraPosition.target.latitude);
            writableNativeMap.putDouble(OrcaKeys.LONGITUDE, cameraPosition.target.longitude);
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putMap("center", writableNativeMap);
            writableNativeMap2.putDouble("heading", cameraPosition.bearing);
            writableNativeMap2.putDouble("zoom", cameraPosition.zoom);
            writableNativeMap2.putDouble("pitch", cameraPosition.tilt);
            this.f49105b.resolve(writableNativeMap2);
        }
    }

    class c implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f49107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Promise f49108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReadableMap f49109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f49110d;

        c(int i11, Promise promise, ReadableMap readableMap, ReactApplicationContext reactApplicationContext) {
            this.f49107a = i11;
            this.f49108b = promise;
            this.f49109c = readableMap;
            this.f49110d = reactApplicationContext;
        }

        @Override // com.facebook.react.uimanager.z0
        public void execute(com.facebook.react.uimanager.t tVar) {
            s sVar = (s) tVar.resolveView(this.f49107a);
            if (sVar == null) {
                this.f49108b.reject("AirMapView not found");
                return;
            }
            if (sVar.f49279a == null) {
                this.f49108b.reject("AirMapView.map is not valid");
                return;
            }
            ReadableMap readableMap = this.f49109c;
            if (readableMap == null || !readableMap.hasKey(OrcaKeys.LATITUDE) || !this.f49109c.hasKey(OrcaKeys.LONGITUDE)) {
                this.f49108b.reject("Invalid coordinate format");
                return;
            }
            try {
                List<Address> fromLocation = new Geocoder(this.f49110d).getFromLocation(this.f49109c.getDouble(OrcaKeys.LATITUDE), this.f49109c.getDouble(OrcaKeys.LONGITUDE), 1);
                if (fromLocation.isEmpty()) {
                    this.f49108b.reject("Can not get address location");
                    return;
                }
                Address address = fromLocation.get(0);
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("name", address.getFeatureName());
                writableNativeMap.putString(PlaceTypes.LOCALITY, address.getLocality());
                writableNativeMap.putString("thoroughfare", address.getThoroughfare());
                writableNativeMap.putString("subThoroughfare", address.getSubThoroughfare());
                writableNativeMap.putString("subLocality", address.getSubLocality());
                writableNativeMap.putString("administrativeArea", address.getAdminArea());
                writableNativeMap.putString("subAdministrativeArea", address.getSubAdminArea());
                writableNativeMap.putString("postalCode", address.getPostalCode());
                writableNativeMap.putString("countryCode", address.getCountryCode());
                writableNativeMap.putString(PlaceTypes.COUNTRY, address.getCountryName());
                this.f49108b.resolve(writableNativeMap);
            } catch (IOException unused) {
                this.f49108b.reject("Can not get address location");
            }
        }
    }

    class d implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f49112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Promise f49113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LatLng f49114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f49115d;

        d(int i11, Promise promise, LatLng latLng, double d11) {
            this.f49112a = i11;
            this.f49113b = promise;
            this.f49114c = latLng;
            this.f49115d = d11;
        }

        @Override // com.facebook.react.uimanager.z0
        public void execute(com.facebook.react.uimanager.t tVar) {
            s sVar = (s) tVar.resolveView(this.f49112a);
            if (sVar == null) {
                this.f49113b.reject("AirMapView not found");
                return;
            }
            GoogleMap googleMap = sVar.f49279a;
            if (googleMap == null) {
                this.f49113b.reject("AirMapView.map is not valid");
                return;
            }
            Point screenLocation = googleMap.getProjection().toScreenLocation(this.f49114c);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("x", ((double) screenLocation.x) / this.f49115d);
            writableNativeMap.putDouble("y", ((double) screenLocation.y) / this.f49115d);
            this.f49113b.resolve(writableNativeMap);
        }
    }

    class e implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f49117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Promise f49118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Point f49119c;

        e(int i11, Promise promise, Point point) {
            this.f49117a = i11;
            this.f49118b = promise;
            this.f49119c = point;
        }

        @Override // com.facebook.react.uimanager.z0
        public void execute(com.facebook.react.uimanager.t tVar) {
            s sVar = (s) tVar.resolveView(this.f49117a);
            if (sVar == null) {
                this.f49118b.reject("AirMapView not found");
                return;
            }
            GoogleMap googleMap = sVar.f49279a;
            if (googleMap == null) {
                this.f49118b.reject("AirMapView.map is not valid");
                return;
            }
            LatLng latLngFromScreenLocation = googleMap.getProjection().fromScreenLocation(this.f49119c);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble(OrcaKeys.LATITUDE, latLngFromScreenLocation.latitude);
            writableNativeMap.putDouble(OrcaKeys.LONGITUDE, latLngFromScreenLocation.longitude);
            this.f49118b.resolve(writableNativeMap);
        }
    }

    class f implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f49121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Promise f49122b;

        f(int i11, Promise promise) {
            this.f49121a = i11;
            this.f49122b = promise;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.facebook.react.uimanager.z0
        public void execute(com.facebook.react.uimanager.t tVar) {
            s sVar = (s) tVar.resolveView(this.f49121a);
            if (sVar == null) {
                this.f49122b.reject("AirMapView not found");
                return;
            }
            if (sVar.f49279a == null) {
                this.f49122b.reject("AirMapView.map is not valid");
                return;
            }
            double[][] mapBoundaries = sVar.getMapBoundaries();
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            WritableNativeMap writableNativeMap3 = new WritableNativeMap();
            writableNativeMap2.putDouble(OrcaKeys.LONGITUDE, mapBoundaries[0][0]);
            writableNativeMap2.putDouble(OrcaKeys.LATITUDE, mapBoundaries[0][1]);
            writableNativeMap3.putDouble(OrcaKeys.LONGITUDE, mapBoundaries[1][0]);
            writableNativeMap3.putDouble(OrcaKeys.LATITUDE, mapBoundaries[1][1]);
            writableNativeMap.putMap("northEast", writableNativeMap2);
            writableNativeMap.putMap("southWest", writableNativeMap3);
            this.f49122b.resolve(writableNativeMap);
        }
    }

    public MapModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    @ReactMethod
    public void coordinateForPoint(int i11, ReadableMap readableMap, Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        double d11 = reactApplicationContext.getResources().getDisplayMetrics().density;
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new e(i11, promise, new Point(readableMap.hasKey("x") ? (int) (readableMap.getDouble("x") * d11) : 0, readableMap.hasKey("y") ? (int) (readableMap.getDouble("y") * d11) : 0)));
    }

    public Activity getActivity() {
        return getCurrentActivity();
    }

    @ReactMethod
    public void getAddressFromCoordinates(int i11, ReadableMap readableMap, Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new c(i11, promise, readableMap, reactApplicationContext));
    }

    @ReactMethod
    public void getCamera(int i11, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new b(i11, promise));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("legalNotice", "This license information is displayed in Settings > Google > Open Source on any device running Google Play services.");
        return map;
    }

    @ReactMethod
    public void getMapBoundaries(int i11, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new f(i11, promise));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void pointForCoordinate(int i11, ReadableMap readableMap, Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new d(i11, promise, new LatLng(readableMap.hasKey(OrcaKeys.LATITUDE) ? readableMap.getDouble(OrcaKeys.LATITUDE) : 0.0d, readableMap.hasKey(OrcaKeys.LONGITUDE) ? readableMap.getDouble(OrcaKeys.LONGITUDE) : 0.0d), reactApplicationContext.getResources().getDisplayMetrics().density));
    }

    @ReactMethod
    public void takeSnapshot(int i11, ReadableMap readableMap, Promise promise) {
        Bitmap.CompressFormat compressFormat;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        String string = readableMap.hasKey("format") ? readableMap.getString("format") : SNAPSHOT_FORMAT_PNG;
        if (string.equals(SNAPSHOT_FORMAT_PNG)) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = string.equals(SNAPSHOT_FORMAT_JPG) ? Bitmap.CompressFormat.JPEG : null;
        }
        Bitmap.CompressFormat compressFormat2 = compressFormat;
        double d11 = readableMap.hasKey("quality") ? readableMap.getDouble("quality") : 1.0d;
        DisplayMetrics displayMetrics = reactApplicationContext.getResources().getDisplayMetrics();
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new a(i11, promise, Integer.valueOf(readableMap.hasKey(Snapshot.WIDTH) ? (int) (((double) displayMetrics.density) * readableMap.getDouble(Snapshot.WIDTH)) : 0), Integer.valueOf(readableMap.hasKey(Snapshot.HEIGHT) ? (int) (((double) displayMetrics.density) * readableMap.getDouble(Snapshot.HEIGHT)) : 0), readableMap.hasKey("result") ? readableMap.getString("result") : "file", string, reactApplicationContext, compressFormat2, d11));
    }
}
