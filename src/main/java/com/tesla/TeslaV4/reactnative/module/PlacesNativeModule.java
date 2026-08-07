package com.tesla.TeslaV4.reactnative.module;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.AddressComponent;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Period;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.api.model.RectangularBounds;
import com.google.android.libraries.places.api.model.TimeOfWeek;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 C2\u00020\u0001:\u0001DB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u001a\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bj\n\u0012\u0006\u0012\u0004\u0018\u00010\f`\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u001b2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010,J)\u00102\u001a\u0002012\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b2\u00103J)\u00107\u001a\u0002012\b\u00104\u001a\u0004\u0018\u00010\u00062\u0006\u00106\u001a\u0002052\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b7\u00108J'\u00109\u001a\u0002012\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u00106\u001a\u0002052\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b9\u00108J\u0017\u0010;\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010:¢\u0006\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/PlacesNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "type", "Lcom/google/android/libraries/places/api/model/TypeFilter;", "getFilterType", "(Ljava/lang/String;)Lcom/google/android/libraries/places/api/model/TypeFilter;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "placeFields", "", "isCurrentOrFetchPlace", "", "Lcom/google/android/libraries/places/api/model/Place$Field;", "getPlaceFields", "(Ljava/util/ArrayList;Z)Ljava/util/List;", "Lcom/google/android/libraries/places/api/model/TimeOfWeek;", "Lcom/facebook/react/bridge/WritableMap;", "toMap", "(Lcom/google/android/libraries/places/api/model/TimeOfWeek;)Lcom/facebook/react/bridge/WritableMap;", "Lcom/google/android/libraries/places/api/model/Place;", "place", "", "selectedFields", "propertiesMapForPlace", "(Lcom/google/android/libraries/places/api/model/Place;Ljava/util/List;)Lcom/facebook/react/bridge/WritableMap;", "placeID", "photosInCache", "(Ljava/lang/String;)Ljava/util/List;", "Landroid/graphics/Bitmap;", "image", "writeImageToCache", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Z", "Ljava/io/File;", "placeCacheDirectory", "(Ljava/lang/String;)Ljava/io/File;", "clearPlaceCacheDirectory", "(Ljava/lang/String;)Z", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/ReadableArray;", "fields", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "lookUpPlaceByID", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", SearchIntents.EXTRA_QUERY, "Lcom/facebook/react/bridge/ReadableMap;", "options", "getAutocompletePredictions", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "loadPlacePhotosByID", "Lcom/google/android/libraries/places/api/model/Place$Type;", "getTypeSlug", "(Lcom/google/android/libraries/places/api/model/Place$Type;)Ljava/lang/String;", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "placesClient$delegate", "Lkotlin/Lazy;", "getPlacesClient", "()Lcom/google/android/libraries/places/api/net/PlacesClient;", "placesClient", "Companion", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlacesNativeModule extends ReactContextBaseJavaModule {
    private static final String TAG = "PlacesNativeModule";
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a(TAG);

    /* JADX INFO: renamed from: placesClient$delegate, reason: from kotlin metadata */
    private final Lazy placesClient;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55666a;

        static {
            int[] iArr = new int[Place.Type.values().length];
            try {
                iArr[Place.Type.ACCOUNTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Place.Type.ADMINISTRATIVE_AREA_LEVEL_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Place.Type.ADMINISTRATIVE_AREA_LEVEL_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Place.Type.ADMINISTRATIVE_AREA_LEVEL_3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Place.Type.ADMINISTRATIVE_AREA_LEVEL_4.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Place.Type.ADMINISTRATIVE_AREA_LEVEL_5.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Place.Type.AIRPORT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Place.Type.AMUSEMENT_PARK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Place.Type.AQUARIUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Place.Type.ART_GALLERY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Place.Type.ATM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Place.Type.BAKERY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Place.Type.BANK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Place.Type.BAR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Place.Type.BEAUTY_SALON.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Place.Type.BICYCLE_STORE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[Place.Type.BOOK_STORE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[Place.Type.BOWLING_ALLEY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[Place.Type.BUS_STATION.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[Place.Type.CAFE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[Place.Type.CAMPGROUND.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[Place.Type.CAR_DEALER.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[Place.Type.CAR_RENTAL.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[Place.Type.CAR_REPAIR.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[Place.Type.CAR_WASH.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[Place.Type.CASINO.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[Place.Type.CEMETERY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[Place.Type.CHURCH.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[Place.Type.CITY_HALL.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[Place.Type.CLOTHING_STORE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[Place.Type.COLLOQUIAL_AREA.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[Place.Type.CONVENIENCE_STORE.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[Place.Type.COUNTRY.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[Place.Type.COURTHOUSE.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[Place.Type.DENTIST.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[Place.Type.DEPARTMENT_STORE.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[Place.Type.DOCTOR.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[Place.Type.ELECTRICIAN.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[Place.Type.ELECTRONICS_STORE.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[Place.Type.EMBASSY.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[Place.Type.ESTABLISHMENT.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[Place.Type.FINANCE.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[Place.Type.FIRE_STATION.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[Place.Type.FLOOR.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[Place.Type.FLORIST.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[Place.Type.FOOD.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[Place.Type.FUNERAL_HOME.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[Place.Type.FURNITURE_STORE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[Place.Type.GAS_STATION.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[Place.Type.GENERAL_CONTRACTOR.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[Place.Type.GEOCODE.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[Place.Type.GROCERY_OR_SUPERMARKET.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[Place.Type.GYM.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[Place.Type.HAIR_CARE.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[Place.Type.HARDWARE_STORE.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[Place.Type.HEALTH.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[Place.Type.HINDU_TEMPLE.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[Place.Type.HOME_GOODS_STORE.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[Place.Type.HOSPITAL.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[Place.Type.INSURANCE_AGENCY.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[Place.Type.INTERSECTION.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[Place.Type.JEWELRY_STORE.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[Place.Type.LAUNDRY.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[Place.Type.LAWYER.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[Place.Type.LIBRARY.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[Place.Type.LIQUOR_STORE.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[Place.Type.LOCALITY.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[Place.Type.LOCAL_GOVERNMENT_OFFICE.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[Place.Type.LOCKSMITH.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[Place.Type.LODGING.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[Place.Type.MEAL_DELIVERY.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[Place.Type.MEAL_TAKEAWAY.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[Place.Type.MOSQUE.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[Place.Type.MOVIE_RENTAL.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[Place.Type.MOVIE_THEATER.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[Place.Type.MOVING_COMPANY.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[Place.Type.MUSEUM.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[Place.Type.NATURAL_FEATURE.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[Place.Type.NEIGHBORHOOD.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[Place.Type.NIGHT_CLUB.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[Place.Type.OTHER.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[Place.Type.PAINTER.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[Place.Type.PARK.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[Place.Type.PARKING.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[Place.Type.PET_STORE.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[Place.Type.PHARMACY.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[Place.Type.PHYSIOTHERAPIST.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[Place.Type.PLACE_OF_WORSHIP.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[Place.Type.PLUMBER.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[Place.Type.POINT_OF_INTEREST.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[Place.Type.POLICE.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[Place.Type.POLITICAL.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[Place.Type.POSTAL_CODE.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[Place.Type.POSTAL_CODE_PREFIX.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[Place.Type.POSTAL_CODE_SUFFIX.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[Place.Type.POSTAL_TOWN.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[Place.Type.POST_BOX.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[Place.Type.POST_OFFICE.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[Place.Type.PREMISE.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[Place.Type.REAL_ESTATE_AGENCY.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[Place.Type.RESTAURANT.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[Place.Type.ROOFING_CONTRACTOR.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr[Place.Type.ROOM.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr[Place.Type.ROUTE.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr[Place.Type.RV_PARK.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr[Place.Type.SCHOOL.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr[Place.Type.SHOE_STORE.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr[Place.Type.SHOPPING_MALL.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr[Place.Type.SPA.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr[Place.Type.STADIUM.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr[Place.Type.STORAGE.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr[Place.Type.STORE.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr[Place.Type.STREET_ADDRESS.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr[Place.Type.SUBLOCALITY.ordinal()] = 114;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr[Place.Type.SUBLOCALITY_LEVEL_1.ordinal()] = 115;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr[Place.Type.SUBLOCALITY_LEVEL_2.ordinal()] = 116;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr[Place.Type.SUBLOCALITY_LEVEL_3.ordinal()] = 117;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr[Place.Type.SUBLOCALITY_LEVEL_4.ordinal()] = 118;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr[Place.Type.SUBLOCALITY_LEVEL_5.ordinal()] = 119;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr[Place.Type.SUBPREMISE.ordinal()] = 120;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                iArr[Place.Type.SUBWAY_STATION.ordinal()] = 121;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr[Place.Type.SUPERMARKET.ordinal()] = 122;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr[Place.Type.SYNAGOGUE.ordinal()] = 123;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr[Place.Type.TAXI_STAND.ordinal()] = 124;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                iArr[Place.Type.TRAIN_STATION.ordinal()] = 125;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                iArr[Place.Type.TRANSIT_STATION.ordinal()] = 126;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                iArr[Place.Type.TRAVEL_AGENCY.ordinal()] = 127;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                iArr[Place.Type.UNIVERSITY.ordinal()] = 128;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                iArr[Place.Type.VETERINARY_CARE.ordinal()] = 129;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                iArr[Place.Type.ZOO.ordinal()] = 130;
            } catch (NoSuchFieldError unused130) {
            }
            f55666a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesNativeModule(final ReactApplicationContext context) {
        super(context);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.placesClient = jn0.m.b(new wn0.a() { // from class: com.tesla.TeslaV4.reactnative.module.e0
            @Override // wn0.a
            public final Object invoke() {
                return PlacesNativeModule.placesClient_delegate$lambda$0(context);
            }
        });
    }

    private final boolean clearPlaceCacheDirectory(String placeID) {
        File filePlaceCacheDirectory = placeCacheDirectory(placeID);
        try {
            if (filePlaceCacheDirectory.exists()) {
                return filePlaceCacheDirectory.delete();
            }
            return false;
        } catch (Exception e11) {
            logger.n("Fail to clear place cache directory: " + e11);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 getAutocompletePredictions$lambda$4(Promise promise, PlacesNativeModule placesNativeModule, FindAutocompletePredictionsResponse findAutocompletePredictionsResponse) {
        if (findAutocompletePredictionsResponse.getAutocompletePredictions().size() == 0) {
            Object objCreateArray = Arguments.createArray();
            p013kotlin.jvm.internal.s.j(objCreateArray, "createArray(...)");
            promise.resolve(objCreateArray);
            return jn0.h0.f84049a;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        p013kotlin.jvm.internal.s.j(writableArrayCreateArray, "createArray(...)");
        for (AutocompletePrediction autocompletePrediction : findAutocompletePredictionsResponse.getAutocompletePredictions()) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            p013kotlin.jvm.internal.s.j(writableMapCreateMap, "createMap(...)");
            writableMapCreateMap.putString("fullText", autocompletePrediction.getFullText(null).toString());
            writableMapCreateMap.putString("primaryText", autocompletePrediction.getPrimaryText(null).toString());
            writableMapCreateMap.putString("secondaryText", autocompletePrediction.getSecondaryText(null).toString());
            writableMapCreateMap.putString("placeID", autocompletePrediction.getPlaceId());
            if (autocompletePrediction.getPlaceTypes().size() > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator<Place.Type> it = autocompletePrediction.getPlaceTypes().iterator();
                while (it.hasNext()) {
                    arrayList.add(placesNativeModule.getTypeSlug(it.next()));
                }
                writableMapCreateMap.putArray("types", Arguments.fromArray(arrayList.toArray(new String[0])));
            }
            writableArrayCreateArray.pushMap(writableMapCreateMap);
        }
        promise.resolve(writableArrayCreateArray);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getAutocompletePredictions$lambda$6(Promise promise, Exception exception) {
        p013kotlin.jvm.internal.s.k(exception, "exception");
        promise.reject("E_AUTOCOMPLETE_ERROR", new Error(exception.getMessage()));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final TypeFilter getFilterType(String type) {
        if (type == null) {
            return null;
        }
        switch (type.hashCode()) {
            case -1480760809:
                if (type.equals(PlaceTypes.ESTABLISHMENT)) {
                    return TypeFilter.ESTABLISHMENT;
                }
                return null;
            case -1360151735:
                if (type.equals("cities")) {
                    return TypeFilter.CITIES;
                }
                return null;
            case -1147692044:
                if (type.equals(PlaceTypes.ADDRESS)) {
                    return TypeFilter.ADDRESS;
                }
                return null;
            case -79287106:
                if (type.equals(PlaceTypes.GEOCODE)) {
                    return TypeFilter.GEOCODE;
                }
                return null;
            case 1086109695:
                if (type.equals("regions")) {
                    return TypeFilter.REGIONS;
                }
                return null;
            default:
                return null;
        }
    }

    private final List<Place.Field> getPlaceFields(ArrayList<Object> placeFields, boolean isCurrentOrFetchPlace) {
        ArrayList arrayList = new ArrayList();
        if (placeFields.size() == 0 && !isCurrentOrFetchPlace) {
            return p013kotlin.collections.n.F1(Place.Field.values());
        }
        if (placeFields.size() == 0 && isCurrentOrFetchPlace) {
            List<Place.Field> listF1 = p013kotlin.collections.n.F1(Place.Field.values());
            List listAsList = Arrays.asList(Place.Field.OPENING_HOURS, Place.Field.PHONE_NUMBER, Place.Field.WEBSITE_URI, Place.Field.ADDRESS_COMPONENTS);
            p013kotlin.jvm.internal.s.j(listAsList, "asList(...)");
            listF1.removeAll(listAsList);
            return listF1;
        }
        Iterator<Object> it = placeFields.iterator();
        p013kotlin.jvm.internal.s.j(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            g0.Companion companion = g0.INSTANCE;
            if (companion.a(next != null ? next.toString() : null) != null) {
                g0 g0VarA = companion.a(next != null ? next.toString() : null);
                if (g0VarA != null) {
                    arrayList.add(g0VarA.getField());
                }
            }
        }
        if (placeFields.size() != 0 && isCurrentOrFetchPlace) {
            List listAsList2 = Arrays.asList(Place.Field.OPENING_HOURS, Place.Field.PHONE_NUMBER, Place.Field.WEBSITE_URI, Place.Field.ADDRESS_COMPONENTS);
            p013kotlin.jvm.internal.s.j(listAsList2, "asList(...)");
            arrayList.removeAll(listAsList2);
        }
        return arrayList;
    }

    private final PlacesClient getPlacesClient() {
        Object value = this.placesClient.getValue();
        p013kotlin.jvm.internal.s.j(value, "getValue(...)");
        return (PlacesClient) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 loadPlacePhotosByID$lambda$11(PlacesNativeModule placesNativeModule, String str, Promise promise, ReadableMap readableMap, ReadableMap readableMap2, FetchPlaceResponse placeResponse) {
        p013kotlin.jvm.internal.s.k(placeResponse, "placeResponse");
        Place place = placeResponse.getPlace();
        List<PhotoMetadata> photoMetadatas = place.getPhotoMetadatas();
        Integer numValueOf = photoMetadatas != null ? Integer.valueOf(photoMetadatas.size()) : null;
        List<String> listPhotosInCache = placesNativeModule.photosInCache(str);
        int size = listPhotosInCache.size();
        if (numValueOf != null && size == numValueOf.intValue()) {
            promise.resolve(Arguments.fromList(listPhotosInCache));
            return jn0.h0.f84049a;
        }
        p013kotlin.jvm.internal.l0 l0Var = new p013kotlin.jvm.internal.l0();
        placesNativeModule.clearPlaceCacheDirectory(str);
        List<PhotoMetadata> photoMetadatas2 = place.getPhotoMetadatas();
        if (photoMetadatas2 != null) {
            for (PhotoMetadata photoMetadata : photoMetadatas2) {
                HashMap<String, Object> hashMap = readableMap.toHashMap();
                double d11 = readableMap2.hasKey("scale") ? readableMap2.getDouble("scale") : 2.0d;
                Object obj = hashMap.get(Snapshot.WIDTH);
                p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.Double");
                double dDoubleValue = ((Double) obj).doubleValue() * d11;
                Object obj2 = hashMap.get(Snapshot.HEIGHT);
                p013kotlin.jvm.internal.s.i(obj2, "null cannot be cast to non-null type kotlin.Double");
                Task<FetchPhotoResponse> taskFetchPhoto = placesNativeModule.getPlacesClient().fetchPhoto(FetchPhotoRequest.builder(photoMetadata).setMaxWidth(Integer.valueOf((int) dDoubleValue)).setMaxWidth(Integer.valueOf((int) (d11 * ((Double) obj2).doubleValue()))).build());
                final Promise promise2 = promise;
                final p013kotlin.jvm.internal.l0 l0Var2 = l0Var;
                final Integer num = numValueOf;
                final PlacesNativeModule placesNativeModule2 = placesNativeModule;
                final String str2 = str;
                final wn0.l lVar = new wn0.l() { // from class: com.tesla.TeslaV4.reactnative.module.b0
                    @Override // wn0.l
                    public final Object invoke(Object obj3) {
                        return PlacesNativeModule.loadPlacePhotosByID$lambda$11$lambda$10$lambda$7(this.f55673a, str2, l0Var2, num, promise2, (FetchPhotoResponse) obj3);
                    }
                };
                taskFetchPhoto.addOnSuccessListener(new OnSuccessListener() { // from class: com.tesla.TeslaV4.reactnative.module.c0
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj3) {
                        lVar.invoke(obj3);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: com.tesla.TeslaV4.reactnative.module.d0
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        PlacesNativeModule.loadPlacePhotosByID$lambda$11$lambda$10$lambda$9(l0Var2, num, promise2, placesNativeModule2, str2, exc);
                    }
                });
                l0Var = l0Var2;
                placesNativeModule = placesNativeModule2;
                str = str2;
                promise = promise2;
                numValueOf = num;
            }
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 loadPlacePhotosByID$lambda$11$lambda$10$lambda$7(PlacesNativeModule placesNativeModule, String str, p013kotlin.jvm.internal.l0 l0Var, Integer num, Promise promise, FetchPhotoResponse photoResponse) {
        p013kotlin.jvm.internal.s.k(photoResponse, "photoResponse");
        Bitmap bitmap = photoResponse.getBitmap();
        p013kotlin.jvm.internal.s.j(bitmap, "getBitmap(...)");
        if (!placesNativeModule.writeImageToCache(bitmap, str)) {
            logger.n("Fail to save photo");
        }
        int i11 = l0Var.f86527a + 1;
        l0Var.f86527a = i11;
        if (num != null && i11 == num.intValue()) {
            promise.resolve(Arguments.fromList(placesNativeModule.photosInCache(str)));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadPlacePhotosByID$lambda$11$lambda$10$lambda$9(p013kotlin.jvm.internal.l0 l0Var, Integer num, Promise promise, PlacesNativeModule placesNativeModule, String str, Exception exception) {
        p013kotlin.jvm.internal.s.k(exception, "exception");
        logger.n("Fail to load photo: " + exception);
        int i11 = l0Var.f86527a + 1;
        l0Var.f86527a = i11;
        if (num != null && i11 == num.intValue()) {
            promise.resolve(Arguments.fromList(placesNativeModule.photosInCache(str)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadPlacePhotosByID$lambda$13(Promise promise, Exception exception) {
        p013kotlin.jvm.internal.s.k(exception, "exception");
        promise.reject("E_LOAD_PLACE_PHOTOS_ERROR", new Error(exception.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 lookUpPlaceByID$lambda$1(PlacesNativeModule placesNativeModule, List list, Promise promise, FetchPlaceResponse response) {
        p013kotlin.jvm.internal.s.k(response, "response");
        Place place = response.getPlace();
        p013kotlin.jvm.internal.s.h(place);
        promise.resolve(placesNativeModule.propertiesMapForPlace(place, list));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lookUpPlaceByID$lambda$3(Promise promise, Exception exception) {
        p013kotlin.jvm.internal.s.k(exception, "exception");
        promise.reject("E_PLACE_DETAILS_ERROR", new Error(exception.getMessage()));
    }

    private final List<String> photosInCache(String placeID) {
        File filePlaceCacheDirectory = placeCacheDirectory(placeID);
        try {
            if (!filePlaceCacheDirectory.exists()) {
                return p013kotlin.collections.v.m();
            }
            File[] fileArrListFiles = filePlaceCacheDirectory.listFiles();
            if (fileArrListFiles == null) {
                return p013kotlin.collections.v.m();
            }
            ArrayList arrayList = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                arrayList.add(file.getAbsolutePath());
            }
            return arrayList;
        } catch (Exception e11) {
            logger.n("Fail to check place cache: " + e11);
            return p013kotlin.collections.v.m();
        }
    }

    private final File placeCacheDirectory(String placeID) {
        String absolutePath = getReactApplicationContext().getCacheDir().getAbsolutePath();
        String str = File.separator;
        return new File(absolutePath + str + "pois" + str + placeID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlacesClient placesClient_delegate$lambda$0(ReactApplicationContext reactApplicationContext) {
        Places.initialize(reactApplicationContext.getApplicationContext(), "AIzaSyBndnqEwERkPVpqFoetG_ZKD8BYgAE_qBA");
        return Places.createClient(reactApplicationContext);
    }

    private final WritableMap propertiesMapForPlace(Place place, List<? extends Place.Field> selectedFields) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (selectedFields.contains(Place.Field.LAT_LNG)) {
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putDouble(OrcaKeys.LATITUDE, place.getLatLng().latitude);
            writableMapCreateMap2.putDouble(OrcaKeys.LONGITUDE, place.getLatLng().longitude);
            writableMapCreateMap.putMap("location", writableMapCreateMap2);
        }
        if (selectedFields.contains(Place.Field.NAME)) {
            writableMapCreateMap.putString("name", place.getName());
        }
        if (selectedFields.contains(Place.Field.ADDRESS)) {
            if (TextUtils.isEmpty(place.getAddress())) {
                writableMapCreateMap.putString(PlaceTypes.ADDRESS, "");
            } else {
                writableMapCreateMap.putString(PlaceTypes.ADDRESS, place.getAddress());
            }
        }
        if (selectedFields.contains(Place.Field.ADDRESS_COMPONENTS)) {
            if (place.getAddressComponents() != null) {
                List<AddressComponent> listAsList = place.getAddressComponents().asList();
                WritableNativeArray writableNativeArray = new WritableNativeArray();
                for (AddressComponent addressComponent : listAsList) {
                    WritableMap writableMapCreateMap3 = Arguments.createMap();
                    writableMapCreateMap3.putArray("types", Arguments.fromList(addressComponent.getTypes()));
                    writableMapCreateMap3.putString("name", addressComponent.getName());
                    writableMapCreateMap3.putString("shortName", addressComponent.getShortName());
                    writableNativeArray.pushMap(writableMapCreateMap3);
                }
                writableMapCreateMap.putArray("addressComponents", writableNativeArray);
            } else {
                writableMapCreateMap.putArray("addressComponents", Arguments.createArray());
            }
        }
        if (selectedFields.contains(Place.Field.PHONE_NUMBER)) {
            if (TextUtils.isEmpty(place.getPhoneNumber())) {
                writableMapCreateMap.putString("phoneNumber", "");
            } else {
                writableMapCreateMap.putString("phoneNumber", place.getPhoneNumber());
            }
        }
        if (selectedFields.contains(Place.Field.WEBSITE_URI)) {
            if (place.getWebsiteUri() != null) {
                Uri websiteUri = place.getWebsiteUri();
                writableMapCreateMap.putString("website", websiteUri != null ? websiteUri.toString() : null);
            } else {
                writableMapCreateMap.putString("website", "");
            }
        }
        if (selectedFields.contains(Place.Field.ID)) {
            writableMapCreateMap.putString("placeID", place.getId());
        }
        if (place.getAttributions() != null) {
            writableMapCreateMap.putArray("attributions", Arguments.fromArray(new ArrayList(place.getAttributions()).toArray(new String[0])));
        } else {
            writableMapCreateMap.putArray("attributions", Arguments.createArray());
        }
        if (selectedFields.contains(Place.Field.TYPES)) {
            if (place.getTypes() != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<Place.Type> it = place.getTypes().iterator();
                while (it.hasNext()) {
                    arrayList.add(getTypeSlug(it.next()));
                }
                writableMapCreateMap.putArray("types", Arguments.fromArray(arrayList.toArray(new String[0])));
            } else {
                writableMapCreateMap.putArray("types", Arguments.createArray());
            }
        }
        if (selectedFields.contains(Place.Field.VIEWPORT)) {
            if (place.getViewport() != null) {
                WritableMap writableMapCreateMap4 = Arguments.createMap();
                writableMapCreateMap4.putDouble("latitudeNE", place.getViewport().northeast.latitude);
                writableMapCreateMap4.putDouble("longitudeNE", place.getViewport().northeast.longitude);
                writableMapCreateMap4.putDouble("latitudeSW", place.getViewport().southwest.latitude);
                writableMapCreateMap4.putDouble("longitudeSW", place.getViewport().southwest.longitude);
                writableMapCreateMap.putMap("viewport", writableMapCreateMap4);
            } else {
                writableMapCreateMap.putMap("viewport", Arguments.createMap());
            }
        }
        if (selectedFields.contains(Place.Field.PRICE_LEVEL)) {
            if (place.getPriceLevel() != null) {
                Integer priceLevel = place.getPriceLevel();
                p013kotlin.jvm.internal.s.j(priceLevel, "getPriceLevel(...)");
                writableMapCreateMap.putInt("priceLevel", priceLevel.intValue());
            } else {
                writableMapCreateMap.putInt("priceLevel", 0);
            }
        }
        if (selectedFields.contains(Place.Field.RATING)) {
            if (place.getRating() != null) {
                Double rating = place.getRating();
                p013kotlin.jvm.internal.s.j(rating, "getRating(...)");
                writableMapCreateMap.putDouble("rating", rating.doubleValue());
            } else {
                writableMapCreateMap.putDouble("rating", 0.0d);
            }
        }
        if (selectedFields.contains(Place.Field.OPENING_HOURS)) {
            if (place.getOpeningHours() != null) {
                writableMapCreateMap.putArray("openingHours", Arguments.fromArray(new ArrayList(place.getOpeningHours().getWeekdayText()).toArray(new String[0])));
                WritableArray writableArrayCreateArray = Arguments.createArray();
                for (Period period : place.getOpeningHours().getPeriods()) {
                    WritableMap writableMapCreateMap5 = Arguments.createMap();
                    TimeOfWeek open = period.getOpen();
                    if (open != null) {
                        writableMapCreateMap5.putMap("open", toMap(open));
                    }
                    TimeOfWeek close = period.getClose();
                    if (close != null) {
                        writableMapCreateMap5.putMap("close", toMap(close));
                    }
                    writableArrayCreateArray.pushMap(writableMapCreateMap5);
                }
                writableMapCreateMap.putArray("openingHoursPeriods", writableArrayCreateArray);
            } else {
                writableMapCreateMap.putArray("openingHours", Arguments.createArray());
            }
        }
        if (selectedFields.contains(Place.Field.BUSINESS_STATUS)) {
            if (place.getBusinessStatus() != null) {
                writableMapCreateMap.putInt("businessStatus", place.getBusinessStatus().ordinal() + 1);
            } else {
                writableMapCreateMap.putInt("businessStatus", 0);
            }
        }
        if (selectedFields.contains(Place.Field.PLUS_CODE)) {
            if (place.getPlusCode() != null) {
                WritableMap writableMapCreateMap6 = Arguments.createMap();
                writableMapCreateMap6.putString("compoundCode", place.getPlusCode().getCompoundCode());
                writableMapCreateMap6.putString("globalCode", place.getPlusCode().getGlobalCode());
                writableMapCreateMap.putMap("plusCode", writableMapCreateMap6);
            } else {
                writableMapCreateMap.putMap("plusCode", Arguments.createMap());
            }
        }
        if (selectedFields.contains(Place.Field.USER_RATINGS_TOTAL)) {
            if (place.getUserRatingsTotal() != null) {
                Integer userRatingsTotal = place.getUserRatingsTotal();
                p013kotlin.jvm.internal.s.j(userRatingsTotal, "getUserRatingsTotal(...)");
                writableMapCreateMap.putInt("userRatingsTotal", userRatingsTotal.intValue());
            } else {
                writableMapCreateMap.putInt("userRatingsTotal", 0);
            }
        }
        p013kotlin.jvm.internal.s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }

    private final WritableMap toMap(TimeOfWeek timeOfWeek) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("day", timeOfWeek.getDay().ordinal());
        String str = String.format("%02d%02d", Arrays.copyOf(new Object[]{Integer.valueOf(timeOfWeek.getTime().getHours()), Integer.valueOf(timeOfWeek.getTime().getMinutes())}, 2));
        p013kotlin.jvm.internal.s.j(str, "format(...)");
        writableMapCreateMap.putString("time", str);
        p013kotlin.jvm.internal.s.j(writableMapCreateMap, "also(...)");
        return writableMapCreateMap;
    }

    private final boolean writeImageToCache(Bitmap image, String placeID) {
        String string = UUID.randomUUID().toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        File filePlaceCacheDirectory = placeCacheDirectory(placeID);
        try {
            if (!filePlaceCacheDirectory.exists() && !filePlaceCacheDirectory.mkdirs()) {
                logger.n("Fail to create cache directory");
                return false;
            }
            ByteArrayOutputStream byteArrayOutputStreamC = r00.a.f106319a.c(image, r00.b.d.jpg, 1.0f, false);
            FileOutputStream fileOutputStream = new FileOutputStream(new File(filePlaceCacheDirectory, string + ".jpg"));
            try {
                byteArrayOutputStreamC.writeTo(fileOutputStream);
                jn0.h0 h0Var = jn0.h0.f84049a;
                sn0.b.a(fileOutputStream, null);
                return true;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception e11) {
            logger.n("Fail to write image to place cache: " + e11);
            return false;
        }
    }

    @ReactMethod
    public final void getAutocompletePredictions(String query, ReadableMap options, final Promise promise) {
        p013kotlin.jvm.internal.s.k(options, "options");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        String string = options.getString("type");
        ReadableArray array = options.getArray("types");
        ArrayList<Object> arrayList = array != null ? array.toArrayList() : null;
        ReadableArray array2 = options.getArray("countries");
        ArrayList<Object> arrayList2 = array2 != null ? array2.toArrayList() : null;
        boolean z11 = options.getBoolean("useSessionToken");
        ReadableMap map = options.getMap("locationBias");
        p013kotlin.jvm.internal.s.h(map);
        double d11 = map.getDouble("latitudeSW");
        double d12 = map.getDouble("longitudeSW");
        ArrayList<Object> arrayList3 = arrayList2;
        double d13 = map.getDouble("latitudeNE");
        double d14 = map.getDouble("longitudeNE");
        ReadableMap map2 = options.getMap("locationRestriction");
        p013kotlin.jvm.internal.s.h(map2);
        double d15 = map2.getDouble("latitudeSW");
        double d16 = map2.getDouble("longitudeSW");
        double d17 = map2.getDouble("latitudeNE");
        double d18 = map2.getDouble("longitudeNE");
        FindAutocompletePredictionsRequest.Builder query2 = FindAutocompletePredictionsRequest.builder().setQuery(query);
        p013kotlin.jvm.internal.s.j(query2, "setQuery(...)");
        if (d11 != 0.0d && d12 != 0.0d && d13 != 0.0d && d14 != 0.0d) {
            query2.setLocationBias(RectangularBounds.newInstance(new LatLng(d11, d12), new LatLng(d13, d14)));
        }
        if (d15 != 0.0d && d16 != 0.0d && d17 != 0.0d && d18 != 0.0d) {
            query2.setLocationRestriction(RectangularBounds.newInstance(new LatLng(d15, d16), new LatLng(d17, d18)));
        }
        query2.setTypeFilter(getFilterType(string));
        if (arrayList != null && (!arrayList.isEmpty())) {
            query2.setTypesFilter(arrayList);
        }
        if (arrayList3 != null && (!arrayList3.isEmpty())) {
            query2.setCountries(arrayList3);
        }
        if (z11) {
            query2.setSessionToken(AutocompleteSessionToken.newInstance());
        }
        Task<FindAutocompletePredictionsResponse> taskFindAutocompletePredictions = getPlacesClient().findAutocompletePredictions(query2.build());
        p013kotlin.jvm.internal.s.j(taskFindAutocompletePredictions, "findAutocompletePredictions(...)");
        final wn0.l lVar = new wn0.l() { // from class: com.tesla.TeslaV4.reactnative.module.t
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return PlacesNativeModule.getAutocompletePredictions$lambda$4(promise, this, (FindAutocompletePredictionsResponse) obj);
            }
        };
        taskFindAutocompletePredictions.addOnSuccessListener(new OnSuccessListener() { // from class: com.tesla.TeslaV4.reactnative.module.u
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                lVar.invoke(obj);
            }
        });
        taskFindAutocompletePredictions.addOnFailureListener(new OnFailureListener() { // from class: com.tesla.TeslaV4.reactnative.module.v
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                PlacesNativeModule.getAutocompletePredictions$lambda$6(promise, exc);
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PlacesModule";
    }

    public final String getTypeSlug(Place.Type type) {
        switch (type == null ? -1 : b.f55666a[type.ordinal()]) {
            case 1:
                return PlaceTypes.ACCOUNTING;
            case 2:
                return PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_1;
            case 3:
                return PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_2;
            case 4:
                return PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_3;
            case 5:
                return PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_4;
            case 6:
                return PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_5;
            case 7:
                return PlaceTypes.AIRPORT;
            case 8:
                return PlaceTypes.AMUSEMENT_PARK;
            case 9:
                return PlaceTypes.AQUARIUM;
            case 10:
                return PlaceTypes.ART_GALLERY;
            case 11:
                return PlaceTypes.ATM;
            case 12:
                return PlaceTypes.BAKERY;
            case 13:
                return PlaceTypes.BANK;
            case 14:
                return PlaceTypes.BAR;
            case 15:
                return PlaceTypes.BEAUTY_SALON;
            case 16:
                return PlaceTypes.BICYCLE_STORE;
            case 17:
                return PlaceTypes.BOOK_STORE;
            case 18:
                return PlaceTypes.BOWLING_ALLEY;
            case 19:
                return PlaceTypes.BUS_STATION;
            case 20:
                return PlaceTypes.CAFE;
            case 21:
                return PlaceTypes.CAMPGROUND;
            case 22:
                return PlaceTypes.CAR_DEALER;
            case 23:
                return PlaceTypes.CAR_RENTAL;
            case 24:
                return PlaceTypes.CAR_REPAIR;
            case 25:
                return PlaceTypes.CAR_WASH;
            case 26:
                return PlaceTypes.CASINO;
            case 27:
                return PlaceTypes.CEMETERY;
            case 28:
                return PlaceTypes.CHURCH;
            case 29:
                return PlaceTypes.CITY_HALL;
            case 30:
                return PlaceTypes.CLOTHING_STORE;
            case 31:
                return PlaceTypes.COLLOQUIAL_AREA;
            case 32:
                return PlaceTypes.CONVENIENCE_STORE;
            case 33:
                return PlaceTypes.COUNTRY;
            case 34:
                return PlaceTypes.COURTHOUSE;
            case 35:
                return PlaceTypes.DENTIST;
            case 36:
                return PlaceTypes.DEPARTMENT_STORE;
            case 37:
                return PlaceTypes.DOCTOR;
            case 38:
                return PlaceTypes.ELECTRICIAN;
            case 39:
                return PlaceTypes.ELECTRONICS_STORE;
            case 40:
                return PlaceTypes.EMBASSY;
            case 41:
                return PlaceTypes.ESTABLISHMENT;
            case 42:
                return PlaceTypes.FINANCE;
            case 43:
                return PlaceTypes.FIRE_STATION;
            case 44:
                return PlaceTypes.FLOOR;
            case 45:
                return PlaceTypes.FLORIST;
            case 46:
                return PlaceTypes.FOOD;
            case 47:
                return PlaceTypes.FUNERAL_HOME;
            case 48:
                return PlaceTypes.FURNITURE_STORE;
            case 49:
                return PlaceTypes.GAS_STATION;
            case 50:
                return PlaceTypes.GENERAL_CONTRACTOR;
            case 51:
                return PlaceTypes.GEOCODE;
            case 52:
                return "grocery_or_supermarket";
            case 53:
                return PlaceTypes.GYM;
            case 54:
                return PlaceTypes.HAIR_CARE;
            case 55:
                return PlaceTypes.HARDWARE_STORE;
            case 56:
                return PlaceTypes.HEALTH;
            case 57:
                return PlaceTypes.HINDU_TEMPLE;
            case 58:
                return PlaceTypes.HOME_GOODS_STORE;
            case 59:
                return PlaceTypes.HOSPITAL;
            case 60:
                return PlaceTypes.INSURANCE_AGENCY;
            case 61:
                return PlaceTypes.INTERSECTION;
            case 62:
                return PlaceTypes.JEWELRY_STORE;
            case 63:
                return PlaceTypes.LAUNDRY;
            case 64:
                return PlaceTypes.LAWYER;
            case 65:
                return PlaceTypes.LIBRARY;
            case 66:
                return PlaceTypes.LIQUOR_STORE;
            case 67:
                return PlaceTypes.LOCALITY;
            case 68:
                return PlaceTypes.LOCAL_GOVERNMENT_OFFICE;
            case 69:
                return PlaceTypes.LOCKSMITH;
            case 70:
                return PlaceTypes.LODGING;
            case 71:
                return PlaceTypes.MEAL_DELIVERY;
            case 72:
                return PlaceTypes.MEAL_TAKEAWAY;
            case 73:
                return PlaceTypes.MOSQUE;
            case 74:
                return PlaceTypes.MOVIE_RENTAL;
            case 75:
                return PlaceTypes.MOVIE_THEATER;
            case 76:
                return PlaceTypes.MOVING_COMPANY;
            case 77:
                return PlaceTypes.MUSEUM;
            case 78:
                return PlaceTypes.NATURAL_FEATURE;
            case 79:
                return PlaceTypes.NEIGHBORHOOD;
            case 80:
                return PlaceTypes.NIGHT_CLUB;
            case 81:
                return "other";
            case 82:
                return PlaceTypes.PAINTER;
            case 83:
                return PlaceTypes.PARK;
            case 84:
                return PlaceTypes.PARKING;
            case 85:
                return PlaceTypes.PET_STORE;
            case 86:
                return PlaceTypes.PHARMACY;
            case 87:
                return PlaceTypes.PHYSIOTHERAPIST;
            case 88:
                return PlaceTypes.PLACE_OF_WORSHIP;
            case 89:
                return PlaceTypes.PLUMBER;
            case 90:
                return PlaceTypes.POINT_OF_INTEREST;
            case 91:
                return PlaceTypes.POLICE;
            case 92:
                return PlaceTypes.POLITICAL;
            case 93:
                return PlaceTypes.POSTAL_CODE;
            case 94:
                return PlaceTypes.POSTAL_CODE_PREFIX;
            case 95:
                return PlaceTypes.POSTAL_CODE_SUFFIX;
            case 96:
                return PlaceTypes.POSTAL_TOWN;
            case 97:
                return PlaceTypes.POST_BOX;
            case 98:
                return PlaceTypes.POST_OFFICE;
            case 99:
                return PlaceTypes.PREMISE;
            case 100:
                return PlaceTypes.REAL_ESTATE_AGENCY;
            case 101:
                return PlaceTypes.RESTAURANT;
            case 102:
                return PlaceTypes.ROOFING_CONTRACTOR;
            case 103:
                return PlaceTypes.ROOM;
            case 104:
                return PlaceTypes.ROUTE;
            case 105:
                return PlaceTypes.RV_PARK;
            case 106:
                return PlaceTypes.SCHOOL;
            case 107:
                return PlaceTypes.SHOE_STORE;
            case 108:
                return PlaceTypes.SHOPPING_MALL;
            case 109:
                return PlaceTypes.SPA;
            case 110:
                return PlaceTypes.STADIUM;
            case 111:
                return PlaceTypes.STORAGE;
            case 112:
                return PlaceTypes.STORE;
            case 113:
                return PlaceTypes.STREET_ADDRESS;
            case 114:
                return PlaceTypes.SUBLOCALITY;
            case 115:
                return PlaceTypes.SUBLOCALITY_LEVEL_1;
            case 116:
                return PlaceTypes.SUBLOCALITY_LEVEL_2;
            case 117:
                return PlaceTypes.SUBLOCALITY_LEVEL_3;
            case 118:
                return PlaceTypes.SUBLOCALITY_LEVEL_4;
            case 119:
                return PlaceTypes.SUBLOCALITY_LEVEL_5;
            case 120:
                return PlaceTypes.SUBPREMISE;
            case 121:
                return PlaceTypes.SUBWAY_STATION;
            case 122:
                return PlaceTypes.SUPERMARKET;
            case 123:
                return PlaceTypes.SYNAGOGUE;
            case 124:
                return PlaceTypes.TAXI_STAND;
            case 125:
                return PlaceTypes.TRAIN_STATION;
            case 126:
                return PlaceTypes.TRANSIT_STATION;
            case 127:
                return PlaceTypes.TRAVEL_AGENCY;
            case 128:
                return PlaceTypes.UNIVERSITY;
            case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                return PlaceTypes.VETERINARY_CARE;
            case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                return PlaceTypes.ZOO;
            default:
                return "other";
        }
    }

    @ReactMethod
    public final void loadPlacePhotosByID(final String placeID, final ReadableMap options, final Promise promise) {
        p013kotlin.jvm.internal.s.k(placeID, "placeID");
        p013kotlin.jvm.internal.s.k(options, "options");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        if (!Places.isInitialized()) {
            promise.reject("E_API_KEY_ERROR", new Error("No API key defined in gradle.properties or errors initializing Places"));
            return;
        }
        final ReadableMap map = options.getMap("size");
        if (map == null) {
            promise.reject("E_LOAD_PLACE_PHOTOS_ERROR", new Error("size is required"));
            return;
        }
        Task<FetchPlaceResponse> taskFetchPlace = getPlacesClient().fetchPlace(FetchPlaceRequest.builder(placeID, p013kotlin.collections.v.e(Place.Field.PHOTO_METADATAS)).build());
        final wn0.l lVar = new wn0.l() { // from class: com.tesla.TeslaV4.reactnative.module.s
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return PlacesNativeModule.loadPlacePhotosByID$lambda$11(this.f55710a, placeID, promise, map, options, (FetchPlaceResponse) obj);
            }
        };
        taskFetchPlace.addOnSuccessListener(new OnSuccessListener() { // from class: com.tesla.TeslaV4.reactnative.module.w
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                lVar.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.tesla.TeslaV4.reactnative.module.x
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                PlacesNativeModule.loadPlacePhotosByID$lambda$13(promise, exc);
            }
        });
    }

    @ReactMethod
    public final void lookUpPlaceByID(String placeID, ReadableArray fields, final Promise promise) {
        p013kotlin.jvm.internal.s.k(fields, "fields");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        final List<Place.Field> placeFields = getPlaceFields(fields.toArrayList(), false);
        Task<FetchPlaceResponse> taskFetchPlace = getPlacesClient().fetchPlace(FetchPlaceRequest.builder(placeID, placeFields).build());
        final wn0.l lVar = new wn0.l() { // from class: com.tesla.TeslaV4.reactnative.module.y
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return PlacesNativeModule.lookUpPlaceByID$lambda$1(this.f55721a, placeFields, promise, (FetchPlaceResponse) obj);
            }
        };
        taskFetchPlace.addOnSuccessListener(new OnSuccessListener() { // from class: com.tesla.TeslaV4.reactnative.module.z
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                lVar.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.tesla.TeslaV4.reactnative.module.a0
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                PlacesNativeModule.lookUpPlaceByID$lambda$3(promise, exc);
            }
        });
    }
}
